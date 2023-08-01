#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--){
        int n,m,k,x;
        cin>>n>>m>>k>>x;
        // int temp = n*k+m;
        // int w = n*(k-1);
        // int var = x%temp;
        // if(var==0 || (var-w)<=0){
        //     cout<<"no"<<endl;
        // }else
        // cout<<"yes"<<endl;
        if(x%((n*k)+m)==0){
            cout<<"yes"<<endl;
        }else if(x%((n*k)+m)-(n*(k-1))>0){
            cout<<"yes"<<endl;
        }else{
            cout<<"no"<<endl;
        }
    }
    
	// your code goes here
	return 0;
}
