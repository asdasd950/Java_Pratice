

//一個整數陣列中有正數,負數與 0. 請寫一程式找出這個陣列中連續的元素的和的最大值。
import java.util.*;

public class Ex13 {
	public static void main(String args[]) {

		int ary[] = { 1, -2, 3, 10, -4, 7, 2, -5 };
		System.out.println(findMax(ary));

	}

	public static int findMax(int ary[]) {
		if (ary.length == 0) {
			return 0;
		}

		int max = ary[0];
		int sum = 0;

		for (int i = 0; i < ary.length; i++) {

			if (sum >= 0) {
				sum += ary[i];
			} else {
				sum = ary[i];
			}
			if (sum > max) {
				max = sum;
			}
		}
		return max;
	}
}