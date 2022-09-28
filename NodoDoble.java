package listasdobles;


public class NodoDoble<T> {
	private T dato;
    private NodoDoble<T> siguiente;
    private NodoDoble<T> anterior;
    
    public NodoDoble() {
    }

    public NodoDoble(T valor) {
        this.dato = valor;
    }

    public NodoDoble(T dato, NodoDoble<T> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public NodoDoble<T> getSiguiente() {
        return siguiente;
    }
    public NodoDoble<T> getAnterior() {
    	return anterior;
    }

    public void setSiguiente(NodoDoble<T> siguiente) {
        this.siguiente = siguiente;
    }
    public void setAnterior(NodoDoble<T> anterior) {
    	this.anterior = anterior;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
    public void agregarAlfinal(T valor) {
    	NodoDoble<T>nuevo = new NodoDoble(valor);
    			if(head==null) {
    				this.head= nuevo;
    			}else {
    				NodoDoble<T> aux =this.head;
    				while(aux.getSiguiente()!=null) {
    					aux=aux.getSiguiente();
    				}
    				nuevo.setAnterior(aux);
    				aux.setSiguiente(nuevo);
    				aux=null;
    				nuevo=null;
    			}
    }
    public void agregarAlInicio(T valor) {
    	NodoDoble<T>nuevo=new NodoDoble(valor);
    			if(this.nuevo==null) {
    				this.head=nuevo;
    			}else {
    				nuevo.setSiguiente(this.head);
    				head.setAnterior(nuevo);
    				this.head=nuevo;
    			}
    }
    @Override
    public String toString() {
        
        return "|"+dato+"| -->"; 
    }
    public String printAll(){
        return "[Dato = " + dato + "] -> [Siguiente : " + this.getSiguiente() + "]";
    }
    
    public static void main(String[] args) {
        System.out.println("Probando Nodo");
        
        NodoDoble<Integer> head;
        head = new NodoDoble<>(10);
        NodoDoble<Integer> nuevo = new NodoDoble(4,null);
        head.setSiguiente(nuevo);
        nuevo=null;
        System.out.println( head );
        
        
        head.setSiguiente(new NodoDoble(20));
        System.out.println( head.getSiguiente() );
        
        
        System.out.println(".-.-.---");
        NodoDoble aux = head;
        while(aux != null){
            System.out.print(aux);
            aux=aux.getSiguiente();
        }

        System.out.println("");
        head.printAll();
       
    }

}

