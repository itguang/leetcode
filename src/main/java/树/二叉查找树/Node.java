package 树.二叉查找树;

/**
 * @author guang
 * @since 2019-10-25 15:21
 */
public class Node {

    private Integer data;
    private Node left;
    private Node right;

    public Node() {
    }

    public Node(Integer data) {
        this.data = data;
    }



    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
