package com.thurpe.ecommerce.dto;

import com.thurpe.ecommerce.entity.Address;
import com.thurpe.ecommerce.entity.Customer;
import com.thurpe.ecommerce.entity.Order;
import com.thurpe.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
