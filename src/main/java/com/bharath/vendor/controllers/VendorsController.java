package com.bharath.vendor.controllers;

import com.bharath.vendor.entities.Vendor;
import com.bharath.vendor.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class VendorsController {
    @Autowired
    VendorService service;

    @RequestMapping("/displayVendors")
    public String displayVendors(ModelMap modelMap) {
        List<Vendor> vendors = service.getAllVendors();
        modelMap.addAttribute("vendors", vendors);
        return "displayVendors";
    }

    @RequestMapping("/showUpdate")
    public String showUpdate(@RequestParam("id") int id, ModelMap modelMap) {
        Vendor vendor = service.getVendorById(id);
        modelMap.addAttribute("vendor", vendor);
        return "updateVendor";
    }

    @RequestMapping("/updateVendor")
    public String updateVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap) {

        service.save(vendor);

        List<Vendor> vendors = service.getAllVendors();
        modelMap.addAttribute("vendors", vendors);
        return "displayVendors";
    }

    @RequestMapping("/deleteVendor")
    public String deleteVendor(@RequestParam("id") int id, ModelMap modelMap) {
        Vendor vendor = service.getVendorById(id);

        service.delete(vendor);

        List<Vendor> vendors = service.getAllVendors();

        modelMap.addAttribute("vendors", vendors);
        return "displayVendors";
    }

    @RequestMapping("/showCreate")
    public String showCreate() {
        return "createVendor";
    }

    @RequestMapping("/saveVendor")
    public String saveVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap) {
        service.save(vendor);

        List<Vendor> vendors = service.getAllVendors();

        modelMap.addAttribute("vendors", vendors);
        return "displayVendors";
    }
}
