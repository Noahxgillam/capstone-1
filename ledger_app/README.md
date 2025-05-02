
# Transaction Ledger

## Overview
This project implements a simple **transaction ledger** in **Java**, allowing users to:
- Add deposits
- Make payments
- View transaction history

## Features
- **Stores transactions** (date, time, description, vendor, amount)
- **Reads & writes** transaction data from/to a CSV file
- **Interactive console menu** for user interaction

## Classes
### `Main`
Handles:
- User input
- Transaction ledger operations (add deposits, add payments, view ledger)
- File operations (load and save transactions)

### `Transaction`
Represents individual transactions with:
- Date (`LocalDate`)
- Time (`LocalTime`)
- Description (`String`)
- Vendor (`String`)
- Amount (`double`)

## Installation
1. Clone the repository:
   ```sh
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```sh
   cd transaction-ledger
   ```
3. Compile the Java files:
   ```sh
   javac -d bin src/*.java
   ```
4. Run the application:
   ```sh
   java -cp bin Main
   ```

## Usage
When you start the application, you'll see:
```
Welcome user
What would you like to do?
D) Add Deposit
P) Make payment (Debit)
L) Ledger
X) Exit
```
- **D)** Add a deposit by providing a description, vendor, and amount.
- **P)** Make a payment (amount will be negative).
- **L)** View the transaction history.
- **X)** Exit and save transactions.

## File Handling
Transactions are saved to:
```
src/main/resources/transactions.csv
```
Each entry follows this format:
```
date|time|description|vendor|amount
```

## License
This project is released under the **MIT License**.

## Contributors
- **Noah**
