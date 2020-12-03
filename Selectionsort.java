public class SelectionSort {
	private int temp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public SelectionSort() {

	}
    /* A simple SelectionSort algorithm
      * pre-condition:
      *  * post-condition:
      *  * inputs:
      *  * outputs:
      *  * special conditions:
      *  */
	public int[] basicSelectionSort(int[] x) {
		for(int i = 0; i < x.length;++i) {
			int index = i;
			for(int j = i+1; j < x.length;++j) {
				if(x[j]<x[index]) {
					index = j;
				}
				temp = x[index];
				x[index] = x[i];
				x[i] = temp;
			}
		}
		return x;
	}

}
