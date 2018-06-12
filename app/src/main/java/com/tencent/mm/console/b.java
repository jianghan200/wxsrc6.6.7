package com.tencent.mm.console;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.R.f;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.d.a;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.bj;
import com.tencent.mm.g.a.ce;
import com.tencent.mm.g.a.cj;
import com.tencent.mm.g.a.ck;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.gs;
import com.tencent.mm.g.a.me;
import com.tencent.mm.g.a.pr;
import com.tencent.mm.g.a.pu;
import com.tencent.mm.g.a.qk;
import com.tencent.mm.g.a.ty;
import com.tencent.mm.g.a.ub;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.b;
import com.tencent.mm.model.at;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bv;
import com.tencent.mm.modelstat.WatchDogPushReceiver;
import com.tencent.mm.platformtools.SpellMap;
import com.tencent.mm.pluginsdk.model.app.ap;
import com.tencent.mm.pluginsdk.o.a;
import com.tencent.mm.pluginsdk.o.e;
import com.tencent.mm.pluginsdk.o.g;
import com.tencent.mm.protocal.c.avk;
import com.tencent.mm.protocal.c.avl;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.an.a;
import com.tencent.mm.sdk.platformtools.ax;
import com.tencent.mm.sdk.platformtools.ax.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.bn;
import com.tencent.mm.storage.n;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.e.i;
import com.tencent.xweb.WebView;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public final class b
{
  static
  {
    com.tencent.mm.console.a.d.init();
    com.tencent.mm.console.a.i.init();
    com.tencent.mm.console.a.j.init();
    com.tencent.mm.console.a.g.init();
    com.tencent.mm.console.a.e.init();
    com.tencent.mm.console.a.f.init();
    com.tencent.mm.console.a.b.init();
    com.tencent.mm.console.a.c.init();
    com.tencent.mm.console.a.l.init();
    com.tencent.mm.console.a.h.init();
    com.tencent.mm.console.a.k.init();
    com.tencent.mm.console.a.m.init();
    try
    {
      Class.forName("com.tencent.mm.console.a.b.a");
      com.tencent.mm.pluginsdk.cmd.b.a(new com.tencent.mm.console.a.a.a(), new String[] { "//fsd" });
      com.tencent.mm.pluginsdk.cmd.b.a(new com.tencent.mm.console.a.a.b(), new String[] { "//hcsetting" });
      com.tencent.mm.pluginsdk.cmd.b.a(new com.tencent.mm.console.a.a(), new String[] { "//clearrecent" });
      return;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.CommandProcessor", localThrowable, "", new Object[0]);
      }
    }
  }
  
  private static boolean A(Context paramContext, String paramString)
  {
    boolean bool = true;
    StringBuffer localStringBuffer = new StringBuffer();
    if (!bi.oW(paramString)) {
      localStringBuffer.append(paramString + "\n\n");
    }
    localStringBuffer.append("Default RSA Info:\n");
    localStringBuffer.append("ClientVersion: " + com.tencent.mm.sdk.platformtools.d.CLIENT_VERSION + "\n");
    localStringBuffer.append("BASE_RSA_PUBLIC_VERSION = 173\n");
    localStringBuffer.append("BASE_RSA_PUBLIC_KEYN = D55D10C78FAE31AEEA46BFF785E3CCD0144084E3E426D7A5CAABB8943E815EC235FD86CC426C537C2B6E5E99301FBD0ACB50B562E1867A9C92222F9BFD8F2359AD32A36D0F7D8BCDECCE523EBB4115DE250F5BEC19A11D563AD3FBB45E1A0E49B2D64DECEFE22DC01FC575CEA1A129A5765293168C0CDA1467873B91229ED398F417EB43671D87C41A2D713095F379F22FC4578FB8DB77A9F1897C014F4B5AAF06626AC970811098516FD82B4A84E2960B2F039C463C36DB4CFF46DB0C3E0392172C7022591EE6495AFBE759828F713899994E138897A027F60D104C6A90EE08C9C3FBAE3C2BF7EB0CB613FD1DB2BFC34A677E8FB31EF780957F3D5FD9A4C41D len(512)\n");
    localStringBuffer.append("BASE_RSA_PUBLIC_KEYE = 010001\n\n");
    localStringBuffer.append("REQ_RSA_PUBLIC_VERSION = 174\n");
    localStringBuffer.append("REQ_RSA_PUBLIC_KEYN = D153E8A2B314D2110250A0A550DDACDCD77F5801F3D1CC21CB1B477E4F2DE8697D40F10265D066BE8200876BB7135EDC74CDBC7C4428064E0CDCBE1B6B92D93CEAD69EC27126DEBDE564AAE1519ACA836AA70487346C85931273E3AA9D24A721D0B854A7FCB9DED49EE03A44C189124FBEB8B17BB1DBE47A534637777D33EEC88802CD56D0C7683A796027474FEBF237FA5BF85C044ADC63885A70388CD3696D1F2E466EB6666EC8EFE1F91BC9353F8F0EAC67CC7B3281F819A17501E15D03291A2A189F6A35592130DE2FE5ED8E3ED59F65C488391E2D9557748D4065D00CBEA74EB8CA19867C65B3E57237BAA8BF0C0F79EBFC72E78AC29621C8AD61A2B79B len(512)\n");
    localStringBuffer.append("REQ_RSA_PUBLIC_KEYE = 010001\n");
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "summercert dumpdefaultrsa " + localStringBuffer.toString());
    if (!com.tencent.mm.sdk.a.b.chp()) {
      bool = false;
    }
    do
    {
      return bool;
      paramString = new TextView(paramContext);
      paramString.setText(localStringBuffer.toString());
      paramString.setGravity(19);
      paramString.setTextSize(1, 10.0F);
      paramString.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
      paramString.setTextColor(-16711936);
      paramString.setTypeface(Typeface.MONOSPACE);
      int i = paramContext.getResources().getDimensionPixelSize(R.f.SmallestPadding);
      paramString.setPadding(i, i, i, i);
      paramString.setMovementMethod(ScrollingMovementMethod.getInstance());
      com.tencent.mm.ui.base.h.a(paramContext, null, paramString, null);
    } while (!com.tencent.mm.protocal.y.cgv());
    Toast.makeText(paramContext, "dump file:" + com.tencent.mm.compatible.util.e.bnE + "DefaultRSA.java", 1).show();
    return true;
  }
  
  /* Error */
  private static StringBuilder fX(int paramInt)
  {
    // Byte code:
    //   0: new 269	java/util/Date
    //   3: dup
    //   4: invokestatic 273	com/tencent/mm/sdk/platformtools/bi:VF	()J
    //   7: iload_0
    //   8: i2l
    //   9: ldc2_w 274
    //   12: lmul
    //   13: lsub
    //   14: invokespecial 278	java/util/Date:<init>	(J)V
    //   17: astore_1
    //   18: new 280	java/text/SimpleDateFormat
    //   21: dup
    //   22: ldc_w 282
    //   25: invokestatic 288	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   28: invokespecial 291	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;Ljava/util/Locale;)V
    //   31: astore_2
    //   32: new 105	java/lang/StringBuilder
    //   35: dup
    //   36: invokespecial 106	java/lang/StringBuilder:<init>	()V
    //   39: getstatic 294	com/tencent/mm/compatible/util/e:duP	Ljava/lang/String;
    //   42: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: ldc_w 296
    //   48: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: aload_2
    //   52: aload_1
    //   53: invokevirtual 300	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   56: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: ldc_w 302
    //   62: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: invokevirtual 116	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   68: astore_1
    //   69: new 105	java/lang/StringBuilder
    //   72: dup
    //   73: invokespecial 106	java/lang/StringBuilder:<init>	()V
    //   76: astore 4
    //   78: new 304	java/io/File
    //   81: dup
    //   82: aload_1
    //   83: invokespecial 305	java/io/File:<init>	(Ljava/lang/String;)V
    //   86: invokevirtual 308	java/io/File:exists	()Z
    //   89: ifne +34 -> 123
    //   92: new 105	java/lang/StringBuilder
    //   95: dup
    //   96: new 105	java/lang/StringBuilder
    //   99: dup
    //   100: ldc_w 310
    //   103: invokespecial 126	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   106: iload_0
    //   107: invokevirtual 312	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   110: ldc_w 314
    //   113: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: invokevirtual 116	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   119: invokespecial 126	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   122: areturn
    //   123: new 316	java/io/BufferedReader
    //   126: dup
    //   127: new 318	java/io/InputStreamReader
    //   130: dup
    //   131: new 320	java/io/FileInputStream
    //   134: dup
    //   135: aload_1
    //   136: invokespecial 321	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   139: invokespecial 324	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   142: invokespecial 327	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   145: astore_2
    //   146: aload_2
    //   147: astore_1
    //   148: aload_2
    //   149: invokevirtual 330	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   152: invokestatic 103	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   155: ifeq +51 -> 206
    //   158: aload_2
    //   159: astore_1
    //   160: aload_2
    //   161: invokevirtual 333	java/io/BufferedReader:close	()V
    //   164: aload_2
    //   165: astore_1
    //   166: new 105	java/lang/StringBuilder
    //   169: dup
    //   170: new 105	java/lang/StringBuilder
    //   173: dup
    //   174: ldc_w 335
    //   177: invokespecial 126	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   180: iload_0
    //   181: invokevirtual 312	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   184: ldc_w 337
    //   187: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: invokevirtual 116	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   193: invokespecial 126	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   196: astore_3
    //   197: aload_2
    //   198: invokevirtual 333	java/io/BufferedReader:close	()V
    //   201: aload_3
    //   202: areturn
    //   203: astore_1
    //   204: aload_3
    //   205: areturn
    //   206: aload_2
    //   207: astore_1
    //   208: aload_2
    //   209: invokevirtual 330	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   212: astore_3
    //   213: aload_3
    //   214: ifnull +79 -> 293
    //   217: aload_2
    //   218: astore_1
    //   219: aload 4
    //   221: new 63	java/lang/String
    //   224: dup
    //   225: aload_3
    //   226: ldc_w 339
    //   229: invokevirtual 343	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   232: iconst_1
    //   233: aaload
    //   234: iconst_0
    //   235: invokestatic 349	android/util/Base64:decode	(Ljava/lang/String;I)[B
    //   238: invokespecial 352	java/lang/String:<init>	([B)V
    //   241: ldc_w 354
    //   244: invokevirtual 343	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   247: iconst_1
    //   248: aaload
    //   249: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   252: pop
    //   253: aload_2
    //   254: astore_1
    //   255: aload 4
    //   257: ldc_w 356
    //   260: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   263: pop
    //   264: goto -58 -> 206
    //   267: astore_3
    //   268: aload_2
    //   269: astore_1
    //   270: ldc 83
    //   272: aload_3
    //   273: ldc 85
    //   275: iconst_0
    //   276: anewarray 4	java/lang/Object
    //   279: invokestatic 91	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   282: aload_2
    //   283: ifnull +7 -> 290
    //   286: aload_2
    //   287: invokevirtual 333	java/io/BufferedReader:close	()V
    //   290: aload 4
    //   292: areturn
    //   293: aload_2
    //   294: invokevirtual 333	java/io/BufferedReader:close	()V
    //   297: goto -7 -> 290
    //   300: astore_1
    //   301: goto -11 -> 290
    //   304: astore_2
    //   305: aconst_null
    //   306: astore_1
    //   307: aload_1
    //   308: ifnull +7 -> 315
    //   311: aload_1
    //   312: invokevirtual 333	java/io/BufferedReader:close	()V
    //   315: aload_2
    //   316: athrow
    //   317: astore_1
    //   318: goto -28 -> 290
    //   321: astore_1
    //   322: goto -7 -> 315
    //   325: astore_2
    //   326: goto -19 -> 307
    //   329: astore_3
    //   330: aconst_null
    //   331: astore_2
    //   332: goto -64 -> 268
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	335	0	paramInt	int
    //   17	149	1	localObject1	Object
    //   203	1	1	localException1	Exception
    //   207	63	1	localObject2	Object
    //   300	1	1	localException2	Exception
    //   306	6	1	localObject3	Object
    //   317	1	1	localException3	Exception
    //   321	1	1	localException4	Exception
    //   31	263	2	localObject4	Object
    //   304	12	2	localObject5	Object
    //   325	1	2	localObject6	Object
    //   331	1	2	localObject7	Object
    //   196	30	3	localObject8	Object
    //   267	6	3	localException5	Exception
    //   329	1	3	localException6	Exception
    //   76	215	4	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   197	201	203	java/lang/Exception
    //   148	158	267	java/lang/Exception
    //   160	164	267	java/lang/Exception
    //   166	197	267	java/lang/Exception
    //   208	213	267	java/lang/Exception
    //   219	253	267	java/lang/Exception
    //   255	264	267	java/lang/Exception
    //   293	297	300	java/lang/Exception
    //   123	146	304	finally
    //   286	290	317	java/lang/Exception
    //   311	315	321	java/lang/Exception
    //   148	158	325	finally
    //   160	164	325	finally
    //   166	197	325	finally
    //   208	213	325	finally
    //   219	253	325	finally
    //   255	264	325	finally
    //   270	282	325	finally
    //   123	146	329	java/lang/Exception
  }
  
  private static void fY(int paramInt)
  {
    SharedPreferences localSharedPreferences = an.m(ad.getContext(), "sp_sns_dynswitch_stg", 4);
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("Bad op parameter: " + paramInt);
    case -1: 
      localSharedPreferences.edit().remove("st_sw_use_vcodec_img").commit();
      return;
    case 0: 
      localSharedPreferences.edit().putBoolean("st_sw_use_vcodec_img", false).commit();
      return;
    }
    localSharedPreferences.edit().putBoolean("st_sw_use_vcodec_img", true).commit();
  }
  
  private static void fZ(int paramInt)
  {
    SharedPreferences localSharedPreferences = an.m(ad.getContext(), "sp_sns_dynswitch_stg", 4);
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("Bad op parameter: " + paramInt);
    case -1: 
      localSharedPreferences.edit().remove("st_sw_use_wxpc_img").commit();
      return;
    case 0: 
      localSharedPreferences.edit().putBoolean("st_sw_use_wxpc_img", false).commit();
      return;
    }
    localSharedPreferences.edit().putBoolean("st_sw_use_wxpc_img", true).commit();
  }
  
  private static int ft(String paramString)
  {
    if ((!paramString.startsWith("//")) || (paramString.length() <= 2)) {}
    for (;;)
    {
      return 0;
      int j = paramString.indexOf(" ");
      int i = j;
      if (j == -1) {
        i = paramString.length();
      }
      try
      {
        i = bi.getInt(paramString.substring(2, i), 0);
        j = com.tencent.mm.protocal.d.qVN % 256;
        if ((j != 0) && (i >= j) && (i % j == 0)) {
          return i / j;
        }
      }
      catch (Exception paramString) {}
    }
    return 0;
  }
  
  private static String fu(String paramString)
  {
    int i = paramString.indexOf(" ");
    if (i < 0) {
      return "";
    }
    return paramString.substring(i).trim();
  }
  
  public static boolean z(final Context paramContext, final String paramString)
  {
    if (!paramString.startsWith("//")) {
      return false;
    }
    if ((1 < com.tencent.mm.sdk.platformtools.x.getLogLevel()) && (!paramString.startsWith("//uplog")) && (!paramString.startsWith("//upcrash")))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "summer processed log level[%s], need open debug ret false", new Object[] { Integer.valueOf(com.tencent.mm.sdk.platformtools.x.getLogLevel()) });
      return false;
    }
    if (com.tencent.mm.pluginsdk.cmd.b.be(paramContext, paramString)) {
      return true;
    }
    if (paramString.startsWith("//clearWXSNSDB"))
    {
      paramContext = new pr();
      com.tencent.mm.sdk.b.a.sFg.m(paramContext);
      return true;
    }
    if (paramString.startsWith("//verifytokenerror"))
    {
      com.tencent.mm.platformtools.af.eye = true;
      return true;
    }
    if (paramString.startsWith("//resetbackupdata"))
    {
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sUY, Boolean.valueOf(false));
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sUZ, Boolean.valueOf(false));
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sVa, Boolean.valueOf(false));
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sVb, Boolean.valueOf(false));
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sVc, Boolean.valueOf(false));
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sVd, Boolean.valueOf(false));
      au.HU().Gz().ckt();
      au.HU().GA().ckt();
      au.HU().Gy().ckt();
      Toast.makeText(ad.getContext(), "backup data has been reset!", 1).show();
      return true;
    }
    Object localObject1;
    Object localObject4;
    int i;
    if (paramString.equalsIgnoreCase("//ftsmsbiz"))
    {
      localObject1 = com.tencent.mm.plugin.websearch.api.x.bTb();
      paramString = new StringBuilder();
      localObject1 = ((avl)localObject1).hbG.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject4 = (avk)((Iterator)localObject1).next();
        paramString.append(String.format("%s | %.2f | %s", new Object[] { com.tencent.mm.model.r.gT(((avk)localObject4).rdS), Double.valueOf(((avk)localObject4).rYh), com.tencent.mm.pluginsdk.f.h.h("yyyy-MM-dd HH:mm", ((avk)localObject4).rYi / 1000L) }));
        paramString.append("\n");
      }
      localObject1 = new TextView(paramContext);
      ((TextView)localObject1).setText(paramString.toString());
      ((TextView)localObject1).setGravity(19);
      ((TextView)localObject1).setTextSize(1, 10.0F);
      ((TextView)localObject1).setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
      ((TextView)localObject1).setTextColor(-16711936);
      ((TextView)localObject1).setTypeface(Typeface.MONOSPACE);
      i = paramContext.getResources().getDimensionPixelSize(R.f.LargePadding);
      ((TextView)localObject1).setPadding(i, i, i, i);
      com.tencent.mm.ui.base.h.a(paramContext, null, (View)localObject1, null);
      return true;
    }
    if (paramString.startsWith("//setgamejs"))
    {
      paramString = paramString.split(" ");
      if (paramString.length == 2)
      {
        if ((paramString[1] == null) || (paramString[1].isEmpty()) || (paramString[1].endsWith("/"))) {
          break label612;
        }
        paramContext = ad.getContext().getSharedPreferences("app_brand_global_sp", 0);
        if (paramContext != null)
        {
          paramContext = paramContext.edit();
          paramContext.remove("app_brand_game_js_path");
          paramContext.commit();
          if (!paramString[1].equalsIgnoreCase("null"))
          {
            paramContext.putString("app_brand_game_js_path", paramString[1]);
            paramContext.commit();
          }
        }
      }
      for (;;)
      {
        return true;
        label612:
        com.tencent.mm.ui.base.s.makeText(paramContext, "param set error, please don't end with /", 0).show();
      }
    }
    if (com.tencent.mm.sdk.a.b.chp())
    {
      if (paramString.startsWith("//launchapp clear"))
      {
        com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sVH, "");
        return true;
      }
      if (paramString.startsWith("//setsupportwxcode"))
      {
        com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sWW, Boolean.valueOf(true));
        return true;
      }
      if (paramString.startsWith("//setnotsupportwxcode"))
      {
        com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sWW, Boolean.valueOf(false));
        return true;
      }
      if (paramString.startsWith("//resetsupportwxcode"))
      {
        com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sWW, null);
        return true;
      }
    }
    if (paramString.startsWith("//testsightwidget"))
    {
      paramString = new Intent();
      paramString.putExtra("KSightPath", "/mnt/sdcard/tencent/tempvideo4.mp4");
      paramString.putExtra("KSightThumbPath", "");
      paramString.putExtra("sight_md5", com.tencent.mm.a.g.cu("/mnt/sdcard/tencent/tempvideo4.mp4"));
      paramString.putExtra("KSnsPostManu", true);
      paramString.putExtra("KTouchCameraTime", bi.VE());
      paramString.putExtra("Ksnsupload_type", 14);
      com.tencent.mm.bg.d.b(paramContext, "sns", ".ui.SnsUploadUI", paramString);
      return true;
    }
    if (paramString.startsWith("//openremitbank"))
    {
      com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sZl, Integer.valueOf(1));
      return true;
    }
    if (paramString.startsWith("//angerbag"))
    {
      if (((String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.tab, "0")).equals("0")) {}
      for (paramContext = "1";; paramContext = "0")
      {
        com.tencent.mm.kernel.g.Ei().DT().a(aa.a.tab, paramContext);
        return true;
      }
    }
    if (paramString.startsWith("//clearbag"))
    {
      com.tencent.mm.kernel.g.Ei().DT().a(aa.a.taa, "");
      return true;
    }
    if (paramString.startsWith("//closeremitbank"))
    {
      com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sZl, Integer.valueOf(0));
      return true;
    }
    if (paramString.startsWith("//ftstemplatetest"))
    {
      localObject1 = new com.tencent.mm.g.a.bc();
      ((com.tencent.mm.g.a.bc)localObject1).bIB.bIC = 27;
      ((com.tencent.mm.g.a.bc)localObject1).bIB.bIC = 1;
      ((com.tencent.mm.g.a.bc)localObject1).bIB.filePath = "/sdcard/fts_template.zip";
      com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject1);
    }
    if (paramString.startsWith("//sightforward"))
    {
      paramString = new Intent();
      paramString.setClassName(paramContext, "com.tencent.mm.ui.transmit.SightForwardUI");
      paramContext.startActivity(paramString);
      return true;
    }
    if (paramString.startsWith("//remit"))
    {
      com.tencent.mm.bg.d.b(paramContext, "remittance", ".ui.RemittanceBusiUI", new Intent());
      return true;
    }
    if (paramString.startsWith("//fixtools"))
    {
      paramString = new Intent();
      paramString.setClassName(paramContext, "com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUI");
      paramString.putExtra("entry_fix_tools", 2);
      paramContext.startActivity(paramString);
      return true;
    }
    if (paramString.startsWith("//uplog"))
    {
      paramString = new Intent();
      paramString.setClassName(paramContext, "com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI");
      paramString.putExtra("entry_fix_tools_uplog", 5);
      MMWizardActivity.D(paramContext, paramString);
      return true;
    }
    int j;
    if (paramString.startsWith("//upcrash"))
    {
      paramContext = "weixin";
      if (au.HX()) {
        paramContext = com.tencent.mm.model.q.GF();
      }
      localObject1 = paramString.split(" ");
      j = 0;
      i = 0;
      paramString = paramContext;
      if (localObject1 != null)
      {
        if (localObject1.length > 1) {
          i = bi.getInt(localObject1[1], 0);
        }
        paramString = paramContext;
        j = i;
        if (localObject1.length > 2)
        {
          paramString = localObject1[2];
          j = i;
        }
      }
      au.DF().d(new bg(new b.1(paramString, j)));
      return true;
    }
    boolean bool1;
    if (paramString.startsWith("//switchnotificationstatus"))
    {
      if (!com.tencent.mm.k.f.Ai()) {}
      for (bool1 = true;; bool1 = false)
      {
        com.tencent.mm.k.f.bj(bool1);
        return true;
      }
    }
    if (paramString.startsWith("//fixError0831"))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "fixError0831");
      com.tencent.mm.sdk.b.a.sFg.m(new bj());
      return true;
    }
    if (paramString.startsWith("//resetbankremit"))
    {
      com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sZm, Integer.valueOf(0));
      return true;
    }
    if (paramString.startsWith("//busiluck "))
    {
      paramString = paramString.replace("//busiluck ", "");
      paramString = "weixin://openNativeUrl/weixinHB/startreceivebizhbrequest?sendid=" + paramString;
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("key_way", 5);
      ((Intent)localObject1).putExtra("key_native_url", paramString);
      com.tencent.mm.bg.d.b(paramContext, "luckymoney", ".ui.LuckyMoneyBusiReceiveUI", (Intent)localObject1);
      return true;
    }
    if (paramString.startsWith("//testsoter"))
    {
      paramString = new Intent();
      paramString.setClassName(ad.getPackageName(), "com.tencent.mm.plugin.soter.ui.SoterTestUI");
      paramContext.startActivity(paramString);
      return true;
    }
    if (paramString.startsWith("//facevideo"))
    {
      paramContext = paramString.split(" ");
      if (paramContext.length == 3)
      {
        at.dBv.T("imgType", paramContext[1]);
        at.dBv.T("depth", paramContext[2]);
      }
      return true;
    }
    if (paramString.startsWith("//alpha"))
    {
      paramContext = paramString.split(" ");
      if (paramContext.length == 2) {
        at.dBv.T("alpha_duration", paramContext[1]);
      }
      return true;
    }
    if (paramString.startsWith("//rectwidth"))
    {
      paramContext = paramString.split(" ");
      if (paramContext.length == 2) {
        at.dBv.T("rect_width", paramContext[1]);
      }
      return true;
    }
    if (paramString.startsWith("//newyearsw "))
    {
      au.HU();
      i = ((Integer)com.tencent.mm.model.c.DT().get(aa.a.sPo, Integer.valueOf(0))).intValue();
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sPo, Integer.valueOf(i ^ 0x1));
      return true;
    }
    if (paramString.startsWith("//commitxlog"))
    {
      au.DF().a(1, "", 0, false);
      com.tencent.mm.sdk.platformtools.x.chR();
      return true;
    }
    if (paramString.startsWith("//open neattextview"))
    {
      com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sZp, Boolean.valueOf(true));
      return true;
    }
    if (paramString.startsWith("//close neattextview"))
    {
      com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sZp, Boolean.valueOf(false));
      return true;
    }
    if (paramString.startsWith("//unprint specialtext"))
    {
      com.tencent.mm.ui.widget.MMNeatTextView.uGn = false;
      return true;
    }
    if (paramString.startsWith("//print specialtext"))
    {
      com.tencent.mm.ui.widget.MMNeatTextView.uGn = true;
      return true;
    }
    if (paramString.startsWith("//netstatus"))
    {
      paramString = com.tencent.mm.sdk.platformtools.ao.fG(ad.getContext());
      com.tencent.mm.ui.base.h.a(paramContext, paramString, "netstatus", paramContext.getString(R.l.voip_get_key_copy), paramContext.getString(R.l.confirm_dialog_cancel), new b.8(paramContext, paramString), null);
      return true;
    }
    long l1;
    if (paramString.startsWith("//scaninterval "))
    {
      localObject1 = paramString.split(" ");
      l1 = -1L;
    }
    try
    {
      l2 = bi.getLong(localObject1[1], -1L);
      l1 = l2;
    }
    catch (Exception localException4)
    {
      for (;;)
      {
        long l2;
        continue;
        paramString = null;
        continue;
        Object localObject5 = null;
        String str = paramString;
        paramString = (String)localObject5;
        continue;
        paramString = null;
        continue;
        paramString = null;
        localObject4 = null;
      }
    }
    if (l1 > 0L)
    {
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sUR, Long.valueOf(l1));
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "summerclean reset scaninterval[%d]", new Object[] { Long.valueOf(l1) });
      return true;
    }
    if (paramString.startsWith("//scanwait "))
    {
      localObject1 = paramString.split(" ");
      l1 = -1L;
    }
    try
    {
      l2 = bi.getLong(localObject1[1], -1L);
      l1 = l2;
    }
    catch (Exception localException3)
    {
      boolean bool3;
      boolean bool2;
      boolean bool4;
      for (;;) {}
    }
    if (l1 > 0L)
    {
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sUS, Long.valueOf(l1));
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "summerclean reset scanwait[%d]", new Object[] { Long.valueOf(l1) });
      return true;
    }
    if (paramString.equalsIgnoreCase("//delayquery"))
    {
      if (!com.tencent.mm.platformtools.af.eyh) {}
      for (bool1 = true;; bool1 = false)
      {
        com.tencent.mm.platformtools.af.eyh = bool1;
        return true;
      }
    }
    if (paramString.startsWith("//newinit -hard"))
    {
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Ei().DT().set(15, Integer.valueOf(0));
      return true;
    }
    if (paramString.startsWith("//opensearchpreload "))
    {
      paramContext = paramString.split("\\s+");
      if (paramContext.length == 2)
      {
        if (!"1".equals(paramContext[1].trim())) {
          break label2137;
        }
        com.tencent.mm.plugin.websearch.api.z.bTc().jP(true);
      }
      for (;;)
      {
        return true;
        label2137:
        if ("0".equals(paramContext[1].trim())) {
          com.tencent.mm.plugin.websearch.api.z.bTc().jP(false);
        }
      }
    }
    if (paramString.startsWith("//closesearchhtmlpreload "))
    {
      paramContext = paramString.split("\\s+");
      if (paramContext.length == 2)
      {
        if (!"1".equals(paramContext[1].trim())) {
          break label2206;
        }
        com.tencent.mm.plugin.websearch.api.p.bSN();
      }
      for (;;)
      {
        return true;
        label2206:
        if ("0".equals(paramContext[1].trim())) {
          com.tencent.mm.plugin.websearch.api.p.bSN();
        }
      }
    }
    if (paramString.equalsIgnoreCase("//swipe"))
    {
      paramContext = ad.chZ();
      bool1 = paramContext.getBoolean("settings_support_swipe", true);
      paramContext = paramContext.edit();
      if (!bool1) {}
      for (bool1 = true;; bool1 = false)
      {
        paramContext.putBoolean("settings_support_swipe", bool1).commit();
        return true;
      }
    }
    if (paramString.equalsIgnoreCase("//multiwebview"))
    {
      paramContext = LauncherUI.cpQ().getSharedPreferences(ad.chY(), 0);
      bool1 = paramContext.getBoolean("settings_multi_webview", false);
      if (bool1)
      {
        paramContext = paramContext.edit();
        if (bool1) {
          break label2365;
        }
      }
      label2365:
      for (bool1 = true;; bool1 = false)
      {
        paramContext.putBoolean("settings_multi_webview", bool1).commit();
        return true;
      }
    }
    if (paramString.equalsIgnoreCase("//sightinfo"))
    {
      au.HU();
      bool1 = ((Boolean)com.tencent.mm.model.c.DT().get(344065, Boolean.valueOf(false))).booleanValue();
      au.HU();
      paramContext = com.tencent.mm.model.c.DT();
      if (!bool1) {}
      for (bool1 = true;; bool1 = false)
      {
        paramContext.set(344065, Boolean.valueOf(bool1));
        au.HU();
        com.tencent.mm.model.c.DT().lm(true);
        return true;
      }
    }
    if (paramString.startsWith("//sighttest"))
    {
      i = bi.WU(paramString.replace("//sighttest ", ""));
      au.HU();
      com.tencent.mm.model.c.DT().set(344066, Integer.valueOf(i));
      au.HU();
      com.tencent.mm.model.c.DT().lm(true);
      return true;
    }
    if (paramString.startsWith("//wxcamera"))
    {
      i = bi.WU(paramString.replace("//wxcamera ", ""));
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "set param %d", new Object[] { Integer.valueOf(i) });
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sUE, Integer.valueOf(i));
      return true;
    }
    if (paramString.startsWith("//printcrash"))
    {
      paramString = paramString.replace("//printcrash ", "");
      localObject1 = new TextView(paramContext);
      ((TextView)localObject1).setText(fX(bi.getInt(paramString, 0)));
      ((TextView)localObject1).setGravity(19);
      ((TextView)localObject1).setTextSize(1, 8.0F);
      ((TextView)localObject1).setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
      ((TextView)localObject1).setTextColor(-16711936);
      ((TextView)localObject1).setTypeface(Typeface.MONOSPACE);
      i = paramContext.getResources().getDimensionPixelSize(R.f.SmallestPadding);
      ((TextView)localObject1).setPadding(i, i, i, i);
      ((TextView)localObject1).setMovementMethod(ScrollingMovementMethod.getInstance());
      com.tencent.mm.ui.base.h.a(paramContext, null, (View)localObject1, null);
      return true;
    }
    if (paramString.startsWith("//printleak"))
    {
      paramString = new TextView(paramContext);
      paramString.setText(com.tencent.mm.compatible.b.f.yS());
      paramString.setGravity(19);
      paramString.setTextSize(1, 8.0F);
      paramString.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
      paramString.setTextColor(-16711936);
      paramString.setTypeface(Typeface.MONOSPACE);
      i = paramContext.getResources().getDimensionPixelSize(R.f.SmallestPadding);
      paramString.setPadding(i, i, i, i);
      paramString.setMovementMethod(ScrollingMovementMethod.getInstance());
      com.tencent.mm.ui.base.h.a(paramContext, null, paramString, null);
      return true;
    }
    if (paramString.startsWith("//resetmapcnt"))
    {
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sWX, Integer.valueOf(0));
      return true;
    }
    if (paramString.equals("//testrsa"))
    {
      com.tencent.mm.protocal.y.J("010001", "E338E5DAD46B331E3071FAFD4C0F84C7C7965DBBE64C6F8CC0F7CF04DC640C1F84A2014431A48D65F2B2F172BA9BE6F5A049BF52C78C14B0965E20F0D80D85A9180EBABB913D49821D28BFD9601DF52A4F3230AECAD96D23415F5E94D51A87CAA7630C5F3CB70345BAF572A4F61A134A2265AFD8FADDFE0222BD9ABF7DBEB7444D031454E8F21820BBC725E6857F765660E987FADEBCF6B3A15355C4CD3752A7B544D1D7E037AF4F9725BE37681A84C9E1DC431B3065294EAD53E913BAF16D46714B013EA077191E6CA08ABA6D70E9CA792D898D692E3168D6341369976657CD5E1504B9E2458F107225176734D11621AD36D7FFA26C573D6612455B09105C41", 106);
      return true;
    }
    if (paramString.equals("//testrsabad"))
    {
      com.tencent.mm.protocal.y.J("010001", "F338E5DAD46B331E3071FAFD4C0F84C7C7965DBBE64C6F8CC0F7CF04DC640C1F84A2014431A48D65F2B2F172BA9BE6F5A049BF52C78C14B0965E20F0D80D85A9180EBABB913D49821D28BFD9601DF52A4F3230AECAD96D23415F5E94D51A87CAA7630C5F3CB70345BAF572A4F61A134A2265AFD8FADDFE0222BD9ABF7DBEB7444D031454E8F21820BBC725E6857F765660E987FADEBCF6B3A15355C4CD3752A7B544D1D7E037AF4F9725BE37681A84C9E1DC431B3065294EAD53E913BAF16D46714B013EA077191E6CA08ABA6D70E9CA792D898D692E3168D6341369976657CD5E1504B9E2458F107225176734D11621AD36D7FFA26C573D6612455B09105C41", 106);
      return true;
    }
    if (paramString.equals("//walletofflinetest"))
    {
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sUj, Boolean.valueOf(false));
      return false;
    }
    if (paramString.startsWith("//makemsgdata "))
    {
      i = bi.getInt(paramString.split(" ")[1], 0);
      au.HU();
      com.tencent.mm.model.c.FT().H(com.tencent.mm.ui.chatting.y.tMb, i);
      return true;
    }
    if (paramString.startsWith("//pullappservice"))
    {
      ap.ccb().eT(ad.getContext());
      return true;
    }
    if (paramString.startsWith("//boundaryconfig"))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "boundaryconfig SessionTextMsg:%d", new Object[] { Integer.valueOf(bi.getInt(com.tencent.mm.k.g.AT().getValue("InputLimitSessionTextMsg"), 0)) });
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "boundaryconfig SNSObjectText:%d", new Object[] { Integer.valueOf(bi.getInt(com.tencent.mm.k.g.AT().getValue("InputLimitSNSObjectText"), 0)) });
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "boundaryconfig SnsCommentMaxSize:%d", new Object[] { Integer.valueOf(bi.getInt(com.tencent.mm.k.g.AT().getValue("SnsCommentMaxSize"), 0)) });
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "boundaryconfig FavText:%d", new Object[] { Integer.valueOf(bi.getInt(com.tencent.mm.k.g.AT().getValue("InputLimitFavText"), 0)) });
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "boundaryconfig EmotionBufSize:%d", new Object[] { Integer.valueOf(bi.getInt(com.tencent.mm.k.g.AT().getValue("InputLimitSendEmotionBufSize"), 0)) });
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "boundaryconfig EmotionWidth:%d", new Object[] { Integer.valueOf(bi.getInt(com.tencent.mm.k.g.AT().getValue("InputLimitSendEmotionWidth"), 0)) });
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "boundaryconfig FavImageSize:%d", new Object[] { Integer.valueOf(bi.getInt(com.tencent.mm.k.g.AT().getValue("InputLimitFavImageSize"), 0)) });
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "boundaryconfig FavVoiceLength:%d", new Object[] { Integer.valueOf(bi.getInt(com.tencent.mm.k.g.AT().getValue("InputLimitFavVoiceLength"), 0)) });
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "boundaryconfig ShortVideoAutoDownloadBufSize:%d", new Object[] { Integer.valueOf(bi.getInt(com.tencent.mm.k.g.AT().getValue("InputLimitSessionShortVideoBufSize"), 0)) });
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "boundaryconfig VideoSize:%d", new Object[] { Integer.valueOf(bi.getInt(com.tencent.mm.k.g.AT().getValue("InputLimitVideoSize"), 0)) });
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "boundaryconfig FileSize:%d", new Object[] { Integer.valueOf(bi.getInt(com.tencent.mm.k.g.AT().getValue("InputLimitFileSize"), 0)) });
      return true;
    }
    if (paramString.startsWith("//whatsnew"))
    {
      MMAppMgr.V((Activity)paramContext);
      return true;
    }
    if (paramString.startsWith("//profile "))
    {
      au.HU();
      paramString = com.tencent.mm.model.c.FR().Yg(paramString.replace("//profile ", "").trim());
      if ((paramString != null) && (paramString.BJ() != 0))
      {
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("Contact_User", paramString.getUsername());
        com.tencent.mm.bg.d.b(paramContext, "profile", ".ui.ContactInfoUI", (Intent)localObject1);
      }
      return true;
    }
    if (paramString.startsWith("//minigameupdate"))
    {
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sOP, Long.valueOf(0L));
      return true;
    }
    if (com.tencent.mm.sdk.a.b.chp())
    {
      if (paramString.startsWith("//cs"))
      {
        paramContext = new Intent();
        paramContext.putExtra("voipCSBizId", "gh_b35727b00b78");
        paramContext.putExtra("voipCSAppId", "wx6e7147e8d764e85d");
        com.tencent.mm.bg.d.b(ad.getContext(), "voip_cs", ".ui.VoipCSMainUI", paramContext);
        return true;
      }
      if (paramString.startsWith("//acs"))
      {
        paramContext = new Intent();
        paramContext.putExtra("voipCSBizId", "gh_e8b085bb67e0");
        paramContext.putExtra("voipCSAppId", "wx1224160e0adcefd6");
        com.tencent.mm.bg.d.b(ad.getContext(), "voip_cs", ".ui.VoipCSMainUI", paramContext);
        return true;
      }
      if (paramString.startsWith("//wifiset"))
      {
        paramContext = new Intent();
        paramContext.putExtra("free_wifi_ssid", "Xiaomi_WENDY");
        paramContext.putExtra("free_wifi_passowrd", "WX12345789");
        com.tencent.mm.bg.d.b(ad.getContext(), "freewifi", ".ui.FreeWifiCopyPwdUI", paramContext);
        return true;
      }
      if (paramString.startsWith("//bcs"))
      {
        paramContext = new Intent();
        paramContext.putExtra("voipCSBizId", "gh_e8b085bb67e0");
        paramContext.putExtra("voipCSAppId", "wx1224160e0adcefd6");
        paramContext.putExtra("voipCSAllowBackCamera", "1");
        paramContext.putExtra("voipCSShowOther", "1");
        paramContext.putExtra("voipCSAvatarUrl", "https://ss2.baidu.com/6ONYsjip0QIZ8tyhnq/it/u=28737416,3249768666&fm=58");
        paramContext.putExtra("voipCSContext", "test");
        com.tencent.mm.bg.d.b(ad.getContext(), "voip_cs", ".ui.VoipCSMainUI", paramContext);
        return true;
      }
    }
    if (paramString.startsWith("//getfpkey"))
    {
      paramString = bn.cmZ();
      com.tencent.mm.ui.base.h.a(paramContext, paramString, "Fingerprint Key", paramContext.getString(R.l.voip_get_key_copy), paramContext.getString(R.l.confirm_dialog_cancel), new b.9(paramContext, paramString), null);
      return true;
    }
    if (paramString.startsWith("//commitwd"))
    {
      WatchDogPushReceiver.Sk();
      return true;
    }
    if (paramString.startsWith("//setsnstestenv"))
    {
      localObject5 = paramString.split(" +");
      localObject1 = null;
      if (localObject5.length <= 1) {
        break label14645;
      }
      localObject4 = localObject5[1];
      if ((!com.tencent.mm.sdk.platformtools.p.isIPv4Address((String)localObject4)) && (!com.tencent.mm.sdk.platformtools.p.isIPv6Address((String)localObject4))) {
        break label14645;
      }
      if (localObject5.length <= 2) {
        break label14640;
      }
      paramString = localObject5[2];
      if ((!com.tencent.mm.sdk.platformtools.p.isIPv4Address(paramString)) && (!com.tencent.mm.sdk.platformtools.p.isIPv6Address(paramString))) {
        break label14640;
      }
      if (localObject5.length > 3)
      {
        localObject5 = localObject5[3];
        localObject1 = paramString;
        paramString = (String)localObject5;
        if (localObject4 != null) {}
        for (bool1 = true;; bool1 = false)
        {
          com.tencent.mm.platformtools.af.exF = bool1;
          com.tencent.mm.platformtools.af.exw = (String)localObject4;
          com.tencent.mm.platformtools.af.exY = (String)localObject1;
          com.tencent.mm.platformtools.af.exZ = paramString;
          com.tencent.mm.modelcdntran.g.NA().NF();
          Toast.makeText(paramContext, String.format("%s %s %s", new Object[] { com.tencent.mm.platformtools.af.exw, com.tencent.mm.platformtools.af.exY, com.tencent.mm.platformtools.af.exZ }), 1).show();
          return true;
        }
      }
    }
    else
    {
      if (paramString.startsWith("//snsvcodec"))
      {
        paramContext = paramString.split(" +");
        if (paramContext.length > 1)
        {
          paramContext = paramContext[1];
          if ("on".equalsIgnoreCase(paramContext))
          {
            fY(1);
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "snsvcodec val: 1");
          }
        }
        for (;;)
        {
          return true;
          if ("off".equalsIgnoreCase(paramContext))
          {
            fY(0);
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "snsvcodec val: 0");
            continue;
            fY(-1);
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "snsvcodec val: -1");
          }
        }
      }
      if (paramString.startsWith("//snswxpc"))
      {
        paramContext = paramString.split(" +");
        if (paramContext.length > 1)
        {
          paramContext = paramContext[1];
          if ("on".equalsIgnoreCase(paramContext))
          {
            fZ(1);
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "snswxpc val: 1");
          }
        }
        for (;;)
        {
          return true;
          if ("off".equalsIgnoreCase(paramContext))
          {
            fZ(0);
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "snswxpc val: 0");
            continue;
            fZ(-1);
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "snswxpc val: -1");
          }
        }
      }
      if (paramString.startsWith("//mmdumpsys"))
      {
        au.Em().H(new b.10());
        return true;
      }
      if (paramString.startsWith("//remittance reset"))
      {
        au.HU();
        com.tencent.mm.model.c.DT().set(327729, "0");
        return true;
      }
      if (paramString.startsWith("//wv "))
      {
        paramString = paramString.replace("//wv ", "");
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("rawUrl", paramString);
        com.tencent.mm.bg.d.b(paramContext, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
        return true;
      }
      if (paramString.startsWith("//wvjsapi "))
      {
        paramString = paramString.replace("//wvjsapi ", "");
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("rawUrl", paramString);
        com.tencent.mm.bg.d.b(paramContext, "webview", ".ui.tools.WebViewTestUI", (Intent)localObject1);
        return true;
      }
      if (paramString.startsWith("//setibeacontabuinopen"))
      {
        if (au.HX())
        {
          au.HU();
          com.tencent.mm.model.c.DT().a(aa.a.sRX, Integer.valueOf(1));
          return true;
        }
        return false;
      }
      if (paramString.startsWith("//setibeacontabuinclose"))
      {
        if (au.HX())
        {
          au.HU();
          com.tencent.mm.model.c.DT().a(aa.a.sRX, Integer.valueOf(0));
          return true;
        }
        return false;
      }
      if (paramString.startsWith("//setibeaconpushopen"))
      {
        if (au.HX())
        {
          au.HU();
          com.tencent.mm.model.c.DT().a(aa.a.sRS, Boolean.valueOf(true));
          return true;
        }
        return false;
      }
      if (paramString.startsWith("//setibeaconpushclose"))
      {
        if (au.HX())
        {
          au.HU();
          com.tencent.mm.model.c.DT().a(aa.a.sRS, Boolean.valueOf(false));
          return true;
        }
        return false;
      }
      if (paramString.startsWith("//ibeacon"))
      {
        bool1 = false;
        bool3 = false;
        if (Build.VERSION.SDK_INT >= 18) {
          bool1 = true;
        }
        paramString = BluetoothAdapter.getDefaultAdapter();
        bool2 = bool3;
        if (paramString != null)
        {
          bool2 = bool3;
          if (paramString.getState() == 12) {
            bool2 = true;
          }
        }
        bool4 = paramContext.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
        if ((bool1) && (bool2) && (bool4)) {}
        for (bool3 = true;; bool3 = false)
        {
          paramString = "isNowSupportedIbeacon:" + bool3 + "\n\nisSystemSupported:" + bool1 + "\nisBlueStateOn:" + bool2 + "\nisSupportedBLE:" + bool4 + "\nSDK:" + Build.VERSION.SDK_INT + "\nModel:" + Build.BRAND + "-" + com.tencent.mm.compatible.e.q.zE() + "\noperatingSystemInfo:" + com.tencent.mm.compatible.e.q.zI();
          com.tencent.mm.ui.base.h.a(paramContext, paramString, "TestResult", paramContext.getString(R.l.chatting_copy), paramContext.getString(R.l.confirm_dialog_cancel), new b.11(paramContext, paramString), null);
          return true;
        }
      }
      if (paramString.startsWith("//gettbs"))
      {
        bool1 = com.tencent.mm.compatible.e.q.deP.dfC;
        paramString = paramContext.getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4);
        localObject1 = paramString.getString("tbs_download", null);
        localObject4 = paramString.getString("tbs_webview_disable", null);
        bool2 = paramString.getBoolean("x5_jscore_enabled", false);
        i = WebView.getInstalledTbsCoreVersion(paramContext);
        j = WebView.getTbsSDKVersion(paramContext);
        Toast.makeText(paramContext, String.format("forceSys:%b\ntbs_download:%s\ntbs_disable:%s\ntbs_disable_min_sdk_version:%s\ntbs_disable_max_sdk_version:%s\ntbsCoreVersion:%d\ntbsSdkVersion:%d\nx5JsCoreEnabled:%b", new Object[] { Boolean.valueOf(bool1), localObject1, localObject4, paramString.getString("tbs_webview_min_sdk_version", null), paramString.getString("tbs_webview_max_sdk_version", null), Integer.valueOf(i), Integer.valueOf(j), Boolean.valueOf(bool2) }), 1).show();
        return true;
      }
      if (paramString.startsWith("//deletetbs"))
      {
        paramString = new Intent();
        paramString.setComponent(new ComponentName(ad.getPackageName(), "com.tencent.mm.booter.MMReceivers$SandBoxProcessReceiver"));
        paramContext.sendBroadcast(paramString);
        paramContext = paramContext.getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4).edit();
        paramContext.putLong("last_check_ts", 0L);
        paramContext.apply();
        au.HU();
        com.tencent.mm.model.c.DT().a(aa.a.sSV, Boolean.valueOf(false));
        return true;
      }
      if (paramString.startsWith("//tbsDisableOverScroll"))
      {
        localObject1 = paramContext.getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4).edit();
        try
        {
          paramContext = paramString.substring(paramString.indexOf(":") + 1);
          ((SharedPreferences.Editor)localObject1).putBoolean("tbs_disable_over_scroll", Boolean.parseBoolean(paramContext));
          ((SharedPreferences.Editor)localObject1).apply();
          return true;
        }
        catch (IndexOutOfBoundsException paramContext)
        {
          for (;;)
          {
            paramContext = "";
          }
        }
      }
      if (paramString.startsWith("//enabletbs"))
      {
        localObject1 = paramContext.getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4).edit();
        paramString = paramString.replace("//enabletbs ", "");
        if ("1".equals(paramString)) {}
        for (paramContext = "0";; paramContext = "1")
        {
          ((SharedPreferences.Editor)localObject1).putString("tbs_webview_disable", paramContext);
          if ("0".equals(paramString))
          {
            ((SharedPreferences.Editor)localObject1).putString("tbs_webview_min_sdk_version", "0");
            ((SharedPreferences.Editor)localObject1).putString("tbs_webview_max_sdk_version", "0");
          }
          ((SharedPreferences.Editor)localObject1).apply();
          return true;
        }
      }
      if (paramString.startsWith("//wvsha1"))
      {
        localObject1 = paramContext.getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4).edit();
        try
        {
          paramContext = paramString.substring(paramString.indexOf(":") + 1);
          ((SharedPreferences.Editor)localObject1).putBoolean("wvsha1", Boolean.parseBoolean(paramContext));
          ((SharedPreferences.Editor)localObject1).apply();
          return true;
        }
        catch (IndexOutOfBoundsException paramContext)
        {
          for (;;)
          {
            paramContext = "";
          }
        }
      }
      if (paramString.startsWith("//channelId")) {
        com.tencent.mm.ui.base.h.D(paramContext, com.tencent.mm.sdk.platformtools.e.bxk, "channelId");
      }
      if (paramString.startsWith("//traceroute"))
      {
        com.tencent.mm.bg.d.A(paramContext, "traceroute", ".ui.NetworkDiagnoseIntroUI");
        return true;
      }
      if (paramString.startsWith("//qzone "))
      {
        localObject1 = paramString.replace("//qzone ", "");
        new com.tencent.mm.pluginsdk.ui.applet.u(paramContext).TM((String)localObject1);
      }
      if (paramString.startsWith("//dumpcrash"))
      {
        com.tencent.mm.sdk.platformtools.j.q(com.tencent.mm.compatible.util.e.duN + "crash/", com.tencent.mm.compatible.util.e.duP, false);
        return true;
      }
      if (paramString.startsWith("//dumpanr"))
      {
        com.tencent.mm.sdk.platformtools.j.q("/data/anr/", com.tencent.mm.compatible.util.e.duP, false);
        return true;
      }
      if (paramString.startsWith("//testanr")) {
        try
        {
          Thread.sleep(10000L);
          return true;
        }
        catch (InterruptedException paramContext)
        {
          for (;;)
          {
            com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.CommandProcessor", paramContext, "", new Object[0]);
          }
        }
      }
      if (paramString.startsWith("//opensnsadRightbar"))
      {
        com.tencent.mm.platformtools.af.exv = true;
        return true;
      }
      if (paramString.startsWith("//setlocation "))
      {
        paramContext = paramString.split(" ");
        if ((paramContext != null) && (com.tencent.mm.sdk.a.b.chp()))
        {
          com.tencent.mm.platformtools.af.ewL = true;
          if (paramContext.length > 0) {
            com.tencent.mm.platformtools.af.lat = bi.getDouble(paramContext[1], 0.0D);
          }
          if (paramContext.length > 1) {
            com.tencent.mm.platformtools.af.lng = bi.getDouble(paramContext[2], 0.0D);
          }
          return true;
        }
        return false;
      }
      if (paramString.startsWith("//switchsdcard"))
      {
        paramString = ax.ciH();
        j = paramString.size();
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "switchsdcard sdcard size = " + j);
        if ((j > 0) && (paramString.get(0) != null) && (!bi.oW(((ax.a)paramString.get(0)).sIK)))
        {
          i = 0;
          while (i < j)
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "switchsdcard list i = " + i + " StatMountParse: " + paramString.get(i));
            i += 1;
          }
        }
        i = 0;
        for (;;)
        {
          if (i >= j) {
            break label14623;
          }
          if (!((ax.a)paramString.get(i)).sIK.equals(com.tencent.mm.compatible.util.e.bnC))
          {
            paramString = ((ax.a)paramString.get(i)).sIK;
            localObject1 = (Activity)paramContext;
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "switchsdcard newSdcard: " + paramString);
            if (!bi.oW(paramString)) {
              break;
            }
            com.tencent.mm.ui.base.h.by(paramContext, paramContext.getString(R.l.switch_sdcard_failed));
            return true;
          }
          i += 1;
        }
        com.tencent.mm.ui.base.h.a(paramContext, paramContext.getString(R.l.switch_sdcard_tips), "", paramContext.getString(R.l.app_ok), paramContext.getString(R.l.app_cancel), new b.12(paramString, paramContext, (Activity)localObject1), null);
        return true;
      }
      if (paramString.startsWith("//getip"))
      {
        au.DF().d(new bg(new b.13()));
        return true;
      }
      if (paramString.startsWith("//localjsapi"))
      {
        paramString = "file://" + com.tencent.mm.compatible.util.e.bnE + "test_jsapi.html";
        com.tencent.mm.sdk.platformtools.x.v("MicroMsg.CommandProcessor", "alvinluo path: %s", new Object[] { paramString });
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("rawUrl", paramString);
        com.tencent.mm.bg.d.b(paramContext, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
        return true;
      }
      if (paramString.startsWith("//getlocalkey"))
      {
        paramString = bn.cmY();
        com.tencent.mm.ui.base.h.a(paramContext, paramString, "Fingerprint Key", paramContext.getString(R.l.voip_get_key_copy), paramContext.getString(R.l.confirm_dialog_cancel), new b.14(paramContext, paramString), null);
        return true;
      }
      if (paramString.startsWith("//getdevid"))
      {
        paramString = com.tencent.mm.compatible.e.q.zz();
        com.tencent.mm.ui.base.h.a(paramContext, paramString, "devid", paramContext.getString(R.l.chatting_copy), paramContext.getString(R.l.confirm_dialog_cancel), new b.15(paramContext, paramString), null);
        return true;
      }
      if (paramString.startsWith("//testhtml"))
      {
        paramString = new Intent();
        paramString.putExtra("rawUrl", "file:///android_asset/jsapi/reader_test1.html");
        com.tencent.mm.bg.d.b(paramContext, "webview", ".ui.tools.WebViewUI", paramString);
        return true;
      }
      if (paramString.startsWith("//testlocalhtml "))
      {
        paramString = paramString.replace("//testlocalhtml ", "");
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("rawUrl", "file://" + paramString);
        ((Intent)localObject1).putExtra("neverGetA8Key", true);
        com.tencent.mm.bg.d.b(paramContext, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
        return true;
      }
      if (paramString.startsWith("//setkey"))
      {
        if (bn.Zn(paramString.replace("//setkey", ""))) {
          Toast.makeText(paramContext, R.l.voip_config_succ, 0).show();
        }
        return true;
      }
      if (paramString.startsWith("//checkspell"))
      {
        paramString = paramString.replace("//checkspell ", "");
        if (bi.oW(paramString)) {
          return true;
        }
        localObject1 = new StringBuilder();
        i = 0;
        while (i < paramString.length())
        {
          ((StringBuilder)localObject1).append("[" + paramString.charAt(i) + ":" + SpellMap.g(paramString.charAt(i)) + "]");
          i += 1;
        }
        com.tencent.mm.ui.base.h.D(paramContext, ((StringBuilder)localObject1).toString(), "Check Spell");
        return true;
      }
      if (paramString.startsWith("//gallery "))
      {
        paramString = paramString.replace("//gallery ", "");
        if (bi.oW(paramString)) {
          return true;
        }
        paramContext.getSharedPreferences(ad.chY(), 0).edit().putString("gallery", paramString).commit();
        return true;
      }
      if (paramString.startsWith("//svgtag"))
      {
        paramContext = paramString.replace("//svgtag ", "");
        if (paramContext.equals("on")) {
          com.tencent.mm.bq.c.kZ(true);
        }
        for (;;)
        {
          return true;
          if (paramContext.equals("off")) {
            com.tencent.mm.bq.c.kZ(false);
          }
        }
      }
      if (paramString.startsWith("//svgcode")) {}
      try
      {
        paramContext = paramString.replace("//svgcode ", "");
        if (!paramContext.equals("on")) {
          paramContext.equals("off");
        }
        paramContext = Class.forName("com.tencent.mm.BuildConfig");
        paramString = paramContext.getDeclaredField("SVGCode");
        paramString.setAccessible(true);
        bool1 = paramString.getBoolean(paramContext);
      }
      catch (ClassNotFoundException paramContext)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.CommandProcessor", paramContext, "", new Object[0]);
          bool1 = false;
        }
      }
      catch (NoSuchFieldException paramContext)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.CommandProcessor", paramContext, "", new Object[0]);
          bool1 = false;
        }
      }
      catch (IllegalAccessException paramContext)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.CommandProcessor", paramContext, "", new Object[0]);
          bool1 = false;
        }
      }
      catch (IllegalArgumentException paramContext)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.CommandProcessor", paramContext, "", new Object[0]);
          bool1 = false;
        }
        if (!paramString.startsWith("//testMbanner")) {
          break label6576;
        }
        try
        {
          paramContext = paramString.replace("//testMbanner ", "").split(",");
          if (paramContext.length < 2) {
            break label6574;
          }
          com.tencent.mm.model.bc.Ig().a(new com.tencent.mm.model.bb(Integer.valueOf(paramContext[0]).intValue(), Integer.valueOf(paramContext[1]).intValue(), null));
          return true;
          if (!paramString.startsWith("//testrsa")) {
            break label6597;
          }
          com.tencent.mm.protocal.y.J("010001", "E338E5DAD46B331E3071FAFD4C0F84C7C7965DBBE64C6F8CC0F7CF04DC640C1F84A2014431A48D65F2B2F172BA9BE6F5A049BF52C78C14B0965E20F0D80D85A9180EBABB913D49821D28BFD9601DF52A4F3230AECAD96D23415F5E94D51A87CAA7630C5F3CB70345BAF572A4F61A134A2265AFD8FADDFE0222BD9ABF7DBEB7444D031454E8F21820BBC725E6857F765660E987FADEBCF6B3A15355C4CD3752A7B544D1D7E037AF4F9725BE37681A84C9E1DC431B3065294EAD53E913BAF16D46714B013EA077191E6CA08ABA6D70E9CA792D898D692E3168D6341369976657CD5E1504B9E2458F107225176734D11621AD36D7FFA26C573D6612455B09105C41", 106);
          if (!paramString.startsWith("//recomT")) {
            break label6631;
          }
          try
          {
            paramContext = paramString.replace("//recomT ", "");
            au.HU().Gt().a(paramContext, true, null);
            return true;
            if (!paramString.startsWith("//recomF")) {
              break label6665;
            }
            try
            {
              paramContext = paramString.replace("//recomF ", "");
              au.HU().Gt().a(paramContext, false, null);
              return true;
              if (!paramString.startsWith("//resetwxpayagree")) {
                break label6697;
              }
              com.tencent.mm.kernel.g.Ek();
              com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sZH, Boolean.valueOf(false));
              return true;
              if (!paramString.startsWith("//ffmpeg")) {
                break label6825;
              }
              try
              {
                i = paramString.indexOf("-r ");
                j = paramString.indexOf("-b ");
                paramContext = paramString.substring(i + 3, j);
                paramString = paramString.substring(j + 3);
                float f = bi.getFloat(paramContext.trim(), 0.0F);
                i = bi.getInt(paramString.trim(), 0);
                com.tencent.mm.plugin.sight.base.b.nbW = i;
                com.tencent.mm.plugin.sight.base.b.nbX = f;
                Toast.makeText(ad.getContext(), "set C2C video encode frame rate " + f + " bitrate " + i, 0).show();
                return true;
              }
              catch (Exception paramContext)
              {
                for (;;)
                {
                  Toast.makeText(ad.getContext(), "set C2C video frame rate fail, please ensure your command.", 1).show();
                }
              }
              if (!paramString.startsWith("//onlinevideo")) {
                break label6924;
              }
              try
              {
                i = bi.getInt(paramString.replace("//onlinevideo ", ""), 0);
                au.HU();
                com.tencent.mm.model.c.DT().a(aa.a.sUi, Integer.valueOf(i));
                if (i > 0) {}
                for (paramContext = "online video";; paramContext = "offline video")
                {
                  Toast.makeText(ad.getContext(), paramContext, 0).show();
                  break;
                }
                if (!paramString.startsWith("//hevcinfo")) {
                  break label6991;
                }
              }
              catch (Exception paramContext)
              {
                com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.CommandProcessor", paramContext, "", new Object[0]);
                Toast.makeText(ad.getContext(), "set online video fail, please ensure your command.", 1).show();
              }
              paramContext = com.tencent.mm.plugin.u.e.bdt();
              paramString = com.tencent.mm.ui.chatting.y.tMb;
              localObject1 = new com.tencent.mm.storage.bd();
              ((com.tencent.mm.storage.bd)localObject1).ep(paramString);
              ((com.tencent.mm.storage.bd)localObject1).eX(2);
              ((com.tencent.mm.storage.bd)localObject1).setType(1);
              ((com.tencent.mm.storage.bd)localObject1).ay(System.currentTimeMillis());
              ((com.tencent.mm.storage.bd)localObject1).setContent(paramContext);
              com.tencent.mm.model.bd.i((com.tencent.mm.storage.bd)localObject1);
              return true;
              if (!paramString.startsWith("//presns")) {
                break label7033;
              }
              com.tencent.mm.kernel.g.Em().h(new b.2(), 3000L);
              Toast.makeText(ad.getContext(), "preload sns", 0).show();
              return true;
              if (!paramString.startsWith("//calcwxdata")) {
                break label7075;
              }
              au.HU();
              com.tencent.mm.model.c.DT().a(aa.a.sXe, Long.valueOf(0L));
              Toast.makeText(ad.getContext(), "calc wx data success", 0).show();
              return true;
              if (!paramString.startsWith("//checkspace")) {
                break label7181;
              }
              try
              {
                i = bi.getInt(paramString.replace("//checkspace ", ""), 0);
                paramContext = new com.tencent.mm.g.a.bb();
                paramContext.bIz.bIA = i;
                com.tencent.mm.sdk.b.a.sFg.m(paramContext);
                Toast.makeText(ad.getContext(), "check space code " + i, 0).show();
                return true;
              }
              catch (Exception paramContext)
              {
                for (;;)
                {
                  com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.CommandProcessor", paramContext, "", new Object[0]);
                  Toast.makeText(ad.getContext(), "check space code fail, please ensure your command.", 1).show();
                }
              }
              if ((!paramString.startsWith("//showkv")) || (!com.tencent.mm.sdk.a.b.chp())) {
                break label7265;
              }
              try
              {
                localObject1 = new Intent();
                ((Intent)localObject1).addFlags(134217728);
                ((Intent)localObject1).addFlags(524288);
                ((com.tencent.mm.plugin.kitchen.a.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.kitchen.a.a.class)).s(paramContext, (Intent)localObject1);
                return true;
              }
              catch (Exception localException1)
              {
                com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CommandProcessor", "showkv error [%s]", new Object[] { localException1.toString() });
              }
              if ((!paramString.startsWith("//showexpt")) || (!com.tencent.mm.sdk.a.b.chp())) {
                break label7305;
              }
              ((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.expt.a.a.class)).q(paramContext, new Intent());
              return true;
              if ((!paramString.startsWith("//showroomexpt")) || (!com.tencent.mm.sdk.a.b.chp())) {
                break label7345;
              }
              ((com.tencent.mm.plugin.expt.roomexpt.d)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.expt.roomexpt.d.class)).r(paramContext, new Intent());
              return true;
              if (!paramString.startsWith("//upfacemodel")) {
                break label7373;
              }
              au.DF().d(new com.tencent.mm.pluginsdk.g.a.a.m(42));
              return true;
              if (!paramString.startsWith("//facett")) {
                break label7402;
              }
              au.HU();
              com.tencent.mm.model.c.DT().a(aa.a.sVK, Boolean.valueOf(false));
              return true;
              if (!paramString.startsWith("//switchpaytype")) {
                break label7470;
              }
              paramContext = paramString.split(" ");
              if ((paramContext == null) || (paramContext.length < 2)) {
                break label7468;
              }
              try
              {
                i = bi.getInt(paramContext[1], 0);
                au.HU();
                com.tencent.mm.model.c.DT().set(339975, Integer.valueOf(i));
                return true;
              }
              catch (Exception paramContext)
              {
                com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CommandProcessor", "hy: switch wallet type error");
                return false;
              }
              return false;
              if (!paramString.startsWith("//setNfcOpenUrl ")) {
                break label7537;
              }
              paramString = paramString.replace("//setNfcOpenUrl ", "");
              Object localObject2 = ad.cia().edit();
              paramContext = paramString;
              if (!paramString.equalsIgnoreCase("null")) {
                break label7515;
              }
              paramContext = "";
              ((SharedPreferences.Editor)localObject2).putString("nfc_open_url", paramContext);
              ((SharedPreferences.Editor)localObject2).commit();
              return true;
              if (!paramString.startsWith("//setMBV8Debug ")) {
                break label7610;
              }
              paramContext = paramString.replace("//setMBV8Debug ", "");
              paramString = ad.cia().edit();
              if (!paramContext.equalsIgnoreCase("true")) {
                break label7596;
              }
              paramString.putBoolean("appbrandgame_open_v8debug", true);
              for (;;)
              {
                paramString.commit();
                return true;
                paramString.putBoolean("appbrandgame_open_v8debug", false);
              }
              if (!paramString.startsWith("//setAppBrandActionBar ")) {
                break label7683;
              }
              paramContext = paramString.replace("//setAppBrandActionBar ", "");
              paramString = ad.cia().edit();
              if (!paramContext.equalsIgnoreCase("new")) {
                break label7669;
              }
              paramString.putBoolean("appbrand_new_actionbar", true);
              for (;;)
              {
                paramString.commit();
                return true;
                paramString.putBoolean("appbrand_new_actionbar", false);
              }
              if (!paramString.startsWith("//snskvtest ")) {
                break label7739;
              }
              paramContext = paramString.replace("//snskvtest", "").trim();
              if (!paramContext.equals("0")) {
                break label7722;
              }
              com.tencent.mm.platformtools.af.exR = false;
              for (;;)
              {
                return true;
                if (paramContext.equals("1")) {
                  com.tencent.mm.platformtools.af.exR = true;
                }
              }
              if (!paramString.startsWith("//emoji ")) {
                break label7781;
              }
              paramContext = paramString.replace("//emoji ", "");
              ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().zr(paramContext);
              return true;
              if (!paramString.startsWith("//share ")) {
                break label7826;
              }
              i = Integer.valueOf(paramString.replace("//share ", "")).intValue();
              au.HU();
              com.tencent.mm.model.c.DT().set(229635, Integer.valueOf(i));
              return true;
              if (!paramString.startsWith("//dumpappinfoblob ")) {
                break label7904;
              }
              paramString = paramString.replace("//dumpappinfoblob ", "");
              paramString = com.tencent.mm.pluginsdk.model.app.ao.bmf().SW(paramString);
              com.tencent.mm.ui.base.h.D(paramContext, paramString.wJ() + "\n" + paramString.wK() + "\n" + paramString.wL(), "");
              return true;
              if (!paramString.startsWith("//googleauth ")) {
                break label8012;
              }
              paramString = paramString.replace("//googleauth ", "");
              if (TextUtils.isEmpty(paramString)) {
                break label7969;
              }
              if (!"webview".equals(paramString)) {
                break label7971;
              }
              paramContext.getSharedPreferences(ad.chY(), 0).edit().putBoolean("googleauth", true).commit();
              for (;;)
              {
                return true;
                if ("local".equals(paramString)) {
                  paramContext.getSharedPreferences(ad.chY(), 0).edit().putBoolean("googleauth", false).commit();
                }
              }
              if (!paramString.startsWith("//clrgamecache")) {
                break label8039;
              }
              paramString = com.tencent.mm.plugin.game.a.a.a.aSm();
              if (paramString == null) {
                break label8037;
              }
              paramString.dn(paramContext);
              return true;
              if (!paramString.startsWith("//clearwepkg")) {
                break label8114;
              }
              paramContext = new ub();
              paramContext.cfW.bIH = 6;
              paramString = paramString.replace("//clearwepkg ", "").trim();
              if ((bi.oW(paramString)) || (paramString.equals("//clearwepkg"))) {
                break label8104;
              }
              paramContext.cfW.cfX = paramString;
              com.tencent.mm.sdk.b.a.sFg.m(paramContext);
              return true;
              if (!paramString.startsWith("//clrgsd")) {
                break label8188;
              }
              paramContext = new gs();
              paramContext.bPT.bIH = 3;
              paramString = paramString.replace("//clrgsd ", "").trim();
              if ((bi.oW(paramString)) || (paramString.equals("//clrgsd"))) {
                break label8178;
              }
              paramContext.bPT.bPS = paramString;
              com.tencent.mm.sdk.b.a.sFg.m(paramContext);
              return true;
              if (!paramString.startsWith("//delDownload")) {
                break label8262;
              }
              paramContext = new gs();
              paramContext.bPT.bIH = 4;
              paramString = paramString.replace("//delDownload ", "").trim();
              if ((bi.oW(paramString)) || (paramString.equals("//delDownload"))) {
                break label8260;
              }
              paramContext.bPT.bPS = paramString;
              com.tencent.mm.sdk.b.a.sFg.m(paramContext);
              return true;
              if (!paramString.startsWith("//googlemap")) {
                break label8278;
              }
              com.tencent.mm.platformtools.af.exu = true;
              return true;
              if (!paramString.startsWith("//sosomap")) {
                break label8294;
              }
              com.tencent.mm.platformtools.af.exu = false;
              return true;
              if (!paramString.startsWith("//opentrace")) {
                break label8320;
              }
              new com.tencent.mm.ui.applet.d();
              com.tencent.mm.ui.applet.d.gB(ad.getContext());
              return true;
              if (!paramString.startsWith("//updateConversation")) {
                break label8418;
              }
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "update all conversation start");
              au.HU();
              paramContext = com.tencent.mm.model.c.FW().clE().iterator();
              while (paramContext.hasNext())
              {
                paramString = (String)paramContext.next();
                au.HU();
                paramString = com.tencent.mm.model.c.FT().dG(paramString, " and not ( type = 10000 and isSend != 2 ) ");
                au.HU();
                com.tencent.mm.model.c.FW().ak(paramString);
              }
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "update all conversation end");
              return true;
              if (!paramString.startsWith("//setshakecarddata")) {
                break label8438;
              }
              o.a.cbj().buy();
              return true;
              if (!paramString.startsWith("//clearshakecarddata")) {
                break label8458;
              }
              o.a.cbj().buz();
              return true;
              if (!paramString.startsWith("//pageSize")) {
                break label8510;
              }
              paramContext = ad.getContext();
              paramString = new StringBuilder("pageSize is ");
              au.HU();
              Toast.makeText(paramContext, com.tencent.mm.model.c.FO().getPageSize(), 1).show();
              return true;
              if (!paramString.startsWith("//resetDBStatus")) {
                break label8687;
              }
              au.HU();
              paramContext = new File(com.tencent.mm.model.c.DR());
              try
              {
                paramString = new StringBuilder();
                au.HU();
                paramString = com.tencent.mm.model.c.Gp() + paramContext.getName().replace(".db", ".db.backup");
                com.tencent.mm.ui.tools.d.i(new File(paramString), paramContext);
                com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "backupPath db path is %s", new Object[] { paramString });
                com.tencent.mm.a.e.d(paramContext, new File(paramContext.getAbsolutePath() + "err" + System.currentTimeMillis()));
                Toast.makeText(ad.getContext(), "db状态已重置,请重启微信", 1).show();
                return true;
              }
              catch (Exception paramContext)
              {
                for (;;)
                {
                  com.tencent.mm.sdk.platformtools.x.w("MicroMsg.CommandProcessor", "delete failed: " + paramContext.getMessage());
                }
              }
              if (!paramString.startsWith("//makesnsdata ")) {
                break label8723;
              }
              i = bi.getInt(paramString.replace("//makesnsdata ", ""), 0);
              o.g.cbk().eB(i);
              return true;
              if (!paramString.startsWith("//setsnsupload ")) {
                break label8751;
              }
              com.tencent.mm.platformtools.af.exE = bi.getInt(paramString.replace("//setsnsupload ", ""), 0);
              return true;
              if (!paramString.startsWith("//logsnstable")) {
                break label8779;
              }
              paramContext = new cl();
              com.tencent.mm.sdk.b.a.sFg.m(paramContext);
              return true;
              if (!paramString.startsWith("//resetsnstip")) {
                break label8808;
              }
              au.HU();
              com.tencent.mm.model.c.DT().set(327776, Integer.valueOf(0));
              return true;
              if (!paramString.startsWith("//checkcount")) {
                break label8889;
              }
              au.HU();
              i = com.tencent.mm.model.c.FT().GV(com.tencent.mm.ui.chatting.y.tMb);
              au.HU();
              j = com.tencent.mm.model.c.FT().GT(com.tencent.mm.ui.chatting.y.tMb);
              Toast.makeText(paramContext, "current count :" + i + " countAuto :" + j, 1).show();
              return true;
              if (!paramString.startsWith("//changeframe ")) {
                break label8947;
              }
              paramContext = paramString.replace("//changeframe ", "");
              ad.getContext().getSharedPreferences("preferences_animation", 0).edit().putFloat("frameInterval", Float.valueOf(paramContext).floatValue()).commit();
              return true;
              if (!paramString.startsWith("//opendumpview")) {
                break label8973;
              }
              new com.tencent.mm.ui.applet.c();
              com.tencent.mm.ui.applet.c.gA(ad.getContext());
              return true;
              if (!paramString.startsWith("//dumpmemory")) {
                break label8994;
              }
              System.gc();
              System.gc();
              com.tencent.mm.bv.b.cot();
              return true;
              if (!paramString.startsWith("//dumpsnsfile")) {
                break label9022;
              }
              paramContext = new pu();
              com.tencent.mm.sdk.b.a.sFg.m(paramContext);
              return true;
              if (!paramString.startsWith("//coverage")) {
                break label9047;
              }
              com.tencent.mm.plugin.report.b.f.KF(paramString.trim().substring(10));
              return true;
              if (!paramString.startsWith("//dumpthreadpool")) {
                break label9062;
              }
              com.tencent.mm.sdk.f.e.cjz();
              return true;
              if (!paramString.startsWith("//testverifypsw ")) {
                break label9143;
              }
              paramContext = paramString.replace("//testverifypsw ", "").trim();
              if (!paramContext.equals("0")) {
                break label9126;
              }
              com.tencent.mm.platformtools.af.exT = false;
              for (;;)
              {
                com.tencent.mm.sdk.platformtools.x.d("MicroMsg.CommandProcessor", "summerdktext testverifypsw msg[%s], testVerifyPsw[%b]", new Object[] { paramString, Boolean.valueOf(com.tencent.mm.platformtools.af.exT) });
                return true;
                if (paramContext.equals("1")) {
                  com.tencent.mm.platformtools.af.exT = true;
                }
              }
              if (!paramString.startsWith("//pickpoi")) {
                break label9184;
              }
              paramString = new Intent();
              paramString.putExtra("map_view_type", 8);
              com.tencent.mm.bg.d.b(paramContext, "location", ".ui.RedirectUI", paramString);
              return true;
              if (!paramString.startsWith("//configlist")) {
                break label9482;
              }
              if (!paramString.matches("^//configlist set ([\\S]*)=([\\S]*)$")) {
                break label9274;
              }
              paramString = com.tencent.mm.platformtools.ai.aH(paramString, "^//configlist set ([\\S]*)=([\\S]*)$");
              if ((paramString == null) || (paramString.size() != 2)) {
                break label9272;
              }
              paramContext = (String)paramString.get(0);
              paramString = (String)paramString.get(1);
              com.tencent.mm.k.g.AT().put(paramContext, paramString);
              paramContext = new com.tencent.mm.g.a.cm();
              com.tencent.mm.sdk.b.a.sFg.m(paramContext);
              for (;;)
              {
                return true;
                if (paramString.matches("^//configlist get ([\\S]*)$"))
                {
                  paramString = com.tencent.mm.platformtools.ai.aH(paramString, "^//configlist get ([\\S]*)$");
                  if ((paramString != null) && (paramString.size() == 1))
                  {
                    paramString = (String)paramString.get(0);
                    localObject2 = com.tencent.mm.k.g.AT().getValue(paramString);
                    Toast.makeText(paramContext, paramString + "=" + (String)localObject2, 0).show();
                  }
                }
                else
                {
                  au.HU();
                  paramString = (String)com.tencent.mm.model.c.DT().get(278530, "");
                  au.HU();
                  localObject2 = (String)com.tencent.mm.model.c.DT().get(278529, "");
                  localObject4 = com.tencent.mm.compatible.util.e.bnE + "dynacfg.xml";
                  bi.r((String)localObject4, (paramString + (String)localObject2).getBytes());
                  Toast.makeText(paramContext, "output dynacfg xml to " + (String)localObject4, 0).show();
                }
              }
              if (!paramString.startsWith("//security")) {
                break label9516;
              }
              try
              {
                paramContext = paramString.replace("//security ", "");
                au.HU().Gu().a(paramContext, true, null);
                return true;
                if (!paramString.startsWith("//updatepackage")) {
                  break label9560;
                }
                try
                {
                  paramContext = new com.tencent.mm.ar.k(bi.getInt(paramString.replace("//updatepackage ", "").trim(), 0));
                  au.DF().d(paramContext);
                  return true;
                  if (!paramString.startsWith("//copypackage")) {
                    break label9675;
                  }
                  com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "summercmd copypackage msg:%s", new Object[] { paramString });
                  paramString = ax.ciH();
                  i = paramString.size();
                  com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "summercmd copypackage size:%d", new Object[] { Integer.valueOf(i) });
                  if (i >= 2) {
                    break label9633;
                  }
                  com.tencent.mm.ui.base.h.by(paramContext, paramContext.getString(R.l.copy_acc_fail));
                  for (;;)
                  {
                    return true;
                    com.tencent.mm.ui.base.h.a(paramContext, paramContext.getString(R.l.copy_acc_tips), "", paramContext.getString(R.l.app_ok), paramContext.getString(R.l.app_cancel), new b.3(i, paramString, paramContext), null);
                  }
                  if (!paramString.startsWith("//copy -n ")) {
                    break label9794;
                  }
                  com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "summercmd copy -n msg:%s ", new Object[] { paramString });
                  localObject2 = ax.ciH();
                  i = ((ArrayList)localObject2).size();
                  com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "summercmd copy -n size:%d", new Object[] { Integer.valueOf(i) });
                  if (i >= 2) {
                    break label9750;
                  }
                  com.tencent.mm.ui.base.h.by(paramContext, paramContext.getString(R.l.copy_acc_fail));
                  for (;;)
                  {
                    return true;
                    com.tencent.mm.ui.base.h.a(paramContext, paramContext.getString(R.l.copy_acc_tips), "", paramContext.getString(R.l.app_ok), paramContext.getString(R.l.app_cancel), new b.4(paramString, i, (ArrayList)localObject2, paramContext), null);
                  }
                  if (!paramString.startsWith("//deletepackage")) {
                    break label9844;
                  }
                  try
                  {
                    paramContext = paramString.replace("//deletepackage ", "");
                    paramString = new ce();
                    paramString.bJD.bJE = bi.getInt(paramContext, 0);
                    com.tencent.mm.sdk.b.a.sFg.m(paramString);
                    return true;
                    if (!paramString.startsWith("//audiowritetofile")) {
                      break label9863;
                    }
                    com.tencent.mm.compatible.e.q.deN.dcd = true;
                    return true;
                    if (!paramString.startsWith("//bankcard")) {
                      break label9932;
                    }
                    paramString = new Intent();
                    paramString.putExtra("BaseScanUI_select_scan_mode", 7);
                    paramString.putExtra("bank_card_owner", "test");
                    if ((com.tencent.mm.plugin.voip.b.bx(paramContext)) || (com.tencent.mm.ax.e.bw(paramContext))) {
                      break label9930;
                    }
                    com.tencent.mm.bg.d.b((Activity)paramContext, "scanner", ".ui.BaseScanUI", paramString);
                    return true;
                    if (!paramString.startsWith("//banner")) {
                      break label10013;
                    }
                    localObject2 = com.tencent.mm.sdk.platformtools.bl.z("<sysmsg type=\"banner\"><mainframebanner type=\"11\"><showtype>1</showtype></mainframebanner></sysmsg>", "sysmsg");
                    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.CommandProcessor", "type:%s showType:%s data:%s", new Object[] { (String)((Map)localObject2).get(".sysmsg.mainframebanner.$type"), (String)((Map)localObject2).get(".sysmsg.mainframebanner.showtype"), (String)((Map)localObject2).get(".sysmsg.mainframebanner.data") });
                    if (!paramString.startsWith("//gamemsg")) {
                      break label10049;
                    }
                    paramContext = new me();
                    paramContext.bWO.content = paramString;
                    com.tencent.mm.sdk.b.a.sFg.m(paramContext);
                    return true;
                    if (!paramString.startsWith("//shortcut#")) {
                      break label10085;
                    }
                    paramContext = new ty();
                    paramContext.cfE.cfF = paramString;
                    com.tencent.mm.sdk.b.a.sFg.m(paramContext);
                    return true;
                    if (!paramString.startsWith("//gallerytype")) {
                      break label10117;
                    }
                    if (com.tencent.mm.ui.chatting.p.tJa) {
                      break label10111;
                    }
                    for (bool1 = true;; bool1 = false)
                    {
                      com.tencent.mm.ui.chatting.p.tJa = bool1;
                      return true;
                    }
                    paramContext.getString(R.l.voipface_debug);
                    if (!paramString.startsWith("//fullexit")) {
                      break label10166;
                    }
                    com.tencent.mm.sdk.platformtools.af.Wq("show_whatsnew");
                    com.tencent.mm.kernel.k.j(paramContext, true);
                    MMAppMgr.bc(paramContext);
                    au.hold();
                    com.tencent.mm.kernel.g.Ek().gi("");
                    MMAppMgr.afu();
                    return true;
                    if (!paramString.startsWith("//cleardldb")) {
                      break label10189;
                    }
                    au.HU();
                    com.tencent.mm.model.c.FX().aDd();
                    return true;
                    if (!paramString.startsWith("//setcardlayouttestdata")) {
                      break label10225;
                    }
                    paramContext = paramString.replace("//setcardlayouttestdata ", "");
                    au.HU();
                    com.tencent.mm.model.c.DT().a(aa.a.sPQ, paramContext);
                    return true;
                    if (!paramString.startsWith("//delchatroomsysmsg")) {
                      break label10338;
                    }
                    paramString = paramString.replace("//delchatroomsysmsg ", "");
                    i = paramString.indexOf(" ");
                    paramContext = paramString.substring(0, i);
                    paramString = paramString.substring(i);
                    if (!bi.oW(paramContext)) {
                      break label10275;
                    }
                    return false;
                    if (!paramString.startsWith("<")) {
                      break label10336;
                    }
                    localObject2 = new com.tencent.mm.storage.bd();
                    ((com.tencent.mm.storage.bd)localObject2).ay(System.currentTimeMillis());
                    ((com.tencent.mm.storage.bd)localObject2).setType(10002);
                    ((com.tencent.mm.storage.bd)localObject2).setContent(paramString);
                    ((com.tencent.mm.storage.bd)localObject2).eX(0);
                    ((com.tencent.mm.storage.bd)localObject2).ep(paramContext);
                    com.tencent.mm.model.bd.i((com.tencent.mm.storage.bd)localObject2);
                    return true;
                    return false;
                    if (!paramString.startsWith("//resetcrseq")) {
                      break label10672;
                    }
                    localObject2 = paramString.split(" ");
                    try
                    {
                      l1 = bi.getLong(localObject2[1], -1L);
                      l2 = bi.getLong(localObject2[2], -1L);
                      long l3 = bi.getLong(localObject2[3], -1L);
                      i = bi.getInt(localObject2[4], -1);
                      if (l1 > 0L)
                      {
                        localObject2 = l1 + "@chatroom";
                        au.HU();
                        localObject2 = com.tencent.mm.model.c.FW().Yq((String)localObject2);
                        if (localObject2 != null)
                        {
                          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "summerbadcr resetcrseq [%s] before [%d, %d, %d] [%d, %d, %d]", new Object[] { ((com.tencent.mm.storage.ai)localObject2).getUsername(), Long.valueOf(((com.tencent.mm.storage.ai)localObject2).wV()), Long.valueOf(((com.tencent.mm.storage.ai)localObject2).wT()), Integer.valueOf(((com.tencent.mm.storage.ai)localObject2).wU()), Long.valueOf(l2), Long.valueOf(l3), Integer.valueOf(i) });
                          if (l2 > -1L) {
                            ((com.tencent.mm.storage.ai)localObject2).av(l2);
                          }
                          if (l3 > -1L) {
                            ((com.tencent.mm.storage.ai)localObject2).au(l3);
                          }
                          if (i >= 0) {
                            ((com.tencent.mm.storage.ai)localObject2).fc(i);
                          }
                          au.HU();
                          i = com.tencent.mm.model.c.FW().a((com.tencent.mm.storage.ai)localObject2, ((com.tencent.mm.storage.ai)localObject2).getUsername(), false);
                          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "summerbadcr resetcrseq [%s] done [%d, %d, %d] ret:%d", new Object[] { ((com.tencent.mm.storage.ai)localObject2).getUsername(), Long.valueOf(((com.tencent.mm.storage.ai)localObject2).wV()), Long.valueOf(((com.tencent.mm.storage.ai)localObject2).wT()), Integer.valueOf(((com.tencent.mm.storage.ai)localObject2).wU()), Integer.valueOf(i) });
                          return true;
                        }
                      }
                    }
                    catch (Exception localException2)
                    {
                      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.CommandProcessor", localException2, "summerbadcr resetcrseq", new Object[0]);
                    }
                    if (!paramString.startsWith("//printchatroominfo")) {
                      break label10753;
                    }
                    paramContext = com.tencent.mm.ui.chatting.y.tMb;
                    if (com.tencent.mm.model.s.fq(paramContext)) {
                      break label10695;
                    }
                    return false;
                    au.HU();
                    Object localObject3 = com.tencent.mm.model.c.Ga().ih(paramContext);
                    if (localObject3 != null) {
                      break label10733;
                    }
                    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CommandProcessor", "summercrinfo chatroomId[%s], member is null", new Object[] { paramContext });
                    return false;
                    au.Em().H(new Runnable()
                    {
                      public final void run()
                      {
                        i = this.dhg.ckK();
                        j = this.dhg.field_chatroomdataflag;
                        int k = this.dhg.ckN();
                        Object localObject1 = this.dhg;
                        if (((com.tencent.mm.storage.u)localObject1).b(((com.tencent.mm.storage.u)localObject1).sOi)) {
                          ((com.tencent.mm.storage.u)localObject1).ckJ();
                        }
                        int m = ((com.tencent.mm.storage.u)localObject1).sOi.status;
                        int n = this.dhg.ckO();
                        localObject1 = this.dhg;
                        if (((com.tencent.mm.storage.u)localObject1).b(((com.tencent.mm.storage.u)localObject1).sOi)) {
                          ((com.tencent.mm.storage.u)localObject1).ckJ();
                        }
                        Object localObject3 = ((com.tencent.mm.storage.u)localObject1).sOi.dax;
                        localObject1 = this.dhg.Nn();
                        au.HU();
                        Object localObject2 = com.tencent.mm.model.c.FT().dG(paramContext, " and flag != 0 and msgSeq != 0");
                        boolean bool;
                        if ((localObject2 != null) && (((com.tencent.mm.g.c.cm)localObject2).field_msgId > 0L))
                        {
                          bool = true;
                          au.HU();
                          int i1 = com.tencent.mm.model.c.FT().GT(paramContext);
                          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "summercrinfo chatroomId[%s], version[%d], flag[%d], type[%d], status[%d], get[%b], msgCount[%d], maxCount[%d], upgrader[%s], membersize[%d]", new Object[] { paramContext, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Boolean.valueOf(bool), Integer.valueOf(i1), Integer.valueOf(n), localObject3, Integer.valueOf(((List)localObject1).size()) });
                          localObject2 = new StringBuilder();
                          ((StringBuilder)localObject2).append("---chatroominfo---\nid:").append(paramContext).append("\nver:").append(i).append("\nflag:").append(j).append("\ntype:").append(k).append("\nstatus:").append(m).append("\nget:").append(bool).append("\nmsgCount:").append(i1).append("\nmaxCount:").append(n).append("\nupgrader:").append((String)localObject3).append("\nmembersize:").append(((List)localObject1).size());
                          localObject3 = paramString.split(" ");
                          i = -1;
                        }
                        try
                        {
                          j = bi.getInt(localObject3[1], 0);
                          i = j;
                        }
                        catch (Exception localException)
                        {
                          for (;;)
                          {
                            continue;
                            i = j;
                          }
                        }
                        if (i != -1) {}
                        for (;;)
                        {
                          j = i;
                          if (i > ((List)localObject1).size()) {
                            j = ((List)localObject1).size();
                          }
                          if (j <= 10) {
                            break label560;
                          }
                          i = 10;
                          if (i > 0) {
                            ((StringBuilder)localObject2).append("\nmember:");
                          }
                          j = 0;
                          while (j < i)
                          {
                            ((StringBuilder)localObject2).append("\n").append((String)((List)localObject1).get(j));
                            j += 1;
                          }
                          bool = false;
                          break;
                          i = ((List)localObject1).size();
                        }
                        localObject1 = new com.tencent.mm.storage.bd();
                        ((com.tencent.mm.storage.bd)localObject1).ep(paramContext);
                        ((com.tencent.mm.storage.bd)localObject1).eX(2);
                        ((com.tencent.mm.storage.bd)localObject1).setType(1);
                        ((com.tencent.mm.storage.bd)localObject1).ay(System.currentTimeMillis());
                        ((com.tencent.mm.storage.bd)localObject1).setContent(((StringBuilder)localObject2).toString());
                        com.tencent.mm.model.bd.i((com.tencent.mm.storage.bd)localObject1);
                      }
                    });
                    return true;
                    if (!paramString.equals("//testupdate")) {
                      break label10844;
                    }
                    paramString = "";
                    try
                    {
                      paramContext = bi.convertStreamToString(paramContext.getAssets().open("aplha_update_info.xml"));
                      au.HU();
                      com.tencent.mm.model.c.DT().set(352273, paramContext);
                      au.HU();
                      com.tencent.mm.model.c.DT().set(352274, Long.valueOf(System.currentTimeMillis()));
                      new com.tencent.mm.pluginsdk.model.app.a(paramContext).cbI();
                      return true;
                    }
                    catch (IOException paramContext)
                    {
                      for (;;)
                      {
                        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.CommandProcessor", paramContext, "", new Object[0]);
                        paramContext = paramString;
                      }
                    }
                    if ((!paramString.equals("//checkUpdate0")) && (!paramString.equals("//checkUpdate1"))) {
                      break label10885;
                    }
                    com.tencent.mm.plugin.y.d.bfB().gB(paramString.equals("//checkUpdate1"));
                    com.tencent.mm.plugin.y.d.lrA = true;
                    return true;
                    if (!paramString.equals("//debugsnstimelinestat")) {
                      break label10946;
                    }
                    if (com.tencent.mm.platformtools.af.exM) {
                      break label10940;
                    }
                    for (bool1 = true;; bool1 = false)
                    {
                      com.tencent.mm.platformtools.af.exM = bool1;
                      Toast.makeText(ad.getContext(), "debugSnsTimelineStat: " + com.tencent.mm.platformtools.af.exM, 0).show();
                      return true;
                    }
                    if ((!paramString.startsWith("//abtestmsg")) || (!com.tencent.mm.sdk.a.b.chp())) {
                      break label10999;
                    }
                    paramContext = com.tencent.mm.model.c.a.ja(paramString.replace("//abtestmsg", ""));
                    com.tencent.mm.model.c.c.Jx().j(paramContext.dEw, 0);
                    com.tencent.mm.model.c.c.Jy().j(paramContext.dEx, 1);
                    return true;
                    if (!paramString.startsWith("//triggergetabtest")) {
                      break label11028;
                    }
                    au.HU();
                    com.tencent.mm.model.c.DT().a(aa.a.sQz, Long.valueOf(1L));
                    return true;
                    if (!paramString.startsWith("//vad")) {
                      break label11266;
                    }
                    localObject3 = ad.chZ();
                    if (localObject3 != null) {
                      break label11050;
                    }
                    return false;
                    if (!paramString.startsWith("//vad get")) {
                      break label11075;
                    }
                    com.tencent.mm.ui.base.h.D(paramContext, com.tencent.mm.modelvoiceaddr.a.c.Ug(), "VAD PARAMS").show();
                    return true;
                    paramContext = ((SharedPreferences)localObject3).edit();
                    if (!paramString.startsWith("//vad sd")) {
                      break label11118;
                    }
                    paramContext.putInt("s_delay_time", Integer.valueOf(paramString.substring(9).trim()).intValue());
                    if (!paramString.startsWith("//vad st")) {
                      break label11153;
                    }
                    paramContext.putInt("sil_time", Integer.valueOf(paramString.substring(9).trim()).intValue());
                    if (!paramString.startsWith("//vad snr")) {
                      break label11188;
                    }
                    paramContext.putFloat("s_n_ration", Float.valueOf(paramString.substring(10).trim()).floatValue());
                    if (!paramString.startsWith("//vad sw")) {
                      break label11223;
                    }
                    paramContext.putInt("s_window", Integer.valueOf(paramString.substring(9).trim()).intValue());
                    if (!paramString.startsWith("//vad sl")) {
                      break label11258;
                    }
                    paramContext.putInt("s_length", Integer.valueOf(paramString.substring(9).trim()).intValue());
                    paramContext.apply();
                    return true;
                    if (!paramString.startsWith("//dumpabtestrecords")) {
                      break label11418;
                    }
                    if (2 >= com.tencent.mm.sdk.platformtools.x.getLogLevel()) {
                      break label11285;
                    }
                    return false;
                    if (!paramString.contains("info")) {
                      break label11408;
                    }
                    for (paramString = com.tencent.mm.model.c.c.Jy().ckp();; paramString = com.tencent.mm.model.c.c.Jx().ckp())
                    {
                      localObject3 = new TextView(paramContext);
                      ((TextView)localObject3).setText(paramString);
                      ((TextView)localObject3).setGravity(8388627);
                      ((TextView)localObject3).setTextSize(1, 10.0F);
                      ((TextView)localObject3).setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                      ((TextView)localObject3).setTextColor(-16744704);
                      ((TextView)localObject3).setTypeface(Typeface.MONOSPACE);
                      ((TextView)localObject3).setMovementMethod(new ScrollingMovementMethod());
                      i = paramContext.getResources().getDimensionPixelSize(R.f.LargePadding);
                      ((TextView)localObject3).setPadding(i, i, i, i);
                      com.tencent.mm.ui.base.h.a(paramContext, null, (View)localObject3, null);
                      return true;
                    }
                    if (!paramString.startsWith("//triggerWebViewCookiesCleanup")) {
                      break label11447;
                    }
                    au.HU();
                    com.tencent.mm.model.c.DT().a(aa.a.sRK, Long.valueOf(0L));
                    return true;
                    if (!paramString.startsWith("//cleanwebcache")) {
                      break label11475;
                    }
                    paramContext = new com.tencent.mm.g.a.bl();
                    com.tencent.mm.sdk.b.a.sFg.m(paramContext);
                    return true;
                    if (!paramString.startsWith("//triggerWebViewCacheCleanup")) {
                      break label11529;
                    }
                    paramString = new Intent();
                    paramString.setComponent(new ComponentName(e.i.thA, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
                    paramString.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_CLEAR_WEBVIEW_CACHE");
                    paramContext.sendBroadcast(paramString);
                    return true;
                    if (!paramString.startsWith("//dumpsnsabtest")) {
                      break label11557;
                    }
                    paramContext = new cj();
                    com.tencent.mm.sdk.b.a.sFg.m(paramContext);
                    return true;
                    if (!paramString.startsWith("//dumpsilkvoicefile")) {
                      break label11573;
                    }
                    com.tencent.mm.platformtools.af.exQ = true;
                    return true;
                    if (!paramString.startsWith("//fucktit")) {
                      break label11602;
                    }
                    au.HU();
                    com.tencent.mm.model.c.DT().a(aa.a.sRx, Boolean.valueOf(true));
                    return true;
                    if (!paramString.startsWith("//clog ")) {
                      break label11647;
                    }
                    paramContext = paramString.substring(7);
                    com.tencent.mm.plugin.report.service.h.mEJ.ep(paramContext, "test cLog " + System.currentTimeMillis());
                    return true;
                    if ((!paramString.startsWith("//testformsg")) || (!com.tencent.mm.sdk.a.b.chp())) {
                      break label11742;
                    }
                    paramContext = paramString.substring(12).trim();
                    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "MMCore.getSysCmdMsgExtension() " + au.getSysCmdMsgExtension());
                    paramString = new by();
                    paramString.rcl = com.tencent.mm.platformtools.ab.oT(paramContext);
                    paramString.jQd = 10002;
                    paramContext = new d.a(paramString, false, false, false);
                    au.getSysCmdMsgExtension().b(paramContext);
                    return true;
                    if (!paramString.startsWith("//canwebviewcachedownload")) {
                      break label11800;
                    }
                    if (bi.getInt(bi.oV(paramString.substring(25)).trim(), 1) <= 0) {
                      break label11794;
                    }
                    for (bool1 = true;; bool1 = false)
                    {
                      au.HU();
                      com.tencent.mm.model.c.DT().a(aa.a.sSh, Boolean.valueOf(bool1));
                      return true;
                    }
                    if (!paramString.startsWith("//canwebviewcacheprepushdownload")) {
                      break label11858;
                    }
                    if (bi.getInt(bi.oV(paramString.substring(32)).trim(), 1) <= 0) {
                      break label11852;
                    }
                    for (bool1 = true;; bool1 = false)
                    {
                      au.HU();
                      com.tencent.mm.model.c.DT().a(aa.a.sSi, Boolean.valueOf(bool1));
                      return true;
                    }
                    if (!paramString.startsWith("//resetsnslukcy")) {
                      break label11937;
                    }
                    au.HU();
                    com.tencent.mm.model.c.DT().a(aa.a.sSx, Boolean.valueOf(false));
                    au.HU();
                    com.tencent.mm.model.c.DT().a(aa.a.sSy, Integer.valueOf(0));
                    au.HU();
                    com.tencent.mm.model.c.DT().a(aa.a.sSz, Integer.valueOf(0));
                    paramContext = new qk();
                    com.tencent.mm.sdk.b.a.sFg.m(paramContext);
                    return true;
                    if (!paramString.startsWith("//mmimgdec ")) {
                      break label12009;
                    }
                    paramString = paramString.substring(11);
                    if (!"on".equalsIgnoreCase(paramString)) {
                      break label11981;
                    }
                    MMBitmapFactory.setUseMMBitmapFactory(true);
                    Toast.makeText(paramContext, "内置图片(png)解析库开启", 0).show();
                    for (;;)
                    {
                      return true;
                      if ("off".equalsIgnoreCase(paramString))
                      {
                        MMBitmapFactory.setUseMMBitmapFactory(false);
                        Toast.makeText(paramContext, "内置图片(png)解析库关闭", 0).show();
                      }
                    }
                    if (!paramString.startsWith("//enablempsp")) {
                      break label12036;
                    }
                    an.a.lf(false);
                    Toast.makeText(paramContext, "设置成功，请重启微信！", 0).show();
                    return true;
                    if (!paramString.startsWith("//disablempsp")) {
                      break label12063;
                    }
                    an.a.lf(true);
                    Toast.makeText(paramContext, "设置成功，请重启微信！", 0).show();
                    return true;
                    if (!paramString.startsWith("//soterpay")) {
                      break label12085;
                    }
                    com.tencent.mm.bg.d.A(paramContext, "fingerprint", ".ui.SoterPayTestUI");
                    return true;
                    if (!paramString.startsWith(paramContext.getString(R.l.voip_debug))) {
                      break label12150;
                    }
                    if (com.tencent.mm.platformtools.af.exX) {
                      break label12144;
                    }
                    for (bool1 = true;; bool1 = false)
                    {
                      com.tencent.mm.platformtools.af.exX = bool1;
                      Toast.makeText(ad.getContext(), String.format("showVoipDebugLog:%b", new Object[] { Boolean.valueOf(com.tencent.mm.platformtools.af.exX) }), 0).show();
                      return true;
                    }
                    if (!paramString.startsWith("//getdltaskinfo")) {
                      break label12311;
                    }
                    paramContext = paramString.replace("//getdltaskinfo ", "");
                    try
                    {
                      paramString = com.tencent.mm.plugin.downloader.model.c.cs(bi.getLong(paramContext, 0L));
                      if (paramString != null) {
                        com.tencent.mm.sdk.platformtools.x.i("getdltaskinfo", "%d, %s, %s, %s", new Object[] { Long.valueOf(paramString.field_downloadId), paramString.field_downloadUrl, paramString.field_filePath, paramString.field_md5 });
                      } else {
                        com.tencent.mm.sdk.platformtools.x.i("getdltaskinfo", "infoID null");
                      }
                    }
                    catch (Exception paramString)
                    {
                      paramContext = com.tencent.mm.plugin.downloader.model.c.yN(paramContext);
                      if (paramContext != null) {
                        com.tencent.mm.sdk.platformtools.x.i("getdltaskinfo", "%d, %s, %s, %s", new Object[] { Long.valueOf(paramContext.field_downloadId), paramContext.field_downloadUrl, paramContext.field_filePath, paramContext.field_md5 });
                      } else {
                        com.tencent.mm.sdk.platformtools.x.i("getdltaskinfo", "infoURL null");
                      }
                    }
                    if (!paramString.startsWith("//testscan ")) {
                      break label12392;
                    }
                    paramContext = paramString.split(" ");
                    com.tencent.mm.platformtools.af.exW = bi.getFloat(paramContext[1], 0.0F);
                    com.tencent.mm.platformtools.af.exV = bi.getFloat(paramContext[2], 0.0F);
                    Toast.makeText(ad.getContext(), "mode auto:" + com.tencent.mm.platformtools.af.exW + ",mode continuous:" + com.tencent.mm.platformtools.af.exV, 1).show();
                    return true;
                    if (!paramString.startsWith("//switchrecordmode")) {
                      break label12490;
                    }
                    paramContext = ad.chZ();
                    bool2 = paramContext.getBoolean("settings_voicerecorder_mode", false);
                    if (bool2) {
                      break label12468;
                    }
                    bool1 = true;
                    paramContext.edit().putBoolean("settings_voicerecorder_mode", bool1).commit();
                    if (!bool2) {
                      break label12474;
                    }
                    Toast.makeText(ad.getContext(), "Turn off silk record", 1).show();
                    for (;;)
                    {
                      return true;
                      bool1 = false;
                      break;
                      Toast.makeText(ad.getContext(), "Turn on silk record", 1).show();
                    }
                    if (!paramString.startsWith("//indoorsensorconfig ")) {
                      break label12518;
                    }
                    com.tencent.mm.modelstat.e.RW().nl(paramString.replace("//indoorsensorconfig ", ""));
                    return true;
                    if (!paramString.startsWith("//testindoorsensor ")) {
                      break label12581;
                    }
                    paramContext = paramString.replace("//testindoorsensor ", "").split(",");
                    com.tencent.mm.modelstat.e.RW().a(12345, false, paramContext[0].equals("1"), bi.getFloat(paramContext[1], 0.0F), bi.getFloat(paramContext[2], 0.0F), 12);
                    return true;
                    if (!paramString.startsWith("//facedebug")) {
                      break label12593;
                    }
                    return true;
                    if (!paramString.startsWith("//rstfacett")) {
                      break label12605;
                    }
                    return true;
                    if (!paramString.startsWith("//switchjsc")) {
                      break label12733;
                    }
                    paramContext = paramString.replace("//switchjsc ", "");
                    paramString = ad.getContext().getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4);
                    if (!"clear".equals(paramContext)) {
                      break label12667;
                    }
                    paramString.edit().remove("switch_x5_jscore").apply();
                    for (;;)
                    {
                      return true;
                      if ("true".equals(paramContext)) {
                        paramString.edit().putBoolean("switch_x5_jscore", true).apply();
                      } else if ("false".equals(paramContext)) {
                        paramString.edit().putBoolean("switch_x5_jscore", false).apply();
                      }
                    }
                    if (!paramString.startsWith("//rfcdn")) {
                      break label12777;
                    }
                    try
                    {
                      com.tencent.mm.modelcdntran.g.NE().keep_OnRequestDoGetCdnDnsInfo(888);
                      return true;
                    }
                    catch (Exception paramContext)
                    {
                      for (;;)
                      {
                        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CommandProcessor", "rfcdn :%s", new Object[] { bi.i(paramContext) });
                      }
                    }
                    if (!paramString.startsWith("//testcrscroll ")) {
                      break label12842;
                    }
                    localObject3 = paramString.split(" ");
                    if ((localObject3 == null) || (localObject3.length <= 1)) {
                      break label12842;
                    }
                    com.tencent.mm.ui.chatting.b.ah.tSa = bi.getInt(localObject3[1], 0);
                    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "summerbadcr testscroll new BADCR_SCROLL_DELAY[%d]", new Object[] { Integer.valueOf(com.tencent.mm.ui.chatting.b.ah.tSa) });
                    return true;
                    if (!paramString.startsWith("//switchx5jscore")) {
                      break label12907;
                    }
                    paramContext = ad.chZ();
                    bool1 = paramContext.getBoolean("switch_x5_jscore", true);
                    paramContext = paramContext.edit();
                    if (bool1) {
                      break label12901;
                    }
                    for (bool1 = true;; bool1 = false)
                    {
                      paramContext.putBoolean("switch_x5_jscore", bool1).apply();
                      return true;
                    }
                    if (!paramString.startsWith("//removeaudioplayer")) {
                      break label12969;
                    }
                    paramContext = paramString.split(" ");
                    if (paramContext.length < 2) {
                      break label12967;
                    }
                    i = bi.getInt(paramContext[1], 3);
                    if ((i < 2) || (i > 9)) {
                      break label12967;
                    }
                    au.HU();
                    com.tencent.mm.model.c.DT().a(aa.a.sWs, Integer.valueOf(i));
                    return true;
                    if (!paramString.startsWith("//showaudiotoast")) {
                      break label13039;
                    }
                    paramContext = paramString.split(" ");
                    if (paramContext.length < 2) {
                      break label13031;
                    }
                    i = bi.getInt(paramContext[1], 0);
                    au.HU();
                    paramContext = com.tencent.mm.model.c.DT();
                    paramString = aa.a.sWt;
                    if (i != 1) {
                      break label13033;
                    }
                    for (bool1 = true;; bool1 = false)
                    {
                      paramContext.a(paramString, Boolean.valueOf(bool1));
                      return true;
                    }
                    if (!paramString.startsWith("//switchmusicplayer")) {
                      break label13383;
                    }
                    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "msg:%s", new Object[] { paramString });
                    paramContext = paramString.split(" ");
                    if (paramContext.length <= 2) {
                      break label13164;
                    }
                    if (bi.getInt(paramContext[1], 0) != 0) {
                      break label13166;
                    }
                    i = 0;
                    int m = bi.getInt(paramContext[2], -1);
                    au.HU();
                    int k = ((Integer)com.tencent.mm.model.c.DT().get(aa.a.sWq, Integer.valueOf(0))).intValue();
                    j = 1;
                    if (m != -1) {
                      break label13176;
                    }
                    if (i == 0) {
                      break label13171;
                    }
                    i = 255;
                    for (;;)
                    {
                      if (j != 0)
                      {
                        au.HU();
                        com.tencent.mm.model.c.DT().a(aa.a.sWq, Integer.valueOf(i));
                      }
                      return true;
                      i = 1;
                      break;
                      i = 0;
                      continue;
                      if (m == 0)
                      {
                        if (i != 0) {
                          i = k | 0x1;
                        } else {
                          i = k & 0xFFFFFFFE;
                        }
                      }
                      else if (m == 1)
                      {
                        if (i != 0) {
                          i = k | 0x2;
                        } else {
                          i = k & 0xFFFFFFFD;
                        }
                      }
                      else if (m == 4)
                      {
                        if (i != 0) {
                          i = k | 0x4;
                        } else {
                          i = k & 0xFFFFFFFB;
                        }
                      }
                      else if (m == 6)
                      {
                        if (i != 0) {
                          i = k | 0x10;
                        } else {
                          i = k & 0xFFFFFFEF;
                        }
                      }
                      else if (m == 7)
                      {
                        if (i != 0) {
                          i = k | 0x20;
                        } else {
                          i = k & 0xFFFFFFDF;
                        }
                      }
                      else if (m == 8)
                      {
                        if (i != 0) {
                          i = k | 0x40;
                        } else {
                          i = k & 0xFFFFFFBF;
                        }
                      }
                      else if (m == 9)
                      {
                        if (i != 0) {
                          i = k | 0x80;
                        } else {
                          i = k & 0xFF7F;
                        }
                      }
                      else
                      {
                        j = 0;
                        i = k;
                      }
                    }
                    if (!paramString.startsWith("//testdefaultrsa")) {
                      break label13494;
                    }
                    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CommandProcessor", "summercert testdefaultrsa");
                    paramString = paramString.split(" ");
                    if ((paramString == null) || (paramString.length <= 1)) {
                      break label13454;
                    }
                    for (bool1 = true;; bool1 = false)
                    {
                      com.tencent.mm.protocal.y.J("", "", 0);
                      paramString = com.tencent.mm.kernel.g.Eh().DF().DJ();
                      if (paramString != null) {
                        break;
                      }
                      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.CommandProcessor", "summercert testdefaultrsa push not alive");
                      return false;
                    }
                    new com.tencent.mm.modelsimple.q("", "", "", 0).Rc().a(paramString, new b.6(bool1, paramContext));
                    return true;
                    if (!paramString.startsWith("//dumpdefaultrsa")) {
                      break label13511;
                    }
                    return A(paramContext, "");
                    if (!paramString.startsWith("//hardwareinfo")) {
                      break label13538;
                    }
                    ((com.tencent.mm.plugin.hardwareopt.a.a.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.hardwareopt.a.a.a.class)).fD(true);
                    return true;
                    if (!paramString.startsWith("//showStringName")) {
                      break label13604;
                    }
                    paramContext = ad.chZ();
                    bool1 = paramContext.getBoolean("ShowStringName", false);
                    paramContext = paramContext.edit();
                    if (bool1) {
                      break label13598;
                    }
                    for (bool1 = true;; bool1 = false)
                    {
                      paramContext.putBoolean("ShowStringName", bool1).commit();
                      return true;
                    }
                    if (!paramString.startsWith("//mmphotoedit")) {
                      break label13633;
                    }
                    com.tencent.mm.bg.d.b(paramContext, "mmsight", ".ui.TestVideoEditUI", new Intent());
                    return true;
                    if (!paramString.startsWith("//msgDelay")) {
                      break label13649;
                    }
                    com.tencent.mm.ui.conversation.a.m.gW(paramContext);
                    return true;
                    if (!paramString.startsWith("//cpDelayedMsg")) {
                      break label13665;
                    }
                    com.tencent.mm.ui.conversation.a.m.gX(paramContext);
                    return true;
                    if (!paramString.startsWith("//testhce")) {
                      break label13687;
                    }
                    com.tencent.mm.bg.d.A(paramContext, "nfc", ".ui.HceTestUI");
                    return true;
                    if (!paramString.startsWith("//debugbigimg")) {
                      break label13772;
                    }
                    paramContext = paramString.split(" ");
                    if (paramContext.length != 2) {
                      break label13745;
                    }
                    if (!paramContext[1].equals("1")) {
                      break label13747;
                    }
                    ad.chZ().edit().putBoolean("debug_big_img", true).apply();
                    for (;;)
                    {
                      return true;
                      ad.chZ().edit().putBoolean("debug_big_img", false).apply();
                    }
                    if (!paramString.startsWith("//testservice ")) {
                      break label13848;
                    }
                    paramString = paramString.replace("//testservice ", "");
                    paramContext = paramContext.getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4).edit();
                    if ((paramString == null) || (!paramString.equals("1"))) {
                      break label13842;
                    }
                    for (bool1 = true;; bool1 = false)
                    {
                      paramContext.putBoolean("forceTrigger", bool1).commit();
                      return true;
                    }
                    if (!paramString.startsWith("//openDetect")) {
                      break label13889;
                    }
                    ad.getContext().getSharedPreferences("system_config_prefs", 4).edit().putBoolean("msg_delay_close_detect", false).apply();
                    return true;
                    if (!paramString.startsWith("//closeDetect")) {
                      break label13930;
                    }
                    ad.getContext().getSharedPreferences("system_config_prefs", 4).edit().putBoolean("msg_delay_close_detect", true).apply();
                    return true;
                    if (!paramString.startsWith("//snsimage")) {
                      break label14019;
                    }
                    try
                    {
                      i = bi.getInt(paramString.replace("//snsimage ", ""), 0);
                      com.tencent.mm.modelcdntran.g.ND().hA(i);
                      if (i > 0) {}
                      for (paramContext = "tcp sns image download";; paramContext = "http sns image download")
                      {
                        Toast.makeText(ad.getContext(), paramContext, 0).show();
                        break;
                      }
                      i = ft(paramString);
                    }
                    catch (Exception paramContext)
                    {
                      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.CommandProcessor", paramContext, "", new Object[0]);
                      Toast.makeText(ad.getContext(), "set snsimage fail, please ensure your command.", 1).show();
                    }
                    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.CommandProcessor", "processed : in ret:[%d]", new Object[] { Integer.valueOf(i) });
                    switch (i)
                    {
                    default: 
                      return false;
                    case 0: 
                      return false;
                    case 568: 
                      Assert.assertTrue("test errlog", false);
                      return true;
                    case 569: 
                      au.HU().Gr();
                      return true;
                    case 570: 
                      if (bn.Zn(fu(paramString))) {
                        Toast.makeText(paramContext, R.l.voip_config_succ, 0).show();
                      }
                      return true;
                    case 571: 
                      paramContext = fu(paramString);
                      au.HU();
                      com.tencent.mm.model.c.DT().set(8195, paramContext);
                      return true;
                    case 572: 
                      com.tencent.mm.sdk.platformtools.e.bxm = Integer.valueOf(fu(paramString)).intValue();
                      return true;
                    case 574: 
                      paramString = new StringBuilder().append(com.tencent.mm.compatible.e.q.zy());
                      au.HU();
                      com.tencent.mm.ui.base.h.D(paramContext, com.tencent.mm.a.g.u(com.tencent.mm.model.c.Df().getBytes()), "md5");
                      return true;
                    case 579: 
                      paramContext = fu(paramString);
                      am.a.HD().R(paramContext, "");
                      return true;
                    case 580: 
                      au.DF().d(new bg(new b.7()));
                      return true;
                    case 581: 
                      paramContext = fu(paramString);
                      com.tencent.mm.pluginsdk.model.app.ao.bme().SU(paramContext);
                      return true;
                    case 582: 
                      paramContext = fu(paramString);
                      au.HU();
                      paramContext = com.tencent.mm.model.c.FR().Yg(paramContext);
                      if ((paramContext == null) || (paramContext.BJ() == 0)) {
                        return false;
                      }
                      paramContext.Bb();
                      com.tencent.mm.model.s.t(paramContext);
                      return true;
                    case 583: 
                      au.HU();
                      com.tencent.mm.model.c.Gs();
                      return true;
                    case 584: 
                    case 585: 
                      bf.iH(fu(paramString));
                      return true;
                    case 586: 
                      paramContext = paramString.split(" ");
                      if ((paramContext != null) && (paramContext.length == 3)) {
                        com.tencent.mm.modelmulti.r.bh(bi.getInt(paramContext[1], 0), bi.getInt(paramContext[2], 0));
                      }
                      return true;
                    case 587: 
                      paramContext = new ck();
                      com.tencent.mm.sdk.b.a.sFg.m(paramContext);
                      return true;
                    case 588: 
                      com.tencent.mm.a.e.cr("/sdcard/tencent/MicroMsg/back");
                      au.HU();
                      com.tencent.mm.sdk.platformtools.j.q(com.tencent.mm.model.c.Gp(), "/sdcard/tencent/MicroMsg/back", false);
                      return true;
                    case 590: 
                      return true;
                    }
                    try
                    {
                      paramContext = paramString.split(" ");
                      if ((paramContext != null) && (paramContext.length > 1))
                      {
                        paramContext = com.tencent.mm.sdk.platformtools.bl.z(paramContext[0], "sysmsg");
                        au.HU().Gv().r(paramContext);
                      }
                    }
                    catch (Exception paramContext)
                    {
                      for (;;)
                      {
                        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.CommandProcessor", paramContext, "hy: error occured in commandProcessor", new Object[0]);
                      }
                    }
                    return true;
                  }
                  catch (Exception paramContext)
                  {
                    for (;;) {}
                  }
                }
                catch (Exception paramContext)
                {
                  for (;;) {}
                }
              }
              catch (Exception paramContext)
              {
                for (;;) {}
              }
            }
            catch (Exception paramContext)
            {
              for (;;) {}
            }
          }
          catch (Exception paramContext)
          {
            for (;;) {}
          }
        }
        catch (Exception paramContext)
        {
          for (;;) {}
        }
      }
      catch (Exception paramContext) {}
      Toast.makeText(ad.getContext(), "Using SVG Code : " + bool1 + " " + com.tencent.mm.svg.b.b.com(), 1).show();
      break label14653;
    }
    label6574:
    label6576:
    label6597:
    label6631:
    label6665:
    label6697:
    label6825:
    label6924:
    label6991:
    label7033:
    label7075:
    label7181:
    label7265:
    label7305:
    label7345:
    label7373:
    label7402:
    label7468:
    label7470:
    label7515:
    label7537:
    label7596:
    label7610:
    label7669:
    label7683:
    label7722:
    label7739:
    label7781:
    label7826:
    label7904:
    label7969:
    label7971:
    label8012:
    label8037:
    label8039:
    label8104:
    label8114:
    label8178:
    label8188:
    label8260:
    label8262:
    label8278:
    label8294:
    label8320:
    label8418:
    label8438:
    label8458:
    label8510:
    label8687:
    label8723:
    label8751:
    label8779:
    label8808:
    label8889:
    label8947:
    label8973:
    label8994:
    label9022:
    label9047:
    label9062:
    label9126:
    label9143:
    label9184:
    label9272:
    label9274:
    label9482:
    label9516:
    label9560:
    label9633:
    label9675:
    label9750:
    label9794:
    label9844:
    label9863:
    label9930:
    label9932:
    label10013:
    label10049:
    label10085:
    label10111:
    label10117:
    label10166:
    label10189:
    label10225:
    label10275:
    label10336:
    label10338:
    label10672:
    label10695:
    label10733:
    label10753:
    label10844:
    label10885:
    label10940:
    label10946:
    label10999:
    label11028:
    label11050:
    label11075:
    label11118:
    label11153:
    label11188:
    label11223:
    label11258:
    label11266:
    label11285:
    label11408:
    label11418:
    label11447:
    label11475:
    label11529:
    label11557:
    label11573:
    label11602:
    label11647:
    label11742:
    label11794:
    label11800:
    label11852:
    label11858:
    label11937:
    label11981:
    label12009:
    label12036:
    label12063:
    label12085:
    label12144:
    label12150:
    label12311:
    label12392:
    label12468:
    label12474:
    label12490:
    label12518:
    label12581:
    label12593:
    label12605:
    label12667:
    label12733:
    label12777:
    label12842:
    label12901:
    label12907:
    label12967:
    label12969:
    label13031:
    label13033:
    label13039:
    label13164:
    label13166:
    label13171:
    label13176:
    label13383:
    label13454:
    label13494:
    label13511:
    label13538:
    label13598:
    label13604:
    label13633:
    label13649:
    label13665:
    label13687:
    label13745:
    label13747:
    label13772:
    label13842:
    label13848:
    label13889:
    label13930:
    label14019:
    label14623:
    label14640:
    label14645:
    label14653:
    return true;
    return true;
    return true;
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/console/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */