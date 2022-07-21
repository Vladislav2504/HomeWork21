package org.example;

import com.sun.net.httpserver.HttpExchange;
import org.example.services.CalculatorService;

import java.io.IOException;

public class HttpHendlerCalculatorMinus implements com.sun.net.httpserver.HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String query = exchange.getRequestURI().getQuery();
        String[] split = query.split("&");
        String pr1 = split[0];
        String pr2 = split[1];
        double num1 = Double.parseDouble(pr1.split("=")[1]);
        double num2 = Double.parseDouble(pr2.split("=")[1]);
        CalculatorService calculatorService = new CalculatorService();
        double result = calculatorService.minus(num1, num2);
        String resultFull = num1 + " - " + num2 + " = " + result;
        System.out.println(resultFull);
    }

}
