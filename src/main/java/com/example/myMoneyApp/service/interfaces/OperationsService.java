package com.example.myMoneyApp.service.interfaces;

import com.example.myMoneyApp.model.Operations;

import java.util.List;
import java.util.Optional;

public interface OperationsService {
    Optional<Operations> getOperationsById(Integer id);
    List<Operations> getAllOperations();
    void deleteAllOperationss();
    void deleteOperationsById(Integer id);
    void updateOperationsById(Integer id, Operations operations);
    void updateOperations(Operations operations);
    void insertOperations(Operations operations);
}

