package liyi.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Proxy;

/**
 * @program: spring
 * @description: ${description}
 * @author: liyi
 * @create: 2020-02-09 20:47
 */
public class IndexDao3 implements  BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		IndexDaoInterface proxy = null;
		if(beanName.equals("indexDao")){
			proxy = (IndexDaoInterface) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{IndexDaoInterface.class},
					new InDexDaoInterceptor(bean));
		}
		return proxy ;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}
}
