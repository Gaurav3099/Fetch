<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>README</title>
</head>
<body>
    <h1>Android JSON Fetcher App</h1>
    <p>This Android application fetches data from a given JSON URL and displays it in a sorted and grouped list. The data is displayed grouped by <code>listId</code> and sorted by <code>listId</code> and <code>name</code>.</p>
    
    <h2>Features</h2>
    <ul>
        <li>Fetch data from a remote URL</li>
        <li>Filter out items with null or empty names</li>
        <li>Group items by <code>listId</code></li>
        <li>Sort items by <code>listId</code> and <code>name</code></li>
        <li>Display items in a RecyclerView</li>
        <li>Handle network errors</li>
        <li>Use MVVM architecture with Hilt for Dependency Injection</li>
    </ul>

    <h2>Prerequisites</h2>
    <ul>
        <li>Android Studio (latest stable version)</li>
        <li>Java 8 or higher</li>
        <li>Internet connection</li>
    </ul>

    <h2>Setup Instructions</h2>
    <ol>
        <li>Clone the repository: <code>git clone &lt;repository_url&gt;</code></li>
        <li>Open the project in Android Studio</li>
        <li>Sync the project with Gradle files</li>
        <li>Run the application on an emulator or a physical device</li>
    </ol>

    <h2>Dependencies</h2>
    <ul>
        <li><code>androidx.appcompat:appcompat</code></li>
        <li><code>androidx.constraintlayout:constraintlayout</code></li>
        <li><code>androidx.lifecycle:lifecycle-livedata-ktx</code></li>
        <li><code>androidx.lifecycle:lifecycle-viewmodel-ktx</code></li>
        <li><code>com.squareup.retrofit2:retrofit</code></li>
        <li><code>com.squareup.retrofit2:converter-gson</code></li>
        <li><code>com.squareup.okhttp3:logging-interceptor</code></li>
        <li><code>com.google.dagger:hilt-android</code></li>
        <li><code>androidx.hilt:hilt-lifecycle-viewmodel</code></li>
        <li><code>androidx.paging:paging-runtime</code></li>
    </ul>

    <h2>Architecture</h2>
    <p>The app uses the MVVM (Model-View-ViewModel) architecture pattern with the following components:</p>
    <ul>
        <li><strong>Model:</strong> Represents the data structure (Item.java).</li>
        <li><strong>View:</strong> The UI components (MainActivity.java, activity_main.xml, item_view.xml).</li>
        <li><strong>ViewModel:</strong> Manages UI-related data (MainViewModel.java).</li>
        <li><strong>Repository:</strong> Handles data fetching and business logic (Repository.java).</li>
    </ul>

    <h2>Usage</h2>
    <p>Once the app is running, it will fetch data from the URL, filter out any items with null or empty names, sort the items by <code>listId</code> and <code>name</code>, and display them in a grouped list in the UI.</p>

    <h2>Testing</h2>
    <p>Unit tests are written for the ViewModel and Repository to ensure the correctness of data handling and business logic.</p>
    <ul>
        <li>Run unit tests with <code>./gradlew test</code> from the command line or use the built-in testing tools in Android Studio.</li>
    </ul>

    <h2>Contributing</h2>
    <p>Contributions are welcome! Please submit a pull request or open an issue to discuss any changes or improvements.</p>

    <h2>License</h2>
    <p>This project is licensed under the MIT License. See the <code>LICENSE</code> file for details.</p>
</body>
</html>
