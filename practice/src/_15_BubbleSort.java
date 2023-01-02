/*15. 버블 정렬 알고리즘
버블 정렬은 배열에서 인접한 두 원소의 크기를 비교하여 순서에 맞게 정렬하는 알고리즘을 말한다. 일반적으로 첫 번째 요소부터 시작해서, 첫 번째 요소의 크기와 두 번째 요소의 크기를 비교하여 미리 정한 오름차순 또는 내림차순 순서에 따라 두 요소가 순서에 맞지 않게 위치한 경우 서로 교환한다. 이후 두 번째 요소와 세 번째 요소 또한 마찬가지의 작업을 거치며 이와 같은 작업을 마지막 요소까지 반복해서 수행한다.
{ 5, 3, 7, 2, 11 }
위와 같은 요소로 이루어진 배열을 선언하고 버블 정렬 알고리즘을 통해 오름차순으로 정렬한 후 정렬된 배열의 요소를 출력하는 코드를 작성하시요.*/

public class _15_BubbleSort {
	public static void main(String[] args) {
		int[] array = { 5, 3, 7, 2, 11 };
		for (int i = array.length; i > 0; i--) {
			for (int j = 1; j < i; j++) {
				if (array[j] < array[j - 1]) {
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}