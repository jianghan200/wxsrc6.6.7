package com.tencent.mm.plugin.base.stub;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Looper;
import android.os.Process;
import com.jg.JgClassChecked;
import com.tencent.mm.g.a.ca;
import com.tencent.mm.g.a.eu;
import com.tencent.mm.g.a.ev;
import com.tencent.mm.g.a.ev.b;
import com.tencent.mm.g.a.fb;
import com.tencent.mm.g.a.fb.b;
import com.tencent.mm.g.a.g;
import com.tencent.mm.g.a.ie;
import com.tencent.mm.g.a.of;
import com.tencent.mm.g.a.og;
import com.tencent.mm.g.a.oh;
import com.tencent.mm.g.a.oi;
import com.tencent.mm.g.a.tn;
import com.tencent.mm.g.a.tn.b;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.account.ui.LoginUI;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.model.app.aq;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.x;

@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.PROVIDERCHECK})
public class WXCommProvider
  extends ContentProvider
{
  public static final String PREF_NAME = ad.getPackageName() + "_comm_preferences";
  private static final String[] hdP = { "packageName", "data" };
  private static final UriMatcher hdR = new UriMatcher(-1);
  private static volatile boolean hdS;
  protected static boolean hdT = false;
  private static final Object lock = new Object();
  private SharedPreferences duR;
  private ag handler;
  protected MatrixCursor hdQ = new MatrixCursor(new String[0]);
  
  static
  {
    hdS = false;
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "pref", 1);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "openQRCodeScan", 18);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "batchAddShortcut", 19);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "getUnreadCount", 20);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "jumpToBizProfile", 21);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "jumpToBizTempSession", 27);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "registerMsgListener", 22);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "getAvatar", 23);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "regWatchAppId", 24);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "decodeVoice", 25);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "addCardToWX", 26);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "unReadMsgs", 9);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "to_chatting", 3);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "setReaded", 13);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "voiceControl", 29);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "openRankList", 28);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "openWebview", 30);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "openBusiLuckyMoney", 31);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "createChatroom", 32);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "joinChatroom", 33);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "sendSight", 34);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "redirectToChattingByPhoneNumber", 35);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "redirectToWechatOutByPhoneNumber", 36);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "getWifiList", 37);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "connectWifi", 38);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "chooseCardFromWX", 39);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "openOfflinePay", 42);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "setWechatSportStep", 40);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "getWechatSportConfig", 41);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "handleScanResult", 44);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "openTypeWebview", 45);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "openCleanUI", 46);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "launchWXMiniprogram", 47);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "qrcodeEvent", 48);
    hdR.addURI("com.tencent.mm.sdk.comm.provider", "jumpToOfflinePay", 49);
  }
  
  private boolean atA()
  {
    try
    {
      x.i("MicroMsg.WXCommProvider", "checkIsLogin()");
      if (!hdT)
      {
        com.tencent.mm.pluginsdk.d.a.b localb = new com.tencent.mm.pluginsdk.d.a.b();
        localb.b(4000L, new WXCommProvider.7(this, localb));
      }
      if ((au.HX()) && (au.HW()) && (!au.Dr())) {}
      for (hdT = true;; hdT = false)
      {
        x.i("MicroMsg.WXCommProvider", "hasLogin = " + hdT);
        return hdT;
      }
      return false;
    }
    catch (Exception localException)
    {
      x.w("MicroMsg.WXCommProvider", localException.getMessage());
      x.printErrStackTrace("MicroMsg.WXCommProvider", localException, "", new Object[0]);
    }
  }
  
  /* Error */
  private String[] aty()
  {
    // Byte code:
    //   0: invokestatic 239	android/os/Binder:getCallingUid	()I
    //   3: istore_2
    //   4: aload_0
    //   5: invokevirtual 243	com/tencent/mm/plugin/base/stub/WXCommProvider:getContext	()Landroid/content/Context;
    //   8: invokevirtual 249	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   11: invokestatic 239	android/os/Binder:getCallingUid	()I
    //   14: invokevirtual 255	android/content/pm/PackageManager:getPackagesForUid	(I)[Ljava/lang/String;
    //   17: astore 4
    //   19: aload 4
    //   21: ifnonnull +49 -> 70
    //   24: iconst_0
    //   25: istore_1
    //   26: ldc -80
    //   28: ldc_w 257
    //   31: iconst_2
    //   32: anewarray 73	java/lang/Object
    //   35: dup
    //   36: iconst_0
    //   37: iload_2
    //   38: invokestatic 263	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   41: aastore
    //   42: dup
    //   43: iconst_1
    //   44: iload_1
    //   45: invokestatic 263	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   48: aastore
    //   49: invokestatic 266	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   52: aload 4
    //   54: ifnonnull +23 -> 77
    //   57: ldc -80
    //   59: ldc_w 268
    //   62: invokestatic 223	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   65: iconst_0
    //   66: anewarray 58	java/lang/String
    //   69: areturn
    //   70: aload 4
    //   72: arraylength
    //   73: istore_1
    //   74: goto -48 -> 26
    //   77: aload 4
    //   79: arraylength
    //   80: istore_2
    //   81: iconst_0
    //   82: istore_1
    //   83: aload 4
    //   85: astore_3
    //   86: iload_1
    //   87: iload_2
    //   88: if_icmpge +54 -> 142
    //   91: ldc -80
    //   93: ldc_w 270
    //   96: iconst_1
    //   97: anewarray 73	java/lang/Object
    //   100: dup
    //   101: iconst_0
    //   102: aload 4
    //   104: iload_1
    //   105: aaload
    //   106: aastore
    //   107: invokestatic 266	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   110: iload_1
    //   111: iconst_1
    //   112: iadd
    //   113: istore_1
    //   114: goto -31 -> 83
    //   117: astore_3
    //   118: ldc -80
    //   120: ldc_w 272
    //   123: iconst_1
    //   124: anewarray 73	java/lang/Object
    //   127: dup
    //   128: iconst_0
    //   129: aload_3
    //   130: invokevirtual 220	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   133: aastore
    //   134: invokestatic 275	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   137: iconst_0
    //   138: anewarray 58	java/lang/String
    //   141: astore_3
    //   142: aload_3
    //   143: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	144	0	this	WXCommProvider
    //   25	89	1	i	int
    //   3	86	2	j	int
    //   85	1	3	arrayOfString1	String[]
    //   117	13	3	localException	Exception
    //   141	2	3	arrayOfString2	String[]
    //   17	86	4	arrayOfString3	String[]
    // Exception table:
    //   from	to	target	type
    //   0	19	117	java/lang/Exception
    //   26	52	117	java/lang/Exception
    //   57	70	117	java/lang/Exception
    //   70	74	117	java/lang/Exception
    //   77	81	117	java/lang/Exception
    //   91	110	117	java/lang/Exception
  }
  
  private boolean atz()
  {
    try
    {
      x.i("MicroMsg.WXCommProvider", "checkIsLogin()");
      if ((!hdT) && (!((Boolean)new WXCommProvider.6(this, Boolean.valueOf(false)).a(this.handler)).booleanValue()))
      {
        x.i("MicroMsg.WXCommProvider", "checkIsLogin !syncTaskRet");
        hdT = false;
        return false;
      }
      if ((au.HX()) && (au.HW()) && (!au.Dr())) {}
      for (hdT = true;; hdT = false)
      {
        x.i("MicroMsg.WXCommProvider", "hasLogin = " + hdT);
        return hdT;
      }
      return false;
    }
    catch (Exception localException)
    {
      x.w("MicroMsg.WXCommProvider", localException.getMessage());
      x.printErrStackTrace("MicroMsg.WXCommProvider", localException, "", new Object[0]);
    }
  }
  
  public final Cursor a(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2, int paramInt, String[] paramArrayOfString3)
  {
    switch (paramInt)
    {
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 10: 
    case 11: 
    case 12: 
    case 14: 
    case 15: 
    case 16: 
    case 17: 
    case 43: 
    default: 
      paramArrayOfString1 = new MatrixCursor(hdP);
      paramUri = (Cursor)new WXCommProvider.4(this, paramUri, paramInt, paramArrayOfString3, paramArrayOfString1).a(this.handler);
      if (paramUri == null) {
        paramArrayOfString1.close();
      }
      return paramUri;
    case 18: 
    case 19: 
    case 20: 
      if (!atz()) {
        return null;
      }
      paramArrayOfString1 = new ev();
      paramArrayOfString1.bMz.bMB = paramInt;
      paramArrayOfString1.bMz.uri = paramUri;
      paramArrayOfString1.bMz.selectionArgs = paramArrayOfString2;
      paramArrayOfString1.bMz.context = getContext();
      paramArrayOfString1.bMz.bGj = paramArrayOfString3;
      if (!a.sFg.m(paramArrayOfString1))
      {
        x.e("MicroMsg.WXCommProvider", "ExtCallEvent fail");
        return null;
      }
      return paramArrayOfString1.bMA.bMC;
    case 3: 
    case 9: 
    case 13: 
    case 22: 
    case 23: 
    case 25: 
    case 29: 
    case 34: 
    case 35: 
    case 36: 
    case 37: 
    case 38: 
    case 40: 
    case 41: 
    case 42: 
    case 46: 
    case 48: 
      long l = System.currentTimeMillis();
      if (!atA())
      {
        String str = com.tencent.mm.sdk.platformtools.bi.oV(paramUri.getQueryParameter("appid"));
        if ("1".equals(com.tencent.mm.sdk.platformtools.bi.aG(paramUri.getQueryParameter("autoLogin"), "0")))
        {
          x.i("MicroMsg.WXCommProvider", "hy: not login. try to login return code = 9");
          aq.qBc = new aq(paramUri, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2, paramInt, paramArrayOfString3);
          aq.qBd = System.currentTimeMillis();
          paramUri = new Intent(getContext(), LoginUI.class);
          getContext().startActivity(paramUri);
          paramUri = new MatrixCursor(com.tencent.mm.protocal.b.iJr);
          paramUri.addRow(new Object[] { Integer.valueOf(9) });
          return paramUri;
        }
        x.i("MicroMsg.WXCommProvider", "not login, appID = %s, apiID = %s return code =%s ", new Object[] { str, Integer.valueOf(paramInt), Integer.valueOf(3) });
        h.mEJ.h(10505, new Object[] { com.tencent.mm.sdk.platformtools.bi.oV(paramArrayOfString3[0]), str, Integer.valueOf(paramInt), Integer.valueOf(1), Long.valueOf(System.currentTimeMillis() - l) });
        paramUri = new MatrixCursor(com.tencent.mm.protocal.b.iJr);
        paramUri.addRow(new Object[] { Integer.valueOf(3) });
        return paramUri;
      }
      paramArrayOfString1 = new fb();
      paramArrayOfString1.bNg.bMB = paramInt;
      paramArrayOfString1.bNg.uri = paramUri;
      paramArrayOfString1.bNg.selectionArgs = paramArrayOfString2;
      paramArrayOfString1.bNg.context = getContext();
      paramArrayOfString1.bNg.bGj = paramArrayOfString3;
      if (!a.sFg.m(paramArrayOfString1))
      {
        x.e("MicroMsg.WXCommProvider", "ExtCallEvent fail return code = 8");
        paramUri = new MatrixCursor(com.tencent.mm.protocal.b.iJr);
        paramUri.addRow(new Object[] { Integer.valueOf(8) });
        return paramUri;
      }
      x.i("MicroMsg.WXCommProvider", "[extApiCost] total cost = %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      return paramArrayOfString1.bNh.bMC;
    case 24: 
      if (!atz()) {
        return this.hdQ;
      }
      paramArrayOfString1 = new tn();
      paramArrayOfString1.cfa.bMB = paramInt;
      paramArrayOfString1.cfa.uri = paramUri;
      paramArrayOfString1.cfa.context = getContext();
      paramInt = 0;
      for (;;)
      {
        if (paramInt < paramArrayOfString3.length)
        {
          if (paramArrayOfString3[paramInt] != null) {
            paramArrayOfString1.cfa.cfc = paramArrayOfString3[paramInt];
          }
        }
        else
        {
          if (a.sFg.m(paramArrayOfString1)) {
            break;
          }
          x.e("MicroMsg.WXCommProvider", "WatchAppIdRegEvent fail");
          return null;
        }
        paramInt += 1;
      }
      return paramArrayOfString1.cfb.bMC;
    case 21: 
      paramUri = new eu();
      paramUri.bMx.op = 21;
      paramUri.bMx.source = 1;
      paramUri.bMx.selectionArgs = paramArrayOfString2;
      paramUri.bMx.context = getContext();
      paramUri.bMx.bGj = paramArrayOfString3;
      if (!a.sFg.m(paramUri)) {
        x.e("MicroMsg.WXCommProvider", "ExtCallBizEvent fail");
      }
      return null;
    case 27: 
      if ((paramArrayOfString2 == null) || (paramArrayOfString2.length < 2))
      {
        x.e("MicroMsg.WXCommProvider", "wrong args");
        return null;
      }
      paramUri = new eu();
      paramUri.bMx.op = 27;
      paramUri.bMx.source = 1;
      paramUri.bMx.selectionArgs = paramArrayOfString2;
      paramUri.bMx.context = getContext();
      paramUri.bMx.bGj = paramArrayOfString3;
      if (!a.sFg.m(paramUri)) {
        x.e("MicroMsg.WXCommProvider", "ExtCallBizEvent fail");
      }
      return null;
    case 28: 
      paramUri = new eu();
      paramUri.bMx.op = paramInt;
      paramUri.bMx.selectionArgs = paramArrayOfString2;
      paramUri.bMx.context = getContext();
      paramUri.bMx.bGj = paramArrayOfString3;
      if (!a.sFg.m(paramUri)) {
        x.e("MicroMsg.WXCommProvider", "ExtCallBizEvent fail");
      }
      return null;
    case 26: 
      paramUri = new g();
      paramUri.bGi.selectionArgs = paramArrayOfString2;
      paramUri.bGi.bGj = paramArrayOfString3;
      paramUri.bGi.context = getContext();
      if (!a.sFg.m(paramUri)) {
        x.e("MicroMsg.WXCommProvider", "add card to wx fail");
      }
      return null;
    case 30: 
    case 45: 
      paramUri = new oi();
      paramUri.bZh.selectionArgs = paramArrayOfString2;
      paramUri.bZh.bGj = paramArrayOfString3;
      paramUri.bZh.context = getContext();
      paramArrayOfString1 = paramUri.bZh;
      if (paramInt == 45) {}
      for (boolean bool = true;; bool = false)
      {
        paramArrayOfString1.bZi = bool;
        if ((paramInt == 30) && (paramArrayOfString2 != null) && (paramArrayOfString2.length > 2)) {
          com.tencent.mm.pluginsdk.d.qya = paramArrayOfString2[2];
        }
        if (!a.sFg.m(paramUri)) {
          x.e("MicroMsg.WXCommProvider", "open webview fail");
        }
        return null;
      }
    case 47: 
      paramUri = new of();
      paramUri.bZe.selectionArgs = paramArrayOfString2;
      paramUri.bZe.bGj = paramArrayOfString3;
      paramUri.bZe.context = getContext();
      if (!a.sFg.m(paramUri)) {
        x.e("MicroMsg.WXCommProvider", "launch wx miniprogram fail");
      }
      return null;
    case 49: 
      paramUri = new oh();
      paramUri.bZg.selectionArgs = paramArrayOfString2;
      paramUri.bZg.bGj = paramArrayOfString3;
      paramUri.bZg.context = getContext();
      if (!a.sFg.m(paramUri)) {
        x.e("MicroMsg.WXCommProvider", "open offline pay fail");
      }
      return null;
    case 31: 
      paramUri = new og();
      paramUri.bZf.selectionArgs = paramArrayOfString2;
      paramUri.bZf.bGj = paramArrayOfString3;
      paramUri.bZf.context = getContext();
      if (!a.sFg.m(paramUri)) {
        x.e("MicroMsg.WXCommProvider", "open busi luckymoney fail");
      }
      return null;
    case 32: 
      paramUri = new ca();
      paramUri.bJp.action = 1;
      paramUri.bJp.selectionArgs = paramArrayOfString2;
      paramUri.bJp.bGj = paramArrayOfString3;
      paramUri.bJp.context = getContext();
      if (!a.sFg.m(paramUri)) {
        x.e("MicroMsg.WXCommProvider", "open webview fail");
      }
      return null;
    case 33: 
      paramUri = new ca();
      paramUri.bJp.action = 2;
      paramUri.bJp.selectionArgs = paramArrayOfString2;
      paramUri.bJp.bGj = paramArrayOfString3;
      paramUri.bJp.context = getContext();
      if (!a.sFg.m(paramUri)) {
        x.e("MicroMsg.WXCommProvider", "open webview fail");
      }
      return null;
    case 39: 
      paramUri = new com.tencent.mm.g.a.bi();
      paramUri.bIT.selectionArgs = paramArrayOfString2;
      paramUri.bIT.bGj = paramArrayOfString3;
      paramUri.bIT.context = getContext();
      if (!a.sFg.m(paramUri)) {
        x.e("MicroMsg.WXCommProvider", "choose card from wx fail");
      }
      return null;
    }
    paramUri = new ie();
    paramUri.bRF.selectionArgs = paramArrayOfString2;
    paramUri.bRF.bGj = paramArrayOfString3;
    paramUri.bRF.context = getContext();
    if (!a.sFg.m(paramUri))
    {
      x.e("MicroMsg.WXCommProvider", "handle scan result failed try again");
      ah.i(new WXCommProvider.3(this, paramUri), 200L);
    }
    return null;
  }
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    if (paramUri == null)
    {
      x.e("MicroMsg.WXCommProvider", "delete fail, uri is null");
      return 0;
    }
    return ((Integer)new WXCommProvider.5(this, Integer.valueOf(0), paramUri, hdR.match(paramUri), aty()).a(this.handler)).intValue();
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
    boolean bool = false;
    x.d("MicroMsg.WXCommProvider", "onCreate");
    this.handler = new ag();
    x.i("MicroMsg.WXCommProvider", "pid = " + Process.myPid() + ", tid : = " + Process.myTid());
    this.duR = getContext().getSharedPreferences(PREF_NAME, 0);
    getContext().registerReceiver(new WXCommProvider.1(this), new IntentFilter("com.tencent.mm.plugin.openapi.Intent.ACTION_REFRESH_WXAPP"));
    if (this.duR != null) {
      bool = true;
    }
    return bool;
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    x.i("MicroMsg.WXCommProvider", "uri:%s", new Object[] { paramUri });
    if (paramUri == null)
    {
      x.e("MicroMsg.WXCommProvider", "query fail, uri is null return null");
      return null;
    }
    String[] arrayOfString = aty();
    if ((arrayOfString == null) || (arrayOfString.length <= 0))
    {
      x.e("MicroMsg.WXCommProvider", "CallingPackages is null return null");
      return null;
    }
    int i = hdR.match(paramUri);
    if (a.sFg == null)
    {
      new al(Looper.getMainLooper(), new WXCommProvider.2(this), true).J(50L, 50L);
      try
      {
        synchronized (lock)
        {
          x.i("MicroMsg.WXCommProvider", "Lock to wait for the first initialize of the Application.");
          if (hdS) {
            break label196;
          }
          lock.wait();
        }
        return a(paramUri, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2, i, arrayOfString);
      }
      catch (InterruptedException localInterruptedException)
      {
        x.e("MicroMsg.WXCommProvider", "the lock may have some problem," + localInterruptedException.getMessage());
        x.printErrStackTrace("MicroMsg.WXCommProvider", localInterruptedException, "", new Object[0]);
      }
    }
    for (;;)
    {
      label196:
      hdS = false;
    }
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/base/stub/WXCommProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */