package org.example.beans;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Component;
        import org.springframework.beans.factory.annotation.Value;

@Component
public class Mechanic {
    private String name;
    private String tool; //

    public Mechanic() {
    }

    @Autowired
    public Mechanic(@Value("${mechanic.name}") String name, @Value("${mechanic.tool}") String tool) {
        this.name = name;
        this.tool = tool;
    }

    public void someGarageMethod() {
        System.out.println("Executing someGarageMethod");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                ", tool='" + tool + '\'' +
                '}';
    }
}