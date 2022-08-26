# Project 0: Person201

This project uses a `Person201` class to keep track of data about many individuals. We will use this along with static utility methods from `Person201Utilities` and main/driver methods from `Person201Demo` and `Person201Finder` to search for individuals in Compsci 201 who are near each other on campus. You may be surprised how many classmates you find live or hang out near you! 

## Outline
- [Goals](#goals)
- [Starter Code and Using Git](#starter-code-and-using-git)
- [Developing and Running the classes in Project P0: Person201](#developing-and-running-the-classes-in-project-p0-person201)
- [Analysis Questions](#analysis-questions)
- [Submission, Reflect, Grading](#submission-reflect-grading)


## Goals

* Practice the workflow of a project in CompSci201
* See, edit, and run a multi-file Java program
* Create a Java class from scratch that is used by other Java classes
* Read data from a file in Java
* Practice introductory object-oriented programming
* Learn about using Git for project management.


## Starter Code and Using Git
**_You must have installed all software (Java, Git, VS Code) before you can complete the project._** You can find the [directions for installation here](https://coursework.cs.duke.edu/cs-201-fall-22/resources-201/-/blob/main/installingSoftware.md).

We'll be using Git and the installation of GitLab at [coursework.cs.duke.edu](https://coursework.cs.duke.edu). All code for classwork will be kept here. Git is software used for version control, and GitLab is an online repository to store code in the cloud using Git.

**[This document details the workflow](https://coursework.cs.duke.edu/cs-201-fall-22/resources-201/-/blob/main/projectWorkflow.md) for downloading the starter code for the project, updating your code on coursework using Git, and ultimately submitting to Gradescope for autograding.** We recommend that you read and follow the directions carefully this first time working on a project! While coding, we recommend that you periodically (perhaps when completing a method or small section) push your changes as explained in Section 5.


## Coding in Project P0: Person201

When you fork and clone the project, you'll be working primarily within the `src` folder with `.java` files beginning with `Person201.java`. You will modify two programs/classes (`Person201.java` and `Person201Utilities.java`), and will run `Person201Demo.java` to see if your changes are working. Then you will create a new program called `Person201Finder.java`.

The following subsections sections detail the specific action items you should take while completing this project. To see the details for a section, just click the small arrow to expand the information, or click the small arrow again to collapse those details.

### Run `Person201Demo.java`

First, without changing anything, run the main method in `Person201Demo.` The output of the program (not counting terminal commands to compile and run the program) should be:

```
Searching for people near Fain

People on the same floor: 

People in the same building: 
        -Wiseman, LSRC, 1
        -Astrachan, LSRC, 2
        -Stephens-Martinez, LSRC, 2
```


Take a careful look at the main method you just ran. Note that it creates `Person201` **objects**. Those are defined in the `Person201` **class**, which you can see in the `Person201.java` file. You can also see that it reads data about persons from a file by calling the static `readFiles` method defined in `Person201Utilities.java`. The particular file, `small.txt`, contains data about a few of your professors and their office locations; the file is in the `data` folder of your project and you can view it directly in Visual Studio Code.

The main method you ran from `Person201Demo` is *supposed* to define a query person and then search for all other persons in the provided data file `small.txt` that are on the same floor of the building or at least in the same building, and print those lists to the screen. You can already see that something is not quite right: `Wiseman, LSRC, 1` is on the same floor (`1`) of the same building (`LSRC`) as the query person `Fain, LSRC, 1`, but is not printed under the heading `People on the same floor:`. Your first two tasks will be to fix this.


### Fix Person201

Take a look at the `Person201.java` file. This is the class that defines `Person201` objects. 

### Running Person201Scanner from a Web Source
<details>
<summary>Scanning from a Web source</summary>

In the `main` method of `Person201Scanner` create a new `String` variable after the first line, as shown below (you can copy/paste):
```bash
String url = "https://courses.cs.duke.edu/compsci201/current/data/medium.txt";
```
Then change the assignment to variable list so that it is:
```bash
Person201[] list = readURL(url);
```
Run the program and note the last name and the number of names printed to answer the questions in the reflect form linked at the end of this document.
</details>

### Create and Run a New Java Class: **Person201Solo.java**
<details>
<summary>Creating and running a new class</summary>


In the `src` folder create a new Java class named `Person201Solo` that has only a `public static void main(String[] args) method` that allows the program to run (the `main` method is the launch point for all Java programs when they are executed). See `Person201Driver` for details and an example of a `main` method. In the new `main` method, you should define a `Person201` object as shown below and print using `System.out.println(person)` so that the main method has two statements.

```
Person201 person = new Person201("Sam", -77.846, 166.668, "cold");
System.out.println(person);
```
</details>

## Analysis Questions

Answer the following questions in your analysis. You'll submit your analysis as a separate PDF as a separate assignment ***to Gradescope***. 

### Question 1
How many instance variables are there in `Person201`?

### Question 2
How many constructors are there in `Person201`?

### Question 3
In the Person201Scanner class there are two methods:readFile and readURL. Briefly describe what these methods do and comment on their similarities and their differences.

### Question 4
When Person201Scanner is run with the URL for the online medium.txt file, how many entries are printed?

### Question 5
When Person201Scanner is run with the URL for the online medium.txt file, what is the last name printed?

***After completing the analysis questions you submit your answers in a PDF to Gradescope in the appropriate assignment.***

## Submission, Reflect, Grading
You will submit the assignment on Gradescope. You can access Gradescope through the tab on Sakai. The [project workflow writeup](https://coursework.cs.duke.edu/cs-201-fall-22/resources-201/-/blob/main/projectWorkflow.md) explains the how to submit your project in detail. In particular, you cannot submit unless all your code has been pushed to your Git repository on coursework. Be sure to push changes often and be sure your final program is in your Git repository before you submit it for autograding on Gradescope. Please take note that changes/commits on GitLab are NOT automatically synced to Gradescope. You are welcome to submit as many times as you like, only the most recent submission will count for a grade.

After completing and submitting the code and analysis on gradescope, fill out the [reflect form here](https://forms.office.com/Pages/ResponsePage.aspx?id=TsVyyzFKnk2xSh6jbfrJTErNjWEU70pGg_ytfEVEPi5UQ1hUUTlZTjEwWVNTWUJMTDdTSjBXRERUTy4u).


### Grading
Your submission will be graded by the following rubric:

| Class Modified | Points |
| ------ | ------ |
| Person201 | 4 |
| Person201Driver | 4 |
| Person201Solo | 4 |
| Analysis | 4 |

The first three categories will be autograded on Gradescope, the analysis will be graded by teaching assistants.
