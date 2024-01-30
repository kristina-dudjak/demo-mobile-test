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

    @When("I click on menu button")
    fun iClickMenuBtn() {
        logoutPage.openMenuButton()
    }

    @When("I click on menu log out")
    fun iClickMenuLogOutBtn() {
        logoutPage.clickMenuLogoutButton()
    }

    @When("I click on log out button")
    fun iClickLogOutBtn() {
        logoutPage.clickLogoutButton()
    }

    @When("I close the popup by clicking on the OK button")
    fun iClosePopupClickingOK() {
        logoutPage.clickOkButton()
    }

    @Then("I should be logged out and on login page")
    fun iSeeLoginPage() {
        assert(logoutPage.header[0].getAttribute("text") == "Login") { "Login page not displayed" }
    }

    @When("I click on cancel log out")
    fun iClickCancelLogout() {
        logoutPage.clickCancelButton()
    }

    @When("I click on menu log in")
    fun iClickLogIn() {
        loginPage.clickMenuLoginButton()
    }

    @Then("I should be logged in and not see login page")
    fun iDoNotSeeLoginPage() {
        assert(logoutPage.header[0].getAttribute("text") != "Login") { "Login page displayed" }
    }
}