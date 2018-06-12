package com.tencent.mm.plugin.product.b;

import com.tencent.mm.plugin.product.c.a;
import com.tencent.mm.plugin.product.c.c;
import com.tencent.mm.plugin.product.c.e;
import com.tencent.mm.plugin.product.c.f;
import com.tencent.mm.plugin.product.c.h;
import com.tencent.mm.plugin.product.c.j;
import com.tencent.mm.plugin.product.c.k;
import com.tencent.mm.plugin.product.c.l;
import com.tencent.mm.plugin.product.c.n;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class m
{
  public String lRl;
  public int lRm;
  public int lRn = Integer.MAX_VALUE;
  public int lRo = Integer.MAX_VALUE;
  public c lRp;
  public n lRq;
  public LinkedList<l> lRr = new LinkedList();
  public f lRs;
  public String lRt;
  public String lRu;
  public String lRv;
  public int status = 6;
  
  public static m a(m paramm, String paramString)
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    int j;
    int i;
    label260:
    label297:
    label326:
    int k;
    Object localObject4;
    int m;
    Object localObject5;
    if (paramm == null)
    {
      paramm = new m();
      try
      {
        paramString = new JSONObject(paramString);
        paramm.lRl = paramString.getString("product_id");
        paramm.lRm = paramString.getInt("product_type");
        paramm.lRn = paramString.optInt("quantity", Integer.MAX_VALUE);
        paramm.lRo = paramString.optInt("left_buy_quantity", Integer.MAX_VALUE);
        paramm.status = paramString.optInt("status", 6);
        localObject1 = paramString.optJSONObject("ext_attr");
        if (localObject1 != null)
        {
          paramm.lRs = new f();
          localObject1 = ((JSONObject)localObject1).optJSONObject("product_ext");
          if (localObject1 == null) {
            break label297;
          }
          localObject2 = paramm.lRs;
          localObject3 = new j();
          ((j)localObject3).bWA = ((JSONObject)localObject1).getInt("flag");
          ((f)localObject2).lRN = ((j)localObject3);
        }
        for (;;)
        {
          localObject1 = paramString.optJSONObject("base_attr");
          if (localObject1 == null) {
            break label864;
          }
          paramm.lRp = new c();
          paramm.lRp.name = ((JSONObject)localObject1).getString("name");
          paramm.lRp.lRA = ((JSONObject)localObject1).getInt("ori_price");
          paramm.lRp.lRB = ((JSONObject)localObject1).getInt("up_price");
          paramm.lRp.lRC = ((JSONObject)localObject1).getInt("low_price");
          paramm.lRp.lRD = new LinkedList();
          localObject2 = ((JSONObject)localObject1).getJSONArray("img_info");
          j = ((JSONArray)localObject2).length();
          i = 0;
          if (i >= j) {
            break;
          }
          localObject3 = ((JSONArray)localObject2).getString(i);
          if (bi.oW((String)localObject3)) {
            break label1235;
          }
          paramm.lRp.lRD.add(localObject3);
          break label1235;
          paramm.lRs.lRO = paramString.optString("ext_attr");
        }
        return paramm;
      }
      catch (JSONException paramString)
      {
        x.printErrStackTrace("MicroMsg.ProductInfo", paramString, "", new Object[0]);
      }
      paramm.lRp.dzA = ((JSONObject)localObject1).getString("digest");
      paramm.lRp.lNV = ((JSONObject)localObject1).getString("fee_type");
      paramm.lRp.detail = ((JSONObject)localObject1).getString("detail");
      localObject2 = ((JSONObject)localObject1).optJSONObject("share_info");
      if (localObject2 != null)
      {
        paramm.lRp.lRL = new k();
        paramm.lRp.lRL.lMY = ((JSONObject)localObject2).optString("icon_url");
        paramm.lRp.lRL.url = ((JSONObject)localObject2).optString("url");
      }
      localObject2 = ((JSONObject)localObject1).optJSONArray("sku_table");
      if (localObject2 != null)
      {
        paramm.lRp.lRJ = new LinkedList();
        k = ((JSONArray)localObject2).length();
        i = 0;
        while (i < k)
        {
          localObject4 = ((JSONArray)localObject2).getJSONObject(i);
          localObject3 = new com.tencent.mm.plugin.product.c.m();
          ((com.tencent.mm.plugin.product.c.m)localObject3).lRU = ((JSONObject)localObject4).getString("id");
          ((com.tencent.mm.plugin.product.c.m)localObject3).lRV = ((JSONObject)localObject4).getString("name");
          ((com.tencent.mm.plugin.product.c.m)localObject3).lRW = new LinkedList();
          localObject4 = ((JSONObject)localObject4).getJSONArray("value_list");
          m = ((JSONArray)localObject4).length();
          j = 0;
          while (j < m)
          {
            localObject5 = ((JSONArray)localObject4).getJSONObject(j);
            h localh = new h();
            localh.id = ((JSONObject)localObject5).getString("id");
            localh.name = ((JSONObject)localObject5).getString("name");
            localh.lRP = true;
            ((com.tencent.mm.plugin.product.c.m)localObject3).lRW.add(localh);
            j += 1;
          }
          paramm.lRp.lRJ.add(localObject3);
          i += 1;
        }
      }
      localObject1 = ((JSONObject)localObject1).optJSONArray("actiongroup_attr");
      if (localObject1 != null)
      {
        paramm.lRp.lRK = new LinkedList();
        k = ((JSONArray)localObject1).length();
        i = 0;
      }
    }
    for (;;)
    {
      if (i < k)
      {
        localObject2 = ((JSONArray)localObject1).getJSONObject(i);
        localObject3 = new a();
        ((a)localObject3).jPe = ((JSONObject)localObject2).getString("name");
        ((a)localObject3).hcE = 0;
        if (!bi.oW(((a)localObject3).jPe)) {
          paramm.lRp.lRK.add(localObject3);
        }
        localObject2 = ((JSONObject)localObject2).getJSONArray("action_list");
        m = ((JSONArray)localObject2).length();
        j = 0;
        while (j < m)
        {
          localObject3 = ((JSONArray)localObject2).getJSONObject(j);
          localObject4 = new a();
          ((a)localObject4).jPe = ((JSONObject)localObject3).getString("name");
          ((a)localObject4).lRx = ((JSONObject)localObject3).getString("tips");
          ((a)localObject4).hcE = ((JSONObject)localObject3).getInt("type");
          ((a)localObject4).jSA = ((JSONObject)localObject3).getString("content");
          ((a)localObject4).jPG = ((JSONObject)localObject3).getString("icon_url");
          paramm.lRp.lRK.add(localObject4);
          j += 1;
        }
      }
      label864:
      localObject1 = paramString.optJSONArray("available_sku_list");
      if (localObject1 != null)
      {
        k = ((JSONArray)localObject1).length();
        paramm.lRr = new LinkedList();
        i = 0;
        while (i < k)
        {
          localObject3 = ((JSONArray)localObject1).getJSONObject(i);
          localObject2 = new l();
          ((l)localObject2).lRR = ((JSONObject)localObject3).getString("id_info");
          ((l)localObject2).lRS = ((JSONObject)localObject3).getInt("price");
          ((l)localObject2).lRn = ((JSONObject)localObject3).getInt("quantity");
          ((l)localObject2).url = ((JSONObject)localObject3).getString("icon_url");
          localObject3 = ((JSONObject)localObject3).getJSONArray("express_fee");
          m = ((JSONArray)localObject3).length();
          ((l)localObject2).lRT = new LinkedList();
          j = 0;
          while (j < m)
          {
            localObject4 = ((JSONArray)localObject3).getJSONObject(j);
            localObject5 = new e();
            ((e)localObject5).id = ((JSONObject)localObject4).getInt("id");
            ((e)localObject5).name = ((JSONObject)localObject4).getString("name");
            ((e)localObject5).value = ((JSONObject)localObject4).getInt("price");
            ((l)localObject2).lRT.add(localObject5);
            j += 1;
          }
          paramm.lRr.add(localObject2);
          i += 1;
        }
      }
      localObject1 = paramString.optJSONObject("seller_attr");
      if (localObject1 != null)
      {
        paramm.lRq = new n();
        paramm.lRq.bPS = ((JSONObject)localObject1).getString("appid");
        paramm.lRq.name = ((JSONObject)localObject1).getString("name");
        paramm.lRq.username = ((JSONObject)localObject1).getString("username");
        paramm.lRq.lRX = ((JSONObject)localObject1).optString("logo");
        paramm.lRq.bWA = ((JSONObject)localObject1).optInt("flag", 0);
      }
      paramString = paramString.optJSONObject("oss_info");
      if (paramString == null) {
        break label326;
      }
      paramm.lRu = paramString.optString("self_buy_button_word");
      paramm.lRv = paramString.optString("product_mixed_h5_html");
      return paramm;
      break;
      label1235:
      i += 1;
      break label260;
      i += 1;
    }
  }
  
  public static m b(m paramm, String paramString)
  {
    int i = 0;
    m localm = paramm;
    if (paramm == null) {
      localm = new m();
    }
    paramString = bl.z(paramString, "mallProductInfo");
    if (paramString == null) {
      return null;
    }
    localm.lRl = bi.oV((String)paramString.get(".mallProductInfo.id"));
    localm.lRm = bi.getInt((String)paramString.get(".mallProductInfo.type"), 0);
    localm.lRp = new c();
    localm.lRp.name = bi.oV((String)paramString.get(".mallProductInfo.name"));
    localm.lRp.dzA = bi.oV((String)paramString.get(".mallProductInfo.digest"));
    localm.lRp.lRB = bi.getInt((String)paramString.get(".mallProductInfo.highPrice"), 0);
    localm.lRp.lRC = bi.getInt((String)paramString.get(".mallProductInfo.lowPrice"), 0);
    localm.lRp.lRA = bi.getInt((String)paramString.get(".mallProductInfo.originPrice"), 0);
    localm.lRt = bi.oV((String)paramString.get(".mallProductInfo.sourceUrl"));
    int j = bi.getInt((String)paramString.get(".mallProductInfo.imgCount"), 0);
    if (j > 0)
    {
      localm.lRp.lRD = new LinkedList();
      if (i < j)
      {
        if (i == 0) {}
        for (paramm = bi.oV((String)paramString.get(".mallProductInfo.imgList.imgUrl"));; paramm = bi.oV((String)paramString.get(".mallProductInfo.imgList.imgUrl" + i)))
        {
          if (!bi.oW(paramm)) {
            localm.lRp.lRD.add(paramm);
          }
          i += 1;
          break;
        }
      }
    }
    localm.lRp.lRL = new k();
    localm.lRp.lRL.url = bi.oV((String)paramString.get(".mallProductInfo.shareInfo.shareUrl"));
    localm.lRp.lRL.lMY = bi.oV((String)paramString.get(".mallProductInfo.shareInfo.shareThumbUrl"));
    localm.lRq = new n();
    localm.lRq.bPS = bi.oV((String)paramString.get(".mallProductInfo.sellerInfo.appID"));
    localm.lRq.name = bi.oV((String)paramString.get(".mallProductInfo.sellerInfo.appName"));
    localm.lRq.username = bi.oV((String)paramString.get(".mallProductInfo.sellerInfo.usrName"));
    return localm;
  }
  
  public final String bnb()
  {
    if ((this.lRp != null) && (this.lRp.lRL != null) && (!bi.oW(this.lRp.lRL.lMY))) {
      return this.lRp.lRL.lMY;
    }
    if ((this.lRp != null) && (this.lRp.lRD != null) && (this.lRp.lRD.size() > 0)) {
      return (String)this.lRp.lRD.get(0);
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/product/b/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */