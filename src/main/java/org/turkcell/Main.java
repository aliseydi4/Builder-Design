package org.turkcell;

public class Main {
    public static void main(String[] args){
        Customer customer=new Customer.Builder().name("ali").id(1).lastname("demir").build();
        Product product=new Product.Builder().name("laptop").id(1).description("asus").build();
        System.out.println(product);
        System.out.println(customer);
    }
}