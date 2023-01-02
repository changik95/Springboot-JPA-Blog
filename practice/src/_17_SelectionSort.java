/*17. 선택 정렬 알고리즘
선택 정렬은 우선 배열의 요소 중 가장 작은 값을 찾아서 배열의 맨 앞에 위치시킨 후, 그 다음 두 번째로 작은 값을 찾아서 배열의 두 번째에 위치시킨다. 선택 정렬은 이와 같은 방식을 반복하여 정렬하는 알고리즘이다.
{ 9, 1, 6, 8, 4, 3, 2, 0 }
위와 같은 요소로 이루어진 배열을 선언하고 선택 정렬 알고리즘을 통해 오름차순으로 정렬한 후 정렬된 배열의 요소를 출력하는 코드를 작성하시요.*/

public class _17_SelectionSort {
	public static void main(String[] args) {
		int[] array = { 9, 1, 6, 8, 4, 3, 2, 0 };
		for (int i = 0; i < array.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}