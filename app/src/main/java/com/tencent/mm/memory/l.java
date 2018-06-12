package com.tencent.mm.memory;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.i;
import com.tencent.mm.sdk.platformtools.x;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public abstract class l
{
  private static j dvd = new j();
  private static m dve = new m();
  private static int dvf = -1;
  
  public static l Fu()
  {
    if (dvf == -1) {
      if (!Fv()) {
        break label48;
      }
    }
    label48:
    for (dvf = 1;; dvf = 2) {
      switch (dvf)
      {
      default: 
        return dve;
      }
    }
    return dvd;
    return dve;
  }
  
  public static boolean Fv()
  {
    boolean bool = d.fR(19);
    x.i("MicroMsg.PlatformBitmapFactory", "canUseInBitmapFactory, isVersionMatch: %b, isART: %b, result: %s", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(bi.cje()), Boolean.valueOf(bool) });
    return bool;
  }
  
  protected static void i(InputStream paramInputStream)
  {
    Object localObject = paramInputStream;
    if (!paramInputStream.markSupported()) {
      if (!(paramInputStream instanceof FileInputStream)) {
        break label33;
      }
    }
    for (localObject = new i((FileInputStream)paramInputStream);; localObject = new BufferedInputStream(paramInputStream, 65536)) {
      try
      {
        ((InputStream)localObject).reset();
        return;
      }
      catch (Exception paramInputStream)
      {
        label33:
        x.printErrStackTrace("MicroMsg.PlatformBitmapFactory", paramInputStream, "reset stream error: %s", new Object[] { paramInputStream.getMessage() });
      }
    }
  }
  
  public abstract Bitmap a(String paramString, BitmapFactory.Options paramOptions, MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger);
  
  public abstract Bitmap a(String paramString, Rect paramRect, BitmapFactory.Options paramOptions, MMBitmapFactory.DecodeResultLogger paramDecodeResultLogger);
  
  public abstract void l(Bitmap paramBitmap);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/memory/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */