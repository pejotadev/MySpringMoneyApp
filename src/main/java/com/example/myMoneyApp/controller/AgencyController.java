package com.example.myMoneyApp.controller;

import com.example.myMoneyApp.model.Agency;
import com.example.myMoneyApp.service.interfaces.AgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AgencyController {

    @Autowired
    private AgencyService agencyService;

    @RequestMapping(value = "/agency/getAll", method = RequestMethod.GET)
    public List<Agency> getAgency() {
        return agencyService.getAllAgency();
    }

    @RequestMapping(value = "/agency/get/{id}", method = RequestMethod.GET)
    public Optional<Agency> getAgency(@PathVariable("id") Integer id) {
        return agencyService.getAgencyById(id);
    }

    @RequestMapping(value = "/agency/deleteAll", method = RequestMethod.DELETE)
    public void deleteAgencys() {
        agencyService.deleteAllAgencys();
    }

    @RequestMapping(value = "/agency/delete/{id}", method = RequestMethod.DELETE)
    public void deleteAgency(@PathVariable("id") Integer id) {
        agencyService.deleteAgencyById(id);
    }

    @RequestMapping(value = "/agency/update/{id}", method = RequestMethod.POST)
    public void updateAgency(@RequestBody Agency agency, @PathVariable("id") Integer id) {
        agencyService.updateAgencyById(id, agency);
    }

    @RequestMapping(value = "/agency/insert", method = RequestMethod.POST)
    public void updateAgency(@RequestBody Agency agency) {
        agencyService.insertAgency(agency);
    }
}
