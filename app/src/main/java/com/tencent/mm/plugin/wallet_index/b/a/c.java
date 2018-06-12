package com.tencent.mm.plugin.wallet_index.b.a;

import java.util.ArrayList;
import org.json.JSONObject;

public final class c
{
  public String eIe;
  public String iiv;
  String mPackageName;
  public String ogj;
  String pCE;
  public String pCF;
  long pCG;
  int pCH;
  public String pCI;
  public String pCJ;
  public String pCK;
  public String pCL;
  
  public c(String paramString1, String paramString2, String paramString3)
  {
    this.pCE = paramString1;
    this.pCJ = paramString2;
    paramString1 = new JSONObject(this.pCJ);
    this.pCF = paramString1.optString("orderId");
    this.mPackageName = paramString1.optString("packageName");
    this.iiv = paramString1.optString("productId");
    this.pCG = paramString1.optLong("purchaseTime");
    this.pCH = paramString1.optInt("purchaseState");
    paramString2 = paramString1.optString("developerPayload");
    ArrayList localArrayList = PA(paramString2);
    if (localArrayList.size() == 3)
    {
      this.pCI = ((String)localArrayList.get(0));
      this.pCL = ((String)localArrayList.get(1));
      this.pCK = ((String)localArrayList.get(2));
    }
    for (;;)
    {
      this.eIe = paramString1.optString("token", paramString1.optString("purchaseToken"));
      this.ogj = paramString3;
      return;
      this.pCI = paramString2;
    }
  }
  
  public c(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.iiv = paramString1;
    this.pCI = paramString2;
    this.pCK = paramString3;
    this.pCL = paramString4;
  }
  
  private static ArrayList<String> PA(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    while (paramString.indexOf("[#]") >= 0)
    {
      String str = paramString.substring(0, paramString.indexOf("[#]"));
      paramString = paramString.substring(str.length() + 3);
      localArrayList.add(str);
    }
    localArrayList.add(paramString);
    return localArrayList;
  }
  
  public final String toString()
  {
    return "PurchaseInfo(type:" + this.pCE + "):" + this.pCJ;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_index/b/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */