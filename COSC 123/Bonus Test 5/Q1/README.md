# Task 1: Advanced ball bouncing

By now you have seen a white ball bouncing on a screen many times.
It's time to level up.

Modify the provided code so that:

- In the top left corner, the sketch has the time elapsed since the sketch last restarted, and a "password" field (3 marks)
- The sketch turns completely black (i.e. switches off) after 3 seconds of user inactivity (5 marks)
- The animation can be restored if the user clicks the mouse. (2 marks)
- The animation is also restored if the user enters a password, e.g. “cosc123” instead of a simple mouse click (BACKSPACE should reset the password). (5 marks)
  - Hint: for this you will need to write a new method and update a blank string with the typed key (using `key`) and then check if the entered password matches the actual password
