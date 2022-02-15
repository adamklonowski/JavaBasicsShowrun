package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class Homepage {

    @RequestMapping("/")
    public String links()  {
        List<String> endPoints = new ArrayList<>();
        endPoints.add("/authors");
        endPoints.add("/now");
        endPoints.add("/date/plus/0");
        endPoints.add("/fibonacci/3");
        endPoints.add("/hello/Mark");

        StringBuilder str = new StringBuilder();
        str.append("<!DOCTYPE html>").append("\n");
        str.append("<html>").append("\n");
        str.append("<h1>Links</h1>").append("\n");

        for(String x : endPoints) {
            str.append("<a href=\""+x+"\">"+x+"</a>").append("\n");
        }
        str.append("</body>").append("\n");
        str.append("</html>").append("\n");


        return str.toString();
    }
}
