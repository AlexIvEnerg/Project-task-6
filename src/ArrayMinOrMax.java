import java.util.Arrays;

public class ArrayMinOrMax {
    public static void main(String[] args) {
	int[][] array = {{4, 6, 8, 10, 12, 14, 16, 18},
			{3, 5, 7, 9, 11, 13, 15, 17},
			{20, 22, 24, 26, 28, 30, 32, 34},
			{19, 21, 23, 25, 27, 29, 31, 33},
			{35, 37, 39, 41, 43, 45, 47, 49}};
	
	int[][] arrayMinOrMax = new int[5][2];
	
	for (int i=0; i<5; i++) {
	    int[] arraySup = array[i];
	    Arrays.sort(arraySup);
	    arrayMinOrMax[i][0] = arraySup[0];
	    arrayMinOrMax[i][1] = arraySup[7];
	}
	
	System.out.println(Arrays.deepToString(arrayMinOrMax));
    }
}
