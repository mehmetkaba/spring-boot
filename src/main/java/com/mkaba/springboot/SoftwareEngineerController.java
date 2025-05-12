package com.mkaba.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {


    private final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping
    public List<SoftwareEngineer> getSoftwareEngineers() {
//        return List.of(
//                new SoftwareEngineer(1, "Mike", Collections.singletonList("js, react")),
//                new SoftwareEngineer(2, "James", Collections.singletonList("java, spring"))
//        );

        return softwareEngineerService.getAllSoftwareEngineers();
    }

    //:)
}
