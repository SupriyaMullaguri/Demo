package com.adobe.aem.guides.demo.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.osgi.service.component.annotations.Component;

@Component(service = Servlet.class, enabled = true, immediate = true)

@SlingServletPaths(value = "/bin/supriya/bangalore")
public class DigitalServlet extends SlingAllMethodsServlet {
    
    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().write("Ratan Tata, a name that resonates with respect and admiration across India and beyond, is a remarkable leader known for his contributions to business, innovation, " +
        "and leadership. He has had a profound impact on the industrial landscape of India.");

        
    }
}
