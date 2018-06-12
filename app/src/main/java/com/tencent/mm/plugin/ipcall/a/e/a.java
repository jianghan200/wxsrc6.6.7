package com.tencent.mm.plugin.ipcall.a.e;

public class a
{
  public boolean bTv = false;
  
  protected void aXS() {}
  
  public final void finish()
  {
    if (this.bTv)
    {
      aXS();
      this.bTv = false;
    }
  }
  
  public void reset() {}
  
  public void start()
  {
    reset();
    this.bTv = true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */