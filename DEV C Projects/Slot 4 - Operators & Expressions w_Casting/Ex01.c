#include <stdio.h>
#include <conio.h>

void main()
{
printf("The number 555 in various forms:\n");
printf("Without any modifier: \n");
printf("[%d]\n",555);

// The data item will be left-justified within its field, the item 
// will be printed from the leftmost position of its field
printf("With - modifier :\n");
printf("[%-d]\n",555);

// Add string of nothing with the length of 10
printf("With digit string 10 as modifier :\n");
printf("[%10d]\n",555);

// Used to add leading zeros to the output
printf("With 0 as modifier : \n");
printf("[%0d]\n",555);

// Add 10 leading 0 to the output
printf("With 0 and digit string 10 as modifiers :\n");
printf("[%010d]\n",555);

// A clearer example for - modifier
printf("With -, 0 and digit string 10 as modifiers: \n");
printf("[%-010d]\n",555);

getch();
// return 0; (well the function is returning void so this is not needed)
}
