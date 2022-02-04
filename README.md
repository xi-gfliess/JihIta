# JavaSampler

The goal of this example is to show Java basics in the scope of OOP.
You can check your progress using the provided JUnit tests.

There are some classes missing and you have to complete the project. We hope you enjoy the project as well. **Good luck!**

Follow these steps:

1. checkout the source code 
1. build it with maven using java 1.8
1. run the tests in the `src/test/java` folder (all tests will fail)
1. create a class that extends the abstract class `AbstractDrink` and use this class 
1. to create an implementation of the `IBeverageBar` interface. Take a look at the `init()` method of the test-cases and uncomment the line to use your implementation of the `IBeverageBar` interfaces
1. now run the `BeverageTests` and fix you implementation until all tests are successful 
1. create a class that implements the `IMixedDrink` interface and use it to
1. implement the static method `Barkeeper.mix()`
1. check the `MixedDrinkTest` all methods except `testSort()` should be successful
1. make the `IDrink` interface comparable and
1. implement the required methods comparing  the amount of alcohol from low to high. 
1. Now you can uncomment the `Collections.sort(..)` line in the `testSort()` method. All tests should be successful! **Well done!**



