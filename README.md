# 🌤 Weather App (Spring Boot + Thymeleaf)

A simple and modern **Weather Web Application** built using **Spring Boot** and **Thymeleaf**.
It fetches real-time weather data from the **OpenWeatherMap API** and displays it in a clean user interface.

---

## 🚀 Features

* Search weather by city name
* Displays temperature in Celsius
* Shows current weather condition
* Handles invalid input with error messages
* Clean and responsive UI with Bootstrap
* Secure API key handling using environment variables

---

## 🛠 Tech Stack

* **Backend:** Spring Boot (Java)
* **Frontend:** Thymeleaf, HTML, CSS, Bootstrap
* **API:** OpenWeatherMap
* **Build Tool:** Maven

---

## 📂 Project Structure

```id="ps0c2m"
weatherApp/
│
├── src/
│   ├── main/
│   │   ├── java/com/weatherApp/
│   │   │   ├── controller/
│   │   │   ├── service/
│   │   │   └── model/
│   │   │
│   │   └── resources/
│   │       ├── templates/
│   │       │   └── index.html
│   │       ├── application.properties (ignored)
│   │       └── application.properties.example
│   │
│   └── test/
│
├── pom.xml
└── README.md
```

---

## ⚙️ Setup & Run

### 1. Clone the repository

```id="mptbb0"
git clone https://github.com/your-username/weather-app.git
cd weather-app
```

---

### 2. Get API Key

* Create an account on OpenWeatherMap
* Generate an API key

---

### 3. Configure API Key

Set environment variable:

```id="6m5n86"
API_KEY=your_api_key_here
```

Example configuration file:

```id="a8ewh4"
application.properties.example
```

```id="0qew5o"
api.key=YOUR_API_KEY_HERE
```

---

### 4. Run Application

```id="2i0hlx"
mvn spring-boot:run
```

---

### 5. Access Application

```id="d7j1li"
http://localhost:8080/
```

---

## ⚠️ Error Handling

* Displays message for invalid city names
* Prevents application crash on API failure
* Provides smooth user experience

---

## 🎯 Key Concepts Used

* REST API Integration
* MVC Architecture (Controller, Service, Model)
* Thymeleaf templating
* Exception handling
* Secure configuration using environment variables
