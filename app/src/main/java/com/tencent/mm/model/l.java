package com.tencent.mm.model;

import android.content.Context;
import com.tencent.mm.ap.a.a;
import com.tencent.mm.ap.c;
import com.tencent.mm.ap.e;
import com.tencent.mm.g.c.am;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.chatroom.c.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.bd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class l
{
  public static List<Boolean> E(List<String> paramList)
  {
    if (paramList == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList(paramList.size());
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(Boolean.valueOf(gz((String)paramList.next())));
    }
    return localArrayList;
  }
  
  public static void a(String paramString1, List<String> paramList, String paramString2, boolean paramBoolean, String paramString3)
  {
    a(paramString1, paramList, paramString2, paramBoolean, paramString3, 2);
  }
  
  public static void a(String paramString1, List<String> paramList, String paramString2, boolean paramBoolean, String paramString3, int paramInt)
  {
    bd localbd = new bd();
    localbd.ep(paramString1);
    localbd.setType(10000);
    localbd.ay(System.currentTimeMillis());
    localbd.setStatus(4);
    localbd.eX(paramInt);
    paramString1 = new StringBuffer();
    if (paramList != null)
    {
      String str1 = q.GF();
      String str2 = ad.getContext().getString(c.a.chatroom_sys_msg_invite_split);
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        String str3 = (String)paramList.next();
        if (!str3.equals(str1))
        {
          ab localab = ((i)g.l(i.class)).FR().Yg(str3);
          if ((localab != null) && ((int)localab.dhP != 0))
          {
            if (paramBoolean) {
              paramString1.append("<a href=\"" + paramString3 + str3 + "\">" + localab.BL() + "</a>" + str2);
            } else {
              paramString1.append(localab.BL() + str2);
            }
          }
          else if (paramBoolean) {
            paramString1.append("<a href=\"" + paramString3 + str3 + "\">" + str3 + "</a>" + str2);
          } else {
            paramString1.append(str3 + str2);
          }
        }
      }
      if (paramString1.length() > 0) {
        paramString1.deleteCharAt(paramString1.lastIndexOf(str2));
      }
    }
    localbd.setContent(paramString2.replace("%s", paramString1));
    ((i)g.l(i.class)).bcY().T(localbd);
  }
  
  public static boolean gz(String paramString)
  {
    if (!s.fq(paramString)) {
      return false;
    }
    Object localObject = ((i)g.l(i.class)).FW().Yq(paramString);
    long l1;
    boolean bool1;
    if (localObject != null) {
      if ((((am)localObject).field_lastSeq != 0L) && (((i)g.l(i.class)).bcY().J(paramString, ((am)localObject).field_lastSeq).field_msgId == 0L))
      {
        l1 = ((am)localObject).field_lastSeq;
        bool1 = true;
        if (((am)localObject).field_firstUnDeliverSeq != 0L)
        {
          ((ai)localObject).av(0L);
          ((ai)localObject).au(0L);
          ((i)g.l(i.class)).FW().a((ai)localObject, paramString);
          x.i("MicroMsg.ChatroomLogic", "summerbadcr deleteConv chatroomId update conv");
        }
      }
    }
    for (;;)
    {
      boolean bool2 = bool1;
      if (!bool1)
      {
        localObject = ((i)g.l(i.class)).bcY().Hb(paramString);
        bool2 = bool1;
        if (localObject != null)
        {
          bool2 = bool1;
          if (((cm)localObject).field_msgId != 0L) {
            bool2 = true;
          }
        }
      }
      long l2 = l1;
      if (l1 == 0L) {
        l2 = ((i)g.l(i.class)).bcY().Ha(paramString);
      }
      if (l2 != 0L) {
        ((i)g.l(i.class)).Gx().F(paramString, l2);
      }
      x.i("MicroMsg.ChatroomLogic", "summerbadcr deleteConv chatroomId[%s], needClear[%b], lastMsgSeq[%d]", new Object[] { paramString, Boolean.valueOf(bool2), Long.valueOf(l2) });
      return bool2;
      l1 = 0L;
      bool1 = false;
      break;
      l1 = 0L;
      bool1 = false;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/model/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */