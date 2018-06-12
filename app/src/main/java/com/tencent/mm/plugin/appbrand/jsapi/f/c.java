package com.tencent.mm.plugin.appbrand.jsapi.f;

import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class c
  extends com.tencent.mm.plugin.appbrand.jsapi.base.c
{
  public static final int CTRL_INDEX = 134;
  public static final String NAME = "addMapLines";
  
  /* Error */
  protected final boolean c(com.tencent.mm.plugin.appbrand.page.p paramp, int paramInt, android.view.View arg3, JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: aload 4
    //   2: ifnonnull +12 -> 14
    //   5: ldc 22
    //   7: ldc 24
    //   9: invokestatic 30	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   12: iconst_0
    //   13: ireturn
    //   14: ldc 22
    //   16: ldc 32
    //   18: iconst_1
    //   19: anewarray 34	java/lang/Object
    //   22: dup
    //   23: iconst_0
    //   24: aload 4
    //   26: invokevirtual 40	org/json/JSONObject:toString	()Ljava/lang/String;
    //   29: aastore
    //   30: invokestatic 44	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   33: aload_1
    //   34: getfield 49	com/tencent/mm/plugin/appbrand/page/p:mAppId	Ljava/lang/String;
    //   37: aload_1
    //   38: invokevirtual 53	java/lang/Object:hashCode	()I
    //   41: aload_0
    //   42: aload 4
    //   44: invokevirtual 57	com/tencent/mm/plugin/appbrand/jsapi/f/c:k	(Lorg/json/JSONObject;)I
    //   47: invokestatic 63	com/tencent/mm/plugin/appbrand/jsapi/f/a/b:E	(Ljava/lang/String;II)Lcom/tencent/mm/plugin/appbrand/jsapi/f/a/c;
    //   50: astore 11
    //   52: aload 11
    //   54: ifnonnull +12 -> 66
    //   57: ldc 22
    //   59: ldc 65
    //   61: invokestatic 30	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   64: iconst_0
    //   65: ireturn
    //   66: aload 4
    //   68: ldc 67
    //   70: invokevirtual 71	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   73: ifeq +679 -> 752
    //   76: aload 11
    //   78: invokevirtual 76	com/tencent/mm/plugin/appbrand/jsapi/f/a/c:ajl	()V
    //   81: new 78	org/json/JSONArray
    //   84: dup
    //   85: aload 4
    //   87: ldc 67
    //   89: invokevirtual 82	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   92: invokespecial 85	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   95: astore 4
    //   97: iconst_0
    //   98: istore 5
    //   100: iload 5
    //   102: aload 4
    //   104: invokevirtual 88	org/json/JSONArray:length	()I
    //   107: if_icmpge +653 -> 760
    //   110: aload 4
    //   112: iload 5
    //   114: invokevirtual 92	org/json/JSONArray:get	(I)Ljava/lang/Object;
    //   117: checkcast 36	org/json/JSONObject
    //   120: astore 12
    //   122: new 94	java/util/ArrayList
    //   125: dup
    //   126: invokespecial 95	java/util/ArrayList:<init>	()V
    //   129: astore_3
    //   130: new 78	org/json/JSONArray
    //   133: dup
    //   134: aload 12
    //   136: ldc 97
    //   138: invokevirtual 82	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   141: invokespecial 85	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   144: astore 13
    //   146: iconst_0
    //   147: istore_2
    //   148: iload_2
    //   149: aload 13
    //   151: invokevirtual 88	org/json/JSONArray:length	()I
    //   154: if_icmpge +52 -> 206
    //   157: aload 13
    //   159: iload_2
    //   160: invokevirtual 101	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   163: astore 14
    //   165: aload_3
    //   166: aload 11
    //   168: aload 14
    //   170: ldc 103
    //   172: invokevirtual 82	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   175: fconst_0
    //   176: invokestatic 109	com/tencent/mm/sdk/platformtools/bi:getFloat	(Ljava/lang/String;F)F
    //   179: aload 14
    //   181: ldc 111
    //   183: invokevirtual 82	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   186: fconst_0
    //   187: invokestatic 109	com/tencent/mm/sdk/platformtools/bi:getFloat	(Ljava/lang/String;F)F
    //   190: invokevirtual 115	com/tencent/mm/plugin/appbrand/jsapi/f/a/c:C	(FF)Lcom/tencent/mm/plugin/appbrand/compat/a/b$f;
    //   193: invokeinterface 121 2 0
    //   198: pop
    //   199: iload_2
    //   200: iconst_1
    //   201: iadd
    //   202: istore_2
    //   203: goto -55 -> 148
    //   206: aload 12
    //   208: ldc 123
    //   210: ldc 125
    //   212: invokevirtual 128	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   215: ldc -126
    //   217: invokestatic 136	android/graphics/Color:parseColor	(Ljava/lang/String;)I
    //   220: invokestatic 142	com/tencent/mm/plugin/appbrand/q/f:aQ	(Ljava/lang/String;I)I
    //   223: istore 6
    //   225: aload 12
    //   227: ldc -112
    //   229: iconst_0
    //   230: invokestatic 148	com/tencent/mm/plugin/appbrand/q/f:a	(Lorg/json/JSONObject;Ljava/lang/String;I)I
    //   233: istore_2
    //   234: aload 12
    //   236: ldc -106
    //   238: iconst_0
    //   239: invokevirtual 154	org/json/JSONObject:optBoolean	(Ljava/lang/String;Z)Z
    //   242: istore 9
    //   244: aload 12
    //   246: ldc -100
    //   248: ldc 125
    //   250: invokevirtual 128	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   253: ldc -126
    //   255: invokestatic 136	android/graphics/Color:parseColor	(Ljava/lang/String;)I
    //   258: invokestatic 142	com/tencent/mm/plugin/appbrand/q/f:aQ	(Ljava/lang/String;I)I
    //   261: istore 7
    //   263: aload 12
    //   265: ldc -98
    //   267: iconst_0
    //   268: invokestatic 148	com/tencent/mm/plugin/appbrand/q/f:a	(Lorg/json/JSONObject;Ljava/lang/String;I)I
    //   271: istore 8
    //   273: aload 12
    //   275: ldc -96
    //   277: iconst_0
    //   278: invokevirtual 154	org/json/JSONObject:optBoolean	(Ljava/lang/String;Z)Z
    //   281: istore 10
    //   283: aload 12
    //   285: ldc -94
    //   287: ldc 125
    //   289: invokevirtual 128	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   292: astore 13
    //   294: aload 11
    //   296: getfield 166	com/tencent/mm/plugin/appbrand/jsapi/f/a/c:fSW	Lcom/tencent/mm/plugin/appbrand/compat/a/b;
    //   299: invokeinterface 172 1 0
    //   304: astore 12
    //   306: aload 12
    //   308: aload_3
    //   309: invokeinterface 177 2 0
    //   314: aload 12
    //   316: iload 6
    //   318: invokeinterface 181 2 0
    //   323: aload 12
    //   325: iload_2
    //   326: invokeinterface 184 2 0
    //   331: aload 12
    //   333: iload 9
    //   335: invokeinterface 188 2 0
    //   340: aload 12
    //   342: iload 7
    //   344: invokeinterface 191 2 0
    //   349: aload 12
    //   351: iload 8
    //   353: invokeinterface 194 2 0
    //   358: iload 10
    //   360: ifeq +181 -> 541
    //   363: iconst_1
    //   364: istore 6
    //   366: aload 13
    //   368: invokestatic 197	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   371: ifne +315 -> 686
    //   374: aload 13
    //   376: ldc -57
    //   378: invokevirtual 204	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   381: ifeq +305 -> 686
    //   384: aload_1
    //   385: getfield 49	com/tencent/mm/plugin/appbrand/page/p:mAppId	Ljava/lang/String;
    //   388: aload 13
    //   390: invokestatic 210	com/tencent/mm/plugin/appbrand/appstorage/AppBrandLocalMediaObjectManager:getItemByLocalId	(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/mm/plugin/appbrand/appstorage/AppBrandLocalMediaObject;
    //   393: astore 14
    //   395: aload 14
    //   397: ifnull +266 -> 663
    //   400: aload 14
    //   402: getfield 215	com/tencent/mm/plugin/appbrand/appstorage/AppBrandLocalMediaObject:dDG	Ljava/lang/String;
    //   405: invokestatic 221	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   408: ifne +255 -> 663
    //   411: ldc 22
    //   413: ldc -33
    //   415: iconst_1
    //   416: anewarray 34	java/lang/Object
    //   419: dup
    //   420: iconst_0
    //   421: aload 14
    //   423: getfield 215	com/tencent/mm/plugin/appbrand/appstorage/AppBrandLocalMediaObject:dDG	Ljava/lang/String;
    //   426: aastore
    //   427: invokestatic 44	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   430: aconst_null
    //   431: astore_3
    //   432: new 225	android/graphics/BitmapFactory$Options
    //   435: dup
    //   436: invokespecial 226	android/graphics/BitmapFactory$Options:<init>	()V
    //   439: astore 13
    //   441: aload 13
    //   443: iconst_1
    //   444: putfield 230	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   447: aload 14
    //   449: getfield 215	com/tencent/mm/plugin/appbrand/appstorage/AppBrandLocalMediaObject:dDG	Ljava/lang/String;
    //   452: aload 13
    //   454: invokestatic 236	android/graphics/BitmapFactory:decodeFile	(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   457: pop
    //   458: aload 13
    //   460: getfield 239	android/graphics/BitmapFactory$Options:outHeight	I
    //   463: ifle +122 -> 585
    //   466: aload 13
    //   468: getfield 242	android/graphics/BitmapFactory$Options:outWidth	I
    //   471: ifle +114 -> 585
    //   474: aload 13
    //   476: getfield 239	android/graphics/BitmapFactory$Options:outHeight	I
    //   479: iload_2
    //   480: imul
    //   481: aload 13
    //   483: getfield 242	android/graphics/BitmapFactory$Options:outWidth	I
    //   486: idiv
    //   487: istore 7
    //   489: aload 14
    //   491: getfield 215	com/tencent/mm/plugin/appbrand/appstorage/AppBrandLocalMediaObject:dDG	Ljava/lang/String;
    //   494: iload 7
    //   496: iload_2
    //   497: invokestatic 248	com/tencent/mm/sdk/platformtools/c:aj	(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    //   500: astore_3
    //   501: aload_3
    //   502: ifnull +147 -> 649
    //   505: aload 12
    //   507: aload_3
    //   508: invokeinterface 252 2 0
    //   513: iconst_0
    //   514: istore_2
    //   515: iload_2
    //   516: ifeq +25 -> 541
    //   519: aload 12
    //   521: invokestatic 258	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   524: invokevirtual 264	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   527: ldc_w 266
    //   530: invokevirtual 272	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   533: invokestatic 276	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   536: invokeinterface 252 2 0
    //   541: aload 11
    //   543: getfield 166	com/tencent/mm/plugin/appbrand/jsapi/f/a/c:fSW	Lcom/tencent/mm/plugin/appbrand/compat/a/b;
    //   546: aload 12
    //   548: invokeinterface 279 2 0
    //   553: astore 12
    //   555: aload 11
    //   557: getfield 283	com/tencent/mm/plugin/appbrand/jsapi/f/a/c:fTg	Ljava/util/ArrayList;
    //   560: astore_3
    //   561: aload_3
    //   562: monitorenter
    //   563: aload 11
    //   565: getfield 283	com/tencent/mm/plugin/appbrand/jsapi/f/a/c:fTg	Ljava/util/ArrayList;
    //   568: aload 12
    //   570: invokevirtual 284	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   573: pop
    //   574: aload_3
    //   575: monitorexit
    //   576: iload 5
    //   578: iconst_1
    //   579: iadd
    //   580: istore 5
    //   582: goto -482 -> 100
    //   585: ldc 22
    //   587: ldc_w 286
    //   590: iconst_3
    //   591: anewarray 34	java/lang/Object
    //   594: dup
    //   595: iconst_0
    //   596: aload 14
    //   598: getfield 215	com/tencent/mm/plugin/appbrand/appstorage/AppBrandLocalMediaObject:dDG	Ljava/lang/String;
    //   601: aastore
    //   602: dup
    //   603: iconst_1
    //   604: aload 13
    //   606: getfield 239	android/graphics/BitmapFactory$Options:outHeight	I
    //   609: invokestatic 292	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   612: aastore
    //   613: dup
    //   614: iconst_2
    //   615: aload 13
    //   617: getfield 242	android/graphics/BitmapFactory$Options:outWidth	I
    //   620: invokestatic 292	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   623: aastore
    //   624: invokestatic 294	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   627: goto -126 -> 501
    //   630: astore_1
    //   631: ldc 22
    //   633: ldc_w 296
    //   636: iconst_1
    //   637: anewarray 34	java/lang/Object
    //   640: dup
    //   641: iconst_0
    //   642: aload_1
    //   643: aastore
    //   644: invokestatic 294	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   647: iconst_0
    //   648: ireturn
    //   649: ldc 22
    //   651: ldc_w 298
    //   654: invokestatic 30	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   657: iload 6
    //   659: istore_2
    //   660: goto -145 -> 515
    //   663: ldc 22
    //   665: ldc_w 300
    //   668: iconst_1
    //   669: anewarray 34	java/lang/Object
    //   672: dup
    //   673: iconst_0
    //   674: aload 13
    //   676: aastore
    //   677: invokestatic 294	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   680: iload 6
    //   682: istore_2
    //   683: goto -168 -> 515
    //   686: iload 6
    //   688: istore_2
    //   689: aload 13
    //   691: invokestatic 197	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   694: ifne -179 -> 515
    //   697: aload_1
    //   698: getfield 304	com/tencent/mm/plugin/appbrand/page/p:fdO	Lcom/tencent/mm/plugin/appbrand/g;
    //   701: aload 13
    //   703: invokestatic 310	com/tencent/mm/plugin/appbrand/page/o:j	(Lcom/tencent/mm/plugin/appbrand/g;Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   706: astore_3
    //   707: aload_3
    //   708: ifnull +16 -> 724
    //   711: iconst_0
    //   712: istore_2
    //   713: aload 12
    //   715: aload_3
    //   716: invokeinterface 252 2 0
    //   721: goto -206 -> 515
    //   724: ldc 22
    //   726: ldc_w 312
    //   729: iconst_1
    //   730: anewarray 34	java/lang/Object
    //   733: dup
    //   734: iconst_0
    //   735: aload 13
    //   737: aastore
    //   738: invokestatic 294	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   741: iload 6
    //   743: istore_2
    //   744: goto -229 -> 515
    //   747: astore_1
    //   748: aload_3
    //   749: monitorexit
    //   750: aload_1
    //   751: athrow
    //   752: ldc 22
    //   754: ldc_w 314
    //   757: invokestatic 30	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   760: iconst_1
    //   761: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	762	0	this	c
    //   0	762	1	paramp	com.tencent.mm.plugin.appbrand.page.p
    //   0	762	2	paramInt	int
    //   0	762	4	paramJSONObject	JSONObject
    //   98	483	5	i	int
    //   223	519	6	j	int
    //   261	234	7	k	int
    //   271	81	8	m	int
    //   242	92	9	bool1	boolean
    //   281	78	10	bool2	boolean
    //   50	514	11	localc	com.tencent.mm.plugin.appbrand.jsapi.f.a.c
    //   120	594	12	localObject1	Object
    //   144	592	13	localObject2	Object
    //   163	434	14	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   66	97	630	java/lang/Exception
    //   100	146	630	java/lang/Exception
    //   148	199	630	java/lang/Exception
    //   206	358	630	java/lang/Exception
    //   366	395	630	java/lang/Exception
    //   400	430	630	java/lang/Exception
    //   432	501	630	java/lang/Exception
    //   505	513	630	java/lang/Exception
    //   519	541	630	java/lang/Exception
    //   541	563	630	java/lang/Exception
    //   585	627	630	java/lang/Exception
    //   649	657	630	java/lang/Exception
    //   663	680	630	java/lang/Exception
    //   689	707	630	java/lang/Exception
    //   713	721	630	java/lang/Exception
    //   724	741	630	java/lang/Exception
    //   750	752	630	java/lang/Exception
    //   752	760	630	java/lang/Exception
    //   563	576	747	finally
    //   748	750	747	finally
  }
  
  protected final int k(JSONObject paramJSONObject)
  {
    try
    {
      int i = paramJSONObject.optInt("mapId");
      return i;
    }
    catch (Exception paramJSONObject)
    {
      x.e("MicroMsg.JsApiAddMapLines", "get mapId error, exception : %s", new Object[] { paramJSONObject });
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/f/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */