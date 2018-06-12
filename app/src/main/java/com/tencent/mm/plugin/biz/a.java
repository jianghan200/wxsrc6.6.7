package com.tencent.mm.plugin.biz;

import android.text.TextUtils;
import com.tencent.mm.ac.j;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.n.c;
import com.tencent.mm.plugin.messenger.a.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.y.l;
import com.tencent.mm.y.m;
import java.util.LinkedList;
import java.util.Map;

public final class a
  implements com.tencent.mm.plugin.biz.a.a
{
  public final String bV(String paramString1, String paramString2)
  {
    paramString1 = bl.z(paramString1, "msg");
    if (paramString1 == null)
    {
      x.e("MicroMsg.AppMsgBizHelper", "getAppMsgDyeingTempFromUser fail, values is null");
      paramString1 = null;
      if ((!bi.oW(paramString1)) || (s.hE(paramString2))) {
        break label115;
      }
    }
    for (;;)
    {
      if (!bi.oW(paramString2))
      {
        if (com.tencent.mm.y.i.gr(paramString2))
        {
          paramString1 = ((c)g.l(c.class)).rR(paramString2);
          if ((paramString1 != null) && (!TextUtils.isEmpty(paramString1.field_nickname)))
          {
            return paramString1.field_nickname;
            paramString1 = (String)paramString1.get(".msg.fromusername");
            break;
          }
        }
        return ((b)g.l(b.class)).gT(paramString2);
      }
      return "";
      label115:
      paramString2 = paramString1;
    }
  }
  
  public final boolean gr(String paramString)
  {
    return com.tencent.mm.y.i.gr(paramString);
  }
  
  public final String gs(String paramString)
  {
    return com.tencent.mm.y.i.gs(paramString);
  }
  
  public final String wR(String paramString)
  {
    Map localMap = bl.z(paramString, "msg");
    if (localMap == null)
    {
      x.e("MicroMsg.AppMsgBizHelper", "getAppMsgDyeingTempTitle fail, values is null");
      paramString = " ";
      return paramString;
    }
    int i = bi.getInt((String)localMap.get(".msg.appmsg.mmreader.template_detail.template_show_type"), 0);
    String str = bi.aG((String)localMap.get(".msg.appmsg.ext_pay_info.pay_type"), "");
    paramString = null;
    if ((str.equals("wx_f2f")) || (str.equals("wx_md"))) {
      paramString = bi.oV((String)localMap.get(".msg.appmsg.title"));
    }
    for (;;)
    {
      str = paramString;
      if (bi.oW(paramString)) {
        str = (String)localMap.get(".msg.appmsg.mmreader.category.item.title");
      }
      paramString = str;
      if (!bi.oW(str)) {
        break;
      }
      return " ";
      if (i != 0) {
        paramString = bi.oV((String)localMap.get(".msg.appmsg.mmreader.template_header.title"));
      }
    }
  }
  
  public final l wS(String paramString)
  {
    Object localObject1 = com.tencent.mm.sdk.platformtools.ay.WA(paramString);
    if (localObject1 == null) {
      return com.tencent.mm.y.i.gt(paramString);
    }
    int i = bi.getInt((String)((Map)localObject1).get(".msg.appmsg.mmreader.category.$type"), 0);
    paramString = bi.oV((String)((Map)localObject1).get(".msg.appmsg.mmreader.name"));
    int k = bi.getInt((String)((Map)localObject1).get(".msg.appmsg.mmreader.forbid_forward"), 0);
    int j = bi.getInt((String)((Map)localObject1).get(".msg.appmsg.mmreader.category.$count"), 0);
    Object localObject2 = (String)((Map)localObject1).get(".msg.commenturl");
    l locall = new l();
    locall.type = i;
    locall.name = paramString;
    locall.cGB = ((String)localObject2);
    locall.dzt = k;
    i = 0;
    if (i < j)
    {
      localObject2 = new m();
      StringBuilder localStringBuilder = new StringBuilder(".msg.appmsg.mmreader.category.item");
      if (i == 0) {}
      for (paramString = "";; paramString = String.valueOf(i))
      {
        paramString = paramString;
        ((m)localObject2).title = ((String)((Map)localObject1).get(paramString + ".title"));
        ((m)localObject2).url = ((String)((Map)localObject1).get(paramString + ".url"));
        ((m)localObject2).dzw = ((String)((Map)localObject1).get(paramString + ".shorturl"));
        ((m)localObject2).dzx = ((String)((Map)localObject1).get(paramString + ".longurl"));
        ((m)localObject2).time = bi.getLong((String)((Map)localObject1).get(paramString + ".pub_time"), 0L);
        ((m)localObject2).dzz = ((String)((Map)localObject1).get(paramString + ".tweetid"));
        ((m)localObject2).dzA = ((String)((Map)localObject1).get(paramString + ".digest"));
        ((m)localObject2).type = bi.getInt((String)((Map)localObject1).get(paramString + ".itemshowtype"), 0);
        ((m)localObject2).dzC = bi.getInt((String)((Map)localObject1).get(paramString + ".play_length"), 0);
        ((m)localObject2).dzy = ((String)((Map)localObject1).get(paramString + ".cover"));
        ((m)localObject2).dzB = bi.getInt((String)((Map)localObject1).get(paramString + ".del_flag"), 0);
        ((m)localObject2).dzD = ((String)((Map)localObject1).get(paramString + ".weapp_username"));
        ((m)localObject2).dzE = ((String)((Map)localObject1).get(paramString + ".weapp_path"));
        ((m)localObject2).dzF = bi.getInt((String)((Map)localObject1).get(paramString + ".weapp_version"), 0);
        ((m)localObject2).dzG = bi.getInt((String)((Map)localObject1).get(paramString + ".weapp_state"), 0);
        ((m)localObject2).dzH = ((String)((Map)localObject1).get(paramString + ".weapp_appid"));
        ((m)localObject2).dzI = ((String)((Map)localObject1).get(paramString + ".weapp_image_url"));
        ((m)localObject2).dzJ = ((String)((Map)localObject1).get(paramString + ".weapp_icon"));
        ((m)localObject2).dzK = ((String)((Map)localObject1).get(paramString + ".weapp_nickname"));
        ((m)localObject2).dzL = ((String)((Map)localObject1).get(paramString + ".play_url"));
        ((m)localObject2).dzM = ((String)((Map)localObject1).get(paramString + ".player"));
        ((m)localObject2).dzN = bi.getInt((String)((Map)localObject1).get(paramString + ".music_source"), 1);
        ((m)localObject2).dzO = bi.getInt((String)((Map)localObject1).get(paramString + ".pic_num"), 1);
        locall.dzs.add(localObject2);
        i += 1;
        break;
      }
    }
    locall.dwk = j.s((Map)localObject1);
    paramString = bi.oV((String)((Map)localObject1).get(".msg.fromusername"));
    if (!bi.oW(paramString))
    {
      localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(paramString).BK();
      locall.bZG = paramString;
      locall.bZH = ((String)localObject1);
    }
    return locall;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/biz/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */