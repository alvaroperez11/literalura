package com.alura.literalura;

import com.alura.literalura.principal.Principal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LiteraluraApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LiteraluraApplication.class, args);
		Principal principal = context.getBean(Principal.class); // Obtén la instancia gestionada por Spring
		principal.muestraMenu();
	}

}
