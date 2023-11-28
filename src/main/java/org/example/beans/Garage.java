package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Garage {
    private Tool tool;

    @Autowired
    public Garage(Tool tool) {
        this.tool = tool;
    }

    public void someGarageMethod() {
    }

}