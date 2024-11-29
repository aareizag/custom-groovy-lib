package org.testing

import java.util.logging.Logger

class CustomLibrary {
    private static final Logger logger = Logger.getLogger(CustomLibrary.class.name)

    def testingHello() {
        System.out.println("This is a testing text.")
        logger.info("Hello! This message is logged via Jenkins' logger.")
    }

    /**
     * A simple method to log a greeting message.
     *
     * @param name The name to include in the greeting.
     * @return The greeting message as a String.
     */
    def sayHello(String name) {
        def message = "Hello, ${name}! Welcome to the Jenkins pipeline."
        println(message)
        return message
    }

    /**
     * A method to calculate the factorial of a given number.
     *
     * @param number The number to calculate the factorial for.
     * @return The factorial of the number as an Integer.
     */
    def calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative")
        }

        def result = 1
        (1..number).each { result *= it }
        println("Factorial of ${number} is ${result}")
        return result
    }
}