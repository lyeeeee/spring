package liyi.imports;

import liyi.bean.IndexDao3;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @program: spring
 * @description: ${description}
 * @author: liyi
 * @create: 2020-02-10 21:36
 */
public class MyImportClass implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{IndexDao3.class.getName()};
	}
}
