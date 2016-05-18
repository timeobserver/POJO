package com.classtest;

public class StaticTest {
	int stuNo;
	String stuName;

	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	{
		System.out.println("这里是外部类");
		stuNo = 1;
		stuName = "小王";
	}

	void print() {
		System.out.println("这是外部类");

	}

	/**
	 * 调用成员内部静态类无需实例化外部类,实例化外部类之后调用不到内部类
	 * 
	 * @author 陈国栋
	 *
	 */
	 class InnerClass {
		int classId;
		String className;

		void print() {
			System.out.println("这是内部类");
		}

		{
			System.out.println("正在初始化变量值");
			classId = 2;
			className = "小李";
		}

		public String getClassName() {
			return className;
		}

		public void setClassName(String className) {
			this.className = className;
		}

		public int classId() {
			return classId;
		}

		public void setClassId(int classId) {
			this.classId = classId;
		}

		public int getClassId() {
			return classId;
		}
	}

	public static void main(String[] args) {
		StaticTest staticTest = new StaticTest();
//		InnerClass innerClass = new InnerClass();  //调用静态内部类
		InnerClass innerClass = staticTest.new InnerClass();  //调用非静态内部类
		innerClass.print();
		staticTest.print();
		System.out.println(staticTest.getStuNo());
		System.out.println(staticTest.getStuName());
		System.out.println(innerClass.getClassId());
		System.out.println(innerClass.getClassName());

	}

}
