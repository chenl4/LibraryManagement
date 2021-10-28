package library.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import library.demo.Entity.User;
import library.demo.Service.UserServiceImpl;

@Controller
@RequestMapping("/swagger")
@Api(tags = {"UserController"})
//@RequestMapping(path="/user",produces="application/json;charset=utf-8")
public class UserController {

    @Autowired
    private UserServiceImpl usi;

    @GetMapping("/findAllUsers")
    public String findAllUsers(Model model) {
        List<User> users = usi.queryAllUserList();
        model.addAttribute("Users", users);
        return "findAllUsers";
    }

    @DeleteMapping("/delete")
    public String delete(Model model){
        model.addAttribute("id","请输入要删除的Userid");
        return "Delete";
    }
    @DeleteMapping("/dodel")
    @ResponseBody
    public String del(String id){
        //usi.findUsersByName(id);
        return "delete product success";
    }

    @PutMapping("/Add")
    public String add(Model model) {
        model.addAttribute("id", "请输入id");
        model.addAttribute("name", "请输入name");
        model.addAttribute("password", "请输入password");
        return "Add";
    }

    @PutMapping("/save")
    @ResponseBody
    public String save(User user) {
        usi.put(user);
        return "save user success !";
    }

}
