package com.tencent.magicbrush.engine;

public final class a
{
  protected long bny = JsEngine.createVM();
  
  public final void dispose()
  {
    if (this.bny == 0L) {
      return;
    }
    JsEngine.releaseVM(this.bny);
    this.bny = 0L;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/magicbrush/engine/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */