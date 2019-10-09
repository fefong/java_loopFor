Java Loop For
========================

Example Application: LOOP - FOR

## Loop Structure

```java
for (statement 1; statement 2; statement 3) {
  // code block to be executed in loop
}
```

### Example 1: internal variable and simple for loop
```java
for (int i = 0; i < 11; i++) {
	System.out.println("i: " + i);
}
```

### Example 2: for loop with array values
```java
int[] values = new int[] { 3, 4, 5 };
for (int i = 0; i < values.length; i++) {
	System.out.println("i: " + values[i]);
}
```

### Example 3: decrease loop

```java
int i;
for (i = 10; i >= 0; i--) {
	System.out.println("i: " + i);
}
```

### Example 4: increase step N 

```java
int i;
for (i = 0; i <= 10; i += 2) {
	System.out.println("i: " + i);
}
```

### Example 5: decrease step N

```java
int i;
for (i = 10; i >= 0; i -= 2) {
	System.out.println("i: " + i);
}
```

## Some links for more in depth learning

* [JAVA PRINT](https://github.com/fefong/java_print);
* [JAVA SWITCH CASE](https://github.com/fefong/java_switch);
* [JAVA IF/ELSE](https://github.com/fefong/java_ifElse);
* [JAVA ARITHMETIC](https://github.com/fefong/java_calculator);
