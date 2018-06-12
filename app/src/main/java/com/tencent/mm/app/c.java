package com.tencent.mm.app;

import android.graphics.Bitmap;
import com.tencent.mm.aa.f;
import com.tencent.mm.aa.f.c;
import com.tencent.mm.aa.q;
import com.tencent.mm.pluginsdk.ui.i;
import com.tencent.mm.pluginsdk.ui.i.a;

final class c
  implements i.a
{
  private Bitmap byb = null;
  f byc;
  
  public final void a(i parami)
  {
    if ((parami instanceof f.c)) {
      q.Kp().a((f.c)parami);
    }
  }
  
  public final Bitmap b(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    return com.tencent.mm.aa.c.c(paramString, paramInt1, paramInt2, paramInt3);
  }
  
  public final Bitmap cJ(String paramString)
  {
    return com.tencent.mm.aa.c.a(paramString, false, -1);
  }
  
  public final Bitmap cK(String paramString)
  {
    if (this.byc == null) {
      this.byc = q.Kp();
    }
    return f.jS(paramString);
  }
  
  public final Bitmap uM()
  {
    return this.byb;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/app/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */