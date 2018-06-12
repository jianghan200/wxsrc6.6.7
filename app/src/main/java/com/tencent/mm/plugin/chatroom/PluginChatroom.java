package com.tencent.mm.plugin.chatroom;

import com.tencent.mm.kernel.b.f;
import com.tencent.mm.model.n;
import com.tencent.mm.plugin.chatroom.b.a;
import com.tencent.mm.plugin.chatroom.b.c;

public class PluginChatroom
  extends f
  implements c
{
  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    if (paramg.ES()) {
      com.tencent.mm.kernel.g.a(a.class, new n());
    }
  }
  
  public String name()
  {
    return "plugin-chatroom";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/chatroom/PluginChatroom.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */