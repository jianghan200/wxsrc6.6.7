package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.d.a;
import com.tencent.mm.plugin.appbrand.appcache.k;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.d;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.v.g;
import java.util.List;
import org.json.JSONObject;

public class z
  extends w<WxaPkgWrappingInfo>
  implements i
{
  public static volatile boolean ggw = false;
  private final i ggx;
  
  z(String paramString1, int paramInt1, String paramString2, int paramInt2, WxaAttributes.d paramd)
  {
    int i;
    Object localObject2;
    String str1;
    int j;
    if (d.a.jC(paramInt1)) {
      if ((paramd.fsm) || ((ggw) && (!bi.cX(paramd.fsl))))
      {
        i = 1;
        localObject2 = paramd.fsl;
        str1 = paramd.fsn;
        j = paramd.fsk;
      }
    }
    for (;;)
    {
      if ((i != 0) && (!bi.cX((List)localObject2)) && (k.abG()))
      {
        this.ggx = new z.1(this, paramString1, paramInt1, paramString2, paramInt2, paramd.cbu, j, str1, (List)localObject2);
        return;
        i = 0;
        break;
        str1 = ((h)e.x(h.class)).aH(paramString1, paramInt1);
        try
        {
          localObject2 = g.fU(str1);
          if (localObject2 == null)
          {
            str1 = null;
            localObject2 = null;
            i = 0;
            j = 0;
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            localObject2 = null;
            continue;
            Object localObject1 = WxaAttributes.e.sj(((JSONObject)localObject2).optString("module_list"));
            if (!bi.cX((List)localObject1)) {}
            for (i = 1;; i = 0)
            {
              if (i == 0) {
                break label218;
              }
              str2 = ((JSONObject)localObject2).optString("entrance_module");
              localObject2 = localObject1;
              localObject1 = str2;
              break;
            }
            label218:
            String str2 = "";
            localObject2 = localObject1;
            localObject1 = str2;
          }
        }
      }
    }
    this.ggx = new l(paramString1, paramInt1, paramd.cbu, paramInt2, paramd)
    {
      public final void akC()
      {
        z.this.akC();
      }
      
      public final void akE()
      {
        z.this.akE();
      }
      
      public final void onDownloadProgress(int paramAnonymousInt)
      {
        z.this.onDownloadProgress(paramAnonymousInt);
      }
    };
  }
  
  public final WxaPkgWrappingInfo afp()
  {
    return (WxaPkgWrappingInfo)this.ggx.call();
  }
  
  public void akC() {}
  
  public void akE() {}
  
  final String getTag()
  {
    return "MicroMsg.AppBrand.PrepareStepCheckAppPkgWrapper";
  }
  
  public void onDownloadProgress(int paramInt) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */