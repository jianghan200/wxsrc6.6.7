package com.tencent.mm.plugin.facedetect.model;

import android.app.ActivityManager;
import android.content.Context;
import com.tencent.mm.memory.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  extends a<byte[]>
{
  public static final c iNi = new c();
  private static int iNj = 0;
  
  public static void cx(int paramInt1, int paramInt2)
  {
    x.i("MicroMsg.FaceByteArrayPool", "preloadCameraData, width: %s, height: %s, count: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(5) });
    long l = bi.VG();
    int i = 0;
    while (i < 5)
    {
      iNi.F(new byte[paramInt1 * paramInt2 * 3 / 2]);
      i += 1;
    }
    x.i("MicroMsg.FaceByteArrayPool", "preloadCameraData used %sms", new Object[] { Long.valueOf(bi.bI(l)) });
  }
  
  public final void F(byte[] paramArrayOfByte)
  {
    try
    {
      super.aQ(paramArrayOfByte);
      return;
    }
    finally
    {
      paramArrayOfByte = finally;
      throw paramArrayOfByte;
    }
  }
  
  protected final long Fk()
  {
    if (iNj <= 0) {
      iNj = ((ActivityManager)ad.getContext().getSystemService("activity")).getLargeMemoryClass();
    }
    if (iNj >= 512) {
      return 20971520L;
    }
    return 10485760L;
  }
  
  protected final long Fl()
  {
    return 20971520L;
  }
  
  public final void Fm()
  {
    super.Fm();
  }
  
  /* Error */
  public final byte[] i(Integer paramInteger)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokespecial 120	com/tencent/mm/memory/a:c	(Ljava/lang/Integer;)Ljava/lang/Object;
    //   7: checkcast 96	[B
    //   10: astore_2
    //   11: aload_2
    //   12: ifnonnull +21 -> 33
    //   15: ldc 24
    //   17: ldc 122
    //   19: invokestatic 126	com/tencent/mm/sdk/platformtools/x:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   22: aload_1
    //   23: invokevirtual 109	java/lang/Integer:intValue	()I
    //   26: newarray <illegal type>
    //   28: astore_1
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_1
    //   32: areturn
    //   33: ldc 24
    //   35: ldc -128
    //   37: invokestatic 126	com/tencent/mm/sdk/platformtools/x:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   40: aload_2
    //   41: astore_1
    //   42: goto -13 -> 29
    //   45: astore_1
    //   46: aload_0
    //   47: monitorexit
    //   48: aload_1
    //   49: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	50	0	this	c
    //   0	50	1	paramInteger	Integer
    //   10	31	2	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   2	11	45	finally
    //   15	29	45	finally
    //   33	40	45	finally
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/facedetect/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */