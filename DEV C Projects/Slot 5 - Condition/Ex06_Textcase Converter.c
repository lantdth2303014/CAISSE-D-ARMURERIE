#include <stdio.h>
#include <conio.h>

// To convert an uppercase character to lowercase

void main(){
 
	char c;
 
	printf("Please enter a character : ");
	scanf("%c",&c);
 
	if (c >= 'A' && c <= 'Z'){
		printf("Lowercase character = %c", c + 'a' - 'A'); // In ASCII codes: 'a' - 'A' = 32
	}
	else if(c >= 'a' && c <= 'z'){
		printf("Uppercase character = %c", c + 'A' - 'a'); // In ASCII codes: 'A' - 'a' = -32
	}
	else{
		printf("Input entered is not a character");
	}
 
	getch();
}
