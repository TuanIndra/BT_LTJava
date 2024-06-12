package com.example.BT_Nhom7.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(name="Category")
@RequiredArgsConstructor
@Data
@Getter
@Setter
public class Category {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Tên phải bắt buộc")
    private String name;

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Tên phải bắt buộc") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Tên phải bắt buộc") String name) {
        this.name = name;
    }
}

