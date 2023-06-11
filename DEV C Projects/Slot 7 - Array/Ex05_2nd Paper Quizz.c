#include <stdio.h>
#include <conio.h>

int main(){
	
	int expenses[30];
	int i;
	int j = 0;
	int budget;
	int high;
	
	printf("Enter your budget: ");
	scanf("%d", &budget);
	
	
	for(i = 0; i < 30; i++){
		printf("Enter day %d: ", i+1);
		scanf("%d", &expenses[i]);			// change from i to expenses[i] to
		j += expenses[i];					// correctly store the user input for expenses in the expenses array
		
		if(i == 0){
			high = expenses[0];
		}
		else if(high < expenses[i]){
			high = expenses[i];
		}
	}
	
	if(budget < j){
		printf("Expenses exceed the budget!");
	}
	else{
		printf("Total monthly expenses is: %d\n", j);
		printf("Highest expenses is: %d", high);
	}
	
	getch();
	return 0;
}
