```java
Classfile /E:/github/Technology/Kafka/kafka/src/main/java/Test.class
  Last modified 2021年10月19日; size 277 bytes
  MD5 checksum 9b944430a2ff7cd5180e137ca1651433
  Compiled from "Test.java"
public class Test
  minor version: 0
  major version: 55
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #4                          // Test
  super_class: #5                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 2, attributes: 1
Constant pool:
   #1 = Methodref          #5.#14         // java/lang/Object."<init>":()V
   #2 = Class              #15            // A
   #3 = Methodref          #2.#14         // A."<init>":()V
   #4 = Class              #16            // Test
   #5 = Class              #17            // java/lang/Object
   #6 = Utf8               <init>
   #7 = Utf8               ()V
   #8 = Utf8               Code
   #9 = Utf8               LineNumberTable
  #10 = Utf8               main
  #11 = Utf8               ([Ljava/lang/String;)V
  #12 = Utf8               SourceFile
  #13 = Utf8               Test.java
  #14 = NameAndType        #6:#7          // "<init>":()V
  #15 = Utf8               A
  #16 = Utf8               Test
  #17 = Utf8               java/lang/Object
{
  public Test();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 1: 0

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=2, args_size=1
         0: new           #2                  // class A
         3: dup
         4: invokespecial #3                  // Method A."<init>":()V
         7: astore_1
         8: return
      LineNumberTable:
        line 4: 0
        line 5: 8
}
SourceFile: "Test.java"

```

```java
Classfile /E:/github/Technology/Kafka/kafka/src/main/java/Test.class
  Last modified 2021年10月19日; size 283 bytes
  MD5 checksum cc55681e1154d3437878416135f11c19
  Compiled from "Test.java"
public class Test
  minor version: 0
  major version: 55
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #4                          // Test
  super_class: #5                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 2, attributes: 1
Constant pool:
   #1 = Methodref          #5.#14         // java/lang/Object."<init>":()V
   #2 = Class              #15            // A
   #3 = Methodref          #2.#14         // A."<init>":()V
   #4 = Class              #16            // Test
   #5 = Class              #17            // java/lang/Object
   #6 = Utf8               <init>
   #7 = Utf8               ()V
   #8 = Utf8               Code
   #9 = Utf8               LineNumberTable
  #10 = Utf8               main
  #11 = Utf8               ([Ljava/lang/String;)V
  #12 = Utf8               SourceFile
  #13 = Utf8               Test.java
  #14 = NameAndType        #6:#7          // "<init>":()V
  #15 = Utf8               A
  #16 = Utf8               Test
  #17 = Utf8               java/lang/Object
{
  public Test();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 1: 0

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=2, args_size=1
         0: aconst_null
         1: astore_1
         2: new           #2                  // class A
         5: dup
         6: invokespecial #3                  // Method A."<init>":()V
         9: astore_1
        10: return
      LineNumberTable:
        line 4: 0
        line 5: 2
        line 6: 10
}
SourceFile: "Test.java"

```

