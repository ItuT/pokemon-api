package com.itumeleng;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonApiController {
	
	@GetMapping("/pokemon/{name}")
    public String echo(@PathVariable String name) {
        return "Hello " + name;
    }

}
