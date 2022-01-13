package com.felipefelix.controledeprodutos.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter @Setter @AllArgsConstructor
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;

    @JsonIgnore
    private List<Product> products = new ArrayList<>();

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return id.equals(category.id);
    }

    public List<Product> getProducts() {
        return products;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
