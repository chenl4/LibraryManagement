package library.demo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import library.demo.Anno.AnnotationSwagger;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import com.google.common.base.Predicates;

@Configuration
public class Swagger2 {

    @Primary
    @Bean
    public Docket docket() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);

        ApiInfo apiInfo = new ApiInfoBuilder()
                                    .title("LibraryManagement API")
                                    .description("Swagger~~~~~~~~~ LibraryManagement API by Lilin Chen")
                                    .version("1.0")
                                    .build();
        docket.apiInfo(apiInfo);

        docket = docket
                .select() //返回APISelectorBuilder
                .apis(Predicates.not(
                    RequestHandlerSelectors.withMethodAnnotation(AnnotationSwagger.class) // 当方法上有AnnotationSwagger注解返回true
                    ))
                .apis(RequestHandlerSelectors.basePackage("library.demo.Controller")) //设定扫描哪个包中的注解
                //.apis(RequestHandlerSelectors.basePackage("library.demo")) 
                .paths(
                    Predicates.or(
                        PathSelectors.regex("/swagger/.*"), // 使用正则表达式，约束生成API文档的路径地址
                        PathSelectors.regex("/swagger2/.*"),
                        PathSelectors.regex("/.*")
                    )
                )
                .build(); //重新构建Docket对象

        return docket;
    }
}