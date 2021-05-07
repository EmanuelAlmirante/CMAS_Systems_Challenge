# CMAS Systems Challenge

A variation of FizzBuzz with a focus on Java 8 lambdas. 


# Please read it carefully

### Important guidelines

You should NOT find this test to be particularly difficult. It is designed to be a straightforward coding exercise, and it should take you no more than 90 minutes.

The solution should be developed using features delivered in Java 8 or greater with a TDD approach and should have excellent unit test coverage. 

The code should beclean,conciseand maintainable, the solution should reflect the difficulty of the assigned task, and should  NOT be overly complex.

Layers of abstraction, patterns, or architectural features that aren’t called for should NOT be included.

 
### Technical Description

**Step 1**  

Write some code that prints out the following for a contiguous range of numbers: the name 'CMAS' for numbers that are multiples of 3, 'systems' for numbers that are multiples of 5, 'CMASsystems' for numbers that are multiples of 15, e.g. if I run the program over a range from 1-20 I should get the following output:

1 2 CMAS 4 systems CMAS 7 8 CMAS systems 11 CMAS 13 14 CMASsystems 16 17 CMAS 19 systems.

Archive this as a separate zip file and then continue on to step two.


**Step 2** 

Enhance your existing CMASsystems solution to perform the following: If the number contains a three you must output the text 'good'. This overrides any existing behaviour e.g. if I run the program over a range from 1-20 I should get the following output:

1 2 good 4 systems CMAS 7 8 CMAS systems 11 CMAS good 14 CMASsystems 16 17 CMAS 19 systems.

Archive this as a separate zip file and then continue on to step three. 


**Step 3** 

Enhance your existing solution to perform the following: Produce a report at the end of the program showing how many times the following were output CMAS systems CMASsystems good and integer (for the numbers). e.g. if I run the program over a range from 1-20 I should get the following output:

1 2 good 4 systems CMAS 7 8 CMAS systems 11 CMAS good 14 CMASsystems 16 17 CMAS 19 systems


CMAS: 4

systems: 3

CMASsystems: 1

good: 2

integer: 10
