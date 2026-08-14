#include <iostream>
#include <vector>
#include <algorithm>
#include <numeric>

int main(){
    std::vector<int> dailySales;

    dailySales = {120, 200, 150, 80, 90, 220, 100};


    for (auto it = dailySales.begin(); it != dailySales.end(); ++it){
        std::cout<<*it<<" ";
    }
    std::cout<<std::endl;

    float average = 0.0;
    int count = 0;
    for (auto it = dailySales.begin(); it != dailySales.end(); ++it){
        average += *it;
        count++;
    }

    average = average/count;
    std::cout<<average<<std::endl;


    sort(dailySales.begin(), dailySales.end());

    for (auto it = dailySales.begin(); it != dailySales.end(); ++it){
        std::cout<<*it<<" ";
    }
    std::cout<<std::endl;

    return 0;

}