Tic-Tac-Toe

Given a tic-tac-toe board, output whether or not a player can win on their next turn. Players alternate between placing tiles on a 3-by-3 grid and the first player that creates a full row, column, or diagonal with their symbol wins.
Input

The first line contains one integer, t, the number of test cases (1 ≤ t ≤ 100). For each test case, the first three lines will consist of a row of the tic-tac-toe board, where "." is an empty space. The next line in each test case will be either "x to move" or "o to move". It is guaranteed that the board is not already won by either player.
Output

For each test case, output "x can win" if it is x to move and they can win on their next turn. Output "o can win" if it is o to move and they can win on their next turn. If the player moving next cannot immediately win on their turn, output "no winning move" (all lowercase).
Sample test cases
Input

2
xoo
o.x
x.x
x to move
..o
...
xo.
o to move

Output

x can win
no winning move

Before submitting

    Make sure your solution works with the sample test case
    Outputs are case sensitive - which letters are uppercase and lowercase matter
    We suggest using judge0's IDE to write your code; other compilers may not be using the same version as the grader
