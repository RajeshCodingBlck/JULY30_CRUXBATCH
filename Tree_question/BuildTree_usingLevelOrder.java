package Tree_question;

import java.util.LinkedList;
import java.util.Scanner;

import Tree.*;

public class BuildTree_usingLevelOrder {

	static Scanner s = new Scanner(System.in);

	public static TreeNode build() {

		LinkedList<TreeNode> q = new LinkedList();
		System.out.println("Enter the data for Root");

		int data = s.nextInt();

		TreeNode root = new TreeNode(data);

		q.addLast(root);

		while (q.size() > 0) {
			TreeNode curr_node = q.removeFirst();
			System.out.println("Enter the Left Child" + curr_node.data);
			int Left_data = s.nextInt();
			if (Left_data != -1) {
				TreeNode left_child = new TreeNode(Left_data);
				curr_node.left = left_child;
				q.addLast(left_child);
			}
			System.out.println("Enter the Right Child " + curr_node.data);
			int Right_data = s.nextInt();
			if (Right_data != -1) {
				TreeNode right_child = new TreeNode(Right_data);
				curr_node.right = right_child;
				q.addLast(right_child);
			}

		}

		return root;

	}

	public static void Preorder(TreeNode root) {

		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		Preorder(root.left);
		Preorder(root.right);
	}

	public static void main(String[] args) {

		TreeNode root = build();
		Preorder(root);

	}

}
