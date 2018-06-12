package com.tencent.mm.plugin.wallet_index.b.a;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.mm.plugin.wallet_index.ui.d;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONException;

public final class a
{
  private static void ED(String paramString)
  {
    x.e("MicroMsg.IabResolver", "In-app billing error: " + paramString);
  }
  
  public static int a(Intent paramIntent, a parama)
  {
    localb = new b();
    int i = ae(paramIntent);
    x.d("MicroMsg.IabResolver", "Owned items response: " + String.valueOf(i));
    if (i != 0)
    {
      parama.a(com.tencent.mm.plugin.wallet_index.c.a.aN(i, ""), null);
      return i;
    }
    if ((!paramIntent.hasExtra("INAPP_PURCHASE_ITEM_LIST")) || (!paramIntent.hasExtra("INAPP_PURCHASE_DATA_LIST")) || (!paramIntent.hasExtra("INAPP_DATA_SIGNATURE_LIST")))
    {
      ED("Bundle returned from getPurchases() doesn't contain required fields.");
      parama.a(com.tencent.mm.plugin.wallet_index.c.a.aN(5, ""), null);
      return 5;
    }
    ArrayList localArrayList1 = paramIntent.getStringArrayListExtra("INAPP_PURCHASE_ITEM_LIST");
    ArrayList localArrayList2 = paramIntent.getStringArrayListExtra("INAPP_PURCHASE_DATA_LIST");
    paramIntent = paramIntent.getStringArrayListExtra("INAPP_DATA_SIGNATURE_LIST");
    i = 0;
    try
    {
      while (i < localArrayList2.size())
      {
        String str1 = (String)localArrayList2.get(i);
        Object localObject = (String)paramIntent.get(i);
        String str2 = (String)localArrayList1.get(i);
        x.d("MicroMsg.IabResolver", "Sku is owned: " + str2);
        localObject = new c("inapp", str1, (String)localObject);
        if (TextUtils.isEmpty(((c)localObject).eIe))
        {
          x.w("MicroMsg.IabResolver", "In-app billing warning: " + "BUG: empty/null token!");
          x.d("MicroMsg.IabResolver", "Purchase data: " + str1);
        }
        localb.pCD.put(((c)localObject).iiv, localObject);
        i += 1;
      }
      parama.a(com.tencent.mm.plugin.wallet_index.c.a.aN(0, ""), localb);
    }
    catch (JSONException paramIntent)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.IabResolver", paramIntent, "", new Object[0]);
        parama.a(com.tencent.mm.plugin.wallet_index.c.a.aN(5, ""), localb);
      }
    }
    return 0;
  }
  
  public static b a(Intent paramIntent, d paramd)
  {
    if (paramIntent == null)
    {
      ED("Null data in IAB activity result.");
      paramIntent = com.tencent.mm.plugin.wallet_index.c.a.aN(5, "");
      if (paramd != null) {
        paramd.a(paramIntent, null);
      }
    }
    label259:
    do
    {
      int i;
      do
      {
        String str1;
        String str2;
        do
        {
          return null;
          i = paramIntent.getIntExtra("RESPONSE_CODE", 0);
          str1 = paramIntent.getStringExtra("INAPP_PURCHASE_DATA");
          str2 = paramIntent.getStringExtra("INAPP_DATA_SIGNATURE");
          if (i != 0) {
            break label259;
          }
          x.d("MicroMsg.IabResolver", "Successful resultcode from purchase activity.");
          x.d("MicroMsg.IabResolver", "Purchase data: " + str1);
          x.d("MicroMsg.IabResolver", "Data signature: " + str2);
          x.d("MicroMsg.IabResolver", "Extras: " + paramIntent.getExtras());
          if ((str1 != null) && (str2 != null)) {
            break;
          }
          ED("BUG: either purchaseData or dataSignature is null.");
          paramIntent = com.tencent.mm.plugin.wallet_index.c.a.aN(5, "");
        } while (paramd == null);
        paramd.a(paramIntent, null);
        return null;
        try
        {
          paramIntent = new c("inapp", str1, str2);
          str1 = paramIntent.iiv;
          x.d("MicroMsg.IabResolver", "Purchase signature successfully verified.");
          if (paramd != null) {
            paramd.a(com.tencent.mm.plugin.wallet_index.c.a.aN(0, ""), paramIntent);
          }
          paramIntent = new b(str1, paramIntent);
          return paramIntent;
        }
        catch (JSONException paramIntent)
        {
          ED("Failed to parse purchase data.");
          x.printErrStackTrace("MicroMsg.IabResolver", paramIntent, "", new Object[0]);
          paramIntent = com.tencent.mm.plugin.wallet_index.c.a.aN(5, "");
        }
      } while (paramd == null);
      paramd.a(paramIntent, null);
      return null;
      ED("Purchase failed. Response: " + i);
      paramIntent = com.tencent.mm.plugin.wallet_index.c.a.aN(i, "");
    } while (paramd == null);
    paramd.a(paramIntent, null);
    return null;
  }
  
  public static int ae(Intent paramIntent)
  {
    if (paramIntent == null)
    {
      ED("Intent with no response code, assuming OK (known issue)");
      return 1;
    }
    paramIntent = paramIntent.getExtras().get("RESPONSE_CODE");
    if (paramIntent == null)
    {
      ED("Intent with no response code, assuming OK (known issue)");
      return 0;
    }
    if ((paramIntent instanceof Integer)) {
      return ((Integer)paramIntent).intValue();
    }
    if ((paramIntent instanceof Long)) {
      return (int)((Long)paramIntent).longValue();
    }
    ED("Unexpected type for intent response code.");
    ED(paramIntent.getClass().getName());
    throw new RuntimeException("Unexpected type for intent response code: " + paramIntent.getClass().getName());
  }
  
  public static abstract interface a
  {
    public abstract void a(com.tencent.mm.plugin.wallet_index.c.a parama, b paramb);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_index/b/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */