package com.example.myMoneyApp.service.interfaces;

import com.example.myMoneyApp.model.Card;

import java.util.List;
import java.util.Optional;

public interface CardService {
    Optional<Card> getCardById(Integer id);
    List<Card> getAllCard();
    void deleteAllCards();
    void deleteCardById(Integer id);
    void updateCardById(Integer id, Card card);
    void updateCard(Card card);
    void insertCard(Card card);


}
