#include <iostream>
using namespace std;

int main() {
    int t;
    cin>>t;while(t--){
        int n;
        cin>>n;
        string s;
        cin>>s;
        string x,y;
        for(int i =0; i<n/2;  i++)
        x+=s[i];
        for(int i= n/2; i<n; i++)
        y+=s[i];
        if(x==y)
        cout<<"yes"<<endl;
        else
        cout<<"no"<<endl;
        
    }
	// your code goes here
	return 0;
}
