package com.tencent.mm.plugin.location.model;

import android.os.Looper;
import com.tencent.mm.a.e;
import com.tencent.mm.ay.c;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.location.a.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class p
  implements com.tencent.mm.ay.a
{
  private List<c> avD = new LinkedList();
  private ag handler;
  private b kDW;
  private final String path;
  
  public p()
  {
    Object localObject = new File(l.aZm());
    if (!((File)localObject).exists()) {
      ((File)localObject).mkdirs();
    }
    this.path = (l.aZm() + "trackroominfolist.info");
    this.handler = new ag(Looper.getMainLooper());
    if (this.kDW == null)
    {
      if (!e.cn(this.path)) {
        this.kDW = new b();
      }
    }
    else {
      return;
    }
    try
    {
      localObject = e.f(this.path, 0, -1);
      this.kDW = ((b)new b().aG((byte[])localObject));
      return;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.TrackRoomListMgr", localException, "", new Object[0]);
      this.kDW = new b();
    }
  }
  
  private void T(final String paramString1, final String paramString2, final String paramString3)
  {
    Iterator localIterator = this.avD.iterator();
    while (localIterator.hasNext())
    {
      final c localc = (c)localIterator.next();
      this.handler.post(new Runnable()
      {
        public final void run()
        {
          localc.nu(paramString1);
        }
      });
    }
  }
  
  private boolean aZw()
  {
    x.d("MicroMsg.TrackRoomListMgr", "infoFile infolist size %d", new Object[] { Integer.valueOf(this.kDW.kCt.size()) });
    if (this.kDW.kCt.isEmpty())
    {
      e.deleteFile(this.path);
      return true;
    }
    try
    {
      byte[] arrayOfByte = this.kDW.toByteArray();
      e.b(this.path, arrayOfByte, arrayOfByte.length);
      return true;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.TrackRoomListMgr", localException, "", new Object[0]);
    }
    return false;
  }
  
  /* Error */
  public final com.tencent.mm.plugin.location.a.a FM(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 75	com/tencent/mm/plugin/location/model/p:kDW	Lcom/tencent/mm/plugin/location/a/b;
    //   6: getfield 136	com/tencent/mm/plugin/location/a/b:kCt	Ljava/util/LinkedList;
    //   9: invokevirtual 167	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   12: astore 4
    //   14: aload 4
    //   16: invokeinterface 116 1 0
    //   21: ifeq +33 -> 54
    //   24: aload 4
    //   26: invokeinterface 120 1 0
    //   31: checkcast 169	com/tencent/mm/plugin/location/a/a
    //   34: astore_3
    //   35: aload_3
    //   36: getfield 172	com/tencent/mm/plugin/location/a/a:username	Ljava/lang/String;
    //   39: aload_1
    //   40: invokevirtual 178	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   43: istore_2
    //   44: iload_2
    //   45: ifeq -31 -> 14
    //   48: aload_3
    //   49: astore_1
    //   50: aload_0
    //   51: monitorexit
    //   52: aload_1
    //   53: areturn
    //   54: aconst_null
    //   55: astore_1
    //   56: goto -6 -> 50
    //   59: astore_1
    //   60: aload_0
    //   61: monitorexit
    //   62: aload_1
    //   63: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	64	0	this	p
    //   0	64	1	paramString	String
    //   43	2	2	bool	boolean
    //   34	15	3	locala	com.tencent.mm.plugin.location.a.a
    //   12	13	4	localIterator	Iterator
    // Exception table:
    //   from	to	target	type
    //   2	14	59	finally
    //   14	44	59	finally
  }
  
  public final void FN(String paramString)
  {
    if (this.kDW != null) {
      this.kDW.kCu = paramString;
    }
    aZw();
  }
  
  public final boolean SB()
  {
    String str;
    do
    {
      Iterator localIterator = this.kDW.kCt.iterator();
      Object localObject;
      while (!((Iterator)localObject).hasNext())
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localObject = (com.tencent.mm.plugin.location.a.a)localIterator.next();
        x.d("MicroMsg.TrackRoomListMgr", "info :" + ((com.tencent.mm.plugin.location.a.a)localObject).bUb.size());
        localObject = ((com.tencent.mm.plugin.location.a.a)localObject).bUb.iterator();
      }
      str = (String)((Iterator)localObject).next();
      x.d("MicroMsg.TrackRoomListMgr", "member :" + str);
    } while (!str.equals(q.GF()));
    x.i("MicroMsg.TrackRoomListMgr", "now is sharing location..");
    return true;
    return false;
  }
  
  public final String SC()
  {
    if (this.kDW != null) {
      return this.kDW.kCu;
    }
    return "";
  }
  
  public final void a(c paramc)
  {
    try
    {
      this.avD.add(paramc);
      return;
    }
    finally
    {
      paramc = finally;
      throw paramc;
    }
  }
  
  public final void a(String paramString1, LinkedList<String> paramLinkedList, double paramDouble1, double paramDouble2, String paramString2, String paramString3, String paramString4)
  {
    Object localObject = paramLinkedList;
    if (paramLinkedList == null) {}
    for (;;)
    {
      try
      {
        localObject = new LinkedList();
        x.i("MicroMsg.TrackRoomListMgr", "updateList talk: %s,  size: %d %f %f", new Object[] { paramString1, Integer.valueOf(((LinkedList)localObject).size()), Double.valueOf(paramDouble1), Double.valueOf(paramDouble2) });
        paramLinkedList = (LinkedList)((LinkedList)localObject).clone();
        boolean bool = paramLinkedList.isEmpty();
        localObject = this.kDW.kCt.iterator();
        if (((Iterator)localObject).hasNext())
        {
          com.tencent.mm.plugin.location.a.a locala = (com.tencent.mm.plugin.location.a.a)((Iterator)localObject).next();
          if (!locala.username.equals(paramString1)) {
            continue;
          }
          if (bool)
          {
            this.kDW.kCt.remove(locala);
            aZw();
            T(paramString1, paramString3, paramString4);
            return;
          }
          locala.bUb = paramLinkedList;
          locala.kCs = paramString2;
          locala.latitude = paramDouble1;
          locala.longitude = paramDouble2;
          continue;
        }
        if (bool) {
          break label248;
        }
      }
      finally {}
      localObject = new com.tencent.mm.plugin.location.a.a();
      ((com.tencent.mm.plugin.location.a.a)localObject).username = paramString1;
      ((com.tencent.mm.plugin.location.a.a)localObject).bUb = paramLinkedList;
      ((com.tencent.mm.plugin.location.a.a)localObject).kCs = paramString2;
      ((com.tencent.mm.plugin.location.a.a)localObject).latitude = paramDouble1;
      ((com.tencent.mm.plugin.location.a.a)localObject).longitude = paramDouble2;
      this.kDW.kCt.add(localObject);
      label248:
      aZw();
      T(paramString1, paramString3, paramString4);
    }
  }
  
  public final boolean az(String paramString1, String paramString2)
  {
    return ns(paramString1).contains(paramString2);
  }
  
  public final void b(c paramc)
  {
    try
    {
      this.avD.remove(paramc);
      return;
    }
    finally
    {
      paramc = finally;
      throw paramc;
    }
  }
  
  /* Error */
  public final LinkedList<String> ns(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 75	com/tencent/mm/plugin/location/model/p:kDW	Lcom/tencent/mm/plugin/location/a/b;
    //   6: getfield 136	com/tencent/mm/plugin/location/a/b:kCt	Ljava/util/LinkedList;
    //   9: invokevirtual 167	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   12: astore_2
    //   13: aload_2
    //   14: invokeinterface 116 1 0
    //   19: ifeq +39 -> 58
    //   22: aload_2
    //   23: invokeinterface 120 1 0
    //   28: checkcast 169	com/tencent/mm/plugin/location/a/a
    //   31: astore_3
    //   32: aload_3
    //   33: getfield 172	com/tencent/mm/plugin/location/a/a:username	Ljava/lang/String;
    //   36: aload_1
    //   37: invokevirtual 178	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   40: ifeq -27 -> 13
    //   43: aload_3
    //   44: getfield 191	com/tencent/mm/plugin/location/a/a:bUb	Ljava/util/LinkedList;
    //   47: invokevirtual 228	java/util/LinkedList:clone	()Ljava/lang/Object;
    //   50: checkcast 25	java/util/LinkedList
    //   53: astore_1
    //   54: aload_0
    //   55: monitorexit
    //   56: aload_1
    //   57: areturn
    //   58: new 25	java/util/LinkedList
    //   61: dup
    //   62: invokespecial 26	java/util/LinkedList:<init>	()V
    //   65: astore_1
    //   66: goto -12 -> 54
    //   69: astore_1
    //   70: aload_0
    //   71: monitorexit
    //   72: aload_1
    //   73: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	p
    //   0	74	1	paramString	String
    //   12	11	2	localIterator	Iterator
    //   31	13	3	locala	com.tencent.mm.plugin.location.a.a
    // Exception table:
    //   from	to	target	type
    //   2	13	69	finally
    //   13	54	69	finally
    //   58	66	69	finally
  }
  
  public final boolean nt(String paramString)
  {
    return ns(paramString).size() > 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/location/model/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */