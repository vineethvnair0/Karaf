package com.karaf.firstservlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by vineethn on 3/24/2016.
 */
public class FirstServlet  extends HttpServlet{

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        String taskId = req.getParameter("taskId");
        PrintWriter writer = resp.getWriter();
        writer.println("<h1>Karaf test</h1>");
        writer.println("<h1>this is my first servlet in karaf</h1>");
    }
}
