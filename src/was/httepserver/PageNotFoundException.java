package was.httepserver;

public class PageNotFoundException extends RuntimeException {
  public PageNotFoundException(String message) {
    super(message);
  }
}
