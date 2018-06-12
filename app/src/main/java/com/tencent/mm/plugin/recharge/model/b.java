package com.tencent.mm.plugin.recharge.model;

import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
{
  public static String Km(String paramString)
  {
    if (paramString == null) {
      return "";
    }
    paramString = new StringBuilder(paramString.replaceAll(" ", ""));
    int i = paramString.length();
    if (i >= 4)
    {
      paramString.insert(3, ' ');
      if (i >= 8) {
        paramString.insert(8, ' ');
      }
      return paramString.toString();
    }
    return paramString.toString();
  }
  
  public static ArrayList<MallRechargeProduct> a(String paramString, JSONArray paramJSONArray)
  {
    if (paramJSONArray != null) {}
    try
    {
      ArrayList localArrayList2 = new ArrayList();
      int j = paramJSONArray.length();
      int i = 0;
      for (;;)
      {
        localArrayList1 = localArrayList2;
        if (i >= j) {
          break;
        }
        localArrayList2.add(d(paramString, paramJSONArray.getJSONObject(i)));
        i += 1;
      }
      ArrayList localArrayList1 = null;
      return localArrayList1;
    }
    catch (JSONException paramString)
    {
      x.printErrStackTrace("MicroMsg.MallLogic", paramString, "", new Object[0]);
    }
    return null;
  }
  
  public static MallRechargeProduct d(String paramString, JSONObject paramJSONObject)
  {
    MallRechargeProduct localMallRechargeProduct;
    if (paramJSONObject.optInt("need_getlatestinfo", 1) == 1)
    {
      bool = true;
      localMallRechargeProduct = new MallRechargeProduct(bool);
      localMallRechargeProduct.moy = paramString;
      localMallRechargeProduct.bKk = paramJSONObject.getString("product_id");
      localMallRechargeProduct.ioy = paramJSONObject.getString("product_name");
      localMallRechargeProduct.moz = paramJSONObject.optString("product_desc");
      localMallRechargeProduct.moA = (paramJSONObject.getInt("product_min_price") / 100.0F);
      localMallRechargeProduct.moB = (paramJSONObject.getInt("product_max_price") / 100.0F);
      localMallRechargeProduct.appId = paramJSONObject.optString("app_id");
      if (paramJSONObject.getInt("is_infinite") != 1) {
        break label173;
      }
      bool = true;
      label107:
      localMallRechargeProduct.moC = bool;
      localMallRechargeProduct.moD = paramJSONObject.getInt("left_count");
      localMallRechargeProduct.moE = paramJSONObject.getInt("discount");
      if (paramJSONObject.optInt("is_default_choose", 0) != 1) {
        break label178;
      }
    }
    label173:
    label178:
    for (boolean bool = true;; bool = false)
    {
      localMallRechargeProduct.isDefault = bool;
      localMallRechargeProduct.moH = true;
      localMallRechargeProduct.moF = paramJSONObject.optInt("product_type", 0);
      return localMallRechargeProduct;
      bool = false;
      break;
      bool = false;
      break label107;
    }
  }
  
  public static String pK(String paramString)
  {
    if (paramString == null) {
      paramString = null;
    }
    String str;
    do
    {
      return paramString;
      str = paramString.replaceAll("\\D", "");
      paramString = str;
    } while (!str.startsWith("86"));
    return str.substring(2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/recharge/model/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */