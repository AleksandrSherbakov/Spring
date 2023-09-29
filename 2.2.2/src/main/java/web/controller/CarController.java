package web.controller;
import org.springframework.ui.ModelMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {
    CarService carService = new CarService();
    @GetMapping("/cars")
    public String getCars(@RequestParam(name = "count", required = false, defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}
