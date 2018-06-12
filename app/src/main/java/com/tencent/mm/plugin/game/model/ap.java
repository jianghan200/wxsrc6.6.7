package com.tencent.mm.plugin.game.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import com.tencent.mm.a.g;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.platformtools.w;
import com.tencent.mm.platformtools.w.a;
import com.tencent.mm.platformtools.w.b;
import com.tencent.mm.plugin.game.f.d;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.io.IOException;

public final class ap
  implements w
{
  protected String mPicUrl;
  
  public ap(String paramString)
  {
    this.mPicUrl = paramString;
    paramString = new File(e.dgn);
    if (!paramString.exists()) {
      paramString.mkdir();
    }
  }
  
  public final void P(String paramString, boolean paramBoolean) {}
  
  public final Bitmap VA()
  {
    return BitmapFactory.decodeResource(ad.getContext().getResources(), f.d.nosdcard_chatting_bg);
  }
  
  public final void VB() {}
  
  public final w.b Vu()
  {
    return null;
  }
  
  public final String Vv()
  {
    return e.dgn + g.u(this.mPicUrl.getBytes());
  }
  
  public final String Vw()
  {
    return this.mPicUrl;
  }
  
  public final String Vx()
  {
    return this.mPicUrl.hashCode();
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
    if (w.a.ewa == parama) {
      return paramBitmap;
    }
    try
    {
      c.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, Vv(), false);
      return paramBitmap;
    }
    catch (IOException parama)
    {
      x.printErrStackTrace("MicroMsg.GetGamePicStrategy", parama, "", new Object[0]);
    }
    return paramBitmap;
  }
  
  public final void a(w.a parama, String paramString) {}
  
  public final String getCacheKey()
  {
    return this.mPicUrl.hashCode();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */