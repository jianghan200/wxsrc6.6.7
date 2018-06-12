package com.tencent.mm.plugin.offline.a;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.afn;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.m;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
  extends m
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  private ArrayList<String> fXG;
  private String lJE;
  private String lJF;
  
  private void Q(JSONObject paramJSONObject)
  {
    this.lJE = paramJSONObject.optString("micropay_tips");
    for (;;)
    {
      int i;
      try
      {
        paramJSONObject = paramJSONObject.getJSONArray("head_url_list");
        if (paramJSONObject == null) {
          break label75;
        }
        if (paramJSONObject.length() != 0) {
          break label76;
        }
        return;
      }
      catch (JSONException paramJSONObject)
      {
        String str;
        x.printErrStackTrace("MicroMsg.NetSceneGetOffLineInfo", paramJSONObject, "", new Object[0]);
      }
      if (i < paramJSONObject.length())
      {
        str = (String)paramJSONObject.get(i);
        this.fXG.add(str);
        i += 1;
      }
      else
      {
        label75:
        return;
        label76:
        i = 0;
      }
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    if (paramInt1 != 0) {
      x.e("MicroMsg.NetSceneGetOffLineInfo", "Cmd : 606, errType = " + paramInt1 + ", errCode = " + paramInt2 + ", errMsg = " + paramString);
    }
    afn localafn = (afn)((b)paramq).dIE.dIL;
    i = paramInt1;
    j = paramInt2;
    paramq = paramString;
    if (paramInt1 == 0)
    {
      i = paramInt1;
      j = paramInt2;
      paramq = paramString;
      if (paramInt2 != 0) {}
    }
    try
    {
      if (!TextUtils.isEmpty(localafn.rJv))
      {
        paramq = new JSONObject(localafn.rJv);
        i = paramq.optInt("InitValue");
        j = paramq.optInt("FastChangedLimit");
        this.lJF = paramq.optString("guide_tips");
        com.tencent.mm.plugin.offline.c.a.uo(i);
        com.tencent.mm.plugin.offline.c.a.up(j);
        x.v("MicroMsg.NetSceneGetOffLineInfo", "initValue:" + i + " fastChangeValue:" + j);
      }
      i = paramInt1;
      j = paramInt2;
      paramq = paramString;
      if (!TextUtils.isEmpty(localafn.rJw))
      {
        Q(new JSONObject(localafn.rJw));
        paramq = paramString;
        j = paramInt2;
        i = paramInt1;
      }
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.NetSceneGetOffLineInfo", paramString, "", new Object[0]);
        i = 1000;
        j = 2;
        paramq = ad.getContext().getString(a.i.wallet_data_err);
      }
    }
    if (this.diJ != null) {
      this.diJ.a(i, j, paramq, this);
    }
  }
  
  public final int getType()
  {
    return 606;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/offline/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */