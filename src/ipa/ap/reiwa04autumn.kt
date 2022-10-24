package ipa.ap

/*
令和４年度秋期 問３ プログラミング
 */
fun main() {
    var stackTop = 0
    var solNum = 0

    val OK = "OK"
    val NG = "NG"
    val VISITED = "VISITED"

    fun setMaze(): Array<Array<String>> {
        // 図１の迷路
        val chart1 = arrayOf(
            arrayOf(NG, NG, NG, NG, NG, NG, NG),
            arrayOf(NG, OK, OK, OK, OK, OK, NG),
            arrayOf(NG, OK, NG, OK, NG, OK, NG),
            arrayOf(NG, OK, OK, NG, OK, NG, NG),
            arrayOf(NG, NG, OK, NG, OK, NG, NG),
            arrayOf(NG, OK, OK, OK, OK, OK, NG),
            arrayOf(NG, NG, NG, NG, NG, NG, NG),
        )
        // 図２の迷路
        val chart2 = arrayOf(
            arrayOf(NG, NG, NG, NG, NG, NG, NG),
            arrayOf(NG, OK, OK, OK, OK, OK, NG),
            arrayOf(NG, OK, NG, OK, NG, OK, NG),
            arrayOf(NG, OK, OK, OK, OK, NG, NG),
            arrayOf(NG, NG, OK, NG, OK, NG, NG),
            arrayOf(NG, OK, OK, OK, OK, OK, NG),
            arrayOf(NG, NG, NG, NG, NG, NG, NG),
        )

        return chart1
    }

    val maze = setMaze()
    val startX = 1
    val startY = 1
    val goalX = 5
    val goalY = 5
    val stackVisit: MutableList<Pair<Int, Int>> = mutableListOf()
    val paths: MutableList<MutableList<Pair<Int, Int>>> = mutableListOf()
    var transition = 0

    fun visit(x: Int, y: Int) {
        maze[x][y] = VISITED
        if (stackTop < stackVisit.size) stackVisit[stackTop] = Pair(x, y)
        else stackVisit.add(Pair(x, y))
        println("$transition: " + stackVisit[stackTop])

        if (x == goalX && y == goalY) {
            paths.add(MutableList(stackTop + 1) { Pair(0, 0) })
            for (k in 0..stackTop) {
                paths[solNum][k] = stackVisit[k]
            }
            solNum += 1
        } else {
            stackTop += 1

            if (maze[x][y + 1] == OK) {
                transition += 1
                visit(x, y + 1)
            }
            if (maze[x + 1][y] == OK) {
                transition += 1
                visit(x + 1, y)
            }
            if (maze[x][y - 1] == OK) {
                transition += 1
                visit(x, y - 1)
            }
            if (maze[x - 1][y] == OK) {
                transition += 1
                visit(x - 1, y)
            }
            stackTop -= 1
            transition += 1
            println("$transition: " + stackVisit[stackTop])
        }
        maze[x][y] = OK
    }

    visit(startX, startY)
    if (solNum == 0) {
        println("迷路の解は見つからなかった")
    } else {
        paths.forEach { println(it) }
    }
}
