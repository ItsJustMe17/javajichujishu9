package javajichu_10;

import java.util.Scanner;

public class Demo2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入班级人数：");
		int renshu=sc.nextInt();
		double[] scores=new double[renshu];
		int i=0;
		while(i<renshu) {
			System.out.println("请输入第"+(i+1)+"个学院的成绩：");
			scores[i]=sc.nextDouble();
			i++;
		}
		
		double sum=0;
		for(int j=0;j<scores.length;j++) {
			sum+=scores[j];
		}
		System.out.println("平均成绩是："+(sum/scores.length));
	}

}
