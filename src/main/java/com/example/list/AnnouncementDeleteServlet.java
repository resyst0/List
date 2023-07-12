package com.example.list;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteServlet", value = "/deleteservlet")
public class AnnouncementDeleteServlet extends HttpServlet {

private  AnnouncementData announcementData=new AnnouncementData();
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            String id=request.getParameter("id");

            announcementData.deleteAnnouncement(Integer.parseInt(id));
            response.sendRedirect(request.getContextPath()+ "/announcementServlet");



        }catch (Exception ex) {
            throw new RuntimeException();
        }





    }


    public void destroy() {
    }
}