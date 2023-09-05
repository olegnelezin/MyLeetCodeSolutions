#include <iostream>
using namespace std;
class Solution {
public:
    int countPairs(vector<int>& nums, int target) {
        int n = nums.size();
        int k = 0;
        for (int i = 0; i < n - 1; ++i) {
            for (int j = 1; j < n; ++j) {
                if (0 <= i && i < j && j < n && nums[i] + nums[j] < target) {
                    k++;
                }
            }
        }
        return k;
    }
};

