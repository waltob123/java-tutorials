# Difference between ++num and num++

++num increases the value by one and fetches the value

Eg. 
```{java}
int a = 10;
int result = ++a;
System.out.println(result);  // 11
```
What is happening here is that first we assign 10 to the variable `a`, then we assign `++a` to `result`. Before the value is assigned to `result`, it gets incremented by 1 before it is assigned to `result`.

#

num++ fetches the value before increasing the value by one.

Eg.
```{java}
int a = 10;
int result = a++;
System.out.println(result);  // 10
```
In this example, `result` is set to 10 before `a` increases itself by 1.