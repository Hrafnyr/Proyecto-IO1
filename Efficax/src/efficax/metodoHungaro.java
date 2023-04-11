
package efficax;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class metodoHungaro {
    double[][] matrix; // Matriz inicial

    // Marcadores que se usarán
    int[] squareInRow, squareInCol, rowIsCovered, colIsCovered, staredZeroesInRow;

    public metodoHungaro(double[][] matrix) {
        if (matrix.length != matrix[0].length) {
            try {
                //verificar que la matriz sea cuadrada
                throw new IllegalAccessException("La matriz no es cuadrada");
            } catch (IllegalAccessException ex) {
                System.err.println(ex);
                System.exit(1);
            }
        }
            
        //si todo está bien, seguir
        this.matrix = matrix;
        
        //Marcadores que indican posicion de filas y columnas
        squareInRow = new int[matrix.length];       
        squareInCol = new int[matrix[0].length];    
        
        //Indican las filas y columnas tachadas 
        rowIsCovered = new int[matrix.length];      
        colIsCovered = new int[matrix[0].length];   
        
        //Almacena los ceros encontrados
        staredZeroesInRow = new int[matrix.length]; 
        
        //Array.fill: 
        //Asigna el valor del tipo de datos especificado 
        //a cada elemento del rango especificado de la matriz especificada.
        Arrays.fill(staredZeroesInRow, -1);
        Arrays.fill(squareInRow, -1);
        Arrays.fill(squareInCol, -1);
    }

    //Metodo que retorna la asignación óptima
    public int[][] findOptimalAssignment() {
        step1();    // Reducir matriz, restar menores a filas y columnas
        step2();    // Marcar los ceros independientes
        step3();    // Cubrir columnas con ceros
        
        //Mientras no se cumpla la condicion
        while (!allColumnsAreCovered()) {
            int[] mainZero = step4();
            while (mainZero == null) {      // Mientras no se haya encontrado un cero en el paso 4
                step7();
                mainZero = step4();
            }
            if (squareInRow[mainZero[0]] == -1) {
                //No hay marca cuadrada en la línea mainZero
                step6(mainZero);
                step3();    //Cubrir columnas que contienen un cero marcado
            } else {
                //Hay una marca cuadrada en la línea mainZero, seguir al paso 5
                rowIsCovered[mainZero[0]] = 1;  // Cubrir fila con el cero
                colIsCovered[squareInRow[mainZero[0]]] = 0;  //Desmarcar columna
                step7();
            }
        }

        int [][] optimalAssignment = new int[matrix.length][];
        for (int i = 0; i < squareInCol.length; i++) {
            optimalAssignment[i] = new int[]{i, squareInCol[i]};
        }
        return optimalAssignment;
    }

    /**
     *Compruebe si todas las columnas están cubiertas. Si ese es el caso, 
     * entonces se encuentra la solución óptima
     **/
    private boolean allColumnsAreCovered() {
        for (int i : colIsCovered) {
            if (i == 0) {
                return false;
            }
        }
        return true;
    }

    
    private void step1() {
        //reducir filas
        for (int i = 0; i < matrix.length; i++) {
            // Primero hallar el menor de cada fila
            double currentRowMin = Double.MAX_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < currentRowMin) {
                    currentRowMin = matrix[i][j];
                }
            }
            // Restar el menor a cada valor de fila
            for (int k = 0; k < matrix[i].length; k++) {
                matrix[i][k] -= currentRowMin;
            }
        }

        // reducir columnas
        for (int i = 0; i < matrix[0].length; i++) {
            //hallar el menor de cada columna
            double currentColMin = Double.MAX_VALUE;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] < currentColMin) {
                    currentColMin = matrix[j][i];
                }
            }
            //restar el menor a cada columna
            for (int k = 0; k < matrix.length; k++) {
                matrix[k][i] -= currentColMin;
            }
        }
    }

    //marcar cada 0, si no hay otros ceros marcados en la misma fila o columna
    private void step2() {
        int[] rowHasSquare = new int[matrix.length];
        int[] colHasSquare = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 0 && rowHasSquare[i] == 0 && colHasSquare[j] == 0) {
                    rowHasSquare[i] = 1;
                    colHasSquare[j] = 1;
                    squareInRow[i] = j; // guardar la posición de fila del cero
                    squareInCol[j] = i; // guardar la posición de columna del cero
                    continue; // forzar a pasar al siguiente
                }
            }
        }
    }

    //Cubrir todas las columnas que están marcadas
    private void step3() {
        for (int i = 0; i < squareInCol.length; i++) {
            colIsCovered[i] = squareInCol[i] != -1 ? 1 : 0;
        }
    }

    /**
    * Metodo para el paso 7: 
    * Esto es si el numero de lineas no es igual a la cantidad de tareas
    **/
    private void step7() {
        //1. Encuentre el valor descubierto más pequeño en la matriz.
        //2. Restarlo de todos los valores descubiertos
        //3.Sumar a todos los valores cubiertos dos veces (intesección)
        double minUncoveredValue = Double.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            if (rowIsCovered[i] == 1) {
                continue;
            }
            for (int j = 0; j < matrix[0].length; j++) {
                if (colIsCovered[j] == 0 && matrix[i][j] < minUncoveredValue) {
                    minUncoveredValue = matrix[i][j];
                }
            }
        }

        if (minUncoveredValue > 0) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (rowIsCovered[i] == 1 && colIsCovered[j] == 1) {
                        // Add min to all twice-covered values
                        matrix[i][j] += minUncoveredValue;
                    } else if (rowIsCovered[i] == 0 && colIsCovered[j] == 0) {
                        // Subtract min from all uncovered values
                        matrix[i][j] -= minUncoveredValue;
                    }
                }
            }
        }
    }

    private int[] step4() {
        for (int i = 0; i < matrix.length; i++) {
            if (rowIsCovered[i] == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == 0 && colIsCovered[j] == 0) {
                        staredZeroesInRow[i] = j; // mark as 0*
                        return new int[]{i, j};
                    }
                }
            }
        }
        return null;
    }

    private void step6(int[] mainZero) {
        int i = mainZero[0];
        int j = mainZero[1];

        Set<int[]> K = new LinkedHashSet<>();
        K.add(mainZero);
        boolean found = false;
        do {
            if (squareInCol[j] != -1) {
                K.add(new int[]{squareInCol[j], j});
                found = true;
            } else {
                found = false;
            }

            if (!found) {
                break;
            }

            i = squareInCol[j];
            j = staredZeroesInRow[i];
            // add the new Z_0 to K
            if (j != -1) {
                K.add(new int[]{i, j});
                found = true;
            } else {
                found = false;
            }

        } while (found); 

        // (e)
        for (int[] zero : K) {
            // remove all "square" marks in K
            if (squareInCol[zero[1]] == zero[0]) {
                squareInCol[zero[1]] = -1;
                squareInRow[zero[0]] = -1;
            }
            // replace the 0* marks in K with "square" marks
            if (staredZeroesInRow[zero[0]] == zero[1]) {
                squareInRow[zero[0]] = zero[1];
                squareInCol[zero[1]] = zero[0];
            }
        }

        // (f)
        // remove all marks
        Arrays.fill(staredZeroesInRow, -1);
        Arrays.fill(rowIsCovered, 0);
        Arrays.fill(colIsCovered, 0);
    }
}
