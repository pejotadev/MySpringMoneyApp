package com.example.myMoneyApp.controller;

import com.example.myMoneyApp.model.Operations;
import com.example.myMoneyApp.service.interfaces.OperationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OperationsController {

    @Autowired
    private OperationsService operationsService;

    @RequestMapping(value = "/operations/getAll", method = RequestMethod.GET)
    public List<Operations> getOperations() {
        return operationsService.getAllOperations();
    }

    @RequestMapping(value = "/operations/get/{id}", method = RequestMethod.GET)
    public Optional<Operations> getOperations(@PathVariable("id") Integer id) {
        return operationsService.getOperationsById(id);
    }

    @RequestMapping(value = "/operations/deleteAll", method = RequestMethod.DELETE)
    public void deleteOperationss() {
        operationsService.deleteAllOperationss();
    }

    @RequestMapping(value = "/operations/delete/{id}", method = RequestMethod.DELETE)
    public void deleteOperations(@PathVariable("id") Integer id) {
        operationsService.deleteOperationsById(id);
    }

    @RequestMapping(value = "/operations/update/{id}", method = RequestMethod.POST)
    public void updateOperations(@RequestBody Operations operations, @PathVariable("id") Integer id) {
        operationsService.updateOperationsById(id, operations);
    }

    @RequestMapping(value = "/operations/insert", method = RequestMethod.POST)
    public void updateOperations(@RequestBody Operations operations) {
        operationsService.insertOperations(operations);
    }
}
