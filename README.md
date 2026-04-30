<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Weather App Documentation</title>

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background: #0f172a;
            color: #e2e8f0;
            font-family: "Segoe UI", sans-serif;
        }
        .container {
            max-width: 900px;
        }
        .card {
            background: #1e293b;
            border: none;
            border-radius: 12px;
        }
        h1, h2, h3 {
            color: #f8fafc;
        }
        code {
            background: #334155;
            padding: 2px 6px;
            border-radius: 5px;
            color: #facc15;
        }
        pre {
            background: #020617;
            padding: 15px;
            border-radius: 10px;
            color: #38bdf8;
            overflow-x: auto;
        }
        hr {
            border-color: #334155;
        }
    </style>
</head>

<body>

<div class="container py-5">

    <h1 class="mb-3">🌤 Weather App</h1>
    <p>
        A modern <strong>Weather Web Application</strong> built using <strong>Spring Boot</strong> and <strong>Thymeleaf</strong>.
        It fetches real-time weather data from the OpenWeatherMap API and displays it in a clean UI.
    </p>

    <hr>

    <h2>🚀 Features</h2>
    <ul>
        <li>Search weather by city name</li>
        <li>Displays temperature in Celsius</li>
        <li>Shows current weather condition</li>
        <li>Error handling for invalid input</li>
        <li>Responsive UI with Bootstrap</li>
        <li>Secure API key handling</li>
    </ul>

    <hr>

    <h2>🛠 Tech Stack</h2>
    <ul>
        <li><strong>Backend:</strong> Spring Boot (Java)</li>
        <li><strong>Frontend:</strong> Thymeleaf, HTML, CSS, Bootstrap</li>
        <li><strong>API:</strong> OpenWeatherMap</li>
        <li><strong>Build Tool:</strong> Maven</li>
    </ul>

    <hr>

    <h2>📂 Project Structure</h2>
    <pre>
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
    </pre>

    <hr>

    <h2>⚙️ Setup & Run</h2>

    <h5>1. Clone Repository</h5>
    <pre>git clone https://github.com/your-username/weather-app.git
cd weather-app</pre>

    <h5>2. Get API Key</h5>
    <p>Create an account on OpenWeatherMap and generate an API key.</p>

    <h5>3. Configure API Key</h5>
    <pre>API_KEY=your_api_key_here</pre>

    <p>Example configuration:</p>
    <pre>api.key=YOUR_API_KEY_HERE</pre>

    <h5>4. Run Application</h5>
    <pre>mvn spring-boot:run</pre>

    <h5>5. Access Application</h5>
    <pre>http://localhost:8080/</pre>

    <hr>

    <h2>⚠️ Error Handling</h2>
    <ul>
        <li>Handles invalid city names</li>
        <li>Prevents application crash</li>
        <li>Ensures smooth user experience</li>
    </ul>

    <hr>

    <h2>🎯 Key Concepts Used</h2>
    <ul>
        <li>REST API Integration</li>
        <li>MVC Architecture</li>
        <li>Thymeleaf templating</li>
        <li>Exception handling</li>
        <li>Secure configuration</li>
    </ul>

</div>

</body>
</html>
