# Question 2 (2 marks)

The nested while loop below is supposed to print the 10x10 multiplication table (i.e. 1x1,1x2,1x3,1x4...2x1,2x2,...,10x10). 
It currently has errors.
Rewrite the nested while loop below to make it produce the desired output.

```
int x = 1;
int y = 1;

while (x < 10){
    while (y < 10){
        System.out.print( (x*y) + " ");
        y++;
    }
    x++;
    System.out.println();
}
```

## Your Solution

```
int x = 1;
int y = 1;

while (x <= 10){
    while (y <= 10){
        System.out.print( (x*y) + " ");
        y++;
    }
    x++;
    y = 1;
    System.out.println();
}
```
