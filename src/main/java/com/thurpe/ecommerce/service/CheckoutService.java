package com.thurpe.ecommerce.service;

import com.thurpe.ecommerce.dto.Purchase;
import com.thurpe.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
