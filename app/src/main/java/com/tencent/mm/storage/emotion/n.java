package com.tencent.mm.storage.emotion;

import com.tencent.mm.bt.g;
import com.tencent.mm.bt.g.a;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class n
  extends i<m>
  implements g.a
{
  public static final String[] diD = { i.a(m.dhO, "EmotionRewardTipInfo") };
  private e diF;
  
  public n(e parame)
  {
    this(parame, m.dhO, "EmotionRewardTipInfo");
  }
  
  private n(e parame, c.a parama, String paramString)
  {
    super(parame, parama, paramString, null);
    this.diF = parame;
  }
  
  public final int a(g paramg)
  {
    if (paramg != null) {
      this.diF = paramg;
    }
    return 0;
  }
  
  public final boolean a(m paramm)
  {
    if (paramm == null) {
      x.w("MicroMsg.emoji.EmotionRewardTipStorage", "save failed info is null");
    }
    for (;;)
    {
      return false;
      long l = this.diF.replace("EmotionRewardTipInfo", "prodcutID", paramm.wH());
      if (l > 0L) {
        x.i("MicroMsg.emoji.EmotionRewardTipStorage", "save success");
      }
      while (l > 0L)
      {
        return true;
        x.i("MicroMsg.emoji.EmotionRewardTipStorage", "save failed");
      }
    }
  }
  
  /* Error */
  public final m cnO()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 40	com/tencent/mm/storage/emotion/n:diF	Lcom/tencent/mm/sdk/e/e;
    //   4: ldc 77
    //   6: iconst_0
    //   7: anewarray 15	java/lang/String
    //   10: iconst_2
    //   11: invokeinterface 81 4 0
    //   16: astore_2
    //   17: aload_2
    //   18: ifnull +43 -> 61
    //   21: aload_2
    //   22: astore_1
    //   23: aload_2
    //   24: invokeinterface 87 1 0
    //   29: ifeq +32 -> 61
    //   32: aload_2
    //   33: astore_1
    //   34: new 17	com/tencent/mm/storage/emotion/m
    //   37: dup
    //   38: invokespecial 89	com/tencent/mm/storage/emotion/m:<init>	()V
    //   41: astore_3
    //   42: aload_2
    //   43: astore_1
    //   44: aload_3
    //   45: aload_2
    //   46: invokevirtual 93	com/tencent/mm/storage/emotion/m:d	(Landroid/database/Cursor;)V
    //   49: aload_2
    //   50: ifnull +9 -> 59
    //   53: aload_2
    //   54: invokeinterface 96 1 0
    //   59: aload_3
    //   60: areturn
    //   61: aload_2
    //   62: ifnull +9 -> 71
    //   65: aload_2
    //   66: invokeinterface 96 1 0
    //   71: aconst_null
    //   72: areturn
    //   73: astore_3
    //   74: aconst_null
    //   75: astore_2
    //   76: aload_2
    //   77: astore_1
    //   78: ldc 44
    //   80: ldc 98
    //   82: iconst_1
    //   83: anewarray 100	java/lang/Object
    //   86: dup
    //   87: iconst_0
    //   88: aload_3
    //   89: invokestatic 105	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   92: aastore
    //   93: invokestatic 109	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   96: aload_2
    //   97: ifnull -26 -> 71
    //   100: aload_2
    //   101: invokeinterface 96 1 0
    //   106: goto -35 -> 71
    //   109: astore_2
    //   110: aconst_null
    //   111: astore_1
    //   112: aload_1
    //   113: ifnull +9 -> 122
    //   116: aload_1
    //   117: invokeinterface 96 1 0
    //   122: aload_2
    //   123: athrow
    //   124: astore_2
    //   125: goto -13 -> 112
    //   128: astore_3
    //   129: goto -53 -> 76
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	132	0	this	n
    //   22	95	1	localCursor1	android.database.Cursor
    //   16	85	2	localCursor2	android.database.Cursor
    //   109	14	2	localObject1	Object
    //   124	1	2	localObject2	Object
    //   41	19	3	localm	m
    //   73	16	3	localException1	Exception
    //   128	1	3	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   0	17	73	java/lang/Exception
    //   0	17	109	finally
    //   23	32	124	finally
    //   34	42	124	finally
    //   44	49	124	finally
    //   78	96	124	finally
    //   23	32	128	java/lang/Exception
    //   34	42	128	java/lang/Exception
    //   44	49	128	java/lang/Exception
  }
  
  public final boolean dg(String paramString, int paramInt)
  {
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.emoji.EmotionRewardTipStorage", "product id is null.");
      return false;
    }
    paramString = "UPDATE EmotionRewardTipInfo SET flag=" + paramInt + ",setFlagTime=" + System.currentTimeMillis() + " WHERE prodcutID='" + paramString + "'";
    boolean bool = this.diF.fV("EmotionRewardTipInfo", paramString);
    x.i("MicroMsg.emoji.EmotionRewardTipStorage", "updateFlag result:%b", new Object[] { Boolean.valueOf(bool) });
    return bool;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/storage/emotion/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */