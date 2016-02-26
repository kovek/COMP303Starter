package labtest01;

/**
 * @author kgalko
 * ItemDecorator decorates an Item
 */
public class ItemDecorator implements ItemInterface
{
	private ItemInterface aItem;
	
	ItemDecorator(ItemInterface pItem)
	{
		aItem = pItem;
	}

	@Override
	public String getName()
	{
		return "ITEM-" + aItem.getName();
	}

	@Override
	public int getId()
	{
		return aItem.getId();
	}

}
