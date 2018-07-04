# HackerRankSolutions

Alexa has two stacks of non-negative integers where index denotes the top of the stack. Alexa challenges Nick to play the
following game:

In each move, Nick can remove one integer from the top of either stack or stack .

Nick keeps a running sum of the integers he removes from the two stacks.

Nick is disqualified from the game if, at any point, his running sum becomes greater than some
integer given at the beginning of the game.

Nick's final score is the total number of integers he has removed from the two stacks.

Given A, B, and X for games, find the maximum possible score Nick can achieve (i.e., the maximum
number of integers he can remove without being disqualified) during each game and print it on a new
line.

Input Format
The first line contains an integer, (the number of games). The subsequent lines describe each
game in the following format:
1. The first line contains three space-separated integers describing the respective values of (the
number of integers in stack ), (the number of integers in stack ), and (the number that the
sum of the integers removed from the two stacks cannot exceed).
2. The second line contains space-separated integers describing the respective values of A.
3. The third line contains space-separated integers describing the respective values of B.
