package org.example;
import java.util.List;
import java.util.ArrayList;

public class ZipIt
{
    public <T> List<T> zip(List<T> list1, List<T> list2)
    {
        List<T> finalList = new ArrayList<>();

        if (list1.size() >= list2.size())
        {
            int i = 0;
            while (i < list2.size())
            {
                finalList.add(list1.get(i));
                finalList.add(list2.get(i));
                i++;

            }
            
            while (i < list1.size())
            {
                finalList.add(list1.get(i));
                i++;

            }

        } else {
            int i = 0;
            while (i < list1.size())
            {
                finalList.add(list1.get(i));
                finalList.add(list2.get(i));
                i++;
            
            }

            while (i < list2.size())
            { 
                finalList.add(list2.get(i));
                i++;

            }

        }

        return finalList;

    }

}