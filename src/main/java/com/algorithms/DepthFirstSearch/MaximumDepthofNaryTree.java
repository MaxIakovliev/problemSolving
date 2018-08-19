package com.algorithms.DepthFirstSearch;

import java.util.List;

public class MaximumDepthofNaryTree {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    ;

    public int maxDepth(Node root) {
        return this.dfs(root,1);
    }

    private int dfs(Node node, int depth) {
        if (node == null) {
            return depth - 1;
        }
        if (node.children==null ||node.children.size()==0){
            return depth;
        }
        int tmpDepth=depth;
        for(Node cur:node.children){
            int tmp=dfs(cur,tmpDepth+1);
            depth=Math.max(depth,tmp);
        }
        return depth;
    }
}
