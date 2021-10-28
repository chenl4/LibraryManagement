package library.demo.Entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import javax.persistence.*;

import org.springframework.context.annotation.Primary;


@Entity
@Data
@Table(name="USER_INFO")
@ApiModel(value = "自定义实体-User", description = "存储用户数据")
public class User implements Serializable {
    @Id
    @ApiModelProperty(value = "账号", name = "账号（id）", required = true, example = "1", hidden = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @Column(name="name")
    @ApiModelProperty(value = "姓名", name = "姓名（name）", required = false, example = "李四", hidden = false)
    private String name;
    @Column(name="password")
    @ApiModelProperty(value = "密码", name = "密码（password）", required = true, example = "123456", hidden = false)
    private String password;

    public User() {}

    public User(String id, String name, String password) {
        this.id=id;
        this.name=name;
        this.password=password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}
