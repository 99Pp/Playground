#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int x,y,jmp;
  int a=3,b=4;
  cin>>x>>y;
  jmp=sqrt(pow((a-x),2)+pow((b-y),2));
  cout<<jmp;
}