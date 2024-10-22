package com.example.pricelock.controller;

import com.example.pricelock.model.Purchase;
import com.example.pricelock.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/purchase")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    // Create a purchase using the locked price
    @PostMapping("/{priceLockId}")
    public String purchaseProduct(@PathVariable Long priceLockId, Model model) {
        try {
            Purchase purchase = purchaseService.purchaseProduct(priceLockId);
            model.addAttribute("purchase", purchase);
            return "purchase-confirmation";  // Return confirmation page
        } catch (RuntimeException e) {
            model.addAttribute("errorMessage", e.getMessage());
            return "error";  // Return an error page if something goes wrong
        }
    }
}
