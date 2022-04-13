package com.example.emtbackend.model.exceptions;

public class NotAvailable extends RuntimeException{
    public NotAvailable(){
        super(String.format("Not available!"));
    }
}
