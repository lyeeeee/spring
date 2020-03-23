package liyi.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Repository;

/**
 * @program: spring
 * @description: ${description}
 * @author: liyi
 * @create: 2020-02-09 20:47
 */
@Repository("indexDao")
public class IndexDao implements IndexDaoInterface,BeanPostProcessor, ApplicationContextAware {
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("index dao" + beanName + "postProcessAfterInitialization");
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("index dao" + beanName + "postProcessBeforeInitialization");
		return bean;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext:" + applicationContext);
	}

	public void query(){
		System.out.println("IndexDao");
	}
}
