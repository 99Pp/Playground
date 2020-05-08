#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  
  string str;
  cin>>str;
  int len =str.length();
  int a=(int)str[0]-48;
  int b=(int)str[len-1]-48;
  
  cout<<a+b;
  
}