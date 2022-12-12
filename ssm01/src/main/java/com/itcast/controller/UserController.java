package com.itcast.controller;

import com.itcast.entity.R;
import com.itcast.entity.User;
import com.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> ssm_review
 * BelongsPackage ==> com.itcast.controller
 * Version ==> 1.0
 * CreateTime ==> 2022-12-12 10:05:15
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getAll")
    public void users(HttpServletResponse resp){

        List<User> users = userService.selectUsers();

        resp.setContentType("text/html;charset=utf-8");

        R<List<User>> r = new R<>(200, "查询成功!!😁😁",users);

        try {
            resp.getWriter().write(r.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("controller...");
    }

    @GetMapping("/insert")
    public void insert(User user,HttpServletResponse resp){

        System.out.println("controller...");
        System.out.println(">>"+user);

        boolean b = false;

        resp.setContentType("text/html;charset=utf-8");
        try {
            b = userService.insertUser(user.getUsername(), user.getMoney());
        } catch (Exception e) {
            e.printStackTrace();
            try {
                resp.getWriter().write("<h1>残念!!抛异常了!!!</h1>");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        R r= new R(b ? 200 : 404, b ? "哦咩爹多!!🤣🤣" : "残念~~😅😅");

        try {
            resp.getWriter().write(r.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
