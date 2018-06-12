package com.tencent.mm.plugin.scanner.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import com.tencent.mm.R.g;
import com.tencent.mm.platformtools.w;
import com.tencent.mm.platformtools.w.a;
import com.tencent.mm.platformtools.w.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;

public final class o
  implements w
{
  private String mPicUrl = null;
  
  public o(String paramString)
  {
    this.mPicUrl = paramString;
  }
  
  public final void P(String paramString, boolean paramBoolean) {}
  
  public final Bitmap VA()
  {
    if (ad.getContext() == null) {
      return null;
    }
    return BitmapFactory.decodeResource(ad.getContext().getResources(), R.g.nosdcard_chatting_bg);
  }
  
  public final void VB() {}
  
  public final w.b Vu()
  {
    return null;
  }
  
  public final String Vv()
  {
    return com.tencent.mm.plugin.scanner.c.brY().eq(this.mPicUrl, "@S");
  }
  
  public final String Vw()
  {
    return this.mPicUrl;
  }
  
  public final String Vx()
  {
    return this.mPicUrl;
  }
  
  public final boolean Vy()
  {
    return false;
  }
  
  public final boolean Vz()
  {
    return false;
  }
  
  public final Bitmap a(Bitmap paramBitmap, w.a parama, String paramString)
  {
    if (w.a.evZ == parama) {}
    try
    {
      com.tencent.mm.sdk.platformtools.c.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, Vv(), false);
      return paramBitmap;
    }
    catch (IOException parama)
    {
      x.printErrStackTrace("MicroMsg.ScannerGetPicStrategy", parama, "", new Object[0]);
    }
    return paramBitmap;
  }
  
  public final void a(w.a parama, String paramString) {}
  
  public final String getCacheKey()
  {
    return this.mPicUrl;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/scanner/util/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */