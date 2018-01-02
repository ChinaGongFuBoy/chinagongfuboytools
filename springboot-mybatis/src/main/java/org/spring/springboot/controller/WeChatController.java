package org.spring.springboot.controller;

import org.spring.springboot.domain.City;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by bysocket on 07/02/2017.
 */
@RestController
@RequestMapping(value="/wechat")
public class WeChatController {
    @RequestMapping(value = "/entrance", method = RequestMethod.GET)
    public void wechatEntrance(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String signature = request.getParameter("signature");
        // 时间戳
        String timestamp = request.getParameter("timestamp");
        // 随机数
        String nonce = request.getParameter("nonce");
        // 随机字符串
        String echostr = request.getParameter("echostr");
        PrintWriter out = response.getWriter();
        if(!StringUtils.isEmpty(echostr)){
            out.print(echostr);
            System.out.println("签名是："+signature+";时间戳是："+timestamp+";随机数是："+nonce+";随机字符串是："+echostr);
        }else{
            out.print("hello wechat");
        }
        out.close();

    }
}
