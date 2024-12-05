package was.httepserver.servlet;

import was.httepserver.HttpRequest;
import was.httepserver.HttpResponse;
import was.httepserver.HttpServlet;

public class NotFoundServlet implements HttpServlet { @Override
public void service(HttpRequest request, HttpResponse response) {
    response.setStatusCode(404);
    response.writeBody("<h1>404 페이지를 찾을 수 없습니다.</h1>");
}
}
