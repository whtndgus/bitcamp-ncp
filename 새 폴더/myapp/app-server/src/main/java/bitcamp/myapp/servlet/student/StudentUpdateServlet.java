package bitcamp.myapp.servlet.student;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import bitcamp.myapp.dao.StudentDao;
import bitcamp.myapp.vo.Student;
import bitcamp.util.BitcampSqlSessionFactory;
import bitcamp.util.DaoGenerator;

@WebServlet("/student/update")
public class StudentUpdateServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  private StudentDao studentDao;

  public StudentUpdateServlet() {
    try {
      InputStream mybatisConfigInputStream =
          Resources.getResourceAsStream("bitcamp/myapp/config/mybatis-config.xml");
      SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
      BitcampSqlSessionFactory sqlSessionFactory =
          new BitcampSqlSessionFactory(builder.build(mybatisConfigInputStream));
      studentDao = new DaoGenerator(sqlSessionFactory).getObject(StudentDao.class);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    request.setCharacterEncoding("UTF-8");

    Student student = new Student();
    student.setNo(Integer.parseInt(request.getParameter("no")));
    student.setName(request.getParameter("name"));
    student.setEmail(request.getParameter("email"));
    student.setPassword(request.getParameter("password"));
    student.setTel(request.getParameter("tel"));
    student.setPostNo(request.getParameter("post"));
    student.setBasicAddress(request.getParameter("baddr"));
    student.setWorking(request.getParameter("working").equals("1"));
    student.setGender(request.getParameter("gender").charAt(0));
    student.setLevel((byte) Integer.parseInt(request.getParameter("level")));


    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();

    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("<title>비트캠프 - NCP 1기</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>게시판</h1>");

    Student old = studentDao.findByNo(student.getNo());
    System.out.println(old.getPassword());

    if (old == null) {
      out.println("<p>해당 번호의 게시글이 없습니다.</p>");

    } else if (!old.getPassword().equals(student.getPassword())) {
      out.println("<p>암호가 맞지 않습니다!</p>");

    } else {
      this.studentDao.update(student);
      out.println("<p>변경했습니다.</p>");
    }

    out.println("</body>");
    out.println("</html>");

    // 웹브라우저가 화면 출력을 완료한 후 1초 후에 다시 목록 화면을 호출하도록 명령한다.
    // 어떻게? 응답 헤더에 Refresh 를 추가한다.
    response.setHeader("Refresh", "1;url=list");
  }

}
