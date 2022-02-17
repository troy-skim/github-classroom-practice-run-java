# Java Project Practice Run

Welcome to your first Java programming assignment.

## The goal

The goal of this assignment is to introduce you to the work environment you will use to complete assignments in this course.

## Where we are

A quick explanation of what is going on here.

### Forked repository

If you are viewing this file, then you have most likely **forked** a copy of a **repository** of code. This means that you have made a copy of this repository of code into your own personal account on GitHub.com.

### Clone repository

You will shortly **clone** this personal repository of yours to your own _local_ computer. You may have done this already. Your original copy of this code on GitHub will still remain there, but you will have an additional copy on your own machine.

### Editing code

You will make changes to your local copy of the code using a code editor. And, when you are done modifying the code, you will **push** - i.e. upload - your changes back to your repository on GitHub.com. Doing so shares the changes you made on your own computer with the course instructor and graders who will look at the code in your repository on GitHub.com. This is how you will submit assignments and possibly exams.

### Git

Whether you do so knowingly or not, you are using software called **git** in order to clone - i.e. download - this code to your local machine. You will also use git to push - i.e. upload - your modified code back to GitHub.com when you are done with the assignment.

Git is open source software for **version control**. It helps programmers keep an archive of all the changes they make to their code, and it helps them share those changes they make with other developers.

In our case, you will be using git to share your modified code with the course instructor and graders. You will likely never directly use git - rather, the code editor software we use will trigger git to upload or download code on your behalf without you even knowing it.

### Code editor

To make changes to this code, you will need a **code editor**, also known as an **integrated development environment** (IDE). An IDE or code editor is software that helps developers edit and debug code visually.

