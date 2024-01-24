
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import pages.LoginPage

class LoginTest : TestBase() {
    private val loginPage = LoginPage(driver)

    @BeforeEach
    fun `Navigate to login`() {
        loginPage.openMenuButton()
        loginPage.clickMenuLoginButton()
    }

    @Test
    fun `correct login gives success`() {
        loginPage.enterUsername("bob@example.com")
        loginPage.enterPassword("10203040")
        loginPage.submitLogin()
        assert(loginPage.loginErrorMsg == null) { "Error message is visible" }
    }
}