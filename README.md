
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Fetch Data Display App</title>
</head>
<body>

<h1>Fetch Data Display App</h1>

<p>This is a simple Android application that retrieves data from a specified URL, processes the data, and displays it in a list grouped by <code>listId</code>. The items are sorted first by <code>listId</code> and then by <code>name</code>, filtering out any items with blank or null names.</p>

<h2>Features</h2>
<ul>
    <li>Fetches data from a remote JSON source.</li>
    <li>Filters out items with blank or null names.</li>
    <li>Groups items by <code>listId</code>.</li>
    <li>Sorts items first by <code>listId</code> and then by <code>name</code>.</li>
    <li>Displays items in a user-friendly list.</li>
</ul>

<h2>Getting Started</h2>

<h3>Prerequisites</h3>
<ul>
    <li>Android Studio (latest stable version)</li>
    <li>Java Development Kit (JDK) 8 or higher</li>
</ul>

<h3>Installation</h3>
<ol>
    <li><strong>Clone the repository:</strong>
        <pre><code>git clone https://github.com/yourusername/fetch-data-display-app.git
cd fetch-data-display-app
        </code></pre>
    </li>
    <li><strong>Open the project in Android Studio:</strong>
        <ul>
            <li>Open Android Studio.</li>
            <li>Select "Open an existing Android Studio project".</li>
            <li>Navigate to the cloned repository directory and open it.</li>
        </ul>
    </li>
    <li><strong>Build the project:</strong>
        <ul>
            <li>Android Studio will automatically start syncing the project. If not, go to <code>File -> Sync Project with Gradle Files</code>.</li>
            <li>Once the sync is complete, build the project by clicking on <code>Build -> Make Project</code>.</li>
        </ul>
    </li>
</ol>

<h3>Running the App</h3>
<ol>
    <li><strong>Connect an Android device</strong> or start an Android Emulator.</li>
    <li><strong>Run the app:</strong>
        <ul>
            <li>Click on the <code>Run</code> button in Android Studio or go to <code>Run -> Run 'app'</code>.</li>
        </ul>
    </li>
</ol>

<h2>Project Structure</h2>
<ul>
    <li><code>MainActivity.java</code>: The main activity that sets up the RecyclerView and observes the data from the ViewModel.</li>
    <li><code>MainViewModel.java</code>: The ViewModel that handles the business logic and provides data to the Activity.</li>
    <li><code>Repository.java</code>: The repository that fetches data from the remote JSON source using Retrofit.</li>
    <li><code>Item.java</code>: The data model class representing each item.</li>
    <li><code>ItemAdapter.java</code>: The RecyclerView Adapter for displaying the items in a list.</li>
    <li><code>activity_main.xml</code>: The main layout file containing the RecyclerView.</li>
    <li><code>item_view.xml</code>: The layout file for individual list items.</li>
</ul>

<h2>Dependencies</h2>
<p>The project uses the following dependencies:</p>
<ul>
    <li><code>androidx.appcompat:appcompat:1.4.0</code></li>
    <li><code>androidx.constraintlayout:constraintlayout:2.1.2</code></li>
    <li><code>androidx.lifecycle:lifecycle-livedata-ktx:2.4.0</code></li>
    <li><code>androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.0</code></li>
    <li><code>com.squareup.retrofit2:retrofit:2.9.0</code></li>
    <li><code>com.squareup.retrofit2:converter-gson:2.9.0</code></li>
    <li><code>com.squareup.okhttp3:logging-interceptor:4.9.1</code></li>
    <li><code>junit:junit:4.13.2</code></li>
    <li><code>org.mockito:mockito-core:3.12.4</code></li>
</ul>

<h2>Unit Tests</h2>
<p>Unit tests are written to cover the basic functionality of the repository and ViewModel.</p>
<ul>
    <li><code>RepositoryTest.java</code>: Tests for the Repository class.</li>
    <li><code>MainViewModelTest.java</code>: Tests for the MainViewModel class.</li>
</ul>

<p>To run the tests:</p>
<ol>
    <li>Right-click on the <code>test</code> directory in Android Studio.</li>
    <li>Select <code>Run 'All Tests'</code>.</li>
</ol>

<h2>Contributing</h2>
<p>Contributions are welcome! Please fork the repository and submit a pull request for any improvements or bug fixes.</p>

<h2>License</h2>
<p>This project is licensed under the MIT License. See the <code>LICENSE</code> file for details.</p>

<h2>Contact</h2>
<p>If you have any questions or suggestions, please feel free to contact the repository owner.</p>

</body>
</html>
