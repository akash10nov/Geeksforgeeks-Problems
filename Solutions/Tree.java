class Tree
{
    TNode root;
    public void insert(int d)
    {
        TNode newNode=new TNode(d);
        if(root==null)
        {
            root=newNode;
        }
        else
        {
            TNode current=root;
            while(true)
            {
                if(d>current.data && current.right!=null)
                {
                    current=current.right;
                }
                else if(d>current.data && current.right==null)
                {
                    current.right=newNode;
                    current=current.right;
                    break;
                }
                else  if(d<current.data && current.left!=null)
                {
                    current=current.left;
                }
                else if(d<current.data && current.left==null)
                {
                    current.left=newNode;
                    current=current.left;
                    break;
                }
            }
        }
    }
    
    public void traversal(TNode n)
    {
        if(n==null)
            return;
        traversal(n.left);
        System.out.println(n.data);
        traversal(n.right);
        
        
    }
    
}