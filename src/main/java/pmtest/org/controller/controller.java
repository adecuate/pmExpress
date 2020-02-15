package pmtest.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pmtest.org.model.Team;
import pmtest.org.service.TeamServiceImplementation;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


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
    public String addNewEvent(HttpServletRequest httpServletRequest){
        Team event1 = new Team();
      //  teamServiceImplementation.addListTeam(events);
      // event.setNameEvent(httpServletRequest.getParameter("nameEvent"));
        // event.setKefEvent(Integer.parseInt(httpServletRequest.getParameter("kefEvent")));
      //  logger.info("New Team with id  "+ teamServiceImplementation.addTeam(event).getId() +" and Name "+teamServiceImplementation.addTeam(event).getNameEvent() +" was sucessfully added  ");
        return "redirect:/passData";
    }

}
