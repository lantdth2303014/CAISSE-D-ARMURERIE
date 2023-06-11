#include <stdio.h>

int main(){
	
	int num = 0;
	
	while (num <= 5){
		printf("%d\n", num);		
		num++;						// num++ so the program can finally reachs 5 and ends the program
	}								// else it would print an endless loop of 0
	
	return 0;
}
