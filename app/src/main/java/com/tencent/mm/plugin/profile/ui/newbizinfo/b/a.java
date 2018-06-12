package com.tencent.mm.plugin.profile.ui.newbizinfo.b;

import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class a
{
  public String bgn;
  public String jmW;
  public String lZd;
  public int lZe;
  public String userName;
  
  public static a W(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.BizAccount", "json is null, err");
      return null;
    }
    a locala = new a();
    try
    {
      locala.userName = paramJSONObject.optString("UserName");
      locala.bgn = paramJSONObject.optString("NickName");
      locala.jmW = paramJSONObject.optString("HeadImgUrl");
      locala.lZd = paramJSONObject.optString("FriendSubscribeDesc");
      locala.lZe = paramJSONObject.optInt("IsSubscribed");
      return locala;
    }
    catch (Exception paramJSONObject)
    {
      x.k("MicroMsg.BizAccount", "", new Object[] { paramJSONObject });
    }
    return locala;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/newbizinfo/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */