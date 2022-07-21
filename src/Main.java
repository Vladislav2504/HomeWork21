import com.sun.net.httpserver.HttpServer;
import org.example.HttpHandlerCalculatorPlus;
import org.example.HttpHendlerCalculatorMinus;
import org.example.HttpHendlerCalculatorMnoj;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {

        HttpServer server = HttpServer.create(new InetSocketAddress("localhost", 8080), 0);

        server.createContext("/Info1", new HttpHandlerCalculatorPlus());
        server.createContext("/Info2", new HttpHendlerCalculatorMinus());
        server.createContext("/Info3", new HttpHendlerCalculatorMnoj());
        server.start();

    }

}