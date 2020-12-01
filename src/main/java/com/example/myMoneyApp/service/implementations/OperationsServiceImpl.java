package com.example.myMoneyApp.service.implementations;

import com.example.myMoneyApp.model.Operations;
import com.example.myMoneyApp.repository.OperationsRepository;
import com.example.myMoneyApp.service.interfaces.OperationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("operationsService")
public class OperationsServiceImpl implements OperationsService {

    @Autowired
    OperationsRepository operationsRepository;

    @Override
    public Optional<Operations> getOperationsById(Integer id) {
        return operationsRepository.findById(id);
    }

    @Override
    public List<Operations> getAllOperations() {
        return operationsRepository.findAll();
    }

    @Override
    public void deleteAllOperationss() {
        operationsRepository.deleteAll();
    }

    @Override
    public void deleteOperationsById(Integer id) {
        operationsRepository.deleteById(id);
    }

    @Override
    public void updateOperationsById(Integer id, Operations operations) {
        Optional<Operations> getOperations = getOperationsById(id);
        getOperations.get().setAccount(operations.getAccount());
        getOperations.get().setCard(operations.getCard());
        getOperations.get().setType(operations.getType());
        getOperations.get().setValue(operations.getValue());

        operationsRepository.save(operations);
    }

    @Override
    public void updateOperations(Operations operations) {
        operationsRepository.save(operations);
    }

    @Override
    public void insertOperations(Operations operations) {
        operationsRepository.save(operations);
    }
}
