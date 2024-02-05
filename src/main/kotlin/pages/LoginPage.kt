package pages
import DriverManager
import io.appium.java_client.AppiumBy
import org.openqa.selenium.By

class LoginPage() {
    private val driver = DriverManager.getDriver()

    val menuBtn by lazy { driver.findElement(AppiumBy.accessibilityId("open menu")) }
    val menuLoginBtn by lazy { driver.findElement(AppiumBy.accessibilityId("menu item log in")) }
    val usernameField by lazy { driver.findElement(AppiumBy.accessibilityId("Username input field")) }
    val passwordField by lazy { driver.findElement(AppiumBy.accessibilityId("Password input field"))}
    val errorUsername by lazy { driver.findElement(AppiumBy.accessibilityId("Username-error-message")).findElements(By.className("android.widget.TextView")) }
    val errorPassword by lazy { driver.findElement(AppiumBy.accessibilityId("Password-error-message")).findElements(By.className("android.widget.TextView")) }
    val submitBtn by lazy { driver.findElement(AppiumBy.accessibilityId("Login button"))}
    val validUsernameBtn by lazy {driver.findElement(AppiumBy.accessibilityId("bob@example.com-autofill"))}
    val lockedOutUsernameBtn by lazy {driver.findElement(AppiumBy.accessibilityId("alice@example.com (locked out)-autofill"))}
    val genericErrorMsg by lazy { driver.findElement(AppiumBy.accessibilityId("generic-error-message")).findElements(By.className("android.widget.TextView"))}

    fun openMenuButton() {
        menuBtn.click()
    }

    fun tapMenuLoginButton() {
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

    fun tapValidUsernameButton() {
        validUsernameBtn.click()
    }

    fun tapLockedOutUsernameButton() {
        lockedOutUsernameBtn.click()
    }

    fun login() {
        openMenuButton()
        tapMenuLoginButton()
        tapValidUsernameButton()
        submitLogin()
    }
}