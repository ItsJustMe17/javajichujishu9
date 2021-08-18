package javajichu_10;

public class Demo2_3 {
//	现在有一组数据{16,25,9,90,23}，请编程对其进行排序 
//	从小到大的升序排列
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] it= {16,25,9,90,23};
		for(int i=0;i<it.length-1;i++) {
			for(int j=0;j<it.length-1-i;j++) {
				if(it[j]>it[j+1]) {
					int temp=it[j];
					it[j]=it[j+1];
					it[j+1]=temp;
				}
			}
		}
		for(int i:it) {
			System.out.println(i+"\t");
		}
	}

}
