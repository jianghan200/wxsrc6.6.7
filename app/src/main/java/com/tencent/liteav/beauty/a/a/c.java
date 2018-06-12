package com.tencent.liteav.beauty.a.a;

import android.view.Surface;

public class c
  extends b
{
  private Surface b;
  private boolean c;
  
  public c(a parama, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super(parama);
    a(paramInt1, paramInt2);
    this.c = paramBoolean;
  }
  
  public void c()
  {
    a();
    if (this.b != null)
    {
      if (this.c) {
        this.b.release();
      }
      this.b = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/liteav/beauty/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */