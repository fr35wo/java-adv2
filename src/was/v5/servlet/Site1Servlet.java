package was.v5.servlet;

import java.io.IOException;
import was.httepserver.HttpRequest;
import was.httepserver.HttpResponse;
import was.httepserver.HttpServlet;

public class Site1Servlet implements HttpServlet {
    @Override
    public void service(HttpRequest request, HttpResponse response) throws
            IOException {
        response.writeBody("<h1>site1</h1>");
    }
}
