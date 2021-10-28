package library.demo.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import library.demo.Entity.User;


@Service("UserServiceImpl")
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("UserRepository")
    private UserRepository UserRepository;

    //@Override
    public List<User> queryAllUserList() {
        Iterable<User> iterable = UserRepository.findAll();
        List<User> list=new ArrayList<User>();
        Iterator<User> iterator = iterable.iterator();
        while(iterator.hasNext()){
            User next = iterator.next();
            list.add(next);
        }
        return list;
    }

    //@Override
    public User post(User entity) {
        User p = UserRepository.save(entity);
        return p;
    }

    //@Override
    public List<User> get() {
        return UserRepository.findAll();
    }

    //@Override
    public void put(User entity) {
        UserRepository.save(entity);

    }

    //@Override
    public void delete(User entity) {
        UserRepository.delete(entity);

    }

    public List<User> findUsersByName(String id){
        return UserRepository.findUsersByName(id);
    }

   

}
