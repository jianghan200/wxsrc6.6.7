package com.tencent.mm.plugin.appbrand.game.a;

public final class a
  extends com.tencent.mm.plugin.fts.a.a
{
  protected final void BR()
  {
    if (BS()) {
      t(-108L, 1L);
    }
  }
  
  protected final boolean BS()
  {
    return !cE(-108, 1);
  }
  
  public final String getName()
  {
    return "FTS5MiniGameStorage";
  }
  
  public final int getPriority()
  {
    return 8;
  }
  
  protected final String getTableName()
  {
    return "MiniGame";
  }
  
  public final int getType()
  {
    return 8;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */