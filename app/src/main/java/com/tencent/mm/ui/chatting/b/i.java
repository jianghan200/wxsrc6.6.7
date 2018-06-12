package com.tencent.mm.ui.chatting.b;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewStub;
import com.tencent.mm.a.e;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.chatting.c.a;

public final class i
{
  public static boolean X(ab paramab)
  {
    return (paramab.field_username.equals("medianote")) && ((q.GJ() & 0x4000) == 0);
  }
  
  public static ViewStub a(com.tencent.mm.ui.x paramx, int paramInt)
  {
    paramx = (ViewStub)paramx.findViewById(paramInt);
    if (paramx != null) {
      paramx.inflate();
    }
    return paramx;
  }
  
  public static void a(a parama, com.tencent.mm.storage.bd parambd, Intent paramIntent)
  {
    if ((parama == null) || (parambd == null)) {
      return;
    }
    String str = parama.getTalkerUserName();
    Object localObject2 = parama.oLT.field_username;
    boolean bool = ((com.tencent.mm.ui.chatting.b.b.c)parama.O(com.tencent.mm.ui.chatting.b.b.c.class)).cur();
    Object localObject1;
    if (!s.fq(parama.getTalkerUserName()))
    {
      localObject1 = localObject2;
      if (!bool) {}
    }
    else
    {
      if (!s.fq(parama.getTalkerUserName())) {
        break label182;
      }
      localObject1 = com.tencent.mm.model.bd.iB(parambd.field_content);
      if ((localObject2 == null) || (localObject1 == null) || (((String)localObject1).length() <= 0)) {
        break label218;
      }
    }
    for (;;)
    {
      localObject2 = new Bundle();
      int i;
      if (s.fq(parama.getTalkerUserName())) {
        i = 2;
      }
      for (;;)
      {
        ((Bundle)localObject2).putInt("stat_scene", i);
        ((Bundle)localObject2).putString("stat_msg_id", "msg_" + Long.toString(parambd.field_msgSvrId));
        ((Bundle)localObject2).putString("stat_chat_talker_username", str);
        ((Bundle)localObject2).putString("stat_send_msg_user", (String)localObject1);
        paramIntent.putExtra("_stat_obj", (Bundle)localObject2);
        return;
        label182:
        localObject1 = localObject2;
        if (parambd == null) {
          break;
        }
        localObject1 = parambd.field_bizChatUserId;
        break;
        if (s.hf(str)) {
          i = 7;
        } else {
          i = 1;
        }
      }
      label218:
      localObject1 = localObject2;
    }
  }
  
  public static boolean aan(String paramString)
  {
    int j;
    int i;
    if ((!s.he(paramString)) && (s.gW(paramString)) && (!q.gQ(paramString)))
    {
      au.HU();
      ab localab = com.tencent.mm.model.c.FR().Yg(paramString);
      if (localab == null) {
        break label108;
      }
      j = localab.field_type;
      au.HU();
      localab = com.tencent.mm.model.c.FR().Yg(localab.field_encryptUsername);
      if (localab == null) {
        break label103;
      }
      i = localab.field_type;
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.ChattingLogic", "isStranger:%s type:%d etype:%d", new Object[] { paramString, Integer.valueOf(j), Integer.valueOf(i) });
      return true;
      return false;
      label103:
      i = -1;
      continue;
      label108:
      i = -1;
      j = -1;
    }
  }
  
  public static boolean e(com.tencent.mm.storage.bd parambd, String paramString)
  {
    return (System.currentTimeMillis() - parambd.field_createTime > 259200000L) && ((bi.oW(paramString)) || (!e.cn(paramString)));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/chatting/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */