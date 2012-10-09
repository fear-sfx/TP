public class HelloJava{
	private static int l;
	public static void main(String [] args){
		System.out.println( "Fuck U and have a nice day ! ^^" );
		int sum=0;
		for(int i=0; i<=100; i++){
			sum += i;
			l += i;
		}
		System.out.println(sum);

		int[] arr = new int[10];
		int k=0;
		for(int i=0; ; i++){
			if(i%2 == 0){
				arr[k] = i;
				k++;
			}
			if(k==10){
				break;
			}
		}

		for(int array:arr){
			System.out.println(array);
		}
	}
}
