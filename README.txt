----------------------------------------------------------------------------------------
------------------------------------Path Finder-----------------------------------------
----------------------------------------------------------------------------------------
-------------------------------Developed & Designed By----------------------------------
-----------------------------------Mayank Pandit----------------------------------------
----------------------------------------------------------------------------------------

---Description of the Project---
>> Path Finder is a set of commands to build and nevigate through the set of nodes which
   are child of a particular nodes and they might have other children
>> Program starts with the "Surface" node which is a root node
>> Starting from this node we can create tree of nodes for which set of commands are as follows

Note -	Commands are case sensitive, so Dig or dIG will not work only DIG should work. Other commands
	should result in "BAD INPUT" prompting to the user
     -	Refer attached figure for understanding the description of the certain commands

1) DIG nameOfNode     -	creates a new node as a child of current node and focus goes to the newly created node
		      -	For Ex, if command is "DIG   hello world", it should make hello world as a child of 
			Surface node and focus should go to hello world and it should neglect the space between
			the command and the name of the node

2) ASCEND             - To nevigate to the parent node of the current node

3) DESCEND nameOfNode -	To nevigate to the one of the child node
		      -	If the node does not exist, it should prompt user about the non-existant node

4) LOOK 	      -	LOOK command is to look for the child nodes and how many paths are there from
			each of those nodes
		      - For Ex, if LOOK command is given at "Surface" node then it should give follwing output
			Sample Output--
			Path: 2 - hello world
			Path: 0 -  
			Path: 3 - sandbourne
			Path: 3 - Province

5) LOOKBACK	      -	LOOKBACK commands is to find out the name of the parent node but focus should still
			remain at the current node

6) QUIT		      - Exiting from the program

PLEASE REFER SAMPLE OUTPUT ATTACHED IN THE SEPARATE FILE

----Tools and Languages used----
>> Eclipse JEE Oxygen IDE
>> Languages - Java
>> Console for showing output

Thank you