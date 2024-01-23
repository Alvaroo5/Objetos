package Ej5;

public class Texto {
	/*
	StringBuilder cadena = new StringBuilder();
	private int longitudMax;
	
	public Texto(int longitudMax) {
        this.longitudMax = longitudMax;
        this.cadena = new StringBuilder();
    }
	
	public void caracterAlPrincipio(char caracter) {
		if (cadena.length() < longitudMax) {
            cadena.insert(0, caracter);
        } else {
            System.out.println("No hay espacio disponible.");
        }
	}
	
	public void caracterAlFinal(char caracter) {
		if (cadena.length() < longitudMax) {
            cadena.append(caracter);
        } else {
            System.out.println("No hay espacio disponible.");
        }
	}
	
	public void cadenaAlPrincipio(String texto) {
		if (cadena.length() + texto.length() <= longitudMax) {
            cadena.insert(0, texto);
        } else {
            System.out.println("La cadena excede la longitud máxima permitida.");
        }
	}
	
	public void cadenaAlFinal(String texto) {
		if (cadena.length() + texto.length() <= longitudMax) {
            cadena.append(texto);
        } else {
            System.out.println("La cadena excede la longitud máxima permitida.");
        }
	}
	
	public int contarVocales() {
		int contadorVocales = 0;
		
		for (int i = 0; i < cadena.length(); i++) {
            if ("a".contains(String.valueOf(cadena.charAt(i)))) {
                contadorVocales++;
            }else if("e".contains(String.valueOf(cadena.charAt(i)))) {
            	contadorVocales++;
            }else if("i".contains(String.valueOf(cadena.charAt(i)))) {
            	contadorVocales++;
            }else if("o".contains(String.valueOf(cadena.charAt(i)))) {
            	contadorVocales++;
            }else if("u".contains(String.valueOf(cadena.charAt(i)))) {
            	contadorVocales++;
            }else if("A".contains(String.valueOf(cadena.charAt(i)))) {
            	contadorVocales++;
            }else if("E".contains(String.valueOf(cadena.charAt(i)))) {
            	contadorVocales++;
            }else if("I".contains(String.valueOf(cadena.charAt(i)))) {
            	contadorVocales++;
            }else if("O".contains(String.valueOf(cadena.charAt(i)))) {
            	contadorVocales++;
            }else if("U".contains(String.valueOf(cadena.charAt(i)))) {
            	contadorVocales++;
            }
        }
		
		return contadorVocales;
	}
	
	public StringBuilder obtenerCadena() {
        return cadena;
    }

    public int obtenerLongitudMax() {
        return longitudMax;
    }
    */
	private int longMax=0;
	private StringBuffer sB;
	
	Texto(String texto,int longMax){
		sB=new StringBuffer(longMax);
		sB.append(texto,0,texto.length()); //char[],offset,len
		this.longMax=longMax;
	}
	
	public void addCaracterDetras(char caracter) {
		if (this.sB.length()<this.longMax) 
			this.sB.append(caracter);

	}
	
	public void addCaracterDelante(char caracter) {
		if (this.sB.length()<this.longMax) {
			StringBuffer sbTmp= new StringBuffer();
			sbTmp.append(caracter);
			sbTmp.append(this.sB);
			this.sB=sbTmp;		
		}
	}
	
	public void addCadenaDetras(String cadena) {
		if ((this.sB.length()+cadena.length())<=this.longMax) 
			this.sB.append(cadena);

	}
	
	public void addCadenaDelante(String cadena) {
		if (((this.sB.length()+cadena.length())<=this.longMax)) {
			StringBuffer sbTmp= new StringBuffer(cadena);
			sbTmp.append(this.sB);
			this.sB=sbTmp;		
		}
	}
	
	public void cuentaVocales() {
		
		int numVocales=0;

		for (int i=0; i<this.sB.length(); i++) {
		    char actual = this.sB.toString().toLowerCase().charAt(i);

		    switch (actual) {
		        case 'a','e','i','o','u':
		            numVocales++;
		            break;
		        default:
		            break;
		    }
		}
		System.out.println("Vocales:"+numVocales);
	}
	
	public void muestraCadena() {
		System.out.println(this.sB);
	}
}


