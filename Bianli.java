package javajichu_10;

public class Bianli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] db= {90,88,78,90,86,95,98,72};
		double sum=0;
		for(double item:db) {
			sum+=item;
		}
		System.out.println("平均成绩为："+sum/db.length);
	}

}
