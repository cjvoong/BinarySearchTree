package functionalprogramming

import functionalprogramming.FunctionalProgrammingExercises.aToPowerB
import functionalprogramming.FunctionalProgrammingExercises.getElementsAsString
import functionalprogramming.FunctionalProgrammingExercises.isStringPalindrome
import functionalprogramming.FunctionalProgrammingExercises.reverseString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FunctionalProgrammingExercisesTest{

    @Test
    fun testReverseString(){
        assertEquals("987654321",reverseString("123456789"))
    }

    @Test
    fun testGetElementsAsString(){
        assertEquals("1,2,3", getElementsAsString(listOf("1","2","3")))
    }

    @Test
    fun testIsStringPalindrome(){
        println("Testing ABCCBA")
        assertEquals(true,isStringPalindrome("ABCCBA"))
        println("Testing ABCCB")
        assertEquals(false,isStringPalindrome("ABCCB"))
    }

    @Test
    fun testAtoB(){
        assertEquals(8,aToPowerB(2,3))
        assertEquals(16,aToPowerB(2,4))
        assertEquals(9,aToPowerB(3,2))
    }
}