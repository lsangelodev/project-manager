package br.unicamp.lucasangelo.project_manager.controller;

/**
 * Created by lucassangelo on 2/29/16.
 */

import br.unicamp.lucasangelo.project_manager.model.User;
import br.unicamp.lucasangelo.project_manager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    private final UserRepository repository;

    @Autowired
    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity createUser(@RequestBody User user) {
        this.repository.save(user);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity getUser(Integer id) {
        //final User user = new User(1, "login", "senha", 0, Boolean.TRUE, "name", "lastName", "email");
        User user = this.repository.findByName("name");
        return new ResponseEntity(user, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity updateUser(@RequestBody User user) {
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity deleteUser(Integer id) {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
