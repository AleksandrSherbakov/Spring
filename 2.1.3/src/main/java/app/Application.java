package app;

import app.config.AppConfig;
import app.model.AnimalsCage;
import app.model.Cat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        for (int i = 0; i < 5; i++) {
            AnimalsCage beanCat =
                    applicationContext.getBean(AnimalsCage.class);
            beanCat.whatAnimalSay();

            AnimalsCage beanDog =
                    applicationContext.getBean(AnimalsCage.class);
            beanDog.whatAnimalSay();
        }
    }

}
