package IntroToDataStructuresAndAlgorithms.BinarySearchTrees;

import com.sun.source.tree.Tree;

public class BinarySearchTree {
    private TreeNode root;

    public void insert(Integer data){
        if (root ==null){
            this.root = new TreeNode(data);
        }else {
            root.insert(data);
        }
    }
    public TreeNode find(Integer data){
        if (root!= null){
            return root.find(data);
        }
        return null;
    }
    public void delete(Integer data){
        TreeNode toDelete = find(data);
        toDelete.isDeleted();
    }
    public Integer smallest(){
        if (this.root != null){
            return root.smallest();
        }
        return null;
    }
    public Integer largest(){
        if (this.root != null){
            return root.largest();
        }
        return null;
    }
    /*
    public void delete(Integer data){
        TreeNode current = this.root;
        TreeNode parentt = this.root;
        boolean isLeftChild = false;

        if (current == null){
            return;
        }
        while (current != null && current.getData() != data){
            parentt = current;
            if (data < current.getData()){
                current = current.getLeftChild();
                isLeftChild = true;
            }else {
                current = current.getLeftChild();
                isLeftChild = false;
            }
        }

        if (current == null){
            return;
        }
        if (current.getLeftChild() == null && current.getRightChild() == null){
            if (current == root){
                root = null;
            }else {
                if (isLeftChild){
                    parentt.setLeftChild(null);
                }else {
                    parentt.setRightChild(null);
                }
            }
        }
        else if(current.getRightChild() == null){
            if (current == root){
                root = current.getLeftChild();
            }else if (isLeftChild){
                parentt.setLeftChild(current.getLeftChild());
            }else {
                parentt.setRightChild(current.getLeftChild());
            }
        }
        else if(current.getLeftChild() == null){
            if (current == root){
                root = current.getRightChild();
            }else if (isLeftChild){
                parentt.setLeftChild(current.getRightChild());
            }else {
                parentt.setRightChild(current.getRightChild());
            }
        }



    }
      */

}
