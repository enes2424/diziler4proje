import java.util.Arrays;

public class PatikaProje {

	public static void main(String[] args) {
		int[] array = {5, 6, 3, 5, 9, 2, 8, 4, 3, 2, 7, 0, 0, 4, 4, 4, 8};
		int[] array2 = {};
		int a;
		
		for (int i = 0; i < array.length - 1; i++) {
			a = 0;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] % 2 == 0 && array[i] == array[j]) {
					for (int k : array2) {
						if (k == array[i]) a = 1;
					}
					if (a == 1) break;
					array2 = Arrays.copyOf(array2, array2.length + 1);
					array2[array2.length - 1] = array[i];
				}
			}
		}
		
		Arrays.sort(array2);
		
		System.out.println(Arrays.toString(array2));
	}

}
