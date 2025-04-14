package com.springbootprocessunicodewithmysql.demo.controller;

import com.springbootprocessunicodewithmysql.demo.model.User;
import com.springbootprocessunicodewithmysql.demo.repo.UserRepo;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class WebController {

    private UserRepo userRepo;

    WebController(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    @GetMapping("/")
    public String index(){
        return String.format("<div><a href=\"%s\">Submit Unicode name by form</a> </div><div><a href=\"%s\">Auto add Unicode names</a> </div><div><a href=\"%s\">Get Unicode names</a>  </div>",
                "/form/add/unicode/name",
                "/auto/add",
                "/get/unicode/names");
    }

    @PostMapping("/form/add")
    public String addingUnicodeName(@RequestParam Map<String, String> params){
        User newUser = new User(
            params.get("displayname"),
            params.get("lastname"),
            params.get("firstname")
            );
        userRepo.save(newUser);
        return "Complete";
    }

    @GetMapping("/form/add/unicode/name")
    public String formOfAddingUnicodeName(){
        return """
                <!doctype>
                <html>
                <head><meta charset="UTF-8"></head><body>
                <form action="/form/add" method="POST">
                <div>Display name: <input name="displayname" type="text" value="ÖÄÜ"/></div>
                <div>Last name: <input name="lastname" type="text" value="ÖÄÜ"/></div>
                <div>First name: <input name="firstname" type="text" value="ÖÄÜ"/></div>
                <input name="submit" type="submit" value="Press submit to save"/>
                </form>
                </body>
                </html>
                """;
    }


}