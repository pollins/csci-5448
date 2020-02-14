# CSCI 5448 Project 1

Adam Pollins

## Instructions
Project is contained in the "proj" package, main method is contained in Zoo.java.

## Assumptions
It is assumed that all felines will have an equal probability of doing anything, i.e., will not listen to the Zookeeper's commands.

## Design choices
The Zookeeper's methods do not take Zoo objects as parameters, but Animal objects. As far as we are allowing future change, it makes sense that the Zookeeper might be allowed to tend to animals more than once or in an different order at some point, though this is not implemented here.
