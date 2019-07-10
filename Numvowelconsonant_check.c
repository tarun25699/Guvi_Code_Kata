#include <stdio.h>

int main()

{
   
 char x;
  
 scanf("%c",&x);
 
 if((x>=65 && x<=90) || (x>=97 && x<=122))   
  {
 if(x == 'a' || x == 'e' || x == 'i' || x == 'o' ||x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U')
 {
  printf("Vowel");
 }
 else
 {    
 printf("Consonant");
 }
  }
  else
  {
      printf("Invalid");
  }
  return 0; 

}
