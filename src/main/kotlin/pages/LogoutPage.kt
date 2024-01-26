package pages

import io.appium.java_client.AppiumBy
import io.appium.java_client.android.AndroidDriver

class LogoutPage(private val driver: AndroidDriver) {
    val menuBtn by lazy { driver.findElement(AppiumBy.accessibilityId("open menu")) }
    val menuLogoutBtn by lazy { driver.findElement(AppiumBy.accessibilityId("menu item log out")) }
    val logoutBtn by lazy { driver.findElement(AppiumBy.id("android:id/button1"))}
    val confirmBtn by lazy { driver.findElement(AppiumBy.id("android:id/button1"))}
    val successMsg by lazy { driver.findElement(AppiumBy.id("android:id/alertTitle"))}

    fun logOut() {
        menuBtn.click()
        menuLogoutBtn.click()
        logoutBtn.click()
    }

}