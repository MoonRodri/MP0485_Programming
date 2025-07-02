/**
 * <h2>Programming Object Oriented II: Debt</h2>
 *
 * <p>
 * This package introduces the concept of modeling financial entities and simulating behavior over time.
 * The {@code Debt} class represents a simple financial debt with an interest rate, and provides methods
 * to simulate how the debt grows annually.
 * </p>
 *
 * <h3>Key learning goals:</h3>
 * <ul>
 *   <li><b>Object state with real-world meaning</b>: The {@code balance} and {@code interestRate} variables represent meaningful data fields relevant in financial applications.</li>
 *   <li><b>Behavior through methods</b>: The {@code waitOneYear()} method changes the internal state of the object to reflect how debt increases over time due to interest.</li>
 *   <li><b>Encapsulation and information hiding</b>: The fields are marked as <code>private</code>, emphasizing that internal state should only be modified via class methods.</li>
 *   <li><b>Separation of concerns</b>: Display logic is kept in {@code printBalance()}, while calculation logic is handled by {@code waitOneYear()}, helping students design methods with single responsibilities.</li>
 * </ul>
 *
 * <p>
 * This exercise allows students to explore the concept of compound growth, while reinforcing the object-oriented principle
 * that objects can evolve over time through defined behaviors.
 * </p>
 *
 * <p><b>Note:</b> The {@code Debt} class is intended to demonstrate how a program can simulate time-dependent changes in an object's state.</p>
 *
 * <p>
 * <img src="../../../../resources/DebtUML.png" alt="Debt UML Diagram" width="100" height="100"/>
 * </p>
 */
package main.java.progOO2.p09;
