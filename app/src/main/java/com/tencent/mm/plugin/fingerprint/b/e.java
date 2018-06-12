package com.tencent.mm.plugin.fingerprint.b;

import android.content.Context;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fingerprint.a;
import com.tencent.mm.plugin.soter.c.h;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.storage.aa.a;
import java.io.File;

public final class e
{
  private static boolean jgw = false;
  
  public static boolean aNA()
  {
    return jgw;
  }
  
  public static boolean aNB()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FingerPrintUtil", "isShowFPOpenGuide");
    if (aNy()) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FingerPrintUtil", "the fingerprint is open ready");
    }
    do
    {
      return false;
      if (!c.aNd())
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FingerPrintUtil", "device is not support");
        return false;
      }
      if ((o.bOW().bPp()) || (o.bOW().bPt()))
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FingerPrintUtil", "user had not reg wxpay");
        return false;
      }
      if (!o.bOW().bPw().bPl())
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FingerPrintUtil", "isSupportTouchPay is false");
        return false;
      }
      a.aMW();
      a.aMX();
    } while ((!c.aNf()) || (aNw()));
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FingerPrintUtil", "will showOpenFingerPrintPayGuide()");
    return true;
  }
  
  public static boolean aNC()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FingerPrintUtil", "isShowFPSettingGuide");
    if (aNy())
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FingerPrintUtil", "the fingerprint is open ready");
      return false;
    }
    if (!c.aNd())
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FingerPrintUtil", "device is not support");
      return false;
    }
    if ((o.bOW().bPp()) || (o.bOW().bPt()))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FingerPrintUtil", "user had not reg wxpay");
      return false;
    }
    if (!o.bOW().bPw().bPl())
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FingerPrintUtil", "isSupportTouchPay is false");
      return false;
    }
    new c();
    Object localObject;
    if (!c.aNf())
    {
      g.Ek();
      localObject = g.Ei().DT().get(aa.a.sQn, Boolean.valueOf(false));
      if (localObject == null) {
        break label147;
      }
    }
    label147:
    for (boolean bool = ((Boolean)localObject).booleanValue();; bool = false)
    {
      if (!bool)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FingerPrintUtil", "will call showSetFingerPrintGuide()");
        return true;
      }
      return false;
    }
  }
  
  public static boolean aNm()
  {
    return (c.aNd()) && (aNz()) && (jgw);
  }
  
  public static String aNu()
  {
    return h.bFk();
  }
  
  public static void aNv()
  {
    g.Ek();
    g.Ei().DT().a(aa.a.sQm, Boolean.valueOf(true));
  }
  
  public static boolean aNw()
  {
    g.Ek();
    Object localObject = g.Ei().DT().get(aa.a.sQm, Boolean.valueOf(false));
    if (localObject != null) {
      return ((Boolean)localObject).booleanValue();
    }
    return false;
  }
  
  public static void aNx()
  {
    g.Ek();
    g.Ei().DT().a(aa.a.sQn, Boolean.valueOf(true));
  }
  
  public static boolean aNy()
  {
    g.Ek();
    Object localObject = g.Ei().DT().get(aa.a.sQp, Boolean.FALSE);
    if (localObject != null) {
      return ((Boolean)localObject).booleanValue();
    }
    return false;
  }
  
  public static boolean aNz()
  {
    g.Ek();
    Object localObject = g.Ei().DT().get(aa.a.sQq, Boolean.valueOf(false));
    if (localObject != null) {
      return ((Boolean)localObject).booleanValue();
    }
    return false;
  }
  
  public static final String dk(Context paramContext)
  {
    return paramContext.getApplicationContext().getFilesDir().getAbsolutePath() + "/b7c9a7fd-851e-7761-07df-8ab7c0b02787.sec";
  }
  
  /* Error */
  public static int dl(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 8
    //   3: aconst_null
    //   4: astore 9
    //   6: aconst_null
    //   7: astore 7
    //   9: aload_0
    //   10: invokestatic 196	com/tencent/mm/plugin/fingerprint/b/e:dk	(Landroid/content/Context;)Ljava/lang/String;
    //   13: astore 10
    //   15: new 176	java/io/File
    //   18: dup
    //   19: aload 10
    //   21: invokespecial 199	java/io/File:<init>	(Ljava/lang/String;)V
    //   24: astore 11
    //   26: aload 11
    //   28: invokevirtual 202	java/io/File:exists	()Z
    //   31: ifne +180 -> 211
    //   34: iconst_1
    //   35: istore_1
    //   36: aconst_null
    //   37: astore_2
    //   38: iload_1
    //   39: ifeq +808 -> 847
    //   42: aload_0
    //   43: invokevirtual 206	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   46: ldc -48
    //   48: invokevirtual 214	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   51: astore_0
    //   52: aload_0
    //   53: astore_2
    //   54: aload 9
    //   56: astore_3
    //   57: new 216	java/io/FileOutputStream
    //   60: dup
    //   61: aload 11
    //   63: invokespecial 219	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   66: astore 4
    //   68: sipush 1024
    //   71: newarray <illegal type>
    //   73: astore_2
    //   74: aload_0
    //   75: aload_2
    //   76: invokevirtual 225	java/io/InputStream:read	([B)I
    //   79: istore_1
    //   80: iload_1
    //   81: iconst_m1
    //   82: if_icmpeq +377 -> 459
    //   85: aload 4
    //   87: aload_2
    //   88: iconst_0
    //   89: iload_1
    //   90: invokevirtual 229	java/io/FileOutputStream:write	([BII)V
    //   93: goto -19 -> 74
    //   96: astore_2
    //   97: aload 4
    //   99: astore 5
    //   101: aload_2
    //   102: astore 4
    //   104: aload_0
    //   105: astore_2
    //   106: aload 5
    //   108: astore_3
    //   109: ldc 16
    //   111: aload 4
    //   113: ldc -25
    //   115: iconst_0
    //   116: anewarray 4	java/lang/Object
    //   119: invokestatic 235	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   122: aload_0
    //   123: astore_2
    //   124: aload 5
    //   126: astore_3
    //   127: ldc 16
    //   129: new 163	java/lang/StringBuilder
    //   132: dup
    //   133: ldc -19
    //   135: invokespecial 238	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   138: aload 4
    //   140: invokevirtual 241	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   143: invokevirtual 183	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: invokevirtual 188	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   149: invokestatic 32	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   152: aload_0
    //   153: ifnull +7 -> 160
    //   156: aload_0
    //   157: invokevirtual 244	java/io/InputStream:close	()V
    //   160: aload 5
    //   162: ifnull +680 -> 842
    //   165: aload 5
    //   167: invokevirtual 245	java/io/FileOutputStream:close	()V
    //   170: iconst_m1
    //   171: istore_1
    //   172: invokestatic 251	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   175: new 163	java/lang/StringBuilder
    //   178: dup
    //   179: ldc -3
    //   181: invokespecial 238	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   184: aload 10
    //   186: invokevirtual 183	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   189: invokevirtual 188	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   192: invokevirtual 257	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   195: invokevirtual 263	java/lang/Process:waitFor	()I
    //   198: ifne +560 -> 758
    //   201: ldc 16
    //   203: ldc_w 265
    //   206: invokestatic 24	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   209: iload_1
    //   210: ireturn
    //   211: aload 11
    //   213: invokestatic 271	com/tencent/mm/a/g:m	(Ljava/io/File;)Ljava/lang/String;
    //   216: astore 12
    //   218: ldc -25
    //   220: astore 5
    //   222: aload_0
    //   223: invokevirtual 206	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   226: ldc -48
    //   228: invokevirtual 214	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   231: astore_2
    //   232: aload 5
    //   234: astore_3
    //   235: aload_2
    //   236: ifnull +17 -> 253
    //   239: aload_2
    //   240: astore_3
    //   241: aload_2
    //   242: sipush 1024
    //   245: invokestatic 275	com/tencent/mm/a/g:b	(Ljava/io/InputStream;I)Ljava/lang/String;
    //   248: astore 4
    //   250: aload 4
    //   252: astore_3
    //   253: aload_3
    //   254: astore 6
    //   256: aload_2
    //   257: astore 4
    //   259: aload_2
    //   260: ifnull +13 -> 273
    //   263: aload_2
    //   264: invokevirtual 244	java/io/InputStream:close	()V
    //   267: aload_2
    //   268: astore 4
    //   270: aload_3
    //   271: astore 6
    //   273: aload 12
    //   275: invokestatic 281	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   278: ifne +149 -> 427
    //   281: aload 6
    //   283: invokestatic 281	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   286: ifne +141 -> 427
    //   289: aload 12
    //   291: aload 6
    //   293: invokevirtual 287	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   296: ifeq +131 -> 427
    //   299: iconst_0
    //   300: istore_1
    //   301: aload 4
    //   303: astore_2
    //   304: goto -266 -> 38
    //   307: astore 4
    //   309: ldc 16
    //   311: aload 4
    //   313: ldc -25
    //   315: iconst_0
    //   316: anewarray 4	java/lang/Object
    //   319: invokestatic 235	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   322: aload_3
    //   323: astore 6
    //   325: aload_2
    //   326: astore 4
    //   328: goto -55 -> 273
    //   331: astore 4
    //   333: aconst_null
    //   334: astore_2
    //   335: aload_2
    //   336: astore_3
    //   337: ldc 16
    //   339: aload 4
    //   341: ldc -25
    //   343: iconst_0
    //   344: anewarray 4	java/lang/Object
    //   347: invokestatic 235	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   350: aload 5
    //   352: astore 6
    //   354: aload_2
    //   355: astore 4
    //   357: aload_2
    //   358: ifnull -85 -> 273
    //   361: aload_2
    //   362: invokevirtual 244	java/io/InputStream:close	()V
    //   365: aload 5
    //   367: astore 6
    //   369: aload_2
    //   370: astore 4
    //   372: goto -99 -> 273
    //   375: astore_3
    //   376: ldc 16
    //   378: aload_3
    //   379: ldc -25
    //   381: iconst_0
    //   382: anewarray 4	java/lang/Object
    //   385: invokestatic 235	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   388: aload 5
    //   390: astore 6
    //   392: aload_2
    //   393: astore 4
    //   395: goto -122 -> 273
    //   398: astore_0
    //   399: aconst_null
    //   400: astore_3
    //   401: aload_3
    //   402: ifnull +7 -> 409
    //   405: aload_3
    //   406: invokevirtual 244	java/io/InputStream:close	()V
    //   409: aload_0
    //   410: athrow
    //   411: astore_2
    //   412: ldc 16
    //   414: aload_2
    //   415: ldc -25
    //   417: iconst_0
    //   418: anewarray 4	java/lang/Object
    //   421: invokestatic 235	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   424: goto -15 -> 409
    //   427: aload 12
    //   429: invokestatic 281	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   432: ifne +19 -> 451
    //   435: aload 6
    //   437: invokestatic 281	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   440: ifeq +11 -> 451
    //   443: iconst_0
    //   444: istore_1
    //   445: aload 4
    //   447: astore_2
    //   448: goto -410 -> 38
    //   451: iconst_1
    //   452: istore_1
    //   453: aload 4
    //   455: astore_2
    //   456: goto -418 -> 38
    //   459: aload 4
    //   461: invokevirtual 290	java/io/FileOutputStream:flush	()V
    //   464: aload_0
    //   465: ifnull +7 -> 472
    //   468: aload_0
    //   469: invokevirtual 244	java/io/InputStream:close	()V
    //   472: aload 4
    //   474: invokevirtual 245	java/io/FileOutputStream:close	()V
    //   477: iconst_0
    //   478: istore_1
    //   479: goto -307 -> 172
    //   482: astore_0
    //   483: ldc 16
    //   485: aload_0
    //   486: ldc -25
    //   488: iconst_0
    //   489: anewarray 4	java/lang/Object
    //   492: invokestatic 235	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   495: ldc 16
    //   497: new 163	java/lang/StringBuilder
    //   500: dup
    //   501: ldc_w 292
    //   504: invokespecial 238	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   507: aload_0
    //   508: invokevirtual 293	java/io/IOException:getMessage	()Ljava/lang/String;
    //   511: invokevirtual 183	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   514: invokevirtual 188	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   517: invokestatic 32	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   520: goto -48 -> 472
    //   523: astore_0
    //   524: ldc 16
    //   526: aload_0
    //   527: ldc -25
    //   529: iconst_0
    //   530: anewarray 4	java/lang/Object
    //   533: invokestatic 235	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   536: ldc 16
    //   538: new 163	java/lang/StringBuilder
    //   541: dup
    //   542: ldc_w 295
    //   545: invokespecial 238	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   548: aload_0
    //   549: invokevirtual 293	java/io/IOException:getMessage	()Ljava/lang/String;
    //   552: invokevirtual 183	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   555: invokevirtual 188	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   558: invokestatic 32	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   561: iconst_0
    //   562: istore_1
    //   563: goto -391 -> 172
    //   566: astore_0
    //   567: ldc 16
    //   569: aload_0
    //   570: ldc -25
    //   572: iconst_0
    //   573: anewarray 4	java/lang/Object
    //   576: invokestatic 235	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   579: ldc 16
    //   581: new 163	java/lang/StringBuilder
    //   584: dup
    //   585: ldc_w 292
    //   588: invokespecial 238	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   591: aload_0
    //   592: invokevirtual 293	java/io/IOException:getMessage	()Ljava/lang/String;
    //   595: invokevirtual 183	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   598: invokevirtual 188	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   601: invokestatic 32	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   604: goto -444 -> 160
    //   607: astore_0
    //   608: ldc 16
    //   610: aload_0
    //   611: ldc -25
    //   613: iconst_0
    //   614: anewarray 4	java/lang/Object
    //   617: invokestatic 235	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   620: ldc 16
    //   622: new 163	java/lang/StringBuilder
    //   625: dup
    //   626: ldc_w 295
    //   629: invokespecial 238	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   632: aload_0
    //   633: invokevirtual 293	java/io/IOException:getMessage	()Ljava/lang/String;
    //   636: invokevirtual 183	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   639: invokevirtual 188	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   642: invokestatic 32	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   645: iconst_m1
    //   646: istore_1
    //   647: goto -475 -> 172
    //   650: astore 4
    //   652: aload_2
    //   653: astore_0
    //   654: aload 8
    //   656: astore_3
    //   657: aload_0
    //   658: ifnull +7 -> 665
    //   661: aload_0
    //   662: invokevirtual 244	java/io/InputStream:close	()V
    //   665: aload_3
    //   666: ifnull +7 -> 673
    //   669: aload_3
    //   670: invokevirtual 245	java/io/FileOutputStream:close	()V
    //   673: aload 4
    //   675: athrow
    //   676: astore_0
    //   677: ldc 16
    //   679: aload_0
    //   680: ldc -25
    //   682: iconst_0
    //   683: anewarray 4	java/lang/Object
    //   686: invokestatic 235	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   689: ldc 16
    //   691: new 163	java/lang/StringBuilder
    //   694: dup
    //   695: ldc_w 292
    //   698: invokespecial 238	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   701: aload_0
    //   702: invokevirtual 293	java/io/IOException:getMessage	()Ljava/lang/String;
    //   705: invokevirtual 183	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   708: invokevirtual 188	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   711: invokestatic 32	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   714: goto -49 -> 665
    //   717: astore_0
    //   718: ldc 16
    //   720: aload_0
    //   721: ldc -25
    //   723: iconst_0
    //   724: anewarray 4	java/lang/Object
    //   727: invokestatic 235	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   730: ldc 16
    //   732: new 163	java/lang/StringBuilder
    //   735: dup
    //   736: ldc_w 295
    //   739: invokespecial 238	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   742: aload_0
    //   743: invokevirtual 293	java/io/IOException:getMessage	()Ljava/lang/String;
    //   746: invokevirtual 183	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   749: invokevirtual 188	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   752: invokestatic 32	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   755: goto -82 -> 673
    //   758: ldc 16
    //   760: ldc_w 297
    //   763: invokestatic 32	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   766: iload_1
    //   767: ireturn
    //   768: astore_0
    //   769: ldc 16
    //   771: new 163	java/lang/StringBuilder
    //   774: dup
    //   775: ldc_w 299
    //   778: invokespecial 238	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   781: aload_0
    //   782: invokevirtual 241	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   785: invokevirtual 183	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   788: invokevirtual 188	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   791: invokestatic 24	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   794: iload_1
    //   795: ireturn
    //   796: astore 4
    //   798: aload_2
    //   799: astore_0
    //   800: goto -143 -> 657
    //   803: astore_2
    //   804: aload 4
    //   806: astore_3
    //   807: aload_2
    //   808: astore 4
    //   810: goto -153 -> 657
    //   813: astore 4
    //   815: aload_2
    //   816: astore_0
    //   817: aload 7
    //   819: astore 5
    //   821: goto -717 -> 104
    //   824: astore 4
    //   826: aload 7
    //   828: astore 5
    //   830: goto -726 -> 104
    //   833: astore_0
    //   834: goto -433 -> 401
    //   837: astore 4
    //   839: goto -504 -> 335
    //   842: iconst_m1
    //   843: istore_1
    //   844: goto -672 -> 172
    //   847: iconst_0
    //   848: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	849	0	paramContext	Context
    //   35	809	1	i	int
    //   37	51	2	localObject1	Object
    //   96	6	2	localException1	Exception
    //   105	288	2	localObject2	Object
    //   411	4	2	localIOException1	java.io.IOException
    //   447	352	2	localObject3	Object
    //   803	13	2	localObject4	Object
    //   56	281	3	localObject5	Object
    //   375	4	3	localIOException2	java.io.IOException
    //   400	407	3	localObject6	Object
    //   66	236	4	localObject7	Object
    //   307	5	4	localIOException3	java.io.IOException
    //   326	1	4	localObject8	Object
    //   331	9	4	localIOException4	java.io.IOException
    //   355	118	4	localObject9	Object
    //   650	24	4	localObject10	Object
    //   796	9	4	localObject11	Object
    //   808	1	4	localObject12	Object
    //   813	1	4	localException2	Exception
    //   824	1	4	localException3	Exception
    //   837	1	4	localIOException5	java.io.IOException
    //   99	730	5	localObject13	Object
    //   254	182	6	localObject14	Object
    //   7	820	7	localObject15	Object
    //   1	654	8	localObject16	Object
    //   4	51	9	localObject17	Object
    //   13	172	10	str1	String
    //   24	188	11	localFile	File
    //   216	212	12	str2	String
    // Exception table:
    //   from	to	target	type
    //   68	74	96	java/lang/Exception
    //   74	80	96	java/lang/Exception
    //   85	93	96	java/lang/Exception
    //   459	464	96	java/lang/Exception
    //   263	267	307	java/io/IOException
    //   222	232	331	java/io/IOException
    //   361	365	375	java/io/IOException
    //   222	232	398	finally
    //   405	409	411	java/io/IOException
    //   468	472	482	java/io/IOException
    //   472	477	523	java/io/IOException
    //   156	160	566	java/io/IOException
    //   165	170	607	java/io/IOException
    //   42	52	650	finally
    //   661	665	676	java/io/IOException
    //   669	673	717	java/io/IOException
    //   172	209	768	java/lang/Exception
    //   758	766	768	java/lang/Exception
    //   57	68	796	finally
    //   109	122	796	finally
    //   127	152	796	finally
    //   68	74	803	finally
    //   74	80	803	finally
    //   85	93	803	finally
    //   459	464	803	finally
    //   42	52	813	java/lang/Exception
    //   57	68	824	java/lang/Exception
    //   241	250	833	finally
    //   337	350	833	finally
    //   241	250	837	java/io/IOException
  }
  
  public static void fa(boolean paramBoolean)
  {
    g.Ek();
    g.Ei().DT().a(aa.a.sQp, Boolean.valueOf(paramBoolean));
  }
  
  public static void fb(boolean paramBoolean)
  {
    g.Ek();
    g.Ei().DT().a(aa.a.sQq, Boolean.valueOf(paramBoolean));
  }
  
  public static void fc(boolean paramBoolean)
  {
    jgw = paramBoolean;
  }
  
  public static String getUserId()
  {
    String str = com.tencent.mm.wallet_core.ui.e.getUsername();
    return ac.ce(ac.ce(str) + ac.ce(q.zz()));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/fingerprint/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */