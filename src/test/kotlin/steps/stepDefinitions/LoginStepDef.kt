package steps.stepDefinitions

import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import pages.LoginPage

class LoginStepDef() {

    private val loginPage = LoginPage()

    @Given("I am on a login page")
    fun iAmOnLoginPage() {
        loginPage.openMenuButton()
        loginPage.tapMenuLoginButton()
    }

    @When("I tap on a valid username button")
    fun iTapValidUsernameBtn() {
        loginPage.tapValidUsernameButton()
    }

    @When("I tap on a submit button")
    fun iTapSubmitBtn() {
        loginPage.submitLogin()
    }

    @Then("I should see no login error message")
    fun iSeeNoErrorMsg() {
        assert(loginPage.genericErrorMsg.isEmpty()) { "Failed login" }
    }

    @When("I tap on a locked out username button")
    fun iTapLockedOutUsernameBtn() {
        loginPage.tapLockedOutUsernameButton()
    }

    @Then("I should see locked out user error message")
    fun iSeeLockedOutErrorMsg() {
        assert(loginPage.genericErrorMsg[0].getAttribute("text") == "Sorry, this user has been locked out.") { "Error message is not visible"}
    }

    @When("I enter the username {string}")
    fun iEnterUsername(username: String) {
        loginPage.enterUsername(username)
    }

    @When("I enter the password {string}")
    fun iEnterPassword(password: String) {
        loginPage.enterPassword(password)
    }

    @Then("I should see an empty username error message")
    fun iSeeEmptyUsernameErrorMsg() {
        assert(loginPage.errorUsername[0].getAttribute("text") == "Username is required") { "Error message is not visible" }
    }

    @Then("I should see an empty password error message")
    fun iSeeEmptyPasswordErrorMsg() {
        assert(loginPage.errorPassword[0].getAttribute("text") == "Password is required") { "Error message is not visible" }
    }

    @Then("I should see a nonexistent user error message")
    fun iSeeNonexistentUserErrorMsg() {
        assert(loginPage.genericErrorMsg[0].getAttribute("text") == "Provided credentials do not match any user in this service.") { "Error message is not visible" }
    }
}