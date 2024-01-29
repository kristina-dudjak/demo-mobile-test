/*
package old_tests
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import pages.LogoutPage

class LogoutTest : TestBase(){
    private lateinit var logoutPage : LogoutPage

    @BeforeEach
    fun `Set LogoutPage`() {
        logoutPage = LogoutPage()
    }

    @Test
    fun `Log out`() {
        logoutPage.logOut()
        assert(logoutPage.successMsg.getAttribute("text") == "You are successfully logged out.")
        logoutPage.confirmBtn.click()
    }
}
*/