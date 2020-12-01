package com.example.myMoneyApp.repository;

import com.example.myMoneyApp.model.Operations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("operationRepository")
public interface OperationsRepository extends JpaRepository<Operations, Integer> {

}
