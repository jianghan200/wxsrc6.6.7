package com.tencent.mm.plugin.appbrand.appusage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.kernel.a;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.n.d;
import com.tencent.mm.plugin.appbrand.n.g.a;
import com.tencent.mm.plugin.appbrand.n.g.b;
import com.tencent.mm.plugin.appbrand.n.g.c;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI;
import com.tencent.mm.protocal.c.ahn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class w
  implements com.tencent.mm.plugin.appbrand.n.g
{
  public final void a(Context paramContext, g.c paramc, String paramString)
  {
    AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
    localAppBrandStatObject.scene = 1054;
    localAppBrandStatObject.bGG = paramString;
    ((d)com.tencent.mm.kernel.g.l(d.class)).a(paramContext, paramc.username, null, paramc.fmv, paramc.cbu, null, localAppBrandStatObject);
  }
  
  public final void a(Context paramContext, String paramString, g.a parama)
  {
    Intent localIntent = new Intent(paramContext, AppBrandLauncherUI.class);
    localIntent.putExtra("extra_enter_scene", 10);
    localIntent.putExtra("extra_enter_scene_note", paramString + ":" + parama.tag);
    if (!(paramContext instanceof Activity)) {
      localIntent.addFlags(268435456);
    }
    paramContext.startActivity(localIntent);
  }
  
  public final g.b adj()
  {
    Object localObject1 = new g.b();
    ((g.b)localObject1).dEw = new ArrayList(0);
    ((g.b)localObject1).gsQ = -1;
    ((g.b)localObject1).bSc = "";
    if (!com.tencent.mm.kernel.g.Eg().dpD) {}
    while (!b.acE()) {
      return (g.b)localObject1;
    }
    Object localObject2 = q.adi();
    g.b localb = new g.b();
    if (localObject2 == null)
    {
      localObject1 = null;
      localb.bSc = ((String)localObject1);
      if (localObject2 != null) {
        break label284;
      }
      i = 0;
      label80:
      localb.gsQ = i;
      if (localObject2 != null) {
        break label293;
      }
      localObject1 = new w.1(this, com.tencent.mm.plugin.appbrand.app.e.abg().a(new String[] { "brandId", "versionType" }, 4, 0));
      i = 4;
    }
    for (;;)
    {
      localb.dEw = new ArrayList(i);
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Object[])((Iterator)localObject1).next();
        WxaAttributes localWxaAttributes = com.tencent.mm.plugin.appbrand.app.e.aba().e((String)localObject2[0], new String[] { "nickname", "brandIconURL" });
        if (localWxaAttributes != null)
        {
          g.c localc = new g.c();
          localc.username = ((String)localObject2[0]);
          localc.fmv = ((Integer)localObject2[1]).intValue();
          localc.cbu = ((Integer)localObject2[2]).intValue();
          localc.nickname = localWxaAttributes.field_nickname;
          localc.fmD = localWxaAttributes.field_brandIconURL;
          localb.dEw.add(localc);
        }
      }
      localObject1 = ((ahn)localObject2).ksB;
      break;
      label284:
      i = ((ahn)localObject2).rKM;
      break label80;
      label293:
      localObject1 = new w.2(this, (ahn)localObject2);
      i = ((ahn)localObject2).rKL.size();
      com.tencent.mm.sdk.f.e.post(new w.3(this, (ahn)localObject2), "BatchSyncWxaAttrBySearchShowOut");
    }
    int i = q.a.fmy;
    q.adh();
    return localb;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appusage/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */