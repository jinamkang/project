package com.example.kjh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KjhController {

    @GetMapping("/data")
    public String data() {
        String data = "";
        for (int i = 0; i < 10; i++) {
            data += "안녕<br>";
        }
        return data;
    }
}
