package com.tencent.mm.memory;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  extends a<Bitmap>
{
  private static int duS = 20971520;
  public static final c duT = new c();
  
  private c()
  {
    int i = ((ActivityManager)ad.getContext().getSystemService("activity")).getLargeMemoryClass();
    x.i("MicroMsg.BitmapPool", "BitmapPool %dMB", new Object[] { Integer.valueOf(i) });
    if (i > 256) {}
    for (duS = 20971520;; duS = 10485760)
    {
      Fo();
      return;
    }
  }
  
  protected static Integer d(Integer paramInteger)
  {
    return Integer.valueOf(paramInteger.intValue() * 4);
  }
  
  private static Integer j(Bitmap paramBitmap)
  {
    if (paramBitmap == null) {
      return Integer.valueOf(0);
    }
    if (d.fS(19)) {}
    for (int i = paramBitmap.getByteCount();; i = paramBitmap.getAllocationByteCount()) {
      return Integer.valueOf(i);
    }
  }
  
  protected final long Fk()
  {
    return duS;
  }
  
  protected final long Fl()
  {
    return 1048576L;
  }
  
  public final void Fm()
  {
    super.Fm();
  }
  
  /* Error */
  public final Bitmap e(Integer paramInteger)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokespecial 138	com/tencent/mm/memory/a:b	(Ljava/lang/Integer;)Ljava/lang/Object;
    //   7: checkcast 78	android/graphics/Bitmap
    //   10: astore_3
    //   11: aload_3
    //   12: ifnull +19 -> 31
    //   15: aload_3
    //   16: invokevirtual 142	android/graphics/Bitmap:isRecycled	()Z
    //   19: ifne +12 -> 31
    //   22: aload_3
    //   23: invokevirtual 145	android/graphics/Bitmap:isMutable	()Z
    //   26: istore_2
    //   27: iload_2
    //   28: ifne +9 -> 37
    //   31: aconst_null
    //   32: astore_1
    //   33: aload_0
    //   34: monitorexit
    //   35: aload_1
    //   36: areturn
    //   37: ldc 43
    //   39: ldc -109
    //   41: iconst_5
    //   42: anewarray 47	java/lang/Object
    //   45: dup
    //   46: iconst_0
    //   47: aload_3
    //   48: aastore
    //   49: dup
    //   50: iconst_1
    //   51: aload_3
    //   52: invokevirtual 150	android/graphics/Bitmap:getWidth	()I
    //   55: invokestatic 53	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   58: aastore
    //   59: dup
    //   60: iconst_2
    //   61: aload_3
    //   62: invokevirtual 153	android/graphics/Bitmap:getHeight	()I
    //   65: invokestatic 53	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   68: aastore
    //   69: dup
    //   70: iconst_3
    //   71: aload_3
    //   72: invokestatic 114	com/tencent/mm/memory/c:j	(Landroid/graphics/Bitmap;)Ljava/lang/Integer;
    //   75: aastore
    //   76: dup
    //   77: iconst_4
    //   78: aload_1
    //   79: aastore
    //   80: invokestatic 155	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   83: aload_3
    //   84: astore_1
    //   85: goto -52 -> 33
    //   88: astore_1
    //   89: aload_0
    //   90: monitorexit
    //   91: aload_1
    //   92: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	93	0	this	c
    //   0	93	1	paramInteger	Integer
    //   26	2	2	bool	boolean
    //   10	74	3	localBitmap	Bitmap
    // Exception table:
    //   from	to	target	type
    //   2	11	88	finally
    //   15	27	88	finally
    //   37	83	88	finally
  }
  
  public final void k(Bitmap paramBitmap)
  {
    if (paramBitmap != null) {}
    try
    {
      if ((paramBitmap.isMutable()) && (!paramBitmap.isRecycled()))
      {
        x.i("MicroMsg.BitmapPool", "release: %s", new Object[] { paramBitmap });
        super.aQ(paramBitmap);
      }
      return;
    }
    finally
    {
      paramBitmap = finally;
      throw paramBitmap;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/memory/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */