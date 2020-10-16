import java.util.Arrays;
public class Array6{
	public static void main(String[] args) {

	// @author Syafrinadyah (H76219033)	
		// operasi fill array latihan4
		int[] angka1 = {101,102,103,104,105,106};
		int[] angka2 = new int[8];
		printArray(angka2);
		Arrays.fill(angka2,4);
		printArray(angka2);
	}
	private static void printArray(int[] dataArray){
	System.out.println("array = " + Arrays.toString(dataArray));
}}


