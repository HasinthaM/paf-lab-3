package com.paflab3.sliit_paf;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greetingcontroller {
     private static final String template = "Hello, %s!";
     private final AtomicLong count = new AtomicLong();

     @GetMapping("/greeting")
     public Greeting greeting() {
          return new Greeting(count.incrementAndGet(), String.format(template, "world"));
     }

     
}
