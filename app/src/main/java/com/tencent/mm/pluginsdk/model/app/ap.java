package com.tencent.mm.pluginsdk.model.app;

import android.content.Context;
import android.database.Cursor;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.c.p;
import com.tencent.mm.plugin.ac.a.a.a;
import com.tencent.mm.protocal.c.aih;
import com.tencent.mm.protocal.c.aru;
import com.tencent.mm.protocal.c.arv;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ap
  implements com.tencent.mm.ab.e, t
{
  private static ap qAS;
  public String lang;
  public boolean qAT = false;
  public boolean qAU = false;
  private List<String> qAV = new LinkedList();
  public long qAW;
  private final int qAX = 20;
  public int qAY = 0;
  public long qAZ;
  
  private static void a(f paramf, arv paramarv)
  {
    paramf.field_appName = paramarv.rqK;
    paramf.field_appName_en = paramarv.rTZ;
    paramf.field_appName_tw = paramarv.rUa;
    paramf.field_appName_hk = paramarv.rUl;
    paramf.cmW = paramarv.rUb;
    paramf.clZ = true;
    paramf.cmX = paramarv.rUc;
    paramf.clZ = true;
    paramf.cmY = paramarv.rUf;
    paramf.clZ = true;
    paramf.field_serviceAppInfoFlag = paramarv.rUe;
    paramf.field_serviceAppType = paramarv.rUd;
    paramf.cmZ = paramarv.rUg;
    paramf.clZ = true;
    paramf.field_serviceShowFlag = paramarv.rUh;
  }
  
  private static void a(i parami, List<String> paramList)
  {
    if ((parami == null) || (paramList == null) || (paramList.size() <= 0)) {}
    label47:
    do
    {
      return;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SuggestionAppListLogic", "removeExpiredServiceApp");
      localObject1 = new ArrayList();
      if (a.a.bmm() != null) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppInfoLogic", "getAllServices, getISubCorePluginBase() == null");
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SuggestionAppListLogic", "oldList %d", new Object[] { Integer.valueOf(((List)localObject1).size()) });
    } while (((List)localObject1).size() <= 0);
    Object localObject1 = ((List)localObject1).iterator();
    label90:
    label287:
    for (;;)
    {
      Object localObject2;
      Object localObject3;
      if (((Iterator)localObject1).hasNext())
      {
        localObject2 = (f)((Iterator)localObject1).next();
        if (((f)localObject2).field_appId != null)
        {
          localObject3 = paramList.iterator();
          String str;
          do
          {
            if (!((Iterator)localObject3).hasNext()) {
              break;
            }
            str = (String)((Iterator)localObject3).next();
          } while (!((f)localObject2).field_appId.equals(str));
        }
      }
      else
      {
        for (int i = 1;; i = 0)
        {
          if (i != 0) {
            break label287;
          }
          boolean bool = parami.b((f)localObject2, new String[0]);
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SuggestionAppListLogic", "delete old service : %s, %s", new Object[] { ((f)localObject2).field_appId, Boolean.valueOf(bool) });
          break label90;
          break;
          localObject2 = a.a.bmm().bml();
          if (localObject2 == null) {
            break label47;
          }
          while (((Cursor)localObject2).moveToNext())
          {
            localObject3 = new f();
            ((f)localObject3).d((Cursor)localObject2);
            if (!bi.oW(((f)localObject3).field_openId)) {
              ((List)localObject1).add(localObject3);
            }
          }
          ((Cursor)localObject2).close();
          break label47;
        }
      }
    }
  }
  
  public static void cR(String paramString, int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SuggestionAppListLogic", "get service app, offset = %d, lang = %s", new Object[] { Integer.valueOf(paramInt), paramString });
    paramString = new ag(paramInt, paramString);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(paramString, 0);
  }
  
  public static ap ccb()
  {
    if (qAS == null) {
      qAS = new ap();
    }
    return qAS;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if (!com.tencent.mm.kernel.g.Eg().Dx())
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SuggestionAppListLogic", "getServiceAppList onSceneEnd account not ready");
      this.qAY = 0;
      this.qAV.clear();
      return;
    }
    this.qAU = false;
    if (paraml == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SuggestionAppListLogic", "scene == null");
      this.qAY = 0;
      this.qAV.clear();
      return;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SuggestionAppListLogic", "getServiceAppList onSceneEnd : errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      this.qAY = 0;
      this.qAV.clear();
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SuggestionAppListLogic", "getServiceAppList onSceneEnd : errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    paramString = (ag)paraml;
    if ((paramString.diG != null) && (paramString.diG.dIE.dIL != null)) {}
    for (paramString = (aru)paramString.diG.dIE.dIL; paramString == null; paramString = null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SuggestionAppListLogic", "resp == null");
      this.qAY = 0;
      this.qAV.clear();
      return;
    }
    if ((paramString.rTY == null) || (paramString.rTY.size() <= 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SuggestionAppListLogic", "Service_appinfo empty");
      a(a.a.bmm().bmk(), this.qAV);
      this.qAY = 0;
      this.qAV.clear();
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Ei().DT().setLong(352276, System.currentTimeMillis());
      this.qAZ = System.currentTimeMillis();
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SuggestionAppListLogic", "offset = %d, count = %s", new Object[] { Integer.valueOf(this.qAY), Integer.valueOf(paramString.rTY.size()) });
    i locali = a.a.bmm().bmk();
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = paramString.rTY.iterator();
    label569:
    label1102:
    while (localIterator.hasNext())
    {
      arv localarv = (arv)localIterator.next();
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.SuggestionAppListLogic", "service info: %s, %s, %s, %s, %s, %s", new Object[] { localarv.rqK, Integer.valueOf(localarv.rUd), Integer.valueOf(localarv.rUh), Integer.valueOf(localarv.rUg), Integer.valueOf(localarv.rUe), localarv.bPS });
      if (!bi.oW(localarv.bPS))
      {
        if (f.qzH.equals(localarv.bPS))
        {
          localarv.rUe = (localarv.rUe ^ 0xFD ^ 0xFFFFFFFF);
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SuggestionAppListLogic", "aa change: %s", new Object[] { Integer.valueOf(localarv.rUe) });
        }
        this.qAV.add(localarv.bPS);
        f localf = g.bl(localarv.bPS, true);
        boolean bool;
        if (localf != null) {
          if (localf.field_serviceAppInfoFlag != localarv.rUe)
          {
            paramInt1 = 1;
            paraml = localf;
            if (paramInt1 != 0)
            {
              paraml = localf.cmX;
              String str = localf.cmW;
              a(localf, localarv);
              bool = locali.a(localf, new String[0]);
              if (!bi.oV(paraml).equals(bi.oV(localarv.rUc)))
              {
                com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SuggestionAppListLogic", "update serviceApp.app_icon_url_list" + bi.oV(localarv.rUc));
                com.tencent.mm.plugin.ac.a.bmd().cO(localf.field_appId, 5);
              }
              if (!bi.oV(str).equals(bi.oV(localarv.rUb)))
              {
                com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SuggestionAppListLogic", "update serviceApp.app_icon_url_panel" + bi.oV(localarv.rUb));
                com.tencent.mm.plugin.ac.a.bmd().cO(localf.field_appId, 4);
              }
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SuggestionAppListLogic", "update app: AppID = %s, ret = %s", new Object[] { localarv.bPS, Boolean.valueOf(bool) });
              paraml = localf;
            }
          }
        }
        for (;;)
        {
          if (!bi.oW(paraml.field_openId)) {
            break label1102;
          }
          localLinkedList.add(localarv.bPS);
          break;
          if (localf.field_serviceAppType != localarv.rUd)
          {
            paramInt1 = 1;
            break label569;
          }
          if (localf.cmZ != localarv.rUg)
          {
            paramInt1 = 1;
            break label569;
          }
          if (localf.field_serviceShowFlag != localarv.rUh)
          {
            paramInt1 = 1;
            break label569;
          }
          if (!bi.oV(localf.field_appName).equals(bi.oV(localarv.rqK)))
          {
            paramInt1 = 1;
            break label569;
          }
          if (!bi.oV(localf.field_appName_en).equals(bi.oV(localarv.rTZ)))
          {
            paramInt1 = 1;
            break label569;
          }
          if (!bi.oV(localf.field_appName_tw).equals(bi.oV(localarv.rUa)))
          {
            paramInt1 = 1;
            break label569;
          }
          if (!bi.oV(localf.field_appName_hk).equals(bi.oV(localarv.rUl)))
          {
            paramInt1 = 1;
            break label569;
          }
          if (!bi.oV(localf.cmX).equals(bi.oV(localarv.rUc)))
          {
            paramInt1 = 1;
            break label569;
          }
          if (!bi.oV(localf.cmW).equals(bi.oV(localarv.rUb)))
          {
            paramInt1 = 1;
            break label569;
          }
          if (!bi.oV(localf.cmY).equals(bi.oV(localarv.rUf)))
          {
            paramInt1 = 1;
            break label569;
          }
          paramInt1 = 0;
          break label569;
          paraml = new f();
          paraml.field_appId = localarv.bPS;
          a(paraml, localarv);
          bool = locali.l(paraml);
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SuggestionAppListLogic", "insert app: AppID = %s, ret = %s", new Object[] { localarv.bPS, Boolean.valueOf(bool) });
        }
      }
    }
    if (localLinkedList.size() > 0)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SuggestionAppListLogic", "needGetOpenIdList %d", new Object[] { Integer.valueOf(localLinkedList.size()) });
      com.tencent.mm.plugin.ac.a.bmh().cS(localLinkedList);
    }
    if (paramString.rTY.size() == 20)
    {
      this.qAY += 20;
      cR(this.lang, this.qAY);
    }
    for (;;)
    {
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Ei().DT().setLong(352276, System.currentTimeMillis());
      this.qAZ = System.currentTimeMillis();
      return;
      a(locali, this.qAV);
      this.qAY = 0;
      this.qAV.clear();
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if (!com.tencent.mm.kernel.g.Eg().Dx()) {}
    do
    {
      return;
      this.qAT = false;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SuggestionAppListLogic", "Suggestion onSceneEnd errType=%s errCode=%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (paramx == null)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SuggestionAppListLogic", "scene == null");
        return;
      }
    } while ((paramInt1 != 0) || (paramInt2 != 0));
    switch (paramx.getType())
    {
    default: 
      return;
    }
    paramString = (ah)paramx;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SuggestionAppListLogic", "get suggestion appList, AppCount = %s", new Object[] { Integer.valueOf(((aih)paramString.ivx.dIE.dIL).rLe) });
    paramString = paramString.qAr;
    if ((paramString == null) || (paramString.size() <= 0))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.SuggestionAppListLogic", "empty suggestAppList");
      return;
    }
    if ((ad.getContext() == null) || (a.a.bmm() == null))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SuggestionAppListLogic", "wrong environment");
      return;
    }
    paramx = new LinkedList();
    Object localObject1 = paramString.iterator();
    f localf;
    Object localObject2;
    Object localObject3;
    if (((Iterator)localObject1).hasNext())
    {
      localf = (f)((Iterator)localObject1).next();
      localObject2 = localf.field_appName;
      localObject3 = localf.field_packageName;
      String str1 = localf.field_signature;
      String str2 = localf.cmM;
      if (localf.cmL != null) {}
      for (boolean bool = true;; bool = false)
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SuggestionAppListLogic", "suggestion appName=%s, packageName=%s, signature [%s], introUrl [%s], has iconUrl [%s]", new Object[] { localObject2, localObject3, str1, str2, Boolean.valueOf(bool) });
        paramx.add(localf.field_appId);
        break;
      }
    }
    a.a.bmm().X(paramx);
    localObject1 = g.eR(ad.getContext());
    if (((List)localObject1).size() > 0)
    {
      paramx = a.a.bmm().bmk();
      localObject1 = ((List)localObject1).iterator();
    }
    label517:
    for (;;)
    {
      if (((Iterator)localObject1).hasNext())
      {
        localf = (f)((Iterator)localObject1).next();
        if (localf.field_appId != null)
        {
          localObject2 = paramString.iterator();
          do
          {
            if (!((Iterator)localObject2).hasNext()) {
              break;
            }
            localObject3 = (f)((Iterator)localObject2).next();
          } while ((((f)localObject3).field_appId == null) || (!localf.field_appId.equals(((f)localObject3).field_appId)));
        }
      }
      else
      {
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          if (paramInt1 != 0) {
            break label517;
          }
          if (g.a(ad.getContext(), localf)) {}
          for (localf.field_status = 1;; localf.field_status = 4)
          {
            paramx.a(localf, new String[0]);
            break;
          }
          com.tencent.mm.kernel.g.Ek();
          com.tencent.mm.kernel.g.Ei().DT().setLong(352275, System.currentTimeMillis());
          this.qAW = System.currentTimeMillis();
          return;
        }
      }
    }
  }
  
  public final void eT(Context paramContext)
  {
    if (!com.tencent.mm.kernel.g.Eg().Dx()) {}
    while (paramContext == null) {
      return;
    }
    if (this.qAU)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SuggestionAppListLogic", "ServiceAppInfo is loading, return");
      return;
    }
    this.qAU = true;
    if (this.lang == null) {
      this.lang = w.d(paramContext.getSharedPreferences(ad.chY(), 0));
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SuggestionAppListLogic", "getServiceAppListImmediately");
    cR(this.lang, this.qAY);
  }
  
  public final void reset()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SuggestionAppListLogic", "reset getServiceAppList");
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Ei().DT().setLong(352276, 0L);
    this.qAZ = 0L;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/pluginsdk/model/app/ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */