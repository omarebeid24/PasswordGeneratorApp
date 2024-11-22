# Password Generator App

This **Java-based application**, built with a **Graphical User Interface (GUI)**, enables users to generate secure passwords tailored to their preferences, ensuring robust security for various purposes.
You can apply the attached files with scene builder for GUI or Run the following commands.

---

## Features

- **Customizable Password Length**: Specify the desired length of the password.
- **Character Type Selection**: Choose to include:
  - Uppercase Letters
  - Lowercase Letters
  - Numbers
  - Symbols
- **User-Friendly Java GUI**: An intuitive and interactive interface for easy navigation and password generation.

---

## Prerequisites

Before using the app, ensure the following are installed on your system:

- **Java Development Kit (JDK)**: Required for compiling and running Java applications.
- **Java Runtime Environment (JRE)**: Required to execute Java programs.

---

## Installation

Follow these steps to set up and run the application:

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/omarebeid24/PasswordGeneratorApp.git

2. **Navigate to the Project Directory**:
    ```bash
       cd PasswordGeneratorApp

  3. **Compile the Application**:
   - Use the following command to compile the Java code into a `bin` directory:
     ```bash
     javac -d bin src/com/passwordgenerator/*.java
     ```

4. **Run the Application**:
   - Launch the application using the following command:
     ```bash
     java -cp bin com.passwordgenerator.PasswordGeneratorApp
     ```

---

## Usage

1. **Launch the Application**:
   - Run the application using the command above. The GUI will open, providing an intuitive interface for password generation.

2. **Set Password Criteria**:
   - **Length**: Enter the desired length of the password.
   - **Character Types**: Select the character types to include:
     - Uppercase Letters
     - Lowercase Letters
     - Numbers
     - Symbols

3. **Generate Password**:
   - Click the **"Generate"** button.
   - The password will appear in the output field.

4. **Copy Password**:
   - Click the **"Copy"** button to copy the password to your clipboard for easy use.

---

## Built With

- **Java Swing and AWT**: For creating the interactive graphical user interface.
- **Java Programming Language**: For implementing the password generation logic.

---


