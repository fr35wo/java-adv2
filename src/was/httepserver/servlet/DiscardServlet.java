package was.httepserver.servlet;

import java.io.IOException;
import was.httepserver.HttpRequest;
import was.httepserver.HttpResponse;
import was.httepserver.HttpServlet;

public class DiscardServlet implements HttpServlet {
    @Override
    public void service(HttpRequest request, HttpResponse response) throws IOException {
        // empty
        }
    }
