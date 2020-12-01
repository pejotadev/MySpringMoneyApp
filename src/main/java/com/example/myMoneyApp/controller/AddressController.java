package com.example.myMoneyApp.controller;

import com.example.myMoneyApp.model.Address;
import com.example.myMoneyApp.service.interfaces.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @RequestMapping(value = "/address/getAll", method = RequestMethod.GET)
    public List<Address> getAddress() {
        return addressService.getAllAddress();
    }

    @RequestMapping(value = "/address/get/{id}", method = RequestMethod.GET)
    public Optional<Address> getAddress(@PathVariable("id") Integer id) {
        return addressService.getAddressById(id);
    }

    @RequestMapping(value = "/address/deleteAll", method = RequestMethod.DELETE)
    public void deleteAddresss() {
        addressService.deleteAllAddresss();
    }

    @RequestMapping(value = "/address/delete/{id}", method = RequestMethod.DELETE)
    public void deleteAddress(@PathVariable("id") Integer id) {
        addressService.deleteAddressById(id);
    }

    @RequestMapping(value = "/address/update/{id}", method = RequestMethod.POST)
    public void updateAddress(@RequestBody Address address, @PathVariable("id") Integer id) {
        addressService.updateAddressById(id, address);
    }

    @RequestMapping(value = "/address/insert", method = RequestMethod.POST)
    public void updateAddress(@RequestBody Address address) {
        addressService.insertAddress(address);
    }
}
