package BT;

public class BinaryTree<T extends Comparable<T>> {
	private BNode<T> root;
	private boolean found;

	public BinaryTree() {
		root = null;
	}

	public boolean insert(T data) {
		BNode<T> curr = root;
		BNode<T> parent = root;
		BNode<T> newNode;
		if (root == null) {
			root = new BNode<T>(data);
		} else {
			while (curr != null) {
				if (data.compareTo(curr.getData()) < 0) {
					parent = curr;
					curr = curr.getLC();
				} else if (data.compareTo(curr.getData()) > 0) {

					parent = curr;
					curr = curr.getRC();
				} else
					return false;
			}
			newNode = new BNode<T>(data);
			if (newNode.compareTo(parent) < 0) {
				parent.setLC(newNode);
			} else
				parent.setRC(newNode);
		}
		return true;
	}

	public boolean removeVal(T value) {
		root = removeNode(value, root);
		return found;
	}

	private BNode<T> removeNode(T value, BNode<T> tree) {
		if (tree == null)
			found = false;
		else if (value.compareTo(tree.getData()) < 0)

			tree.setLC(removeNode(value, tree.getLC()));
		else if (value.compareTo(tree.getData()) > 0)

			tree.setRC(removeNode(value, tree.getRC()));
		else {
			tree = removeData(tree);
			found = true;
		}
		return tree;
	}

	private BNode<T> removeData(BNode<T> tree) {

		if (tree.getLC() == null)
			return tree.getRC();
		else if (tree.getRC() == null)
			return tree.getLC();
		else {
			T data = findPredecessor(tree.getLC());
			tree.setData(data);

			tree.setLC(removeNode(data, tree.getLC()));
			return tree;

		}

	}

	private T findPredecessor(BNode<T> tree) {

		while (tree.getRC() != null) {
			tree = tree.getRC();
		}
		return tree.getData();
	}

	public String inOrder() {
		if (root != null) {
			StringBuilder info = new StringBuilder();
			info.append("[ ");
			info = inOrder(info, root.getLC());
			info.append(root.getData().toString() + " ");
			info = inOrder(info, root.getRC());
			info.append("]");
			return info.toString();
		}
		return "Tree is empty";
	}

	private StringBuilder inOrder(StringBuilder info, BNode<T> root) {
		if (root == null) {
			return info;
		}
		inOrder(info, root.getLC());
		info.append(root.getData().toString() + " ");
		inOrder(info, root.getRC());
		return info;
	}

	public String postOrder() {
		StringBuilder info = new StringBuilder("[ ");
		info = postOrder(info, root.getLC());
		info = postOrder(info, root.getRC());
		info.append(root.getData() + " ");
		info.append("]");
		return info.toString();
	}

	private StringBuilder postOrder(StringBuilder info, BNode<T> root) {
		if (root == null) {
			return info;
		}
		postOrder(info, root.getLC());
		postOrder(info, root.getRC());
		info.append(root.getData() + " ");
		return info;
	}

	public String preOrder() {
		StringBuilder info = new StringBuilder("[ ");
		info.append(root.getData().toString() + " ");
		info = preOrder(info, root.getLC());
		info = preOrder(info, root.getRC());
		info.append("]");
		return info.toString();
	}

	private StringBuilder preOrder(StringBuilder info, BNode<T> root) {
		if (root == null) {
			return info;
		}
		info.append(root.getData().toString() + " ");
		preOrder(info, root.getLC());
		preOrder(info, root.getRC());
		return info;
	}

}