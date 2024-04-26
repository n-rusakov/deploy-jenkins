package org.example.deployjenkins;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

//@WebServlet(name = "HelloWorldServlet", urlPatterns = {"/helloworld"})
public class HelloWorldServlet extends HttpServlet {

    private static final String HELLO_MESSAGE = "Hello World";

    private final transient Logger logger = Logger.getLogger(getClass().getName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  {

        try (PrintWriter printWriter = resp.getWriter()) {
            resp.setContentType("text/html");
            printWriter.write(HELLO_MESSAGE);
        } catch (IOException e) {
            logger.info("Error when write to response");
        }

    }
}
