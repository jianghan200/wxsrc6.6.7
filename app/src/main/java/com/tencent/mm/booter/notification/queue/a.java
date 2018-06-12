package com.tencent.mm.booter.notification.queue;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.booter.notification.NotificationItem;
import com.tencent.mm.k.f;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
  implements Serializable, Iterable<a>
{
  LinkedList<a> cYW;
  
  private void save()
  {
    try
    {
      LinkedList localLinkedList1 = this.cYW;
      if (localLinkedList1 == null) {}
      for (;;)
      {
        return;
        x.d("MicroMsg.NotificationAppMsgQueue", "save: size: %d", new Object[] { Integer.valueOf(this.cYW.size()) });
        if (this.cYW.isEmpty())
        {
          f.Ah().edit().putString("com.tencent.preference.notification.key.queue", "").apply();
          x.i("MicroMsg.NotificationAppMsgQueue", "reset size:%d, %s", new Object[] { Integer.valueOf(this.cYW.size()), toString() });
          continue;
        }
        try
        {
          LinkedList localLinkedList2 = new LinkedList(this.cYW);
          f.Ah().edit().putString("com.tencent.preference.notification.key.queue", c.a(localLinkedList2)).apply();
          x.i("MicroMsg.NotificationAppMsgQueue", "save size:%d, %s", new Object[] { Integer.valueOf(this.cYW.size()), toString() });
        }
        catch (IOException localIOException)
        {
          for (;;)
          {
            x.printErrStackTrace("MicroMsg.NotificationAppMsgQueue", localIOException, "", new Object[0]);
          }
        }
      }
    }
    finally {}
  }
  
  public final boolean aX(int paramInt)
  {
    boolean bool;
    if (paramInt == -1) {
      bool = false;
    }
    for (;;)
    {
      return bool;
      int i;
      for (;;)
      {
        try
        {
          if (this.cYW == null) {
            restore();
          }
          LinkedList localLinkedList1 = new LinkedList();
          Iterator localIterator = this.cYW.iterator();
          i = 0;
          if (!localIterator.hasNext()) {
            break;
          }
          a locala = (a)localIterator.next();
          if (locala.cYX != paramInt) {
            localLinkedList1.add(locala);
          } else {
            i = 1;
          }
        }
        finally {}
      }
      if (i != 0)
      {
        this.cYW = localLinkedList2;
        save();
        bool = true;
      }
      else
      {
        bool = false;
      }
    }
  }
  
  public final void b(NotificationItem paramNotificationItem)
  {
    int i = 1;
    if (paramNotificationItem == null) {
      return;
    }
    label244:
    for (;;)
    {
      try
      {
        if (this.cYW == null) {
          restore();
        }
        aX(paramNotificationItem.id);
        if ((paramNotificationItem.cYR) && (!ai.oW(paramNotificationItem.cYO)))
        {
          Object localObject = this.cYW.iterator();
          if (((Iterator)localObject).hasNext())
          {
            a locala = (a)((Iterator)localObject).next();
            if (!locala.userName.equals(paramNotificationItem.cYO)) {
              break label244;
            }
            locala.a(paramNotificationItem.id, paramNotificationItem.cYP, paramNotificationItem.cYO, paramNotificationItem.cYQ, paramNotificationItem.cYR, paramNotificationItem.cYS);
            i = 0;
            break label244;
          }
          if (i != 0)
          {
            localObject = new a(paramNotificationItem.id, paramNotificationItem.cYP, paramNotificationItem.cYO, paramNotificationItem.cYQ, paramNotificationItem.cYR, paramNotificationItem.cYS);
            this.cYW.add(localObject);
            x.d("MicroMsg.NotificationAppMsgQueue", "add: [%s]", new Object[] { paramNotificationItem.toString() });
          }
          save();
          break;
        }
      }
      finally {}
      this.cYW.add(new a(paramNotificationItem.id, paramNotificationItem.cYR));
      x.d("MicroMsg.NotificationAppMsgQueue", "add: [%s]", new Object[] { paramNotificationItem.toString() });
    }
  }
  
  /* Error */
  public final boolean eL(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 27
    //   4: ldc -73
    //   6: iconst_1
    //   7: anewarray 5	java/lang/Object
    //   10: dup
    //   11: iconst_0
    //   12: aload_1
    //   13: aastore
    //   14: invokestatic 85	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   17: aload_1
    //   18: invokestatic 151	com/tencent/mm/platformtools/ai:oW	(Ljava/lang/String;)Z
    //   21: istore_2
    //   22: iload_2
    //   23: ifeq +9 -> 32
    //   26: iconst_0
    //   27: istore_2
    //   28: aload_0
    //   29: monitorexit
    //   30: iload_2
    //   31: ireturn
    //   32: aload_0
    //   33: getfield 25	com/tencent/mm/booter/notification/queue/a:cYW	Ljava/util/LinkedList;
    //   36: ifnonnull +7 -> 43
    //   39: aload_0
    //   40: invokevirtual 104	com/tencent/mm/booter/notification/queue/a:restore	()V
    //   43: aload_0
    //   44: getfield 25	com/tencent/mm/booter/notification/queue/a:cYW	Ljava/util/LinkedList;
    //   47: invokevirtual 109	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   50: astore_3
    //   51: aload_3
    //   52: invokeinterface 114 1 0
    //   57: ifeq +45 -> 102
    //   60: aload_3
    //   61: invokeinterface 118 1 0
    //   66: checkcast 11	com/tencent/mm/booter/notification/queue/a$a
    //   69: astore 4
    //   71: aload_1
    //   72: aload 4
    //   74: getfield 154	com/tencent/mm/booter/notification/queue/a$a:userName	Ljava/lang/String;
    //   77: invokevirtual 159	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   80: ifeq -29 -> 51
    //   83: aload_0
    //   84: getfield 25	com/tencent/mm/booter/notification/queue/a:cYW	Ljava/util/LinkedList;
    //   87: aload 4
    //   89: invokevirtual 186	java/util/LinkedList:remove	(Ljava/lang/Object;)Z
    //   92: pop
    //   93: aload_0
    //   94: invokespecial 128	com/tencent/mm/booter/notification/queue/a:save	()V
    //   97: iconst_1
    //   98: istore_2
    //   99: goto -71 -> 28
    //   102: iconst_0
    //   103: istore_2
    //   104: goto -76 -> 28
    //   107: astore_1
    //   108: aload_0
    //   109: monitorexit
    //   110: aload_1
    //   111: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	112	0	this	a
    //   0	112	1	paramString	String
    //   21	83	2	bool	boolean
    //   50	11	3	localIterator	Iterator
    //   69	19	4	locala	a
    // Exception table:
    //   from	to	target	type
    //   2	22	107	finally
    //   32	43	107	finally
    //   43	51	107	finally
    //   51	97	107	finally
  }
  
  public final List<Integer> fu(int paramInt)
  {
    try
    {
      if (this.cYW == null) {
        restore();
      }
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        if (((locala.cYY & paramInt) != 0) && (!localArrayList.contains(Integer.valueOf(locala.cYX)))) {
          localArrayList.add(Integer.valueOf(locala.cYX));
        }
      }
    }
    finally {}
    return localList;
  }
  
  public final Iterator<a> iterator()
  {
    if (this.cYW == null) {
      restore();
    }
    return this.cYW.iterator();
  }
  
  /* Error */
  public final void restore()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 57	com/tencent/mm/k/f:Ah	()Landroid/content/SharedPreferences;
    //   5: ldc 65
    //   7: ldc 67
    //   9: invokeinterface 210 3 0
    //   14: astore_1
    //   15: aload_0
    //   16: aload_1
    //   17: invokestatic 214	com/tencent/mm/booter/notification/queue/c:eN	(Ljava/lang/String;)Ljava/io/Serializable;
    //   20: checkcast 31	java/util/LinkedList
    //   23: putfield 25	com/tencent/mm/booter/notification/queue/a:cYW	Ljava/util/LinkedList;
    //   26: aload_0
    //   27: getfield 25	com/tencent/mm/booter/notification/queue/a:cYW	Ljava/util/LinkedList;
    //   30: ifnonnull +14 -> 44
    //   33: aload_0
    //   34: new 31	java/util/LinkedList
    //   37: dup
    //   38: invokespecial 105	java/util/LinkedList:<init>	()V
    //   41: putfield 25	com/tencent/mm/booter/notification/queue/a:cYW	Ljava/util/LinkedList;
    //   44: ldc 27
    //   46: ldc -40
    //   48: iconst_2
    //   49: anewarray 5	java/lang/Object
    //   52: dup
    //   53: iconst_0
    //   54: aload_0
    //   55: getfield 25	com/tencent/mm/booter/notification/queue/a:cYW	Ljava/util/LinkedList;
    //   58: invokevirtual 35	java/util/LinkedList:size	()I
    //   61: invokestatic 41	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   64: aastore
    //   65: dup
    //   66: iconst_1
    //   67: aload_0
    //   68: invokevirtual 82	com/tencent/mm/booter/notification/queue/a:toString	()Ljava/lang/String;
    //   71: aastore
    //   72: invokestatic 85	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   75: aload_0
    //   76: monitorexit
    //   77: return
    //   78: astore_1
    //   79: ldc 27
    //   81: aload_1
    //   82: ldc 67
    //   84: iconst_0
    //   85: anewarray 5	java/lang/Object
    //   88: invokestatic 99	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   91: aload_0
    //   92: getfield 25	com/tencent/mm/booter/notification/queue/a:cYW	Ljava/util/LinkedList;
    //   95: ifnonnull -51 -> 44
    //   98: aload_0
    //   99: new 31	java/util/LinkedList
    //   102: dup
    //   103: invokespecial 105	java/util/LinkedList:<init>	()V
    //   106: putfield 25	com/tencent/mm/booter/notification/queue/a:cYW	Ljava/util/LinkedList;
    //   109: goto -65 -> 44
    //   112: astore_1
    //   113: aload_0
    //   114: monitorexit
    //   115: aload_1
    //   116: athrow
    //   117: astore_1
    //   118: aload_0
    //   119: getfield 25	com/tencent/mm/booter/notification/queue/a:cYW	Ljava/util/LinkedList;
    //   122: ifnonnull +14 -> 136
    //   125: aload_0
    //   126: new 31	java/util/LinkedList
    //   129: dup
    //   130: invokespecial 105	java/util/LinkedList:<init>	()V
    //   133: putfield 25	com/tencent/mm/booter/notification/queue/a:cYW	Ljava/util/LinkedList;
    //   136: aload_1
    //   137: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	138	0	this	a
    //   14	3	1	str	String
    //   78	4	1	localException	Exception
    //   112	4	1	localObject1	Object
    //   117	20	1	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   15	26	78	java/lang/Exception
    //   2	15	112	finally
    //   26	44	112	finally
    //   44	75	112	finally
    //   91	109	112	finally
    //   118	136	112	finally
    //   136	138	112	finally
    //   15	26	117	finally
    //   79	91	117	finally
  }
  
  public final String toString()
  {
    Iterator localIterator = this.cYW.iterator();
    a locala;
    for (String str = ""; localIterator.hasNext(); str = str + locala.toString() + ";  ") {
      locala = (a)localIterator.next();
    }
    return str;
  }
  
  public static final class a
    implements Serializable
  {
    public long bJC = -1L;
    public boolean cYR = false;
    public int cYX;
    public int cYY = 0;
    public int cYz;
    public String userName = "";
    
    public a(int paramInt1, long paramLong, String paramString, int paramInt2, boolean paramBoolean, int paramInt3)
    {
      a(paramInt1, paramLong, paramString, paramInt2, paramBoolean, paramInt3);
    }
    
    public a(int paramInt, boolean paramBoolean)
    {
      this.cYX = paramInt;
      this.cYR = paramBoolean;
    }
    
    public final void a(int paramInt1, long paramLong, String paramString, int paramInt2, boolean paramBoolean, int paramInt3)
    {
      this.cYX = paramInt1;
      this.bJC = paramLong;
      this.userName = paramString;
      this.cYz = paramInt2;
      this.cYR = paramBoolean;
      this.cYY = paramInt3;
    }
    
    public final String toString()
    {
      return this.userName + " id:" + this.bJC + " unReadCount:" + this.cYz + "　notificationId:" + this.cYX;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/booter/notification/queue/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */