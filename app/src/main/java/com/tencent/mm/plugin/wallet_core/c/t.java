package com.tencent.mm.plugin.wallet_core.c;

import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.mm.plugin.wallet_core.id_verify.model.Profession;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.plugin.wallet_core.model.q;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.p;
import com.tencent.mm.wallet_core.tenpay.model.i;
import com.tencent.mm.wallet_core.ui.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class t
  extends i
{
  public String htC = null;
  public String mTimeStamp = null;
  public String mwc = null;
  private int pjA = 3;
  private int pjB;
  private int pjC;
  public Profession[] pjD = null;
  public List<ElementQuery> pjy = null;
  public ElementQuery pjz = null;
  
  public t()
  {
    this(null, null, null, null, -1, -1, (byte)0);
  }
  
  public t(String paramString1, String paramString2, PayInfo paramPayInfo)
  {
    this(paramString1, paramString2, paramPayInfo, null, -1, -1, (byte)0);
  }
  
  public t(String paramString1, String paramString2, PayInfo paramPayInfo, int paramInt)
  {
    this(paramString1, paramString2, paramPayInfo, null, -1, paramInt, (byte)0);
  }
  
  public t(String paramString1, String paramString2, PayInfo paramPayInfo, String paramString3, int paramInt1, int paramInt2)
  {
    this(paramString1, paramString2, paramPayInfo, paramString3, paramInt1, paramInt2, (byte)0);
  }
  
  private t(String paramString1, String paramString2, PayInfo paramPayInfo, String paramString3, int paramInt1, int paramInt2, byte paramByte)
  {
    this.htC = paramString2;
    this.pjA = 3;
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    a(paramPayInfo, localHashMap1, localHashMap2);
    localHashMap1.put("req_key", paramString1);
    localHashMap1.put("flag", "4");
    localHashMap1.put("card_id", paramString2);
    if (paramInt2 > 0)
    {
      localHashMap1.put("realname_scene", String.valueOf(paramInt2));
      x.i("MicroMsg.NetSenceTenPayBase", "realname_scene=%d", new Object[] { Integer.valueOf(paramInt2) });
    }
    if (paramInt1 == 8) {
      localHashMap1.put("scene", "1003");
    }
    localHashMap1.put("bank_card_tag", "3");
    localHashMap1.put("token", paramString3);
    F(localHashMap1);
    if (p.cDb())
    {
      localHashMap2.put("uuid_for_bindcard", p.cDd());
      localHashMap2.put("bindcard_scene", p.cDc());
    }
    aC(localHashMap2);
  }
  
  public final int If()
  {
    return 1505;
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    this.pjy = new ArrayList();
    Object localObject1;
    int i;
    label60:
    Object localObject2;
    ElementQuery localElementQuery;
    label483:
    String str;
    try
    {
      this.mTimeStamp = paramJSONObject.optString("time_stamp");
      paramString = paramJSONObject.optString("bank_type");
      if (!bi.oW(this.mwc))
      {
        paramString = this.mwc;
        localObject1 = paramJSONObject.getJSONArray("Array");
        i = ((JSONArray)localObject1).length();
        paramInt = 0;
        if (paramInt < i)
        {
          localObject2 = ((JSONArray)localObject1).getJSONObject(paramInt);
          localElementQuery = new ElementQuery();
          localElementQuery.dKT = ((JSONObject)localObject2);
          localElementQuery.knE = ((JSONObject)localObject2).optString("bank_name");
          localElementQuery.lMV = ((JSONObject)localObject2).optString("bank_type");
          localElementQuery.pnu = ((JSONObject)localObject2).optString("bankacc_type_name");
          localElementQuery.pnw = ((JSONObject)localObject2).optString("bank_phone");
          localElementQuery.pnz = ((JSONObject)localObject2).optString("forbid_word");
          localElementQuery.pny = ((JSONObject)localObject2).optString("bank_recommend_desc");
          localElementQuery.pnx = ((JSONObject)localObject2).optString("bank_app_user_name");
          localElementQuery.pnt = ((JSONObject)localObject2).optInt("bankacc_type", 1);
          localElementQuery.pnm = e.k((JSONObject)localObject2, "canModifyName");
          localElementQuery.pnn = e.k((JSONObject)localObject2, "canModifyCreID");
          localElementQuery.pnr = "0".equals(((JSONObject)localObject2).optString("is_sure"));
          localElementQuery.pno = "1".equals(((JSONObject)localObject2).optString("needCVV"));
          localElementQuery.pnp = "1".equals(((JSONObject)localObject2).optString("needValiDate"));
          localElementQuery.pnl = ((JSONObject)localObject2).optString("time_stamp");
          localElementQuery.pnq = ((JSONObject)localObject2).optString("uesr_name");
          localElementQuery.pnv = ((JSONObject)localObject2).optString("bank_flag");
          localElementQuery.pnA = e.k((JSONObject)localObject2, "needFirstName");
          localElementQuery.pnB = e.k((JSONObject)localObject2, "needLastName");
          localElementQuery.pnC = e.k((JSONObject)localObject2, "needCountry");
          localElementQuery.pnD = e.k((JSONObject)localObject2, "needArea");
          localElementQuery.pnE = e.k((JSONObject)localObject2, "needCity");
          localElementQuery.pnF = e.k((JSONObject)localObject2, "needAddress");
          localElementQuery.pnG = e.k((JSONObject)localObject2, "needZip");
          localElementQuery.pnH = e.k((JSONObject)localObject2, "needPhone");
          localElementQuery.pnI = e.k((JSONObject)localObject2, "needEmail");
          localElementQuery.pnL = e.k((JSONObject)localObject2, "needShowProtocol");
          localElementQuery.pnJ = ((JSONObject)localObject2).optString("support_cre_type");
          localElementQuery.pjA = ((JSONObject)localObject2).optInt("bank_card_tag", 1);
          if (localElementQuery.pjA == 1)
          {
            if (!e.k((JSONObject)localObject2, "IsSaveYfq")) {}
            for (localElementQuery.pns = 0;; localElementQuery.pns = 4)
            {
              str = ((JSONObject)localObject2).optString("support_micropay");
              if (!TextUtils.isEmpty(str)) {
                break label673;
              }
              localElementQuery.pnO = true;
              label507:
              localElementQuery.plq = ((JSONObject)localObject2).optString("arrive_type");
              localElementQuery.pnM = ((JSONObject)localObject2).optString("pre_auth_word");
              localElementQuery.pnN = ((JSONObject)localObject2).optInt("support_foreign_mobile", 0);
              if (Bankcard.dY(this.pjA, localElementQuery.pjA)) {
                this.pjy.add(localElementQuery);
              }
              if ((paramString == null) || (!paramString.equals(localElementQuery.lMV))) {
                break label971;
              }
              this.pjz = localElementQuery;
              break label971;
              if (!e.k((JSONObject)localObject2, "canReturnYfq")) {
                break;
              }
            }
            return;
          }
        }
      }
    }
    catch (JSONException paramString)
    {
      x.printErrStackTrace("MicroMsg.NetSenceTenPayBase", paramString, "", new Object[0]);
    }
    label673:
    label737:
    label971:
    label985:
    label990:
    for (;;)
    {
      localElementQuery.pns = 3;
      break label483;
      if (((JSONObject)localObject2).optInt("auth_mode") == 1)
      {
        localElementQuery.pns = 1;
        break label483;
      }
      localElementQuery.pns = 2;
      break label483;
      if ("1".equals(str))
      {
        localElementQuery.pnO = true;
        break label507;
      }
      if (!"0".equals(str)) {
        break label507;
      }
      localElementQuery.pnO = false;
      break label507;
      paramString = new SparseArray();
      localObject1 = paramJSONObject.getJSONArray("cre_type_map");
      i = ((JSONArray)localObject1).length();
      paramInt = 0;
      if (paramInt < i)
      {
        localObject2 = ((JSONArray)localObject1).getJSONObject(paramInt);
        int j = ((JSONObject)localObject2).optInt("key", 0);
        if (j > 0) {
          paramString.put(j, ((JSONObject)localObject2).getString("val"));
        }
      }
      else
      {
        localObject1 = o.bPe();
        localObject2 = this.pjy;
        ((q)localObject1).pqQ = paramString;
        ((q)localObject1).pjy = ((List)localObject2);
        this.pjB = paramJSONObject.optInt("need_area");
        this.pjC = paramJSONObject.optInt("need_profession");
        if ((this.pjz != null) && (this.pjz.pjA != 1))
        {
          x.i("MicroMsg.NetSenceTenPayBase", "oversea card, no need area and profession");
          this.pjB = 0;
          this.pjC = 0;
        }
        paramString = paramJSONObject.optJSONArray("profession_array");
        if (paramString == null) {
          continue;
        }
        this.pjD = new Profession[paramString.length()];
        paramInt = 0;
      }
      for (;;)
      {
        if (paramInt >= paramString.length()) {
          break label990;
        }
        paramJSONObject = paramString.optJSONObject(paramInt);
        if (paramJSONObject != null)
        {
          localObject1 = paramJSONObject.optString("profession_name");
          i = paramJSONObject.optInt("profession_type");
          if (!bi.oW((String)localObject1))
          {
            paramJSONObject = new Profession((String)localObject1, i);
            this.pjD[paramInt] = paramJSONObject;
          }
          else
          {
            x.i("MicroMsg.NetSenceTenPayBase", "empty profession_name!");
            break label985;
            break;
            paramInt += 1;
            break label60;
            paramInt += 1;
            break label737;
          }
        }
        paramInt += 1;
      }
    }
  }
  
  public final int aBO()
  {
    return 73;
  }
  
  public final boolean bOl()
  {
    return this.pjB == 1;
  }
  
  public final boolean bOm()
  {
    return this.pjC == 1;
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/elementquerynew";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */