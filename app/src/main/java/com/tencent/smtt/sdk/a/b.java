package com.tencent.smtt.sdk.a;

import MTT.ThirdAppInfoNew;
import android.content.Context;
import android.content.pm.Signature;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

public class b
{
  public static byte[] a = null;
  
  static
  {
    try
    {
      a = "65dRa93L".getBytes("utf-8");
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException) {}
  }
  
  private static String a(Context paramContext)
  {
    int i = 0;
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 64).signatures[0].toByteArray();
      if (paramContext != null)
      {
        Object localObject = MessageDigest.getInstance("SHA-1");
        ((MessageDigest)localObject).update(paramContext);
        paramContext = ((MessageDigest)localObject).digest();
        if (paramContext != null)
        {
          localObject = new StringBuilder("");
          if (paramContext != null)
          {
            if (paramContext.length <= 0) {
              return null;
            }
            while (i < paramContext.length)
            {
              String str = Integer.toHexString(paramContext[i] & 0xFF).toUpperCase();
              if (i > 0) {
                ((StringBuilder)localObject).append(":");
              }
              if (str.length() < 2) {
                ((StringBuilder)localObject).append(0);
              }
              ((StringBuilder)localObject).append(str);
              i += 1;
            }
            paramContext = ((StringBuilder)localObject).toString();
            return paramContext;
          }
        }
      }
    }
    catch (Exception paramContext) {}
    return null;
  }
  
  public static void a(ThirdAppInfoNew paramThirdAppInfoNew, Context paramContext)
  {
    new c("HttpUtils", paramContext, paramThirdAppInfoNew).start();
  }
  
  /* Error */
  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt, boolean paramBoolean, long paramLong)
  {
    // Byte code:
    //   0: invokestatic 122	com/tencent/smtt/sdk/QbSdk:getSettings	()Ljava/util/Map;
    //   3: ifnull +44 -> 47
    //   6: invokestatic 122	com/tencent/smtt/sdk/QbSdk:getSettings	()Ljava/util/Map;
    //   9: getstatic 126	com/tencent/smtt/sdk/QbSdk:KEY_SET_SENDREQUEST_AND_UPLOAD	Ljava/lang/String;
    //   12: invokeinterface 132 2 0
    //   17: ifeq +30 -> 47
    //   20: invokestatic 122	com/tencent/smtt/sdk/QbSdk:getSettings	()Ljava/util/Map;
    //   23: getstatic 126	com/tencent/smtt/sdk/QbSdk:KEY_SET_SENDREQUEST_AND_UPLOAD	Ljava/lang/String;
    //   26: invokeinterface 136 2 0
    //   31: ldc -118
    //   33: invokevirtual 141	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   36: ifeq +11 -> 47
    //   39: ldc -113
    //   41: ldc -111
    //   43: invokestatic 151	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   46: return
    //   47: ldc 73
    //   49: astore 10
    //   51: aload 10
    //   53: astore 9
    //   55: aload_0
    //   56: invokevirtual 155	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   59: astore 11
    //   61: aload 10
    //   63: astore 8
    //   65: aload 10
    //   67: astore 9
    //   69: ldc -99
    //   71: aload 11
    //   73: getfield 162	android/content/pm/ApplicationInfo:packageName	Ljava/lang/String;
    //   76: invokevirtual 163	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   79: ifeq +74 -> 153
    //   82: aload 10
    //   84: astore 9
    //   86: aload_0
    //   87: invokevirtual 32	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   90: aload 11
    //   92: getfield 162	android/content/pm/ApplicationInfo:packageName	Ljava/lang/String;
    //   95: iconst_0
    //   96: invokevirtual 42	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   99: getfield 166	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
    //   102: astore 10
    //   104: aload 10
    //   106: astore 8
    //   108: aload 10
    //   110: astore 9
    //   112: invokestatic 169	com/tencent/smtt/sdk/QbSdk:getQQBuildNumber	()Ljava/lang/String;
    //   115: invokestatic 175	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   118: ifne +35 -> 153
    //   121: aload 10
    //   123: astore 9
    //   125: new 71	java/lang/StringBuilder
    //   128: dup
    //   129: invokespecial 177	java/lang/StringBuilder:<init>	()V
    //   132: aload 10
    //   134: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: ldc -77
    //   139: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: invokestatic 169	com/tencent/smtt/sdk/QbSdk:getQQBuildNumber	()Ljava/lang/String;
    //   145: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: invokevirtual 102	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   151: astore 8
    //   153: aload 8
    //   155: astore 9
    //   157: new 181	MTT/ThirdAppInfoNew
    //   160: dup
    //   161: invokespecial 182	MTT/ThirdAppInfoNew:<init>	()V
    //   164: astore 8
    //   166: aload 8
    //   168: aload_0
    //   169: invokevirtual 186	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   172: invokevirtual 155	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   175: getfield 162	android/content/pm/ApplicationInfo:packageName	Ljava/lang/String;
    //   178: putfield 189	MTT/ThirdAppInfoNew:sAppName	Ljava/lang/String;
    //   181: aload_0
    //   182: invokestatic 194	com/tencent/smtt/utils/s:a	(Landroid/content/Context;)Lcom/tencent/smtt/utils/s;
    //   185: pop
    //   186: new 196	java/text/SimpleDateFormat
    //   189: dup
    //   190: ldc -58
    //   192: invokespecial 199	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   195: astore 10
    //   197: aload 10
    //   199: ldc -55
    //   201: invokestatic 207	java/util/TimeZone:getTimeZone	(Ljava/lang/String;)Ljava/util/TimeZone;
    //   204: invokevirtual 211	java/text/SimpleDateFormat:setTimeZone	(Ljava/util/TimeZone;)V
    //   207: aload 8
    //   209: aload 10
    //   211: invokestatic 216	java/util/Calendar:getInstance	()Ljava/util/Calendar;
    //   214: invokevirtual 220	java/util/Calendar:getTime	()Ljava/util/Date;
    //   217: invokevirtual 224	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   220: putfield 227	MTT/ThirdAppInfoNew:sTime	Ljava/lang/String;
    //   223: aload 8
    //   225: aload_1
    //   226: putfield 230	MTT/ThirdAppInfoNew:sGuid	Ljava/lang/String;
    //   229: iload 5
    //   231: ifeq +193 -> 424
    //   234: aload 8
    //   236: aload_2
    //   237: putfield 233	MTT/ThirdAppInfoNew:sQua2	Ljava/lang/String;
    //   240: aload 8
    //   242: aload_3
    //   243: putfield 236	MTT/ThirdAppInfoNew:sLc	Ljava/lang/String;
    //   246: aload_0
    //   247: invokestatic 241	com/tencent/smtt/utils/b:e	(Landroid/content/Context;)Ljava/lang/String;
    //   250: astore_1
    //   251: aload_0
    //   252: invokestatic 244	com/tencent/smtt/utils/b:c	(Landroid/content/Context;)Ljava/lang/String;
    //   255: astore_2
    //   256: aload_0
    //   257: invokestatic 247	com/tencent/smtt/utils/b:d	(Landroid/content/Context;)Ljava/lang/String;
    //   260: astore_3
    //   261: aload_0
    //   262: invokestatic 250	com/tencent/smtt/utils/b:f	(Landroid/content/Context;)Ljava/lang/String;
    //   265: astore 10
    //   267: aload_2
    //   268: ifnull +18 -> 286
    //   271: ldc 73
    //   273: aload_2
    //   274: invokevirtual 163	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   277: ifne +9 -> 286
    //   280: aload 8
    //   282: aload_2
    //   283: putfield 253	MTT/ThirdAppInfoNew:sImei	Ljava/lang/String;
    //   286: aload_3
    //   287: ifnull +18 -> 305
    //   290: ldc 73
    //   292: aload_3
    //   293: invokevirtual 163	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   296: ifne +9 -> 305
    //   299: aload 8
    //   301: aload_3
    //   302: putfield 256	MTT/ThirdAppInfoNew:sImsi	Ljava/lang/String;
    //   305: aload 10
    //   307: invokestatic 175	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   310: ifne +10 -> 320
    //   313: aload 8
    //   315: aload 10
    //   317: putfield 259	MTT/ThirdAppInfoNew:sAndroidID	Ljava/lang/String;
    //   320: aload_1
    //   321: ifnull +18 -> 339
    //   324: ldc 73
    //   326: aload_1
    //   327: invokevirtual 163	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   330: ifne +9 -> 339
    //   333: aload 8
    //   335: aload_1
    //   336: putfield 262	MTT/ThirdAppInfoNew:sMac	Ljava/lang/String;
    //   339: aload 8
    //   341: iload 4
    //   343: i2l
    //   344: putfield 266	MTT/ThirdAppInfoNew:iPv	J
    //   347: aload_0
    //   348: invokestatic 272	com/tencent/smtt/sdk/TbsShareManager:isThirdPartyApp	(Landroid/content/Context;)Z
    //   351: ifeq +103 -> 454
    //   354: iload 5
    //   356: ifeq +89 -> 445
    //   359: invokestatic 276	com/tencent/smtt/sdk/TbsShareManager:getCoreFormOwn	()Z
    //   362: ifeq +74 -> 436
    //   365: iconst_2
    //   366: istore 4
    //   368: aload 8
    //   370: astore_1
    //   371: aload_1
    //   372: iload 4
    //   374: putfield 280	MTT/ThirdAppInfoNew:iCoreType	I
    //   377: aload 8
    //   379: aload 9
    //   381: putfield 283	MTT/ThirdAppInfoNew:sAppVersionName	Ljava/lang/String;
    //   384: aload 8
    //   386: aload_0
    //   387: invokestatic 285	com/tencent/smtt/sdk/a/b:a	(Landroid/content/Context;)Ljava/lang/String;
    //   390: putfield 288	MTT/ThirdAppInfoNew:sAppSignature	Ljava/lang/String;
    //   393: iload 5
    //   395: ifne +19 -> 414
    //   398: aload 8
    //   400: lload 6
    //   402: putfield 291	MTT/ThirdAppInfoNew:sWifiConnectedTime	J
    //   405: aload 8
    //   407: aload_0
    //   408: invokestatic 295	com/tencent/smtt/sdk/QbSdk:getTbsVersion	(Landroid/content/Context;)I
    //   411: putfield 298	MTT/ThirdAppInfoNew:localCoreVersion	I
    //   414: aload 8
    //   416: aload_0
    //   417: invokevirtual 186	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   420: invokestatic 300	com/tencent/smtt/sdk/a/b:a	(LMTT/ThirdAppInfoNew;Landroid/content/Context;)V
    //   423: return
    //   424: aload 8
    //   426: aload_0
    //   427: invokestatic 303	com/tencent/smtt/utils/r:a	(Landroid/content/Context;)Ljava/lang/String;
    //   430: putfield 233	MTT/ThirdAppInfoNew:sQua2	Ljava/lang/String;
    //   433: goto -193 -> 240
    //   436: iconst_1
    //   437: istore 4
    //   439: aload 8
    //   441: astore_1
    //   442: goto -71 -> 371
    //   445: iconst_0
    //   446: istore 4
    //   448: aload 8
    //   450: astore_1
    //   451: goto -80 -> 371
    //   454: iload 5
    //   456: ifeq +12 -> 468
    //   459: iconst_1
    //   460: istore 4
    //   462: aload 8
    //   464: astore_1
    //   465: goto -94 -> 371
    //   468: goto -23 -> 445
    //   471: astore_0
    //   472: return
    //   473: astore 8
    //   475: goto -318 -> 157
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	478	0	paramContext	Context
    //   0	478	1	paramString1	String
    //   0	478	2	paramString2	String
    //   0	478	3	paramString3	String
    //   0	478	4	paramInt	int
    //   0	478	5	paramBoolean	boolean
    //   0	478	6	paramLong	long
    //   63	400	8	localObject1	Object
    //   473	1	8	localException	Exception
    //   53	327	9	localObject2	Object
    //   49	267	10	localObject3	Object
    //   59	32	11	localApplicationInfo	android.content.pm.ApplicationInfo
    // Exception table:
    //   from	to	target	type
    //   157	229	471	java/lang/Throwable
    //   234	240	471	java/lang/Throwable
    //   240	267	471	java/lang/Throwable
    //   271	286	471	java/lang/Throwable
    //   290	305	471	java/lang/Throwable
    //   305	320	471	java/lang/Throwable
    //   324	339	471	java/lang/Throwable
    //   339	354	471	java/lang/Throwable
    //   359	365	471	java/lang/Throwable
    //   371	393	471	java/lang/Throwable
    //   398	414	471	java/lang/Throwable
    //   414	423	471	java/lang/Throwable
    //   424	433	471	java/lang/Throwable
    //   55	61	473	java/lang/Exception
    //   69	82	473	java/lang/Exception
    //   86	104	473	java/lang/Exception
    //   112	121	473	java/lang/Exception
    //   125	153	473	java/lang/Exception
  }
  
  /* Error */
  private static org.json.JSONObject c(ThirdAppInfoNew paramThirdAppInfoNew, Context paramContext)
  {
    // Byte code:
    //   0: new 309	org/json/JSONObject
    //   3: dup
    //   4: invokespecial 310	org/json/JSONObject:<init>	()V
    //   7: astore_3
    //   8: aload_3
    //   9: ldc_w 312
    //   12: aload_0
    //   13: getfield 189	MTT/ThirdAppInfoNew:sAppName	Ljava/lang/String;
    //   16: invokevirtual 316	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   19: pop
    //   20: aload_3
    //   21: ldc_w 318
    //   24: aload_0
    //   25: getfield 227	MTT/ThirdAppInfoNew:sTime	Ljava/lang/String;
    //   28: invokevirtual 316	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   31: pop
    //   32: aload_3
    //   33: ldc_w 320
    //   36: aload_0
    //   37: getfield 233	MTT/ThirdAppInfoNew:sQua2	Ljava/lang/String;
    //   40: invokevirtual 316	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   43: pop
    //   44: aload_3
    //   45: ldc_w 322
    //   48: aload_0
    //   49: getfield 236	MTT/ThirdAppInfoNew:sLc	Ljava/lang/String;
    //   52: invokevirtual 316	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   55: pop
    //   56: aload_3
    //   57: ldc_w 324
    //   60: aload_0
    //   61: getfield 230	MTT/ThirdAppInfoNew:sGuid	Ljava/lang/String;
    //   64: invokevirtual 316	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   67: pop
    //   68: aload_3
    //   69: ldc_w 326
    //   72: aload_0
    //   73: getfield 253	MTT/ThirdAppInfoNew:sImei	Ljava/lang/String;
    //   76: invokevirtual 316	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   79: pop
    //   80: aload_3
    //   81: ldc_w 328
    //   84: aload_0
    //   85: getfield 256	MTT/ThirdAppInfoNew:sImsi	Ljava/lang/String;
    //   88: invokevirtual 316	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   91: pop
    //   92: aload_3
    //   93: ldc_w 330
    //   96: aload_0
    //   97: getfield 262	MTT/ThirdAppInfoNew:sMac	Ljava/lang/String;
    //   100: invokevirtual 316	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   103: pop
    //   104: aload_3
    //   105: ldc_w 332
    //   108: aload_0
    //   109: getfield 266	MTT/ThirdAppInfoNew:iPv	J
    //   112: invokevirtual 335	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   115: pop
    //   116: aload_3
    //   117: ldc_w 337
    //   120: aload_0
    //   121: getfield 280	MTT/ThirdAppInfoNew:iCoreType	I
    //   124: invokevirtual 340	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   127: pop
    //   128: aload_3
    //   129: ldc_w 342
    //   132: aload_0
    //   133: getfield 283	MTT/ThirdAppInfoNew:sAppVersionName	Ljava/lang/String;
    //   136: invokevirtual 316	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   139: pop
    //   140: aload_0
    //   141: getfield 288	MTT/ThirdAppInfoNew:sAppSignature	Ljava/lang/String;
    //   144: ifnonnull +170 -> 314
    //   147: aload_3
    //   148: ldc_w 344
    //   151: ldc_w 346
    //   154: invokevirtual 316	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   157: pop
    //   158: aload_3
    //   159: ldc_w 348
    //   162: iconst_3
    //   163: invokevirtual 340	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   166: pop
    //   167: aload_3
    //   168: ldc_w 350
    //   171: aload_0
    //   172: getfield 259	MTT/ThirdAppInfoNew:sAndroidID	Ljava/lang/String;
    //   175: invokevirtual 316	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   178: pop
    //   179: aload_1
    //   180: invokestatic 272	com/tencent/smtt/sdk/TbsShareManager:isThirdPartyApp	(Landroid/content/Context;)Z
    //   183: ifeq +157 -> 340
    //   186: aload_3
    //   187: ldc_w 352
    //   190: aload_1
    //   191: invokestatic 356	com/tencent/smtt/sdk/TbsShareManager:getHostCoreVersions	(Landroid/content/Context;)J
    //   194: invokevirtual 335	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   197: pop
    //   198: aload_0
    //   199: getfield 280	MTT/ThirdAppInfoNew:iCoreType	I
    //   202: ifne +66 -> 268
    //   205: aload_3
    //   206: ldc_w 358
    //   209: aload_0
    //   210: getfield 291	MTT/ThirdAppInfoNew:sWifiConnectedTime	J
    //   213: invokevirtual 335	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   216: pop
    //   217: aload_3
    //   218: ldc_w 360
    //   221: aload_0
    //   222: getfield 298	MTT/ThirdAppInfoNew:localCoreVersion	I
    //   225: invokevirtual 340	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   228: pop
    //   229: getstatic 365	com/tencent/smtt/sdk/TbsCoreLoadStat:mLoadErrorCode	I
    //   232: istore_2
    //   233: aload_0
    //   234: getfield 298	MTT/ThirdAppInfoNew:localCoreVersion	I
    //   237: ifgt +130 -> 367
    //   240: aload_3
    //   241: ldc_w 367
    //   244: aload_1
    //   245: invokestatic 372	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   248: invokevirtual 375	com/tencent/smtt/sdk/TbsDownloadConfig:getDownloadInterruptCode	()I
    //   251: invokevirtual 340	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   254: pop
    //   255: iload_2
    //   256: iconst_m1
    //   257: if_icmpne +11 -> 268
    //   260: ldc -113
    //   262: ldc_w 377
    //   265: invokestatic 379	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   268: invokestatic 382	com/tencent/smtt/sdk/QbSdk:getTID	()Ljava/lang/String;
    //   271: ifnull +41 -> 312
    //   274: aload_0
    //   275: getfield 189	MTT/ThirdAppInfoNew:sAppName	Ljava/lang/String;
    //   278: ldc -99
    //   280: invokevirtual 163	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   283: ifeq +96 -> 379
    //   286: aload_3
    //   287: ldc_w 384
    //   290: invokestatic 389	com/tencent/smtt/utils/o:a	()Lcom/tencent/smtt/utils/o;
    //   293: invokestatic 382	com/tencent/smtt/sdk/QbSdk:getTID	()Ljava/lang/String;
    //   296: invokevirtual 392	com/tencent/smtt/utils/o:a	(Ljava/lang/String;)Ljava/lang/String;
    //   299: invokevirtual 316	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   302: pop
    //   303: aload_3
    //   304: ldc_w 394
    //   307: iconst_1
    //   308: invokevirtual 340	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   311: pop
    //   312: aload_3
    //   313: areturn
    //   314: aload_3
    //   315: ldc_w 344
    //   318: aload_0
    //   319: getfield 288	MTT/ThirdAppInfoNew:sAppSignature	Ljava/lang/String;
    //   322: invokevirtual 316	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   325: pop
    //   326: goto -168 -> 158
    //   329: astore_0
    //   330: ldc -113
    //   332: ldc_w 396
    //   335: invokestatic 379	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   338: aconst_null
    //   339: areturn
    //   340: aload_3
    //   341: ldc_w 352
    //   344: aload_1
    //   345: invokestatic 401	com/tencent/smtt/sdk/TbsDownloader:getCoreShareDecoupleCoreVersionByContext	(Landroid/content/Context;)I
    //   348: invokevirtual 340	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   351: pop
    //   352: aload_3
    //   353: ldc_w 403
    //   356: aload_1
    //   357: invokestatic 401	com/tencent/smtt/sdk/TbsDownloader:getCoreShareDecoupleCoreVersionByContext	(Landroid/content/Context;)I
    //   360: invokevirtual 340	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   363: pop
    //   364: goto -166 -> 198
    //   367: aload_3
    //   368: ldc_w 367
    //   371: iload_2
    //   372: invokevirtual 340	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   375: pop
    //   376: goto -121 -> 255
    //   379: aload_0
    //   380: getfield 189	MTT/ThirdAppInfoNew:sAppName	Ljava/lang/String;
    //   383: ldc_w 405
    //   386: invokevirtual 163	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   389: ifeq -77 -> 312
    //   392: aload_3
    //   393: ldc_w 384
    //   396: invokestatic 382	com/tencent/smtt/sdk/QbSdk:getTID	()Ljava/lang/String;
    //   399: invokevirtual 316	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   402: pop
    //   403: aload_3
    //   404: ldc_w 394
    //   407: iconst_0
    //   408: invokevirtual 340	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   411: pop
    //   412: aload_3
    //   413: areturn
    //   414: astore_0
    //   415: aload_3
    //   416: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	417	0	paramThirdAppInfoNew	ThirdAppInfoNew
    //   0	417	1	paramContext	Context
    //   232	140	2	i	int
    //   7	409	3	localJSONObject	org.json.JSONObject
    // Exception table:
    //   from	to	target	type
    //   0	158	329	java/lang/Exception
    //   158	198	329	java/lang/Exception
    //   198	255	329	java/lang/Exception
    //   260	268	329	java/lang/Exception
    //   314	326	329	java/lang/Exception
    //   340	364	329	java/lang/Exception
    //   367	376	329	java/lang/Exception
    //   268	312	414	java/lang/Exception
    //   379	412	414	java/lang/Exception
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/smtt/sdk/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */