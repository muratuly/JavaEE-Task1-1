package kz.bitlab.servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/")
public class HomeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<h1> HELLO BITLAB </h1>");
        out.print("<h1> HELLO BITLAB </h1>");
        out.print("<h1> HELLO BITLAB </h1>");
        out.print("<h1> HELLO BITLAB </h1>");
        out.print("<h1> HELLO BITLAB </h1>");
        out.print("<h1> HELLO BITLAB </h1>");
        out.print("<h1> HELLO BITLAB </h1>");
        out.print("<h1> HELLO BITLAB </h1>");
        out.print("<h1> HELLO BITLAB </h1>");
        out.print("<h1> HELLO BITLAB </h1>");
    }
}
