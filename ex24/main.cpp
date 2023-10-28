#include <iostream>
using namespace std;

class Solution {
public:
    int fib(int n) {
        int t1 = 0, t2 = 1;
        int temp;
        while (n--) {
            temp = t1 + t2;
            t2 = t1;
            t1 = temp;
        }
        return temp;
    }
};
