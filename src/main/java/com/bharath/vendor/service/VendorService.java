package com.bharath.vendor.service;

import com.bharath.vendor.entities.Vendor;

import java.util.List;

public interface VendorService {
    /**
     * Crud Operations
     */
    Vendor save(Vendor vendor);
    Vendor update(Vendor vendor);
    void delete(Vendor vendor);

    Vendor getVendorById(int id);
    List<Vendor> getAllVendors();
}
