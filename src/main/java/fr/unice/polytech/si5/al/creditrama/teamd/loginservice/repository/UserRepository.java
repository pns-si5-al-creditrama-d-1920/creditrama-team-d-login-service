package fr.unice.polytech.si5.al.creditrama.teamd.loginservice.repository;

import fr.unice.polytech.si5.al.creditrama.teamd.loginservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String username);
}
