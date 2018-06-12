package com.tencent.mm.plugin.emoji.sync;

import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

public final class a<T extends d>
{
  public BKGLoaderManager ije;
  
  public a()
  {
    b.a locala = new b.a();
    locala.ijm = 1;
    locala.dXc = 10;
    com.tencent.mm.ak.a.e.a locala1 = new com.tencent.mm.ak.a.e.a();
    locala.ijo = new b.b(locala.ijm, locala.ijm, TimeUnit.MILLISECONDS, locala1, new b.c(locala.dXc, "bkg_loader_"));
    a(new b(locala));
  }
  
  /* Error */
  private void a(b paramb)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 60	com/tencent/mm/plugin/emoji/sync/a:ije	Lcom/tencent/mm/plugin/emoji/sync/BKGLoaderManager;
    //   6: ifnonnull +18 -> 24
    //   9: aload_0
    //   10: new 62	com/tencent/mm/plugin/emoji/sync/BKGLoaderManager
    //   13: dup
    //   14: aload_1
    //   15: invokespecial 64	com/tencent/mm/plugin/emoji/sync/BKGLoaderManager:<init>	(Lcom/tencent/mm/plugin/emoji/sync/b;)V
    //   18: putfield 60	com/tencent/mm/plugin/emoji/sync/a:ije	Lcom/tencent/mm/plugin/emoji/sync/BKGLoaderManager;
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: ldc 66
    //   26: ldc 68
    //   28: invokestatic 74	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   31: goto -10 -> 21
    //   34: astore_1
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_1
    //   38: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	39	0	this	a
    //   0	39	1	paramb	b
    // Exception table:
    //   from	to	target	type
    //   2	21	34	finally
    //   24	31	34	finally
  }
  
  public final a aEU()
  {
    BKGLoaderManager localBKGLoaderManager = this.ije;
    if ((localBKGLoaderManager.ijs) && (localBKGLoaderManager.ijx)) {
      return a.ijj;
    }
    if ((BKGLoaderManager.aDK()) && (!localBKGLoaderManager.ijs) && (i.aEA().igx.cnK() > 0)) {
      return a.ijh;
    }
    if ((!ao.isConnected(ad.getContext())) && (!localBKGLoaderManager.ijs) && (i.aEA().igx.cnK() > 0)) {
      return a.iji;
    }
    if (ao.isConnected(ad.getContext()))
    {
      if ((localBKGLoaderManager.ijs) && (localBKGLoaderManager.bts)) {
        return a.ijg;
      }
      if (localBKGLoaderManager.ijv) {
        return a.ijk;
      }
    }
    return a.ijf;
  }
  
  public final void ej(boolean paramBoolean)
  {
    this.ije.bts = paramBoolean;
  }
  
  public final void s(ArrayList<d> paramArrayList)
  {
    BKGLoaderManager localBKGLoaderManager = this.ije;
    localBKGLoaderManager.ijr = false;
    if (localBKGLoaderManager.ijA == null) {
      localBKGLoaderManager.ijA = new Vector();
    }
    if (paramArrayList.size() > 0)
    {
      int j = paramArrayList.size();
      int i = 0;
      if (i < j)
      {
        d locald = (d)paramArrayList.get(i);
        if ((locald != null) && (!localBKGLoaderManager.ijA.contains(locald))) {
          localBKGLoaderManager.ijA.add(locald);
        }
        for (;;)
        {
          i += 1;
          break;
          x.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] task is has exist.:%s", new Object[] { locald.getKey() });
        }
      }
    }
  }
  
  public final void t(ArrayList<d> paramArrayList)
  {
    BKGLoaderManager localBKGLoaderManager = this.ije;
    if (localBKGLoaderManager.ijC == null) {
      localBKGLoaderManager.ijC = new Vector();
    }
    if (paramArrayList.size() > 0)
    {
      int j = paramArrayList.size();
      int i = 0;
      if (i < j)
      {
        Object localObject = (d)paramArrayList.get(i);
        if ((localBKGLoaderManager.ijy != null) && (localBKGLoaderManager.ijy.equals(localObject))) {
          if (localObject == null)
          {
            localObject = "task is null";
            label91:
            x.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] currentTask equals task is has exist:%s", new Object[] { localObject });
          }
        }
        for (;;)
        {
          i += 1;
          break;
          localObject = ((d)localObject).getKey();
          break label91;
          if ((localObject == null) || (localBKGLoaderManager.ijC.contains(localObject))) {
            break label156;
          }
          localBKGLoaderManager.ijC.add(localObject);
        }
        label156:
        if (localObject == null) {}
        for (localObject = "task is null";; localObject = ((d)localObject).getKey())
        {
          x.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] task is has exist:%s", new Object[] { localObject });
          break;
        }
      }
    }
  }
  
  public static enum a
  {
    private a() {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/emoji/sync/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */