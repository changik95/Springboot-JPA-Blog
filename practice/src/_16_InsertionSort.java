/*16. 삽입 정렬 알고리즘
삽입 정렬은 배열의 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여, 자신의 위치를 찾아 삽입함으로써 정렬을 완성하는 알고리즘이다.
{ 31, 25, 12, 22, 11 }
위와 같은 요소로 이루어진 배열을 선언하고 삽입 정렬 알고리즘을 통해 오름차순으로 정렬한 후 정렬된 배열의 요소를 출력하는 코드를 작성하시요.*/

public class _16_InsertionSort {
	public static void main(String[] args) {
		int[] array = { 31, 25, 12, 22, 11 };
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j = i - 1;
			for (;j >= 0 && array[j] > temp; j--) {
				array[j + 1] = array[j];
			}
			array[j + 1] = temp;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}