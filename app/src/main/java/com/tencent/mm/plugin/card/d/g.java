package com.tencent.mm.plugin.card.d;

import android.text.TextUtils;
import com.tencent.mm.plugin.card.model.d;
import com.tencent.mm.sdk.platformtools.bl;
import java.util.Map;

public final class g
{
  public static String a(d paramd)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<from_username>").append(paramd.hwf).append("</from_username>");
    localStringBuilder.append("<card_id>").append(paramd.cac).append("</card_id>");
    localStringBuilder.append("<card_type>").append(paramd.huV).append("</card_type>");
    localStringBuilder.append("<from_scene>").append(paramd.cae).append("</from_scene>");
    localStringBuilder.append("<color>").append(paramd.dxh).append("</color>");
    localStringBuilder.append("<card_type_name>").append(paramd.hwg).append("</card_type_name>");
    localStringBuilder.append("<brand_name>").append(paramd.hwh).append("</brand_name>");
    if (TextUtils.isEmpty(paramd.cad)) {
      localStringBuilder.append("<card_ext></card_ext>");
    }
    for (;;)
    {
      localStringBuilder.append("<is_recommend>").append(paramd.hwi).append("</is_recommend>");
      localStringBuilder.append("<recommend_card_id>").append(paramd.hwj).append("</recommend_card_id>");
      return localStringBuilder.toString();
      localStringBuilder.append("<card_ext>").append(paramd.cad).append("</card_ext>");
    }
  }
  
  public static d xQ(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    d locald = new d();
    paramString = bl.z(paramString, "msg");
    locald.hwf = ((String)paramString.get(".msg.appmsg.carditem.from_username"));
    locald.cac = ((String)paramString.get(".msg.appmsg.carditem.card_id"));
    locald.huV = xS((String)paramString.get(".msg.appmsg.carditem.card_type"));
    locald.cae = xS((String)paramString.get(".msg.appmsg.carditem.from_scene"));
    locald.dxh = ((String)paramString.get(".msg.appmsg.carditem.color"));
    locald.hwg = ((String)paramString.get(".msg.appmsg.carditem.card_type_name"));
    locald.hwh = ((String)paramString.get(".msg.appmsg.carditem.brand_name"));
    locald.cad = ((String)paramString.get(".msg.appmsg.carditem.card_ext"));
    locald.hwi = xS((String)paramString.get(".msg.appmsg.carditem.is_recommend"));
    locald.hwj = ((String)paramString.get(".msg.appmsg.carditem.recommend_card_id"));
    return locald;
  }
  
  public static String xR(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    return (String)bl.z(paramString, "msg").get(".msg.appmsg.fromusername");
  }
  
  private static int xS(String paramString)
  {
    if ((TextUtils.isEmpty(paramString)) || (!l.xW(paramString))) {
      return 0;
    }
    return Integer.valueOf(paramString).intValue();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/card/d/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */