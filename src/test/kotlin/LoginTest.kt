
import io.appium.java_client.AppiumBy
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class LoginTest : TestBase() {

    @BeforeEach
    fun `Navigate to login`() {
        driver.findElement(AppiumBy.accessibilityId("open menu")).click()
        driver.findElement(AppiumBy.accessibilityId("menu item log in")).click()
    }

    @Test
    fun `correct login gives success`() {
        driver.findElement(AppiumBy.accessibilityId("Username input field")).sendKeys("aaa")
    }
}