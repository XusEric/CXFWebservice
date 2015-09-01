
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import com.java.entity.User;
import com.java.service.UserServiceImpl;

public class UnitTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
//		User obj=(User) Class.forName(User.class.getName()).newInstance();
//		//利用反射机制，生成setXX()方法的Method对象并执行该setXX()方法。   
//		Object value=(Object)333;
//        Method method=obj.getClass().getMethod("setId", value.getClass());   
//        method.invoke(obj, value);
        
		UserServiceImpl u=new UserServiceImpl();
		List<User> o=u.getUserList("eeee");
		for(User tmp:o){
            System.out.println("result,id:"+tmp.getId()+",name:"+tmp.getName());
        }
	}

}
