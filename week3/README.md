### Homework Week 3
### Data Structures in Java

Monica Quaintance

mjq2102@columbia.edu

### Problem 1:

_Write a command line application that indexes the words contained in a text 
file (provided to the program as a command line argument). Your program should 
go through the input file line by line. For each line, extract each word, and 
insert that word, along with its location into an AVL tree. Each element of 
the AVL tree should contain a unique word and a linked list of line numbers 
where that word occurs. If word already exists in the AVL Tree, simply add the 
new line number to the existing node. When you have finished, print out each 
unique word that appeared in the input file along with a list of line on which 
that word appears. You may use Weiss' AVL tree code as a starting point for 
your program._

poloniusAndLaertes.txt is the test file for the AvlTree.

The AVL Tree class for this problem is contained in AvlTree.java. This is 
Weiss' AVL tree, modified to hold a linked list in each node. 
UnderflowException.java is an exception thrown by AVLTree.

lineTreeTest.java takes a text file as a command line argument. It converts 
the file into a linkedList of lines. It also contains a method called
makeTextTree that builds an AVLtree of words and linked lists containing the
line numbers in which the words occur.

### Problem 2:

_Implement a spelling checker by using a hash table. Assume that the 
dictionary comes from two sources: an existing large dictionary and a second 
file containing a personal dictionary. Output all misspelled words and the 
line numbers in which they occur. Also, for each misspelled word, list any 
words in the dictionary that are obtainable by applying any of the following 
rules:_

_a. Add one character._

_b. Remove one character._

_c. Exchange adjacent characters._

_This is a command line application. The dictionary files should be provided 
as command line arguments to the programming. Here is a sample dictionary 
file. You do not have to submit the big dictionary file with your program, but 
you should submit a sample small dictionary file. Write your own hash 
function. In addition, the file being spellchecked should be provided as a 
command line argument._

The small dictionary file is 500words.txt

The file being spell checked is opheliaGoesNuts.txt

spellChecker.java has several methods:

  * dictRead takes in a linkedList of lines from a dictionary and loads every 
    line into a hashtable. It assumes every line is a single word.

  * findWord returns a boolean based on whether a word exists in the hash table

  * checkFile takes a linkedList of lines from a text file and checks every 
    word against the hash table. If the word does not exist then it returns the 
    word, the line number of the word, and the result of running wordPermute 
    on the word

  * wordPermute takes a word not found in the hash table and looks for 
    near-misses by adding a letter in every location, subtracting each letter, 
    and swapping each pair of adjacent letters

spellCheckTest.java takes two command line arguments, the dictionary file and
the text file to be checked. It inputs these two files to spellChecker and 
prints the results.

myHashTable.java is the hash table class into which the dictionary is fed.



