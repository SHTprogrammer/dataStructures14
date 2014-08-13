### Homework Week 4
### Data Structures in Java

Monica Quaintance

mjq2102@columbia.edu


###Problem 1

_The file citypairs.dat contains selected city pairs and their distances. 
Each line of the file contains 2 city names and a distance. Write a program 
to calculate the shortest path between any given city pair. Your program 
should do the following:_

  _Read in the city pairs and distances._

  _Implement Dijkstra's algorithm using as the edge cost the given city pair's 
  distance. You should use the priority queue implementation of Dijkstra's 
  algorithm. Input should be via a Java GUI window that asks for the 
  source and destination cities._

  _Map the cities onto the window and draw the shortest path in the window 
  between those cities. A list of (X,Y) coordinates for each of the cities 
  can be found in the file cityxy.txt._

  _Display in the window the path length of the shortest path._

The master file to run the mapper is CityPathMapper.java. This file 
takes citypairs.dat and cityxy.txt as command line arguments.

CityPathMapper.java reads in the two files and passes two LinkedLists of the
contents, along with the city pair ("Albuquerque", "Albuquerque") to a 
class drawMap.

drawMap.java sets the window size for the final frame and creates a 
djikstrasMap object that finds the path between two cities. It then prints the 
shortest path information, maps all the cities by their coordinates, and 
plots the shortest path solution -- all this information is passed from the
djikstrasMap.

djikstrasMap takes in the two LinkedLists of edges and coordinates and the 
city pair. It reads all the cities into vertices with their coordinates and 
adjacencies. The method findPath() uses dijskras algorithm to find the 
shortest path between the city pair.

djikstrasMap uses the class Vertex.java to store a city's information and the 
class Point.java to store its x,y coordinate pair. The Djikstras algorithm 
uses a priority queue to order elements that uses the comparator 
CompareDist.java.

CityPathMapper.java creates two jComboBoxes that list all possible cities for 
start and end locations. These combo boxes use StartListener.java and 
EndListener.java as ItemListeners to know when the user selects a new city.
The JButton drawButton calls findPath() on the two cities when the user clicks.

