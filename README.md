# Assignment14
publiclibrary1

> Step 1. Add the JitPack repository to your build file

...gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ...
  > Step 2. Add the dependency
  ...gradle
  dependencies {
	        implementation 'com.github.tuyenVy911:Assignment14:Tag'
	}
  ...
