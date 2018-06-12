package com.tencent.mm.plugin.welab;

import android.text.TextUtils;
import com.tencent.mm.ak.a.a.c;
import com.tencent.mm.ak.a.a.c.a;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class b
{
  private static final b qmL = new b();
  public c pNL;
  public com.tencent.mm.plugin.welab.c.a qmM;
  public Map<String, com.tencent.mm.plugin.welab.a.a.b> qmN = new HashMap();
  public com.tencent.mm.plugin.welab.a.a.b qmO;
  
  public b()
  {
    c.a locala = new c.a();
    locala.dXy = true;
    locala.dXx = true;
    this.pNL = locala.Pt();
  }
  
  public static void O(boolean paramBoolean1, boolean paramBoolean2)
  {
    f.P(paramBoolean1, paramBoolean2);
  }
  
  private com.tencent.mm.plugin.welab.a.a.b RS(String paramString)
  {
    return (com.tencent.mm.plugin.welab.a.a.b)this.qmN.get(paramString);
  }
  
  public static String a(com.tencent.mm.plugin.welab.c.a.a parama)
  {
    String str = "";
    Object localObject = qmL.RS(parama.field_LabsAppId);
    if (localObject != null)
    {
      str = parama.field_LabsAppId;
      str = ((com.tencent.mm.plugin.welab.a.a.b)localObject).bYR();
      x.i("WelabMgr", "get appName from opener , appid %s, appName %s", new Object[] { parama.field_LabsAppId, str });
    }
    localObject = str;
    if (TextUtils.isEmpty(str)) {
      localObject = parama.Sa("field_Title");
    }
    return (String)localObject;
  }
  
  public static String b(com.tencent.mm.plugin.welab.c.a.a parama)
  {
    String str = "";
    Object localObject = qmL.RS(parama.field_LabsAppId);
    if (localObject != null)
    {
      str = parama.field_LabsAppId;
      str = ((com.tencent.mm.plugin.welab.a.a.b)localObject).bYQ();
      x.i("WelabMgr", "get icon url from opener , appid %s, url %s", new Object[] { parama.field_LabsAppId, str });
    }
    localObject = str;
    if (TextUtils.isEmpty(str)) {
      localObject = parama.field_Icon;
    }
    return (String)localObject;
  }
  
  public static b bYI()
  {
    return qmL;
  }
  
  public final com.tencent.mm.plugin.welab.c.a.a RT(String paramString)
  {
    com.tencent.mm.plugin.welab.c.a locala = this.qmM;
    com.tencent.mm.plugin.welab.c.a.a locala1 = new com.tencent.mm.plugin.welab.c.a.a();
    locala1.field_LabsAppId = paramString;
    locala.b(locala1, new String[0]);
    return locala1;
  }
  
  public final List<com.tencent.mm.plugin.welab.c.a.a> bYJ()
  {
    List localList = this.qmM.bYS();
    Object localObject = localList.iterator();
    while (((Iterator)localObject).hasNext())
    {
      com.tencent.mm.plugin.welab.c.a.a locala = (com.tencent.mm.plugin.welab.c.a.a)((Iterator)localObject).next();
      if ((!locala.isRunning()) || ((locala.field_Switch != 2) && (locala.field_Switch != 1)) || ("labs1de6f3".equals(locala.field_LabsAppId))) {
        ((Iterator)localObject).remove();
      }
    }
    if ("online lab " + localList != null) {}
    for (localObject = localList.toString();; localObject = "")
    {
      x.i("WelabMgr", (String)localObject);
      return localList;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/welab/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */