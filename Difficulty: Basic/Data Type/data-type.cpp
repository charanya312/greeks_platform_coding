//{ Driver Code Starts
// Initial Template for C++

// {Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends


// } Driver Code Ends
// User function Template for C++

class Solution {
  public:
    int dataTypeSize(string dataType) {
    if (dataType == "Character") return sizeof(char);
    else if (dataType == "Integer") return sizeof(int);
    else if (dataType == "Long") return sizeof(long);
    else if (dataType == "Float") return sizeof(float);
    else if (dataType == "Double") return sizeof(double);
    else return -1; // Invalid data type
}
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        string str;
        cin >> str;
        Solution ob;
        cout << ob.dataTypeSize(str);
        cout << "\n";
        cout << "~" << endl;
    }
    return 0;
}

// } Driver Code Ends