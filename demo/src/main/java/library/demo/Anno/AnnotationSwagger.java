package library.demo.Anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(value={ElementType.METHOD, ElementType.TYPE}) //注解对象为函数和类型
@Retention(RetentionPolicy.RUNTIME) //注解运行时有效
public @interface AnnotationSwagger {
    String value() default "";
}
