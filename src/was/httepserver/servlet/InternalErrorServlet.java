package was.httepserver.servlet;

import was.httepserver.HttpRequest;
import was.httepserver.HttpResponse;
import was.httepserver.HttpServlet;

public class InternalErrorServlet implements HttpServlet {
    @Override
    public void service(HttpRequest request, HttpResponse response) {
        response.setStatusCode(500);
        response.writeBody("<h1>Internal Error</h1>");
    }
}
