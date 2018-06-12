package com.tencent.mm.plugin.profile.ui.newbizinfo.b;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b
{
  public List<String> dhI;
  public String fIa;
  public String lZf;
  public int lZg;
  public List<String> lZh;
  public String lZi;
  public String lZj;
  public String lZk;
  public int status;
  public String title;
  public int type;
  
  public static b X(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.MessageInfo", "json is null, err");
      return null;
    }
    b localb = new b();
    for (;;)
    {
      int i;
      try
      {
        localb.title = paramJSONObject.optString("Title");
        localb.fIa = paramJSONObject.optString("CoverImgUrl");
        localb.lZf = paramJSONObject.optString("ArticleUrl");
        localb.lZg = paramJSONObject.optInt("IsOriginalArticle", 0);
        localb.lZh = new ArrayList();
        localb.dhI = new ArrayList();
        JSONArray localJSONArray = paramJSONObject.optJSONArray("UserInfoList");
        if (localJSONArray != null)
        {
          i = 0;
          if (i < localJSONArray.length())
          {
            Object localObject = localJSONArray.optJSONObject(i);
            String str = ((JSONObject)localObject).optString("HeadImgUrl");
            localObject = ((JSONObject)localObject).optString("UserName");
            if ((bi.oW(str)) || (bi.oW((String)localObject))) {
              break label240;
            }
            localb.lZh.add(str);
            localb.dhI.add(localObject);
            break label240;
          }
        }
        localb.lZi = paramJSONObject.optString("UserInfoListDesc");
        localb.status = paramJSONObject.optInt("Status");
        localb.type = paramJSONObject.optInt("Type");
        localb.lZj = paramJSONObject.optString("AppMsgId");
        localb.lZk = paramJSONObject.optString("ItemIndex");
        return localb;
      }
      catch (Exception paramJSONObject)
      {
        x.printErrStackTrace("MicroMsg.MessageInfo", paramJSONObject, "", new Object[0]);
        return localb;
      }
      label240:
      i += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/newbizinfo/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */