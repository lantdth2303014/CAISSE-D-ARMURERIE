#include <stdio.h>

// Program to print out A to Z in uppercase

int main(){
	
	char alpha[26];
	int i, j = 0;
	
	for(i = 65; i < 91; i++, j++){						// the value of i is assigned 
		alpha[j] = i;									// to the j-th element of the "alpha" array
		printf("The character is %c \n", alpha[j]);
	}
	
	// In more detail, the for loop has three expressions separated by semicolons. 
	
	// The first expression i = 65, j = 0 initializes the values of i and j to 65 and 0 respectively. 
	
	// The second expression i < 91 is the condition for the loop to execute. 
	// As long as this condition is true, the loop will continue to execute. 
	
	// The third expression i++, j++ is executed after each iteration of the loop and increments the values of i and j
	
	return 0;
}
