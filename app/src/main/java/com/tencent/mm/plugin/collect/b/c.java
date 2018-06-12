package com.tencent.mm.plugin.collect.b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.mm.platformtools.w;
import com.tencent.mm.platformtools.w.a;
import com.tencent.mm.platformtools.w.b;
import com.tencent.mm.plugin.wallet_core.d.b;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;

public final class c
  implements w
{
  private w.b hTJ = new c.1(this);
  private String url;
  
  public c(String paramString)
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
    return this.hTJ;
  }
  
  public final String Vv()
  {
    return b.JC(this.url);
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
      com.tencent.mm.sdk.platformtools.c.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, b.JC(this.url), false);
      return paramBitmap;
    }
    catch (IOException parama)
    {
      x.printErrStackTrace("MicroMsg.WalletGetPicStrategy", parama, "", new Object[0]);
    }
    return paramBitmap;
  }
  
  public final void a(w.a parama, String paramString) {}
  
  public final String getCacheKey()
  {
    return this.url;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/collect/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */