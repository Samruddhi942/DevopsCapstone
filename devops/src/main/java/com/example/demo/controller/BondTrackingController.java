package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Trade;
import com.example.demo.service.BondTrackingService;

import java.util.List;

@RestController
@RequestMapping("/api/bond-tracking")
public class BondTrackingController {

    @Autowired
    private BondTrackingService bondTrackingService;

    @GetMapping("/active-trades")
    public List<Trade> getActiveTrades() {
        return bondTrackingService.getActiveTrades();
    }
    
    @GetMapping("/")
    public String sample() {
        return "application is running";
    }

    @GetMapping("/matured-bonds")
    public List<Trade> getMaturedBonds() {
        return bondTrackingService.getMaturedBonds();
    }
}
