package com.java.iservice;

import java.util.List;

import javax.jws.WebParam;  
import javax.jws.WebService;  
import javax.jws.soap.SOAPBinding;  
import javax.jws.soap.SOAPBinding.Style; 
import com.java.entity.User; 

@WebService  
@SOAPBinding(style = Style.RPC)  
public interface IUserService {
	public User getUserByName(@WebParam(name = "name") String name);  
	  
    public void setUser(User user);  

	public  List<User> getUserList(@WebParam(name = "name") String name);  
}
