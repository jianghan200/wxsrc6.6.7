package com.tencent.mm.modelappbrand;

import android.os.Bundle;
import com.tencent.mm.g.a.qu;
import com.tencent.mm.g.a.qu.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.d;
import com.tencent.mm.y.g.a;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  public static boolean JJ()
  {
    if (!g.Eg().Dx()) {}
    com.tencent.mm.storage.c localc;
    do
    {
      return false;
      localc = com.tencent.mm.model.c.c.Jx().fJ("100360");
    } while ((!localc.isValid()) || (!"1".equals(localc.ckq().get("isOpenFTSSearchMiniGameEntry"))));
    return true;
  }
  
  private static void a(qu paramqu, g.a parama)
  {
    paramqu.cbq.appId = parama.dyT;
    paramqu.cbq.userName = parama.dyS;
    paramqu.cbq.cbs = parama.dyR;
    paramqu.cbq.cbt = parama.dyZ;
    paramqu.cbq.cbw = parama.dyV;
    paramqu.cbq.cbu = parama.dza;
    paramqu = paramqu.cbq;
    if (parama.dyZ != 0) {}
    for (boolean bool = true;; bool = false)
    {
      paramqu.cbx = bool;
      return;
    }
  }
  
  public static void a(String paramString, int paramInt, g.a parama, Bundle paramBundle)
  {
    qu localqu = new qu();
    a(localqu, parama);
    localqu.cbq.scene = paramInt;
    if (paramInt == 1074) {
      localqu.cbq.bGG = paramString;
    }
    localqu.cbq.bJx = paramBundle;
    com.tencent.mm.sdk.b.a.sFg.m(localqu);
  }
  
  public static void a(String paramString1, String paramString2, boolean paramBoolean, g.a parama, Bundle paramBundle)
  {
    qu localqu = new qu();
    a(localqu, parama);
    qu.a locala = localqu.cbq;
    int i;
    StringBuilder localStringBuilder;
    if (paramBoolean)
    {
      i = 1008;
      locala.scene = i;
      locala = localqu.cbq;
      localStringBuilder = new StringBuilder().append(paramString1);
      if (!paramBoolean) {
        break label133;
      }
    }
    label133:
    for (paramString1 = ":" + paramString2;; paramString1 = "")
    {
      locala.bGG = (paramString1 + ":" + parama.dyX);
      localqu.cbq.bJx = paramBundle;
      com.tencent.mm.sdk.b.a.sFg.m(localqu);
      return;
      i = 1007;
      break;
    }
  }
  
  public static void b(String paramString1, String paramString2, boolean paramBoolean, g.a parama, Bundle paramBundle)
  {
    qu localqu = new qu();
    a(localqu, parama);
    localqu.cbq.scene = 1044;
    localqu.cbq.bGG = parama.dyX;
    qu.a locala = localqu.cbq;
    int i;
    if (paramBoolean)
    {
      i = 2;
      locala.cbB = i;
      locala = localqu.cbq;
      if (paramBoolean) {
        paramString2 = paramString1;
      }
      locala.cbC = paramString2;
      localqu.cbq.cbz.dzR = parama.dyY;
      if (bi.oW(parama.dyY)) {
        break label141;
      }
    }
    label141:
    for (localqu.cbq.cbz.dFy = paramString1;; localqu.cbq.cbz.dFy = null)
    {
      localqu.cbq.bJx = paramBundle;
      com.tencent.mm.sdk.b.a.sFg.m(localqu);
      return;
      i = 1;
      break;
    }
  }
  
  public static boolean jh(String paramString)
  {
    if (bi.oW(paramString)) {}
    for (;;)
    {
      return false;
      try
      {
        paramString = new JSONObject(paramString).optJSONObject("BindWxaInfo");
        if (paramString != null)
        {
          int i = paramString.optInt("openWxaByBizQRCode", 0);
          if (i > 0) {
            return true;
          }
        }
      }
      catch (JSONException paramString) {}
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/modelappbrand/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */