package pmtest.org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {

    @RequestMapping (value = "/start", method = RequestMethod.GET)
    public String startPmExpress(){
        return "index.jsp";
    }

    @GetMapping (value = "/bye")
    public String byePmExpress(){
        return "bye.jsp";
    }

    @GetMapping (value = "/passData")
    public String passData(){
        return "passData.jsp";
    }

    @PostMapping (value = "/passData")
    public ModelAndView passDataFromUser (@ModelAttribute("team") Team team, ModelAndView modelAndView){
        System.out.println(team);
        modelAndView.setViewName("forward:sum.jsp");
        modelAndView.addObject("team", team);
        return modelAndView;
    }

}
