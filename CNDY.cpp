#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int a[2*n];
        for(int i=0; i<2*n; i++)
        cin>>a[i];
        map<int,int>mp;
        for(int i=0;i<2*n; i++)
        mp[a[i]]++;
        int flag=0;
        for(auto it:mp){
            if(it.second>=3){
                flag=1;
                break;
            }
        }
        if(flag)
        cout<<"no"<<endl;
        else
        cout<<"yes"<<endl;
    }
	// your code goes here
	return 0;
}
