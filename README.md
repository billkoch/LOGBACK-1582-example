# LOGBACK-1582 Example
Demonstrates the error encountered as part of [LOGBACK-1582](https://jira.qos.ch/browse/LOGBACK-1582)

## Points Of Interest
1. [src/test/resources/logback.xml](src/test/resources/logback.xml) configures Logback to use _both_ a `%replace` and `rootException` Converters. The `rootException` converter is configured to limit the stacktrace depth and filter out unnecessary packages from the stacktrace.
2. [src/test/java/logback1582/LoggingTest.java](src/test/java/logback1582/LoggingTest.java) A JUnit logback1582 to demonstrate the null pointer exception with the above `logback.xml` configuration.
