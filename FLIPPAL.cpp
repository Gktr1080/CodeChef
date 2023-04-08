#include <iostream>
using namespace std;

int main() {
    int t;
    cin>>t;
    while (t--){
        int N;
        cin>>N;
        string S;
        cin>>S;
        int a = 0;
        int b = 0;
        for(int i =0;i<N;i++){
            if(S[i]== '1')
            a++;
            else
            b++;
                
            
        }
        if(N%2 ==0){
            if(a%2 && b%2){
                cout<<"no\n";
                
            }else
            cout<<"yes\n";
        }
        else{
            cout<<"yes\n";
        }
        
    }
	// your code goes here
	return 0;
}
