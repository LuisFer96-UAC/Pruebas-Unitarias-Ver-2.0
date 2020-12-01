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
public class minutosSegundosTest {
    
@Test
  public void test1() {
    assertEquals(360, minutosSegundos.convert(6));
  }
	
@Test
  public void test2() {
    assertEquals(240, minutosSegundos.convert(4));
  }
	
@Test
  public void test3() {
    assertEquals(480, minutosSegundos.convert(8));
  }
	
@Test
  public void test4() {
    assertEquals(3600, minutosSegundos.convert(60));
  }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
