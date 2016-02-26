package labtest01;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author kgalko
 * Tests the ItemDecorator
 */
public class TestItemDecorator
{
  /**
 * Tests getName on ItemDecorator
 */
@Test
  public void testGetName()
  {
	  ItemInterface someItem = new Item("Cereal", 0, 200);
	  ItemInterface anotherItem = new ItemDecorator(someItem);
	  ItemInterface yetAnotherItem = new ItemDecorator(anotherItem);
	  
	  assertTrue(someItem.getName().equals("Cereal"));
	  assertTrue(anotherItem.getName().equals("ITEM-Cereal"));
	  assertTrue(yetAnotherItem.getName().equals("ITEM-ITEM-Cereal"));
  }
}
