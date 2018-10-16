import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetRemoveTest
{
    public static void main(String[] args)
    {
        Set<String> strings = new HashSet<String>();
        for(int i = 0; i < 100; i++)
        {
            strings.add(String.valueOf(i));
        }

        Iterator<String> stringIterator = strings.iterator();
        while (stringIterator.hasNext())
        {
            stringIterator.next();
            stringIterator.remove();
        }

        while (true)
        {

        }
    }
}
