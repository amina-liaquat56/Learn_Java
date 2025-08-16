
# Java Complete Course 

## Course Outline

1. Introduction to Java  
2. Basics of Java  
3. Control Flow  
4. Arrays & Strings  
5. Object-Oriented Programming (OOP)  
6. Exception Handling  
7. Java Collections Framework  
8. File Handling  
9. Advanced Java  
10. Java for Development  
11. Projects  

---

## 1️⃣ Introduction to Java
- What is Java? → High-level, object-oriented, platform-independent.  
- Features: Simple, Secure, Portable, Robust, Multithreaded.  
- JDK, JRE, JVM → Differences.  

### Example: Hello World
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

---

## 2️⃣ Basics of Java
- Data Types → int, float, double, char, boolean, String.  
- Variables & Constants.  
- Operators: Arithmetic, Relational, Logical, Assignment.  
- Type Casting.  
- Input/Output with Scanner.  

### Example: Input
```java
import java.util.Scanner;
class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);
    }
}
```

---

## 3️⃣ Control Flow
- If-else, Switch.  
- Loops (for, while, do-while).  
- Break & Continue.  

### Example: Loop
```java
for(int i=1; i<=5; i++) {
    if(i==3) continue;
    System.out.println(i);
}
```

---

## 4️⃣ Arrays & Strings
- 1D & 2D Arrays.  
- String methods: length(), substring(), charAt(), equals().  
- StringBuilder for performance.  

---

## 5️⃣ Object-Oriented Programming (OOP)
- Classes & Objects.  
- Constructors.  
- Methods (Static & Non-static).  
- Inheritance, Polymorphism, Encapsulation, Abstraction.  

### Example: Inheritance
```java
class Animal {
    void sound() { System.out.println("Animal makes sound"); }
}
class Dog extends Animal {
    void sound() { System.out.println("Dog barks"); }
}
public class Test {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
    }
}
```

---

## 6️⃣ Exception Handling
- Try, Catch, Finally.  
- Throw & Throws.  
- Custom exceptions.  

---

## 7️⃣ Java Collections Framework (JCF)
- List → ArrayList, LinkedList.  
- Set → HashSet, TreeSet.  
- Map → HashMap, TreeMap.  
- Queue → PriorityQueue.  

---

## 8️⃣ File Handling
- Reading & Writing files (File, FileReader, FileWriter).  
- Serialization & Deserialization.  

---

## 9️⃣ Advanced Java
- Multithreading (Thread, Runnable, Synchronization).  
- Lambda Expressions.  
- Streams API.  
- Generics.  
- Java 8 Features (Functional Interfaces, Method References).  

---

## 🔟 Java for Development
- JDBC (Database Connectivity).  
- JavaFX (GUI Applications).  
- Servlets & JSP (Web Apps).  
- Spring Boot (Enterprise Applications).  

---

## Projects

### Beginner
- Calculator  
- Student Management System  

### Intermediate
- Banking System  
- File Encryption Tool  

### Advanced
- E-commerce Backend (Spring Boot + Database)  
- Chat Application  

---

## 📖 How to Use this Course
1. Follow topics in order.  
2. Practice code examples.  
3. Build projects for hands-on learning.  
4. Explore advanced frameworks (Spring Boot, Hibernate).  

Happy Coding! 🚀  
