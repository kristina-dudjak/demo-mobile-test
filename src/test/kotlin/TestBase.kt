
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.options.UiAutomator2Options
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import java.net.URL


abstract class TestBase {

    companion object {
        lateinit var driver: AndroidDriver

        @JvmStatic
        @BeforeAll
        fun setUp() {
            val options = UiAutomator2Options()
                .setApp("${System.getProperty("user.dir")}/apps/Android-MyDemoAppRN.1.3.0.build-244.apk")
            driver = AndroidDriver(URL("http://127.0.0.1:4723"), options)
        }

        @JvmStatic
        @AfterAll
        fun tearDown() {
            driver.quit()
        }
    }
}