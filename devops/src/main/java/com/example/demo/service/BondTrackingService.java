package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Trade;
import com.example.demo.repo.TradeRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class BondTrackingService {

    @Autowired
    private TradeRepository tradeRepository;

    public List<Trade> getActiveTrades() {
        LocalDate currentDate = LocalDate.now();
        LocalDate endDate = currentDate.plusDays(5);
        return tradeRepository.findBySettlementDateBetween(currentDate, endDate);
    }

    public List<Trade> getMaturedBonds() {
        LocalDate currentDate = LocalDate.now();
        LocalDate endDate = currentDate.plusDays(5);
        return tradeRepository.findByStatusAndSettlementDateBetween("OPEN", currentDate, endDate);
    }
}

