package com.util.test;

public class Test {
	public String name;
	protected int score;
	int age;

	public Test() {

	}

	public Test(String name, int score, int age) {
		this.name = name;
		this.score = score;
		this.age = age;
	}
	
	public void write() {
		System.out.println(name + " : " + score + " : " + age);
	}
}
