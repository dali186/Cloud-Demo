package com.practice.clouddemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CloudDeployController {
    @RequestMapping("/cloud-init")
    public String cloudConnectTest() {
        return "Deploy Success...";
    }
}
