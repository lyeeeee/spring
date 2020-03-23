package liyi;

import liyi.bean.IndexDao;
import liyi.bean.IndexDao3;
import liyi.bean.IndexDaoInterface;
import liyi.config.MyConfig;
import liyi.postprocessor.MyBeanFactoryPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @program: spring
 * @description: ${description}
 * @author: liyi
 * @create: 2020-02-09 20:46
 */
public class TestBeanPostProcessor {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		//applicationContext.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		Arrays.stream(beanDefinitionNames).forEach(a-> System.out.println(a));
		// 初始化spring环境，包括创建bean，上面只是准备好了bean定义
		//applicationContext.refresh();
		IndexDaoInterface indexDao = (IndexDaoInterface) applicationContext.getBean("indexDao");
		indexDao.query();
	}
}
