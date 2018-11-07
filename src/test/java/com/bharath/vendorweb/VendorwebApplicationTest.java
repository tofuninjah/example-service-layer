package com.bharath.vendorweb;

import com.bharath.vendor.VendorwebApplication;
import com.bharath.vendor.entities.Vendor;
import com.bharath.vendor.repos.VendorRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= VendorwebApplication.class)
public class VendorwebApplicationTest {

    @Autowired
    private VendorRepository vendorRepository;

    @Test
    public void testCreateVendor() {

        Vendor vendor = new Vendor();
        vendor.setCode("code");
        vendor.setName("name");
        vendor.setType("type");
        vendor.setEmail("email");
        vendor.setPhone("phone");
        vendor.setAddress("address");

        vendorRepository.save(vendor);

        System.out.println(vendor);
    }
}