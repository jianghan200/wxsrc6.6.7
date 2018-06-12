package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.luckymoney.a.a;
import com.tencent.mm.storage.aa.a;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class x
  extends ab
{
  public int hUw;
  public String hUy;
  public String kKV;
  public String kKW;
  public String kLf;
  public ai kQa;
  public String kRc;
  public boolean kRd;
  public int kRe;
  public String kRf;
  public ai kRg;
  public ai kRh;
  public ai kRi;
  public int kRj = 0;
  public LinkedList<l> kRk;
  
  public x(String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("scene", "8");
    localHashMap.put("ver", paramString);
    g.Ek();
    localHashMap.put("walletType", String.valueOf(g.Ei().DT().get(339975, null)));
    F(localHashMap);
  }
  
  public x(String paramString, byte paramByte)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("ver", paramString);
    g.Ek();
    localHashMap.put("walletType", String.valueOf(g.Ei().DT().get(339975, null)));
    F(localHashMap);
  }
  
  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    if (paramInt == 0)
    {
      this.kRe = paramJSONObject.optInt("randomAmount");
      this.kRc = paramJSONObject.optString("randomWishing");
      this.hUy = paramJSONObject.optString("notice");
      this.kRf = paramJSONObject.optString("notice_url");
      boolean bool;
      if (paramJSONObject.optInt("hasCanShareHongBao") == 1) {
        bool = true;
      }
      for (;;)
      {
        this.kRd = bool;
        this.hUw = paramJSONObject.optInt("currency");
        this.kKV = paramJSONObject.optString("currencyUint");
        this.kKW = paramJSONObject.optString("currencyWording");
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "currency=" + this.hUw + ";currencyUint=" + this.kKV + ";currencyWording=" + this.kKW);
        paramString = new d();
        paramString.kPE = paramJSONObject.optString("groupHint");
        paramString.kPF = paramJSONObject.optString("personalHint");
        paramString.kKT = (paramJSONObject.optLong("totalAmount", 200000L) / 100.0D);
        paramString.kKQ = paramJSONObject.optInt("totalNum", 100);
        paramString.kKR = (paramJSONObject.optLong("perPersonMaxValue", 20000L) / 100.0D);
        paramString.kKU = (paramJSONObject.optLong("perGroupMaxValue", 20000L) / 100.0D);
        paramString.kKS = (paramJSONObject.optLong("perMinValue", 1L) / 100.0D);
        paramString.kPG = paramJSONObject.optInt("payShowBGFlag");
        paramString.hUw = this.hUw;
        paramString.kKV = this.kKV;
        paramString.kKW = this.kKW;
        paramString.kPH = paramJSONObject.optString("foreignFaqUrl");
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "foreignFaqUrl: %s", new Object[] { paramString.kPH });
        a.bat();
        Object localObject = a.bau();
        ((e)localObject).kLu = paramString;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyConfigManager", "setConfig maxTotalAmount:" + ((e)localObject).kLu.kKT + " maxTotalNum:" + ((e)localObject).kLu.kKQ + " perGroupMaxValue:" + ((e)localObject).kLu.kKU + " perMinValue:" + ((e)localObject).kLu.kKS + " perPersonMaxValue:" + ((e)localObject).kLu.kKR);
        try
        {
          paramString = new String(((e)localObject).kLu.toByteArray(), "ISO-8859-1");
          g.Ek();
          g.Ei().DT().set(356355, paramString);
          g.Ek();
          g.Ei().DT().lm(true);
          this.kRg = m.O(paramJSONObject.optJSONObject("operationHeader"));
          this.kQa = m.O(paramJSONObject.optJSONObject("operationTail"));
          this.kRh = m.O(paramJSONObject.optJSONObject("operationNext"));
          this.kRi = m.O(paramJSONObject.optJSONObject("operationMiddle"));
          paramInt = paramJSONObject.optInt("sceneSwitch");
          g.Ek();
          g.Ei().DT().a(aa.a.sPn, Integer.valueOf(paramInt));
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "sceneSwitch:" + paramInt);
          this.kRj = paramJSONObject.optInt("scenePicSwitch");
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "scenePicSwitch:" + this.kRj);
          this.kLf = paramJSONObject.optString("wishing");
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "wishing: %s", new Object[] { this.kLf });
          paramString = paramJSONObject.optJSONArray("yearMess");
          if ((paramString != null) && (paramString.length() > 0))
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "yearMessJson length:" + paramString.length());
            this.kRk = new LinkedList();
            paramInt = 0;
            while (paramInt < paramString.length())
            {
              paramJSONObject = paramString.optJSONObject(paramInt);
              localObject = new l();
              ((l)localObject).kQA = paramJSONObject.optInt("yearAmount", 0);
              ((l)localObject).kQB = paramJSONObject.optString("yearWish");
              this.kRk.add(localObject);
              paramInt += 1;
              continue;
              bool = false;
            }
          }
        }
        catch (UnsupportedEncodingException paramString)
        {
          for (;;)
          {
            com.tencent.mm.sdk.platformtools.x.w("MicroMsg.LuckyMoneyConfigManager", "save config exp, " + paramString.getLocalizedMessage());
          }
        }
        catch (IOException paramString)
        {
          for (;;)
          {
            com.tencent.mm.sdk.platformtools.x.w("MicroMsg.LuckyMoneyConfigManager", "save config exp, " + paramString.getLocalizedMessage());
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneLuckyMoneyGetConfig", "yearMessJson is empty!");
        }
      }
      return;
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneLuckyMoneyGetConfig", "hongbao operation fail, errCode:" + paramInt + ", errMsg:" + paramString);
  }
  
  public final String aBL()
  {
    return "/cgi-bin/mmpay-bin/operationwxhb";
  }
  
  public final int getType()
  {
    return 1554;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/b/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */