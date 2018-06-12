package com.tencent.mm.pluginsdk.model;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import com.tencent.mm.kernel.a;
import com.tencent.mm.platformtools.w;
import com.tencent.mm.platformtools.w.a;
import com.tencent.mm.platformtools.w.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.w.a.f;

public final class q
  implements w
{
  private boolean bOC;
  private long emk = 0L;
  private long eml = 0L;
  private String mfQ;
  private boolean qzn;
  private int type;
  private String url;
  
  public q(String paramString1, int paramInt, String paramString2)
  {
    this.url = paramString1;
    this.type = paramInt;
    this.mfQ = paramString2;
    this.bOC = false;
  }
  
  public static String v(String paramString1, int paramInt, String paramString2)
  {
    if (com.tencent.mm.kernel.g.Eg().Dx())
    {
      String str = com.tencent.mm.plugin.p.c.aWE();
      StringBuilder localStringBuilder = new StringBuilder();
      com.tencent.mm.kernel.g.Eg();
      return String.format("%s%d%s_%s", new Object[] { str, Integer.valueOf(paramInt), paramString2, com.tencent.mm.a.g.u((a.Dg() + paramString1).getBytes()) });
    }
    return "";
  }
  
  public final void P(String paramString, boolean paramBoolean)
  {
    this.eml = bi.VF();
    int j = 0;
    int i = j;
    if (com.tencent.mm.ak.q.Pn())
    {
      i = j;
      if (!bi.oW(paramString))
      {
        i = j;
        if (com.tencent.mm.ak.q.lY(Vw()))
        {
          i = j;
          if (paramString.equals("image/webp")) {
            i = 1;
          }
        }
      }
    }
    if (this.qzn)
    {
      if (paramBoolean) {
        break label114;
      }
      x.d("MicroMsg.ReaaderAppGetPicStrategy", "afterGetPicFromNet, download biz image failed");
      h.mEJ.a(86L, 2L, 1L, false);
      if (i != 0)
      {
        x.d("MicroMsg.ReaaderAppGetPicStrategy", "afterGetPicFromNet, download biz webp image failed");
        h.mEJ.a(86L, 15L, 1L, false);
      }
    }
    label114:
    long l;
    do
    {
      return;
      l = this.eml - this.emk;
      x.d("MicroMsg.ReaaderAppGetPicStrategy", "afterGetPicFromNet, download biz image success, used %d", new Object[] { Long.valueOf(l) });
      h.mEJ.a(86L, 4L, l, false);
    } while (i == 0);
    x.d("MicroMsg.ReaaderAppGetPicStrategy", "afterGetPicFromNet, download biz webp image success");
    h.mEJ.a(86L, 17L, l, false);
    h.mEJ.a(86L, 13L, 1L, false);
  }
  
  public final Bitmap VA()
  {
    return BitmapFactory.decodeResource(ad.getContext().getResources(), a.f.nosdcard_chatting_bg);
  }
  
  public final void VB()
  {
    this.emk = bi.VF();
    if (this.qzn)
    {
      x.d("MicroMsg.ReaaderAppGetPicStrategy", "beforeGetPicFromNet, from biz msg");
      h.mEJ.a(86L, 0L, 1L, false);
    }
  }
  
  public final w.b Vu()
  {
    return null;
  }
  
  public final String Vv()
  {
    return v(this.url, this.type, this.mfQ);
  }
  
  public final String Vw()
  {
    if (com.tencent.mm.ak.q.Pn()) {
      return com.tencent.mm.ak.q.lX(this.url);
    }
    return this.url;
  }
  
  public final String Vx()
  {
    return this.url;
  }
  
  public final boolean Vy()
  {
    return false;
  }
  
  public final boolean Vz()
  {
    return this.bOC;
  }
  
  public final Bitmap a(Bitmap paramBitmap, w.a parama, String paramString)
  {
    paramString = paramBitmap;
    String str;
    a locala;
    int j;
    int i;
    if (w.a.evZ == parama)
    {
      str = this.mfQ;
      locala = new a();
      Object localObject = ad.getContext();
      paramString = null;
      parama = paramString;
      if (localObject != null)
      {
        localObject = ((Context)localObject).getResources();
        parama = paramString;
        if (localObject != null) {
          parama = ((Resources)localObject).getDisplayMetrics();
        }
      }
      if (parama == null) {
        break label191;
      }
      if (!"@T".equals(str)) {
        break label173;
      }
      j = (int)(parama.widthPixels - 60.0F * parama.density);
      i = (int)(parama.density * 167.0F);
    }
    for (;;)
    {
      locala.w = j;
      locala.h = i;
      x.d("MicroMsg.ReaaderAppGetPicStrategy", locala.toString());
      paramString = com.tencent.mm.sdk.platformtools.c.a(paramBitmap, locala.w, locala.h, true);
      try
      {
        x.d("MicroMsg.ReaaderAppGetPicStrategy", "handlerBitmap, path:%s", new Object[] { Vv() });
        com.tencent.mm.sdk.platformtools.c.a(paramString, 100, Bitmap.CompressFormat.PNG, Vv(), false);
        return paramString;
      }
      catch (Exception paramBitmap)
      {
        label173:
        label191:
        x.printErrStackTrace("MicroMsg.ReaaderAppGetPicStrategy", paramBitmap, "", new Object[0]);
        x.e("MicroMsg.ReaaderAppGetPicStrategy", "save image %s fail", new Object[] { this.url });
      }
      j = (int)(parama.density * 50.0F);
      i = j;
      continue;
      if ("@T".equals(str))
      {
        i = 334;
        j = Integer.MAX_VALUE;
      }
      else
      {
        i = 100;
        j = 100;
      }
    }
    return paramString;
  }
  
  public final void a(w.a parama, String paramString)
  {
    if ((parama == w.a.evZ) && (this.qzn) && (com.tencent.mm.ak.q.Pn()) && (!bi.oW(paramString)) && (com.tencent.mm.ak.q.lY(Vw())) && (paramString.equals("image/webp")))
    {
      x.d("MicroMsg.ReaaderAppGetPicStrategy", "decode download webp picture failed");
      h.mEJ.a(86L, 14L, 1L, false);
    }
  }
  
  public final String getCacheKey()
  {
    return this.url + this.mfQ;
  }
  
  public static final class a
  {
    public int h;
    public int w;
    public int x;
    public int y;
    
    public final String toString()
    {
      return String.format("crop area[x=%d,y=%d,h=%d,w=%d]", new Object[] { Integer.valueOf(this.x), Integer.valueOf(this.y), Integer.valueOf(this.h), Integer.valueOf(this.w) });
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/pluginsdk/model/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */