package com.example.myMoneyApp.service.implementations;

import com.example.myMoneyApp.model.Address;
import com.example.myMoneyApp.repository.AddressRepository;
import com.example.myMoneyApp.service.interfaces.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("addressService")
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressRepository addressRepository;

    @Override
    public Optional<Address> getAddressById(Integer id) {
        return addressRepository.findById(id);
    }

    @Override
    public List<Address> getAllAddress() {
        return addressRepository.findAll();
    }

    @Override
    public void deleteAllAddresss() {
        addressRepository.deleteAll();
    }

    @Override
    public void deleteAddressById(Integer id) {
        addressRepository.deleteById(id);
    }

    @Override
    public void updateAddressById(Integer id, Address address) {
        Optional<Address> getAddress = getAddressById(id);
        getAddress.get().setAddress(address.getAddress());
        getAddress.get().setCity(address.getCity());
        getAddress.get().setComplement(address.getComplement());
        getAddress.get().setNumber(address.getNumber());
        getAddress.get().setZipcode(address.getZipcode());
        getAddress.get().setState(address.getState());

        addressRepository.save(address);
    }

    @Override
    public void updateAddress(Address address) {
        addressRepository.save(address);
    }

    @Override
    public void insertAddress(Address address) {
        addressRepository.save(address);
    }
}
