package com.qyy.sessionsharing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class SessionController {

    @GetMapping("/session_1")
    public Object testSession(HttpServletRequest request){

        HashMap<Object, Object> map = new HashMap<>();

        request.getSession().setAttribute("resturl",request.getRequestURL());

        map.put("resturl",request.getRequestURL());

        return map;
    }
    @GetMapping("/session_2")
    public Map<String, Object> testSession_1(HttpServletRequest request){

        Map<String, Object> map = new HashMap<>();

        map.put("sessionId", request.getSession().getId());

        map.put("message", request.getSession().getAttribute("resturl"));

        return map;



    }


}
