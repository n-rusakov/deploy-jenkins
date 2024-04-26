package org.example.deployjenkins;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {

    private static final String HELLO_MESSAGE = "Hello World";


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        PrintWriter printWriter = resp.getWriter();
        resp.setContentType("text/html");
        printWriter.write(HELLO_MESSAGE);
        printWriter.close();

    }
}
