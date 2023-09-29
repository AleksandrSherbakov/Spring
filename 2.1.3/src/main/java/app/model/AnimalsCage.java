package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal animal;

    @Autowired
    private Timer timer;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
    @Bean(name="timer")
    //@Scope(value="prototype")
    public Timer getTimer(){
        Timer timer = new Timer();
        return timer;
    }
    @Bean(name="ApplicationContextBean")
    public ApplicationContext getApplicationContext(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        return applicationContext;
    }
    @Bean(name="cat")
    public Cat getCat(){
        Cat cat = new Cat();
        return cat;
    }
    @Bean(name="dog")
    public Dog getDog(){
        Dog dog = new Dog();
        return dog;
    }
}
