package it.develhope.Api02;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class FactorialService {

    public int calculatefactorial( int n) {
        if (n == 0) {
            return 1;
        } else {
            int result = n * calculatefactorial(n - 1);
            return result;
        }
    }
}
