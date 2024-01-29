import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.options.UiAutomator2Options
import java.net.URL

object DriverManager {
    private lateinit var driver: AndroidDriver

    fun initializeDriver() {
        val options = UiAutomator2Options()
            .setApp("${System.getProperty("user.dir")}/apps/Android-MyDemoAppRN.1.3.0.build-244.apk")
        driver = AndroidDriver(URL("http://127.0.0.1:4723"), options)
    }

    fun getDriver(): AndroidDriver {
        if (!::driver.isInitialized) {
            initializeDriver()
        }
        return driver
    }

    fun quitDriver() {
        if (::driver.isInitialized) {
            driver.quit()
        }
    }
}