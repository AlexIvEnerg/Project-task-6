import java.util.Scanner;
import java.util.Arrays;

public class GarlandWithArray {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	byte[][] array = {{1,1,0,1,0,0,1,0},{1,0,0,1,1,0,1,1},
			{0,0,1,0,1,1,0,1},{0,1,1,0,0,1,0,1}};    // int g = 0b11010010_10011011_00101101_01100101;
	System.out.println(Arrays.deepToString(array));
	System.out.print("Введите целое число, от 1 до 4: ");
	int Num = scanner.nextInt();
	switch(Num) {
	    case 1:
		byte[][] Opp = blink(array); 
		for(int i=0; i<10; i++) {
		    System.out.println(Arrays.deepToString(Opp));
		    Opp = blink(Opp);
		}    
		break;
	    case 2:
		isFirstLampOn(array[3]);
		break;
	    case 3:
		byte[] Run = new byte[8];
		for(int i=0; i<10; i++) {
		    for(int g=0; g<array.length; g++) {
			Run = run(array[g]);
			System.out.print(Arrays.toString(Run) + " ");
		    }
		    System.out.println();
		}
		break;
   	    case 4:
		System.out.println(Arrays.deepToString(array));
		break;
	    default:
		System.out.println("Неправильно введено число");
		break;
	}	
    }

    public static byte[][] blink(byte[][] arr) {    //  мигание
	for(int i=0; i<arr.length; i++) {	
	    for(int g=0; g<arr[i].length; g++) {		
		arr[i][g] = arr[i][g]==0 ? (byte)1 : (byte)0;
	    }
	}
	return arr;
    }

    public static byte[] run(byte[] arr) {     //  бегущая строка
	System.arraycopy(arr, 0, arr, 1, 7);
	arr[0] = arr[1]==0 ? (byte)1 : (byte)0;
	return arr;
    }	  
    
    public static void isFirstLampOn(byte[] arr) {    //  проверка первой лампочки
    	String s = (arr[7] & 1) == 0 ? "First lamp is not lights" : "First lamp is lights";
	System.out.println(s);
    }
}

















