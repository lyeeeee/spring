package liyi;

import liyi.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring
 * @description: ${description}
 * @author: liyi
 * @create: 2020-02-09 18:24
 */
public class TestIOC {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		// 初始化spring环境，包括创建bean，上面只是准备好了bean定义
		applicationContext.refresh();

	}
}
