/**
 * <h2>Programming Object Oriented II: DecreasingCounter</h2>
 *
 * <p>
 * This package introduces the concept of modifying an object's internal state
 * through method calls. The {@code DecreasingCounter} class serves as a basic example
 * of a mutable object — one whose attributes can change after instantiation.
 * </p>
 *
 * <h3>Key learning goals:</h3>
 * <ul>
 *   <li><b>State change through methods</b>: The {@code decrement()} method demonstrates how the value of an instance variable can be changed based on a condition.</li>
 *   <li><b>Control structures</b>: Students apply conditional logic to prevent the counter from going below zero.</li>
 *   <li><b>Reset behavior</b>: The {@code reset()} method shows how an object's state can be restored to a default value.</li>
 *   <li><b>Encapsulation</b>: The {@code value} field is private, so any changes to it must be done through class methods, reinforcing encapsulation.</li>
 * </ul>
 *
 * <p>
 * This exercise helps students understand how objects can have <b>behavior that modifies internal data</b>,
 * and prepares them for the concepts of validation, state management, and method interaction.
 * </p>
 *
 * <p><b>Note:</b> The {@code DecreasingCounter} class is intended to support hands-on practice with mutability and basic defensive programming (e.g., preventing negative values).</p>
 *
 * <p>
 * <img src="../../../../resources/DecreasingCounterUML.png" alt="DecreasingCounter UML Diagram" width="300" height="300"/>
 * </p>
 */
package main.java.progOO2.p08;
