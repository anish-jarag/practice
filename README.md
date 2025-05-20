📘 Android App Development with Java – Viva Theory Guide
✅ I. General Android Questions (100% Viva-Worthy)
🔹 What is Android?
Android is an open-source mobile operating system based on Linux.

Developed by Google, supports app development using Java/Kotlin.

Used to build apps for smartphones, tablets, TVs, and IoT.

🔹 What are Activities in Android?
Activities represent screens with a user interface.

The entry point of every app.

Example: MainActivity.java

Lifecycle Methods:

onCreate() → Initialization

onStart() → App visible

onResume() → User can interact

onPause() → Activity partially visible

onStop() → Not visible

onDestroy() → App is closed

🔹 What is an Intent?
Intent is used to request an action (move between activities, open apps).

Two types:

Explicit: Specify exact class (e.g., move to SecondActivity)

Implicit: Let Android pick the correct app (e.g., open browser)

🔹 What is a Fragment?
A portion of UI in an Activity.

Used for modular design (e.g., split screen for tablet layout).

Managed by FragmentManager.

🔹 What is a Service?
A background task that does not have a UI (e.g., music player).

Runs independently of activity.

🔹 What is a BroadcastReceiver?
Used to listen for system-wide broadcasts like:

Battery low

Airplane mode

Custom app broadcasts

🔹 What is ContentProvider?
Manages shared data between apps (e.g., contacts, media).

Allows one app to access data from another securely.

✅ II. UI Components & Layouts
🔹 Common UI Widgets:
Widget	Description
TextView	Shows text
EditText	Input field
Button	Clickable button
CheckBox	Multiple selections
RadioButton	Single selection
ToggleButton	On/Off
Spinner	Dropdown menu
ListView	List of scrollable items
SeekBar	Slider to select value
RatingBar	Star rating system

🔹 Layouts:
Layout	Description
LinearLayout	Arranges children vertically/horizontally
RelativeLayout	Positions views relative to each other
ConstraintLayout	Modern flexible layout
FrameLayout	Overlays views (used for fragments)
GridLayout	Grid of rows and columns
TableLayout	Row-column layout like a table

✅ III. Menus, Dialogs & Notifications
🔹 What is an Options Menu?
Menu in top-right (3 dots)

Defined in res/menu folder

🔹 What is a Context Menu?
Long-press popup menu for a specific view

🔹 What is a Popup Menu?
Small menu that appears below a view on click

🔹 AlertDialog
Dialog with Yes, No, Cancel options

Used for user confirmation

🔹 Notification
Small popup shown in the system tray

Built using NotificationCompat.Builder

Requires channel for Android 8.0+

✅ IV. Storage & File Handling
🔹 Internal Storage
Data saved in /data/data/<package>/files/

Private to the app

Use: openFileOutput("filename", MODE_PRIVATE)

🔹 SQLite Database
Lightweight local database built into Android

Use SQLiteOpenHelper to manage DB

CRUD operations: Create, Read, Update, Delete

✅ V. Miscellaneous Oral Questions
🔹 What is an Adapter?
Converts data into UI components (e.g., ArrayAdapter for ListView, Spinner)

🔹 What is a Cursor?
A pointer to data retrieved from SQLite DB

Used to navigate query results

🔹 What is Manifest file?
Declares app components (Activities, Permissions, Services, etc.)

File: AndroidManifest.xml

🔹 What is the role of findViewById()?
Binds UI element (defined in XML) to Java code

🔹 What is the use of Log.d()?
Used for debugging messages in Logcat

✅ VI. Expected Viva Questions by Topic
📱 Activity:
What is the activity lifecycle?

What is the difference between onCreate() and onResume()?

🔄 Intents:
Difference between explicit and implicit intent?

How do you pass data between activities?

📦 Fragments:
Why use fragments instead of multiple activities?

How to load a fragment?

🧮 SQLite:
What is SQLite? Do you need to install it?

