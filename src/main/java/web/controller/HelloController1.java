package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController1 {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String countCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        List<Car> cars = new ArrayList<>();// cоздали лист всех машин.
        if (count != 0) {
            cars = carService.getCars(count);// прокинул в лист вводимое count
            model.addAttribute("cars", cars);
        }
        return "myCars/cars";
    }
}

