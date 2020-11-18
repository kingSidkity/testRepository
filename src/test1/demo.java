package test1;

/*
 * 排序
 * 	选择法：
 * 		从小到大，第一个与后面的数字对比，小的往前挪，
 * 		第二个与后面的数字对比，以此类推
 * 
 * */
public class demo {

	public static void main(String[] args) {
		int[] a = { 31, 42, 21, 50, 12, 60, 81, 74, 101, 93 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
		}
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}
	}
}
