package util;

import java.util.Scanner;
/**
 * Demo class
 * 
 * @author Leo
 * @date 2020/03/14
 */

public class Fe {

	static int[][] maze;

	static int n;

	static int min;

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		min = n*n;

		maze = new int[n][n];

		for(int i=0;i<n;i++) { 
		for(int j=0;j<n;j++) {  

				maze[i][j] = sc.nextInt();

		recursion(1, 1, 0);

		}if
			(min==n*n)

			System.out.println("No solution");
		
		else {

			System.out.println(min);
	      }
		}
	 }
	public static void recursion(int x, int y, int count) {
		 int a=2;
		if(x==n-a && y==n-a) {

			min = Math.min(count, min);

		}else {

			maze[x][y]=1;

			if(y<n-1 && maze[x][y+1]==0) {

				recursion(x, y+1, count+1);			

			}

			if(x<n-1 && maze[x+1][y]==0) {

				recursion(x+1, y, count+1);			

			}

			if(x>1 && maze[x-1][y]==0) {

				recursion(x-1, y, count+1);			

			}

			if(y>1 && maze[x][y-1]==0) {

				recursion(x, y-1, count+1);			

			    }
			 {
	                if(x+1==maze.length){
	                    System.out.println("数组将溢出:X="+(x+1)+",y="+(y));
	                }
	                recursion(x+1,y,count+1);
	            }
			

			maze[x][y]=0;

		}

	}

}
