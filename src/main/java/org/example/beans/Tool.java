package org.example.beans;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Tool {
    @Autowired
    private Mechanic mechanic;

    public void useGarageMethod() {
        mechanic.someGarageMethod();
    }

}