package com.classtest;

public class ChildStaticTest {

	private String name = "��Ľ��";

	// �ⲿ���е�show����
	public void show() {
		// ���巽���ڲ���
		class MInner {
			int score = 83;

			public int getScore() {
				return score + 10;
			}
		}

		MInner mInner = new MInner();// ���������ڲ���Ķ���

		// �����ڲ���ķ���
		int newScore = mInner.getScore();

		System.out.println("������" + name + "\n�ӷֺ�ĳɼ���" + String.valueOf(newScore));
	}

	// ���Է����ڲ���
	public static void main(String[] args) {

		ChildStaticTest mo = new ChildStaticTest(); // �����ⲿ��Ķ���

		// �����ⲿ��ķ���
		mo.show();
	}
}
