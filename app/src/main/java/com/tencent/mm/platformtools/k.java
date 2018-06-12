package com.tencent.mm.platformtools;

import android.content.Context;
import android.content.res.AssetManager;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;

public final class k
{
  public static k evQ = new k();
  private Map<String, String> evR;
  
  public final Map<String, String> bY(Context paramContext)
  {
    for (;;)
    {
      int i;
      try
      {
        paramContext = bi.x(paramContext.getAssets().open("config/EmailAddress.xml"));
        if (bi.oW(paramContext)) {
          return null;
        }
        Map localMap = bl.z(paramContext, "config");
        if ((localMap == null) || (localMap.isEmpty()))
        {
          x.d("MicroMsg.EmailFormater", "values null");
          return null;
        }
        if (this.evR == null)
        {
          this.evR = new HashMap();
          i = 0;
          Object localObject = new StringBuilder(".config.format");
          if (i == 0)
          {
            paramContext = "";
            localObject = paramContext;
            if (localMap.get(localObject) == null) {
              continue;
            }
            paramContext = (String)localObject + ".emaildomain";
            localObject = (String)localObject + ".loginpage";
            paramContext = (String)localMap.get(paramContext);
            localObject = (String)localMap.get(localObject);
            if ((bi.oW(paramContext)) || (bi.oW((String)localObject))) {
              break label250;
            }
            this.evR.put(paramContext, localObject);
            break label250;
          }
        }
        else
        {
          return this.evR;
        }
        paramContext = Integer.valueOf(i);
        continue;
        paramContext = this.evR;
        return paramContext;
      }
      catch (Exception paramContext)
      {
        x.e("MicroMsg.EmailFormater", "parse email failed:[%s]", new Object[] { paramContext.getMessage() });
        return null;
      }
      label250:
      i += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/platformtools/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */