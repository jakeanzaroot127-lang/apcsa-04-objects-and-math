# Exercise 4: API Scavenger Hunt (S14 homework)

Use the official docs, not a search engine summary:

- String: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html
- Math: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html

## 1. The String class
- Package it lives in: java.lang
- Number of constructors listed: 

## 2. Four methods (return type and parameter list, exactly as the docs show)
| Method | Return type | Parameter list |
|---|---|---|
| `length` | int | String |
| `isEmpty` | boolean | String |
| `indexOf` (pick one version) | char | char |
| `charAt` | char | int |

## 3. A method with two or more signatures
Method name: contains("a", "A").

Copy two of its signatures: ("a", "A")

How do they differ? The first "a" is the string being replaced and the second is what it is being replaced with,

## 4. The Math class
Write the signature of each. Then say how many versions of `abs` there are.

- `abs`: input is number, int, float, long
- `pow`: input is 2 number, one is the base and the other number is the exponent
- `max`: input is 2 numbers
- Number of `abs` versions: 6

## 5. One String method we have not used
Method name: isBlank()
Returns true if the string is empty or contains only white space codepoints, otherwise false.
Your code:
```java
String word = "   ";
String word2 = "apple";

System.out.println(word.isBlank());
System.out.println(word2.isBlank());
```
Output:

True
False 

// paste your output
```
