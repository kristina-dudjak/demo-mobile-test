/*
package old_tests

import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.options.UiAutomator2Options
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import java.net.URL

abstract class TestBase {
    protected lateinit var driver: AndroidDriver
    private val options = UiAutomator2Options()
        .setApp("${System.getProperty("user.dir")}/apps/Android-MyDemoAppRN.1.3.0.build-244.apk")

    @BeforeEach
    fun setUp() {
        driver = AndroidDriver(URL("http://127.0.0.1:4723"), options)
    }

    @AfterEach
    fun tearDown() {
        driver.quit()
    }
}
*/