package com.example.BOOKONLINE;

import com.example.BOOKONLINE.Utils.SongUtils;
import com.example.BOOKONLINE.model.Song;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/index"})
public class IndexServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Song> songs = SongUtils.recentSongs();
        request.setAttribute("songs", songs);
        request.getRequestDispatcher("home.jsp").forward(request, response);
    }
}