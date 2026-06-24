# String Concatenation & Methods ➕➕

### Welcome!
This GitHub repository is where you will be working on your activity!

```text
Note: Please read all the information below before starting the activity!
```

For detailed instructions, you can check the presentation here: [Concatenation Presentation](https://docs.google.com/presentation/d/1velT83F1r7W14BrnmRa3IhXsB5s9pVh8mqlFc85R4RA/edit?usp=sharing).

---

## Activity Instructions

In this activity, you will practice defining String variables, manipulating their data using built-in String methods, and chaining them together using concatenation.

1. Open the `Concatenation.java` starter file.
2. Define three `String` variables: one for the **month**, one for the **day**, and one for your **major**.
3. Use a String method to ensure your major is stored in ALL CAPS.
4. Concatenate these variables into a single sentence exactly following this format: 
   `Today is _____, 2024. The day is ____. Our major is ____.`
5. Use a String method to calculate the total length of all three variables combined, and print the result.
6. Define two more `String` variables for a **first name** and a **last name**.
7. Use a String method to extract the very first letter of both names.
8. Concatenate those letters with periods to create an **initials** String (e.g., `"B.C."`), and print it!

> [!WARNING]
> ### 👾 Break-Proofing Your Code (Adversarial Thinking):
> * **The Smushed Sentence Trap:** When you concatenate variables with text, Java does exactly what you tell it to do. If you write `"Today is"+month`, it will print `Today isJune`. You **must** manually include spaces inside your quotation marks! (e.g., `"Today is " + month`).
> * **The Substring Bounds:** To get the first letter of a String, you need to use `.substring()`. Remember that String indexes start at `0`. If you use `.substring(0, 1)`, it grabs the character at index 0 and stops *before* index 1.
> * **Length is a Method:** For Strings, calculating the length requires parentheses because it is an action (a method) being performed on the object. Do not forget to type `.length()`!

### Expected Output
*(Note: Your actual data might be slightly different depending on the names/dates you choose, but the format must match perfectly!)*
```text
Today is June, 2024. The day is Wednesday. Our major is COMPUTER SCIENCE.
The total number of characters is: 30
B.C.
```

> [!IMPORTANT]
> ### How to submit your activity:

<details>
<summary> If you're using your own VS Code (Recommended):</summary>

```text
1. In your GitHub assignment, open the file with the name of the program that you want to submit.
2. Click the pencil icon ("edit this file") in the right upper corner.
3. Paste the code from your VS Code into GitHub
4. Click "Commit changes" (Green button in right upper corner).
5. Accept/confirm any prompts, and that's it! You've submitted your activity.
```
</details>

<details>
<summary> If you're using GitHub Codespaces:</summary>

```text
1. Whenever you're ready to submit the activity, click on the "Source Control" tab (usually on the left of your screen).
2. Write your Student ID in the Message textbox (above the green "Commit" button). 
3. Click on commit (if prompted to stage changes, click "Yes").
4. Click on the button "Sync changes", accept everything and that's it!
If you didn't get any errors, you've submitted your activity successfully. Otherwise, send me a message with your error.
```
</details>
