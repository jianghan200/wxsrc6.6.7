package com.tencent.mm.plugin.sns.lucky.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Canvas;
import android.graphics.Color;
import com.tencent.mm.memory.n;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;

public final class a
{
  public static n a(Bitmap paramBitmap, String paramString, int paramInt1, int paramInt2)
  {
    paramBitmap = n.m(c.e(paramBitmap, paramInt2));
    if (paramBitmap == null) {
      x.e("MicroMsg.BlurHelper", "returnBitmap error2 ");
    }
    if (paramBitmap != null) {
      new Canvas(paramBitmap.Fw()).drawColor(paramInt1);
    }
    try
    {
      c.a(paramBitmap.Fw(), 70, Bitmap.CompressFormat.JPEG, paramString, false);
      x.i("MicroMsg.BlurHelper", "blur done bitmap  " + paramBitmap);
      return paramBitmap;
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        x.e("MicroMsg.BlurHelper", "error for exception " + paramString.getMessage());
        x.printErrStackTrace("MicroMsg.BlurHelper", paramString, "", new Object[0]);
      }
    }
  }
  
  public static n ev(String paramString1, String paramString2)
  {
    int i = Color.argb(51, 255, 255, 255);
    paramString1 = i.LH(paramString1);
    if (paramString1 == null)
    {
      x.e("MicroMsg.BlurHelper", "returnBitmap error1 ");
      return null;
    }
    return a(paramString1.Fw(), paramString2, i, 55);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/sns/lucky/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */