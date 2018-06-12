package com.tencent.mm.plugin.appbrand.config;

import android.content.ContentValues;
import android.database.Cursor;
import android.util.Pair;
import com.tencent.mm.aa.j;
import com.tencent.mm.aa.k;
import com.tencent.mm.aa.q;
import com.tencent.mm.bk.b;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.appcache.ap;
import com.tencent.mm.protocal.c.cgy;
import com.tencent.mm.protocal.c.cx;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

public final class p
  extends com.tencent.mm.sdk.e.i<WxaAttributes>
{
  final com.tencent.mm.bt.h dCZ;
  
  public p(com.tencent.mm.bt.h paramh)
  {
    super(paramh, WxaAttributes.fgt, "WxaAttributesTable", WxaAttributes.ciG);
    this.dCZ = paramh;
    Cursor localCursor;
    if ((aeh()) && (!g.Ei().DT().getBoolean(aa.a.sTX, false)))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppBrand.WxaAttributeDesktopURLFix", "before fix");
      localCursor = paramh.b("select appInfo from WxaAttributesTable", null, 2);
      if ((localCursor == null) || (localCursor.isClosed())) {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppBrand.WxaAttributeDesktopURLFix", "try fix but db not working");
      }
    }
    else
    {
      return;
    }
    if (localCursor.moveToFirst())
    {
      Object localObject1 = new LinkedList();
      Object localObject2 = localCursor.getString(0);
      if (!bi.oW((String)localObject2)) {}
      for (;;)
      {
        try
        {
          localObject3 = new JSONObject((String)localObject2);
          localObject2 = ((JSONObject)localObject3).optString("Appid");
          localObject3 = ((JSONObject)localObject3).optString("RoundedSquareIconUrl");
          if (!bi.oW((String)localObject2))
          {
            boolean bool = bi.oW((String)localObject3);
            if (!bool) {
              continue;
            }
          }
        }
        catch (Exception localException)
        {
          Object localObject3;
          long l;
          ContentValues localContentValues;
          continue;
          paramh.gp(l);
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppBrand.WxaAttributeDesktopURLFix", "fix done");
        }
        if (localCursor.moveToNext()) {
          break;
        }
        localCursor.close();
        l = paramh.dO(Thread.currentThread().getId());
        localObject1 = ((List)localObject1).iterator();
        if (!((Iterator)localObject1).hasNext()) {
          continue;
        }
        localObject2 = (Pair)((Iterator)localObject1).next();
        paramh.update("WxaAttributesTable", (ContentValues)((Pair)localObject2).second, "appId=?", new String[] { (String)((Pair)localObject2).first });
        continue;
        localContentValues = new ContentValues(1);
        localContentValues.put("roundedSquareIconURL", (String)localObject3);
        ((List)localObject1).add(Pair.create(localObject2, localContentValues));
      }
    }
    for (;;)
    {
      if (!localCursor.isClosed()) {
        localCursor.close();
      }
      g.Ei().DT().a(aa.a.sTX, Boolean.valueOf(true));
      return;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppBrand.WxaAttributeDesktopURLFix", "no contacts available");
    }
  }
  
  private static boolean a(WxaAttributes paramWxaAttributes, cgy paramcgy)
  {
    if (("NickName".equals(paramcgy.riD)) && (!be(paramcgy.mEl, paramWxaAttributes.field_nickname)))
    {
      paramWxaAttributes.field_nickname = bi.oV(paramcgy.mEl);
      return true;
    }
    if (("BrandIconURL".equals(paramcgy.riD)) && (!be(paramcgy.mEl, paramWxaAttributes.field_brandIconURL)))
    {
      paramWxaAttributes.field_brandIconURL = paramcgy.mEl;
      return true;
    }
    if (("BigHeadImgUrl".equals(paramcgy.riD)) && (!be(paramcgy.mEl, paramWxaAttributes.field_bigHeadURL)))
    {
      paramWxaAttributes.field_bigHeadURL = paramcgy.mEl;
      return true;
    }
    if (("SmallHeadImgUrl".equals(paramcgy.riD)) && (!be(paramcgy.mEl, paramWxaAttributes.field_smallHeadURL)))
    {
      paramWxaAttributes.field_smallHeadURL = paramcgy.mEl;
      return true;
    }
    if (("Signature".equals(paramcgy.riD)) && (!be(paramcgy.mEl, paramWxaAttributes.field_signature)))
    {
      paramWxaAttributes.field_signature = paramcgy.mEl;
      return true;
    }
    if ("WxAppOpt".equals(paramcgy.riD))
    {
      int i = bi.getInt(paramcgy.mEl, 0);
      if (i != paramWxaAttributes.field_appOpt)
      {
        paramWxaAttributes.field_appOpt = i;
        return true;
      }
    }
    if (("RegisterSource".equals(paramcgy.riD)) && (!be(paramcgy.mEl, paramWxaAttributes.field_registerSource)))
    {
      paramWxaAttributes.field_registerSource = paramcgy.mEl;
      return true;
    }
    if (("WxaAppInfo".equals(paramcgy.riD)) && (!be(paramcgy.mEl, paramWxaAttributes.field_appInfo)))
    {
      paramWxaAttributes.field_appInfo = paramcgy.mEl;
      try
      {
        paramcgy = new JSONObject(paramcgy.mEl);
        paramWxaAttributes.field_appId = paramcgy.getString("Appid");
        paramWxaAttributes.field_roundedSquareIconURL = paramcgy.getString("RoundedSquareIconUrl");
        paramcgy = n.i(paramcgy);
        m.a(paramWxaAttributes.field_appId, paramcgy.rcX);
        return true;
      }
      catch (Exception paramWxaAttributes)
      {
        return true;
      }
    }
    if (("WxaAppVersionInfo".equalsIgnoreCase(paramcgy.riD)) && (!be(paramcgy.mEl, paramWxaAttributes.field_versionInfo)))
    {
      paramWxaAttributes.field_versionInfo = paramcgy.mEl;
      return true;
    }
    if (("BindWxaInfo".equals(paramcgy.riD)) && (!be(paramcgy.mEl, paramWxaAttributes.field_bindWxaInfo)))
    {
      paramWxaAttributes.field_bindWxaInfo = paramcgy.mEl;
      return true;
    }
    if (("WxaAppDynamic".equals(paramcgy.riD)) && (!be(paramcgy.mEl, paramWxaAttributes.field_dynamicInfo)))
    {
      paramWxaAttributes.field_dynamicInfo = paramcgy.mEl;
      return true;
    }
    if (("MMBizMenu".equals(paramcgy.riD)) && (!be(paramcgy.mEl, paramWxaAttributes.field_bizMenu)))
    {
      paramWxaAttributes.field_bizMenu = paramcgy.mEl;
      return true;
    }
    return false;
  }
  
  private boolean a(WxaAttributes paramWxaAttributes, String... paramVarArgs)
  {
    int i;
    if (!bi.G(paramVarArgs)) {
      i = 0;
    }
    for (;;)
    {
      if (i < paramVarArgs.length)
      {
        if (paramVarArgs[i].equals("username"))
        {
          paramVarArgs[i] = "usernameHash";
          paramWxaAttributes.field_usernameHash = paramWxaAttributes.field_username.hashCode();
        }
      }
      else {
        return super.b(paramWxaAttributes, paramVarArgs);
      }
      i += 1;
    }
  }
  
  private static boolean be(String paramString1, String paramString2)
  {
    return bi.oV(paramString1).equals(bi.oV(paramString2));
  }
  
  public final boolean a(String paramString, b paramb, List<cgy> paramList)
  {
    if (bi.cX(paramList)) {
      return false;
    }
    WxaAttributes localWxaAttributes = new WxaAttributes();
    localWxaAttributes.field_username = paramString;
    if (!a(localWxaAttributes, new String[] { "username" })) {}
    boolean bool;
    for (i = 1;; i = 0)
    {
      paramString = paramList.iterator();
      bool = false;
      while (paramString.hasNext())
      {
        paramList = (cgy)paramString.next();
        if (paramList != null) {
          bool = a(localWxaAttributes, paramList) | bool;
        }
      }
    }
    if (bool)
    {
      if (i == 0) {
        break label428;
      }
      b(localWxaAttributes);
    }
    for (;;)
    {
      try
      {
        if (!g.Eg().Dx()) {
          continue;
        }
        paramList = localWxaAttributes.field_username;
        str1 = localWxaAttributes.field_nickname;
        str2 = localWxaAttributes.field_bigHeadURL;
        str3 = localWxaAttributes.field_smallHeadURL;
        paramString = q.KH().kc(paramList);
        if (paramString != null) {
          continue;
        }
        paramString = new j();
        i = 1;
      }
      catch (Exception paramString)
      {
        String str1;
        String str2;
        String str3;
        label428:
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.WxaAttrStorage", paramString, "flushContactInMainDB", new Object[0]);
        continue;
        paramString = paramb.lR;
        continue;
        i = 0;
        continue;
        continue;
        i = 0;
        continue;
      }
      if (!bi.oV(str3).equals(paramString.Ky()))
      {
        paramString.dHQ = str3;
        i = 1;
      }
      if (!bi.oV(str2).equals(paramString.Kx()))
      {
        paramString.dHR = str2;
        i = 1;
      }
      if (i != 0)
      {
        paramString.username = paramList;
        paramString.by(true);
        paramString.bWA = 31;
        q.KH().a(paramString);
      }
      paramString = ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(paramList);
      if (paramString != null) {
        continue;
      }
      paramString = new ab();
      if ((int)paramString.dhP != 0) {
        continue;
      }
      paramString.setUsername(paramList);
      i = 1;
      if (!str1.equals(paramString.field_nickname))
      {
        paramString.dx(str1);
        paramString.dy(com.tencent.mm.platformtools.h.oJ(str1));
        paramString.dz(com.tencent.mm.platformtools.h.oI(str1));
        i = 1;
      }
      if (i != 0) {
        ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().R(paramString);
      }
      com.tencent.mm.plugin.appbrand.app.e.abi().a(localWxaAttributes.field_appId, localWxaAttributes.ael());
      localWxaAttributes.field_syncTimeSecond = bi.VE();
      if (paramb != null) {
        continue;
      }
      paramString = new byte[0];
      localWxaAttributes.field_syncVersion = bi.bE(paramString);
      c(localWxaAttributes, new String[] { "username" });
      return bool;
      c(localWxaAttributes, new String[] { "username" });
    }
  }
  
  public final boolean aeh()
  {
    return (this.dCZ != null) && (!this.dCZ.cjr());
  }
  
  public final WxaAttributes e(String paramString, String... paramVarArgs)
  {
    Object localObject1 = null;
    if (bi.oW(paramString)) {}
    while (!paramString.endsWith("@app")) {
      return null;
    }
    Object localObject2 = this.dCZ;
    if (bi.G(paramVarArgs)) {
      paramVarArgs = null;
    }
    for (;;)
    {
      localObject2 = ((com.tencent.mm.bt.h)localObject2).a("WxaAttributesTable", paramVarArgs, String.format(Locale.US, "%s=?", new Object[] { "usernameHash" }), new String[] { String.valueOf(paramString.hashCode()) }, null, null, null, 2);
      if (localObject2 == null) {
        break;
      }
      paramVarArgs = (String[])localObject1;
      if (((Cursor)localObject2).moveToFirst())
      {
        paramVarArgs = new WxaAttributes();
        paramVarArgs.d((Cursor)localObject2);
        paramVarArgs.field_username = paramString;
      }
      ((Cursor)localObject2).close();
      return paramVarArgs;
    }
  }
  
  public final WxaAttributes f(String paramString, String... paramVarArgs)
  {
    Object localObject1 = null;
    if (bi.oW(paramString)) {
      return null;
    }
    Object localObject2 = this.dCZ;
    if (bi.G(paramVarArgs)) {
      paramVarArgs = null;
    }
    for (;;)
    {
      localObject2 = ((com.tencent.mm.bt.h)localObject2).a("WxaAttributesTable", paramVarArgs, String.format(Locale.US, "%s=?", new Object[] { "appId" }), new String[] { paramString }, null, null, null, 2);
      if (localObject2 == null) {
        break;
      }
      paramVarArgs = (String[])localObject1;
      if (((Cursor)localObject2).moveToFirst())
      {
        paramVarArgs = new WxaAttributes();
        paramVarArgs.d((Cursor)localObject2);
        paramVarArgs.field_appId = paramString;
      }
      ((Cursor)localObject2).close();
      return paramVarArgs;
    }
  }
  
  final long rS(String paramString)
  {
    paramString = e(paramString, new String[] { "appInfo" });
    if ((paramString == null) || (paramString.aej() == null)) {
      return 0L;
    }
    return paramString.aej().fmc;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */