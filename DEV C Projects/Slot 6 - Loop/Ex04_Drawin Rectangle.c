#include <stdio.h>
#include <conio.h>

// The conditions control the number of iterations of the for loops.

// The outer for loop iterates over the rows of the rectangle.
// The condition i < height ensures that the outer loop runs for height iterations.

// The inner for loop iterates over the columns of the rectangle.
// The condition j < width ensures that the inner loop runs for width iterations.

int main(){
    
    int i;
    int j;
    int width;
    int height;
    char x = '*';
    
    printf("Enter height: ");
    scanf("%d", &height);
    printf("Enter width: ");
    scanf("%d", &width);
    
    for(i = 0; i < height; i++){									// i & j < height & width cuz i & j start from 0
        for(j = 0; j < width; j++){
        	if(i > 0 && i < height - 1 && j > 0 && j < width - 1){  // Technically printin a smaller rectangle inside
        		printf(" ");										// But instead of "*" it's a rectangle of " "
			}														// The "if" statement checks if current row and  
			else{													// column are not on the border of the rectangle
				printf("%c", x);
			}	
        }
        printf("\n");
    }
    
    return 0;
}
