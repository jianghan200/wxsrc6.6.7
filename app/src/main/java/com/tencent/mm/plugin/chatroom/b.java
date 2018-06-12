package com.tencent.mm.plugin.chatroom;

import com.tencent.mm.bt.h;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.api.c;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.af;
import com.tencent.mm.storage.v;
import java.util.HashMap;

public final class b
  implements com.tencent.mm.kernel.api.bucket.a, c, com.tencent.mm.kernel.c.a, com.tencent.mm.plugin.chatroom.b.b
{
  private v hKz;
  
  public final af c(h paramh)
  {
    return new v(paramh);
  }
  
  public final HashMap<Integer, h.d> collectDatabaseFactory()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf("CHATROOM_MEMBERS_TABLE".hashCode()), new b.1(this));
    return localHashMap;
  }
  
  public final void onAccountInitialized(e.c paramc)
  {
    this.hKz = new v(g.Ei().dqq);
  }
  
  public final void onAccountRelease() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/chatroom/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */