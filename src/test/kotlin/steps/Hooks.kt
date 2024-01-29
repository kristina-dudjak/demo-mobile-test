package steps

import DriverManager
import io.cucumber.java.After
import io.cucumber.java.Before

class Hooks {
    @Before
    fun setUp() {
        DriverManager.initializeDriver()
    }

    @After
    fun tearDown() {
        DriverManager.quitDriver()
    }
}