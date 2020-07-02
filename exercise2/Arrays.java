package exercise2;

class Arrays {
    //Take the arrays.js file, and refactor the code into Java in this file.
    int[] nums = {10,23,3,4,5,2,1};
    String[] greetings = {"hello","howdy","hallo","hola","bonjour","ciao","أهلا"};
    boolean[] binaries = {0,1,1,1,0,0,0,1,1,1,1,1,0,1,0,0,1,0};

    void printNums() {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    };

    void printGreetings() {
        for (int i = 0; i < greetings.length; i++) {
            System.out.println(greetings[i]);
        }
    };

    void printBinaries() {
      for (int i = 0; i < binaries.length; i++) {
          System.out.println(binaries[i]);
      }
    };
}







