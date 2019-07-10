#include <stdio.h>

int main()

{
   
 char x;
  
 scanf("%c",&x);
 
 if((x>=65 && x<=90) || (x>=97 && x<=122))   
  {
  printf("Alphabet");
  }
  else
  {
      printf("No");
  }
  return 0; 

}
