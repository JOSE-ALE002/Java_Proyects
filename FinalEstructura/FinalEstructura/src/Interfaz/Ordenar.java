package Interfaz;

import Modelo.*;


public class Ordenar {
	
	//el metodo lenght_array retornara un valor entero, este valor indicara el numero de posiciones del arreglo
	//que no estan vacias
	
	public static int lenght_array(Empleado array[])
	{
		int contador = 0;
		
		for(int i = 0; i < array.length && array[i] != null; i++)
		{
			contador++;
		}
		
		return contador;
	}
	
	//metodo de ordenamiento QuickSort utilizando el id como criterio de comparacion, se muestra de forma ancedente
	
	static void QuickSort_IDASC(Empleado array[], int izq, int der){
	    
		int i = izq; 
		int j = der;
		Empleado aux;
	    
		
		int p = array[(izq + der) / 2].getId();

	    while(i <= j){
	        while (array[i].getId() < p){
	            i++;
	            
	        }
	        while (array[j].getId() > p){
	            j--;
	            
	        }

	        if( i <= j){
	            
	            aux = array[i];
	            array[i] = array[j];
	            array[j] = aux;

	            i++; j--;
	        }
	    }

	    if(izq < j)
	        QuickSort_IDASC(array, izq, j);
	    if(i < der){
	        QuickSort_IDASC(array, i, der);
	    }
	}

	//metodo de ordenamiento QuickSort utilizando el id como criterio de comparacion, se muestra de forma dencedente
	
	static void QuickSort_IDDESC(Empleado array[], int izq, int der){
	    
		int i = izq; 
		int j = der;
		Empleado aux;
	    
		int p = array[(izq + der) / 2].getId();

	    while(i <= j){
	        while (array[i].getId() > p){
	            i++;
	            
	        }
	        while (array[j].getId() < p){
	            j--;
	            
	        }

	        if( i <= j){
	            
	        	aux = array[j];
	            array[j] = array[i];
	            array[i] = aux;

	            i++; j--;
	        }
	    }

	    if(izq < j)
	        QuickSort_IDDESC(array, izq, j);
	    if(i < der){
	        QuickSort_IDDESC(array, i, der);
	    }
	    
	}
	
	//metodo de ordenamiento QuickSort utilizando la edad como criterio de comparacion, se muestra de forma ancedente
	
	static void QuickSort_EDADASC(Empleado array[], int izq, int der){
	    
		int i = izq; 
		int j = der;
		Empleado aux;
		
		int p = array[(izq + der) / 2].getEdad();

	    while(i <= j){
	        while (array[i].getEdad() < p){
	            i++;
	            
	        }
	        while (array[j].getEdad() > p){
	            j--;
	            
	        }

	        if( i <= j){
	            
	            aux = array[i];
	            array[i] = array[j];
	            array[j] = aux;

	            i++; j--;
	        }
	    }

	    if(izq < j)
	        QuickSort_EDADASC(array, izq, j);
	    if(i < der){
	        QuickSort_EDADASC(array, i, der);
	    }
	}

	
	//metodo de ordenamiento QuickSort utilizando la edad como criterio de comparacion, se muestra de forma decendente
	
	static void QuickSort_EDADDESC(Empleado array[], int izq, int der){
	    
		int i = izq; 
		int j = der;
		Empleado aux;
	    
		int p = array[(izq + der) / 2].getEdad();

	    while(i <= j){
	        while (array[i].getEdad() > p){
	            i++;
	            
	        }
	        while (array[j].getEdad() < p){
	            j--;
	            
	        }

	        if( i <= j){
	            
	        	aux = array[j];
	            array[j] = array[i];
	            array[i] = aux;

	            i++; j--;
	        }
	    }

	    if(izq < j)
	        QuickSort_EDADDESC(array, izq, j);
	    if(i < der){
	        QuickSort_EDADDESC(array, i, der);
	    }
	    
	}
	
	//metodo de ordenamiento QuickSort utilizando el salario como criterio de compararion, se muestra de forma ancedente
	
	static void QuickSort_SALARIOASC(Empleado array[], int izq, int der){
	    
		int i = izq; 
		int j = der;
		Empleado aux;
	    
		
		double p = array[(izq + der) / 2].getSalario_base();

	    while(i <= j){
	        while (array[i].getSalario_base() < p){
	            i++;
	            
	        }
	        while (array[j].getSalario_base() > p){
	            j--;
	            
	        }

	        if( i <= j){
	            
	            aux = array[i];
	            array[i] = array[j];
	            array[j] = aux;

	            i++; j--;
	        }
	    }

	    if(izq < j)
	        QuickSort_SALARIOASC(array, izq, j);
	    if(i < der){
	        QuickSort_SALARIOASC(array, i, der);
	    }
	}

	//metodo de ordenamiento QuickSort utilizando el salario como criterio de comparacion, se muestra de forma dencedente
	
	static void QuickSort_SALARIODESC(Empleado array[], int izq, int der){
	    
		int i = izq; 
		int j = der;
		Empleado aux;
	    
		double p = array[(izq + der) / 2].getSalario_base();

	    while(i <= j){
	        while (array[i].getSalario_base() > p){
	            i++;
	            
	        }
	        while (array[j].getSalario_base() < p){
	            j--;
	            
	        }

	        if( i <= j){
	            
	        	aux = array[j];
	            array[j] = array[i];
	            array[i] = aux;

	            i++; j--;
	        }
	    }

	    if(izq < j)
	        QuickSort_SALARIODESC(array, izq, j);
	    if(i < der){
	        QuickSort_SALARIODESC(array, i, der);
	    }
	    
	}
	
}
