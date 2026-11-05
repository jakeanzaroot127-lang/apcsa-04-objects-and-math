# Exercise 3: Reference Drills (S13 homework)

Every snippet below uses the `Pet` class from `src/ObjectLab.java`:

```java
Pet(String name, int age)   // sets both
Pet(String name)            // age starts at 1
getName()   getAge()   birthday()   // birthday() adds 1 to age
```

For snippets 1 to 6: **draw** the variables and objects (a box per object, an arrow per reference variable), then write the output. Do this BEFORE you run anything. Draw on paper and paste a photo link, or sketch it as text in the picture box.

## Snippet 1
```java
Pet a = new Pet("Rex", 3);
Pet b = new Pet("Rex", 3);
a.birthday();
System.out.println(a.getAge() + " " + b.getAge());
```
Picture:
a ------> Pet (Name: Rex and age 3)
b ------> Pet (Name: Rex and age 3)
Object a increases in age by 1
Output:
4

## Snippet 2
```java
Pet a = new Pet("Rex", 3);
Pet b = a;
a.birthday();
System.out.println(b.getAge());
```
Picture:
a-------> Pet (Name: Rex and age 3)
b-------> a
Object a and b increase by 1, because object b is a reference variable for a

Output:
4

## Snippet 3
```java
Pet a = new Pet("Mia");
Pet b = new Pet("Zed", 9);
b = a;
b.birthday();
System.out.println(a.getAge() + " " + b.getName());
```
Picture:

a------> Pet (Name: Mia and age 1)
b------> Pet (Name: Zed and age 9)
b------> a (Mia, age 1)

Object b increases by 1

Output:
2 Mia

## Snippet 4
```java
String s = "Java";
String t = s;
s = s + "!";
System.out.println(s + " " + t);
```
Picture:
a-------> Java
t-------> s (also Java)
s + ! ------> Java!

Output:
Java! Java

## Snippet 5
```java
int x = 5;
int y = x;
y++;
System.out.println(x + " " + y);
```
Picture:

x------> 5
y------> 5
y++ --------> y+1 = 6

Output:

5 6

## Snippet 6
```java
Pet a = new Pet("Rex", 3);
Pet b = a;
a = null;
System.out.println(b.getName());
```
Picture:
a-------> Pet (Name: Rex, and age 3)
b-------> a (Name: Rex, and age 3);
a-------> Turns to nothing

Output:

Rex

## Snippet 7 (this one crashes)
```java
Pet a = new Pet("Rex", 3);
Pet b = a;
a = null;
b = null;
System.out.println(a.getName());
```
- Exception name: NullPointerException
- Line that crashes: last line
- Which variable is null? both, but since only a is printed it is the one causing the error
- Your fix (one line of code): Remove a = null;

## Snippet 8: write your own
Write a snippet where two variables alias one `Pet`, then explain its output in two sentences.

```java
Pet a = new Pet("James", 8);
Pet b = a;
Pet c = a;
b.birthday();
System.out.println(a.getName() + " " + b.getName() + " " + c.getName());
System.out.println(a.getAge() + " " + b.getAge() + " " + c.getAge());
```

Explanation:
Here we have the original variable a that creates a new Pet object, James, age 8. Then we use another variable, b to alias (create a reference) and we do the same with variable c.
## Checked my predictions
Which snippets did I get wrong, and what was I assuming?
