import java.util.Arrays;

public class ArrayTwoString {
    public static void main(String[] args) {
	String[][] array2 = new String[3][6];	
	array2[0] = new String[]{"a1", "a2", "a3", "a4", "a5", "a6"};
	array2[1] = new String[]{"b1", "b2", "b3", "b4", "b5", "b6"};
	array2[2] = new String[]{"c1", "c2", "c3", "c4", "c5", "c6"};
	System.out.print(Arrays.deepToString(array2));
    }
}