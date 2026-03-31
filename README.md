# Train Consist Management App

A simple Java console application that demonstrates train bogie capacity management using a `HashMap`.

## Features

- Stores bogie types and passenger/cargo capacities in a map.
- Prints all bogie-capacity pairs to the console.
- Uses Java Collections (`Map`, `HashMap`) in a beginner-friendly example.

## Project Structure

```text
TRAIN-CONSIST-MANAGEMENT-APP/
|- LICENSE
|- README.md
|- src/
   |- TrainConsistManagementApp.java
```

## Requirements

- Java Development Kit (JDK) 8 or newer

## Build and Run

From the project root:

```powershell
javac src/TrainConsistManagementApp.java
java -cp src TrainConsistManagementApp
```

## Example Output

```text
============================

Map Bogie to Capacity (HashMap)
============================

Bogie Capacity Details:

First Class -> 24
Cargo -> 120
Sleeper -> 72
AC Chair -> 56
```

## License

This project is licensed under the terms of the LICENSE file.