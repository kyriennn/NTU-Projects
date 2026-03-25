#include <stdio.h>
#include <math.h>
void dectoBinary(int num);
int main()
{
/* Write your code here */
// get remainder of num % 2 , add to string, then reverse entire string
int num;
printf("Enter a decimal number: \n");
scanf("%d", &num);
getchar();
printf("The equivalent binary number: ");
dectoBinary(num);
return 0;
}

void dectoBinary(int num){
    char output[50];
    int index = 0;
    while(num != 0){
        int digit = num % 2;
        output[index] = digit + '0';
        index++;
        num /= 2;
    }

    
    output[index] = '\0';
    

    int size = index;

    for (int i = 0; i < size/2; i++){
        char temp = output[i];
        output[i] = output[size - 1 - i];
        output[size - 1 - i] = temp;
    }
    
    printf("%s", output);

}