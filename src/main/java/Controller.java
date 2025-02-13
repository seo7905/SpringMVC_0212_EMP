import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.annotation.WebServlet;

@WebServlet("*.inc")
public class Controller extends DispatcherServlet {
    // WEB-INF/{현재컨트롤러명}-servlet.xml을 로드함(연동된다.)
}

