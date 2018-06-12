package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONException;
import org.json.JSONObject;

public final class f
{
  public int pmu;
  public String pmv;
  public String pmw;
  public String pmx;
  public String pmy;
  public String pmz;
  
  public static f OU(String paramString)
  {
    if (!bi.oW(paramString)) {
      try
      {
        paramString = new JSONObject(paramString);
        f localf = new f();
        localf.pmu = paramString.optInt("menu_jump_type", -1);
        localf.pmv = paramString.optString("menu_jump_url", "");
        localf.pmw = paramString.optString("menu_username", "");
        localf.pmx = paramString.optString("menu_path", "");
        localf.pmy = paramString.optString("menu_title", "");
        localf.pmz = paramString.optString("menu_icon_url", "");
        x.i("BindCardMenu", "parse bind card menu, type: %s, title: %s", new Object[] { Integer.valueOf(localf.pmu), localf.pmy });
        return localf;
      }
      catch (JSONException paramString)
      {
        x.printErrStackTrace("BindCardMenu", paramString, "", new Object[0]);
      }
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */