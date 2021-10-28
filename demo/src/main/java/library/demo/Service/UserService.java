package library.demo.Service;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import library.demo.Entity.User;

@Service("UserService")
public interface UserService {
    public List<User> queryAllUserList();

    public User post(User entity);

    public List<User> get();

    public void put(User entity);

    public void delete(User entity);
}
