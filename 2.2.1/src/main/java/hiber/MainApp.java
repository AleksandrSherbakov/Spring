package hiber;

import hiber.config.AppConfig;
import hiber.model.User;
import hiber.model.Car;
import hiber.service.UserService;
import hiber.service.CarService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.List;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      CarService carService = context.getBean(CarService.class);

      carService.add(new Car("Toyota", "AE86"));
      carService.add(new Car("Lexus", "LS250"));
      carService.add(new Car("Lada","2101"));
      carService.add(new Car("Nissan", "350Z"));

      UserService userService = context.getBean(UserService.class);
      userService.deleteAllUser();
      List<Car> cars= carService.listCar();

      /*userService.add(new User("User1", "Lastname1", "user1@mail.ru"));
      userService.add(new User("User2", "Lastname2", "user2@mail.ru"));
      userService.add(new User("User3", "Lastname3", "user3@mail.ru"));
      userService.add(new User("User4", "Lastname4", "user4@mail.ru"));*/

      userService.add(new User("User5", "Lastname5", "user5@mail.ru",cars.get(0)));
      userService.add(new User("User6", "Lastname6", "user6@mail.ru",cars.get(1)));
      userService.add(new User("User7", "Lastname7", "user8@mail.ru",cars.get(2)));
      userService.add(new User("User8", "Lastname8", "user4@mail.ru",cars.get(3)));

      List<User> users = userService.listUsers();
      for (User user : users) {
         System.out.println("Id = "+user.getId());
         System.out.println("First Name = "+user.getFirstName());
         System.out.println("Last Name = "+user.getLastName());
         System.out.println("Email = "+user.getEmail());
         System.out.println("Car = "+user.getCar());
      }

      System.out.println(userService.findOwner("Lada","2101"));
      context.close();


   }
}
