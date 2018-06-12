package com.tencent.mm.plugin.wallet_core.d;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.AssetManager;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.wallet_core.c.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.http.util.EncodingUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
{
  private static final String hwK = com.tencent.mm.compatible.util.e.bnE + "wallet";
  private static Map<String, String> psu = null;
  
  public static String JC(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.WalletBankLogoStorage", "getStoragePath: but url is null");
      return null;
    }
    return String.format("%s/%s", new Object[] { hwK, com.tencent.mm.a.g.u(paramString.getBytes()) });
  }
  
  public static boolean Pi(String paramString)
  {
    try
    {
      if (psu == null) {
        psu = new HashMap();
      }
      x.d("MicroMsg.WalletBankLogoStorage", "bank logo:" + paramString);
      SharedPreferences.Editor localEditor = ad.getContext().getSharedPreferences("bank_logo", 0).edit();
      JSONArray localJSONArray = new JSONObject(paramString).getJSONArray("bank_urls_list");
      int j = localJSONArray.length();
      int i = 0;
      if (i < j)
      {
        Object localObject = localJSONArray.getJSONObject(i);
        if (q.GS()) {}
        for (paramString = ((JSONObject)localObject).optString("bank_desc");; paramString = ((JSONObject)localObject).optString("bank_type"))
        {
          localObject = ((JSONObject)localObject).toString();
          if ((bi.oW(paramString)) || (bi.oW((String)localObject))) {
            break label164;
          }
          localEditor.putString(paramString, (String)localObject);
          psu.put(paramString, localObject);
          i += 1;
          break;
        }
      }
      label164:
      localEditor.commit();
      x.d("MicroMsg.WalletBankLogoStorage", "update BankLogo config file. success!");
      return true;
    }
    catch (Exception paramString)
    {
      x.e("MicroMsg.WalletBankLogoStorage", "parse band logo error. %s", new Object[] { paramString.getMessage() });
      x.printErrStackTrace("MicroMsg.WalletBankLogoStorage", paramString, "", new Object[0]);
    }
    return false;
  }
  
  public static com.tencent.mm.plugin.wallet_core.model.e Pj(String paramString)
  {
    if (psu == null) {
      bPQ();
    }
    if (!bi.oW((String)psu.get(paramString))) {}
    for (int i = 1; i == 0; i = 0) {
      return null;
    }
    Object localObject = (String)psu.get(paramString);
    if (!bi.oW((String)localObject))
    {
      paramString = new com.tencent.mm.plugin.wallet_core.model.e();
      try
      {
        localObject = new JSONObject((String)localObject);
        long l = ((JSONObject)localObject).optLong("timestamp", 0L);
        paramString.lCU = ((JSONObject)localObject).getString("logo2x_url");
        paramString.pmn = ((JSONObject)localObject).getString("bg2x_url");
        paramString.pmo = ((JSONObject)localObject).getString("wl2x_url");
        if (System.currentTimeMillis() / 1000L - l > 7200L) {}
        for (boolean bool = true;; bool = false)
        {
          paramString.pmt = bool;
          paramString.pmp = JC(paramString.lCU);
          paramString.mcD = ((JSONObject)localObject).optString("bank_name_pinyin", "");
          paramString.timestamp = l;
          return paramString;
        }
        return null;
      }
      catch (JSONException paramString)
      {
        x.printErrStackTrace("MicroMsg.WalletBankLogoStorage", paramString, "", new Object[0]);
        return null;
      }
    }
  }
  
  private static com.tencent.mm.plugin.wallet_core.model.e aQ(Context paramContext, String paramString)
  {
    boolean bool2 = true;
    Object localObject1;
    Object localObject2;
    int i;
    if (psu == null)
    {
      bPQ();
      localObject1 = (String)psu.get(paramString);
      if (!bi.oW((String)localObject1)) {
        break label384;
      }
      com.tencent.mm.kernel.g.Ek();
      if (com.tencent.mm.kernel.g.Ei().isSDCardAvailable())
      {
        localObject2 = new LinkedList();
        ((LinkedList)localObject2).add(paramString);
        localObject2 = new c((LinkedList)localObject2);
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Eh().dpP.a((l)localObject2, 0);
      }
      Pi(aR(paramContext, "config/bank_logo.xml"));
      if (psu == null) {
        break label379;
      }
      localObject1 = (String)psu.get(paramString);
      i = 1;
    }
    for (;;)
    {
      if (!bi.oW((String)localObject1)) {
        paramContext = new com.tencent.mm.plugin.wallet_core.model.e();
      }
      for (;;)
      {
        try
        {
          paramString = new JSONObject((String)localObject1);
          long l = paramString.optLong("timestamp", 0L);
          paramContext.lCU = paramString.getString("logo2x_url");
          paramContext.pmn = paramString.getString("bg2x_url");
          paramContext.pmo = paramString.getString("wl2x_url");
          boolean bool1 = bool2;
          if (i == 0)
          {
            if (System.currentTimeMillis() / 1000L - l > 7200L) {
              bool1 = bool2;
            }
          }
          else
          {
            paramContext.pmt = bool1;
            paramContext.pmp = JC(paramContext.lCU);
            paramContext.mcD = paramString.optString("bank_name_pinyin", "");
            paramContext.timestamp = l;
            return paramContext;
            localObject2 = (String)psu.get(paramString);
            localObject1 = localObject2;
            if (localObject2 != null) {
              break;
            }
            x.i("MicroMsg.WalletBankLogoStorage", "can not get from bankLogoCache %s", new Object[] { paramString });
            localObject2 = ad.getContext().getSharedPreferences("bank_logo", 0).getString(paramString, "");
            localObject1 = localObject2;
            if (localObject2 == null) {
              break;
            }
            x.w("MicroMsg.WalletBankLogoStorage", "get from sp %s", new Object[] { paramString });
            psu.put(paramString, localObject2);
            localObject1 = localObject2;
            break;
          }
          bool1 = false;
          continue;
          paramContext = null;
        }
        catch (JSONException paramContext)
        {
          x.printErrStackTrace("MicroMsg.WalletBankLogoStorage", paramContext, "", new Object[0]);
          return null;
        }
      }
      label379:
      i = 1;
      continue;
      label384:
      i = 0;
    }
  }
  
  private static String aR(Context paramContext, String paramString)
  {
    String str = "";
    Object localObject = null;
    Context localContext = null;
    for (;;)
    {
      try
      {
        paramContext = paramContext.getAssets().open(paramString);
        localContext = paramContext;
        localObject = paramContext;
        paramString = new byte[paramContext.available()];
        localContext = paramContext;
        localObject = paramContext;
        paramContext.read(paramString);
        localContext = paramContext;
        localObject = paramContext;
        paramString = EncodingUtils.getString(paramString, "UTF-8");
        localObject = paramString;
      }
      catch (Exception paramContext)
      {
        localObject = localContext;
        x.printErrStackTrace("MicroMsg.WalletBankLogoStorage", paramContext, "getFromAssets", new Object[0]);
        localObject = str;
        if (localContext == null) {
          continue;
        }
        try
        {
          localContext.close();
          return "";
        }
        catch (Exception paramContext)
        {
          x.printErrStackTrace("MicroMsg.WalletBankLogoStorage", paramContext, "close", new Object[0]);
          return "";
        }
      }
      finally
      {
        if (localObject == null) {
          break label136;
        }
      }
      try
      {
        paramContext.close();
        localObject = paramString;
        return (String)localObject;
      }
      catch (Exception paramContext)
      {
        x.printErrStackTrace("MicroMsg.WalletBankLogoStorage", paramContext, "close", new Object[0]);
        return paramString;
      }
    }
    try
    {
      ((InputStream)localObject).close();
      label136:
      throw paramContext;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.WalletBankLogoStorage", paramString, "close", new Object[0]);
      }
    }
  }
  
  public static boolean aj(LinkedList<String> paramLinkedList)
  {
    long l = System.currentTimeMillis() / 1000L;
    try
    {
      if (psu == null) {
        psu = new HashMap();
      }
      SharedPreferences.Editor localEditor = ad.getContext().getSharedPreferences("bank_logo", 0).edit();
      int j = paramLinkedList.size();
      int i = 0;
      if (i < j)
      {
        Object localObject = new JSONObject((String)paramLinkedList.get(i));
        if (q.GS()) {}
        for (String str = ((JSONObject)localObject).optString("bank_desc");; str = ((JSONObject)localObject).optString("bank_type"))
        {
          ((JSONObject)localObject).put("timestamp", l);
          localObject = ((JSONObject)localObject).toString();
          if ((bi.oW(str)) || (bi.oW((String)localObject))) {
            break label160;
          }
          localEditor.putString(str, (String)localObject);
          psu.put(str, localObject);
          i += 1;
          break;
        }
      }
      label160:
      localEditor.commit();
      x.d("MicroMsg.WalletBankLogoStorage", "update BankLogo config file. success!");
      return true;
    }
    catch (Exception paramLinkedList)
    {
      x.e("MicroMsg.WalletBankLogoStorage", "parse band logo error. %s", new Object[] { paramLinkedList.getMessage() });
      x.printErrStackTrace("MicroMsg.WalletBankLogoStorage", paramLinkedList, "", new Object[0]);
    }
    return false;
  }
  
  private static void bPQ()
  {
    psu = new HashMap();
    Iterator localIterator = ad.getContext().getSharedPreferences("bank_logo", 0).getAll().entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      psu.put(localEntry.getKey(), (String)localEntry.getValue());
    }
  }
  
  public static String bPR()
  {
    return hwK;
  }
  
  public static com.tencent.mm.plugin.wallet_core.model.e h(Context paramContext, String paramString, boolean paramBoolean)
  {
    Object localObject;
    if (!paramBoolean) {
      localObject = aQ(paramContext, paramString);
    }
    com.tencent.mm.plugin.wallet_core.model.e locale;
    do
    {
      do
      {
        return (com.tencent.mm.plugin.wallet_core.model.e)localObject;
        localObject = null;
      } while (!"CITIC_CREDIT".equals(paramString));
      locale = new com.tencent.mm.plugin.wallet_core.model.e();
      locale.pmr = a.e.wallet_bankcard_white_bg;
      locale.pms = a.e.wallet_bankcard_wxcredit_citic_water_mask;
      paramContext = aQ(paramContext, paramString);
      localObject = locale;
    } while (paramContext == null);
    locale.lCU = paramContext.lCU;
    return locale;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */