package com.yk.content.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("serviceList")
    public List<ServiceInstance> serviceList() {
        return discoveryClient.getInstances("user-center");
    }

}
