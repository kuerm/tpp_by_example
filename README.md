# Transformation Priority Premise

Examples for every step in Transformation Priority Premise (TPP)

## Disclaimer

This repo only provides examples for TPP. Clean Code principles or Object Calisthenics rules are not in focus

## List

1. ({} → nil) no code at all → code that employs nil
2. (nil → constant)
3. (constant → constant+) a simple constant to a more complex constant
4. (constant → scalar) replacing a constant with a variable or an argument
5. (statement → statements) adding more unconditional statements.
6. (unconditional → if) splitting the execution path
7. (scalar → array)
8. (array → container)
9. (statement → tail-recursion)
10. (if → while)
11. (statement → non-tail-recursion)
12. (expression → function) replacing an expression with a function or algorithm
13. (variable → assignment) replacing the value of a variable.
14. (case) adding a case (or else) to an existing switch or if

## Scenario / Requirements

1. The method is named getValue (dummy)
2. "Hello" is returned
3. "Hello world" is returned
4. "Hello <parameter input>" is returned
5. Every called name is saved in a list for later check if already called
6. All kids with starting "M" in name are decent ones and don't have to be saved in a black list

## Sources

https://blog.cleancoder.com/uncle-bob/2013/05/27/TheTransformationPriorityPremise.html
https://www.codurance.com/publications/tpp-from-dumb-to-specific-to-generic