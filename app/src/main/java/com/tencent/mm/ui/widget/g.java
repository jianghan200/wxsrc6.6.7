package com.tencent.mm.ui.widget;

import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;

public final class g
{
  private static LinkedList<WeakReference<a>> uHV = new LinkedList();
  
  public static void A(boolean paramBoolean, int paramInt)
  {
    if (uHV.size() <= 0)
    {
      x.w("MicroMsg.SwipeBackHelper", "notifySettle callback stack empty!, open:%B, speed:%d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
      return;
    }
    a locala = (a)((WeakReference)uHV.get(0)).get();
    if (locala == null)
    {
      x.w("MicroMsg.SwipeBackHelper", "notifySettle null, open:%B, speed:%d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
      return;
    }
    locala.onSettle(paramBoolean, paramInt);
    x.v("MicroMsg.SwipeBackHelper", "notifySettle, open:%B speed:%d callback:%s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt), locala });
  }
  
  public static void a(a parama)
  {
    x.d("MicroMsg.SwipeBackHelper", "pushCallback size %d, %s", new Object[] { Integer.valueOf(uHV.size()), parama });
    parama = new WeakReference(parama);
    uHV.add(0, parama);
  }
  
  public static void aD(float paramFloat)
  {
    if (uHV.size() <= 0)
    {
      x.w("MicroMsg.SwipeBackHelper", "notifySwipe callback stack empty!, scrollParent:%f", new Object[] { Float.valueOf(paramFloat) });
      return;
    }
    a locala = (a)((WeakReference)uHV.get(0)).get();
    if (locala == null)
    {
      x.w("MicroMsg.SwipeBackHelper", "notifySwipe null, scrollParent:%f", new Object[] { Float.valueOf(paramFloat) });
      return;
    }
    locala.onSwipe(paramFloat);
    x.v("MicroMsg.SwipeBackHelper", "notifySwipe scrollParent:%f, callback:%s ", new Object[] { Float.valueOf(paramFloat), locala });
  }
  
  public static boolean b(a parama)
  {
    int j = uHV.size();
    x.d("MicroMsg.SwipeBackHelper", "popCallback size %d, %s", new Object[] { Integer.valueOf(j), parama });
    if (parama == null) {
      return true;
    }
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    for (;;)
    {
      if (i < uHV.size())
      {
        if (parama == ((WeakReference)uHV.get(i)).get())
        {
          uHV.remove(i);
          x.d("MicroMsg.SwipeBackHelper", "popCallback directly, index %d", new Object[] { Integer.valueOf(i) });
        }
      }
      else
      {
        if ((parama.forceRemoveNoMatchOnPath()) || (localLinkedList.size() != j)) {
          break;
        }
        x.d("MicroMsg.SwipeBackHelper", "popCallback Fail! Maybe Top Activity");
        return false;
      }
      localLinkedList.add(0, Integer.valueOf(i));
      i += 1;
    }
    Iterator localIterator = localLinkedList.iterator();
    if (localIterator.hasNext())
    {
      parama = (Integer)localIterator.next();
      parama = (WeakReference)uHV.remove(parama.intValue());
      if (parama != null) {}
      for (parama = parama.get();; parama = "NULL-CALLBACK")
      {
        x.d("MicroMsg.SwipeBackHelper", "popCallback, popup %s", new Object[] { parama });
        break;
      }
    }
    return localLinkedList.isEmpty();
  }
  
  public static abstract interface a
  {
    public abstract boolean forceRemoveNoMatchOnPath();
    
    public abstract void onSettle(boolean paramBoolean, int paramInt);
    
    public abstract void onSwipe(float paramFloat);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/widget/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */