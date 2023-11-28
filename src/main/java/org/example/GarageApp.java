package org.example;

        import org.example.beans.Garage;
        import org.example.beans.Mechanic;
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GarageApp {
    public static void main(String[] args) {
        Mechanic myMechanic = new Mechanic();
        myMechanic.setName("OLEG");
        myMechanic.setTool("Wrench");

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Garage garage = context.getBean(Garage.class);

        garage.someGarageMethod();

        System.out.println(garage);
    }
}