import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.net.InetSocketAddress;
import java.io.IOException;
import java.io.OutputStream;

public class app {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/", new RootHandler());
        server.setExecutor(null);
        System.out.println("Java server started on port 8080");
        server.start();
    }

    static class RootHandler implements HttpHandler {
        public void handle(HttpExchange t) throws IOException {
            String response = "<h1>ДЖАВА КОНТЕЙНЕР</h1>";
            t.getResponseHeaders().add("Content-Type", "text/html; charset=UTF-8");
            byte[] resp = response.getBytes("UTF-8");
            t.sendResponseHeaders(200, resp.length);
            OutputStream os = t.getResponseBody();
            os.write(resp);
            os.close();
        }
    }
}
