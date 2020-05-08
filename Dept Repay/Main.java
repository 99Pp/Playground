#include<iostream>
using namespace std;
int main()
{
 int p,r,t;
  float a,si,d,fs;
  cin>>p>>r>>t;
  si=p*r*t/100;
  d= 2/100.0*si;
  fs=p+si-d;
  cout<<si<<endl<<si+p<<endl<<d<<endl<<fs;
  
  
}