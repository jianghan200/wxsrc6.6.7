package com.tencent.mm.pluginsdk.ui;

import android.graphics.Bitmap;
import com.tencent.mm.aa.f.c;

public final class c
  extends i
  implements f.c
{
  a qEK = (a)this.lZs;
  int qEL;
  
  public c(String paramString)
  {
    this(paramString, (byte)0);
  }
  
  private c(String paramString, byte paramByte)
  {
    super(new a(a.b.ccZ()), paramString, (byte)0);
  }
  
  private static final class a
    implements i.a
  {
    Bitmap hqv = null;
    private i.a lZs;
    
    public a(i.a parama)
    {
      this.lZs = parama;
    }
    
    public final void a(i parami)
    {
      if (this.lZs != null) {
        this.lZs.a(parami);
      }
    }
    
    public final Bitmap b(String paramString, int paramInt1, int paramInt2, int paramInt3)
    {
      if (this.lZs != null) {
        return this.lZs.b(paramString, paramInt1, paramInt2, paramInt3);
      }
      return null;
    }
    
    public final Bitmap cJ(String paramString)
    {
      if (this.lZs != null) {
        return this.lZs.cJ(paramString);
      }
      return null;
    }
    
    public final Bitmap cK(String paramString)
    {
      if (this.lZs != null) {
        return this.lZs.cK(paramString);
      }
      return null;
    }
    
    public final Bitmap uM()
    {
      if ((this.hqv != null) && (!this.hqv.isRecycled())) {
        return this.hqv;
      }
      if (this.lZs != null) {
        return this.lZs.uM();
      }
      return null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */