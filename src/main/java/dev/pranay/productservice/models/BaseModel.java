package dev.pranay.productservice.models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@MappedSuperclass
@Data
public class BaseModel {
    @Id
    @GeneratedValue(generator = "uuidgenerator")
    @GenericGenerator(name = "uuidgenerator", strategy = "uuid2")
    @Column(name = "id", columnDefinition = "binary(16)", nullable = false, updatable = false)
    private UUID uuid;
}
