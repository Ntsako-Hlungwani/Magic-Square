# Magic-Square
This Java program generates magic squares of odd sizes, checks input validity, and optionally rotates the square. The user inputs the square size (must be odd) and the number of clockwise rotations. The program outputs the original or rotated magic square.
This Java program generates and manipulates magic squares. Here's a step-by-step description of what the program does:
User Input: The program starts by taking input from the user. It prompts the user to enter two values:
n: The size of the magic square, which must be an odd integer.
rotation: The number of 90-degree clockwise rotations to apply to the magic square.
Input Validation: It checks if n is an odd number. If n is not odd, the program throws a RuntimeException, indicating that the size of the magic square must be an odd number.
Magic Square Generation:
An empty 2D array named Square is created to represent the magic square.
A loop is used to fill the Square array with numbers in a specific pattern that creates a magic square. The filling starts from the middle of the top row and proceeds diagonally upward and to the right. The algorithm ensures that each cell in the square is filled with a unique number from 1 to n^2, such that the sum of each row, column, and diagonal is the same (the magic constant).
Printing the Original or Rotated Magic Square:
If rotation is 0, the program prints the original magic square.
If rotation is greater than 0, it performs the specified number of 90-degree clockwise rotations on the magic square. Each rotation involves swapping elements in the array to achieve the desired rotation effect.
After performing the rotations (if any), the program prints the resulting magic square.
In summary, the program generates a magic square of the specified size and then allows the user to rotate it by 90 degrees clockwise if desired. It then displays the original or rotated magic square based on the user's input. The magic square properties ensure that the sums of rows, columns, and diagonals are all equal, creating a visually interesting and mathematically significant square pattern.
