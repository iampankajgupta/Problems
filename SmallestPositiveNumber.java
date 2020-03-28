// Find the smallest positive integer value that cannot be represented as sum of any subset of a given array

TEST CASE 

{1,2,3,10} ANS 7 

SOLUTION 

Step 1 let the answer is 1 
Step 2 iterate over array and check if array of ith element is less than or equal to answer if the array of ith is greater than our 

answer is the smallest positive number '

Step 3 else add the array of ith number to sum and  step 2 until lenght of array


Solution 

public int SmallestPositivNumber(int[]array){
int answer = 1;
for(int i = 0;ii<array.length && array[i]<=answer;i++){

    answer = answer+array[i];

}
return answer;
}


TIME COMPLEXITY = O(N)
SPACE COMPLEXITY = O(1)










