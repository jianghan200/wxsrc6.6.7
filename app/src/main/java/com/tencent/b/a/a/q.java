package com.tencent.b.a.a;

import android.content.Context;

public abstract class q
{
  protected Context context = null;
  
  protected q(Context paramContext)
  {
    this.context = paramContext;
  }
  
  protected abstract void a(a parama);
  
  public final void b(a parama)
  {
    if (parama == null) {}
    while (!tL()) {
      return;
    }
    a(parama);
  }
  
  public final void b(g paramg)
  {
    if (paramg == null) {}
    do
    {
      return;
      paramg = paramg.toString();
    } while (!tL());
    write(s.encode(paramg));
  }
  
  protected abstract String read();
  
  protected abstract boolean tL();
  
  protected abstract a tM();
  
  public final g tT()
  {
    g localg = null;
    if (tL()) {}
    for (String str = s.decode(read());; str = null)
    {
      if (str != null) {
        localg = g.ch(str);
      }
      return localg;
    }
  }
  
  public final a tU()
  {
    if (tL()) {
      return tM();
    }
    return null;
  }
  
  protected abstract void write(String paramString);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/b/a/a/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */