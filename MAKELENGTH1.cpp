#include <bits/stdc++.h>
// #include <stack>

using namespace std;
int main() {
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        string str;
        cin>>str;
        stack<char>s;
        s.push(str[0]);
        for(int i=1;i<n; i++){
            if(s.top()==str[i]){
                s.pop();
                s.push('0');
            }
            else
            s.push(str[i]);
        }
        if(s.size()==1)
        cout<<"yes"<<endl;
        else{
            char ch = s.top();
            s.pop();
            while(!s.empty() && s.top()==ch)
            s.pop();
            if(s.empty())
            cout<<"yes"<<endl;
            else
            cout<<"no"<<endl;
        }
    }
	// your code goes here
	return 0;
}
