package org.iskycode.jeesky.sys.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
@Controller
public class UserController {

    @RequestMapping(value = "/login")
    public String login() {
        return "index";
    }
}
