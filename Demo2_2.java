package javajichu_10;

public class Demo2_2 {
//	求出最高分
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] db= {90,88,78,90,86,95,98,72};
		double leitai=db[0];
		for(int i=1;i<db.length;i++) {
			if(db[i]>leitai) {
				leitai=db[i];
			}
		}
		System.out.println("最大值为："+leitai);
	}

}
