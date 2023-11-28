# Algorithm

This is the code for our final project in SFWE 301.

### Building
```
$ gradle assemble
```

### Testing
```
$ gradle test
```

### Generating JAR

JAR file will can then be found at `lib/build/libs/lib.jar`
```
$ gradle jar
```

### Usage
The `MatchingEngine` class can be used with either the provided scholarship and
applicant classes or any other class that implements the `IApplicant` and
`IScholarship` interfaces.
```java
include java.utils.ArrayList;
include algorithm.MatchingEngine;
include algorithm.Scholarship;
include algorithm.Applicant;
include algorithm.MatchingResult;


public class Demo {
    public static void main(String[] args) {
        Applicant a = new Applicant();
        Scholarship[] scholarships = new Scholarship[10];
        ...
        ArrayList<MatchingResult<Scholarship>> results = MatchingEngine.match(a, scholarships);
    }
}

```

```java
include java.utils.ArrayList;
include algorithm.MatchingEngine;
include algorithm.IScholarship;
include algorithm.IApplicant;
include algorithm.MatchingResult;


class CustomApplicant implements IApplicant {
    ...
}

class CustomScholarship implements IScholarship {
    ...
}


public class CustomDemo {
    public static void main(String[] args) {
        CustomApplicant a = new CustomApplicant();
        CustomScholarship[] scholarships = new CustomScholarship[10];
        ...
        ArrayList<MatchingResult<CustomScholarship>> results = MatchingEngine.match(a, scholarships);
    }
}

```
