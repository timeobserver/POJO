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
		System.out.println("�������ⲿ��");
		stuNo = 1;
		stuName = "С��";
	}

	void print() {
		System.out.println("�����ⲿ��");

	}

	/**
	 * ���ó�Ա�ڲ���̬������ʵ�����ⲿ��,ʵ�����ⲿ��֮����ò����ڲ���
	 * 
	 * @author �¹���
	 *
	 */
	 class InnerClass {
		int classId;
		String className;

		void print() {
			System.out.println("�����ڲ���");
		}

		{
			System.out.println("���ڳ�ʼ������ֵ");
			classId = 2;
			className = "С��";
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
//		InnerClass innerClass = new InnerClass();  //���þ�̬�ڲ���
		InnerClass innerClass = staticTest.new InnerClass();  //���÷Ǿ�̬�ڲ���
		innerClass.print();
		staticTest.print();
		System.out.println(staticTest.getStuNo());
		System.out.println(staticTest.getStuName());
		System.out.println(innerClass.getClassId());
		System.out.println(innerClass.getClassName());

	}

}
