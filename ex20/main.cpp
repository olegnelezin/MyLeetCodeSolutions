class Solution {
public:
    int romanToInt(string s) {
    int arab_num = 0;
    for (int i = 0; i < s.size(); ++i) {
        switch (s[i]) {
            case 'M':
                if (i != 0 && s[i-1] == 'C') {
                    arab_num += 800;
                } else {
                    arab_num += 1000;
                }    
                break;
            case 'D':
                if (i != 0 && s[i-1] == 'C') {
                    arab_num += 300;
                } else {
                    arab_num += 500;
                } 
                break;
            case 'C':
                if (i != 0 && s[i-1] == 'X') {
                    arab_num += 80;
                } else {
                    arab_num += 100;
                }
                break;
            case 'L':
                if (i != 0 && s[i-1] == 'X') {
                    arab_num += 30;
                } else {
                    arab_num += 50;
                }
                break;
            case 'X':
                if (i != 0 && s[i-1] == 'I') {
                    arab_num += 8;
                } else {
                    arab_num += 10;
                }
                break;
            case 'V':
                if (i != 0 && s[i-1] == 'I') {
                    arab_num += 3;
                } else {
                    arab_num += 5;
                }
                break;
            case 'I':
                arab_num += 1;
                break;
        }
    }
    return arab_num;
    }
};