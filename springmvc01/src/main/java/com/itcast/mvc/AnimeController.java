package com.itcast.mvc;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;

/**
 * Description ==> TODO
 * BelongsProject ==> ssm_review
 * BelongsPackage ==> com.itcast.mvc
 * Version ==> 1.0
 * CreateTime ==> 2022-12-11 16:21:23
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@RequestMapping("/anime")
@RestController
public class AnimeController {




    @DeleteMapping("/m01")
    public String  m01(){
        System.out.println("deleteing....");
        return "ok";
    }


//    @PostMapping("/m01")
//    public String  m01(HttpServletRequest req){
//        try {
//            req.setCharacterEncoding("utf-8");
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//        String name = req.getParameter("name");
//        System.out.println(">>"+name);
//        return "ok";
//    }
//
//
//    @GetMapping("/m01")
//    public String  m01(String name){
//        System.out.println(">>"+name);
//        return "ok";
//    }

    @GetMapping
    public void m010(HttpServletRequest req, HttpServletResponse resp){
        resp.setContentType("text/html;charset=utf-8");
        System.out.println(LocalDateTime.now());
        String s = "<h1>楪祈!!!椎名真白!!!🤣🤣🤣</h1>";
        try {
            resp.getWriter().write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        return "ok";
    }


}
