# Currency Converter Program

## Overview

This Java program is a command-line currency converter that allows users to convert between USD (United States Dollar), MXN (Mexican Peso), ARS (Argentine Peso), BRL (Brazilian Real), and COP (Colombian Peso). It fetches real-time exchange rates using the ExchangeRate API and provides a user-friendly interface for currency conversions.

## Features

- 💱 **Currency Conversion**: Convert between USD and MXN, ARS, BRL, and COP, and vice versa.
- 📊 **Real-Time Exchange Rates**: Fetches the latest exchange rates from ExchangeRate API.
- 🖥️ **Interactive Interface**: Simple command-line menu for selecting conversion options and entering amounts.

## Prerequisites

- **Java Development Kit (JDK)**: Version 8 or higher installed.
- **Internet Connection**: Required to fetch real-time exchange rates.
- **ExchangeRate API Key**: Replace `YOUR_API_KEY` in `Consultation.java` with your own API key. You can sign up for an API key at [ExchangeRate API](https://www.exchangerate-api.com/).

## Installation

1. **Clone the Repository**:

    ```sh
    git clone <repository_url>
    cd <repository_directory>
    ```

2. **Compile and Run the Program**:

    ```sh
    javac -d bin -sourcepath src src/Principal/Principal.java
    java -cp bin Principal.Principal
    ```

## Usage

1. **Run the Program**:
   - Execute `java -cp bin Principal.Principal` to start the program.
   
2. **Menu Options**:
   - Choose from the following conversion options:
     - 1) Convert USD to MXN (Mexican Peso).
     - 2) Convert MXN to USD.
     - 3) Convert USD to ARS (Argentine Peso).
     - 4) Convert ARS to USD.
     - 5) Convert USD to BRL (Brazilian Real).
     - 6) Convert BRL to USD.
     - 7) Convert USD to COP (Colombian Peso).
     - 8) Convert COP to USD.
     - 9) Exit.

3. **Enter Amount to Convert**:
   - After choosing an option, enter the amount to convert when prompted.

4. **View Conversion Result**:
   - The program will display the converted amount and the current exchange rate used for the conversion.

## Code Explanation

### `Principal.java`

The `Principal` class contains the main program logic.

- 🖥️ **Menu Display**: The menu options for currency conversion.
- 📝 **User Input Handling**: Reads user input to determine which conversion to perform.
- ❌ **Error Handling**: Catches exceptions like `NumberFormatException` for invalid input.
- 🔄 **Integration with `Conversion.java`**: Calls methods from `Conversion` class to perform currency conversions.

### `Consultation.java`

The `Consultation` class handles API requests and JSON parsing using the `HttpClient` and `Gson` libraries.

- 🌐 **API URL Construction**: Constructs a URL based on the base and target currencies to fetch exchange rates.
- 📡 **HTTP Request**: Sends an HTTP request to ExchangeRate API to retrieve exchange rate data.
- 📄 **JSON Parsing**: Converts JSON response to Java objects (`Currency` class) using Gson library.
- ❗ **Error Handling**: Throws a `RuntimeException` if currency data is not found or if there's an HTTP request error.

### `Conversion.java`

The `Conversion` class performs the actual currency conversion calculations.

- 📈 **Conversion Calculation**: Uses the exchange rate fetched from `Consultation` to convert currency amounts.
- 🖊️ **Input Handling**: Reads user input for the amount to convert.
- 📤 **Output**: Prints the converted amount and the conversion rate used.

## Note

- ℹ️ **Ensure your API key**: (`YOUR_API_KEY` in `Consultation.java`) is valid and accessible. Replace it with your actual API key from ExchangeRate API to fetch real-time data.
- 🌐 **This program assumes a stable internet connection** for fetching exchange rates.
