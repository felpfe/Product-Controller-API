package com.felipefelix.controledeprodutos.entities;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Getter @Setter @AllArgsConstructor
public class Category implements Serializable {
    private Long id;
    private String name;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return id.equals(category.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
