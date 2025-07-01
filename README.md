[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=19875975)
# scrabbleGame

Scrabble Game 

For this assignment use your OOD and ArrayList skills and binary search algorithm to make a simple Scrabble-like game.  This game will give the user 4 random letters.  

* Create a Word object class and a ScrabbleGame class to read in the Word objects into a sorted ArrayList of Words. Read in the words and make the Word objects using the text file called "CollinsScarbbleWords_2019.txt".
* Have your game then choose 4 random characters, and output these to the user.
* Ask the user for a word made form those 4 letters.
* Use binary search to search for that word in the Words ArrayList to see if the word is valid. Output it if it is a valid word.
* Then make at least one improvement to the game.  Write your improvement as comments at the top of your game, and also comment the code that you inserted into the game to make this improvement.  It should be at least 20 lines of quality code. Some examples of an improvement would be:

* Give the user different amounts of points for different size words.
* Allow the user to exchange one of their letters.
* Have 2 players competing for the biggest word.
* Any other improvement.
* Use the given list of words to make your Word objects for the Arraylist and verify that the user typed in a real word.

** Add comments throughout your code, especially where you made changes or additions. If you're working in a group, ensure that your comments clearly indicate the sections you personally contributed to.

Turn in a copy of your code and the reflection response.

TODO Turn in: Turn in your 2 files (The Word and ScrabbleGame java files) to the github classroom assignment.

TODO: Each student must respond to the reflection question individually, providing a unique answer. This part of the assignment should not be done collaboratively. Submit your reflection as a document either on Canvas or in the GitHub repository.

Reflect on your personal problem-solving process. How did your understanding of object-oriented programming (e.g., classes, constructors, and data structures like ArrayLists) evolve as you worked on this task? What challenges did you encounter and how did you go about fixing them? Explain which LLM, your prompts, or internet help and how debugged your code?

Sara Filipinas
6/30/25
Enhancement Added: Scoring system
Words earn points based on length:
4 or fewer letters: 2 points
5–6 letters: 4 points
7+ letters: 6 points
Also added feedback messages based on score.


Refliection: 
This assignment helped me understand object oriented programming more, especially understanding how seperate classes interact with one another. The use of ArrayLists to store and organize data was also something I gained a deeper understanding of, seeing how the random letters pulled from the list was generated. I used copilot to help me with the basis of creating the scrabble and word files and it suggested to implement comparable in my word file to allow sorting of two word objects, this was a new thing I learned and it made the process easier. I added a point system as my additional improvement for the game, it was a scoring logic and I was able to learn more about using if and then statements and comparison logic. Overall this was a fun project.