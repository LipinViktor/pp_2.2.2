package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		return "index";
	}

	@GetMapping(value = "/cars")
	public String printCar(@RequestParam(required = false) String value, ModelMap map) {
		List<Car> cars = new ArrayList<>();
		List<Car> result = new ArrayList<>();
		cars.add(new Car("Niva", "2121", 90));
		cars.add(new Car("Kopeika", "2101", 95));
		cars.add(new Car("Chetverka", "2104", 100));
		cars.add(new Car("Dvoika", "2102", 110));
		cars.add(new Car("Shesterka", "2106", 120));
		if (value != null && Integer.parseInt(value) < 5 && Integer.parseInt(value) > 0) {
			for (int i = 0; i < Integer.parseInt(value); i++) {
				result.add(cars.get(i));
			}
			map.addAttribute("cars", result);
		} else {
			map.addAttribute("cars", cars);
		}
			return "cars";

	}
	
}