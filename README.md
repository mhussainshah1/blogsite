**Week Four Challenge: Blog Site**

**This is a collaborative weekly challenge. You will be working with a partner to build out the site and submitting one GitHub repository.**

Create a blog site that contains multiple entries about topics we have covered so far in this bootcamp.

+ Each blog entry should have a date, title and content body.
+ The home page should display a list of the blog entries. However, the content for each entry is not shown entirely. The user should be able to click a "View Details" or "View More" link from each blog entry that will take them to another page that displays that entire blog entry.
+ There should be a profile page for the blog authors that includes their names, a short bio, profile photos, and links to their social media sites (LinkedIn, GitHub, Twitter, Facebook, etc.). The social media links should also include icons representative of which social media platform.
+ Include a page that describes the bootcamp.
+ The blog site should have a navigation bar that's present on all pages.
+ Use Bootstrap and Google Fonts.
+ Make the site look nice and professional.
+ Given the following categories, create at least two blog entries per category:

1. GitHub
1. Program Design & Algorithms
1. Core Java
1. Object-oriented Java
1. HTML/CSS/Bootstrap

Sample site screenshots:

[home.PNG](/src/main/resources/img)
[entry.PNG](/src/main/resources/img)
[about.PNG](/src/main/resources/img)
[profile.PNG](/src/main/resources/img) 

**Presentation**

You may work on your blog site over the weekend. **The assignment is due on Monday at 10:30 am** at which time you shall take a break. Starting at 11 am each group shall present their site to the entire class. Each presentation should be no more than 10 minutes


--------------------------------

##Polymorphism

Polymorphism is the ability of an object to take on many forms. The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.

Any Java object that can pass more than one IS-A test is considered to be polymorphic. In Java, all Java objects are polymorphic since any object will pass the IS-A test for their own type and for the class Object.

It is important to know that the only possible way to access an object is through a reference variable. A reference variable can be of only one type. Once declared, the type of a reference variable cannot be changed.

The reference variable can be reassigned to other objects provided that it is not declared final. The type of the reference variable would determine the methods that it can invoke on the object.

A reference variable can refer to any object of its declared type or any subtype of its declared type. A reference variable can be declared as a class or interface type.

A common example of polymorphism is constructors:

```
public class Person {

    private String name;
    private String gender;
    private int age;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
} 
```

The following code all utilize the concept of polymorphism. There can be multiple instances of the Person() constructor method with the distinguishing feature among them all is the amount of parameters they take in. So in other words, you can create a new Person object from the Person class with a stated Name, Name and Gender, or Name, Gender, and Age.