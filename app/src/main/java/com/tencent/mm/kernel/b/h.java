package com.tencent.mm.kernel.b;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import com.tencent.mm.booter.c;
import com.tencent.mm.by.a;
import com.tencent.mm.by.a.a;
import com.tencent.mm.compatible.loader.e;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.tinker.loader.app.ApplicationLifeCycle;
import com.tencent.tinker.loader.app.ApplicationLike;

public final class h
  extends g
{
  public c cXF;
  public ApplicationLike dsS;
  public a<ApplicationLifeCycle> dsT = new a();
  public e mProfileCompat;
  
  public h(String paramString, Application paramApplication, ApplicationLike paramApplicationLike)
  {
    super(paramString, paramApplication);
    ad.bZ(paramString);
    this.dsS = paramApplicationLike;
  }
  
  public final String getPackageName()
  {
    return ad.getPackageName();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/kernel/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */