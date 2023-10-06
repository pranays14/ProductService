package dev.pranay.productservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
public class GenericProductDtoDB {
    private UUID id;
    private String title;
    private String description;
    private String image;
    private String category;
    private Double price;
    private String currency;

}
