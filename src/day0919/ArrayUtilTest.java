package day0919;

public class ArrayUtilTest {

	public static void main(String[] args) {
		
		//int 배열을 double 배열로 변환
		int[] arrayInt = {10, 20, 30, 40, 50};
		double[] arrayDouble = ArrayUtil.intToDouble(arrayInt);
		
		for(int i = 0; i < arrayDouble.length ; i++){
			System.out.println(arrayDouble[i]);
		}
		
		System.out.println();
		
		//double 배열을 int 배열로 변환
		double[] arrayDouble2 = {10.0, 20.0, 30.0, 40.0, 50.0};
		int[] arrayInt2 = ArrayUtil.doubleToInt(arrayDouble2);
		
		for(int i = 0; i < arrayInt2.length ; i++){
			System.out.println(arrayInt2[i]);
		}
		
		for(int i : arrayInt2){
			System.out.println(i);
		}
		
		System.out.println();
		
		//int 배열 두 개를 연결한 새로운 배열 리턴
		
		int[] a = {};
		int[] b = {110, 120, 130, 140, 150};
		int[] arraySum = ArrayUtil.arraySum(a, b);
		
		for(int i : arraySum){
			System.out.println(i);
		}
	}

}
