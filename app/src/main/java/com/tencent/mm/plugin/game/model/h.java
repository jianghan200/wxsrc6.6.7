package com.tencent.mm.plugin.game.model;

import com.tencent.mm.plugin.game.d.ab;
import com.tencent.mm.plugin.game.d.ax;
import com.tencent.mm.plugin.game.d.db;
import com.tencent.mm.plugin.game.e.c;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;

public class h
{
  private static h jLM;
  public ax jLN;
  
  public static h aTL()
  {
    if (jLM == null) {}
    try
    {
      if (jLM == null) {
        jLM = new h();
      }
      return jLM;
    }
    finally {}
  }
  
  /* Error */
  private void ax(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokestatic 32	com/tencent/mm/sdk/platformtools/bi:bC	([B)Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: new 34	com/tencent/mm/plugin/game/d/ax
    //   18: dup
    //   19: invokespecial 35	com/tencent/mm/plugin/game/d/ax:<init>	()V
    //   22: putfield 37	com/tencent/mm/plugin/game/model/h:jLN	Lcom/tencent/mm/plugin/game/d/ax;
    //   25: aload_0
    //   26: getfield 37	com/tencent/mm/plugin/game/model/h:jLN	Lcom/tencent/mm/plugin/game/d/ax;
    //   29: aload_1
    //   30: invokevirtual 41	com/tencent/mm/plugin/game/d/ax:aG	([B)Lcom/tencent/mm/bk/a;
    //   33: pop
    //   34: goto -23 -> 11
    //   37: astore_1
    //   38: aload_0
    //   39: aconst_null
    //   40: putfield 37	com/tencent/mm/plugin/game/model/h:jLN	Lcom/tencent/mm/plugin/game/d/ax;
    //   43: ldc 43
    //   45: ldc 45
    //   47: iconst_1
    //   48: anewarray 4	java/lang/Object
    //   51: dup
    //   52: iconst_0
    //   53: aload_1
    //   54: invokevirtual 49	java/io/IOException:getMessage	()Ljava/lang/String;
    //   57: aastore
    //   58: invokestatic 55	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   61: goto -50 -> 11
    //   64: astore_1
    //   65: aload_0
    //   66: monitorexit
    //   67: aload_1
    //   68: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	69	0	this	h
    //   0	69	1	paramArrayOfByte	byte[]
    //   6	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   14	34	37	java/io/IOException
    //   2	7	64	finally
    //   14	34	64	finally
    //   38	61	64	finally
  }
  
  public final void Zy()
  {
    c.Em().H(new h.1(this));
  }
  
  public final ab aTM()
  {
    if (this.jLN != null)
    {
      ab localab = this.jLN.jRq;
      if (localab != null) {
        x.i("MicroMsg.GameConfigManager", "getGameDetailSettingControl jumpType:%d, jumpUrl:%s", new Object[] { Integer.valueOf(localab.jQq), localab.jOU });
      }
      return localab;
    }
    Zy();
    return null;
  }
  
  public final db aTN()
  {
    if (this.jLN != null) {
      return this.jLN.jRs;
    }
    Zy();
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/model/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */