package model;

public class DoubleListDouble {

	private NodeDoubleList first;
	private NodeDoubleList last;
	private NodeDoubleList turno;
	
	public DoubleListDouble() {
		// TODO Auto-generated constructor stub
	}

	public void add(int value) {
		NodeDoubleList newNode = new NodeDoubleList(value);

		if (first == null) { // Lista vacia
			first = newNode;			
			last = newNode;
			turno=first;
		} else {

			last.setNext(newNode);
			newNode.setPrev(last);
			last = newNode;

		}
	}

	public boolean delete(int value) {
		boolean deleted = false;

		NodeDoubleList temp = first;
		while (temp != null && !deleted) {
			if (temp.getValue() == value) {
				if (temp == first && temp == last) {
					first = null;
					last = null;
				} else if (temp == first) {
					first = first.getNext();
					first.setPrev(null);
				} else if (temp == last) {
					last = last.getPrev();
					last.setNext(null);
				} else {
					temp.getPrev().setNext(temp.getNext());
					temp.getNext().setPrev(temp.getPrev());
				}
				deleted = true;
			} else {
				temp = temp.getNext();
			}
		}

		return deleted;
	}
	
	
	public void mostrarTurno(NodeDoubleList node) {
		System.out.println("Su turno es: "+ node.getValue()+"\n");
		
	}

	public void mostrarTurno() {
		mostrarTurno(first);		
	}
	
	public void pasarTurno() {
		turno.setContador(turno.getContador()+1);
		if(turno.getContador()==3) {
			System.out.println("El usuario no se ha presentado 3 veces, su turno ("+turno.getValue()+ ") ha sido eliminado");
			delete(turno.getValue());
		}
		turno= turno.getNext();
	}

	
}
