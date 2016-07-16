class queue
{
    int front;
    int rear;
    int nItems;
    int size;
    int[] darray;
    public queue(int s)
    {
        front=0;
        rear=-1;
        size=s;
        darray=new int[s];
        nItems=0;
    }
    public void enqueue(int a)
    {
        if(rear==size-1);
            rear=-1;
        darray[++rear]=a;
        nItems++;
    }
    public int dequeue()
    {
        nItems--;
        return darray[(front++)%(size-1)];
    }
}