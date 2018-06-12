package com.tencent.mm.bs;

import android.content.Context;
import java.util.HashMap;

public final class b
{
  private final b<?>[] sND;
  private final HashMap<String, b<?>> sNE;
  
  public b(Context paramContext)
  {
    paramContext = new d(paramContext);
    this.sND = new b[] { paramContext.sNL, paramContext.sNM };
    this.sNE = new HashMap();
  }
  
  public final <T> b<T> Dh(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.sND.length)) {
      return this.sND[paramInt];
    }
    return null;
  }
  
  public static abstract interface a<T>
  {
    public abstract void aZ(T paramT);
  }
  
  public static abstract interface b<T>
  {
    public abstract void a(b.a<T> parama);
    
    public abstract void b(b.a<T> parama);
    
    public abstract T get();
    
    public abstract String name();
    
    public abstract void removeAllListeners();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/bs/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */