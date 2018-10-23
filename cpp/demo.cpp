#include <iostream>
using namespace std;


void swap(int &a, int &b) {

  int temp = a;
  a = b;
  b = temp;
}

void printArrayOf6(int nums[]) {
  cout << "[" << nums[0];
  for (int i=1; i<6; i++) {
    cout << "," << nums[i];     
  }
  cout << "]" << endl;

}

int main() {

  int nums[] = {2,3,5,54,2,89};

  cout << "Before: ";
  printArrayOf6(nums);

  swap(nums[3],nums[4]);

  cout << "After: ";
  printArrayOf6(nums);



  return 0;
}
