What This Script Does?
It performs multiple tasks, covering essential Python concepts:

1. Loads Environment Variables
Uses .env file to store sensitive AWS credentials (good practice for security).
Reads the AWS S3 bucket name from the environment.
2. Configures Logging
Helps track program execution by logging important events.
3. Defines a Decorator for Logging Function Calls
@log_function_call is used to log whenever a function runs.
4. Fetches Data from an API
Calls an external API (https://jsonplaceholder.typicode.com/todos/1).
Retrieves JSON data and logs any errors.
5. Writes Data to a File
Saves JSON data from the API into a data.json file.
6. Uses SQLite as a Local Database
Creates a small database (app.db).
Stores user data in a users table.
Inserts and retrieves users from the database.
7. Uploads a File to AWS S3
Uploads the data.json file to an S3 bucket using Boto3.
8. Demonstrates Multithreading
Runs a simple function in a separate thread to print numbers.
9. Implements Object-Oriented Programming (OOP)
Defines a Animal class (base class).
Creates Dog and Cat subclasses, which implement a speak() method.
10. Runs Everything in the if __name__ == "__main__" Block
Calls all functions in a structured way:
Fetches API data.
Writes it to a file.
Stores and retrieves data in a database.
Uploads the file to AWS S3.
Runs a multithreading example.
Creates Dog and Cat objects and calls their methods.
