package JavaOOP_Ds4;

public class ArrayClass<T extends Comparable<T>>
{
    private T[] data;
    private int length;

    public int getLength()
    {
        return this.length;
    }

    public ArrayClass()
    {
        this.data = (T[]) new Comparable[0];
        this.length = 0;
    }

    public ArrayClass(T[] data)
    {
        this.length = data.length;
        this.data = data;
    }

    public void add(T element)
    {
        if (this.length == this.data.length)
        {
            enlargeLenth();
        }
        this.data[this.length++] = element;
    }

    private void enlargeLenth()
    {
        int newLength = this.getLength() + 1;
        T[] newData = (T[]) new Comparable[newLength];
        for (int i = 0; i < this.getLength(); i++)
        {
            newData[i] = this.data[i];
        }
        this.data = newData;
    }

    public void removeIndex(int index)
    {
        int newLength = this.getLength() - 1;
        T[] newData = (T[]) new Comparable[newLength];
        for (int i = 0; i < index; i++)
        {
            newData[i] = this.data[i];
        }
        for (int i = index; i < this.getLength() - 1; i++)
        {
            newData[i] = this.data[i + 1];
        }
        this.data = newData;
        this.length--;
    }

    public void removeData(T element)
    {
        for (int i = 0; i < data.length; i++)
        {
            if (data[i] == element)
            {
                removeIndex(i);
                i--;
            }
        }
    }

    public T minData()
    {
        T min = data[0];
        for (int i = 1; i < length; i++)
        {
            if (min.compareTo(data[i]) > 0)
            {
                min = data[i];
            }
        }
        return min;
    }

    public T maxData()
    {
        T max = data[0];
        for (int i = 0; i < length; i++)
        {
            if (max.compareTo(data[i]) < 0)
            {
                max = data[i];
            }
        }
        return max;
    }

    public T sumData()
    {
        T sum = data[0];
        for (int i = 1; i < length; i++)
        {
            if (sum instanceof Integer)
            {
                sum = (T) (Integer) ((Integer) sum + (Integer) data[i]);
            }
            else if (sum instanceof Double)
            {
                sum = (T) (Double) ((Double) sum + (Double) data[i]);
            }
            else if (sum instanceof String)
            {
                sum = (T) ((String) sum + (String) data[i]);
            }
        }
        return sum;
    }

    public T multData()
    {
        T mult = data[0];
        for (int i = 1; i < length; i++)
        {
            if (mult instanceof Integer)
            {
                mult = (T) (Integer) ((Integer) mult * (Integer) data[i]);
            }
            else if (mult instanceof Double)
            {
                mult = (T) (Double) ((Double) mult * (Double) data[i]);
            }
            else if (mult instanceof String)
            {
                mult = (T) ((String) mult + "*" + (String) data[i]);
            } 
        }
        return mult;
    }

    public int findIndex(T element)
    {
        int count = 0;
        for (T i : data)
        {
            if (i == element)
            {
                return count;
            }
            count++;
        }
        return -1;
    }

    public boolean findData(T element)
    {
        for (T i : data)
        {
            if (i == element)
            {
                return true;
            }
        }
        return false;
    }

    public void bubbleSort()
    {
        for (int i = 0; i < length - 1; i++)
        {
            for (int j = 0; j < length - i - 1; j++)
            {
                if (data[j].compareTo(data[j + 1]) > 0)
                {
                    T temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public void insertionSort()
    {
        for (int i = 1; i < length; i++)
        {
            T key = data[i];
            int j = i - 1;
            while (j >= 0 && data[j].compareTo(key) > 0)
            {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = key;
        }
    }

    public void selectionSort()
    {
        for (int i = 0; i < length - 1; i++)
        {
            int minIndex = i;
            for (int j = i + 1; j < length; j++)
            {
                if (data[j].compareTo(data[minIndex]) < 0)
                {
                    minIndex = j;
                }
            }
            T temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }
    }

    public void printArray()
    {
        System.out.println(this);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.getLength(); i++)
        {
            sb.append(this.data[i]);
            if (i != this.getLength() - 1)
            {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}