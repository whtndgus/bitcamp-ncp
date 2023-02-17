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
import bitcamp.util.BitcampSqlSessionFactory;
import bitcamp.util.DaoGenerator;

@WebServlet("/student/form")
public class StudentFormServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  private StudentDao studentDao;

  public StudentFormServlet() {
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
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

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
    out.println("<form action='insert' method='post'>");
    out.println("<table border='1'>");

    out.println("<tr>");
    out.println("  <th>이름</th>");
    out.printf("  <td><input type='text' name='name' ></td>\n");
    out.println("</tr>");

    out.println("<tr>");
    out.println("  <th>이메일</th>");
    out.printf("  <td><input type='text' name='email' ></td>\n");
    out.println("</tr>");

    out.println("<tr>");
    out.println("  <th>전화</th>");
    out.printf("  <td><input type='text' name='tel' ></td>\n");
    out.println("</tr>");

    out.println("<tr>");
    out.println("  <th>우편번호</th>");
    out.printf("  <td><input type='text' name='post' ></td>\n");
    out.println("</tr>");

    out.println("<tr>");
    out.println("  <th>기본주소</th>");
    out.printf("  <td><input type='text' name='baddr' ></td>\n");
    out.println("</tr>");

    out.println("<tr>");
    out.println("  <th>상세주소</th>");
    out.printf("  <td><input type='text' name='daddr' ></td>\n");
    out.println("</tr>");

    out.println("<tr>");
    out.println("  <th>재직여부</th>");
    out.printf("  <td>");
    out.printf("예<INPUT TYPE=RADIO NAME=working VALUE=1 CHECKED>");
    out.printf("아니요<INPUT TYPE=RADIO NAME=working VALUE=2>");
    out.println("</tr>");

    out.println("<tr>");
    out.println("  <th>성별</th>");
    out.printf("  <td>");
    out.printf("남<INPUT TYPE=RADIO NAME=gender VALUE=M CHECKED>");
    out.printf("여<INPUT TYPE=RADIO NAME=gender VALUE=W>");
    out.printf("  </td>\n");
    out.println("</tr>");

    out.println("<tr>");
    out.println("  <th>전공</th>");
    out.printf("  <td><SELECT NAME=level SIZE=1>");
    out.println("<OPTION VALUE=1>초</OPTION>");
    out.println("<OPTION VALUE=2 selected>중</OPTION>");
    out.println("<OPTION VALUE=3>고</OPTION>");
    out.printf("  </SELECT></td>\n");
    out.println("</tr>");

    out.println("<tr>");
    out.println("  <th>암호</th>");
    out.println("  <td><input type='password' name='password'></td>");
    out.println("</tr>");

    out.println("</table>");
    out.println("<div>");
    out.println("  <button>등록</button>");
    out.println("  <button id='btn-cancel' type='button'>취소</button>");
    out.println("</div>");
    out.println("</form>");
    out.println("<script>");
    out.println("document.querySelector('#btn-cancel').onclick = function() {");
    out.println("  location.href = 'list';");
    out.println("}");
    out.println("</script>");
    out.println("</body>");
    out.println("</html>");

  }
}
