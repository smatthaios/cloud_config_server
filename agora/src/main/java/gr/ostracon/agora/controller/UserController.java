package gr.ostracon.agora.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path="/users")
public class UserController {

    @Value("${greeting}")
    private String greeting;

    @RequestMapping(value="/greeting", method = RequestMethod.GET)
    public String getGreeting() {
        return greeting;
    }
}
