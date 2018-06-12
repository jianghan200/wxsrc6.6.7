package com.tencent.mm.plugin.ext.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import com.jg.JgClassChecked;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.ac.a.a;
import com.tencent.mm.plugin.ac.a.a.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.d.a.b;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

@JgClassChecked(author=32, fComment="checked", lastDate="20141016", reviewer=20, vComment={com.jg.EType.PROVIDERCHECK})
public class ExtContentProviderBase
  extends ContentProvider
{
  protected static boolean hdT = false;
  private static HashMap<String, Long> iJQ = new HashMap();
  public MatrixCursor hdQ = new MatrixCursor(new String[0]);
  private long iJL = bi.VG();
  private String iJM;
  public String iJN = "";
  private String[] iJO;
  private int iJP = 0;
  
  private int aIV()
  {
    return (int)bi.bI(this.iJL);
  }
  
  private void dg(Context paramContext)
  {
    if (paramContext == null) {
      x.w("MicroMsg.ExtContentProviderBase", "in initCallerPkgName(), context == null");
    }
    do
    {
      return;
      x.i("MicroMsg.ExtContentProviderBase", "Binder.getCallingUid() = " + Binder.getCallingUid());
      this.iJO = paramContext.getPackageManager().getPackagesForUid(Binder.getCallingUid());
    } while (this.iJO != null);
    x.w("MicroMsg.ExtContentProviderBase", "m_pkgs == null");
  }
  
  private static String h(Uri paramUri)
  {
    if (paramUri == null) {
      return "";
    }
    return bi.oV(paramUri.getQueryParameter("appid"));
  }
  
  public final void H(int paramInt1, int paramInt2, int paramInt3)
  {
    x.i("MicroMsg.ExtContentProviderBase", "callingPkg = %s, appID = %s, apiID = %s, result = %s, timeCost = %s", new Object[] { aIW(), this.iJN, Integer.valueOf(this.iJP), Integer.valueOf(paramInt2), Integer.valueOf(aIV()) });
    h.mEJ.h(10505, new Object[] { aIW(), this.iJN, Integer.valueOf(this.iJP), Integer.valueOf(paramInt2), Integer.valueOf(aIV()), Integer.valueOf(paramInt3) });
    h.mEJ.a(300L, paramInt1, 1L, false);
  }
  
  protected final void a(Uri paramUri, Context paramContext, int paramInt)
  {
    this.iJN = h(paramUri);
    dg(paramContext);
    this.iJP = paramInt;
    this.iJL = bi.VG();
  }
  
  public final void a(Uri paramUri, Context paramContext, int paramInt, String[] paramArrayOfString)
  {
    this.iJN = h(paramUri);
    if (paramArrayOfString == null) {
      dg(paramContext);
    }
    for (;;)
    {
      this.iJP = paramInt;
      this.iJL = bi.VG();
      return;
      this.iJO = paramArrayOfString;
    }
  }
  
  protected final void a(Uri paramUri, Context paramContext, UriMatcher paramUriMatcher)
  {
    this.iJN = h(paramUri);
    dg(paramContext);
    if (paramUriMatcher != null)
    {
      this.iJP = paramUriMatcher.match(paramUri);
      if (this.iJP < 0) {
        this.iJP = 0;
      }
    }
    this.iJL = bi.VG();
  }
  
  public final String aIW()
  {
    if (!bi.oW(this.iJM)) {
      return this.iJM;
    }
    if ((this.iJO == null) || (this.iJO.length <= 0)) {
      return "";
    }
    return this.iJO[0];
  }
  
  public final int aIX()
  {
    if (bi.oW(this.iJN))
    {
      x.e("MicroMsg.ExtContentProviderBase", "invalid appid, ignore");
      return 7;
    }
    if ((this.iJO == null) || (this.iJO.length <= 0))
    {
      x.e("MicroMsg.ExtContentProviderBase", "packageList is null");
      return 6;
    }
    try
    {
      localf = g.bl(this.iJN, true);
      if (localf == null)
      {
        x.w("MicroMsg.ExtContentProviderBase", "app not reg, do nothing");
        return 13;
      }
      if (localf.field_status == 3)
      {
        x.e("MicroMsg.ExtContentProviderBase", "app is in blacklist.pkg:%s", new Object[] { localf.field_packageName });
        i = 10;
      }
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        try
        {
          int j;
          label220:
          this.iJM = ((String)localObject2);
          i = 1;
          if (i != 1) {}
        }
        catch (Exception localException2)
        {
          f localf;
          Object localObject1;
          Object localObject2;
          i = 1;
          continue;
        }
        try
        {
          localObject2 = (Integer)b.b.qxY.get(Integer.valueOf(this.iJP));
          localObject1 = localObject2;
          if (localObject2 == null)
          {
            cw(5, 16);
            x.i("MicroMsg.ExtContentProviderBase", "api flag = null");
            localObject1 = Integer.valueOf(64);
          }
          if (!g.a(localf, ((Integer)localObject1).intValue())) {
            i = 11;
          } else {
            x.e("MicroMsg.ExtContentProviderBase", "appInfoFlag not set");
          }
        }
        catch (Exception localException3) {}
      }
      localException1 = localException1;
      i = 0;
      x.e("MicroMsg.ExtContentProviderBase", "Exception in isAppidValid, %s", new Object[] { localException1.getMessage() });
      x.printErrStackTrace("MicroMsg.ExtContentProviderBase", localException1, "", new Object[0]);
      return i;
    }
    try
    {
      localObject1 = Long.valueOf(bi.a((Long)iJQ.get(this.iJN), 0L));
      x.i("MicroMsg.ExtContentProviderBase", "lastCheckTime = %s, current = %s", new Object[] { localObject1, Long.valueOf(System.currentTimeMillis()) });
      if (System.currentTimeMillis() - ((Long)localObject1).longValue() > 3600000L)
      {
        x.i("MicroMsg.ExtContentProviderBase", "update appInfo %s", new Object[] { this.iJN });
        a.a.bmm().Jp(this.iJN);
        iJQ.put(this.iJN, Long.valueOf(System.currentTimeMillis()));
      }
      return i;
    }
    catch (Exception localException4)
    {
      break label365;
      i = 0;
      break label281;
      i += 1;
      break label220;
    }
    localObject1 = this.iJO;
    j = localObject1.length;
    i = 0;
    if (i < j)
    {
      localObject2 = localObject1[i];
      if ((!((String)localObject2).equals(localf.field_packageName)) || (!p.c(ad.getContext(), localf, (String)localObject2))) {
        break label417;
      }
      x.i("MicroMsg.ExtContentProviderBase", "check app success, calling package name = %s", new Object[] { localObject2 });
    }
  }
  
  public final boolean atA()
  {
    try
    {
      x.i("MicroMsg.ExtContentProviderBase", "checkIsLogin()");
      if (!hdT)
      {
        b localb = new b();
        localb.b(4000L, new ExtContentProviderBase.1(this, localb));
      }
      if ((au.HX()) && (au.HW()) && (!au.Dr())) {}
      for (hdT = true;; hdT = false)
      {
        x.i("MicroMsg.ExtContentProviderBase", "hasLogin = " + hdT);
        return hdT;
      }
      return false;
    }
    catch (Exception localException)
    {
      x.w("MicroMsg.ExtContentProviderBase", localException.getMessage());
      x.printErrStackTrace("MicroMsg.ExtContentProviderBase", localException, "", new Object[0]);
    }
  }
  
  public final void cw(int paramInt1, int paramInt2)
  {
    x.i("MicroMsg.ExtContentProviderBase", "callingPkg = %s, appID = %s, apiID = %s, result = %s, timeCost = %s", new Object[] { aIW(), this.iJN, Integer.valueOf(this.iJP), Integer.valueOf(paramInt1), Integer.valueOf(aIV()) });
    h.mEJ.h(10505, new Object[] { aIW(), this.iJN, Integer.valueOf(this.iJP), Integer.valueOf(paramInt1), Integer.valueOf(aIV()), Integer.valueOf(paramInt2) });
  }
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
  
  public final boolean df(Context paramContext)
  {
    if (paramContext == null)
    {
      x.w("MicroMsg.ExtContentProviderBase", "in checkAppId(), context == null");
      return false;
    }
    if (bi.oW(this.iJN))
    {
      x.e("MicroMsg.ExtContentProviderBase", "invalid appid, ignore");
      return false;
    }
    if ((this.iJO == null) || (this.iJO.length <= 0))
    {
      x.e("MicroMsg.ExtContentProviderBase", "packageList is null");
      return false;
    }
    try
    {
      localf = g.bl(this.iJN, true);
      if (localf == null)
      {
        x.w("MicroMsg.ExtContentProviderBase", "app not reg, do nothing");
        return false;
      }
      if (localf.field_status == 3)
      {
        x.e("MicroMsg.ExtContentProviderBase", "app is in blacklist.pkg:%s", new Object[] { localf.field_packageName });
        bool = false;
      }
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        try
        {
          int j;
          label232:
          this.iJM = ((String)localObject);
          bool = true;
          if (!bool) {}
        }
        catch (Exception paramContext)
        {
          f localf;
          Object localObject;
          bool = true;
          continue;
        }
        try
        {
          localObject = (Integer)b.b.qxY.get(Integer.valueOf(this.iJP));
          paramContext = (Context)localObject;
          if (localObject == null) {
            paramContext = Integer.valueOf(64);
          }
          if (!g.a(localf, paramContext.intValue())) {
            bool = false;
          } else {
            x.e("MicroMsg.ExtContentProviderBase", "appInfoFlag not set");
          }
        }
        catch (Exception paramContext) {}
      }
      paramContext = paramContext;
      bool = false;
      x.e("MicroMsg.ExtContentProviderBase", "Exception in isAppidValid, %s", new Object[] { paramContext.getMessage() });
      x.printErrStackTrace("MicroMsg.ExtContentProviderBase", paramContext, "", new Object[0]);
      return bool;
    }
    try
    {
      paramContext = Long.valueOf(bi.a((Long)iJQ.get(this.iJN), 0L));
      x.i("MicroMsg.ExtContentProviderBase", "lastCheckTime = %s, current = %s", new Object[] { paramContext, Long.valueOf(System.currentTimeMillis()) });
      if (System.currentTimeMillis() - paramContext.longValue() > 3600000L)
      {
        x.i("MicroMsg.ExtContentProviderBase", "update appInfo %s", new Object[] { this.iJN });
        a.a.bmm().Jp(this.iJN);
        iJQ.put(this.iJN, Long.valueOf(System.currentTimeMillis()));
      }
      return bool;
    }
    catch (Exception paramContext)
    {
      break label364;
      bool = false;
      break label294;
      i += 1;
      break label232;
    }
    paramContext = this.iJO;
    j = paramContext.length;
    i = 0;
    if (i < j)
    {
      localObject = paramContext[i];
      if ((!((String)localObject).equals(localf.field_packageName)) || (!p.c(ad.getContext(), localf, (String)localObject))) {
        break label419;
      }
      x.i("MicroMsg.ExtContentProviderBase", "check app success, calling package name = %s", new Object[] { localObject });
    }
  }
  
  public String getType(Uri paramUri)
  {
    return null;
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }
  
  public boolean onCreate()
  {
    return true;
  }
  
  public final void pr(int paramInt)
  {
    x.i("MicroMsg.ExtContentProviderBase", "callingPkg = %s, appID = %s, apiID = %s, result = %s, timeCost = %s", new Object[] { aIW(), this.iJN, Integer.valueOf(this.iJP), Integer.valueOf(paramInt), Integer.valueOf(aIV()) });
    h.mEJ.h(10505, new Object[] { aIW(), this.iJN, Integer.valueOf(this.iJP), Integer.valueOf(paramInt), Integer.valueOf(aIV()) });
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    return null;
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/ext/provider/ExtContentProviderBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */