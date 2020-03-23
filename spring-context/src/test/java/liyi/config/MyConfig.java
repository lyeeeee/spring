package liyi.config;

import liyi.EnableAOP;
import liyi.imports.MyImportClass;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

/**
 * @program: spring
 * @description: ${description}
 * @author: liyi
 * @create: 2020-02-09 18:25
 */
@Configuration
@ComponentScan("liyi")
@EnableAOP
@EnableAspectJAutoProxy
public class MyConfig {
}
