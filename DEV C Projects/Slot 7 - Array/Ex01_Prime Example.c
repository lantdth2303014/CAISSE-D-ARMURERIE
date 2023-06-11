#include <stdio.h>

// This program reads 10 integer values from the standard input using the scanf function 
// and stores them in an array ary. 
// After all 10 values are entered, the program finds the highest value among them and displays it.

int main(){
	
	int arr[10];
	int i, min, max, total = 0, avg = 0;
	
	printf("Please enter 10 values: \n");
	
	for(i = 0; i < 10; i++){
		scanf("%d", &arr[i]);                   // ary[i] is used to access the i-th element, the entered integer value is stored in the ary array at index i
		
		total += arr[i];						// += arr[i] adds the value of the i-th element to the value of total
		avg = total/10;
	}											
	
	
	
	// Display maxest of the entered values
	
	max = arr[0];								// max is initialized to the first element of the arr array
	min = arr[0];
	
	for(i = 1; i < 10; i++){					// then enters a for loop that iterates from 1 to 9,
		if(arr[i] > max){						// then checks if the value of arr[i] 
			max = arr[i];						// is greater than the current value of max
		}
		else if(arr[i] < min){
			min = arr[i];
		}
	}											// the variable max now contains the maxest value in the arr array.
	
	
	
	printf("\nHighest value entered is %d", max);
	printf("\nLowest value entered is %d", min);
	printf("\nTotal is: %d", total);
	printf("\nAverage is: %d", avg);
	
	return 0;
}
