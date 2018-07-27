# Introduction

This is a skeleton application for testing your basic java and spring skills. Please complete this application.

You will need following tools to do this test.

* JDK 8
* Intellij Idea or STS
* PostgreSQL Latest available version

Download the code from download link, complete the test. You will need to create a github repository in your name
and upload the completed files.

You are provided with following APIs

### User API:
URL: https://my-json-server.typicode.com/devicedrivendev/sample-rest/users
This api returns a list of Users
eg:
~~~~
[
    {
        "id": 1,
        "name": "User1"
    },
    ...
]
~~~~

### PostAPI:

REST API URL: https://my-json-server.typicode.com/devicedrivendev/sample-rest/posts
Api returns an array of Posts that are in following format:
~~~~
[
    {
        "userId": 2,
        "id": 14,
        "title": "Post title here",
        "body": "Post body"
    },
    ...
]
~~~~

## Tasks

You are required to complete the give code so that it data from these APIs every day and save into database.

You will to create following apis.

### 1. Users API
This Api should list all users
URL: http://localhost:8080/users
Sample Response:
~~~~
[
   {
       "id": 1,
       "name": "User1"
   },
   ...
]
~~~~

### 2. Post API

This API should return the list of posts. This Api also accepts an optional url parameter 'userId'.

#### Example 1 without url parameter


GET http://localhost:8080/posts

Response:
~~~~
[
   {
       "userId": 2,
       "id": 14,
       "title": "Post title here",
       "body": "Post body"
   },
   ...
]
~~~~

#### Example 2 with URL parameter

GET http://localhost:8080/posts?userId=1
~~~~
[
   {
       "userId": 1,
       "id": 15,
       "title": "Post title here",
       "body": "Post body"
   },
   ...
]
~~~~
