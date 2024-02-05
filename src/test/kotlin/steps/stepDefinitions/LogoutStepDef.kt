package steps.stepDefinitions

import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import pages.LoginPage
import pages.LogoutPage

class LogoutStepDef {

    private val loginPage = LoginPage()
    private val logoutPage = LogoutPage()

    @Given("I am logged in")
    fun iAmLoggedIn() {
        loginPage.login()
    }

    @When("I tap on menu button")
    fun iTapMenuBtn() {
        logoutPage.openMenuButton()
    }

    @When("I tap on menu log out")
    fun iTapMenuLogOutBtn() {
        logoutPage.tapMenuLogoutButton()
    }

    @When("I tap on log out button")
    fun iTapLogOutBtn() {
        logoutPage.tapLogoutButton()
    }

    @When("I close the popup by tapping on the OK button")
    fun iClosePopupTapOK() {
        logoutPage.tapOkButton()
    }

    @Then("I should be logged out and on login page")
    fun iSeeLoginPage() {
        assert(logoutPage.header[0].getAttribute("text") == "Login") { "Login page not displayed" }
    }

    @When("I tap on cancel log out")
    fun iTapCancelLogout() {
        logoutPage.tapCancelButton()
    }

    @When("I tap on menu log in")
    fun iTapLogIn() {
        loginPage.tapMenuLoginButton()
    }

    @Then("I should be logged in and not see login page")
    fun iDoNotSeeLoginPage() {
        assert(logoutPage.header[0].getAttribute("text") != "Login") { "Login page displayed" }
    }
}