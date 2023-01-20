package Multidiamentioal_array;

public class String_mulltidiamentional {// ULC
	public static void main(String[] args) {
		String ar[][]=new String [2][2];
		ar[0][0]="Nikhil";
		ar[0][1]="Tapase";
		ar[1][0]="Swapnil";
		ar[1][1]="Tapase";
		
		System.out.println();
		for(int i=0;i<=1;i++) {
			for(int j=0;j<=1;j++) {
		System.out.print(ar[i][j]+" ");
		}
		System.out.println();
		}
		
	}

}
