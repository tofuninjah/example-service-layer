package com.bharath.vendor.service;

import com.bharath.vendor.entities.Vendor;
import com.bharath.vendor.repos.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorServiceImpl implements VendorService {

    @Autowired
    VendorRepository repository;

    @Override
    public Vendor save(Vendor vendor) {
       return repository.save(vendor);
    }

    @Override
    public Vendor update(Vendor vendor) {
        return repository.save(vendor);
    }

    @Override
    public void delete(Vendor vendor) {
        repository.delete(vendor);
    }

    @Override
    public Vendor getVendorById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Vendor> getAllVendors() {
        return repository.findAll();
    }
}
