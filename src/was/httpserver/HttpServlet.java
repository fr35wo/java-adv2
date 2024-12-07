package was.httpserver;

import java.io.IOException;

public interface HttpServlet {
    void service(HttpRequest httpRequest, HttpResponse httpResponse) throws IOException;
}
