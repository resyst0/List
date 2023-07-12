package com.example.list;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet(name = "AddServlet", value = "/addServlet")
public class AnnouncementAddServlet extends HttpServlet {
    private AnnouncementData announcementData =new AnnouncementData();
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {


            String title=request.getParameter("title");
            String description=request.getParameter("description");
            String firstdate=(request.getParameter("firstdate"));
            String seconddate=(request.getParameter("seconddate"));
            Announcement announcement=new Announcement(title,description,firstdate,seconddate);
            announcementData.addAnnouncement(announcement);
            response.sendRedirect(request.getContextPath()+ "/announcementServlet");

    }

    public void destroy() {
    }
}