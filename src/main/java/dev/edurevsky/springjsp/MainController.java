package dev.edurevsky.springjsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {

    private List<Animal> animals = new ArrayList<>();

    @GetMapping
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index");
        int a = 1;
        int b = 2;
        int sum = a + b;
        mv.addObject("a", a);
        mv.addObject("b", b);
        mv.addObject("sum", sum);
        return mv;
    }

    @GetMapping("/form")
    public ModelAndView form() {
        return new ModelAndView("form");
    }

    @GetMapping("/sum")
    public ModelAndView sum(@RequestParam("a") int a, @RequestParam("b") int b) {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("a", a);
        mv.addObject("b", b);
        mv.addObject("sum", a + b);
        return mv;
    }

    @GetMapping("/forEach")
    public ModelAndView forEach() {
        ModelAndView mv = new ModelAndView("forEach");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 50; i += 2) {
            numbers.add(i);
        }
        mv.addObject("numbers", numbers);
        return mv;
    }

    @GetMapping("/animals")
    public ModelAndView animals() {
        ModelAndView mv = new ModelAndView("animals");
        mv.addObject("animals", animals);
        return mv;
    }

    @GetMapping("/newAnimal")
    public ModelAndView formNewAnimal() {
        return new ModelAndView("formAnimal");
    }

    @PostMapping("/newAnimal")
    public ModelAndView newAnimal(@ModelAttribute Animal animal) {
        animals.add(animal);
        return new ModelAndView("redirect:/animals");
    }
}
