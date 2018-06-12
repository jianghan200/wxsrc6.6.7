package com.tencent.mm.pluginsdk.model.app;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.q;
import com.tencent.mm.opensdk.channel.MMessageActV2;
import com.tencent.mm.opensdk.channel.MMessageActV2.Args;
import com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.ac.a.a.a;
import com.tencent.mm.plugin.comm.a.d;
import com.tencent.mm.plugin.comm.a.h;
import com.tencent.mm.pluginsdk.b.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class g
{
  private static List<f> BI(int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    if (a.a.bmm() == null) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppInfoLogic", "getServiceByAppInfoFlagAndShowFlag, getISubCorePluginBase() == null");
    }
    Cursor localCursor;
    do
    {
      return localArrayList;
      localCursor = a.a.bmm().dh(1, paramInt);
    } while (localCursor == null);
    while (localCursor.moveToNext())
    {
      f localf = new f();
      localf.d(localCursor);
      if (!bi.oW(localf.field_openId)) {
        localArrayList.add(localf);
      }
    }
    localCursor.close();
    return localArrayList;
  }
  
  public static f Jn(String paramString)
  {
    return bl(paramString, true);
  }
  
  public static boolean SS(String paramString)
  {
    if (bi.oW(paramString)) {}
    do
    {
      do
      {
        return false;
        paramString = bl(paramString, true);
      } while ((paramString == null) || (bi.oW(paramString.field_appId)));
      if (paramString.field_appId.equals("wx7fa037cc7dfabad5")) {
        return true;
      }
    } while ((paramString.field_appInfoFlag & 0x8) <= 0);
    return true;
  }
  
  public static boolean U(Context paramContext, int paramInt)
  {
    Long localLong = b.a.Sy(String.valueOf(paramInt));
    if (localLong == null) {}
    while (b(paramContext, localLong.longValue(), true).size() == 0) {
      return false;
    }
    return true;
  }
  
  public static List<f> a(Context paramContext, boolean paramBoolean, int paramInt)
  {
    Object localObject1 = new ArrayList();
    if (a.a.bmm() == null) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppInfoLogic", "getISubCorePluginBase() == null");
    }
    List localList;
    Object localObject2;
    do
    {
      do
      {
        return (List<f>)localObject1;
        localList = BI(paramInt);
        localObject2 = null;
        if (paramBoolean)
        {
          localObject2 = new int[1];
          localObject2[0] = 5;
        }
        localObject1 = localList;
      } while (localObject2 == null);
      localObject2 = a.a.bmm().n((int[])localObject2);
      localObject1 = localList;
    } while (localObject2 == null);
    while (((Cursor)localObject2).moveToNext())
    {
      localObject1 = new f();
      ((f)localObject1).d((Cursor)localObject2);
      if (((f)localObject1).field_status == 1)
      {
        if (r(paramContext, ((f)localObject1).field_appId))
        {
          if (!bi.oW(((f)localObject1).field_signature)) {
            localList.add(localObject1);
          }
        }
        else
        {
          ((f)localObject1).field_status = 4;
          a.a.bmm().e((f)localObject1);
        }
      }
      else if (((f)localObject1).field_signature != null) {
        localList.add(localObject1);
      }
    }
    ((Cursor)localObject2).close();
    return localList;
  }
  
  public static boolean a(Context paramContext, Intent paramIntent, String paramString)
  {
    return a(paramContext, paramIntent, paramString, null, null);
  }
  
  public static boolean a(Context paramContext, Intent paramIntent, String paramString, int paramInt, a parama, Bundle paramBundle)
  {
    if ((paramContext == null) || (paramIntent == null))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppInfoLogic", "launchApp failed, context or intent is null.");
      if (parama != null) {
        parama.cI(false);
      }
      return false;
    }
    String str;
    if (paramBundle != null)
    {
      localObject = paramBundle.getString("current_page_url", "");
      str = paramBundle.getString("current_page_appid", "");
      paramBundle = (Bundle)localObject;
      localObject = bi.B(paramContext, paramIntent);
      if ((localObject == null) || (((List)localObject).isEmpty())) {
        break label325;
      }
      if ((!TextUtils.isEmpty(paramIntent.getPackage())) || (((List)localObject).size() != 1)) {
        break label184;
      }
    }
    label184:
    for (Object localObject = b((ResolveInfo)((List)localObject).get(0));; localObject = paramIntent.getPackage())
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AppInfoLogic", "launchApp, wxpkg : %s.", new Object[] { ad.getPackageName() });
      if (!bi.oV(ad.getPackageName()).equals(localObject)) {
        break label193;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppInfoLogic", "launchApp failed, can not launch wechat page.");
      if (parama != null) {
        parama.cI(false);
      }
      return false;
      paramBundle = "";
      str = "";
      break;
    }
    label193:
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppInfoLogic", "launchApp(pkg : %s) by wechat with intent", new Object[] { localObject });
    if (paramInt == 2)
    {
      paramContext.startActivity(paramIntent);
      if (parama != null) {
        parama.cI(true);
      }
      return true;
    }
    if (!TextUtils.isEmpty(paramString)) {}
    for (paramString = paramContext.getString(a.h.launch_3rd_detail_app_tips, new Object[] { paramString });; paramString = paramContext.getString(a.h.launch_3rd_app_tips))
    {
      com.tencent.mm.ui.base.h.a(paramContext, paramString, "", paramContext.getString(a.h.launch_3rd_app_confirm), paramContext.getString(a.h.app_cancel), false, new g.4(paramContext, paramIntent, (String)localObject, paramBundle, str, parama), new g.5((String)localObject, paramBundle, str, parama));
      return true;
    }
    label325:
    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.AppInfoLogic", "launchApp failed, not activity can resolve the intent.");
    if (parama != null) {
      parama.cI(false);
    }
    return false;
  }
  
  public static boolean a(Context paramContext, Intent paramIntent, String paramString, a parama)
  {
    return a(paramContext, paramIntent, paramString, parama, null);
  }
  
  public static boolean a(Context paramContext, Intent paramIntent, String paramString, a parama, Bundle paramBundle)
  {
    return a(paramContext, paramIntent, paramString, 0, parama, paramBundle);
  }
  
  public static boolean a(Context paramContext, f paramf)
  {
    if (paramf == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.AppInfoLogic", "app is null");
      return false;
    }
    if ((paramf.field_packageName == null) || (paramf.field_packageName.length() == 0))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.AppInfoLogic", "field_packageName is null");
      return false;
    }
    return p.r(paramContext, paramf.field_packageName);
  }
  
  public static boolean a(Context paramContext, String paramString, WXMediaMessage paramWXMediaMessage, int paramInt, a parama, Bundle paramBundle)
  {
    if (paramContext == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppInfoLogic", "launch app failed: context is null");
      if (parama != null) {
        parama.cI(false);
      }
    }
    f localf;
    label148:
    do
    {
      do
      {
        do
        {
          return false;
          if (!bi.oW(paramString)) {
            break;
          }
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppInfoLogic", "launch app failed: appid is null or nil");
        } while (parama == null);
        parama.cI(false);
        return false;
        if (paramWXMediaMessage != null) {
          break;
        }
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppInfoLogic", "launch app failed: wxMsg is null");
      } while (parama == null);
      parama.cI(false);
      return false;
      if (Looper.myLooper() == Looper.getMainLooper()) {}
      for (localf = cP(paramString, Integer.MAX_VALUE);; localf = bk(paramString, false))
      {
        if (localf != null) {
          break label148;
        }
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppInfoLogic", "get appinfo is null, appid is : [%s]", new Object[] { paramString });
        if (parama == null) {
          break;
        }
        parama.cI(false);
        return false;
      }
      if (localf.field_status != 3) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppInfoLogic", "requestAppShow fail, app is in blacklist, packageName = " + localf.field_packageName);
    } while (parama == null);
    parama.cI(false);
    return false;
    return a(paramContext, localf.field_packageName, paramWXMediaMessage, paramString, localf.field_openId, paramInt, parama, paramBundle);
  }
  
  public static boolean a(Context paramContext, String paramString1, WXMediaMessage paramWXMediaMessage, String paramString2, String paramString3, int paramInt, a parama, Bundle paramBundle)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AppInfoLogic", "request pkg = " + paramString1 + ", openId = " + paramString3);
    return a(paramContext, paramString1, paramString2, c(paramContext, paramWXMediaMessage, paramString3), paramInt, parama, paramBundle);
  }
  
  public static boolean a(final Context paramContext, final String paramString1, String paramString2, ShowMessageFromWX.Req paramReq, int paramInt, final a parama, Bundle paramBundle)
  {
    if (paramReq == null)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppInfoLogic", "launchApp failed, req is null.");
      if (parama != null) {
        parama.cI(false);
      }
      return false;
    }
    if ((TextUtils.isEmpty(paramString1)) || (!p.r(paramContext, paramString1)))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppInfoLogic", "launchApp failed, pkg is null or application has not installed.");
      com.tencent.mm.ui.base.h.bA(paramContext, paramContext.getString(a.h.chatting_send_app_not_installed));
      if (parama != null) {
        parama.cI(false);
      }
      return false;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppInfoLogic", "launchApp(pkg : %s) with appId(%s)", new Object[] { paramString1, paramString2 });
    if (bi.oV(ad.getPackageName()).equals(paramString1))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppInfoLogic", "launchApp failed, can not launch wechat page.");
      if (parama != null) {
        parama.cI(false);
      }
      return false;
    }
    Runnable local1 = new Runnable()
    {
      public final void run()
      {
        Bundle localBundle = new Bundle();
        this.qzI.toBundle(localBundle);
        p.ae(localBundle);
        p.af(localBundle);
        MMessageActV2.Args localArgs = new MMessageActV2.Args();
        localArgs.targetPkgName = paramString1;
        localArgs.bundle = localBundle;
        boolean bool = MMessageActV2.send(paramContext, localArgs);
        if (parama != null) {
          parama.cI(bool);
        }
      }
    };
    if (paramInt == 2)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppInfoLogic", "launchApp with show confirm dialog(%s).", new Object[] { paramString1 });
      local1.run();
      return true;
    }
    Object localObject;
    if (paramBundle != null)
    {
      paramReq = paramBundle.getString("current_page_url", "");
      paramBundle = paramBundle.getString("current_page_appid", "");
      localObject = bl(paramString2, true);
      if (localObject == null) {
        break label373;
      }
      localObject = paramContext.getString(a.h.launch_3rd_detail_app_tips, new Object[] { b(paramContext, (f)localObject, null) });
      label238:
      if (paramString2 != null) {
        break label385;
      }
      paramString2 = "";
    }
    label373:
    label385:
    for (;;)
    {
      if ("wx073f4a4daff0abe8".equalsIgnoreCase(paramString2)) {
        com.tencent.mm.plugin.report.service.h.mEJ.h(15413, new Object[] { Integer.valueOf(1), "", "" });
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppInfoLogic", "launchApp with args(showType : %s, pkg : %s)", new Object[] { Integer.valueOf(paramInt), paramString1 });
      com.tencent.mm.ui.base.h.a(paramContext, (String)localObject, "", paramContext.getString(a.h.launch_3rd_app_confirm), paramContext.getString(a.h.app_cancel), false, new g.2(paramString1, paramReq, paramBundle, paramString2, local1), new g.3(paramString1, paramReq, paramBundle, paramString2, parama));
      return true;
      paramReq = "";
      paramBundle = "";
      break;
      localObject = paramContext.getString(a.h.launch_3rd_app_tips);
      break label238;
    }
  }
  
  public static boolean a(f paramf, int paramInt)
  {
    if ((paramf == null) || (bi.oW(paramf.field_appId))) {
      return false;
    }
    if ((paramf.field_appInfoFlag & paramInt) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppInfoLogic", "isAppHasFlag, appid = %s, flag = %s, ret = %b", new Object[] { paramf.field_appId, Integer.valueOf(paramInt), Boolean.valueOf(bool) });
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppInfoLogic", "appInfoFlag = " + paramf.field_appInfoFlag);
      return bool;
    }
  }
  
  public static Bitmap b(String paramString, int paramInt, float paramFloat)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppInfoLogic", "getAppIcon, appId is null");
    }
    Bitmap localBitmap;
    do
    {
      do
      {
        do
        {
          do
          {
            return null;
          } while (!com.tencent.mm.kernel.g.Eg().Dx());
          if (com.tencent.mm.kernel.g.Ei().isSDCardAvailable()) {
            break;
          }
        } while ((ad.getContext() == null) || (ad.getContext().getResources() == null));
        switch (paramInt)
        {
        case 2: 
        default: 
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppInfoLogic", "getAppIcon, unknown iconType = " + paramInt);
          return null;
        }
        paramString = BitmapFactory.decodeResource(ad.getContext().getResources(), a.d.sharemore_nosdcard_icon);
      } while ((paramString == null) || (paramString.isRecycled()));
      return paramString;
      localBitmap = a.a.bmm().a(paramString, paramInt, paramFloat);
      if (localBitmap == null)
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.AppInfoLogic", "getAppIcon, bm does not exist or has been recycled");
        a.a.bmm().bS(paramString, paramInt);
        return null;
      }
    } while (localBitmap.isRecycled());
    return localBitmap;
  }
  
  public static String b(Context paramContext, f paramf, String paramString)
  {
    if ((paramContext == null) || (paramf == null)) {}
    label110:
    label134:
    label175:
    label183:
    label191:
    label197:
    for (;;)
    {
      return paramString;
      String str = eS(paramContext);
      Object localObject = null;
      if (str.equalsIgnoreCase("zh_CN")) {
        localObject = paramf.field_appName;
      }
      if (str.equalsIgnoreCase("en"))
      {
        if (bi.oW(paramf.field_appName_en)) {
          localObject = paramf.field_appName;
        }
      }
      else
      {
        if (!str.equalsIgnoreCase("zh_TW"))
        {
          paramContext = (Context)localObject;
          if (!str.equalsIgnoreCase("zh_HK")) {}
        }
        else
        {
          if (str.equalsIgnoreCase("zh_HK"))
          {
            if (!bi.oW(paramf.field_appName_hk)) {
              break label175;
            }
            localObject = paramf.field_appName_tw;
          }
          paramContext = (Context)localObject;
          if (bi.oW((String)localObject))
          {
            if (!bi.oW(paramf.field_appName_tw)) {
              break label183;
            }
            paramContext = paramf.field_appName;
          }
        }
        localObject = paramContext;
        if (bi.oW(paramContext)) {
          if (!bi.oW(paramf.field_appName_en)) {
            break label191;
          }
        }
      }
      for (localObject = paramf.field_appName;; localObject = paramf.field_appName_en)
      {
        if (bi.oW((String)localObject)) {
          break label197;
        }
        return (String)localObject;
        localObject = paramf.field_appName_en;
        break;
        localObject = paramf.field_appName_hk;
        break label110;
        paramContext = paramf.field_appName_tw;
        break label134;
      }
    }
  }
  
  public static String b(ResolveInfo paramResolveInfo)
  {
    Object localObject;
    if (paramResolveInfo == null) {
      localObject = null;
    }
    do
    {
      String str;
      do
      {
        return (String)localObject;
        str = paramResolveInfo.resolvePackageName;
        localObject = str;
      } while (!TextUtils.isEmpty(str));
      localObject = str;
    } while (paramResolveInfo.activityInfo == null);
    return paramResolveInfo.activityInfo.packageName;
  }
  
  public static List<f> b(Context paramContext, long paramLong, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = com.tencent.mm.plugin.ac.a.bmf();
    Object localObject2 = new StringBuilder(256);
    ((StringBuilder)localObject2).append("select * from AppInfo");
    ((StringBuilder)localObject2).append(" where ");
    ((StringBuilder)localObject2).append(" ( appSupportContentType & ").append(paramLong).append(" ) != 0");
    ((StringBuilder)localObject2).append(" and  ( svrAppSupportContentType & ").append(paramLong).append(" ) != 0");
    ((StringBuilder)localObject2).append(" and  ( appInfoFlag & 8192 ) != 0");
    ((StringBuilder)localObject2).append(" and status != 4");
    if (!paramBoolean) {
      ((StringBuilder)localObject2).append(" and  ( appInfoFlag & 16384 ) == 0");
    }
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.AppInfoStorage", "getAppInfoByContentFlag sql %s", new Object[] { ((StringBuilder)localObject2).toString() });
    localObject2 = ((i)localObject1).rawQuery(((StringBuilder)localObject2).toString(), new String[0]);
    localObject1 = localObject2;
    if (localObject2 == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppInfoStorage", "getAppByStatus : cursor is null");
      localObject1 = null;
    }
    if (localObject1 == null) {
      return localArrayList;
    }
    while (((Cursor)localObject1).moveToNext())
    {
      localObject2 = new f();
      ((f)localObject2).d((Cursor)localObject1);
      if (((f)localObject2).field_status == 1)
      {
        if (r(paramContext, ((f)localObject2).field_appId))
        {
          if (!bi.oW(((f)localObject2).field_signature)) {
            localArrayList.add(localObject2);
          }
        }
        else
        {
          ((f)localObject2).field_status = 4;
          a.a.bmm().e((f)localObject2);
        }
      }
      else if (((f)localObject2).field_signature != null) {
        localArrayList.add(localObject2);
      }
    }
    ((Cursor)localObject1).close();
    return localArrayList;
  }
  
  public static f bk(String paramString, boolean paramBoolean)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppInfoLogic", "getAppInfo, appId is null");
      return null;
    }
    com.tencent.mm.plugin.ac.a.a locala = a.a.bmm();
    if (locala == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppInfoLogic", "getISubCorePluginBase() == null");
      return null;
    }
    if (paramBoolean) {
      return locala.Jo(paramString);
    }
    f localf = locala.Jn(paramString);
    if (localf == null) {
      return locala.Jo(paramString);
    }
    locala.Jp(paramString);
    return localf;
  }
  
  public static f bl(String paramString, boolean paramBoolean)
  {
    Object localObject = null;
    if ((paramString == null) || (paramString.length() == 0)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppInfoLogic", "getAppInfo, appId is null");
    }
    f localf;
    do
    {
      return (f)localObject;
      if (a.a.bmm() == null)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppInfoLogic", "getISubCorePluginBase() == null");
        return null;
      }
      localf = a.a.bmm().Jn(paramString);
      localObject = localf;
    } while (!paramBoolean);
    if ((localf == null) || (localf.field_appName == null) || (localf.field_appName.length() == 0)) {}
    for (int i = 1;; i = 0)
    {
      localObject = localf;
      if (i == 0) {
        break;
      }
      a.a.bmm().Jp(paramString);
      return localf;
    }
  }
  
  public static ShowMessageFromWX.Req c(Context paramContext, WXMediaMessage paramWXMediaMessage, String paramString)
  {
    ShowMessageFromWX.Req localReq = new ShowMessageFromWX.Req();
    Context localContext = paramContext;
    if (paramContext == null) {
      localContext = ad.getContext();
    }
    localReq.message = paramWXMediaMessage;
    localReq.transaction = com.tencent.mm.a.g.u(bi.VF().getBytes());
    localReq.openId = paramString;
    localReq.lang = w.d(localContext.getSharedPreferences(ad.chY(), 0));
    localReq.country = ((String)com.tencent.mm.kernel.g.Ei().DT().get(274436, null));
    return localReq;
  }
  
  public static f cP(String paramString, int paramInt)
  {
    Object localObject = null;
    if ((paramString == null) || (paramString.length() == 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppInfoLogic", "getAppInfo, appId is null");
      return (f)localObject;
    }
    if (a.a.bmm() == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppInfoLogic", "getISubCorePluginBase() == null");
      return null;
    }
    f localf = a.a.bmm().Jn(paramString);
    if ((localf == null) || (localf.field_appVersion < paramInt)) {}
    for (paramInt = 1;; paramInt = 0)
    {
      localObject = localf;
      if (paramInt == 0) {
        break;
      }
      a.a.bmm().Jp(paramString);
      return localf;
    }
  }
  
  public static boolean cT(String paramString)
  {
    return (paramString != null) && (paramString.trim().length() != 0) && (!paramString.equals("weixinfile")) && (!paramString.equals("invalid_appname"));
  }
  
  public static boolean cU(String paramString)
  {
    if (bi.oW(paramString)) {
      return false;
    }
    f localf = bl(paramString, false);
    if (localf == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.AppInfoLogic", "app is null, appId = " + paramString);
      return false;
    }
    return localf.aaq();
  }
  
  public static void cbM()
  {
    SharedPreferences localSharedPreferences = ad.chZ();
    if (localSharedPreferences != null) {
      localSharedPreferences.edit().putString("key_app_ids_registion_while_not_login", "").commit();
    }
  }
  
  public static List<f> eR(Context paramContext)
  {
    ArrayList localArrayList = new ArrayList();
    if (a.a.bmm() == null) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppInfoLogic", "getISubCorePluginBase() == null");
    }
    Cursor localCursor;
    do
    {
      return localArrayList;
      localCursor = a.a.bmm().bmj();
    } while (localCursor == null);
    while (localCursor.moveToNext())
    {
      f localf = new f();
      localf.d(localCursor);
      if (localf.field_status == 1)
      {
        if (r(paramContext, localf.field_appId))
        {
          if (!bi.oW(localf.field_signature)) {
            localArrayList.add(localf);
          }
        }
        else
        {
          localf.field_status = 4;
          a.a.bmm().e(localf);
        }
      }
      else if (localf.field_signature != null) {
        localArrayList.add(localf);
      }
    }
    localCursor.close();
    return localArrayList;
  }
  
  public static String eS(Context paramContext)
  {
    String str = w.d(paramContext.getSharedPreferences(ad.chY(), 0));
    if ((str != null) && (str.length() != 0))
    {
      paramContext = str;
      if (!str.equalsIgnoreCase("zh_CN")) {}
    }
    else
    {
      paramContext = "zh_CN";
    }
    return paramContext;
  }
  
  public static boolean f(Context paramContext, Uri paramUri)
  {
    if ((paramContext == null) || (paramUri == null))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppInfoLogic", "launchApp failed, context or uri is null.");
      return false;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppInfoLogic", "try to launchApp with uri.");
    paramUri = new Intent("android.intent.action.VIEW", paramUri);
    paramUri.addFlags(268435456);
    return a(paramContext, paramUri, null, null, null);
  }
  
  public static boolean g(f paramf)
  {
    if ((paramf == null) || (bi.oW(paramf.field_appId))) {}
    while ((paramf.field_appInfoFlag & 0x1) <= 0) {
      return false;
    }
    return true;
  }
  
  public static boolean h(f paramf)
  {
    if (paramf == null) {}
    while ((paramf.field_appInfoFlag & 0x2) == 0) {
      return true;
    }
    return false;
  }
  
  public static boolean i(f paramf)
  {
    if ((paramf == null) || (bi.oW(paramf.field_appId))) {
      return false;
    }
    if ((paramf.field_appInfoFlag & 0x40) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.AppInfoLogic", "canReadMMMsg, appid = %s, ret = %b", new Object[] { paramf.field_appId, Boolean.valueOf(bool) });
      return bool;
    }
  }
  
  public static boolean j(f paramf)
  {
    if ((paramf == null) || (bi.oW(paramf.field_appId))) {
      return false;
    }
    int i;
    HashMap localHashMap;
    if ((paramf.field_appInfoFlag & 0x80) > 0)
    {
      i = 1;
      if (1 != i) {
        break label100;
      }
      paramf = paramf.field_appId;
      localHashMap = new HashMap();
      q.q(localHashMap);
      if (!localHashMap.containsKey(paramf)) {
        break label93;
      }
    }
    label93:
    for (paramf = (String)localHashMap.get(paramf);; paramf = null)
    {
      if ((paramf != null) && (!paramf.equals("0"))) {
        break label98;
      }
      return true;
      i = 0;
      break;
    }
    label98:
    return false;
    label100:
    return false;
  }
  
  public static boolean m(Context paramContext, long paramLong)
  {
    boolean bool = true;
    if (b(paramContext, paramLong, true).size() == 0) {
      bool = false;
    }
    return bool;
  }
  
  public static String q(Context paramContext, String paramString)
  {
    return b(paramContext, bl(paramString, true), null);
  }
  
  public static boolean r(Context paramContext, String paramString)
  {
    if ((paramContext == null) || (paramString == null) || (paramString.length() == 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppInfoLogic", "isAppInstalled, invalid arguments");
      return false;
    }
    return a(paramContext, bl(paramString, true));
  }
  
  public static abstract interface a
  {
    public abstract void cI(boolean paramBoolean);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/pluginsdk/model/app/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */