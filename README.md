# LibraryManagement
图书管理系统

目标任务：完成一个图书管理系统，包含对图书的增删查改功能，需要有用户登录控制，可以只提供RestFul接口，有Web界面尤佳

任务完成情况：

用SpringBoot做开发，h2嵌入式做数据库，swagger做辅助测试接口，只完成了部分框架，登录协议未完成，图书增删查改未完成，只包含用户增删查改部分代码

目前遇到问题：

当DemoApplication和Service、Controller等不在同一目录（非子目录）下时报错：org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'UserServiceImpl': Unsatisfied dependency expressed through field 'UserRepository'; nested exception is org.springframework.beans.factory.BeanCreationException:...

在同一目录时:

程序可以编译但受限于上述问题用户增删查改代码难做下一步开发...

h2数据库：localhost:8080/h2-console

swagger: localhost:8080/swagger-ui.html

