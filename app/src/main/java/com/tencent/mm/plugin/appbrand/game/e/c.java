package com.tencent.mm.plugin.appbrand.game.e;

public abstract class c
  implements Runnable
{
  e<c> fDn;
  
  public abstract void execute();
  
  public void run()
  {
    execute();
    if (this.fDn != null) {
      this.fDn.j(this);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */