package com.xml.project.controller;

import com.xml.project.service.AutorskoDeloService;
import com.xml.project.service.AutorskoDeloServiceImpl;
import com.xml.project.test.TestingAutroskoDeloZahtev;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class AutorskoDeloController {

//    @Autowired    iz nekog razloga ne radi
//    private AutorskoDeloService autorskoDeloService;
    private AutorskoDeloServiceImpl  autorskoDeloService = new AutorskoDeloServiceImpl();

    @RequestMapping("/ispis")
    public String ispisinesto(){
        return "Ispis neki radi oruzja";
    }

    @RequestMapping("/new-save")
    public void saveNewFile() {
        autorskoDeloService.saveNewFile();
    }
}
