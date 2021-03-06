//Base
package Program1.collections;

/**
 * Created by Víctor Martínez on 1/29/2017 at 4:43 PM.
 * Description: used to create a dynamic list
 */


public class List { //StartClass
    
    private Node head;

    public List() { //StartMethod
        
        head = null;
        
    }
    
    //Methods
            //Insert a node at any position of the list
            public void add(int position, double data) //StartMethod
            {
                if (position <= size() + 1)
                {
                    Node newNode = new Node();
                    newNode.setData(data);
                    if (position == 1)
                    {
                        newNode.setNext(head);
                        head = newNode;
                    }
                    else
                    {
                        if (position == size() + 1)
                        {
                            Node temporalNode = head;
                            while (temporalNode.getNext() != null)
                                temporalNode = temporalNode.getNext();

                            temporalNode.setNext(newNode);
                            newNode.setNext(null);
                        }
                        else
                        {
                            Node temporalNode = head;
                            for (int f = 1; f <= position - 2; f++)
                                temporalNode = temporalNode.getNext();
                            Node nextNode = temporalNode.getNext();
                            temporalNode.setNext(newNode);
                            newNode.setNext(nextNode);
                        }

                    }
                }
            }
            //End of insertAt method
            
                        //Insert a node at the end of the list
            public void addLast(double data) //StartMethod
            {
            Node temporalNode;
            Node newNode = new Node();
            newNode.setData(data);
            newNode.setNext(null);
                //Empty List
                if (head == null)
                {
                    head = newNode;
                    head.setNext(null);
                }
                else //List with at least 1 node
                {
                    temporalNode = head;
                    while (temporalNode.getNext() != null)
                    {
                        temporalNode = temporalNode.getNext();
                    }

                    temporalNode.setNext(newNode);
                    newNode.setNext(null);
                }
            }
            //End of insertLastMethod

    public Node getAt(int position){//StartMethod
        if(position <=size()){
            Node information;
            if(position==1){
                information = head;
            }else{
                Node temporalNode;
                temporalNode = head;
                for (int f = 1 ; f <= position - 2 ; f++)
                    temporalNode = temporalNode.getNext();
                Node nextNode = temporalNode.getNext();
                information = nextNode;
            }
            return information;
        }else
            return null;

    }
            
                        //Remove the first node of the list
            public double removeFirst() //StartMethod
            {
                double data;
            if (head != null)
            {
                data = head.getData();
                head = head.getNext();
                return data;
            }
            else return 0;
                
            }
            //End of removeFirstMethod
            
  //Gives the size of the list as an integer
            public int size() //StartMethod
            {
                int Size = 0;
                Node temporalNode = head;
                while (temporalNode != null)
                {
                    temporalNode = temporalNode.getNext();
                    Size++;
                }
                return Size;
            }
            //End of size method

            //Returns a boolean to see if the list is empty 
            public Boolean empty()
            {
                return head == null;
            } //StartMethod
            //End of empty method
            
                        //Print the list
            public void print() //StartMethod
            {
                Node temporalNode = head;
                System.out.println("Printing list");
                while (temporalNode != null)
                {
                    System.out.println(temporalNode.getData() + '\n');
                    temporalNode = temporalNode.getNext();
                }
            }

            //Added
            public String toString(){
             String string="";
                Node temporalNode = head;
                while (temporalNode != null)
                {
                    string+=temporalNode.getData() + " - ";
                    temporalNode = temporalNode.getNext();
                }
                return string;
            }
        //End of print method
}//EndClass
