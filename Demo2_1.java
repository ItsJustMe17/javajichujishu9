package javajichu_10;

import java.util.Scanner;

public class Demo2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("������༶������");
		int renshu=sc.nextInt();
		double[] scores=new double[renshu];
		int i=0;
		while(i<renshu) {
			System.out.println("�������"+(i+1)+"��ѧԺ�ĳɼ���");
			scores[i]=sc.nextDouble();
			i++;
		}
		
		double sum=0;
		for(int j=0;j<scores.length;j++) {
			sum+=scores[j];
		}
		System.out.println("ƽ���ɼ��ǣ�"+(sum/scores.length));
	}

}
