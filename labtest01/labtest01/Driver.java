package labtest01;

import java.util.ArrayList;

/**
 * Utility class with a driver program and some 
 * sample items and inventories.
 */
public final class Driver
{
	private static final Item ITEM_CEREAL = new Item("Cereal", 1, 200);
	private static final Item ITEM_JAM = new Item("Jam", 2, 400);
	private static final Item ITEM_BUTTER = new Item("Butter", 3, 250);
	
	private static final Item[] ITEMS = { ITEM_CEREAL, ITEM_JAM, ITEM_BUTTER };
	
	private Driver() {}
	
	/**
	 * @param pArgs Not used
	 */
	public static void main(String[] pArgs)
	{

		ArrayList<Item> seenItems = new ArrayList<Item>();
		
		for( Item item : ITEMS )
		{
			for(Item someSeenItem : seenItems)
			{
				assert someSeenItem.getPrice() < item.getPrice();
			}
			
			System.out.println(item.getName() + " - totalvalue: " + item.getPrice());
			
			seenItems.add(item);
		}
	}
}
