Singleton Pattern Principles

- Create one single class and make sure that only one instance of the class exist on JVM
- The class should be provided global access and the constructor should be private not to be able to re-initialize it again
- The variables should be private
- The abstract method should be public to get the instance
- Used for DB connection, Logs, Cashing etc
