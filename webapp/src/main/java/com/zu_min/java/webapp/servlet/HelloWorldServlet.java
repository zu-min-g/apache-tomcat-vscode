package com.zu_min.java.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	    throws IOException
    {
        resp.setContentType("text/html; charset=utf-8");
        try (PrintWriter out = resp.getWriter()) {
            printHead(out);
            out.println("<h2>Hello World!</h2>");
            printFoot(out);
        }
    }

    protected void printHead(PrintWriter out)
    {
        out.println("<!DOCTYPE html>");
        out.println("<html lang=\"ja\">");
        out.println("<head>");
        out.println("    <meta charset=\"UTF-8\">");
        out.println("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
        out.println("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        out.println("    <title>Document</title>");
        out.println("</head>");
        out.println("<body>");
    }

    protected void printFoot(PrintWriter out)
    {
        out.println("</body>");
        out.println("</html>");
    }
}