Our code editor of choice is [Visual Studio Code](https://code.visualstudio.com), by Microsoft. This is a good free code editor with useful features to help edit and debug code written in most popular programming languages, including Java.

### Folder structure

Each Java project will have several important directories:

- `src` - contains the Java source code for the project (i.e. `.java` files)
- `test` - contains code that will help us determine whether the code you have written behaves correctly. Do not touch this directory!
- `bin` - contains the compiled code (i.e. `.class` files)
- `lib` - contains any dependencies (other libraries of code that the project depends upon to work)

If your project has no dependencies and has not been compiled, you may not see the `lib` or `bin` directories.

You will notice that this project already contains several files.

- **README.md** - this file contains instructions written in a relatively easy-to-read formatting notation called Markdown.
- **.gitignore** - a 'hidden' file that instructs the git software not to include certain files when sharing your code with others. This helps you only share the important files. Do not touch this file!
- **src/edu/nyu/cs/git_practice_run/App.java** - you will write Java code in this file in order to complete the given assignment.

## What to do now

Before you can work on the assignment, you will need to perform a few setup tasks.

### Install Visual Studio Code

Download and install the latest version of Visual Studio Code [here](https://code.visualstudio.com).

### Install the Java extensions

Visual Studio code is a general purpose IDE. The specific tools that are most helpful for developing in a particular programming language are not included in Visual Studio Code by default. So we will also install some extensions (a.k.a. plug-ins) and change some settings to make Visual Studio Code most suitable for Java development.

Install the Java Extension Pack for Visual Studio Code:

- Open Visual Studio Code
- Click the Extensions icon in the left bar (the icon that looks like building blocks).
- Search extensions for the keyword, 'java'.
- One of the top results will be the extension simply named "Extention Pack for Java" by Microsoft. Install it!

### Clone this code to your local computer

We will now download this code from GitHub.com into Visual Studio Code on your own computer...

- Open Visual Studio Code
- click the Source Control icon in the vertical activity on the left, and then click the button to "Clone Repository".
- A text field will pop open at the top of Visual Studio Code for the web address of the repository to clone. Paste in the address of your personal repository on GitHub and hit Enter.
- A Finder (Mac) / File Explorer (Windows) window will pop open asking you where you would like to save the files in this project. Select a folder/directory where you would like to copy this code, such as your Documents directory.
- Visual Studio Code may ask you to "sign in" to GitHub... do so, if requested.
- Once signed in, Visual Studio Code will download a copy (i.e. a clone) of all the files in your GitHub code repository to a sub-directory of the directory on your own computer that you selected.
- Now open this directory up in Visual Studio Code to see the files.

### Configure the project's Java settings

- Click on the Explorer icon in Visual Studio Code's left tool bar (the icon that looks like two pieces of paper) - this shows the files in the project.
- In the `src/edu/nyu/cs/git_practice_run` directory, click on the file named `App.java`.
- Now click on the Run icon in the tool bar (the icon with a play button with a bug next to it) - this is where you can run the code
- Click the link to "Create a launch.json file". A list of configuration options will appear... click the option that indicates no build tool will be used.
- Make sure the Run icon is still selected. You will see a green play button at the top left that will run the program... click it.
- Nothing especially interesting will happen, but you should not see an error.

### Set up the testing framework

In the sample assignment, we have included code that will tell you whether the code in the project is running correctly. Set up the testing framework in Visual Studio Code. [A video tutorial](https://www.youtube.com/watch?v=Af6Ka0Bmflo) outlines the process and shows how to overcome most problems:

- Click on the Test icon in Visual Studio Code's left activity bar.
- A Run Tests play button will appear towards the top-left of the window. Click it to run the tests.
- If the tests pass, you will not notice anything happen... no error and no change is good! Everything works!
- Sadly, the tests will fail because you have not completed the assignment yet!
  A small little icon in the Visual Studio Code status bar at the bottom of the window will show an "X" icon indicating that some tests failed. If they all pass, it will show only a checkmark icon indicating that all tests passed.

Now you are ready to modify the code!

## Modify the code

You have now completed the setup and are ready to modify the code, as you will in every assignment.

### Add a few lines of code

You will now add a few line of Java code to the sample program.

- In Visual Studio Code's Explorer view, open the file named `App.java`.
- At the very end of the file into the `main` function, write the following new lines of code... try writing them yourself, not copy-and-pasting.
- Save the file.

```java
public static void main(String[] args) {
    System.out.println( foo("Hello", "world!") );
    System.out.println( bar() );
    baz();
}
```

### Verify that the tests pass

We will verify that the test programs we have written now all pass. Failed tests help identify problems in the code.

- Open the relevant test file from within the `test` directory.
- Switch to the Test view in Visual Studio Code by clicking the relevant icon in the activity bar.
- Click the "Run All Tests" button - the green play button that appears if you hover the cursor over the top-left area of the window.
- The status of each test will appear - a green checkbox for tests that passed and a red "X" for tests that failed.
- If any tests fail, it is likely that something is wrong in the code you modified - verify the code is correct and try again.
- Each test that fails will show a message with some indication of what went wrong - these messages may help you pinpoint the source of the error.

If you have trouble running the tests from within Visual Studio Code, you can do them from within a Terminal window, assuming the project directory is the current working directory (change `TestClassName` to the relevant name fo the test class.)

```bash
java -cp "bin:lib/*" org.junit.runner.JUnitCore edu.nyu.cs.TestClassName
```

Windows users should replace the `:` in `"bin:lib/*"` with a semi-colon, `;`, i.e. `"bin;lib/*"`

### Run the program

We will now try to run the program - this time, we should see some output produced by our changes.

- Switch to the Run view in Visual Studio Code's activity bar.
- Click the Run icon (the green play button towards the top-left of the window).

### Verify the output is correct

Running the program should have produced 3 lines of output in the Terminal panel at the bottom of the Visual Studio Code window.

- Confirm the following three lines of text appear in the Terminal window:

```
Hello world!
Hello world!
Hello world!
```

## How to submit this assignment

Once you have completed your changes to this project, you are ready to submit it. Do this from within Visual Studio Code.

1. Click on the `Source Control` icon in the left activity bar in Visual Studio Code.
1. In the Source Control side bar, you will see a field named `Message` - type in a unique message about what you have done, e.g. "_Finished assignment!_" or whatever you want to write as a short note to yourself.
1. Hover over the words `Source Control`. You will see a `...` icon appear - click it to see a menu. In that menu, click `Commit`->`Commit`. This logs the changes you've made to the Git project - remember Git is used to keep track of changes.
1. Go to the same menu and click `Push` to submit your assignment - this uploads your updated files to the copy of your respository on GitHub.

![Push changes to GitHub](./images/how_to_push_changes_to_github_from_vscode.png)

That's it... you're done.

## Double-check your submission

Prove to yourself that you have correctly submitted by viewing your repository on the GitHub website - you should see your completed files there.

## Resubmit as many times as you want

You can re-submit as many times as you want before the deadline. Just make changes to the files on your own computer and repeat the process outlined above to upload them to GitHub.
