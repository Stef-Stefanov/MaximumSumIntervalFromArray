# MaximumSumIntervalFromArray
A program that finds the maximum sum interval in an array A.
The array is read from a text document whose location needs to be input from the console.


        The main logic of the program happens in findMaxSumInterval. 
        We iterate through the array once, and we check with a moving sum if the sum goes negative.
        In such, a case we restart counting the sum from that point on refreshing the start and end indexes,
        while keeping the positive result if one had existed.
        If the rolling sum does not increase with the current iteration, we incr. the holder
        for the end index and continue.

        This algorithm tends to linear complexity.

        Which is a considerable improvement over the cubic complexity of the straightfroward solution.

        In handleFullNegativeArr we handle the case where all elements of the arr are negative
        We iterate through the arr once finding the negative number closest to zero,
        which would be the sole element of a maximum subarray consisting of entirely negative numbers
        
        In the case we have a full negative arr the complexity changes to 2xN. While we could incorporate
        the logic in the main cycle, this will slow down considerably the general case solution, while having
        a modest speeding up efect in all cases. It will also make the code considerably less readable.
        It is for theese reasons I decided to extarct it in a seperate method.


Rouglhy an example for the text doc should be as follows:
Number of whitespaces is irrelevan as long as the digits are seperated.

5   
-1     -1 -31 -3 -4

------------------------------------------------------------------------------------

Assignment B
Objective:
Design a program that finds the maximum sum interval in an array A.
The maximum sum interval is defined as the pair of indexes i and j, such as the sum of array 
values A(k), k = i … j is maximized. 
Design Specification:
The array is read from a text file with the following structure:
- First line contains a single integer value which represents the size of the array N;
- The next line contains N floating-point values; Values are separated by one or more blanks
- The program outputs the start and the end indexes of the area in the array with maximum sum.
Remarks:
- The program should terminate on invalid input;
- Code documentation will be considered a plus.
