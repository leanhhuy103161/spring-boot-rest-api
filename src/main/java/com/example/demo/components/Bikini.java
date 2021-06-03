package com.example.demo.components;

import org.springframework.stereotype.Component;

@Component("bikini")
public class Bikini implements Outfit{
    @Override
    public void wear() {
        System.out.println("Dang mac vay");
    }
}
