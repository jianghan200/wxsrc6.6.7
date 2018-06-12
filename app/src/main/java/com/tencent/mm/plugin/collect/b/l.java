package com.tencent.mm.plugin.collect.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.atm;
import com.tencent.mm.protocal.c.ls;
import com.tencent.mm.protocal.c.lt;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class l
  extends com.tencent.mm.ab.l
  implements k
{
  private final String TAG = "MicroMsg.NetSceneF2fQrcode";
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public lt hUl;
  
  public l()
  {
    b.a locala = new b.a();
    locala.dIG = new ls();
    locala.dIH = new lt();
    locala.dIF = 1588;
    locala.uri = "/cgi-bin/mmpay-bin/f2fqrcode";
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
  }
  
  private static JSONObject a(atm paramatm)
  {
    if ((paramatm != null) && (!bi.oW(paramatm.bSc))) {}
    for (int i = 1; i == 0; i = 0)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NetSceneF2fQrcode", "empty menu item");
      return null;
    }
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("type", paramatm.type);
      localJSONObject.put("wording", paramatm.bSc);
      localJSONObject.put("url", paramatm.url);
      localJSONObject.put("waapp_username", paramatm.rWQ);
      localJSONObject.put("waapp_path", paramatm.rWR);
      return localJSONObject;
    }
    catch (JSONException paramatm)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.NetSceneF2fQrcode", paramatm, "", new Object[0]);
    }
    return null;
  }
  
  private static JSONArray aJ(List<atm> paramList)
  {
    JSONArray localJSONArray = new JSONArray();
    if ((paramList == null) || (paramList.size() == 0))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NetSceneF2fQrcode", "empty menu items");
      return null;
    }
    int i = 0;
    try
    {
      while (i < paramList.size())
      {
        JSONObject localJSONObject = a((atm)paramList.get(i));
        if (localJSONObject != null) {
          localJSONArray.put(i, localJSONObject);
        }
        i += 1;
      }
      return localJSONArray;
    }
    catch (JSONException paramList)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.NetSceneF2fQrcode", paramList, "", new Object[0]);
    }
    return null;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    this.hUl = ((lt)((b)paramq).dIE.dIL);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneF2fQrcode", "errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneF2fQrcode", "payurl: %s, true_name: %s, bottom_icon_url: %s", new Object[] { this.hUl.url, this.hUl.plj, this.hUl.rpP });
    if (!bi.oW(this.hUl.url))
    {
      g.Ek();
      g.Ei().DT().a(aa.a.sYo, this.hUl.url);
    }
    if (!bi.oW(this.hUl.plj))
    {
      g.Ek();
      g.Ei().DT().a(aa.a.sYp, this.hUl.plj);
    }
    g.Ek();
    g.Ei().DT().a(aa.a.sYr, this.hUl.rpP);
    paramq = a(this.hUl.rpO);
    paramArrayOfByte = aJ(this.hUl.rpN);
    if (paramq != null)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneF2fQrcode", "bottom: %s", new Object[] { paramq.toString() });
      g.Ek();
      g.Ei().DT().a(aa.a.sYq, paramq.toString());
    }
    if (paramArrayOfByte != null)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneF2fQrcode", "upright: %s", new Object[] { paramArrayOfByte.toString() });
      g.Ek();
      g.Ei().DT().a(aa.a.sYs, paramArrayOfByte.toString());
    }
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1588;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/collect/b/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */