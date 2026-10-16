# Java Core

A collection of **305 Java source files** exploring core language concepts, collections, data structures, algorithms, and Java streams. Examples are organized by topic and generally provide their own `main` method.

This is a practice portfolio, not a single application. One Maven build compiles all examples together; you choose which example to run.

## Requirements

- **JDK 17 or newer** (`java` and `javac` on your PATH)
- **Apache Maven 3.6.3 or newer**
- Internet access on the first build to resolve Maven dependencies

## Build everything

From the repository root:

```sh
mvn clean verify
```

Compiled classes are placed in `target/classes`, and Maven packages them as `target/java-core-1.0-SNAPSHOT.jar`. There is no default application entry point; the JAR is not an executable or bundled-dependency JAR.

There are currently **no automated unit tests**. `verify` checks compilation and packaging, not correctness of every algorithm or every input. Some legacy examples produce deprecation and unchecked-operation compiler warnings.

## Run an example

After building, run a JDK-only example:

```sh
java -cp target/classes Bitwise.Xoroperations
```

For an interactive array example:

```sh
java -cp target/classes Arrays.FindDuplicates
```

The program prompts for a size and integer values. Input handling and edge cases differ between exercises.

For examples that use external libraries, prepare a runtime classpath (macOS/Linux):

```sh
mvn dependency:copy-dependencies -DincludeScope=runtime
java -cp 'target/classes:target/dependency/*' java8.StreamsOnPojos
java -cp 'target/classes:target/dependency/*' validation.MainApp
```

On Windows, use `;` instead of `:` between classpath entries. You can also import `pom.xml` into IntelliJ IDEA, Eclipse, or VS Code and run a class using the IDE's Maven-resolved classpath.

## Explore the examples

All source paths below are relative to `src/main/java/`.

| Topic | Directories |
|---|---|
| Arrays and matrices | `Arrays/`, `Arrays/twod/` |
| Lists, maps, sets, iterators | `Collections_FrmWrk/`, `CompareClass/`, `Hashing/` |
| Trees, linked lists, sorting, searching, recursion | `algorithms/`, `dsa/` |
| Problem-solving exercises | `hackerrank/`, `leatcode/`, `afteracademy/`, `problems/` |
| Classes, inheritance, cloning, immutability | `Oops/`, `Abstract_Example/`, `Cloning/`, `Immutability/` |
| Streams and functional programming | `java8/` |
| Generics, exceptions, nested classes | `GenericTemplate/`, `ExceptionHandling/`, `InnerClass/` |
| Numeric and bitwise operations | `BigInt/`, `Bitwise/`, `maths/`, `xor/` |
| Dates, input, validation | `DateFormatting/`, `Scanner/`, `validation/` |

Original package spellings and capitalization are retained, including `leatcode` and `Collections_FrmWrk`, so source paths match existing imports.

## External libraries

Most examples use only the JDK. Maven resolves the remaining dependencies:

| Library | Used for |
|---|---|
| Apache Commons Lang | String utilities and sample-data generation |
| Jackson Databind | Converting JSON sample data into Java objects |
| Bean Validation 2.0 (`javax.validation`) | Validation API and annotations |
| Hibernate Validator 6 and Java EL | Runtime support for the validation example |

The validation examples intentionally use the `javax.validation` namespace; Jakarta-only replacements require source changes.

## Scope

Examples include unfinished experiments and older coding styles. Compiling successfully does not mean each algorithm handles all edge cases. Source links and attribution comments are retained where present.

Keep generated files, local logs, keys, and real credentials out of version control. The supplied `.gitignore` excludes common local artifacts. This directory contains no inherited Git history from the original collection.

## Verification

Verified with OpenJDK 21 and Maven 3.10.0, targeting Java 17: `mvn clean verify` passed for all 305 Java source files. The bitwise, Jackson stream, and Bean Validation run commands above were smoke-tested successfully. This is not a full algorithm correctness test suite.
