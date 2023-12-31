#include <iostream>
#include <unordered_map>
#include <vector>
using namespace std;

class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        unordered_map<int, int> map;
        for (int i = 0; i < nums.size(); ++i) {
            if (map[nums[i]] == 0) {
                map[nums[i]] += 1;
            } else {
                return true;
            }
        }
        return false;
    }
};
