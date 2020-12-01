package com.example.myMoneyApp.service.implementations;

import com.example.myMoneyApp.model.Card;
import com.example.myMoneyApp.repository.CardRepository;
import com.example.myMoneyApp.service.interfaces.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("cardService")
public class CardServiceImpl implements CardService {

    @Autowired
    CardRepository cardRepository;

    @Override
    public Optional<Card> getCardById(Integer id) {
        return cardRepository.findById(id);
    }

    @Override
    public List<Card> getAllCard() {
        return cardRepository.findAll();
    }

    @Override
    public void deleteAllCards() {
        cardRepository.deleteAll();
    }

    @Override
    public void deleteCardById(Integer id) {
        cardRepository.deleteById(id);
    }

    @Override
    public void updateCardById(Integer id, Card card) {
        Optional<Card> getCard = getCardById(id);
        getCard.get().setAccount(card.getAccount());
        getCard.get().setCode(card.getCode());
        getCard.get().setCredit(card.isCredit());
        getCard.get().setDebit(card.isDebit());
        getCard.get().setCvv(card.getCvv());
        getCard.get().setName(card.getName());
        getCard.get().setValidity(card.getValidity());


        cardRepository.save(card);
    }

    @Override
    public void updateCard(Card card) {
        cardRepository.save(card);
    }

    @Override
    public void insertCard(Card card) {
        cardRepository.save(card);
    }
}
