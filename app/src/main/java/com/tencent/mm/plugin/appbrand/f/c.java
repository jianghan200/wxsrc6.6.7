package com.tencent.mm.plugin.appbrand.f;

import com.tencent.mm.plugin.fts.a.a;

public final class c
  extends a
{
  protected final void BR()
  {
    if (BS()) {
      t(-104L, 2L);
    }
  }
  
  protected final boolean BS()
  {
    return !cE(-104, 2);
  }
  
  public final String getName()
  {
    return "FTS5WeAppStorage";
  }
  
  public final int getPriority()
  {
    return 512;
  }
  
  protected final String getTableName()
  {
    return "WeApp";
  }
  
  public final int getType()
  {
    return 512;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/f/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */