package com.example.AdminResource.controlador;

import com.example.AdminResource.controlador.exception.NotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ejemplo")
public class Controlador {

    @GetMapping("/suma/{num1}/{num2}")
    public String sumatoria(@PathVariable String num1, @PathVariable String num2){
        // .../calculator/suma/10/5
        return "La suma de los números es: "+(Integer.parseInt(num1)+Integer.parseInt(num2));
    }

    @GetMapping()
    public String calculator(@RequestParam double dividendo, @RequestParam double divisor){
        // .../calculator?dividendo=10&divisor=2
        if(divisor == 0){
            throw new ArithmeticException("No es posible dividir por cero");
        }
        return "La división es: "+(dividendo/divisor);
    }

    @GetMapping("/saludo/{nombre}")
    public String saludoBuenDia(@PathVariable String nombre){
        if(nombre.equalsIgnoreCase("Daniel")){
            throw new NotFoundException("Nombre '"+nombre+"' no permitido");
        }
        return "Buen día "+nombre;
    }

}
