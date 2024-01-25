package pages
import io.appium.java_client.AppiumBy
import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration

class LoginPage(private val driver: AndroidDriver) {

    val menuBtn by lazy { driver.findElement(AppiumBy.accessibilityId("open menu")) }
    val menuLoginBtn by lazy { driver.findElement(AppiumBy.accessibilityId("menu item log in")) }
    val usernameField by lazy { driver.findElement(AppiumBy.accessibilityId("Username input field")) }
    val passwordField by lazy { driver.findElement(AppiumBy.accessibilityId("Password input field"))}
    val errorUsernameMsg by lazy { driver.findElement(AppiumBy.accessibilityId("Username-error-message")).findElements(By.className("android.widget.TextView")) }
    val errorPasswordMsg by lazy { driver.findElement(AppiumBy.accessibilityId("Password-error-message")).findElements(By.className("android.widget.TextView")) }
    val submitBtn by lazy { driver.findElement(AppiumBy.accessibilityId("Login button"))}
    val validUsernameBtn by lazy {driver.findElement(AppiumBy.accessibilityId("bob@example.com-autofill"))}
    val lockedOutUsernameBtn by lazy {driver.findElement(AppiumBy.accessibilityId("alice@example.com (locked out)-autofill"))}
    val genericErrorMsg by lazy { driver.findElement(AppiumBy.accessibilityId("generic-error-message")).findElements(By.className("android.widget.TextView"))}

    fun openMenuButton() {
        menuBtn.click()
    }

    fun clickMenuLoginButton() {
        menuLoginBtn.click()
    }

    fun enterUsername(username: String) {
        clearUsername()
        usernameField.sendKeys(username)
    }

    fun clearUsername() {
        usernameField.clear()
    }

    fun enterPassword(password: String) {
        clearPassword()
        passwordField.sendKeys(password)
    }

    fun clearPassword() {
        passwordField.clear()
    }

    fun submitLogin() {
        submitBtn.click()
    }

    fun clickValidUsernameButton() {
        validUsernameBtn.click()
    }

    fun clickLockedOutUsernameButton() {
        lockedOutUsernameBtn.click()
    }

    fun logoutLoggedUser() {
        val wait = WebDriverWait(driver, Duration.ofSeconds(10))
        val containerHeader = wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("container header")))

            val headerTxt = containerHeader.findElements(By.className("android.widget.TextView"))
            if (headerTxt.isNotEmpty() && headerTxt[0].getAttribute("text") != "Login") {
                val logoutPage = LogoutPage(driver)
                logoutPage.navigateToLogout()
                logoutPage.logOut()
                wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("container header")))
            }

    }



}