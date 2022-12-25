package com.example.mapStruct.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Product {
    @Id
    private int id;
    private String name;
    private String desc;
    private int quantity;
    private long price;
    private String itemId;
}
