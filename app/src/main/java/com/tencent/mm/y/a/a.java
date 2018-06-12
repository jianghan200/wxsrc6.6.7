package com.tencent.mm.y.a;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import java.util.Map;

public final class a
{
  public String appId;
  public String content;
  private String dzQ;
  public String dzR;
  public int dzS;
  public int dzT;
  public String path;
  public String title;
  public int type;
  public String username;
  
  public static a gw(String paramString)
  {
    paramString = bl.z(paramString, "sysmsg");
    a locala = new a();
    if (paramString == null) {
      return locala;
    }
    locala.dzQ = ((String)paramString.get(".sysmsg.subscribesysmsg.content_template.template"));
    locala.title = ((String)paramString.get(".sysmsg.subscribesysmsg.content_template.link_list.link.title"));
    locala.content = locala.dzQ.replace("$wxaapp_view$", locala.title);
    locala.appId = ((String)paramString.get(".sysmsg.subscribesysmsg.content_template.link_list.link.appid"));
    locala.username = ((String)paramString.get(".sysmsg.subscribesysmsg.content_template.link_list.link.username"));
    locala.path = ((String)paramString.get(".sysmsg.subscribesysmsg.content_template.link_list.link.path"));
    locala.type = bi.getInt((String)paramString.get(".sysmsg.subscribesysmsg.content_template.link_list.link.type"), 0);
    locala.dzR = ((String)paramString.get(".sysmsg.subscribesysmsg.content_template.link_list.link.share_key"));
    locala.dzS = bi.getInt((String)paramString.get(".sysmsg.subscribesysmsg.content_template.link_list.link.forbids"), 0);
    locala.dzT = bi.getInt((String)paramString.get(".sysmsg.subscribesysmsg.content_template.link_list.link.wxaapp_type"), 1);
    return locala;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/y/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */