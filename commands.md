# Maven and Terminal Commands

This is a quick reference for navigating a project folder and building this Maven project. Run Maven commands from the folder that contains `pom.xml`—for this example, the `Maven` folder.

## Terminal basics

The first examples use Bash, which is common on Linux and macOS and is also available in Git Bash or WSL on Windows. The second column shows equivalent commands for PowerShell where syntax differs.

| What you want to do | Bash / Git Bash / WSL | PowerShell |
| --- | --- | --- |
| Show the current folder | `pwd` | `Get-Location` |
| List files and folders | `ls` | `Get-ChildItem` or `ls` |
| List files with details | `ls -l` | `Get-ChildItem` |
| Change to a folder | `cd Maven` | `cd Maven` |
| Go up one folder | `cd ..` | `cd ..` |
| Create a folder | `mkdir practice` | `New-Item -ItemType Directory practice` |
| Copy a file | `cp old.txt new.txt` | `Copy-Item old.txt new.txt` |
| Move or rename a file | `mv old.txt new.txt` | `Move-Item old.txt new.txt` |
| Print a text file | `cat README.md` | `Get-Content README.md` |
| Edit a file in a terminal editor | `vi filename.txt` | `notepad filename.txt` |

`ls -l` is Bash-style syntax; it is not the way to request a detailed listing in PowerShell. PowerShell's `ls` is an alias for `Get-ChildItem`, but it does not support all Bash options. `vi` may not be installed on Windows; use an editor that is installed, such as `code filename.txt` for Visual Studio Code or `notepad filename.txt`.

The command `mv` above moves or renames files in Bash. It is not a Maven command.

### Small terminal example

Imagine you are in the `Spring-Boot` folder and want to open this Maven project:

```text
pwd
ls
cd Maven
ls
```

`pwd` tells you where you are, the first `ls` helps you find the `Maven` folder, `cd Maven` enters it, and the second `ls` should show `pom.xml`, `README.md`, and `src`.

To rename a file in Bash, for example:

```text
mv notes.txt maven-notes.txt
```

This changes the filename from `notes.txt` to `maven-notes.txt`. To edit a file with `vi`, run `vi filename.txt`; the editor opens that file, and saving depends on the editor commands. On Windows, `notepad filename.txt` is a simpler alternative.

## Maven commands

| Command | Easy way to remember it | Example result |
| --- | --- | --- |
| `mvn --version` | “What Maven and Java do I have?” | Prints installed version details. |
| `mvn clean` | Clean the build’s workbench. | Removes generated files from `target`. |
| `mvn compile` | Turn `.java` source into `.class` files. | Compiled application classes appear under `target/classes`. The spelling is **compile**, not `copile`. |
| `mvn test` | Check whether the code passes its tests. | Runs `GreetingTest`; Maven reports the test results. |
| `mvn package` | Put the built project into a delivery box. | Creates `target/maven-basics-1.0-SNAPSHOT.jar` after running earlier build steps, including tests. |
| `mvn clean test` | Start fresh, then check the code. | Removes old output, recompiles, and runs tests. |
| `mvn clean package` | Start fresh, check, then make the JAR. | Removes old output, runs tests, and creates the JAR. |
| `mvn verify` | Run the build's later verification checks. | Builds through the `verify` phase, after packaging. |
| `mvn install` | Put this build in your local Maven toolbox. | Builds the artifact and copies it into your local Maven repository for other local projects. |
| `mvn help:help` | Ask Maven for command help. | Shows help for the Maven Help Plugin. |

Maven commands start with `mvn` followed by a lifecycle phase or plugin goal. For example, `compile`, `test`, and `package` are lifecycle phases. Running a later phase such as `package` also runs the earlier phases needed to reach it, including compilation and tests.

### Remember the build sequence

Think of preparing a school assignment:

1. **`clean`** — clear away the previous attempt.
2. **`compile`** — turn your source files into runnable class files.
3. **`test`** — check that the work behaves as expected.
4. **`package`** — put the finished work into a JAR.
5. **`install`** — save that JAR in your local Maven repository so another project on your computer can use it.

You can ask Maven to do the steps up to a point. For example, `mvn package` automatically does the earlier steps, so you usually do not need to type `mvn compile`, `mvn test`, and `mvn package` separately.

## Try these commands in this project

In your terminal, change to the project folder first. Replace the example path with where you saved this workspace:

```text
cd path/to/Spring-Boot/Maven
```

In PowerShell, a Windows path can be entered like this:

```powershell
cd "C:\path\to\Spring-Boot\Maven"
```

Then run:

```text
mvn --version
mvn clean test
mvn package
java -cp target/classes com.learning.mavenbasics.App
```

The application should print `Hello, Maven learner!`. After packaging, the JAR is under `target`.

If the terminal says that `mvn` is not recognized, install Maven and make sure its `bin` folder is on `PATH`, or use an IDE terminal configured with Maven. A JDK is also required.
