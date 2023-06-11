#include <stdio.h>
#include <conio.h>

// Subjects:
// * Math								 
// * English							 
// * Computer Sience					

// Percentage --------------------- Grade
// >= 90							 S+
// 80 -< 90							 S
// 70 -< 80							 A+
// 60 -< 70							 A
// 50 -< 60							 B
// < 50								 FAIL

int main(){
	
	
	float per, math, eng, ict = 0.0;
	
	printf("Plis enter the final mark for Math: ");
	scanf("%f", &math);
	printf("Plis enter the final mark for English: ");
	scanf("%f", &eng);
	printf("Plis enter the final mark for Computer Sience: ");
	scanf("%f", &ict);
	
	per = (math + eng + ict) / 3;
	

	if(per >= 90){
		printf("Your Final mark is: S+");
	}
	else if(per >= 80 && per <= 90){
		printf("Your Final mark is: S");
	}
	else if(per >= 70 && per <= 80){
		printf("Your Final mark is: A+");
	}
	else if(per >= 60 && per <= 70){
		printf("Your Final mark is: A");
	}
	else if(per >= 50 && per <= 60){
		printf("Your Final mark is: B");
	}
	else if(per < 50){
		printf("You have to retake the exam...");
	}
	

	getch();
	return 0;		
	
}
