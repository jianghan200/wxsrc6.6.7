package com.tencent.mm.h;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;
import org.json.JSONObject;

public final class c
{
  public int bHB;
  public int bHC;
  public String bHD;
  public String cZY;
  public String cZZ;
  public int daa;
  public String desc;
  public int showType;
  public String url;
  
  public static c eX(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    c localc = new c();
    paramString = bl.z(paramString, "e");
    if (paramString == null)
    {
      x.d("MicroMsg.BroadcastEntity", "this is not errmsg");
      return null;
    }
    localc.desc = ((String)paramString.get(".e.Content"));
    localc.url = ((String)paramString.get(".e.Url"));
    localc.bHD = ((String)paramString.get(".e.Title"));
    localc.bHC = bi.getInt((String)paramString.get(".e.Action"), 0);
    localc.showType = bi.getInt((String)paramString.get(".e.ShowType"), 0);
    localc.bHB = bi.getInt((String)paramString.get(".e.DispSec"), 30);
    localc.cZY = ((String)paramString.get(".e.Ok"));
    localc.cZZ = ((String)paramString.get(".e.Cancel"));
    localc.daa = bi.getInt((String)paramString.get("e.Countdown"), 0);
    if (fB(localc.showType)) {
      return localc;
    }
    try
    {
      JSONObject localJSONObject = new JSONObject((String)paramString.get(".e"));
      localc.desc = localJSONObject.getString("Content");
      localc.url = localJSONObject.getString("Url");
      localc.bHD = localJSONObject.getString("Title");
      localc.bHC = bi.getInt(localJSONObject.getString("Action"), 0);
      localc.showType = bi.getInt(localJSONObject.getString("ShowType"), 0);
      localc.bHB = bi.getInt(localJSONObject.getString("DispSec"), 30);
      localc.cZY = ((String)paramString.get(".e.Ok"));
      localc.cZZ = ((String)paramString.get(".e.Cancel"));
      localc.daa = bi.getInt((String)paramString.get("e.Countdown"), 0);
      boolean bool = fB(localc.showType);
      if (bool) {
        return localc;
      }
    }
    catch (Exception paramString)
    {
      x.printErrStackTrace("MicroMsg.BroadcastEntity", paramString, "", new Object[0]);
    }
    return null;
  }
  
  private static boolean fB(int paramInt)
  {
    if (paramInt == 4) {}
    while ((paramInt == 1) || (paramInt == 5) || (paramInt == 3) || (paramInt == 8)) {
      return true;
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/h/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */