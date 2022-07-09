package dev.edurevsky.springjsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
}
