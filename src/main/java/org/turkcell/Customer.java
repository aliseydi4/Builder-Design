package org.turkcell;

public class Customer {
    private int id;
    private String name;
    private String lastname;

    public Customer() {
    }

    private Customer(Builder builder) {
        this.id=builder.id;
        this.name= builder.name;
        this.lastname= builder.lastname;
    }
    public static class Builder{
        private int id;
        private String name;
        private String lastname;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder lastname(String lastname) {
            this.lastname = lastname;
            return this;
        }
        public Customer build(){
            return new Customer(this);
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
