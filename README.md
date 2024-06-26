# MaximumSumIntervalFromArray

A program that finds the maximum sum interval in an array A.
The array is read from a text document whose location needs to be input from the console.

To run the program:

1. Run the following custom configuration:

        clean compile exec:java -Dexec.mainClass=MaxSumInterval

2. Alternatively use the following maven command:

        mvn clean compile exec:java

 ................................................................................

        The main logic of the program happens in findMaxSumInterval. 
        We iterate through the array once, and we check with a moving sum if the sum goes negative.
        In such, a case we restart counting the sum from that point on refreshing the start and end indexes,
        while keeping the positive result if one had existed.
        If the rolling sum does not increase with the current iteration, we incr. the holder
        for the end index and continue.

        This algorithm tends to linear complexity.

        Which is a considerable improvement over the cubic complexity of the straightfroward solution.


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
