# Transformation Priority Premise

Examples for transformations in Transformation Priority Premise (TPP)

## List of transformations

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

Example story to show the transformations in action. The context of the story is a class in school and the teacher
wants to give fruits to the well behaving kids.

1. The method is named greeting (dummy)
2. "Hello" is returned
3. "Hello world" is returned
4. "Hello <parameter input>" is returned
5. Every called name is saved in a list for later check if already called
6. All kids with starting "M" in name are decent ones and don't have to be saved in a black list
7. All called kids get some fruits
8. The kids ask for their favorite fruit
9. When the favorite fruit is not available anymore, the current kid wants to know who was called before to grab that
   fruit.
10. The kid can choose their favorite fruit. If there are in stock return the fruit otherwise a sad message.
11. Duplicate requirement from #9.
12. Implement Integration Operation Segregation Principle (IOSP) - internal refactoring.
13. Make an internal refactoring to use/mutate existing variables.
14. Kids can ask for the fruit color.

## Sources

https://blog.cleancoder.com/uncle-bob/2013/05/27/TheTransformationPriorityPremise.html
https://www.codurance.com/publications/tpp-from-dumb-to-specific-to-generic