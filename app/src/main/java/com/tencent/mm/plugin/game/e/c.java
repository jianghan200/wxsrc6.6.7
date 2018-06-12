package com.tencent.mm.plugin.game.e;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.HandlerThread;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.tencent.mm.g.a.kk;
import com.tencent.mm.plugin.appbrand.n.d;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.game.f.f;
import com.tencent.mm.plugin.game.f.j;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.plugin.game.model.b;
import com.tencent.mm.plugin.game.model.b.a;
import com.tencent.mm.plugin.game.model.s;
import com.tencent.mm.plugin.game.model.s.a;
import com.tencent.mm.pluginsdk.model.app.m;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.vending.h.h;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;

public final class c
{
  private static volatile ah dJt;
  private static int ecH;
  private static final Object gBw = new Object();
  private static DisplayMetrics jZh;
  private static int kdi;
  private static int maxSize = -1;
  private static Rect rect = new Rect();
  
  static
  {
    ecH = -1;
    kdi = -1;
  }
  
  public static int DP(String paramString)
  {
    if (bi.oW(paramString)) {
      x.w("MicroMsg.GameCenterUtil", "Null or Nil packageName");
    }
    for (;;)
    {
      return 0;
      try
      {
        paramString = ad.getContext().getPackageManager().getPackageInfo(paramString, 0);
        if (paramString == null) {
          continue;
        }
        return paramString.versionCode;
      }
      catch (Exception paramString)
      {
        for (;;)
        {
          x.w("MicroMsg.GameCenterUtil", "Exception: %s", new Object[] { paramString.toString() });
          paramString = null;
        }
      }
    }
  }
  
  public static int DQ(String paramString)
  {
    if (bi.oW(paramString)) {
      x.w("MicroMsg.GameCenterUtil", "Null or Nil path");
    }
    do
    {
      return 0;
      paramString = ad.getContext().getPackageManager().getPackageArchiveInfo(paramString, 0);
    } while (paramString == null);
    return paramString.versionCode;
  }
  
