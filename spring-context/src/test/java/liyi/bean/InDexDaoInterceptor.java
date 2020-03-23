package liyi.bean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: spring
 * @description: ${description}
 * @author: liyi
 * @create: 2020-02-10 22:11
 */
public class InDexDaoInterceptor implements InvocationHandler {
	private  Object target;

	public InDexDaoInterceptor(Object target){
		this.target = target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("proxy");
		return method.invoke(target,args);
	}
}
