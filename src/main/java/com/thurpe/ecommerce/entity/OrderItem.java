package com.thurpe.ecommerce.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;

@Entity
@Getter
@Setter
@Table(name = "order_item")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imageUrl;

    private BigDecimal unitPrice;

    private int quantity;

    private Long productId;

//    @ManyToOne
//    @JoinColumn(name = "order_id")
//    private Order orderId;


    @ManyToOne(optional = false)
    @JoinColumn(name = "order_id")
    private Order orderId;

}
