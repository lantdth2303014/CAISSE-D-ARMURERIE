#include <stdio.h>
#include <conio.h>

int main(){
	
    int height;
    char x = '*';
    
    printf("Enter height: ");
    scanf("%d", &height);
    
	int i;
	for(i = 0; i < height; i++){
		int j;
		for(j = 0; j <= i; j++){
			if(i > 0 && i < height -1 && j > 0 && j < i){	// A smaller triangle drawn from " "
				printf(" ");								// and this triangle is drawn by removin the border of OG
			}												
			else{
				printf("%c", x);
			}
			
		}
		printf("\n");
	}
}
