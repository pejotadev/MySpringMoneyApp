package com.example.myMoneyApp.repository;

import com.example.myMoneyApp.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("cardRepository")
public interface CardRepository extends JpaRepository<Card, Integer> {

}
