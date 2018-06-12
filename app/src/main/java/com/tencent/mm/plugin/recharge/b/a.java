package com.tencent.mm.plugin.recharge.b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.mm.a.g;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.platformtools.w;
import com.tencent.mm.platformtools.w.a;
import com.tencent.mm.platformtools.w.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.io.IOException;

public final class a
  implements w
{
  private static final String hwK = e.bnE + "wallet";
  private String url;
  
  public a(String paramString)
  {
    this.url = paramString;
  }
  
  public final void P(String paramString, boolean paramBoolean) {}
  
  public final Bitmap VA()
  {
    return null;
  }
  
  public final void VB() {}
  
  public final w.b Vu()
  {
    return null;
  }
  
  public final String Vv()
  {
    String str = this.url;
    if (bi.oW(str))
    {
      x.w("MicroMsg.WalletGetPicStrategy", "getStoragePath: but url is null");
      return null;
    }
    return String.format("%s/%s", new Object[] { hwK, g.u(str.getBytes()) });
  }
  
  public final String Vw()
  {
    return this.url;
  }
  
  public final String Vx()
  {
    return this.url;
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
      x.d("MicroMsg.WalletGetPicStrategy", "get bitmap, from %s", new Object[] { parama.toString() });
      return paramBitmap;
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        try
        {
          paramString = new File(hwK);
          if (!paramString.exists()) {
            paramString.mkdir();
          }
          x.w("MicroMsg.WalletGetPicStrategy", " retry saving bitmap");
          c.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, Vv(), false);
        }
        catch (IOException paramString)
        {
          x.printErrStackTrace("MicroMsg.WalletGetPicStrategy", paramString, "", new Object[0]);
          x.w("MicroMsg.WalletGetPicStrategy", "save bitmap fail");
        }
      }
    }
  }
  
  public final void a(w.a parama, String paramString) {}
  
  public final String getCacheKey()
  {
    return this.url;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/recharge/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */