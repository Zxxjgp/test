package cn.com.objectsort;

/**
 * @ProjectName: test
 * @Package: cn.com.objectsort
 * @ClassName: Btreen
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/9/21 9:22
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/21 9:22
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Btreen<T extends Comparable<T>> {
    private class Node{
        private Comparable<T> data;
        private Node parent;
        private Node left;
        private Node right;


        private Node(Comparable<T> da){
            this.data = da;
        }

        public void addNode(Node newdate){
            if (newdate.data.compareTo((T)this.data) <= 0){
                if (this.left == null){
                    this.left = newdate;
                    this.parent = this;
                }else {
                    this.left.addNode(newdate);
                }
            }else {
                if (this.right == null){
                    this.right = newdate;
                    this.parent = this;
                }else {
                    this.right.addNode(newdate);
                }
            }

        }

        public void toArrayNode(){
            if (this.left !=null){
                this.left.toArrayNode();
            }
            Btreen.this.returndate[Btreen.this.foot++] = this.data;
            if (this.right !=null){
                this.right.toArrayNode();
            }
            Btreen.this.returndate[Btreen.this.foot++] = this.data;
        }
    }

    /**
     * 二叉树的功能实现
     */

    private Node root;
    private int count;
    private int foot = 0;
    private Object[] returndate;


    //增加数据
    public void add(Comparable<T> data){
        if (data == null){
            throw new NullPointerException("保存的数据为空");
        }
        Node newnode = new Node(data);
        if (this.root == null){
            this.root = newnode;
        }else {
            this.root.addNode(newnode);
        }
        this.count++;
    }

    /**
     * 找出数据
     */
    public Object[] toArray(){
        if (this.count == 0){
            return null;
        }
        this.returndate = new Object[this.count];
        this.foot= 0;
        this.root.toArrayNode();
        return this.returndate;
    }
}
