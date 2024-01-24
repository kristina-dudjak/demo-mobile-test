package pages
import io.appium.java_client.AppiumBy
import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.By

class LoginPage(private val driver: AndroidDriver) {

    private val menuBtn by lazy { driver.findElement(AppiumBy.accessibilityId("open menu")) }
    private val menuLoginBtn by lazy { driver.findElement(AppiumBy.accessibilityId("menu item log in")) }
    private val usernameField by lazy { driver.findElement(AppiumBy.accessibilityId("Username input field")) }
    private val passwordField by lazy { driver.findElement(AppiumBy.accessibilityId("Password input field"))}
    private val submitBtn by lazy { driver.findElement(AppiumBy.accessibilityId("Login button"))}
    val loginErrorMsg by lazy { driver.findElement(By.xpath("//android.widget.TextView[@text=\"Provided credentials do not match any user in this service.\"]")) }

    fun openMenuButton() {
        menuBtn.click()
    }

    fun clickMenuLoginButton() {
        menuLoginBtn.click()
    }

    fun enterUsername(username: String) {
        usernameField.sendKeys(username)
    }

    fun enterPassword(password: String) {
        passwordField.sendKeys(password)
    }

    fun submitLogin() {
        submitBtn.click()
    }

}