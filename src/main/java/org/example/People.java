package org.example;

import org.springframework.stereotype.Component;

//@Component
public class People {

    private String name = "James";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
