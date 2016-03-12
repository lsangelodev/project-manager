package br.unicamp.lucasangelo.project_manager.repository;

import br.unicamp.lucasangelo.project_manager.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by lucassangelo on 3/11/16.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByName(String name);
}
