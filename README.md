## 🛒 Flipkart-Style Order Management System (Java 25)
A **console-based Order Management System** built in **Java 25** (IntelliJ IDEA Ultimate), following strict coding restrictions.
This project demonstrates **CRUD, search, and sorting** operations on a set of products — similar to a simplified Flipkart order/cart system.

### Features
* **Java 25 Only** — tested with latest preview features.
* **Custom IO Wrapper** → `IO.println()` / `IO.readln()` (no `System.out.println`, no `Scanner`).
* **No Explicit Collection Imports** — leverages built-in `Set` and `List` APIs.
* **HashSet-based Item Storage** — ensures uniqueness of items.
* **Interface for CRUD contract** (`OrderOperations`).
* **Custom Exceptions** → `ItemNotFoundException`, `DuplicateItemException`.
* **Sorting with Comparators** → by **Name** and **Price**.

<img width="499" height="413" alt="image" src="https://github.com/user-attachments/assets/9895c293-3e9e-416b-a4aa-8ff2dc4d1159" />

### Project Structure
```
src/
 ├── IO.java                   # Custom IO wrapper
 ├── Item.java                 # Product entity
 ├── OrderOperations.java      # Interface (CRUD contract)
 ├── Order.java                # Implements OrderOperations
 ├── ItemNotFoundException.java
 ├── DuplicateItemException.java
 ├── SortByName.java
 ├── SortByPrice.java
 ├── MainApp.java              # Demo with hardcoded items
 └── MainMenuApp.java          # Interactive menu-driven console
```

### Approach 1: Demo Run (MainApp.java)
<img width="1458" height="1155" alt="image" src="https://github.com/user-attachments/assets/dbb71dae-9803-4de5-a382-f2e1a861cfc9" />

### Approach 2: Interactive Console (MainMenuApp.java)
<img width="1136" height="1533" alt="image" src="https://github.com/user-attachments/assets/665dc1de-d1b5-485e-9780-6a1277305d0a" />

### Tech Stack
* **Language:** Java 25 (Preview Features Enabled)
* **IDE:** IntelliJ IDEA Ultimate
* **Data Structures:** Built-in `HashSet`, `List`, Custom Comparators
* **Error Handling:** Custom Exceptions

### Restrictions Followed
* ✅ Rule 1: Java 25 only
* ✅ Rule 2: No `System.out.println`, used `IO.println()`
* ✅ Rule 3: No manual collection imports
* ✅ Rule 4: Developed in IntelliJ (not Notepad++)

### Future Enhancements
* Multi-user support (customer-wise orders).
* Persisting orders to a database or file.
* Extending product categories (electronics, clothing, books, etc.).

