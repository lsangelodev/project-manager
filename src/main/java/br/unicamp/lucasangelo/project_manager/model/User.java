package br.unicamp.lucasangelo.project_manager.model;

/**
 * Created by lucassangelo on 2/29/16.
 */
public class User {

    private Integer id;
    private String  login;
    private String  password;
    private Integer type;
    private Boolean active;
    private String  name;
    private String  lastName;
    private String  email;

    public User(Integer id, String login, String password, Integer type, Boolean active,
                String name, String lastName, String email) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.type = type;
        this.active = active;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Integer getType() {
        return type;
    }

    public Boolean getActive() {
        return active;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}
