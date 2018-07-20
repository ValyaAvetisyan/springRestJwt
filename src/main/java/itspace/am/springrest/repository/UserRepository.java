package itspace.am.springrest.repository;

import itspace.am.springrest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findOneByEmail(String email);
    User findOneByEmailAndPassword(String email, String password);
}
