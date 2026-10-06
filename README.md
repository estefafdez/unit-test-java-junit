# unit-test-java-junit

Example of a simple project with unit tests using Java and [JUnit 4](https://junit.org/junit4/). The tests cover a small calculator class (`Calculadora`) with add, subtract, multiply and divide.

## Requirements

- JDK 11 or higher
- Maven

## Run the tests

```bash
mvn test
```

Main code and tests share the `src` folder. The tests live in the `tests` package and extend `CalculadoraBaseTest`, which prints the name of each test and sets up a JUnit rule.

## Code coverage

`mvn test` also generates a [JaCoCo](https://www.jacoco.org/jacoco/) report. Open `target/site/jacoco/index.html` to see which lines and branches the tests cover. CI uploads the same report as the `jacoco-report` artifact.

## Project structure

```
pom.xml
src/com/example/calculadora
├── Calculadora.java         # Code under test
├── CalculadoraConRegistro.java  # Uses a Registro dependency, mocked with Mockito in the tests
├── Registro.java
└── tests                    # JUnit tests
```

## Use it as a base

Fork the repository and clone your fork:

```bash
git clone git@github.com:{YOUR_USER}/unit-test-java-junit.git
```
