# CollatzAPI

Hello there! I'm excited to introduce you to CollatzAPI. This service provides a graphical representation of the famous unsolved mathematical problem known as the Collatz Conjecture.

The Collatz Conjecture involves iterating a mathematical function on a given integer until it eventually reaches the value of 1. The function is defined as follows:

* If the number is even, divide it by 2.
* If the number is odd, multiply it by 3 and add 1.

The conjecture states that no matter what positive integer you start with, this process will eventually reach the value of 1. However, despite being extensively studied, the conjecture remains unsolved.

I have created this service to provide the edges in order to graph the problem in a UI one day.

## Getting Started

To get started you will need to have the following:

* Java Development Kit (JDK) version 8 or later installed on your machine.
* Git installed on your machine.
* Tilt installed
* Docker + Docker Compose installed

Once you have these prerequisites, follow these steps:

1. Clone the repository from GitHub using the following command:

    ```
    https://github.com/jansafedcoffee/collatzAPI.git
    ```

2. Change into the project directory using the following command:

    ```
    cd collatz-graph-service
    ```
3. Start the Environment using tilt
    ```
    tilt up
    ```

4. Build the project using the following command:

    ```
    ./gradlew build
    ```

5. Run the Spring app using the following command:

    ```
    ./gradlew bootRun
    ```

6. Once the app is running, you can call the API at http://localhost:8080.

## Using the Service

To use CollatzAPI, you can use the following endpoints:

## EdgeQueryController

This class contains endpoints related to retrieving edges from the system.

### `GET /edges`

Retrieves all edges from the system.

#### Request

GET /edges

#### Response

Returns a list of `Edge` objects, representing all edges in the system.

### `GET /edges/depth`

Retrieves all edges that connect nodes between a specified depth range.

#### Request
GET /edges/depth?from={from}&to={to}

**Parameters:**

- `from` (required): the starting depth of the range (an integer).
- `to` (required): the ending depth of the range (an integer).

#### Response

Returns a list of `Edge` objects, representing all edges that connect nodes between the specified depth range.


## EdgeCommandController

This class contains endpoints related to creating edges in the system.

### `POST /edge`

Creates a new edge in the system.

#### Request

**Body:**

A JSON object representing the edge to be created, in the following format:

``
{
"input": naturalNumber
}``

**Properties:**

- `input` (required): the input value of the new edge (a `BigInteger`).

#### Response

Returns the newly created `Edge` object.



## License

CollatzAPI is licensed under the MIT License. See the `LICENSE` file for more information.

---

Enjoy using it and stay curious. :)

