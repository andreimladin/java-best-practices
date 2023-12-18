# java-best-practices
## What is a practice?

## Why the best practice?

### Naming Conventions
* Some principles
  * Choose your name thoughtfully, they should be descriptive
  * Communicate your intent
  * Avoid disinformation
* Places where naming is important
  * packages
    * lower case
    * prefix - should be one of the top level domain
    * subsequent components of the package name can vary to an organization's its own internal naming conventions:
      * division, department, project, machine
      * layers
      * etc
  * classes
    * Upper CamelCase
    * Should be nouns
  * methods
    * lower camelCase
    * Should be verbs
    * Returning a boolean should be a predicate
      * isPostable?
  * variables
    * lower camelCase
    * short yet meaningful
  * constants
    * UPPER_SPLITTED

## OOP
## good encapsulation
* Class Members Should be Private
* Class = Single Unit
## Composition over inheritance

## Be carefull with Exceptions
* Avoid empty catches
* Don’t handle RuntimeExceptions, they are developer exceptions
  * proper handling for NullPointerException
  * avoid ArrayIndexOutOfBounds

## Best practices using Collections
* empty collection instead of null elements
* choose a proper collection

## Clean code
* Your Code Is Like A Story
  * reveal your intent by code, but not by comments
    * dont use comments to explain your code
  * dont use literals for which anyone else should guess what it does represents
    * Avoid literals - stop hard-coding
    * use constants or system properties
  * use enums instead of scattered constants
  * methods
    * first rule: they should be small
    * second rule: they should be smaller than that
    * no more than 3 arguments

## Basic Principles
* SOLID
* DRY
* KISS

## General best practices
* Use the proper scope for a variable

* Primitives - dont waste memory, choose the most appropriate one
* Use Strings properly
  * concatenations
