package com.example.myMoneyApp.controller;

import com.example.myMoneyApp.model.Card;
import com.example.myMoneyApp.service.interfaces.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CardController {

    @Autowired
    private CardService cardService;

    @RequestMapping(value = "/card/getAll", method = RequestMethod.GET)
    public List<Card> getCard() {
        return cardService.getAllCard();
    }

    @RequestMapping(value = "/card/get/{id}", method = RequestMethod.GET)
    public Optional<Card> getCard(@PathVariable("id") Integer id) {
        return cardService.getCardById(id);
    }

    @RequestMapping(value = "/card/deleteAll", method = RequestMethod.DELETE)
    public void deleteCards() {
        cardService.deleteAllCards();
    }

    @RequestMapping(value = "/card/delete/{id}", method = RequestMethod.DELETE)
    public void deleteCard(@PathVariable("id") Integer id) {
        cardService.deleteCardById(id);
    }

    @RequestMapping(value = "/card/update/{id}", method = RequestMethod.POST)
    public void updateCard(@RequestBody Card card, @PathVariable("id") Integer id) {
        cardService.updateCardById(id, card);
    }

    @RequestMapping(value = "/card/insert", method = RequestMethod.POST)
    public void updateCard(@RequestBody Card card) {
        cardService.insertCard(card);
    }
}
