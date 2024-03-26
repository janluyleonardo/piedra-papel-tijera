package PiedraPapelTijera1;

import java.util.Random;


public class PiedraPapelTijera {
    
 /**
     * Constante para seleccionar jugada Piedra
     */
    public final int PIEDRA = 1;

    /**
     * Constante para seleccionar jugada Papel
     */
    public final int PAPEL = 2;

    /**
     * Constante para seleccionar jugada Tijera
     */
    public final int TIJERA = 3;

    /**
     * Variable que contiene el String indicando la mano del Jugador
     */
    public String jugadaPlayer1;
    
    /**
     * Variable que contiene el String indicando la mano del CPU
     */
    public String jugadaCPU;//Jugada CPU en String
    
    /**
     * Variable que contiene el resultado de la partida en String
     */
    public String resultadoPartida;//Resultado de la partida en String
    
    private int manoPlayer1;//Jugada del player1
    private int manoCPUn;//Jugada del CPU
    private int resultadoJugada;//Resultado Jugada en Int
    private int numTotalVictoria = 0;
    private int victoriasCPU = 0;
    private int victoriasJ1 = 0;
    
    /**
     * Constructor del juego Piedra, Papel, Tijera.
     */
    PiedraPapelTijera() {

    }

    //insertar nombre jugador 1

    /**
     * Método para insertar el nombre del jugador en la variable privada nombre
     * @param nombreJugador Indica el nombre del jugador en String
     */

    //Genera Random para jugada CPU

    /**
     * Genera la jugada del CPU aleatoriamente
     * @return el valor int de la mano CPU
     */
    public int generarJugada() {
        Random manoCPU = new Random();
        manoCPUn = manoCPU.nextInt(3) + 1;
        return manoCPUn;

    }

    /**
     * Devuelve una cadena de caracteres indicando la mano del jugador
     * @return String indicando la mano del Jugador
     */
    public String getJugadaPlayer1() {
        switch (manoPlayer1) {
            case PIEDRA:
                jugadaPlayer1 = "Piedra";
                break;
            case PAPEL:
                jugadaPlayer1 = "Papel";
                break;
            case TIJERA:
                jugadaPlayer1 = "Tijera";
                break;
        }
        return jugadaPlayer1;
    }

    /**
     * Metodo que devuelve un int indicando la mano del jugador
     * @return 1, 2 o 3 dependiendo de la jugada elegida
     */
    public int getJugadaPlayer() {
        int jugadaPlayer = this.manoPlayer1;
        return jugadaPlayer;
    }

    /**
     * Metodo que devuelve el int indicando la jugada del CPU
     * @return 1, 2 o 3 dependiendo de la jugada creada para CPU
     */
    public int getIntJugadaCPU() {
        int nJugadaCPU = this.manoCPUn;
        return nJugadaCPU;
    }

    //Mostrar Jugada CPU en String
    /**
     * Devuelve una cadena de caracteres indicando la mano del CPU
     * @return String indicando la mano del CPU
     */
    public String getJugadaCPU() {
        switch (manoCPUn) {
            case 1:
                jugadaCPU = "Piedra";
                break;
            case 2:
                jugadaCPU = "Papel";
                break;
            case 3:
                jugadaCPU = "Tijera";
                break;
        }
        return jugadaCPU;
    }

    //Escoge el nº de partidas en la ventana inicial

    /**
     * Método que asigna la duración de la partida a partir del nº de victorias a conseguir
     * @param numeroVictoriasTotal introduce el nº de victorias a conseguir
     */
    public void setNumTotalVictorias(int numeroVictoriasTotal) {
        this.numTotalVictoria = numeroVictoriasTotal;
    }

    /**
     * Método que obtiene el nº de victorias total a conseguir 
     * @return nº de victorias a conseguir
     */
    public int getNumTotalVictorias() {
        int nTotalVict = this.numTotalVictoria;
        return nTotalVict;
    }

    /**
     * Método que asigna la jugada del Jugador
     * @param jugada PIEDRA, PAPEL, TIJERA
     */
    public void setJugadaPlayer(int jugada) {
        this.manoPlayer1 = jugada;
    }

    //Compara la jugada y establece el ganador
    /**
     * Método que compara las jugadas del Jugador y el CPU
     */
    public void comparaJugada() {
        switch (manoPlayer1) {
            case 1:
                if (manoCPUn == 1) {
                    resultadoJugada = 0;
                    resultadoPartida = "Empate";
                } else {
                    if (manoCPUn == 2) {
                        resultadoJugada = 2;
                        resultadoPartida = "Pierdes";
                        this.añadirVictoriaCPU();
                    } else {
                        if (manoCPUn == 3) {
                            resultadoJugada = 1;
                            resultadoPartida = "Ganas";
                            this.añadirVictoriaPlayer();
                        }
                    }
                }               
                break;
            case 2:
                if (manoCPUn == 1) {
                    resultadoJugada = 1;
                    resultadoPartida = "Ganas";
                    this.añadirVictoriaPlayer();
                } else {
                    if (manoCPUn == 2) {
                        resultadoJugada = 0;
                        resultadoPartida = "Empate";
                    } else {
                        if (manoCPUn == 3) {
                            resultadoJugada = 2;
                            resultadoPartida = "Pierdes";
                            this.añadirVictoriaCPU();
                        }
                    }
                }
                break;
            case 3:
                if (manoCPUn == 1) {
                    resultadoJugada = 2;
                    resultadoPartida = "Pierdes";
                    this.añadirVictoriaCPU();
                } else {
                    if (manoCPUn == 2) {
                        resultadoJugada = 1;
                        resultadoPartida = "Ganas";
                        this.añadirVictoriaPlayer();
                    } else {
                        if (manoCPUn == 3) {
                            resultadoJugada = 0;
                            resultadoPartida = "Empate";
                        }
                    }
                }
                break;
        }
        
    }
    
    /**
     * Método que obtiene el int resultado de la jugada
     * @return 0 en caso de empate, 1 en caso de victoria del jugador, 2 en caso de derrota del jugador
     */
    public int getResultadoJugada() {
        int resultado = this.resultadoJugada;
        return resultado;
    }

    private void añadirVictoriaPlayer() {
        this.victoriasJ1++;
    }

    private void añadirVictoriaCPU() {
        this.victoriasCPU++;
    }

}