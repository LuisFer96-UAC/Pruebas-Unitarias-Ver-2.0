/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author harde
 */
public class FootballPointsTest {
    @Test
	  public void test1() {
            assertEquals(3, FootballPoints.footballPoints(1, 0, 0));
		}
    @Test
	public void test2() {
            assertEquals(20, FootballPoints.footballPoints(5, 5, 5));
	}
    @Test
	public void test3() {
            assertEquals(5, FootballPoints.footballPoints(1, 2, 3));
	}
    @Test
	public void test4() {
            assertEquals(7, FootballPoints.footballPoints(0, 7, 0));
	}
    @Test
	public void test5() {
            assertEquals(0, FootballPoints.footballPoints(0, 0, 15));
	}


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
