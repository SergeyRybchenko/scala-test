package BinaryTree

case class Point(id: String, value: Int,  parentId: String) {
  def id: String
  def value: Int
  def parentId: String
}

case class Node(point: Point, children: Seq[Point]) {
  def Point: Point
  def children: Seq[Point]

  def createTree(points: Seq[Point]): Seq[Node] = {
    def insertTree(node: Seq[Node], newPoint: Point): Unit = {
      if (newNode.value < node.value) {
        if (node.left == null) {
          node.left = newNode
        } else {
          insertTree(node.left, newNode)
        }
      } else if (newNode.value > node.value) {
        if (node.right == null) {
          node.right = newNode
        } else {
          insertTree(node.right, newNode)
        }
      }
    }

    var Tree: Seq[Node]
    for (point <- points) {
      insertTree(Tree, point)
    }
  }
  }




