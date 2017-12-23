Frontline Education Code Challenge
Parameters
1. Should be solved in a language which demonstrates your skill for the position you have applied.
2. Deliver a working runnable solution and include a copy of the source code.
3. Write code typical of something we would be proud to have in Frontline software in production.
4. You will need to independently overcome any challenges you face in delivery.
5. If applicable, please list your assumptions.

Problem to Solve

Convert the string:
```
"(id,created,employee(id,firstname,employeeType(id), lastname),location)"
```
to the following output
```
id
created
employee
- id
- firstname
- employeeType
-- id
- lastname
location
```
Bonus (output in alphabetical order):
```
created
employee
- employeeType
-- id
- firstname
- id
- lastname
id
location
```

parenthese fix this every place!

Assumptions:
* The requirements are vague on purpose.
* Commas are delimiters.
* There must be the same number of open and close parameters.
* The double quotes on the example input string can be ignored, not actually part of the problem.
* Solution needs to be able to handle any number of parameters.
* The space between "```(id),``` and  ```lastname``` in the example input string is a typo. And that spaces are not allowed.
* ```()```, ```id)id```, ```((``` and ```))``` are not legal
* Closing parameters are followed by comma, ex: ```),```, with the exception of the last one.
* Nothing is allowed to follow the close parn, which matches the first open paren.  Ex: ```(employee(name1, name2),id),job(job1,job2),id)```
* The code which will solve this problem will also work on other "legal" strings.  Ex: ```(employee(name1, name2),id,job(job1,job2),id)```

Idea for how to solve
* Perform all error checking on the string, as listed in the assumptions above.
* Next tokenize the input, using comma as the delimiter.  The result being

```(id created employee(id firstname employeeType(id) lastname) location)```

* When processing tokens: is there a parameter, if so is it enclosed?

* Sudo code
```
repeat 

    if token contains open paren
        indent_count ++
        // only on the first one - if token starts with open paren, drop it and store the token
        else token contains open paren - recurse on this token
    else if token contains close paren
        indent_count--
        if token ends with close paren, drop it and store token
        // this is not legal, else token contains close paren - now what?
    else token contains no parens
        store it

until count == 0
```


