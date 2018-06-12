package com.tencent.mm.plugin.wear.model;

import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

public final class g
{
  private static int pJD = 0;
  private HashMap<String, f> pJE = new HashMap();
  
  /* Error */
  public final f PK(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 22	com/tencent/mm/plugin/wear/model/g:pJE	Ljava/util/HashMap;
    //   6: aload_1
    //   7: invokevirtual 28	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   10: ifeq +25 -> 35
    //   13: aload_0
    //   14: getfield 22	com/tencent/mm/plugin/wear/model/g:pJE	Ljava/util/HashMap;
    //   17: aload_1
    //   18: invokevirtual 32	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   21: checkcast 34	com/tencent/mm/plugin/wear/model/f
    //   24: invokevirtual 38	com/tencent/mm/plugin/wear/model/f:clone	()Ljava/lang/Object;
    //   27: checkcast 34	com/tencent/mm/plugin/wear/model/f
    //   30: astore_1
    //   31: aload_0
    //   32: monitorexit
    //   33: aload_1
    //   34: areturn
    //   35: getstatic 13	com/tencent/mm/plugin/wear/model/g:pJD	I
    //   38: iconst_1
    //   39: iadd
    //   40: putstatic 13	com/tencent/mm/plugin/wear/model/g:pJD	I
    //   43: new 34	com/tencent/mm/plugin/wear/model/f
    //   46: dup
    //   47: invokespecial 39	com/tencent/mm/plugin/wear/model/f:<init>	()V
    //   50: astore_2
    //   51: aload_2
    //   52: aload_1
    //   53: putfield 43	com/tencent/mm/plugin/wear/model/f:talker	Ljava/lang/String;
    //   56: aload_2
    //   57: getstatic 13	com/tencent/mm/plugin/wear/model/g:pJD	I
    //   60: putfield 46	com/tencent/mm/plugin/wear/model/f:id	I
    //   63: aload_2
    //   64: getstatic 52	com/tencent/mm/plugin/wear/model/f$a:pJy	Lcom/tencent/mm/plugin/wear/model/f$a;
    //   67: putfield 55	com/tencent/mm/plugin/wear/model/f:pJx	Lcom/tencent/mm/plugin/wear/model/f$a;
    //   70: aload_0
    //   71: getfield 22	com/tencent/mm/plugin/wear/model/g:pJE	Ljava/util/HashMap;
    //   74: aload_1
    //   75: aload_2
    //   76: invokevirtual 59	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   79: pop
    //   80: aload_2
    //   81: invokevirtual 38	com/tencent/mm/plugin/wear/model/f:clone	()Ljava/lang/Object;
    //   84: checkcast 34	com/tencent/mm/plugin/wear/model/f
    //   87: astore_1
    //   88: goto -57 -> 31
    //   91: astore_1
    //   92: aload_0
    //   93: monitorexit
    //   94: aload_1
    //   95: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	96	0	this	g
    //   0	96	1	paramString	String
    //   50	31	2	localf	f
    // Exception table:
    //   from	to	target	type
    //   2	31	91	finally
    //   35	88	91	finally
  }
  
  public final void PL(String paramString)
  {
    try
    {
      x.i("MicroMsg.Wear.WearNotificationMap", "reset notification talker=%s", new Object[] { paramString });
      if (this.pJE.containsKey(paramString))
      {
        ((f)this.pJE.get(paramString)).pJx = f.a.pJy;
        ((f)this.pJE.get(paramString)).pJw = 0;
      }
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final void PM(String paramString)
  {
    try
    {
      if (this.pJE.containsKey(paramString))
      {
        paramString = (f)this.pJE.get(paramString);
        paramString.pJx = f.a.pJB;
        paramString.pJw = 0;
        x.i("MicroMsg.Wear.WearNotificationMap", "Update reply success, notification=%s", new Object[] { paramString });
      }
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final void PN(String paramString)
  {
    try
    {
      if (this.pJE.containsKey(paramString))
      {
        paramString = (f)this.pJE.get(paramString);
        paramString.pJx = f.a.pJz;
        x.i("MicroMsg.Wear.WearNotificationMap", "Update showing success, notification=%s", new Object[] { paramString });
      }
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final void a(f paramf)
  {
    try
    {
      x.i("MicroMsg.Wear.WearNotificationMap", "update notification=%s", new Object[] { paramf });
      this.pJE.put(paramf.talker, paramf);
      return;
    }
    finally
    {
      paramf = finally;
      throw paramf;
    }
  }
  
  public final void ct(String paramString, int paramInt)
  {
    try
    {
      if (this.pJE.containsKey(paramString))
      {
        paramString = (f)this.pJE.get(paramString);
        paramString.pJx = f.a.pJA;
        paramString.pJw = paramInt;
        x.i("MicroMsg.Wear.WearNotificationMap", "Update ignore success, notification=%s", new Object[] { paramString });
      }
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wear/model/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */