# Magic Toast
> A Simple and Colorful alternative to showing Toasts.

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-magic--toast-brightgreen.svg?style=popout-square)](https://android-arsenal.com/details/1/3765)
[![Android Arsenal](https://img.shields.io/badge/Twitter-mike14u-blue.svg?style=popout-square)](https://www.twitter.com/mike14u)
[![Android Arsenal](https://img.shields.io/badge/Github-mike14u-ff69b4.svg?style=popout-square)](https://github.com/mike14u)

![screenshot_2016-06-24-11-44-56](https://cloud.githubusercontent.com/assets/16832215/16327497/20a467be-3a02-11e6-892d-0870a95c4246.jpg)

## Getting Started

Make sure to have Android Studio

**Gradle**

```
repositories {
    maven { url "https://jitpack.io" }
}
```

```
implementation 'com.github.ekimual:magic-toast:0.0.2'
```

## Usage example

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

## License
```
MIT License

Copyright (c) 2016 Mike Lau

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
```
