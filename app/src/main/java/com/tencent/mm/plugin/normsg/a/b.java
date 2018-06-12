package com.tencent.mm.plugin.normsg.a;

import android.view.View;
import com.tencent.mm.sdk.platformtools.x;

public enum b
  implements a
{
  private static a lFK = new a((byte)0);
  
  private b() {}
  
  public static void a(a parama)
  {
    if (parama != null) {
      lFK = parama;
    }
  }
  
  public final String IO(String paramString)
  {
    return lFK.IO(paramString);
  }
  
  public final void S(int paramInt1, int paramInt2, int paramInt3)
  {
    lFK.S(paramInt1, paramInt2, paramInt3);
  }
  
  public final String a(Object[][] paramArrayOfObject)
  {
    return lFK.a(paramArrayOfObject);
  }
  
  public final void a(View paramView, Class<? extends com.tencent.mm.sdk.b.b> paramClass)
  {
    lFK.a(paramView, paramClass);
  }
  
  public final boolean bI(Object paramObject)
  {
    return lFK.bI(paramObject);
  }
  
  public final String bjD()
  {
    return lFK.bjD();
  }
  
  public final byte[] bjE()
  {
    return lFK.bjE();
  }
  
  public final boolean bjz()
  {
    return lFK.bjz();
  }
  
  public final boolean c(Object paramObject, Class paramClass)
  {
    return lFK.c(paramObject, paramClass);
  }
  
  public final boolean cKL()
  {
    return lFK.cKL();
  }
  
  public final String gV(boolean paramBoolean)
  {
    return lFK.gV(paramBoolean);
  }
  
  public final String ub(int paramInt)
  {
    return lFK.ub(paramInt);
  }
  
  public final void uc(int paramInt)
  {
    lFK.uc(paramInt);
  }
  
  private static final class a
    implements a
  {
    public final String IO(String paramString)
    {
      x.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      return paramString;
    }
    
    public final void S(int paramInt1, int paramInt2, int paramInt3)
    {
      x.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
    }
    
    public final String a(Object[][] paramArrayOfObject)
    {
      x.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      return "";
    }
    
    public final void a(View paramView, Class<? extends com.tencent.mm.sdk.b.b> paramClass)
    {
      x.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
    }
    
    public final boolean bI(Object paramObject)
    {
      x.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      return false;
    }
    
    public final String bjD()
    {
      x.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      return "";
    }
    
    public final byte[] bjE()
    {
      x.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      return new byte[0];
    }
    
    public final boolean bjz()
    {
      x.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      return false;
    }
    
    public final boolean c(Object paramObject, Class paramClass)
    {
      x.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      return false;
    }
    
    public final boolean cKL()
    {
      x.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      return false;
    }
    
    public final String gV(boolean paramBoolean)
    {
      x.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      return "";
    }
    
    public final String ub(int paramInt)
    {
      x.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
      return "";
    }
    
    public final void uc(int paramInt)
    {
      x.w("MicroMsg.NormsgSource", "!! Dummy implementation !!");
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/normsg/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */