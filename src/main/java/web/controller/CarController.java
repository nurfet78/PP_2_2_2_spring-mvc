package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    private final CarService service;

    @Autowired
    public CarController(CarService service) {
        this.service = service;
    }

    @GetMapping("/cars")
    public String getCars(@RequestParam(defaultValue = "5") int count, Model model) {
        List<Car> cars = service.getListCar(count);
        model.addAttribute("cars", cars);

        return "cars";
    }
}
