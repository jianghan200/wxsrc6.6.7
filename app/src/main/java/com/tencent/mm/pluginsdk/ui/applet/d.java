package com.tencent.mm.pluginsdk.ui.applet;

import com.tencent.mm.ac.a.e;
import com.tencent.mm.ac.a.j;
import com.tencent.mm.ac.a.k;
import com.tencent.mm.ac.f;
import com.tencent.mm.ac.z;
import com.tencent.mm.ak.a.a.c;
import com.tencent.mm.ak.a.a.c.a;
import com.tencent.mm.plugin.biz.b.a;
import com.tencent.mm.sdk.platformtools.bi;

public final class d
  implements p
{
  public final boolean TE(String paramString)
  {
    return f.eZ(paramString);
  }
  
  public final Object TF(String paramString)
  {
    j localj2 = z.Nc().cz(paramString);
    j localj1;
    if ((localj2 != null) && (!bi.oW(localj2.field_userId)))
    {
      localj1 = localj2;
      if (localj2.field_userId.equals(paramString)) {}
    }
    else
    {
      localj1 = new j();
      localj1.field_userId = paramString;
    }
    return localj1;
  }
  
  public final c TG(String paramString)
  {
    c.a locala = new c.a();
    locala.dXB = e.lj(paramString);
    locala.dXy = true;
    locala.dXV = true;
    locala.dXN = b.a.default_avatar;
    return locala.Pt();
  }
  
  public final String bW(Object paramObject)
  {
    return ((j)paramObject).field_userName;
  }
  
  public final String bX(Object paramObject)
  {
    return ((j)paramObject).field_headImageUrl;
  }
  
  public final String bY(Object paramObject)
  {
    return ((j)paramObject).field_userId;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/applet/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */