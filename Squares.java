// Quiz 1 Program 3
public class Squares {

    public static void main(String[] args) {
	
		int i=4;
		System.out.println();
		System.out.println("Using counter-controlled while-loop");
		System.out.println("Original and Squared Numbers");
		while (i <= 10)
		{
			System.out.printf("%d %d\n",i,i*i);
			i++;
		}
		
		System.out.printf("\n\n");
		System.out.println("Using for-loop");
		System.out.println("Original and Squared Numbers");
		for(i=10;i>=4;i--){
			System.out.printf("%d %d\n",i,i*i);
		}
	}
}