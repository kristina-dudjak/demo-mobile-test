
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import pages.LoginPage

class LoginTest : TestBase() {
    private lateinit var loginPage: LoginPage

    @BeforeEach
    fun `Navigate to login`() {
        loginPage = LoginPage(driver)
        loginPage.openMenuButton()
        loginPage.clickMenuLoginButton()
    }

    @Test
    fun `Successful login via clicking username`() {
        loginPage.clickValidUsernameButton()
        loginPage.submitLogin()
        assert(loginPage.genericErrorMsg.isEmpty()) { "Failed login" }
    }

    @Test
    fun `Clicking locked out user displays error message`() {
        loginPage.clickLockedOutUsernameButton()
        loginPage.submitLogin()
        assert(loginPage.genericErrorMsg[0].getAttribute("text") == "Sorry, this user has been locked out.") { "Error message is not visible"}
    }

    @Test
    fun `Successful login via entering user data`() {
        loginPage.enterUsername("bob@example.com")
        loginPage.enterPassword("10203040")
        loginPage.submitLogin()
        assert(loginPage.genericErrorMsg.isEmpty()) { "Failed login" }
    }

    @Test
    fun `Display error for empty username field`() {
        loginPage.submitLogin()
        assert(loginPage.errorUsernameMsg[0].getAttribute("text") == "Username is required") { "Error message is not visible" }
    }

    @Test
    fun `Display error for empty password field`() {
        loginPage.enterUsername("a")
        loginPage.submitLogin()
        assert(loginPage.errorPasswordMsg[0].getAttribute("text") == "Password is required") { "Error message is not visible" }
    }

    @Test
    fun `Display error for non existing user`() {
        loginPage.enterUsername("a")
        loginPage.enterPassword("a")
        loginPage.submitLogin()
        assert(loginPage.genericErrorMsg[0].getAttribute("text") == "Provided credentials do not match any user in this service.") { "Error message is not visible" }
    }


}