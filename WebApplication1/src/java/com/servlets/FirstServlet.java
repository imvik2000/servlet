/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.Principal;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;

/**
 *
 * @author Vikram
 */
public class FirstServlet implements Servlet{
    // life cycle method  
    ServletConfig conf;
    public void init (ServletConfig conf)
    {
        this.conf=conf;
        System.out.println("creating object.....");
    }
    
    public void service(ServletRequest req,ServletResponse resp) throws ServletException,IOException
    { 
        System.out.print("servicing.........");
        //set the content type of the response
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>hello to my clock world</h1>");
        out.println("<h1>todays date and time: "+new Date().toString()+"</h1>");
    }
    public void destroy()
    {
        System.out.println("going to destroy ");
    }
    public ServletConfig getServletConfig()
    {
        return this.conf;
    }
    public String getServletInfo()
    {
        return "this servlet created by mr.vikram kumar";
    }
}
