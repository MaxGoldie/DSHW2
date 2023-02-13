package BT;


public class BNode<T extends Comparable<T>>{
	private T data;
	private BNode<T> lc;
	private BNode<T> rc;
	
	public BNode(T data) {
		this.data = data;
		this.lc = null;
		this.rc = null;
	}
	

	public T getData() {
		return data;
	}
	
	public BNode<T> getLC() {
		return lc;
	}
	
	public BNode<T> getRC() {
		return rc;
	}
	
	public void setLC(BNode<T> node) {
		lc = node;
	}
	
	public void setRC(BNode<T> node) {
		rc = node;
	}
	 public int compareTo(BNode<T> aNode){
		    return data.compareTo(aNode.getData());
		    
		    }
	 public void setData(T value){
		    data = value;
		    
		    }
	
}