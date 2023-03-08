package dio.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosApplication.class, args);//instrução de runner, incialização do container

		//Calculadora calc = new Calculadora();new não é utilizada no Spring boot, não será provida pelo spring com new

	}

}
