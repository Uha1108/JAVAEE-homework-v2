package com.example.demo5;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

@WebServlet(name = "SignInServlet", value = "/sign-in")
public class SignInServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("sign-in.html").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String ABSOLUTE_PATH = "/Users/apple/Desktop/password.txt";
        Stream<String> lines = Files.lines(Paths.get(ABSOLUTE_PATH));
        Map<String, String> m = new HashMap<>();
        lines.forEach(line -> {
            String[] name_pwd = line.split(" ");
            m.put(name_pwd[0], name_pwd[1]);
        });
        String name = request.getParameter("inputName");
        String password = request.getParameter("inputPassword");
        if (!m.containsKey(name)) {
            request.getRequestDispatcher("errorpage.html").forward(request, response);
        } else {
            if (!m.get(name).equals(password)) {
                request.getRequestDispatcher("errorpage.html").forward(request, response);
            } else {
                request.getSession().setAttribute("user", name);
                response.sendRedirect("index");
            }
        }


    }
}