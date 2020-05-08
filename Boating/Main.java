#include<iostream>
using namespace std;
int main()
{
 int ad = 75;
 int ch = 30;
 int wt,na,nc;
 cin>>wt>>na>>nc;
 ((na*ad+nc*ch)>wt)?cout<<"Boat will drow":cout<<"Boat is stable";
}