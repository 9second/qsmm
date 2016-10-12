package com.moudles.webservice.controller.user;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

/**
 * Created by admin on 2016/10/7.
 */
@Controller
@RequestMapping("/user")
public class UserController {
  private List<User>list=new ArrayList<User>();

    public UserController(){
      list.add(new User(1,"zhangsan","123zxc","110","zhangsan@qq.com"));
      list.add(new User(2,"lisi","123zxc","115","lisi@qq.com"));
      list.add(new User(3,"wangwu","123zxc","120","wangwu@qq.com"));
      list.add(new User(4,"zhaoliu","123zxc","10086","zhaoliu@qq.com"));
      list.add(new User(5,"liangqi","123zxc","911","liangqi@qq.com"));
    }

  /**
   * 查询所有用户
   * @param
   * @return
   */
    @RequestMapping("/list")
    @ResponseBody
    public String selectUser(User user){
        List<User>list=new ArrayList<User>();
        list.add(new User(1,"zhangsan","123zxc","110","zhangsan@qq.com"));
        list.add(new User(2,"lisi","123zxc","115","lisi@qq.com"));
        list.add(new User(3,"wangwu","123zxc","120","wangwu@qq.com"));
        list.add(new User(4,"zhaoliu","123zxc","10086","zhaoliu@qq.com"));
        list.add(new User(5,"liangqi","123zxc","911","liangqi@qq.com"));
        return JSON.toJSONString(list);
    }

  /**
   * 添加用戶
   * @param user
   * @return
   *//*
    @RequestMapping("/add")
    public String addUser(User user){
      user.setId(list.get(list.size()).getId()+1);
      list.add(user);
      return "list.do";
    }

  *//**
   * 根据id删除用户
   * @param id
   * @return
   *//*
    @RequestMapping("/delete")
    public String deleteId(int id){
      for (int i=0;i<list.size();i++){
        if (list.get(i).getId()==id){
          list.remove(i);
          break;
        }
      }
      return "redirect:list.do";
    }*/
  /*  @Resource
   private UserService userService;
    @RequestMapping("/selectUser")
    @ResponseBody
    public String selectUser(User user){
        SearchResult result=userService.selectUser(user);
        return JSON.toJSONString(result);
    }
    @RequestMapping("/deleteUser")
    @ResponseBody
    public String deleteUser(@RequestBody User user){
        Integer rows=userService.deleteUser(user);
        return JSON.toJSONString(rows);
    }*/
}
