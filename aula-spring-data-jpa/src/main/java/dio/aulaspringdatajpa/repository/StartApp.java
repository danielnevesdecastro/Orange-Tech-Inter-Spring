package dio.aulaspringdatajpa.repository;

import dio.aulaspringdatajpa.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component//objeto gerenciado pelo spring Framework
public class StartApp implements CommandLineRunner {
    @Autowired//injeção de dependência
    private UserRepository repository;

    //commandline runner, inicializa o container e executa
    //método main do Srping framework
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Daniel Neves");
        user.setUsername("Daneves");
        user.setPasswod("admin");

        repository.save(user);//método pertinenete a operação de CRUD

        for (User u : repository.findAll()) {
            System.out.println(u);
        }
    }
}
