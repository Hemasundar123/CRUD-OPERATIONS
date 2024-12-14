package com.Mikey.App.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String Category;
    private Date releaseDate;
    private boolean productAvailable;
    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageData;

    private int stockQuantity;

}