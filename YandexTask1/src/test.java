import java.util.Scanner;

class test {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); // Количество букв
		input.nextLine();
		String s = input.nextLine(); // Буквы, которые он ввёл
		int indexOfMax = 0;
		char answer;
		
		int array1[] = new int[n];
		for (int i = 0; i < n; i++) {
			array1[i] = input.nextInt();
		}
		
		int array2[] = new int[n];
		array2[0] = Math.abs(0 - array1[0]);

		for (int j = 1; j < n; j++) {
			array2[j] = Math.abs(array1[j - 1] - array1[j]);
		}
		
		for (int i = 1; i < n; i++) {
			if (array2[i] >= array2[indexOfMax]) {
				indexOfMax = i;
			}
		}
			
		answer = s.charAt(indexOfMax);
		System.out.print(answer);
		
	}
}



