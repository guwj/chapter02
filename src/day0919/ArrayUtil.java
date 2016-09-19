package day0919;

public class ArrayUtil {
	public static double[] intToDouble(int[] a) {
		if (a == null) {
			return null;
		}

		int length = a.length;
		double[] result = new double[length];

		for (int i = 0; i < length; i++) {
			result[i] = a[i];
		}

		return result;
	}

	public static int[] doubleToInt(double[] a) {
		if (a == null) {
			return null;
		}

		int[] result = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			result[i] = (int) a[i];
		}

		return result;
		
		

	}

	public static int[] arraySum(int a[], int b[]) {
		int length = a.length + b.length;
		int[] result = new int[length];

		if (a == null && b == null) {
			return null;
		}

		if (a == null) {
			for (int i = 0; i < b.length; i++) {
				result[i] = b[i];
			}
		} else if (b == null) {
			for (int i = 0; i < a.length; i++) {
				result[i] = a[i];
			}
		} else {
			for (int i = 0; i < a.length; i++) {
				result[i] = a[i];
			}
			for(int i = a.length ; i < length ; i++){
				result[i] = b[i-a.length];
			}
			//내꺼는 더 복잡하고 두번 째 배열 안들어옴..
		}
		
		return result;
		
		/* int length1 = ( a == null ) ? 0 : a.length;
		   int length2 = ( b == null ) ? 0 : b.length;
		   
		   int length = length1 + length2;
		   int[] result = new int[length];
		   
		   int index = 0;
		   for(int i = 0; i < length1; i++){
		   	result[index++] = a[i];
		   }
		   
		   for(int i = 0; i < length1; i++){
		   	result[index++] = b[i];
		   }
		   
		   return result;
		 */
	}
}
