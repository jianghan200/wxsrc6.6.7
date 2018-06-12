package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.ac.a;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public final class m
  implements t
{
  private List<String> qzB = new ArrayList();
  public Vector<String> qzY = new Vector();
  private volatile boolean qzZ = false;
  
  public m()
  {
    a.bmi().a(1, this);
  }
  
  private void aUz()
  {
    int i = 20;
    if (this.qzZ)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AppSettingService", "tryDoScene fail, doing Scene");
      return;
    }
    if (this.qzY.size() <= 0)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AppSettingService", "tryDoScene fail, appIdList is empty");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AppSettingService", "tryDoScene, appid list size = " + this.qzY.size());
    int j = this.qzY.size();
    if (j > 20) {}
    for (;;)
    {
      this.qzZ = true;
      this.qzB.addAll(this.qzY.subList(0, i));
      y localy = new y(1, new af(this.qzB));
      g.Eh().dpP.a(localy, 0);
      return;
      i = j;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if (paramx.getType() != 1) {
      return;
    }
    this.qzZ = false;
    paramString = ((af)paramx).qAq;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AppSettingService", "onSceneEnd, list size = " + paramString.size());
    this.qzY.removeAll(this.qzB);
    this.qzB.clear();
    aUz();
  }
  
  public final void cS(List<String> paramList)
  {
    if ((paramList == null) || (paramList.size() == 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppSettingService", "addAll list is null");
      return;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if ((!bi.oW(str)) && (!this.qzY.contains(str))) {
        this.qzY.add(str);
      }
    }
    aUz();
  }
  
  public final void pS(String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AppSettingService", "appId = " + paramString);
    if (bi.oW(paramString))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppSettingService", "add appId is null");
      return;
    }
    if (!this.qzY.contains(paramString)) {
      this.qzY.add(paramString);
    }
    aUz();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/pluginsdk/model/app/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */