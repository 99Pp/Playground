#include<iostream>
using namespace std;
int main()
{
  int n,cost;
  cin>>n;
  if(n>600)
    	cost= 1.25*n+425;
  else if(n<=200)
    	cost = 0.5*n;
  else if(n<=400)
    	cost = 0.65*n+100;
  else 
    	cost= 0.8*n+200;
  cout<<"Rs."<<cost;
}