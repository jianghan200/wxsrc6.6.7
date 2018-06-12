package com.tencent.mm.aq;

import com.tencent.mm.plugin.messenger.foundation.a.a.h.b;
import com.tencent.mm.sdk.e.j;

public final class i
  extends j
  implements com.tencent.mm.plugin.messenger.foundation.a.a.h
{
  public static final String[] diD = { "CREATE TABLE IF NOT EXISTS oplog2 ( id INTEGER PRIMARY KEY , inserTime long , cmdId int , buffer blob , reserved1 int , reserved2 long , reserved3 text , reserved4 text ) " };
  com.tencent.mm.bt.h dCZ;
  
  public i(com.tencent.mm.bt.h paramh)
  {
    this.dCZ = paramh;
  }
  
  public final boolean a(h.b paramb)
  {
    if (paramb == null) {}
    while (this.dCZ.delete("oplog2", "id= ? AND inserTime= ?", new String[] { paramb.id, paramb.dSH }) >= 0) {
      return true;
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/aq/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */