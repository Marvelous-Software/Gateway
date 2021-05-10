//https://www.thecrazyprogrammer.com/2017/02/c-c-program-find-inverse-matrix.html

#include<stdio.h>
 
int main(){
	int a[][3] = {{3, 2, -1}, {-1, 3, 2}, {1, -1, -1}};
    int i, j;
	float determinant = 0;
	
	printf("\nGiven matrix is:");
	for(i = 0; i < 3; i++){
		printf("\n");
		
		for(j = 0; j < 3; j++)
			printf("%d\t", a[i][j]);
	}
	
	//finding determinant
	for(i = 0; i < 3; i++)
		determinant = determinant + (a[0][i] * (a[1][(i+1)%3] * a[2][(i+2)%3] - a[1][(i+2)%3] * a[2][(i+1)%3]));
	
	printf("\n\ndeterminant: %f\n", determinant);
	
	printf("\nInverse of matrix is: \n");
	for(i = 0; i < 3; i++){
		for(j = 0; j < 3; j++)
			printf("%.2f\t",((a[(j+1)%3][(i+1)%3] * a[(j+2)%3][(i+2)%3]) - (a[(j+1)%3][(i+2)%3] * a[(j+2)%3][(i+1)%3]))/ determinant);
		
		printf("\n");
	}
 
   return 0;
}