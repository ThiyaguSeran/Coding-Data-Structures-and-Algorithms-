import java.util.ArrayList;

public class Walmart2 {

	public static void call(int start, int sum, int[] a, ArrayList<Integer> result) {
		System.out.println(start);
		
		if (sum == 0) {
			System.out.println(result);
			return;

		}else if(sum<0){
			return;
		}
		
		for (int i = 0; i < a.length; i++) {
			result.add(a[i]);
			if (sum - a[i] >= 0) {
				call(i + 1, sum - a[i], a, result);
			}
			result.clear();
		}
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 2, 3, 7, 8, 5 };
		int sum = 10;

		int aLen = a.length;

		call(0, sum, a, new ArrayList<Integer>());

	}

}
