package org.turkcell;

public class Product {
    private String name;
    private String description;
    private int id;

    public Product() {

    }

    private Product(Builder builder) {
        this.name = builder.name;
        this.id = builder.id;
        this.description = builder.description;
    }

    public static class Builder {
        private String name;
        private String description;
        private int id;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", id=" + id +
                '}';
    }
}
