package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {
    //Instanciar no Spring a classe;
    @Autowired // injeta a dependencia atraves do compoenente autowired, no lugar de um new class;
    private Calculadora calc;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Resultado é "+calc.somar(2,8));

    }
}
