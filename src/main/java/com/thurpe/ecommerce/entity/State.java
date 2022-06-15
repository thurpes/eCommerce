package com.thurpe.ecommerce.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "state")
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
}
