
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.java.entity.User;
import com.java.service.UserServiceImpl;

public class UnitTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		User obj=(User) Class.forName(User.class.getName()).newInstance();
		//���÷�����ƣ�����setXX()������Method����ִ�и�setXX()������   
		Object value=(Object)333;
        Method method=obj.getClass().getMethod("setId", value.getClass());   
        method.invoke(obj, value);
        
		UserServiceImpl u=new UserServiceImpl();
		Object o=u.getUserList("22222");
	}

}