  /* Error */
  public static void DR(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_0
    //   4: invokestatic 45	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   7: istore_1
    //   8: iload_1
    //   9: ifeq +7 -> 16
    //   12: ldc 2
    //   14: monitorexit
    //   15: return
    //   16: ldc 47
    //   18: ldc 97
    //   20: iconst_1
    //   21: anewarray 4	java/lang/Object
    //   24: dup
    //   25: iconst_0
    //   26: aload_0
    //   27: aastore
    //   28: invokestatic 100	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   31: new 102	com/tencent/mm/g/a/gq
    //   34: dup
    //   35: invokespecial 103	com/tencent/mm/g/a/gq:<init>	()V
    //   38: astore_2
    //   39: aload_2
    //   40: getfield 107	com/tencent/mm/g/a/gq:bPN	Lcom/tencent/mm/g/a/gq$a;
    //   43: iconst_1
    //   44: putfield 112	com/tencent/mm/g/a/gq$a:nc	I
    //   47: aload_2
    //   48: getfield 107	com/tencent/mm/g/a/gq:bPN	Lcom/tencent/mm/g/a/gq$a;
    //   51: aload_0
    //   52: putfield 116	com/tencent/mm/g/a/gq$a:url	Ljava/lang/String;
    //   55: getstatic 122	com/tencent/mm/sdk/b/a:sFg	Lcom/tencent/mm/sdk/b/a;
    //   58: aload_2
    //   59: invokevirtual 126	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   62: pop
    //   63: aload_2
    //   64: getfield 130	com/tencent/mm/g/a/gq:bPO	Lcom/tencent/mm/g/a/gq$b;
    //   67: getfield 136	com/tencent/mm/g/a/gq$b:bPQ	Z
    //   70: ifeq -58 -> 12
    //   73: new 138	java/lang/StringBuilder
    //   76: dup
    //   77: invokespecial 139	java/lang/StringBuilder:<init>	()V
    //   80: aload_2
    //   81: getfield 130	com/tencent/mm/g/a/gq:bPO	Lcom/tencent/mm/g/a/gq$b;
    //   84: getfield 142	com/tencent/mm/g/a/gq$b:bPP	Ljava/lang/String;
    //   87: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: aload_0
    //   91: invokevirtual 152	java/lang/String:getBytes	()[B
    //   94: invokestatic 158	com/tencent/mm/a/g:u	([B)Ljava/lang/String;
    //   97: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: invokevirtual 159	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   103: astore_3
    //   104: new 161	com/tencent/mm/ak/a/a/c$a
    //   107: dup
    //   108: invokespecial 162	com/tencent/mm/ak/a/a/c$a:<init>	()V
    //   111: astore 4
    //   113: aload 4
    //   115: iconst_1
    //   116: putfield 165	com/tencent/mm/ak/a/a/c$a:dXy	Z
    //   119: aload 4
    //   121: aload_3
    //   122: putfield 168	com/tencent/mm/ak/a/a/c$a:dXA	Ljava/lang/String;
    //   125: aload 4
    //   127: invokevirtual 172	com/tencent/mm/ak/a/a/c$a:Pt	()Lcom/tencent/mm/ak/a/a/c;
    //   130: astore_3
    //   131: invokestatic 178	com/tencent/mm/ak/o:Pj	()Lcom/tencent/mm/ak/a/a;
    //   134: aload_0
    //   135: aconst_null
    //   136: aload_3
    //   137: new 180	com/tencent/mm/plugin/game/e/c$2
    //   140: dup
    //   141: aload_2
    //   142: invokespecial 183	com/tencent/mm/plugin/game/e/c$2:<init>	(Lcom/tencent/mm/g/a/gq;)V
    //   145: new 185	com/tencent/mm/plugin/game/e/c$3
    //   148: dup
    //   149: aload_2
    //   150: invokespecial 186	com/tencent/mm/plugin/game/e/c$3:<init>	(Lcom/tencent/mm/g/a/gq;)V
    //   153: invokevirtual 192	com/tencent/mm/ak/a/a:a	(Ljava/lang/String;Landroid/widget/ImageView;Lcom/tencent/mm/ak/a/a/c;Lcom/tencent/mm/ak/a/c/i;Lcom/tencent/mm/ak/a/c/g;)V
    //   156: goto -144 -> 12
    //   159: astore_0
    //   160: ldc 2
    //   162: monitorexit
    //   163: aload_0
    //   164: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	165	0	paramString	String
    //   7	2	1	bool	boolean
    //   38	112	2	localgq	com.tencent.mm.g.a.gq
    //   103	34	3	localObject	Object
    //   111	15	4	locala	com.tencent.mm.ak.a.a.c.a
    // Exception table:
    //   from	to	target	type
    //   3	8	159	finally
    //   16	156	159	finally
  }
  
  public static ah Em()
  {
    if (dJt == null) {}
    synchronized (gBw)
    {
      if (dJt == null)
      {
        dJt = new ah("SubCoreGameCenter#WorkThread");
        com.tencent.mm.vending.h.g.a("SubCoreGameCenter#WorkThread", new h(dJt.lnJ.getLooper(), "SubCoreGameCenter#WorkThread"));
      }
      return dJt;
    }
  }
  
  public static void R(LinkedList<String> paramLinkedList)
  {
    if (bi.cX(paramLinkedList)) {}
    LinkedList localLinkedList;
    do
    {
      return;
      localLinkedList = new LinkedList();
      paramLinkedList = paramLinkedList.iterator();
      while (paramLinkedList.hasNext())
      {
        String str = (String)paramLinkedList.next();
        com.tencent.mm.pluginsdk.model.app.f localf = com.tencent.mm.pluginsdk.model.app.g.bl(str, true);
        if ((localf != null) && (bi.oW(localf.field_openId))) {
          localLinkedList.add(str);
        }
      }
    } while (bi.cX(localLinkedList));
    com.tencent.mm.plugin.ac.a.bmh().cS(localLinkedList);
  }
  
  public static void a(Context paramContext, s params, String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", params.jMI.url);
    localIntent.putExtra("finishviewifloadfailed", true);
    localIntent.putExtra("show_full_screen", params.jMI.jMc);
    localIntent.putExtra("disable_progress_bar", params.jMI.jMc);
    int i = -1;
    switch (params.jMI.orientation)
    {
    }
    for (;;)
    {
      localIntent.putExtra("screen_orientation", i);
      localIntent.putExtra("geta8key_scene", 32);
      localIntent.putExtra("KPublisherId", paramString);
      params = new kk();
      params.bUK.type = 1;
      params.bUK.context = paramContext;
      params.bUK.intent = localIntent;
      com.tencent.mm.sdk.b.a.sFg.m(params);
      return;
      i = 0;
      continue;
      i = 1;
      continue;
      i = 1001;
      continue;
      i = 1002;
    }
  }
  
  public static boolean a(View paramView, Context paramContext)
  {
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof String)))
    {
      x.e("MicroMsg.GameCenterUtil", "Invalid Jump URL");
      return false;
    }
    paramView = (String)paramView.getTag();
    if (bi.oW(paramView))
    {
      x.e("MicroMsg.GameCenterUtil", "Invalid Jump URL");
      return false;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramView);
    localIntent.putExtra("show_bottom", false);
    x(localIntent, paramContext);
    return true;
  }
  
  public static boolean a(String paramString1, String paramString2, int paramInt, long paramLong, String paramString3)
  {
    if (com.tencent.mm.plugin.downloader.e.a.yW(paramString1))
    {
      an.a(paramString2, paramInt, 4, paramLong, paramString3);
      return true;
    }
    return false;
  }
  
  public static LinkedList<com.tencent.mm.pluginsdk.model.app.f> aVi()
  {
    Cursor localCursor = com.tencent.mm.plugin.ac.a.bmf().cbP();
    LinkedList localLinkedList = new LinkedList();
    if (localCursor == null)
    {
      x.e("MicroMsg.GameCenterUtil", "getGameAppInfo failed: curosr is null");
      return localLinkedList;
    }
    if (localCursor.moveToFirst()) {
      do
      {
        com.tencent.mm.pluginsdk.model.app.f localf = new com.tencent.mm.pluginsdk.model.app.f();
        localf.d(localCursor);
        localLinkedList.add(localf);
      } while (localCursor.moveToNext());
    }
    localCursor.close();
    return localLinkedList;
  }
  
  public static int an(Context paramContext, String paramString)
  {
    return r(paramContext, paramString, null);
  }
  
  public static boolean ao(Context paramContext, String paramString)
  {
    int j = 2;
    paramString = Uri.parse(paramString).getQueryParameter("weapp");
    if (!bi.oW(paramString)) {}
    for (;;)
    {
      int i;
      try
      {
        Object localObject1 = Uri.parse(paramString);
        paramString = ((Uri)localObject1).getAuthority();
        if (bi.oW(paramString))
        {
          x.w("MicroMsg.GameCenterUtil", "targetAppId is null");
          return false;
        }
        localObject2 = ((Uri)localObject1).getQueryParameter("env_version");
        localObject1 = ((Uri)localObject1).getQueryParameter("path");
        localObject2 = bi.oV((String)localObject2);
        i = -1;
        switch (((String)localObject2).hashCode())
        {
        case 1559690845: 
          x.i("MicroMsg.GameCenterUtil", "jumpWeApp, appId: %s, versionType: %d, path: %s", new Object[] { paramString, Integer.valueOf(j), localObject1 });
          localObject2 = new AppBrandStatObject();
          ((AppBrandStatObject)localObject2).scene = 1079;
          ((d)com.tencent.mm.kernel.g.l(d.class)).a(paramContext, null, paramString, j, 0, (String)localObject1, (AppBrandStatObject)localObject2);
          return true;
        }
      }
      catch (Exception paramContext)
      {
        Object localObject2;
        boolean bool;
        x.e("MicroMsg.GameCenterUtil", "checkJumpWeApp: " + paramContext.getMessage());
      }
      if (((String)localObject2).equals("develop"))
      {
        i = 0;
        break label247;
        bool = ((String)localObject2).equals("trial");
        if (bool)
        {
          i = 1;
          break label247;
          j = 1;
          continue;
          return false;
        }
      }
      label247:
      switch (i)
      {
      }
      j = 0;
    }
  }
  
  public static void aox()
  {
    if (dJt == null) {
      return;
    }
    synchronized (gBw)
    {
      if (dJt != null)
      {
        com.tencent.mm.vending.h.g.abF("SubCoreGameCenter#WorkThread");
        dJt.lnJ.quit();
        dJt = null;
      }
      return;
    }
  }
  
  public static int ap(Context paramContext, String paramString)
  {
    if (bi.oW(paramString)) {
      return 0;
    }
    String str = com.tencent.mm.plugin.game.model.f.aTI();
    if (!bi.oW(str)) {}
    for (paramString = str + "?appid=" + paramString;; paramString = "game.weixin.qq.com/cgi-bin/h5/static/gamecenter/detail.html?appid=" + paramString) {
      return r(paramContext, paramString, "game_center_detail");
    }
  }
  
  public static int b(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
  {
    if (!bi.oW(paramString1))
    {
      b.a locala = b.bt(paramString1, paramBundle.getInt("game_report_from_scene", 0));
      if ((locala.bWA == 2) && (!bi.oW(locala.url))) {
        return r(paramContext, locala.url, "game_center_detail");
      }
    }
    if (!bi.oW(paramString2)) {
      return r(paramContext, paramString2, "game_center_detail");
    }
    int i = com.tencent.mm.plugin.game.model.f.aTJ();
    if (i == 2) {
      return ap(paramContext, paramString1);
    }
    if (i == 1)
    {
      e(paramContext, paramBundle);
      return 6;
    }
    paramString2 = bi.fS(paramContext);
    if ((bi.oW(paramString2)) || (paramString2.toLowerCase().equals("cn"))) {
      return ap(paramContext, paramString1);
    }
    e(paramContext, paramBundle);
    return 6;
  }
  
  public static Dialog dD(Context paramContext)
  {
    View localView = View.inflate(paramContext, f.f.game_progress_dialog_view, null);
    paramContext = new com.tencent.mm.ui.base.i(paramContext, f.j.GameProgressDialogStyle);
    paramContext.setContentView(localView);
    paramContext.setCancelable(true);
    paramContext.setCanceledOnTouchOutside(false);
    paramContext.setOnCancelListener(new c.1(paramContext));
    return paramContext;
  }
  
  public static boolean dd(String paramString1, String paramString2)
  {
    paramString1 = new File(paramString1);
    String str = com.tencent.mm.a.g.m(paramString1);
    if ((bi.oW(paramString2)) || (bi.oW(str)))
    {
      x.i("MicroMsg.GameCenterUtil", "checkPkgMD5Valid, md5 is null");
      return paramString1.exists();
    }
    x.i("MicroMsg.GameCenterUtil", "checkPkgMD5Valid, md5 = %s, calculateMD5 = %s", new Object[] { paramString2, str });
    return paramString2.equalsIgnoreCase(str);
  }
  
  public static void e(Context paramContext, Bundle paramBundle)
  {
    Intent localIntent = new Intent();
    localIntent.setClassName(paramContext, "com.tencent.mm.plugin.game.ui.GameDetailUI2");
    localIntent.putExtras(paramBundle);
    paramContext.startActivity(localIntent);
  }
  
  public static int getScreenWidth(Context paramContext)
  {
    if (paramContext == null) {
      return 0;
    }
    if (jZh == null)
    {
      jZh = new DisplayMetrics();
      ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics(jZh);
    }
    return jZh.widthPixels;
  }
  
  public static int parseColor(String paramString)
  {
    try
    {
      int i = Color.parseColor(paramString);
      return i;
    }
    catch (Exception paramString)
    {
      x.e("MicroMsg.GameCenterUtil", "parseColor: " + paramString.getMessage());
    }
    return 0;
  }
  
  public static int r(Context paramContext, String paramString1, String paramString2)
  {
    if (bi.oW(paramString1)) {
      return 0;
    }
    if (ao(paramContext, paramString1)) {
      return 30;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString1);
    localIntent.putExtra("show_bottom", false);
    localIntent.putExtra("geta8key_scene", 32);
    localIntent.putExtra("KPublisherId", paramString2);
    x(localIntent, paramContext);
    return 7;
  }
  
  public static void x(Intent paramIntent, Context paramContext)
  {
    kk localkk = new kk();
    localkk.bUK.type = 0;
    localkk.bUK.context = paramContext;
    localkk.bUK.intent = paramIntent;
    com.tencent.mm.sdk.b.a.sFg.m(localkk);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/game/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */