
## Project Name and Description:
# Project Name - _Google_Form_Automation (Vivek Singh)_
# Project Overview:
The goal of this project is to automate the process of filling out a Google Form by interacting with different types of form elements such as text boxes, text areas, radio buttons, checkboxes, calendar date inputs, and time inputs.

# Technologies Used:
Selenium WebDriver: For automating browser interactions.
Java: As the programming language for writing automation scripts.
ChromeDriver: WebDriver for Google Chrome.

# Features:
Form Navigation:

The automation script will open the Google Form URL in a browser.
It will navigate through the form pages if there are multiple pages.

# Textbox Interaction:

Input text into textboxes by locating them using their XPath.

# Textarea Interaction:

Input text into text areas by locating them using their  XPath.

# Radio Button Selection:

Select radio buttons based on the specified options by locating them using their  XPath.

# Checkbox Selection:

Check or uncheck checkboxes based on specified options by locating them using their  XPath.

# Calendar Date Input:

Select a date from the calendar date input by locating it using xpath and providing a date in the desired format.

# Time Input:

Input time into the time input fields by locating them using their XPath and providing time in the desired format.

# Form Submission:

After filling out all the necessary form fields, submit the form by locating the submit button and clicking on it.

# Workflow:
Initialization:

Start the WebDriver session and navigate to the Google Form URL.
Form Filling:

Locate each form element (textbox, textarea, radio button, checkbox, calendar date input, time input).
Input data into each form element based on the test case requirements.

# Form Submission:

Locate the submit button and click on it to submit the form.

# Cleanup:

Close the WebDriver session after form submission is completed.
Considerations:
Ensure proper synchronization to handle dynamic elements and loading delays.
Use proper locators (IDs, XPath) to locate form elements reliably.
Handle any pop-up dialogs or alerts that may appear during form submission.

# Benefits:
Saves time and effort by automating the repetitive task of filling out forms.
Reduces the risk of human errors in data entry.
Can be integrated into continuous integration (CI) pipelines for automated testing.

## Installation Instructions:
Clear steps to set up and run the project locally.
> Example:
```
# java version 17
java --version
gradle
vscode
```

## Usage and Examples:
Provide sample code or usage scenarios to showcase how the project works.
> Example:
```
# to run the project
./gradlew run
```

## Important Links:
Details about useful external links
 
