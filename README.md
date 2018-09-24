# Interpreted Calculator
This app performs arithmetic operations by parsing induvidual statements and tokens of each statement provided to it.  
Visitor trees and methods are generated using ANTLR based on the grammars provided in the `grammars` directory. These methods are overridden to perform the required function.  

## Usage
Run `src/compilers/arithmetictest/TestCalc.java`. The results of all assignment statements are stored and the results of all arithmetic operations are printed.

#### Sample Input
```
a = 1
b = 2
c = a + b
c
a * b
^D
```

#### Output 
```
3
2
```

## Note
As this is a small test project, it does not use any dependency managers. As a result, the required dependencies are directly available in the lib folder of this project.
