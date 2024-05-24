## False positive UnusedVariable when a method parameter is only used in descendants

To reproduce run:
```
./gradlew compileJava
```

Expected result: everything compiles successfully.

Observed result: 

```
errorprone-issue-reproducers/unused-variable-overloaded-method/src/main/java/com/example/App.java:5: warning: [UnusedVariable] The parameter 'usedInDescendants' is never read.
        protected void doStuff(String usedInDescendants) {}
                                      ^
    (see https://errorprone.info/bugpattern/UnusedVariable)
  Did you mean 'protected void doStuff() {}'?
error: warnings found and -Werror specified
```


ErrorProne considers the parameter of the base method unused, even though it is used in the overriden implementation, which is declared in the same file.

Making `Base` class non-private makes the warning go away.