package com.tencent.mm.pluginsdk.ui;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;

public final class e
{
  public int qER = -7829368;
  public boolean qES = false;
  public int qET = -1593835521;
  public boolean qEU = false;
  public boolean qEV = false;
  public int qEW = -16777216;
  public boolean qEX = false;
  public int qEY = 0;
  public boolean qEZ = false;
  private int version = 0;
  
  public e(String paramString)
  {
    paramString = bl.z(paramString, "chatbg");
    if (paramString == null)
    {
      x.e("MicroMsg.ChatBgAttr", "parse chatbgattr failed, values is null");
      return;
    }
    String str = "." + "chatbg";
    try
    {
      this.version = bi.f(Integer.valueOf((String)paramString.get(str + ".$version")));
      this.qER = ((int)bi.a(Long.valueOf(Long.parseLong((String)paramString.get(str + ".$time_color"), 16)), -7829368L));
      this.qES = bi.d(Boolean.valueOf((String)paramString.get(str + ".$time_show_shadow_color")));
      this.qET = ((int)bi.a(Long.valueOf(Long.parseLong((String)paramString.get(str + ".$time_shadow_color"), 16)), 0L));
      this.qEU = bi.d(Boolean.valueOf((String)paramString.get(str + ".$time_show_background")));
      this.qEV = bi.d(Boolean.valueOf((String)paramString.get(str + ".$time_light_background")));
      this.qEW = ((int)bi.a(Long.valueOf(Long.parseLong((String)paramString.get(str + ".$voice_second_color"), 16)), -16777216L));
      this.qEX = bi.d(Boolean.valueOf((String)paramString.get(str + ".$voice_second_show_shadow_color")));
      this.qEY = ((int)bi.a(Long.valueOf(Long.parseLong((String)paramString.get(str + ".$voice_second_shadow_color"), 16)), 0L));
      this.qEZ = bi.d(Boolean.valueOf((String)paramString.get(str + ".$voice_second_show_background")));
      return;
    }
    catch (Exception paramString)
    {
      x.e("MicroMsg.ChatBgAttr", "parse chatbgattr failed");
      x.printErrStackTrace("MicroMsg.ChatBgAttr", paramString, "", new Object[0]);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */