package library.demo.Service;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import library.demo.Entity.User;

@Repository("UserRepository")
public interface UserRepository extends JpaRepository<User,String> {
    List<User> findUsersByName(String name);
}