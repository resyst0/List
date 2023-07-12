package com.example.list;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
@WebServlet(name = "AnnouncementServlet", value = "/announcementServlet")
public class AnnouncementServlet extends HttpServlet {
    AnnouncementData announcementData=new AnnouncementData();
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {


        List<Announcement> announcements = announcementData.getData();

        request.setAttribute("announcementList", announcements);

        RequestDispatcher rs1=request.getRequestDispatcher("/listpage.jsp");

        try {
            rs1.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }


    }

    public void destroy() {
    }
}

