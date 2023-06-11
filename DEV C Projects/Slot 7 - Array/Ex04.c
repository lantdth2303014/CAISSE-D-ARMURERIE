#include <stdio.h>
#include <conio.h>

int main(){
	
	int arr[100];
	int n1;
	int n2;
	int res = 0;
	
	
	printf("Enter n1 (1-100): ");
	scanf("%d", &n1);
	printf("Enter n2 (1-100): ");
	scanf("%d", &n2);
	
	printf("Even numbers from %d to %d is: ", n1, n2);
	
	int i;
	int j = 0;
	for(i = n1; i <= n2; i++){			// the value of i is assigned to the j-th element of the "arr" array
										
		if(i % 2 == 0){
			j = arr[i];
			j++;
			printf("%d, ", i);
		}
		else
			res +=i;
	}
	
	printf("\n");
	printf("Sum of all odd numbers in range is %d", res);
	
	getch();
	return 0;
	}
	

