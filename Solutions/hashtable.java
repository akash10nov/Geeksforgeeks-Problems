import java.util.*;
import java.io.*;
public class hashtable
{
    DataItem[] array;
    int size;
    public hashtable(int n)
    {
        array=new DataItem[n];
        size=n;
    }
    public int hashfunction(DataItem d)
    {
        return (d.data%size);
    }
    public void Insert(DataItem d)
    {
        int index=hashfunction(d);
        if(array[index]!=null)
            array[index]=d;
        else
        {
            while(array[++index%size]!=null)
            {}
            array[index]=d;
        }
    }
    public DataItem get(DataItem d)
    {
        int index=hashfunction(d);
        if(array[index]==d)
            return array[index];
        else
        {
            int i=index;
            while(array[++i%size]!=d)
            {
            }
            return array[i];
        }
    }
}
