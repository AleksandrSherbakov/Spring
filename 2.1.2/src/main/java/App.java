import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHelloWorld1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHelloWorld2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        //System.out.println(beanHelloWorld1.getMessage());
        Cat beanCat1 = (Cat)applicationContext.getBean("catBean");
        Cat beanCat2 = (Cat)applicationContext.getBean("catBean");
        System.out.println(beanHelloWorld1.equals(beanHelloWorld2));
        System.out.println(beanCat1.equals(beanCat2));
    }
}