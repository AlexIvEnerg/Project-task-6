

public class ArrayTwoChar {
    public static void main(String[] args) {
	char[][] array = {{'a','b'},{'c','d'},
			{'i','f'},{'g','h'}};
	for(char[] arrSup : array) {
	    for(char elem : arrSup) {
		System.out.print(elem + " ");
	    }
	    System.out.println();
	}
    }
}