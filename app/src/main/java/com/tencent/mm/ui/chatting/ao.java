package com.tencent.mm.ui.chatting;

import android.view.View;
import java.util.LinkedList;

public final class ao
{
  private static LinkedList<View> tNs = new LinkedList();
  private static LinkedList<View> tNt = new LinkedList();
  private static LinkedList<View> tNu = new LinkedList();
  
  public static View EX(int paramInt)
  {
    LinkedList localLinkedList;
    if (paramInt == 1) {
      localLinkedList = tNs;
    }
    while (localLinkedList.size() != 0)
    {
      return (View)localLinkedList.removeFirst();
      if (paramInt == 2) {
        localLinkedList = tNt;
      } else {
        localLinkedList = tNu;
      }
    }
    return null;
  }
  
  public static void L(View paramView, int paramInt)
  {
    LinkedList localLinkedList;
    if (paramInt == 1) {
      localLinkedList = tNs;
    }
    for (;;)
    {
      if (localLinkedList.size() >= 35) {
        localLinkedList.removeFirst();
      }
      localLinkedList.addLast(paramView);
      return;
      if (paramInt == 2) {
        localLinkedList = tNt;
      } else {
        localLinkedList = tNu;
      }
    }
  }
  
  public static void clear()
  {
    tNs.clear();
    tNt.clear();
    tNu.clear();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/chatting/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */