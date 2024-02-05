package pages

import DriverManager
import io.appium.java_client.AppiumBy
import org.openqa.selenium.By

class LogoutPage() {
    private val driver = DriverManager.getDriver()

    val menuBtn by lazy { driver.findElement(AppiumBy.accessibilityId("open menu")) }
    val menuLogoutBtn by lazy { driver.findElement(AppiumBy.accessibilityId("menu item log out")) }
    val logoutBtn by lazy { driver.findElement(AppiumBy.id("android:id/button1"))}
    val okBtn by lazy { driver.findElement(AppiumBy.id("android:id/button1"))}
    val header by lazy { driver.findElement(AppiumBy.accessibilityId("container header")).findElements(By.className("android.widget.TextView"))}
    val cancelBtn by lazy { driver.findElement(AppiumBy.id("android:id/button2"))}

    fun openMenuButton() {
        menuBtn.click()
    }

    fun tapMenuLogoutButton() {
        menuLogoutBtn.click()
    }

    fun tapLogoutButton() {
        logoutBtn.click()
    }

    fun tapOkButton() {
        okBtn.click()
    }

    fun tapCancelButton() {
        cancelBtn.click()
    }
}