#include <stdio.h>

int isEvenNumber(int num);

int main(){
    int n, m;
    
    printf("Enter n: ");
    scanf("%d", &n);
    
    printf("Enter m: ");
    scanf("%d", &m);
    
	int i;
    for (i = n; i <= m; i++) {
        if(isEvenNumber(i) == 1){
        	printf("%d ", i);
		}
    }
}

int isEvenNumber(int num){
    if(num % 2 == 0){
        return 1;
    } else{
        return 0;
    }
}
