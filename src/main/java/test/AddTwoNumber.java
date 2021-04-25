package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AddTwoNumber {

  public static void main(String[] args) {

    List ll1 = new ArrayList();
    List ll2 = new ArrayList();

    ll1.add(3);
    ll1.add(2);
    ll1.add(5);

    ll2.add(4);
    ll2.add(1);
    ll2.add(0);

    //System.out.println("The Result: "+addTwoNums(ll1,ll2));

    List result = addTwoNums(ll1,ll2);

    ListIterator it = result.listIterator(result.size());
    while (it.hasPrevious())
    {
      System.out.print(it.previous()+",");
    }


  }

  public static List addTwoNums(List l1, List l2){
    int fistListSize = l1.size();
    int secondListSize = l1.size();
    List list = new ArrayList();
    for (int i=0; i<fistListSize; i++)
    {
      Integer a= (Integer)l1.get(i);
      Integer b= (Integer)l2.get(i);
      list.add(a+b);
    }
    return list;

  }


}
