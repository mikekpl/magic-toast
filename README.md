Magic Toast
===========

A Simple and Colorful alternative to showing Toasts.

![screenshot_2016-06-24-11-44-56](https://cloud.githubusercontent.com/assets/16832215/16327497/20a467be-3a02-11e6-892d-0870a95c4246.jpg)

Gradle

```java
	repositories {
    	maven { url "https://jitpack.io" }
    }
```

```java
	compile 'com.github.ekimual:magic-toast:0.0.2'
```

Sample Usage

```java
	//Different Kinds of Toast
	MagicToast.showSuccess(getApplicationContext(), "HELLO WORLD");
	MagicToast.showError(getApplicationContext(), "HELLO WORLD");
	MagicToast.showInfo(getApplicationContext(), "HELLO WORLD");
	MagicToast.showWarning(getApplicationContext(), "HELLO WORLD");
	MagicToast.showDim(getApplicationContext(), "HELLO WORLD");

	//Shows Toast for 2 seconds
	MagicToast.showSuccess(getApplicationContext(), "HELLO WORLD", 2);
```

![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-magic--toast-green.svg?style=true)](https://android-arsenal.com/details/1/3765)