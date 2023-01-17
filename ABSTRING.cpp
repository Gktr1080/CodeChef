#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        string stri;
        cin>>stri;
        map<char, int>m;
        int flag = 0;
        if((stri.length())%2==1)
        
        cout<<"no"<<endl;
        else{
            for(int i=0;i<stri.length(); i++){
                m[stri[i]]++;
            }
            for(auto i:m){
                if(i.second%2){
                    flag =1;
                    cout<<"no"<<endl;
                    break;
                }
            }
            if(!flag)
            cout<<"yes"<<endl;
        }
    }
    
	// your code goes here
	return 0;
}
