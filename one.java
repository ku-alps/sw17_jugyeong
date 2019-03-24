package Baekjoon;

import java.util.Scanner;

public class one {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		
		int number = scan.nextInt();
		int info[][] = new int[number][2];
		int rank[] = new int[number];
		
		for(int i=0; i<number; i++) {
			info[i][0] = scan.nextInt();	//¸ö¹«°Ô
			info[i][1] = scan.nextInt();	//Å°
			rank[i] = 1;
		}
		
		for(int i=0; i<number; i++) {
			for(int j=0; j<number; j++) {
				if(info[i][0]>info[j][0] && info[i][1]>info[j][1])
					rank[j]++;
			}
		}
		
		for(int i= 0; i<number; i++)
			System.out.print(rank[i]+" ");
		
	}
}
