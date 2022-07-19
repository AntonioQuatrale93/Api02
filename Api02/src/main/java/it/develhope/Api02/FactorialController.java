package it.develhope.Api02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factorial")
public class FactorialController {
    @Autowired
    FactorialService factorialService;

    @GetMapping("/{n}")
    public int getFactorial(@PathVariable int n) {
        return factorialService.calculatefactorial(n);
    }
}
