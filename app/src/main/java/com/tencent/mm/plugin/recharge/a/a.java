package com.tencent.mm.plugin.recharge.a;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.p;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

public class a
  implements ar
{
  private List<com.tencent.mm.plugin.recharge.model.a> mos = null;
  
  public static a bpV()
  {
    return (a)p.v(a.class);
  }
  
  public static com.tencent.mm.plugin.recharge.model.a bpX()
  {
    String str = (String)g.Ei().DT().get(6, null);
    if (!bi.oW(str)) {
      return new com.tencent.mm.plugin.recharge.model.a(str, ad.getContext().getString(a.i.wallet_recharge_me), 3);
    }
    return null;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final boolean a(com.tencent.mm.plugin.recharge.model.a parama)
  {
    if ((parama != null) && (PhoneNumberUtils.isGlobalPhoneNumber(parama.mov)))
    {
      List localList = bpW();
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.recharge.model.a locala = (com.tencent.mm.plugin.recharge.model.a)localIterator.next();
        if (parama.mov.equals(locala.mov))
        {
          if (bi.oW(parama.name)) {
            parama.name = locala.name;
          }
          localList.remove(locala);
        }
      }
      localList.add(0, parama);
      bP(localList);
      return true;
    }
    return false;
  }
  
  public final void bP(List<com.tencent.mm.plugin.recharge.model.a> paramList)
  {
    this.mos = paramList;
    if ((paramList == null) || (paramList.size() == 0)) {
      this.mos = new LinkedList();
    }
    for (;;)
    {
      paramList = new JSONArray();
      Iterator localIterator = this.mos.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.recharge.model.a locala = (com.tencent.mm.plugin.recharge.model.a)localIterator.next();
        paramList.put(locala.bpY());
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreRecharge", "number: %s", new Object[] { locala.name });
      }
      if (paramList.size() > 10)
      {
        int i = paramList.size() - 1;
        while (i >= 10)
        {
          paramList.remove(i);
          i -= 1;
        }
      }
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SubCoreRecharge", "setMobileHistory : " + paramList.toString());
    g.Ei().DT().set(270337, paramList.toString());
    g.Ei().DT().lm(true);
  }
  
  public final void bn(boolean paramBoolean) {}
  
  public final void bo(boolean paramBoolean) {}
  
  public final List<com.tencent.mm.plugin.recharge.model.a> bpW()
  {
    if (this.mos != null) {
      return this.mos;
    }
    this.mos = new LinkedList();
    Object localObject = (String)g.Ei().DT().get(270337, null);
    if (bi.oW((String)localObject))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreRecharge", "empty history");
      return this.mos;
    }
    try
    {
      JSONArray localJSONArray = new JSONArray((String)localObject);
      int i = 0;
      while (i < Math.min(localJSONArray.length(), 100))
      {
        com.tencent.mm.plugin.recharge.model.a locala = com.tencent.mm.plugin.recharge.model.a.Z(localJSONArray.getJSONObject(i));
        if (locala != null) {
          this.mos.add(locala);
        }
        i += 1;
      }
      String[] arrayOfString;
      return this.mos;
    }
    catch (JSONException localJSONException)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.SubCoreRecharge", localJSONException, "", new Object[0]);
      localObject = ((String)localObject).split("&");
      if ((localObject != null) && (localObject.length > 0))
      {
        i = 0;
        if (i < Math.min(localObject.length, 100))
        {
          arrayOfString = localObject[i].split("=");
          if (arrayOfString.length == 2) {
            this.mos.add(new com.tencent.mm.plugin.recharge.model.a(arrayOfString[0], arrayOfString[1], 2));
          }
          for (;;)
          {
            i += 1;
            break;
            if (arrayOfString.length == 1) {
              this.mos.add(new com.tencent.mm.plugin.recharge.model.a(arrayOfString[0], "", 2));
            }
          }
        }
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreRecharge", "getMobileHistory : " + this.mos.size());
    }
  }
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/recharge/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */