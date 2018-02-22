# PA6-Garden-Key
PA6 key and initial writeup draft.

## Learning Objectives

The goal of this assignment is to practice inheritance by incorporating a 
class hierarchy that uses polymorphism to make subclasses stand out from
one another within a two-dimensional arrays.

What is a class hierarchy you ask? Read about it on [Wikipedia](https://en.wikipedia.org/wiki/Class_hierarchy)

## Garden Simulation

In order to reach this goal we will be simulating a garden. The garden that you
will be implementing will consist of a number of plantable plots of a fixed size.
Within each plot there could exist a single plant. Plants are divided up into three
different categories, trees, flowers and vegetables, all of which have unique characteristics.
Trees grow up, vegetables grow down, and flowers bloom as they grow.

## The Assignment

This is a **two-week assignment**, so this write up will be comprised of two sections. A week 1 section and a week 2 section.

In order to create this garden simulation, you will need these key components:

  * Garden.java that simulates a garden by:
  	* Containing a 2D list of **ANY** plant objects
  	* Containing functionality to receive/execute commands such as, but not limited to, PLANT and PRINT 
  	* Containing a Screen object for quick and easy printing
  	
  * A Plant class hierarchy with Plant.java as the superclass that extends to its following subclasses:
   	* Flower.java
   	* Tree.java
   	* Vegetable.java
   	
  * Screen.java that will use information from both the Garden and the Plants to print out a representation of the garden
  
  * PA6Main.java

## Week 1



### The classes

Plant


 for the required
classes and be able to handle the PLANT and PRINT commands.

They will provide their code showing their class declarations, but they
will remove the method code for peer review.




The program should have the following usage:
    java PA6Main infile

The input file will indicate the size of the grid, which plants to
place where, and then a list of commands.

Example input
```
rows: 1
cols: 1
subplot size: 5

PLANT (0,0) rose
PRINT
GROW 1
print
```

Output for the above example:
```
> PRINT
.....
.....
..r..
.....
.....

> GROW 1

> PRINT
.....
..r..
.rrr.
..r..
.....

```

GROW # will have each plant grow # time steps.  Flowers
grow to all 4 neighbors, trees grow up, and vegetables grow
down.

Note that HARVEST would remove all vegetables from the garden
and print out their names.  PICKED would remove flowers and
print them out.  CUTDOWN trees.

I am not sure how you would make a command of CLIMB.  What would the impact be?

### Part 1



### Part 2

All the other commands will be implemented and the students will design
their own plant type and show an example input and output that
illustrates it in their README.md file.

  
## Logistics:

* Copy the .travis.yml, .project, .settings/*, .classpath, grade.py,
run_autograder, and setup.sh from the current assignment (PA5).  Edit
the .project file and name it something like PA6GardenKey.

* Create a set of test cases, inputs and outputs in PublicTestCases/
and GradingTestCases/.  GradingTestCases/ should be a superset of 
PublicTestCases/.

* Draft the assignment in this README, the solution in this
directory, and provide a test case for each command.
  * The test cases should be in a PublicTestCases/ subdirectory.
  See how the output files are named in PA5.
  * See the PA-and-Sections-Writeups for how
  the writeup should be formatted.
  * Edit all of this on your own fork of this repository.  When 
  you are ready for a proof read do a pull request.
  
  # Jordan, Hannah, and Alex Plan
  Main goal: Focus on Inheritance

Start off with the abstract class plant
	A plant:
●	Has a name
●	Has a location
●	Can be planted
●	Can be printed out

Then we have the following subclasses of plants:
1.	Trees
a.	Can be climbed
b.	Can be cut down
Types of trees:
●	Banana tree
●	Palm tree
●	Pine tree
2.	Flowers
a.	Can be smelled
b.	Can be picked
Types of flowers:
●	Rose
●	Sunflower
●	Tulip
3.	Vegetables
a.	Can be eaten
b.	Can be harvested
Types of vegetables:
●	Carrot
●	Potato
●	Tomato

Each of these types of plant would have their own unique printing function

As input, we would give them a list of plants and their respective locations in a 2d array. They would then have to print that 2d array.

They would then have to order all of the plants based on their types and perform specific tasks based on the test case. Ie. pick all of the flowers, climb all the trees, eat ONLY the potatoes.

Obstacles in this PA6 outline: 
	The students would need to know of the instanceof operator and how it works.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	'''
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 The first week they will need to
submit something.  Maybe a decomposition design.  I am not sure yet
and welcome to ideas.  Whatever they submit will be peer reviewed
before PA6 is due.

Things to turn in (ideas) Garden class, Plant Class and one Subclass of the plant (their choice)
Reasoning:
		The Garden class: where they do the majority of the logic with respect to creating
			different types of plants.
		The Plant class & one subclass: To see if they understand the concept of class hierarchy,
			all the basic functions of a plant should be implemented in Plant, the only things that
			should be implemented in the subclass is it's unique methods or overrides. 
	

