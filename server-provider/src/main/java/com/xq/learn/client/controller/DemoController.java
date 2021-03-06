package com.xq.learn.client.controller;

import com.xq.learn.dto.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaoqiang
 * @date 2019/9/5 3:16
 */
@RestController
@RequestMapping("v1/cloud")
public class DemoController
{
    @Value("${server.port}")
    private int port;

    @RequestMapping(value = "port", method = RequestMethod.GET)
    public String serverDiscovery(@RequestParam("name") String name, @RequestParam("age") int age)
    {
        return "I'm " + port + ", name: " + name + ", age: " + age;
    }

    @RequestMapping(value = "body", method = RequestMethod.POST)
    public String body(@RequestBody User user)
    {
        return "I'm " + port + ", name: " + user.getUserName() + ", age: " + user.getAge();
    }
}
