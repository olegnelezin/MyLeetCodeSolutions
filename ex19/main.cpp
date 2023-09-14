class Solution {
public:
    string func(int num, string hi, string re, string lo) {
        switch (num) {
            case 9:
                return lo + hi;
            case 8:
                return re + lo + lo + lo;
            case 7:
                return re + lo + lo;
            case 6:
                return re + lo;
            case 5:
                return re;
            case 4:
                return lo + re;
            case 3:
                return lo + lo + lo;
            case 2:
                return lo + lo;
            case 1:
                return lo;
            case 0:
                return "";
        }
        return "";
    }

    string intToRoman(int num) {
    string rome_num;
    rome_num += func(num / 1000, "", "", "M");
    num %= 1000;
    rome_num += func(num / 100, "M", "D", "C");
    num %= 100;
    rome_num += func(num / 10,  "C", "L", "X");
    num %= 10;
    rome_num += func(num ,   "X", "V", "I");
    return rome_num;
    }
};