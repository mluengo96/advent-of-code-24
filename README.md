# Advent of Code Kotlin Template

Welcome to the **Advent of Code Kotlin Template**! This template is designed to streamline your setup process for each day’s challenge during Advent of Code. With automated day creation, organized file structure, and reusable utilities, you can focus more on solving the puzzles and less on setup.

## Requirements

This project requires:

- **Kotlin**: Version 1.9.24
- **JVM**: Java 8 or higher (The code targets Java 8 bytecode, so it can run on newer JVMs such as Java 11, Java 17, and Java 21).
- **Gradle**: Version 8.0 or higher (The included Gradle wrapper ensures compatibility).

If you’re using IntelliJ IDEA, verify your Project SDK by navigating to **File > Project Structure > Project SDK**. You can use the Gradle wrapper (`./gradlew`) to avoid needing a global Gradle installation.


## Getting Started

This repository is a **template repository**. To use it as a base for your own Advent of Code solutions:
1. Click the green **"Use this template"** button at the top of the page.
2. Select **"Create a new repository"** and give your new repository a name.
3. Follow the prompts to set up your new repository with this template.

For more details, GitHub's documentation on [using template repositories](https://docs.github.com/en/repositories/creating-and-managing-repositories/creating-a-repository-from-a-template) can help.

## File Structure

The template is organized to help you quickly navigate and manage code and inputs for each day:

```plaintext
advent-of-code-kotlin-template/
├── src/
│   ├── main/
│   │   ├── kotlin/
│   │   │   ├── DayTemplate.kt    # Template for each day’s main Kotlin file
│   │   │   ├── Utils.kt          # Utility functions shared across all days
│   │   │   ├── day01/            # Folder for Day 1
│   │   │   │   └── Day01.kt      # Solution code for Day 1
│   │   │   ├── day02/            # Folder for Day 2
│   │   │   │   └── Day02.kt      # Solution code for Day 2
│   └── resources/
│       ├── day01/
│       │   ├── Day01.txt         # Input file for Day 1
│       │   └── Day01_test.txt    # Test input file for Day 1
│       ├── day02/
│       │   ├── Day02.txt         # Input file for Day 2
│       │   └── Day02_test.txt    # Test input file for Day 2
└── createDay.ps1                 # PowerShell script to automate day setup
```

- Each day’s code and input files are organized in dayXX folders under src/main/kotlin and src/main/resources respectively.
- **DayTemplate.kt**: Contains a starting template for each day’s code, including placeholders for the main solution functions (part1, part2) and test validation.
- **Utils.kt**: Provides shared utility functions, such as readInput (for reading input files) and md5 (for hashing).

## Creating New Days
To create a new day with all the necessary files and structure:

1. Open a terminal/powershell (or the integrated terminal on your IDE) and navigate to the root of the project.
2. Run the following command, replacing X with the day number (e.g., 1 for Day 1)
   ```pwershell
   .\createDay.ps1 -day X
   ```
This script will automatically:

- Create a new folder for the day in src/main/kotlin and src/main/resources.
- Copy DayTemplate.kt and adjust the package names and file names for the specific day.
- Create empty input files (DayXX.txt and DayXX_test.txt) in the resources folder for that day.

After running the script, you’re ready to start coding in src/main/kotlin/dayXX/DayXX.kt and load your inputs from `src/main/resources/dayXX/DayXX.txt`.

## Usage of Utils.kt
Utils.kt provides helpful functions to speed up your workflow:

- `readInput`: Reads a list of strings from an input file (specified by name) within the appropriate day’s folder.
- `md5`: Converts a string into an MD5 hash, which can be useful for certain challenges.
- `println`: A shorthand for printing output that works as an extension function for easier output in solutions. (e.g `part1(input).println()`)

## Example usage
Here’s a typical workflow for a daily solution:

1. Run the day setup script to generate the necessary files.
2. Open the newly created DayXX.kt and start implementing part1 and part2.
3. Add any test inputs in DayXX_test.txt and your real inputs in DayXX.txt.
4. Use the readInput function to load inputs and check to verify outputs.

## Contributions and Feedback
If you’d like to suggest improvements, report issues, or contribute, feel free to submit a pull request or open an issue.
