package pmtest.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import pmtest.org.model.Team;
import pmtest.org.service.TeamServiceImplementation;


@Controller
@RequestMapping
public class controller {

    private static final org.apache.logging.log4j.Logger logger =  org.apache.logging.log4j.LogManager.getLogger(controller.class);

    @Autowired
    private TeamServiceImplementation teamServiceImplementation;


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

    @GetMapping (value = "/sum")
    public String sum (){
        return "sum.jsp";
    }

    @PostMapping (value = "/add")
    public String addNewTeam(){
        logger.info("New Team with id"+ teamServiceImplementation.addTeam(new Team()).getId() + "was sucessfully added");
        return "redirect:/passData";
    }

}
