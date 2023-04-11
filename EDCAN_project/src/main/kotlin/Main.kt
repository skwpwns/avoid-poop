import java.util.Scanner
val ROW_LEN: Int = 90
val COL_LEN: Int = 24
var map = Array(COL_LEN, { Array<Char>(ROW_LEN, {' '}) })

fun main() {
    val board = board()
    board.set_up()
    val key = System.`in`.read()
    if (key != null) {
        print("GAME START")
    }
    for (i in 1..25) {
        print("\n")
    }
    board.printOutline()
    println("\n")
    board.gmaeoverview()

}
class board {
    fun markFirstLastBlock(size: Int) {
        print("■")
        for (i in 1..size - 2) {
            print(" ")
        }
        print("■\n")
    }

    fun drawBoldLine(size: Int) {
        for (i in 1..size) {
            print("■")
        }
        print("\n")
    }

    fun set_up() {
        drawBoldLine(ROW_LEN)
        for (i in 1..COL_LEN / 2) {
            markFirstLastBlock(ROW_LEN)
        }
        println("■                                +----------------------+                                ■")
        println("■                               |        POKEMON         |                               ■")
        println("■                                +----------------------+                                ■")
        println("■                                     ENTER TO START                                     ■")
        for (i in 1..COL_LEN / 2) {
            markFirstLastBlock(ROW_LEN)
        }
        drawBoldLine(ROW_LEN)
    }

    fun gmaeoverview() {
        drawBoldLine(ROW_LEN)
        for (i in 1..COL_LEN / 2) {
            markFirstLastBlock(ROW_LEN)
        }
        println("■                               +-----------------------+                                ■")
        println("■                              |        GAMEOVER         |                               ■")
        println("■                               +-----------------------+                                ■")
        println("■                                    ENTER TO RESTART                                    ■")
        for (i in 1..COL_LEN / 2) {
            markFirstLastBlock(ROW_LEN)
        }
    }


    fun printOutline() {
        for (i in 0..ROW_LEN - 1) {
            print("■")
        }
        print("\n")
        for (i in 1..COL_LEN + 4) {
            for (j in 0..ROW_LEN - 1) {
                if (j == 0 || j == ROW_LEN - 1) {
                    print("■")
                } else {
                    print(" ")
                }
            }
            print("\n")
        }
        for (i in 0..ROW_LEN - 1) {
            print("■")
        }
    }
}

