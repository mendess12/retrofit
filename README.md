# retrofit

### Konu 
<pre> API'ye istek atılıp API'deki verileri recyclerview içinde göstermek </pre>
<hr>

### API Url
* https://jsonplaceholder.typicode.com/
* https://jsonplaceholder.typicode.com/posts
<hr>

### Navigation component dependencies
<pre>
- build.gradle (:app)

dependencies {
    def nav_version = "2.5.3"
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")
}<br>
plugins{
 id 'androidx.navigation.safeargs.kotlin'
 }
<hr> 
- build.gradle(project) 

 dependencies {
        def nav_version = "2.5.3"
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")
    }
</pre>
<hr>

### View model dependencies
<pre>
- build.gradle (:app)

dependencies {
    implementation 'androidx.lifecycle:lifecycle-extensions:2.2.0'
    implementation "androidx.lifecycle:lifecycle-livedata-ktx:2.6.1"
}
</pre>
<hr>

### Retrofit-okHttp-Gson dependencies
<pre>
- build.gradle (:app)

    - retrofit
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    - Gson
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
    - okhttp
    implementation "com.squareup.okhttp3:logging-interceptor:4.9.0"
}
</pre>
<hr>

### Kaynaklar
* [okHttp](https://square.github.io/okhttp/recipes/) and [okHttp Request](https://medium.com/@rohan.s.jahagirdar/android-http-requests-in-kotlin-with-okhttp-5525f879b9e5)
* [Json](https://www.tutorialspoint.com/how-to-parse-json-on-android-using-kotlin)
* [Retrofit](https://square.github.io/retrofit/)
<hr>

### Uı Tasarımları

![untitled](https://user-images.githubusercontent.com/76566952/236407478-7e7c6fe4-fb58-4b24-99df-d0594053380d.gif)
