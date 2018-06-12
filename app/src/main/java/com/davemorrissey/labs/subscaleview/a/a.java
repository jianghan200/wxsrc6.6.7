package com.davemorrissey.labs.subscaleview.a;

import android.graphics.Bitmap.Config;
import java.lang.reflect.Constructor;

public final class a<T>
  implements b<T>
{
  private Class<? extends T> Yw;
  private Bitmap.Config Yx;
  
  public a(Class<? extends T> paramClass)
  {
    this(paramClass, (byte)0);
  }
  
  private a(Class<? extends T> paramClass, byte paramByte)
  {
    this.Yw = paramClass;
    this.Yx = null;
  }
  
  public final T hu()
  {
    if (this.Yx == null) {
      return (T)this.Yw.newInstance();
    }
    return (T)this.Yw.getConstructor(new Class[] { Bitmap.Config.class }).newInstance(new Object[] { this.Yx });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/davemorrissey/labs/subscaleview/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */