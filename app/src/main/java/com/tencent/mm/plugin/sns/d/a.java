package com.tencent.mm.plugin.sns.d;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import com.tencent.mm.bv.b;
import com.tencent.mm.memory.l;
import com.tencent.mm.memory.n;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger;
import com.tencent.mm.sdk.platformtools.x;

public final class a
{
  public static Bitmap b(String paramString, BitmapFactory.Options paramOptions, MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger)
  {
    long l = System.currentTimeMillis();
    try
    {
      paramDecodeResultLogger = l.Fu().a(paramString, paramOptions, paramDecodeResultLogger);
      paramOptions = paramDecodeResultLogger;
      if (paramDecodeResultLogger != null) {
        paramOptions = i.s(paramString, paramDecodeResultLogger);
      }
      x.d("MicroMsg.SnsBitmapUtil", "decodeWithRotateByExif used %dms bitmap: %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), paramOptions });
      return paramOptions;
    }
    catch (OutOfMemoryError paramString)
    {
      b.cou();
      x.e("MicroMsg.SnsBitmapUtil", "OutOfMemoryError e " + paramString.getMessage());
    }
    return null;
  }
  
  public static n c(String paramString, BitmapFactory.Options paramOptions, MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger)
  {
    long l = System.currentTimeMillis();
    try
    {
      paramDecodeResultLogger = l.Fu().a(paramString, paramOptions, paramDecodeResultLogger);
      paramOptions = paramDecodeResultLogger;
      if (paramDecodeResultLogger != null) {
        paramOptions = i.s(paramString, paramDecodeResultLogger);
      }
      x.d("MicroMsg.SnsBitmapUtil", "decodeWithRotateByExif used %dms bitmap: %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), paramOptions });
      paramString = n.m(paramOptions);
      return paramString;
    }
    catch (OutOfMemoryError paramString)
    {
      b.cou();
      x.e("MicroMsg.SnsBitmapUtil", "OutOfMemoryError e " + paramString.getMessage());
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */