Magic Toast
===========

A Simple and Colorful alternative to showing Toasts.

Gradle

```java
	repositories {
    	maven { url "https://jitpack.io" }
    }
```

```java
	compile 'com.github.ekimual:magic-toast:0.0.1'
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