package com.geekbrains.web.app;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PersonFormResultsServlet", urlPatterns = "/personFormResults.html")
public class PersonFormResultsServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        String paramName = req.getParameter("name");
        String paramDate = req.getParameter("date");
        String paramCity = req.getParameter("city");
//        String paramScore = req.getParameter("score");
//        out.println("<html><body><h1>Student: [ " + paramName + " "  + " ]</h1></body></html>");
        out.println("<html><body>" +
                "<h1>Person" + "</h1>" +
                "<table border=\"1\"><tr><td>Name</td><td>" + paramName + "</td></tr>" +
                "<tr><td>Date</td><td>" + paramDate + "</td></tr>" +
                "<tr><td>City</td><td>" + paramCity + "</td></tr>" +
                "</table></body></html>");
        out.close();
    }
}
