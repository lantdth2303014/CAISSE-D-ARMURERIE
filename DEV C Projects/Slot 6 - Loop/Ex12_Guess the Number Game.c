#include <stdio.h>
#include <stdlib.h>                      // required library for random num generator
#include <time.h>						 // required lib for randomizing the seed for the rand num generator

int main(){
	
	int num;
	int guess;
	
	srand(time(0)); 					// Seed the random number generator with the current time
	num = rand() % 100;					// num is randomized
	
	printf("Enter your guess: ");
	scanf("%d", &guess);
	
	do{
		if (guess >= num){
			printf("Too high! \n");
		}
		else 
      		printf("Too low! \n");
			
	printf("Enter your guess: ");
	scanf("%d", &guess);
	
	} while (guess != num);				// if guess != num, the loop will loop itself till guess == num
	
	printf("Congrats! You have guessed the right number!");
	return 0;
}
