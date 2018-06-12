package com.tencent.mm.plugin.appbrand.jsapi.audio;

public abstract class a
  implements c, Runnable
{
  private long fHP = 0L;
  private long fHQ = 0L;
  
  public void En()
  {
    String str = getClass().getName();
    if (str.contains("$"))
    {
      str.substring(str.lastIndexOf("$") + 1);
      System.currentTimeMillis();
      System.currentTimeMillis();
      this.fHQ = 0L;
      this.fHP = 0L;
    }
  }
  
  public final void ahT()
  {
    this.fHP = System.currentTimeMillis();
    b.q(this);
  }
  
  public final void ahU()
  {
    this.fHP = System.currentTimeMillis();
    ahW();
  }
  
  public void run()
  {
    this.fHQ = System.currentTimeMillis();
    ahW();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/audio/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */