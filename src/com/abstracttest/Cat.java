package com.abstracttest;

public class Cat extends Animal implements Action {

	@Override
	public void syshello() {
		// TODO Auto-generated method stub
		System.out.println("’‚ «Cat");
		super.syshello();

	}

	class A {
		public A() {
			System.out.println("A");
		}
	}

	public static void main(String args[]) {

		Animal animal = new Cat();
		animal.syshello();

	}

}
