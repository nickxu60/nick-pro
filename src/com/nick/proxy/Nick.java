package com.nick.proxy;

public class Nick implements Person{
	
	private String name = "nick";
	
	private String sex = "male";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int age = 26;
	
	@Override
	public void findLove() {
		System.out.printf("我叫"+name+"今年"+age+"岁","我要找对象");
		System.out.println("\n female");
		System.out.println("160cm");
		System.out.println("D-cup");
	}
	//你就是2，真的有点2
}
