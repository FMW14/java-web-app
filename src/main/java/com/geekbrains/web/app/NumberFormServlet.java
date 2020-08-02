package com.geekbrains.web.app;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "NumberFormServlet", urlPatterns = "/numberFormResults.html")
public class NumberFormServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
//        String paramNumber = req.getParameter("number");
        Integer paramNumber = Integer.parseInt(req.getParameter("number"));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<html><body><table border=\"1\">");

        for (int i = 1; i <= paramNumber; i++) {
            stringBuilder.append("<tr>");
            for (int j = 1; j <= paramNumber; j++) {
                stringBuilder.append("<td>");
                stringBuilder.append(i).append("-").append(j);
                stringBuilder.append("</td>");
            }
            stringBuilder.append("</tr>");
        }
        stringBuilder.append("</table></body></html>");
        out.println(stringBuilder.toString());
//        out.println("<html><body><h1>Student: [ " + paramName + " " + paramScore + " ]</h1></body></html>");
        out.close();
    }
}
