package com.example.myMoneyApp.service.implementations;

import com.example.myMoneyApp.model.Agency;
import com.example.myMoneyApp.repository.AgencyRepository;
import com.example.myMoneyApp.service.interfaces.AgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("agencyService")
public class AgencyServiceImpl implements AgencyService {

    @Autowired
    AgencyRepository agencyRepository;

    @Override
    public Optional<Agency> getAgencyById(Integer id) {
        return agencyRepository.findById(id);
    }

    @Override
    public List<Agency> getAllAgency() {
        return agencyRepository.findAll();
    }

    @Override
    public void deleteAllAgencys() {
        agencyRepository.deleteAll();
    }

    @Override
    public void deleteAgencyById(Integer id) {
        agencyRepository.deleteById(id);
    }

    @Override
    public void updateAgencyById(Integer id, Agency agency) {
        Optional<Agency> getAgency = getAgencyById(id);
        getAgency.get().setAddress(agency.getAddress());
        getAgency.get().setCode(agency.getCode());

        agencyRepository.save(agency);
    }

    @Override
    public void updateAgency(Agency agency) {
        agencyRepository.save(agency);
    }

    @Override
    public void insertAgency(Agency agency) {
        agencyRepository.save(agency);
    }
}
