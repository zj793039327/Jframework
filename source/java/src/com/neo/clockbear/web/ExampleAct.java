package com.neo.clockbear.web;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;

import org.codehaus.jackson.map.annotate.JsonView;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleAct {

    @RequestMapping("/example.do")
    public String hello(
            @RequestParam(value = "name", required = false, defaultValue = "World") String name,
            Integer a, Model model, HttpServletRequest request) {
        model.addAttribute("name", name);
        request.getSession(true);
        return "helloworld";
    }

    @RequestMapping(value = "/something.do")
    public void handle(@RequestBody String body, Writer writer) throws IOException {
        writer.write(body);
    }
    
    @RequestMapping(value = "/pets.do", method = RequestMethod.GET, consumes="application/json")
    public void addPet(@RequestBody Pet pet, Model model) {
        // implementation omitted
        System.out.println("pet");
    }
    
    @RequestMapping("/displayHeaderInfo.do")
    public void displayHeaderInfo(@CookieValue("JSESSIONID") String cookie,Long keepAlive) {
       System.out.println();
    }
    
    @RequestMapping(value = "/user.do", method = RequestMethod.GET)
    @JsonView(User.WithoutPasswordView.class)
    public User getUser() {
        return new User("eric", "7!jd#h23");
    }
}
