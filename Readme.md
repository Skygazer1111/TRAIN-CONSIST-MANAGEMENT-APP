# Train Consist Management App

A lightweight Java console project that models train bogie capacities using Java Collections.

## Project Summary

- Language: Java
- App type: Console application
- Main source file: `src/TrainConsistManagementApp.java`
- Current data structure in use: `HashMap<String, Integer>`
- Repository: `https://github.com/Skygazer1111/TRAIN-CONSIST-MANAGEMENT-APP.git`
- Default/release branches visible: `main`, `develop`, and feature branches
- License: MIT

## What the App Does

The program maps bogie type names to capacity values and prints all map entries.

Current bogie-capacity pairs in code:

| Bogie Type   | Capacity |
|--------------|----------|
| First Class  | 24       |
| Cargo        | 120      |
| Sleeper      | 72       |
| AC Chair     | 56       |

## Current Implementation Details

- Imports:
	- `java.util.Map`
	- `java.util.HashMap`
- Entry point:
	- `public static void main(String[] args)`
- Processing flow:
	1. Print a heading.
	2. Create a `HashMap` for bogie capacities.
	3. Insert four entries.
	4. Iterate with `for (Map.Entry<String, Integer> entry : capacityMap.entrySet())`.
	5. Print each pair in `key -> value` format.

## Important Behavior Note

Because `HashMap` is used, iteration order is not guaranteed. The lines for bogie entries may appear in different orders across runs/JDK implementations.

## Repository Structure

```text
TRAIN-CONSIST-MANAGEMENT-APP/
|- .gitignore
|- LICENSE
|- Readme.md
|- src/
	 |- TrainConsistManagementApp.java
```

## .gitignore Coverage

The repository ignores common generated files for:

- IntelliJ IDEA
- Eclipse/STSv4
- NetBeans
- VS Code (`.vscode/`)
- macOS metadata (`.DS_Store`)
- Java bytecode (`.class`)

## Build and Run

### Requirements

- JDK 8 or newer
- `javac` and `java` available on `PATH`

### Commands (PowerShell)

```powershell
javac src/TrainConsistManagementApp.java
java -cp src TrainConsistManagementApp
```

### Expected Console Shape

```text
============================

Map Bogie to Capacity (HashMap)
============================

Bogie Capacity Details:

<BogieName> -> <Capacity>
... (4 entries)
```

## Environment Verification Status

In the current environment used for validation, Java tools were not available:

- `javac` not recognized
- `java` not recognized

If you see the same issue, install a JDK and restart terminal/VS Code so `PATH` updates are applied.

## Branch and Progress Context

Visible branch workflow shows iterative feature development (UC-style milestones), including:

- `feature/UC1` to `feature/UC6`
- `main` for merged baseline milestones
- `develop` for integration

Recent milestones indicate the project evolved through collection topics such as sets, ordering, and mapping, with this current version focusing on bogie-capacity mapping via `HashMap`.

## Potential Enhancements

- Accept user input for bogie types/capacities.
- Validate capacity values.
- Persist data to file or database.
- Add unit tests for mapping and printing logic.
- Offer ordered output (`LinkedHashMap` or sorted keys).
- Add package structure and build automation (Maven/Gradle).

## License

This project is licensed under the MIT License.

Copyright (c) 2025 Cosmos-0118
