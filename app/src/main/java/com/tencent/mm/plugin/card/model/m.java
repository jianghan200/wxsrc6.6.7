package com.tencent.mm.plugin.card.model;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.mm.a.g;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.platformtools.w;
import com.tencent.mm.platformtools.w.a;
import com.tencent.mm.platformtools.w.b;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.io.IOException;

public final class m
  implements w
{
  public static final String hwK = e.bnE + "card";
  public static final String hwL = hwK + File.separator + "video";
  private final String TAG = "MicroMsg.CardSimpleGetPicStrategy";
  private String mPicUrl = null;
  
  public m(String paramString)
  {
    this.mPicUrl = paramString;
  }
  
  public static String xr(String paramString)
  {
    return String.format("%s/%s", new Object[] { hwK, g.u(paramString.getBytes()) });
  }
  
  public final void P(String paramString, boolean paramBoolean) {}
  
  public final Bitmap VA()
  {
    x.d("MicroMsg.CardSimpleGetPicStrategy", "no sd card!");
    return null;
  }
  
  public final void VB() {}
  
  public final w.b Vu()
  {
    return null;
  }
  
  public final String Vv()
  {
    return String.format("%s/%s", new Object[] { hwK, g.u(this.mPicUrl.getBytes()) });
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
    return true;
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
      c.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, Vv(), false);
      x.d("MicroMsg.CardSimpleGetPicStrategy", "get bitmap, from %s", new Object[] { parama.toString() });
      return paramBitmap;
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        try
        {
          paramString = new File(Vv());
          if (!paramString.exists()) {
            paramString.mkdirs();
          }
          x.w("MicroMsg.CardSimpleGetPicStrategy", " retry saving bitmap");
          c.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, Vv(), false);
        }
        catch (IOException paramString)
        {
          x.printErrStackTrace("MicroMsg.CardSimpleGetPicStrategy", paramString, "", new Object[0]);
          x.w("MicroMsg.CardSimpleGetPicStrategy", "save bitmap fail");
        }
      }
    }
  }
  
  public final void a(w.a parama, String paramString) {}
  
  public final String getCacheKey()
  {
    return this.mPicUrl;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/model/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */