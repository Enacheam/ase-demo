package com.kenacheam.studies.asedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @GetMapping("/demo/state")
    public String sayDemoStatus(){
        return "ASE Demo Service is working fine!";
    }

    @GetMapping("/demo/update")
    public String fakeUpdate(){
        return "ASE Demo environment has been updated";
    }

    @GetMapping("/demo/stop")
    public String fakeUpdate(){
        return "ASE Demo environment: faking... simulating stopping";
    }
}
