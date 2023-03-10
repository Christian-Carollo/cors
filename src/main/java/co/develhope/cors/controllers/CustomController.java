package co.develhope.cors.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:63342")
@RequestMapping("/custom")
public class CustomController {

    @GetMapping()
    public String welcome(){
        return "Welcome to the custom controller";
    }
}
