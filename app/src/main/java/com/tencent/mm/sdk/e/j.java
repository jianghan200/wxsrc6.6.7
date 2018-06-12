package com.tencent.mm.sdk.e;

import android.os.Looper;

public abstract class j
  implements f
{
  public final k<a, l> sKC = new k() {};
  private final k<Object, String> sKD = new k() {};
  
  public final void Xp(String paramString)
  {
    paramString = new l(paramString);
    this.sKC.ci(paramString);
    this.sKC.doNotify();
  }
  
  public void a(a parama, Looper paramLooper)
  {
    this.sKC.a(parama, paramLooper);
  }
  
  public void b(String paramString, int paramInt, Object paramObject)
  {
    l locall = new l();
    locall.bHA = paramString;
    locall.fBN = paramInt;
    locall.obj = paramObject;
    locall.sKL = this;
    this.sKC.ci(locall);
    this.sKC.doNotify();
  }
  
  public void c(a parama)
  {
    this.sKC.a(parama, Looper.getMainLooper());
  }
  
  public void d(a parama)
  {
    this.sKC.remove(parama);
  }
  
  public final void doNotify()
  {
    l locall = new l("*");
    this.sKC.ci(locall);
    this.sKC.doNotify();
  }
  
  public void lock()
  {
    this.sKC.lock();
  }
  
  public void unlock()
  {
    this.sKC.unlock();
  }
  
  public static abstract interface a
  {
    public abstract void a(String paramString, l paraml);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/e/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */