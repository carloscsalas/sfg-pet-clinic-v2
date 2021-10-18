package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    /*when there's a request that comes in to the root context or root slash ord index.html, they're all going to
    * match to this RequestMapping*/
    @RequestMapping({"","/","index","index.html"})
    public String index(){
        return "index";
    }

}
