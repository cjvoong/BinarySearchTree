package functionalprogramming

import com.google.gson.GsonBuilder

data class  BinarySearchTree (
    val value: Int,
    val left : BinarySearchTree? = null,
    val right: BinarySearchTree? = null
) {

    override fun toString():String {
        val gson = GsonBuilder().setPrettyPrinting().serializeNulls().create()
        return gson.toJson(this)
    }

    fun add(bsh:BinarySearchTree,toAdd:Int):BinarySearchTree{
        return if (toAdd < bsh.value)
            if (bsh.left!=null)
                bsh.copy(left=add(bsh.left,toAdd))
            else
                bsh.copy(left=BinarySearchTree(toAdd))
        else
            if (bsh.right!=null)
                bsh.copy(right=add(bsh.right,toAdd))
            else
                bsh.copy(right=BinarySearchTree(toAdd))
    }
}