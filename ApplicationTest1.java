package com.program.application;

import com.program.application.model.Emp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
class TestController {

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public Emp firstPage() {

        Emp emp = new Emp(1,"ERST","UVW","Female","Vinod","Hyderabad","Level 50","working","B+","1997-09-21","2019-08-05","2050-07-07","ABC","XYZ","Male","1991-07-08","Brother","B.E","2015-07-07","2019-07-07","Engineering College","Hyderabad","78.9%");

        return emp;
    }

}