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
public class SevenBoomTest {
    
@Test
  public void test1() {
    assertEquals("Boom!", SevenBoom.sevenBoom(new int[]{2, 6, 7, 9, 3}));
  }
	
  @Test
  public void test2() {
    assertEquals("there is no 7 in the array", SevenBoom.sevenBoom(new int[]{33, 68, 400, 5}));
  }
	
  @Test
  public void test3() {
    assertEquals("there is no 7 in the array", SevenBoom.sevenBoom(new int[]{86, 48, 100, 66}));
  }
	
  @Test
  public void test4() {
    assertEquals("Boom!", SevenBoom.sevenBoom(new int[]{76, 55, 44, 32}));
  }
	
  @Test
  public void test5() {
    assertEquals("Boom!", SevenBoom.sevenBoom(new int[]{35, 4, 9, 37}));
  }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
