Twitter Nostalgia App
===
Brings back the blue bird icon for the Android Twitter App.

![Bird App Icon better](https://i.imgur.com/OhMUAf8.png)

All this app does is start the new X app with a few lines of Android Code.

```
val intent = Intent()
intent.component = ComponentName("com.twitter.android",  "com.twitter.android.StartActivity")
startActivity(intent)
finish()
```

The fact that we create a new app just for this task gives us the possibility
to choose our own icons and therefore get our beloved Twitter icon back to the homescreen.

To build the app run

```
./gradlew assembleDebug
```

Then make sure your android is connected and install it with

```
adb install ./app/build/outputs/apk/debug/app-debug.apk
```

Or if you trust me you can just download the `twitter.apk` file from this repository
onto your device and install it manually.
