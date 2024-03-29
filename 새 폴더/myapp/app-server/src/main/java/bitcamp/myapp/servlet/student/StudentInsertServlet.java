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
import bitcamp.myapp.dao.MemberDao;
import bitcamp.myapp.dao.StudentDao;
import bitcamp.myapp.vo.Student;
import bitcamp.util.BitcampSqlSessionFactory;
import bitcamp.util.DaoGenerator;

@WebServlet("/student/insert")
public class StudentInsertServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  private StudentDao studentDao;
  private MemberDao memberDao;

  public StudentInsertServlet() {
    try {
      InputStream mybatisConfigInputStream =
          Resources.getResourceAsStream("bitcamp/myapp/config/mybatis-config.xml");
      SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
      BitcampSqlSessionFactory sqlSessionFactory =
          new BitcampSqlSessionFactory(builder.build(mybatisConfigInputStream));
      studentDao = new DaoGenerator(sqlSessionFactory).getObject(StudentDao.class);
      memberDao = new DaoGenerator(sqlSessionFactory).getObject(MemberDao.class);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    System.out.println("인서트 요청");
    request.setCharacterEncoding("UTF-8");

    Student student = new Student();
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
    out.println("<meta http-equiv='Refresh' content='1;url=list'>");
    out.println("<title>비트캠프 - NCP 1기</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>게시판</h1>");

    memberDao.insert(student);
    studentDao.insert(student);
    out.println("<p>입력 했습니다.</p>");

    out.println("</body>");
    out.println("</html>");
  }

}
