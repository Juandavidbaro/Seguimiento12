package model;

public class NodeDoubleList {
	private int value;
	private NodeDoubleList next;
	private NodeDoubleList prev;
	private int contador;
	
	public NodeDoubleList(int value) {
		this.value = value;
		this.contador=contador;
	}
	
	public int getContador() {
		return contador;
	}
	
	public void setContador(int contador) {
		this.contador=contador;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public NodeDoubleList getNext() {
		return next;
	}
	public void setNext(NodeDoubleList next) {
		this.next = next;
	}
	public NodeDoubleList getPrev() {
		return prev;
	}
	public void setPrev(NodeDoubleList prev) {
		this.prev = prev;
	}
}
