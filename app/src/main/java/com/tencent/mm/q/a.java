package com.tencent.mm.q;

import com.tencent.mm.plugin.fts.a.h;

public final class a
  extends com.tencent.mm.plugin.fts.a.a
{
  protected final void BR()
  {
    if (BS()) {
      this.jpT.t(-107L, 1L);
    }
  }
  
  protected final boolean BS()
  {
    return !cE(-107, 1);
  }
  
  public final String getName()
  {
    return "FTS5FriendStorage";
  }
  
  public final int getPriority()
  {
    return 1280;
  }
  
  protected final String getTableName()
  {
    return "Friend";
  }
  
  public final int getType()
  {
    return 1280;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/q/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */