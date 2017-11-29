package com.example.pkg3

import com.example.pkg1.Greeter as G1
import com.example.pkg2.Greeter as G2

fun main(args: Array<String>) {
    //create an instance from Greeter and called the hello method
    println(G1().hello())
    println(G2().hello())
}