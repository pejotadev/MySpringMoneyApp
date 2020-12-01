package com.example.myMoneyApp.service.interfaces;

import com.example.myMoneyApp.model.Agency;

import java.util.List;
import java.util.Optional;

public interface AgencyService {
    Optional<Agency> getAgencyById(Integer id);
    List<Agency> getAllAgency();
    void deleteAllAgencys();
    void deleteAgencyById(Integer id);
    void updateAgencyById(Integer id, Agency agency);
    void updateAgency(Agency agency);
    void insertAgency(Agency agency);
}

