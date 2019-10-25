package 树.二叉查找树;

/**
 * @author guang
 * @since 2019-10-25 15:20
 */
public class BinarySearchTree {

    /**
     * 二叉查找树 如何构造
     */
    private Node tree;

    public Node find(Integer data) {
        Node p = tree;

        while (null != p) {
            if (data < p.getLeft().getData()) {
                p = p.getLeft();
            } else if (data > p.getRight().getData()) {
                p = p.getRight();
            } else {
                return p;
            }
        }


        return null;
    }

    /**
     * 二叉查找树的插入操作
     */
    public BinarySearchTree insert(Integer data) {
        Node p = tree;

        if (null == p) {
            p = new Node(data);
            return this;
        }
        while (null != p) {
            if (data > p.getData()) {
                if (null == p.getRight()) {
                    p.setRight(new Node(data));
                }
                p = p.getRight();
            } else if (data < p.getData()) {
                if (null == p.getLeft()) {
                    p.setLeft(new Node(data));
                }
                p = p.getLeft();
            } else {
                // 已存在的数据
            }
        }


        return this;
    }

    /**
     * 删除节点(比较麻烦啊)
     */
    public void delete(Integer data) {

    }


    public static void main(String[] args) {
        Node root = new Node(33);

        root.setLeft(new Node(17));
        root.setRight(new Node(50));
    }

}
