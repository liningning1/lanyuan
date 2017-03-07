package com.lanyuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by linn on 2017/3/7.
 */
@Controller
@RequestMapping("/")
public class BackgroundController extends BaseController {

    @RequestMapping(value="login",method= RequestMethod.GET,produces = "text/html;charset=utf-8")
    public String login(HttpServletRequest request)
    {
         request.removeAttribute("error");
         return "/login";
    }


}
