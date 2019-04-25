package functionalprogramming

import org.junit.jupiter.api.Test

class BinarySearchTreeTest{
    @Test
    fun testAdd(){
        val bsh = BinarySearchTree(10, BinarySearchTree(6), BinarySearchTree(11,
            BinarySearchTree(10), BinarySearchTree(20)))
        println(bsh.add(bsh,7))
    }
}