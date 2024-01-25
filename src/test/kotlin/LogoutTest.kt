
import org.junit.jupiter.api.Test
import pages.LogoutPage

class LogoutTest : TestBase(){
    private val logoutPage = LogoutPage(driver)

    @Test
    fun `Log out`() {
        logoutPage.navigateToLogout()
        logoutPage.logOut()
    }
}