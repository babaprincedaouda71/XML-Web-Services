import jakarta.xml.ws.Endpoint;
import tp1.BankService;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/", new BankService());
        System.out.println("Web service deployed on http://localhost:9191/");
    }
}
