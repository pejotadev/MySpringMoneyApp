package com.example.myMoneyApp.service.interfaces;

import com.example.myMoneyApp.model.Address;

import java.util.List;
import java.util.Optional;

public interface AddressService {
    Optional<Address> getAddressById(Integer id);
    List<Address> getAllAddress();
    void deleteAllAddresss();
    void deleteAddressById(Integer id);
    void updateAddressById(Integer id, Address address);
    void updateAddress(Address address);
    void insertAddress(Address address);


}
