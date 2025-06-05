# Polynomial Calculator – Java GUI (MVC Architecture)

This project is a graphical **Polynomial Calculator** implemented in **Java**, using the **Model-View-Controller (MVC)** architecture. It allows users to input polynomials and perform operations such as addition, subtraction, multiplication, division, derivation, and integration.

---

## 🧠 Features

- Input two polynomials using a clean and simple interface
- Supported operations:
  - ➕ Addition
  - ➖ Subtraction
  - ✖️ Multiplication
  - ➗ Division
  - 🔼 Derivation
  - 🔽 Integration
- Displays formatted results dynamically in the UI

---

## 🖥️ User Interface (Java Swing)

- Built with **Java Swing**
- Components:
  - 5 `JLabel` elements for titles and labels
  - 2 `JTextField` inputs for polynomial entry
  - 6 `JButton` actions: Add, Subtract, Multiplicate, Divide, Derivate, Integrate
  - Dynamic result display area

---

## 🧩 Architecture Overview (MVC)

### Model (`model/`)
- `Monom`: represents a monomial (coefficient + degree)
- `Polynom`: parses polynomial strings into monomials using regex
- `Operation`: implements all math operations on polynomials

### View (`view/`)
- `Interface`: builds and manages the graphical UI with Swing

### Controller (`controller/`)
- `Controller`: handles user actions (button presses), connects UI and logic

---

## ⚙️ Technologies

- Java
- Java Swing
- MVC Design Pattern
- Regex for parsing expressions

---

## 🧪 Example Use

> Enter two polynomials like: `2x^3 + 6x^1 + 8x^0` and `5x^3 - 7x^2 + 2x^1`  
> Press "Subtract" → See result displayed: `-3x^3 + 7x^2 + 4x^1 + 8x^0`
<img src="https://github.com/user-attachments/assets/5f5d245c-327e-4e18-8667-8de1b96da0e9" width="500"/>

---


