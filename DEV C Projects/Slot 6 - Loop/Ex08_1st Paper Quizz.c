#include <stdio.h>
#include <conio.h>

// Ex08 = a program to do 2 main task based on the following conditions (using for loop)

//        + values are in the range of n1 to n2 (user inputs)
//		  + 1st main task: print out all even numbers in the custom range
//        + 2nd main task: sum all odd numbers in the custom range 

int main(){
	
	int n1;
	int n2;
	int res = 0;
	
	printf("Enter n1: ");
	scanf("%d", &n1);
	printf("Enter n2: ");
	scanf("%d", &n2);
	
	printf("Even numbers from %d to %d is: ", n1, n2);
	
	int i;
	for(i = n1; i <= n2; i++){
		
		if(i % 2 == 0){
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
	