How to insert and fetch data?

What is ContentValues?

What does Cursor.moveToNext() do?

🛠 Threading:
Why can't we update UI from background thread?

What is runOnUiThread()?

🧾 Toast & Dialogs:
How is Toast different from AlertDialog?

When do you use AlertDialog?

📂 Storage:
Where are files saved?

Difference between internal and external storage?



📘 Android with Java Viva Prep (APL-III)
✅ General Android Concepts
1. What is Android?
Android is an open-source mobile operating system developed by Google.

It supports Java/Kotlin and is based on Linux kernel.

2. Activity
A single screen with a UI.

onCreate() is the lifecycle method where initialization happens.

3. Intent
Used to start a new activity or interact with another app.

Type	Use
Explicit	Navigate to a class in your app
Implicit	Open browser, dialer, maps etc.

4. Layout Types
LinearLayout: Arranges views vertically or horizontally.

RelativeLayout: Positions views relative to each other or parent.

FrameLayout: Stacks views on top of each other.

GridLayout: Grid of rows and columns.

TableLayout: Like HTML table.

✅ Component-Based Viva Questions
📄 Programs 1–5: Layouts and Basic UI
Program	Key Viva Points
1. Button click	Use of setOnClickListener
2. Fragment	Reusable UI piece, loaded using FragmentManager
3. Toast	Temporary message shown via Toast.makeText(...).show();
4. RelativeLayout	Use layout_below, centerHorizontal, etc.
5. FrameLayout	Shows 1 view at a time; useful for fragments

📋 Programs 6–10: Lists & Intents
Program	Concept
6. ListView	Adapter + setOnItemClickListener
7. TableLayout	Use of TableRow for rows
8. GridLayout	Grid style layout, weights control width
9. Fragment Swap	setVisibility() with FrameLayout
10. Implicit Intents	Intent.ACTION_VIEW, ACTION_DIAL, geo:...

🧾 Programs 11–14: Events & Forms
Program	Concept
11. Explicit Intent	new Intent(this, SecondActivity.class)
12. Form	EditText, RadioGroup, CheckBox, ToggleButton
13. Spinner	Dropdown with ArrayAdapter and onItemSelected
14. AlertDialog	AlertDialog.Builder with Yes/No/Cancel

🍔 Programs 15–18: Menus & Notifications
Program	Concept
15. Option Menu	Menu in top-right corner (3 dots)
16. Context Menu	Long-press to show menu
17. Popup Menu	Menu shown below a view (like dropdown)
18. Notification	Use NotificationCompat.Builder + Channel

🗃️ Programs 19–21: SQLite Database
Program	Concept
19. Insert	Use SQLiteOpenHelper, insert()
20. Display	Use Cursor to read and display
21. Update	update(..., whereClause, args)
🔁 Delete	delete(..., whereClause, args)

🔥 Viva Tip: You don’t need to install SQLite — it’s built into Android.

📊 Programs 22–27: Advanced Widgets
Program	Concept
22. File Save	FileOutputStream, saves to internal storage
23. Multithreading	Thread.sleep(), runOnUiThread()
24. Progress Bar	Update progress with thread
25. RatingBar	setOnRatingBarChangeListener
26. SeekBar	onProgressChanged()
27. ToggleButton	setOnCheckedChangeListener()

✅ Important Keywords to Mention
Term	Definition
onCreate()	Called when activity is created
Context	Global info about app environment
Adapter	Connects data source to UI widget
Toast	Small message popup
Intent	Message to request an action
Cursor	Reads rows from SQLite DB
View	Base class for all UI components

✅ Oral Tips
Always mention lifecycle when asked about activities/fragments.

Use phrases like:
✅ "This layout is flexible and adjusts to screen size"
✅ "We use SQLite for local, offline data storage"

Mention permission required (like POST_NOTIFICATIONS) for Android 13+ if asked.
