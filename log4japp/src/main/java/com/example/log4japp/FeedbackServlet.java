package com.example.log4japp;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@WebServlet(name = "feedbackServlet", value = "/feedback")
public class FeedbackServlet extends HttpServlet {

    private static final Logger logger = LogManager.getLogger(FeedbackServlet.class);

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String feedback = req.getParameter("feedback");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");

        // Log the feedback - vulnerable code
        logger.error(feedback);

        out.println("<p>Thank you for your input.</p>");
    }

    public void destroy() {
    }
}
