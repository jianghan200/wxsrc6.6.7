package com.tencent.tencentmap.mapsdk.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

public class rk
{
  private final String a;
  private StringBuffer b;
  private boolean c;
  
  /* Error */
  public rk()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aload_0
    //   4: invokespecial 16	java/lang/Object:<init>	()V
    //   7: aload_0
    //   8: ldc 2
    //   10: invokevirtual 22	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   13: putfield 24	com/tencent/tencentmap/mapsdk/a/rk:a	Ljava/lang/String;
    //   16: aload_0
    //   17: new 26	java/lang/StringBuffer
    //   20: dup
    //   21: sipush 300
    //   24: invokespecial 29	java/lang/StringBuffer:<init>	(I)V
    //   27: putfield 31	com/tencent/tencentmap/mapsdk/a/rk:b	Ljava/lang/StringBuffer;
    //   30: aload_0
    //   31: iconst_0
    //   32: putfield 33	com/tencent/tencentmap/mapsdk/a/rk:c	Z
    //   35: invokestatic 38	com/tencent/tencentmap/mapsdk/a/sl:a	()Landroid/content/Context;
    //   38: invokestatic 43	com/tencent/tencentmap/mapsdk/a/sz:a	(Landroid/content/Context;)Ljava/lang/String;
    //   41: astore 5
    //   43: aload 5
    //   45: ldc 45
    //   47: invokestatic 51	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   50: astore 5
    //   52: aload_0
    //   53: getfield 31	com/tencent/tencentmap/mapsdk/a/rk:b	Ljava/lang/StringBuffer;
    //   56: ldc 53
    //   58: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   61: pop
    //   62: aload_0
    //   63: getfield 31	com/tencent/tencentmap/mapsdk/a/rk:b	Ljava/lang/StringBuffer;
    //   66: aload 5
    //   68: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   71: pop
    //   72: aload_0
    //   73: getfield 31	com/tencent/tencentmap/mapsdk/a/rk:b	Ljava/lang/StringBuffer;
    //   76: ldc 59
    //   78: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   81: pop
    //   82: aload_0
    //   83: getfield 31	com/tencent/tencentmap/mapsdk/a/rk:b	Ljava/lang/StringBuffer;
    //   86: ldc 61
    //   88: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   91: pop
    //   92: aload_0
    //   93: getfield 31	com/tencent/tencentmap/mapsdk/a/rk:b	Ljava/lang/StringBuffer;
    //   96: ldc 63
    //   98: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   101: pop
    //   102: aload_0
    //   103: getfield 31	com/tencent/tencentmap/mapsdk/a/rk:b	Ljava/lang/StringBuffer;
    //   106: ldc 65
    //   108: ldc 45
    //   110: invokestatic 51	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   113: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   116: pop
    //   117: aload_0
    //   118: getfield 31	com/tencent/tencentmap/mapsdk/a/rk:b	Ljava/lang/StringBuffer;
    //   121: ldc 67
    //   123: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   126: pop
    //   127: aload_0
    //   128: getfield 31	com/tencent/tencentmap/mapsdk/a/rk:b	Ljava/lang/StringBuffer;
    //   131: getstatic 72	android/os/Build:MODEL	Ljava/lang/String;
    //   134: ldc 45
    //   136: invokestatic 51	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   139: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   142: pop
    //   143: aload_0
    //   144: getfield 31	com/tencent/tencentmap/mapsdk/a/rk:b	Ljava/lang/StringBuffer;
    //   147: ldc 74
    //   149: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   152: pop
    //   153: aload_0
    //   154: getfield 31	com/tencent/tencentmap/mapsdk/a/rk:b	Ljava/lang/StringBuffer;
    //   157: getstatic 80	android/os/Build$VERSION:SDK_INT	I
    //   160: invokevirtual 83	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   163: pop
    //   164: aload_0
    //   165: getfield 31	com/tencent/tencentmap/mapsdk/a/rk:b	Ljava/lang/StringBuffer;
    //   168: ldc 85
    //   170: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   173: pop
    //   174: aload_0
    //   175: getfield 31	com/tencent/tencentmap/mapsdk/a/rk:b	Ljava/lang/StringBuffer;
    //   178: invokestatic 38	com/tencent/tencentmap/mapsdk/a/sl:a	()Landroid/content/Context;
    //   181: invokevirtual 90	android/content/Context:getPackageName	()Ljava/lang/String;
    //   184: ldc 45
    //   186: invokestatic 51	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   189: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   192: pop
    //   193: aload_0
    //   194: getfield 31	com/tencent/tencentmap/mapsdk/a/rk:b	Ljava/lang/StringBuffer;
    //   197: ldc 92
    //   199: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   202: pop
    //   203: aload_0
    //   204: getfield 31	com/tencent/tencentmap/mapsdk/a/rk:b	Ljava/lang/StringBuffer;
    //   207: astore 7
    //   209: invokestatic 38	com/tencent/tencentmap/mapsdk/a/sl:a	()Landroid/content/Context;
    //   212: ldc 94
    //   214: invokevirtual 98	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   217: checkcast 100	android/net/ConnectivityManager
    //   220: astore 5
    //   222: aload 5
    //   224: ifnull +278 -> 502
    //   227: aload 5
    //   229: invokevirtual 104	android/net/ConnectivityManager:getActiveNetworkInfo	()Landroid/net/NetworkInfo;
    //   232: astore 5
    //   234: aload 5
    //   236: ifnull +259 -> 495
    //   239: aload 5
    //   241: invokevirtual 109	android/net/NetworkInfo:getTypeName	()Ljava/lang/String;
    //   244: astore 5
    //   246: aload 7
    //   248: aload 5
    //   250: invokestatic 112	java/net/URLEncoder:encode	(Ljava/lang/String;)Ljava/lang/String;
    //   253: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   256: pop
    //   257: aload_0
    //   258: getfield 31	com/tencent/tencentmap/mapsdk/a/rk:b	Ljava/lang/StringBuffer;
    //   261: ldc 114
    //   263: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   266: pop
    //   267: aload_0
    //   268: getfield 31	com/tencent/tencentmap/mapsdk/a/rk:b	Ljava/lang/StringBuffer;
    //   271: invokestatic 116	com/tencent/tencentmap/mapsdk/a/rk:b	()Ljava/lang/String;
    //   274: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   277: pop
    //   278: invokestatic 38	com/tencent/tencentmap/mapsdk/a/sl:a	()Landroid/content/Context;
    //   281: invokevirtual 120	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   284: astore 5
    //   286: aload 5
    //   288: invokestatic 38	com/tencent/tencentmap/mapsdk/a/sl:a	()Landroid/content/Context;
    //   291: invokevirtual 90	android/content/Context:getPackageName	()Ljava/lang/String;
    //   294: iconst_0
    //   295: invokevirtual 126	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   298: astore 7
    //   300: aload 7
    //   302: getfield 132	android/content/pm/PackageInfo:applicationInfo	Landroid/content/pm/ApplicationInfo;
    //   305: aload 5
    //   307: invokevirtual 138	android/content/pm/ApplicationInfo:loadLabel	(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
    //   310: invokeinterface 143 1 0
    //   315: astore 5
    //   317: aload 7
    //   319: getfield 146	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
    //   322: astore 7
    //   324: aload 7
    //   326: invokestatic 152	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   329: istore 4
    //   331: iload 4
    //   333: ifne +225 -> 558
    //   336: aload 7
    //   338: astore 6
    //   340: aload 5
    //   342: astore 7
    //   344: aload 6
    //   346: astore 5
    //   348: aload 7
    //   350: ifnull +28 -> 378
    //   353: aload_0
    //   354: getfield 31	com/tencent/tencentmap/mapsdk/a/rk:b	Ljava/lang/StringBuffer;
    //   357: ldc -102
    //   359: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   362: pop
    //   363: aload_0
    //   364: getfield 31	com/tencent/tencentmap/mapsdk/a/rk:b	Ljava/lang/StringBuffer;
    //   367: aload 7
    //   369: ldc 45
    //   371: invokestatic 51	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   374: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   377: pop
    //   378: aload 5
    //   380: ifnull +28 -> 408
    //   383: aload_0
    //   384: getfield 31	com/tencent/tencentmap/mapsdk/a/rk:b	Ljava/lang/StringBuffer;
    //   387: ldc -100
    //   389: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   392: pop
    //   393: aload_0
    //   394: getfield 31	com/tencent/tencentmap/mapsdk/a/rk:b	Ljava/lang/StringBuffer;
    //   397: aload 5
    //   399: ldc 45
    //   401: invokestatic 51	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   404: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   407: pop
    //   408: invokestatic 38	com/tencent/tencentmap/mapsdk/a/sl:a	()Landroid/content/Context;
    //   411: invokevirtual 160	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   414: invokevirtual 166	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
    //   417: astore 5
    //   419: aload 5
    //   421: getfield 171	android/util/DisplayMetrics:densityDpi	I
    //   424: istore_1
    //   425: aload 5
    //   427: getfield 174	android/util/DisplayMetrics:widthPixels	I
    //   430: istore_2
    //   431: aload 5
    //   433: getfield 177	android/util/DisplayMetrics:heightPixels	I
    //   436: istore_3
    //   437: aload_0
    //   438: getfield 31	com/tencent/tencentmap/mapsdk/a/rk:b	Ljava/lang/StringBuffer;
    //   441: ldc -77
    //   443: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   446: pop
    //   447: aload_0
    //   448: getfield 31	com/tencent/tencentmap/mapsdk/a/rk:b	Ljava/lang/StringBuffer;
    //   451: iload_1
    //   452: invokevirtual 83	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   455: pop
    //   456: aload_0
    //   457: getfield 31	com/tencent/tencentmap/mapsdk/a/rk:b	Ljava/lang/StringBuffer;
    //   460: ldc -75
    //   462: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   465: pop
    //   466: aload_0
    //   467: getfield 31	com/tencent/tencentmap/mapsdk/a/rk:b	Ljava/lang/StringBuffer;
    //   470: iload_2
    //   471: invokevirtual 83	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   474: pop
    //   475: aload_0
    //   476: getfield 31	com/tencent/tencentmap/mapsdk/a/rk:b	Ljava/lang/StringBuffer;
    //   479: ldc -73
    //   481: invokevirtual 57	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   484: pop
    //   485: aload_0
    //   486: getfield 31	com/tencent/tencentmap/mapsdk/a/rk:b	Ljava/lang/StringBuffer;
    //   489: iload_3
    //   490: invokevirtual 83	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   493: pop
    //   494: return
    //   495: ldc -71
    //   497: astore 5
    //   499: goto -253 -> 246
    //   502: ldc -71
    //   504: astore 5
    //   506: goto -260 -> 246
    //   509: astore 5
    //   511: aconst_null
    //   512: astore 5
    //   514: aload 5
    //   516: astore 7
    //   518: aload 6
    //   520: astore 5
    //   522: goto -174 -> 348
    //   525: astore 5
    //   527: return
    //   528: astore 5
    //   530: goto -122 -> 408
    //   533: astore 6
    //   535: goto -157 -> 378
    //   538: astore 7
    //   540: goto -26 -> 514
    //   543: astore 5
    //   545: goto -288 -> 257
    //   548: astore 5
    //   550: goto -433 -> 117
    //   553: astore 5
    //   555: goto -483 -> 72
    //   558: aconst_null
    //   559: astore 6
    //   561: goto -221 -> 340
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	564	0	this	rk
    //   424	28	1	i	int
    //   430	41	2	j	int
    //   436	54	3	k	int
    //   329	3	4	bool	boolean
    //   41	464	5	localObject1	Object
    //   509	1	5	localException1	Exception
    //   512	9	5	localObject2	Object
    //   525	1	5	localException2	Exception
    //   528	1	5	localException3	Exception
    //   543	1	5	localException4	Exception
    //   548	1	5	localException5	Exception
    //   553	1	5	localException6	Exception
    //   1	518	6	localObject3	Object
    //   533	1	6	localException7	Exception
    //   559	1	6	localObject4	Object
    //   207	310	7	localObject5	Object
    //   538	1	7	localException8	Exception
    // Exception table:
    //   from	to	target	type
    //   278	317	509	java/lang/Exception
    //   408	494	525	java/lang/Exception
    //   393	408	528	java/lang/Exception
    //   363	378	533	java/lang/Exception
    //   317	331	538	java/lang/Exception
    //   117	222	543	java/lang/Exception
    //   227	234	543	java/lang/Exception
    //   239	246	543	java/lang/Exception
    //   246	257	543	java/lang/Exception
    //   102	117	548	java/lang/Exception
    //   43	72	553	java/lang/Exception
  }
  
  @SuppressLint({"NewApi"})
  public static String b()
  {
    Object localObject2 = "";
    Context localContext = sl.a();
    Object localObject1;
    if (Build.VERSION.SDK_INT >= 23)
    {
      localObject1 = localObject2;
      if (localContext != null)
      {
        localObject1 = localObject2;
        if (localContext.checkSelfPermission("android.permission.READ_PHONE_STATE") != 0) {}
      }
    }
    else
    {
      localObject1 = ((TelephonyManager)localContext.getSystemService("phone")).getDeviceId();
    }
    localObject2 = localObject1;
    if (TextUtils.isEmpty((CharSequence)localObject1)) {
      localObject2 = "noIMEI";
    }
    return (String)localObject2;
  }
  
  public final void a()
  {
    if (this.c) {
      return;
    }
    new rk.1(this).start();
  }
  
  public final String c()
  {
    if (this.b == null) {
      return "";
    }
    return this.b.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/rk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */