
# Fuzzy Logic and Bayesian Network Integration Project

This project implements a solution to integrate Fuzzy Logic and Bayesian Networks (BN) using the FuzzyLogic API and UNBBayes API. The software receives attributes of valves and pumps as input, calculates if the node is reliable or not using Fuzzy Logic, and sets the values in the BN using UNBBayes. The entire process is performed programmatically without using GUI tools.

## Project Structure

The project contains the following main components:

1. **FuzzyLogic Integration**: Uses the FuzzyLogic API to evaluate the reliability of the nodes based on the input attributes of valves and pumps.
2. **Bayesian Network Integration**: Uses the UNBBayes API to construct the Bayesian Network and set the values based on the Fuzzy Logic output.

## Installation Procedure

Follow the steps below to set up and run the project:

1. **Clone the Repository**:
   ```
   git clone <repository-url>
 
   ```

2. **Set Up the Environment**:
   - Ensure you have Java Development Kit (JDK) installed. The project is compatible with JDK 8 or later.
   - Download and include the required libraries:
     - FuzzyLogic API
     - UNBBayes API



Here is the project directory tree:

```
📁 Java-fuzzy project
├── 📁 FuzzySet
│   ├── 📁 bin
│   ├── 📁 dep
│   │   ├── 🍵 jFuzzyLogic_core.jar
│   │   └── 🍵 jFuzzyLogic.jar
│   ├── 📁 lib
│   ├── 📁 src
│   │   └── 📁 cyse
│   │       └── 📁 gmu
│   │           └── 📁 edu
│   │               └── 📄 TestFuzzyEngine.java
│   ├── 📁 target
│   └── 📄 pom.xml
├── 📁 solution
│   └── 📄 final.fcl
```
