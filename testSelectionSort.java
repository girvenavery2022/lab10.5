mport static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class testSelectionSort {
	private SelectionSort temp1;
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}
	public testSelectionSort() {

	}
	public void testPositive() {
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;
		for(int i =0;i < arr.length;i++)
			assert arr[i]> 0;
		int[] sortedarr = new int[5];
		SelectionSort temp1 = new SelectionSort();
		sortedarr = temp1.basicSelectionSort(arr);
	}

	public void testNegative() {
		int[] arr = new int[5];
		arr[0] = -2;
		arr[1] = -7;
		arr[2] = -6;
		arr[3] = -1;
		arr[4] = -11;
		for(int i =0;i < arr.length;i++)
			assert arr[i]< 0;
		int[] sortedarr = new int[5];
		SelectionSort temp1 = new SelectionSort();
		sortedarr = temp1.basicSelectionSort(arr);
	}
  public void testMixed() {
    int[] arr = new int[6];
    arr[0] = -28;
    arr[1] = -2;
    arr[2] = 8;
    arr[3] = 1;
    arr[4] = -16;
    arr[5] = 5;
    int[] sortedarr = new int[6];
    SelectionSort temp1 = new SelectionSort();
    sortedarr = temp1.basicSelectionSort(arr);
  }
  public void testDuplicates() {
    int[] arr = new int[6];
    arr[0] = -11;
    arr[1] = 2;
    arr[2] = 11;
    arr[3] = 11;
    arr[4] = 11;
    arr[5] = 2;
    int[] sortedarr = new int[6];
    SelectionSort temp1 = new SelectionSort();
    sortedarr = temp1.basicSelectionSort(arr);
  }
}
