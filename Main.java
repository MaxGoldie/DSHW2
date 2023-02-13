package BT;

public class Main {
	public static void main(String[] args) {
		BinaryTree<Integer> bt = new BinaryTree<>();

		bt.insert(48);
		bt.insert(28);
		bt.insert(43);
		bt.insert(1);
		bt.insert(4);
		bt.insert(23);
		bt.insert(53);
		bt.insert(3);
		bt.insert(53);
		bt.insert(2);
		bt.insert(5);
		bt.insert(44);
		bt.insert(33);
		bt.insert(22);
		bt.insert(11);
		bt.insert(8);
		bt.insert(6);
		bt.insert(4);
		bt.insert(59);
		bt.insert(86);
		
		System.out.println(bt.postOrder());
		
		System.out.println(bt.preOrder());
		
		System.out.println(bt.inOrder());
		
		bt.removeVal(48);
		bt.removeVal(28);
		bt.removeVal(43);
		bt.removeVal(1);
		bt.removeVal(4);
		bt.removeVal(23);
		bt.removeVal(53);
		bt.removeVal(3);
		bt.removeVal(53);
		bt.removeVal(2);
		bt.removeVal(5);
		bt.removeVal(44);
		bt.removeVal(33);
		bt.removeVal(22);
		bt.removeVal(11);
		bt.removeVal(8);
		bt.removeVal(6);
		bt.removeVal(4);
		bt.removeVal(59);
		bt.removeVal(86);
		
		System.out.println(bt.inOrder());
		
	}
}