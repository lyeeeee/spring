package liyi;

import liyi.imports.MyImportClass;
import org.intellij.lang.annotations.JdkConstants;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @program: spring
 * @description: ${description}
 * @author: liyi
 * @create: 2020-02-10 21:46
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(MyImportClass.class)
public @interface EnableAOP {
}
