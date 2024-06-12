package com.example.BT_Nhom7.Model;
import jakarta.persistence.Entity;
import lombok.*;
import jakarta.persistence.*;


@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name= "products")
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    private String name;
    private double price;
    private String description;


    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}