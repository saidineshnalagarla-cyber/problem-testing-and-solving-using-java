import java.util.*;

public class Task14_JavaVisitorPattern {
    interface Tree {
        void accept(Visitor visitor);
    }

    static class TreeNode implements Tree {
        int value;
        int depth;
        List<TreeNode> children = new ArrayList<>();

        TreeNode(int value, int depth) {
            this.value = value;
            this.depth = depth;
        }

        public void accept(Visitor visitor) {
            visitor.visit(this);
            for (TreeNode child : children)
                child.accept(visitor);
        }
    }

    interface Visitor {
        void visit(TreeNode node);
    }

    static class SumVisitor implements Visitor {
        int sum;

        public void visit(TreeNode node) {
            sum += node.value;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        TreeNode[] nodes = new TreeNode[n];

        for (int i = 0; i < n; i++)
            nodes[i] = new TreeNode(sc.nextInt(), sc.nextInt());

        for (int i = 0; i < n - 1; i++) {
            int parent = sc.nextInt();
            int child = sc.nextInt();
            nodes[parent].children.add(nodes[child]);
        }

        SumVisitor visitor = new SumVisitor();
        nodes[0].accept(visitor);

        System.out.println(visitor.sum);
    }
}

/*
INPUT:
3
4 0
2 1
6 1
0 1
0 2

OUTPUT:
12
*/