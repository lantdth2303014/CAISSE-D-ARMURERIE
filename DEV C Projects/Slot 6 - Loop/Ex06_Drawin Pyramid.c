#include <stdio.h>

// j = For example, if height is 5, then on the first row (when i is 0), 
//     Spaces before the asterisks = height - i - 1 = 5 - 0 - 1 = 4. 
//	   On the second row (when i is 1), spaces = height - i - 1 = 5 - 1 - 1 = 3, and so on.

// k = For example, if height is 5, then on the first row (when i is 0), 
//     Total asterisks =  2 * i + 1 = 2 * 0 + 1 = 1. 
//     On the second row (when i is 1), total asterisks = 2 * i + 1 = 2 * 1 + 1 = 3, and so on.

int main(){
    int height;
    char x = '*';
    int i, j, k;
    
    printf("Enter height: ");
    scanf("%d", &height);
    
    for(i = 0; i < height; i++){                  // Iterates over the rows of pyramid (aka height)
        for(j = 0; j < height - i - 1; j++){	  // Add spaces (" ") before the "*"
            printf(" ");
        }
        for(k = 0; k < 2 * i + 1; k++){			  // Iterates over the "*" in each row.
            printf("%c", x);
        }
        printf("\n");
    }
    
    return 0;
}
