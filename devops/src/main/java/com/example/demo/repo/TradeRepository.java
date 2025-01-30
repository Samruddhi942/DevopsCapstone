package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Trade;

import java.time.LocalDate;
import java.util.List;

public interface TradeRepository extends JpaRepository<Trade, Long> {

    List<Trade> findByStatusAndSettlementDateBetween(String status, LocalDate startDate, LocalDate endDate);

    List<Trade> findBySettlementDateBetween(LocalDate startDate, LocalDate endDate);
}

