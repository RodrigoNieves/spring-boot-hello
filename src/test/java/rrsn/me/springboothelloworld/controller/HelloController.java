package rrsn.me.springboothelloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;
import java.util.HashMap;

@Controller
public class HelloController {
    private Map<String, Object> result = new HashMap<>();

    @RequestMapping("/hello")
    @ResponseBody
    public Map<String, Object> hello() {
        result.put("name", "Stephen");
        result.put("city", "San Jose");
        return result;
    }
}
