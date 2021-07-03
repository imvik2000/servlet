/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author Vikram
 */
public class SecondServlet extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("starting");
        
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>this is second servlet </h1>");
        out.println("<h1>todays time is"+new Date().toString()+"</h2>");
        
    }
      
}



