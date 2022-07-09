package dev.edurevsky.springjsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class MainController {

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
}
