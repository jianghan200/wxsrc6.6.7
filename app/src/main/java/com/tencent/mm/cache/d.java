package com.tencent.mm.cache;

import android.graphics.Canvas;

public abstract interface d<T>
  extends Cloneable
{
  public abstract void a(Canvas paramCanvas, boolean paramBoolean);
  
  public abstract void aV(boolean paramBoolean);
  
  public abstract int aW(boolean paramBoolean);
  
  public abstract void add(T paramT);
  
  public abstract void c(Canvas paramCanvas);
  
  public abstract void onCreate();
  
  public abstract void onDestroy();
  
  public abstract T pop();
  
  public abstract void vN();
  
  public abstract void yo();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/cache/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */