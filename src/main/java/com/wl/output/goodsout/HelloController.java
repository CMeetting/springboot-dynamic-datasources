package com.wl.output.goodsout;

import com.wl.output.goodsout.model.UserDo;
import com.wl.output.goodsout.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        UserDo userDo = userService.selectByPrimaryKey(1);
        List<UserDo> userDoList = userService.selectAll();
        System.out.println(userDoList);
        System.out.println(userDo);
        return "hello";
    }
}
