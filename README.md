## Reproducer for [testcontainers-java#4110](https://github.com/testcontainers/testcontainers-java/issues/4110)

To reproduce with testcontainers 1.15.3:

```
$ ./gradlew test

> Task :test

Issue4110 > containerWithTty() FAILED
    org.opentest4j.AssertionFailedError: Log output should contain at least one line separator ==> expected: <true> but was: <false>
        at org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:55)
        at org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:40)
        at org.junit.jupiter.api.Assertions.assertTrue(Assertions.java:193)
        at tv.hibox.testcontainers.Issue4110.containerWithTty(Issue4110.java:25)

2 tests completed, 1 failed

> Task :test FAILED

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':test'.
> There were failing tests. See the report at: file:///home/slovdahl/dev/testcontainers-issue-4110-reproducer/build/reports/tests/test/index.html

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 8s
2 actionable tasks: 1 executed, 1 up-to-date
```