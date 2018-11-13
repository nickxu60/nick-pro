package com.nick.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Meipo implements InvocationHandler {
	
	private Person target;
	
	
	public Object getInstance(Person p) {
		this.target = p;
		Class clazz = p.getClass();
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		
		return null;
	}

}
