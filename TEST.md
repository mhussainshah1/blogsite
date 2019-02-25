## Program Design
<quote>"The hardest single part of building a software system is deciding precisely what to build." —Fred Brooks</quote>

When writing a program you need to begin with a solid understanding of the problem you intend to solve. Then, move on to understanding the data you will be using in your solution. Your program will use data in variables, constants and literals. Your program will also contain data structures, files and data validation.

### Overview: Developing software solutions
Requirements and design phase:
+ Define the problem to be solved.
+ Outline your solution on paper.
+ Develop the outline into an algorithm.
+ Test the algorithm for correctness.
+ Document your solution.
Implementation and verification phase:
+ Code the algorithm into a specific programming language.
+ Run the program on the computer.
+ Test your program, make corrections.
+ Repeat.
Maintenance phase:
+ Document and maintain the program.

### Three different approaches to program design:
+ Procedural-driven
    + Example: C, Fortran, Basic
+ object-oriented / event-driven
    + Example: Java, C#
+ data-driven program design (called symbolic programming)
    + Example: LISP
### Top-down development
Top-down development is an approach to software development. The designer formulates an overview of the problem. The designer then determines the necessary subsystems or components required to solve the problem. Each component is further refined in greater detail. At some point a solution emerges. Top-down development emphasizes planning.

### Algorithm
An algorithm is a set of detailed, unambiguous and ordered instructions. An algorithm illustrates steps to convert given input into the desired output.

### Pseudocode
Pseudocode is an English language-like way of representing the algorithm

Advantages of Pseudocode
<br/>
Conventions for Pseudocode
-----------------------------------------------------------------------------------------------------------
## Publishing your repository

### What is a repository?
A repository is a storage space where you can access your project, its files, and all the versions of its files that Git saves.

### Create an empty repository on GitHub
Before you can push your local repository to GitHub you first need to create an empty repository.

When you browse to your GitHub account you can click on the new repository button. The button looks like a plus sign and is found at the top right of the website.

Alternatively, you can simply browse to [https://github.com/new](https://github.com/new). Fill in the name your repository and click the large green button at the bottom of the page to finish the process of creating it. Your repository will be located at **https://github.com/{your GitHub user name}/MyNewRepository**

### Pushing your local repository to GitHub
Now that you have a repository you can go back to your PC and push your existing repository to the one you just created. Make sure you have configured your commit author and email.

Next, you need to tell your local version of Git about the remote repository. Your local branch is called **master**. Your remote branch is called **origin**.

You do this by typing:
`git remote add origin https://github.com/<your GitHub user name>/Products`

The `git remote` command will add a new remote section called origin to our configuration.

View the git configuration with `git config --list` to check if your remote repository is initialized.

Running `git remote` without any arguments will show you the remote repository aliases.

If you run the command with the -v option, as `git remote -v`, you can see the actual URL for each alias.

------------------------------------------------------

