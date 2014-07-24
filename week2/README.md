### Homework Week 2
### Data Structures in Java

Monica Quaintance

mjq2102@columbia.edu

### Problem 1:

_Palindrome Detector: Write a program that uses a stack to check for 
palindromes in each line of a text file. Your program should output the 
palindromes that it finds in the document._

PalindromeFinder.java evaluates a single string and returns a boolean for 
is/isn't a palindrome.

palindromeTest.java tests the implementation of PalindromeFinder.java. 
palindromeTest reads in "palindromes.txt" (assumes located in working 
directory), passes every line to PalindromeFinder, and prints to screen if
PalindromeFinder.java returns true.

MyStack.java is the stack class on which PalindromeFinder.java is built.

### Problem 2:

_Implementing and displaying expression trees:_

_Your program will be a text-based Java application. Prompt the user to enter a postfix expression (made up of single digit numbers and the +, -, *, and / operators). When the user presses enter, the stack based method for constructing expression trees will be executed. Use your stack from the previous question. You should implement your own ExpressionTree class to store the expression. Once the tree has been built, have your program use the tree to output the equivalent prefix expression and infix expression (don't forget parenthesis for this one). Finally the program should evaluate the expression tree and print the result._

ExpressionTree.java is the class for the tree. File contains the following user-accessible 
methods: 

* returnElement()
* returnLeft()
* returnRight()
* prefixPrint()
* infixPrint()
* evaluate()

treeBuilder.java builds an expression tree. Takes in a postfix expression in a 
string (no spaces or commas, numbers and operators only) and returns an 
expression tree. Uses MyStack.java to build the expression tree.

treeTest.java uses the scanner to prompt the user for a postfix expression, uses treeBuilder to make an expression tree, and then calls the two print and the 
evaluate method on the tree and prints the results.

### Problem 3: Weiss 4.16

_Redo the binary search tree class to implement lazy deletion. Note carefully that this affects all of the routines. Especially challenging are findMin and findMax, which must now be done recursively._

binarySearchlazy.java is a copy of Weiss' BinarySearchTree class with lazy deletion implemented. Every method except height has been modified to deal with lazy deletion. 

Weiss' code included a test program which tests all the methods in the class.

UnderflowException.java is an exception that was thrown in Weiss' code.

