package com.example.list;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AnnouncementUpdateServlet", value = "/updateservlet")
public class AnnouncementUpdateServlet extends HttpServlet {
    AnnouncementData announcementData=new AnnouncementData();
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        doPost(request, response);
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String firstdate = request.getParameter("firstdate");
        String seconddate = request.getParameter("seconddate");
        String id = request.getParameter("id");
        Announcement announcement=new Announcement(title,description,firstdate,seconddate,Integer.parseInt(id));
        announcementData.updateAnnouncement(announcement);
        response.sendRedirect(request.getContextPath()+ "/listpage.jsp");
    }

    public void destroy() {
    }
}