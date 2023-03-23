package Juegode3enraya;

public class tablero {
	private char[][] matriz = new char[3][3];
	private char simboloDef = '-';

	public char[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(char[][] matriz) {
		this.matriz = matriz;
	}

	public void RellenarMatriz() {

		for (int i = 0; i < this.matriz.length; i++) {
			for (int j = 0; j < this.matriz.length; j++) {
				this.matriz[i][j] = this.simboloDef;
			}
		}
	}

	public String mostrarMatriz() {
		String resultado = "";
		for (int i = 0; i < this.matriz.length; i++) {
			for (int j = 0; j < this.matriz.length; j++) {
				resultado += this.matriz[i][j];
			}
			System.out.println("");
		}
		return resultado;
	}

	public void InsertarEn(int fila, int columna, char simbolo) {
		this.matriz[fila][columna] = simbolo;
	}

	public boolean validarPosicion(int fila, int columna) {
		if (fila >= 0 && fila < this.matriz.length && columna >= 0 && columna < this.matriz.length) {
			return true;
		}
		return false;
	}

	public boolean HayValorPosicion(int fila, int columna) {
		if (this.matriz[fila][columna] != this.simboloDef) {
			return true;
		}
		return false;
	}
	

	public boolean matrizLlena() {
		for (int i = 0; i < this.matriz.length; i++) {
			for (int j = 0; j < this.matriz.length; j++) {
				if (this.matriz[i][j] == this.simboloDef) {
					return false;
				}
			}

		}
		return true;
	}

	public char coincidenciaLinea() {
		char simbolo;
		boolean coincidencia = true;
		for (int i = 0; i < this.matriz.length; i++) {
			coincidencia = true;
			simbolo = this.matriz[i][0];
			if (simbolo != this.simboloDef) {
				for (int j = 1; j < this.matriz[0].length; j++) {
					if (simbolo != this.matriz[i][j]) {
						coincidencia = false;
					}
				}
				if (coincidencia) {
					return simbolo;
				}
			}

		}
		return this.simboloDef;

	}

	public char coincidenciaColumna() {
		char simbolo;
		boolean coincidencia = true;
		for (int j = 0; j < this.matriz.length; j++) {
			coincidencia = true;
			simbolo = this.matriz[0][j];
			if (simbolo != this.simboloDef) {
				for (int i = 1; i < this.matriz[0].length; i++) {
					if (simbolo != this.matriz[i][j]) {
						coincidencia = false;
					}
				}
				if (coincidencia) {
					return simbolo;
				}
			}

		}
		return this.simboloDef;

	}

	public char coincidenciaDiagonal() {
		char simbolo;
		boolean coincidencia = true;
		simbolo = this.matriz[0][0];
		if (simbolo != simboloDef) {
			for (int i = 1; i < this.matriz.length; i++) {
				if (simbolo != this.matriz[i][i]) {
					coincidencia = false;
				}
			}
			if (coincidencia) {
				return simbolo;
			}

		}
		simbolo = matriz[0][2];
		if (simbolo != this.simboloDef) {
			for (int i = 1, j = 1; i < this.matriz.length; i++, j--) {
				if (simbolo != this.matriz[i][j]) {
					coincidencia = false;
				}
			}
			if (coincidencia) {
				return simbolo;
			}

		}
		return this.simboloDef;
	}

}
