package dio.aulaspringdatajpa.model;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//gerando Id do banco de forma automatica
    @Column(name = "user_id")
    private Integer id;
    @Column(length = 50, nullable = false)
    private String name;
    private String username;
    private String passwod;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswod() {
        return passwod;
    }

    public void setPasswod(String passwod) {
        this.passwod = passwod;
    }
}
