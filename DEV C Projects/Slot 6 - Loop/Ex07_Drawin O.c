#include <stdio.h>

// ((i == 0 || i == height - 1) && (j > 0 && j < width - 1) || (j == 0 || j == width - 1) && (i > 0 && i < height - 1))

// The condition is composed of two parts, separated by the "||": 
// * The first part checks if the current row is the first or last row and 
//   if the current column is not the first or last column.

// * The second part checks if the current column is the first or last column and 
//   if the current row is not the first or last row.

// If either of these two parts is true, it means that we are on the border of the shape 
// and should print an asterisk. 
// Otherwise, we are inside the shape and should print a space.
int main(){
    int height;
    int width;
    char x = '*';
    int i, j;
    
    printf("Enter height: ");
    scanf("%d", &height);
    printf("Enter width: ");
    scanf("%d", &width);
    
    for(i = 0; i < height; i++){
        for(j = 0; j < width; j++){
            if((i == 0 || i == height - 1) && (j > 0 && j < width - 1) || (j == 0 || j == width - 1) && (i > 0 && i < height - 1)){
                printf("%c", x);
            }
            else{
                printf(" ");
            }
        }
        printf("\n");
    }
    
    return 0;
}

