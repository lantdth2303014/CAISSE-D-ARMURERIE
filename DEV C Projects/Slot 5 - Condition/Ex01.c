#include <stdio.h>
#include <conio.h>
/*
This program declares three variables: 
two integers x and y, and a character a. 
The value of a is initialized to 'y', 
while x and y are both initialized to 0.

The program then uses an if statement to test the value of a is equal to 'y'. 
Since this condition is true, the code block following the if statement is executed.
 
This block of code increments the value of x by 5 using the += operator, 
and then prints the values of x and y using the printf function. 
*/
void main(){
	
	int x, y;
	char a = 'y';
	x = y = 0;
	
	if (a == 'y'){
		x += 5;
		printf("The numbers are \t%d and %d", x, y); // \t is literally a 'tab' added to %d
	}

	getch();
}
