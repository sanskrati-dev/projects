# Tic Tac Toe

A 2-player terminal-based Tic Tac Toe game built in Java.

## Features
- 2 player mode (Player X vs Player O)
- Matrix-based 3x3 grid display
- Detects win and draw conditions automatically
- Validates already-taken positions
- Mid-game exit using Ctrl+C

## How to Run

**Compile:** javac Tic_Tac_Toe.java
**Run:**java Tic_Tac_Toe

## How to Play
- Players take turns entering row and column numbers (1-3)
- Example: row `1` col `2` places your character at position (1,2)
- Player X always goes first
- Game ends automatically on win or draw

## Game Logic
- `checkwin()` — checks all rows, columns and both diagonals
- `checkdraw()` — returns true when no empty cell is left
- `board()` — updates and displays the grid after every move