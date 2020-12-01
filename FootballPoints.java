/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author harde
 */
public class FootballPoints {
    public static int footballPoints(int wins, int draws, int loses) {
		int puntaje=0;
		puntaje += (wins * 3) + draws;
		return puntaje;
  }
}
