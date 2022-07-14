package it.develhope.Api02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factorial")
public class FactorialController {

    @GetMapping("/{n}")
    public int getfactorial(@PathVariable int n) {
        if (n == 0) {
            return 1;
        } else {
            int result = n * getfactorial(n - 1);
            return result;
        }
    }


}
