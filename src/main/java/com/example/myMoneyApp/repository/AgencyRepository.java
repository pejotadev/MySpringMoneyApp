package com.example.myMoneyApp.repository;

import com.example.myMoneyApp.model.Agency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("agencyRepository")
public interface AgencyRepository extends JpaRepository<Agency, Integer> {

}
