/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.Arrays;
/**
 *
 * @author harde
 */
public class SevenBoom {
    public static String sevenBoom(int[] arr) {
		String valores= Arrays.toString(arr);
		boolean resultado=false;
		for(int n=0;n<valores.length();n++){
			char valor=valores.charAt(n);
			if(valor=='7'){
				resultado= true;
				break;
			}else{
				resultado=false;
			}
		}
		if(resultado==true){
			String respuesta="Boom!";
			return respuesta;
		}else{
			String respuesta="there is no 7 in the array";
			return respuesta;
		}
	}
}
