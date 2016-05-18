package com.classtest;

public class ChildStaticTest {

	private String name = "爱慕课";

	// 外部类中的show方法
	public void show() {
		// 定义方法内部类
		class MInner {
			int score = 83;

			public int getScore() {
				return score + 10;
			}
		}

		MInner mInner = new MInner();// 创建方法内部类的对象

		// 调用内部类的方法
		int newScore = mInner.getScore();

		System.out.println("姓名：" + name + "\n加分后的成绩：" + String.valueOf(newScore));
	}

	// 测试方法内部类
	public static void main(String[] args) {

		ChildStaticTest mo = new ChildStaticTest(); // 创建外部类的对象

		// 调用外部类的方法
		mo.show();
	}
}
