package com.tencent.magicbrush.b;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.tencent.magicbrush.a.c.f;

@SuppressLint({"LongLogTag"})
public class a
{
  private static volatile a boP = null;
  public b boQ = new a((byte)0);
  
  private a()
  {
    this.boQ.init();
  }
  
  public static a tf()
  {
    if (boP == null) {
      try
      {
        if (boP == null) {
          boP = new a();
        }
        a locala = boP;
        return locala;
      }
      finally {}
    }
    return boP;
  }
  
  private final class a
    implements a.b
  {
    private a() {}
    
    public final Bitmap aL(int paramInt1, int paramInt2)
    {
      c.f.i("MiroMsg.MBBitmapPool", "hy: dummy getTask", new Object[0]);
      return Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
    }
    
    public final void init()
    {
      c.f.i("MiroMsg.MBBitmapPool", "hy: dummy init", new Object[0]);
    }
  }
  
  public static abstract interface b
  {
    public abstract Bitmap aL(int paramInt1, int paramInt2);
    
    public abstract void init();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/magicbrush/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */