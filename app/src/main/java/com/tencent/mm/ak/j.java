package com.tencent.mm.ak;

import android.graphics.Bitmap;
import com.tencent.mm.a.f;
import com.tencent.mm.cache.e;

final class j
  implements e
{
  private f<String, Bitmap> dVf = new f(5);
  
  public final Object get(Object paramObject)
  {
    return this.dVf.get((String)paramObject);
  }
  
  public final void o(Object paramObject1, Object paramObject2)
  {
    this.dVf.m((String)paramObject1, (Bitmap)paramObject2);
  }
  
  public final Object remove(Object paramObject)
  {
    this.dVf.remove((String)paramObject);
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ak/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */