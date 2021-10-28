package library.demo.Controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import library.demo.Anno.AnnotationSwagger;
import library.demo.Entity.User;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/swagger")
@Api(tags = {"HomeController","IndexController"})
public class HomeController {

    @RequestMapping("/testEntity")
    public User testEntity() {
        return new User();
    }

    @GetMapping("/test")
    // @ApiImplicitParam(name = "m", value = "m参数描述", required = false, paramType = "字符串", dataType = "名字数据值")
    @ApiImplicitParams(value = {
                                @ApiImplicitParam(name = "m", value = "m参数描述", required = false, paramType = "字符串", dataType = "名字数据值"),
                                @ApiImplicitParam(name = "n", value = "n参数描述", required = true, paramType = "字符串", dataType = "名字数据值") 
    })
    public String test(String m, String n) {
        return "test";
    }

    @PostMapping("/post")
    @ApiOperation(value="post方法，执行数据新增操作", notes = "图书管理系统使用Post请求")
    public String post(
                    @ApiParam(name = "用户名 (a)", value = "新增用户时提供的用户名", required = true) String a, 
                    @ApiParam(name = "密码 (b)", value = "新增用户提供的密码", required = true) String b) {
        return "post";
    }

    
    @GetMapping("/get")
    public String get(String a, String b) {
        return "get";
    }

    @AnnotationSwagger
    @RequestMapping("/req")
    public String req(String m) {
        return "req";
    }
    
    //@ApiIgnore
    @RequestMapping("/Index")
    public String Index() {
        return "你好，欢迎使用图书管理系统";
    }
}
