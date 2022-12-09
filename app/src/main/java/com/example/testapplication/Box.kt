package com.example.testapplication

/**
 * Creates a Box Object.
 * @author Team Sheeshable
 * @property length Length of the box.
 * @property width Width of the box.
 * @property height Height of the box.
 * @constructor Uses 3 int digits for length, width, and height.
 */
class Box(
    var length: Int = 0,
    var width: Int = 0,
    var height: Int = 0
) {
    init {
        println("Init Block Called")
    }

    /**
     * A secondary constructor for the Box class.
     */
    constructor() : this(0,0,0){
        println("Secondary constructor called")
    }

    /**
     * Value of the calculated volume of the shape.
     */
    val volume
        get() = length * width * height

    /**
     * Prints if box has value.
     */
    fun fillContents() {
        println("Box is Filled")
    }

    /**
     * Prints when box is opened.
     */
    fun open() {
        println("Box Opened")
    }
}