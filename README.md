<h1>FetchHiringApp</h1>

<p>FetchHiringApp is a simple Android application that retrieves data from a given URL, filters out items with blank or null names, sorts them by <code>listId</code> and <code>name</code>, and displays the results in a RecyclerView. The project is built using Java and utilizes the AndroidX library, Volley for networking, and Gson for JSON parsing.</p>

<h2>Features</h2>
<ul>
    <li>Fetch data from a specified URL.</li>
    <li>Filter out items with blank or null names.</li>
    <li>Sort items by <code>listId</code> and <code>name</code>.</li>
    <li>Display the sorted and filtered items in a RecyclerView.</li>
</ul>

<h2>Requirements</h2>
<ul>
    <li>Android Studio (latest stable version)</li>
    <li>Minimum SDK: API 21 (Lollipop)</li>
    <li>Internet access</li>
</ul>

<h2>Dependencies</h2>
<p>The following dependencies are used in this project:</p>
<ul>
    <li>AndroidX RecyclerView</li>
    <li>Volley</li>
    <li>Gson</li>
</ul>

<h2>Installation</h2>
<ol>
    <li>Clone the repository:
        <pre><code>git clone https://github.com/yourusername/FetchHiringApp.git</code></pre>
    </li>
    <li>Open the project in Android Studio.</li>
    <li>Ensure you have the following dependencies in your <code>build.gradle</code> file (Module: app):
        <pre><code>
dependencies {
    implementation 'androidx.recyclerview:recyclerview:1.2.1'
    implementation 'com.android.volley:volley:1.2.1'
    implementation 'com.google.code.gson:gson:2.8.9'
}
        </code></pre>
    </li>
    <li>Sync your project with Gradle files.</li>
</ol>

<h2>Usage</h2>
<ol>
    <li>Open <code>MainActivity.java</code> and ensure the URL for fetching data is correct:
        <pre><code>String url = "https://fetch-hiring.s3.amazonaws.com/hiring.json";</code></pre>
    </li>
    <li>Build and run the project on an Android device or emulator.</li>
</ol>

<h2>Project Structure</h2>
<ul>
    <li><code>MainActivity.java</code>: The main activity that fetches data and displays it in a RecyclerView.</li>
    <li><code>Item.java</code>: The data model representing each item.</li>
    <li><code>ItemAdapter.java</code>: The RecyclerView adapter for binding data to the RecyclerView.</li>
    <li><code>activity_main.xml</code>: The layout file for the main activity.</li>
    <li><code>item_layout.xml</code>: The layout file for each item in the RecyclerView.</li>
</ul>

<h2>MainActivity.java</h2>
<p>Sets up the RecyclerView and its adapter. Fetches data from the specified URL using Volley. Parses the JSON response using Gson. Filters and sorts the data. Updates the RecyclerView with the processed data.</p>

<h2>Item.java</h2>
<p>A simple data class representing each item with <code>listId</code>, <code>id</code>, and <code>name</code> fields.</p>

<h2>ItemAdapter.java</h2>
<p>A RecyclerView adapter that binds item data to the views defined in <code>item_layout.xml</code>.</p>

<h2>Layout Files</h2>
<ul>
    <li><code>activity_main.xml</code>: Contains the RecyclerView.</li>
    <li><code>item_layout.xml</code>: Defines the layout for each item in the RecyclerView.</li>
</ul>
