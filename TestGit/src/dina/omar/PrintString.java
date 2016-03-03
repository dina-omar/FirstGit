package dina.omar;

public class PrintString {
	
	public static void print(String tobrint){
		System.out.println(tobrint);
	}

public static void countAndPrint(int[] values){
		
		System.out.println("Count of the array is " + values.length);
		
		for(int i = 0 ; i <values.length ; i++){
			System.out.println(values[i]+ "\n");
		}
	}
}
