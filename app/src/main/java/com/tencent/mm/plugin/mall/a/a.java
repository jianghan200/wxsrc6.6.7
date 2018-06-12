package com.tencent.mm.plugin.mall.a;

import android.util.SparseArray;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.mm.plugin.wallet_core.model.mall.MallNews;
import com.tencent.mm.plugin.wallet_core.model.mall.c;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.protocal.c.aga;
import com.tencent.mm.protocal.c.agb;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
  extends l
  implements k
{
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  private String kXX;
  public ArrayList<MallFunction> kXY = null;
  public ArrayList<MallNews> kXZ = null;
  public ArrayList<com.tencent.mm.plugin.wallet_core.model.mall.a> kYa = null;
  public SparseArray<String> kYb = null;
  public int kYc = 0;
  
  public a(int paramInt, String paramString)
  {
    this(paramInt, paramString, null, null);
  }
  
  private a(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    this.kYc = paramInt;
    Object localObject1 = new b.a();
    ((b.a)localObject1).dIG = new aga();
    ((b.a)localObject1).dIH = new agb();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/getpayfunctionlist";
    ((b.a)localObject1).dIF = 495;
    ((b.a)localObject1).dII = 227;
    ((b.a)localObject1).dIJ = 1000000227;
    this.diG = ((b.a)localObject1).KT();
    aga localaga = (aga)this.diG.dID.dIL;
    localaga.rJM = paramString1;
    LinkedList localLinkedList = new LinkedList();
    Object localObject2;
    if (!bi.oW(paramString2))
    {
      localObject2 = (MallNews)c.bPK().psm.get(paramString2);
      if ((localObject2 != null) && (!bi.oW(((MallNews)localObject2).bLe)))
      {
        localObject1 = new ArrayList();
        ((List)localObject1).add(((MallNews)localObject2).bLe);
      }
    }
    while ((localObject1 != null) && (((List)localObject1).size() > 0))
    {
      localObject2 = ((List)localObject1).iterator();
      localObject1 = "";
      for (;;)
      {
        if (((Iterator)localObject2).hasNext())
        {
          String str = (String)((Iterator)localObject2).next();
          bhz localbhz = new bhz();
          localbhz.VO(str);
          localLinkedList.add(localbhz);
          localObject1 = (String)localObject1 + "; + " + str;
          continue;
          localObject1 = null;
          break;
          localObject1 = c.bPK().bPL();
          break;
        }
      }
      x.d("MicroMsg.NetSceneGetPayFunctionList", "post with list : " + (String)localObject1);
    }
    localaga.rJO = localLinkedList;
    localaga.rJN = localLinkedList.size();
    if (bi.oW(paramString3)) {}
    for (localaga.jTB = String.format("tpa_country=%s", new Object[] { Integer.valueOf(paramInt) });; localaga.jTB = String.format("%s&tpa_country=%s", new Object[] { paramString3, Integer.valueOf(paramInt) }))
    {
      this.kXX = paramString2;
      x.d("MicroMsg.NetSceneGetPayFunctionList", "telephonyNetIso " + paramString1 + " ExtInfo: " + localaga.jTB);
      return;
    }
  }
  
  public a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this(paramInt, paramString1, paramString3, String.format("appid=%s&funcid=%s&url=%s", new Object[] { paramString2, paramString3, URLEncoder.encode(paramString4, "ISO-8859-1").toString() }));
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGetPayFunctionList", "errCode " + paramInt3 + ", errMsg " + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (agb)((com.tencent.mm.ab.b)paramq).dIE.dIL;
      x.i("MicroMsg.NetSceneGetPayFunctionList", "resp.PayFunctionList wallet_regionL " + this.kYc + " " + paramq.rJP);
    }
    try
    {
      if (!bi.oW(paramq.rJP))
      {
        Object localObject = new JSONObject(paramq.rJP);
        paramq = ((JSONObject)localObject).optString("pay_func_list");
        this.kXY = com.tencent.mm.plugin.wallet_core.model.mall.b.x(new JSONArray(paramq));
        paramArrayOfByte = ((JSONObject)localObject).optString("global_activity_list");
        String str = ((JSONObject)localObject).optString("pay_banner_list");
        localObject = ((JSONObject)localObject).optString("type_info_list");
        o.bPb().b(this.kYc, paramq, paramArrayOfByte, str, (String)localObject);
        d.bbJ().kYg.clear();
      }
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    catch (JSONException paramq)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.NetSceneGetPayFunctionList", paramq, "", new Object[0]);
      }
    }
  }
  
  public final int getType()
  {
    return 495;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/mall/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */