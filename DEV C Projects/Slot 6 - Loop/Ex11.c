#include <stdio.h>

int main(){
	
	int n1;
	int n2;
	int sum = 0;
	
	printf("Enter 2 numbers: ");							
	scanf("%d %d", &n1, &n2);
	
	do{
		sum = n1 + n2;
		printf("The sum is: %d\n", sum);
		
		printf("Enter 2 numbers (or enter 0 to exit): ");
		scanf("%d %d", &n1, &n2);
	} while (n1 != 0 && n2 != 0);
	
	return 0;
}
