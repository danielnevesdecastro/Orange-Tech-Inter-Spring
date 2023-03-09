package dio.web.api.controller;

import dio.web.api.model.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // agora a classe é um componente restcontroller, e seus metodos serão Recursos HTTP;
public class WelcomeController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to MY SpringBoot Web API";
    }


}
