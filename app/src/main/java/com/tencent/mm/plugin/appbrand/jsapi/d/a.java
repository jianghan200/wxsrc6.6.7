package com.tencent.mm.plugin.appbrand.jsapi.d;

import com.tencent.mm.model.u;
import com.tencent.mm.model.u.b;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.widget.input.c.f;
import java.lang.ref.WeakReference;

abstract class a<P extends f>
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  protected static void L(int paramInt, String paramString)
  {
    u.Hx().v("AppBrandJsInput@" + paramInt, true).O("passing_data", paramString);
  }
  
  protected static void a(int paramInt, p paramp)
  {
    if (paramp == null) {
      return;
    }
    u.Hx().v("AppBrandJsInput@" + paramInt, true).p("webview_reference", new WeakReference(paramp));
  }
  
  protected static String kJ(int paramInt)
  {
    return u.Hx().v("AppBrandJsInput@" + paramInt, true).getString("passing_data", "");
  }
  
  protected static p kK(int paramInt)
  {
    Object localObject = u.Hx().ia("AppBrandJsInput@" + paramInt);
    if (localObject == null) {
      return null;
    }
    localObject = (WeakReference)((u.b)localObject).get("webview_reference", null);
    if (localObject == null) {
      return null;
    }
    return (p)((WeakReference)localObject).get();
  }
  
  /* Error */
  protected boolean a(P paramP, org.json.JSONObject paramJSONObject, p paramp, int paramInt)
  {
    // Byte code:
    //   0: new 88	org/json/JSONObject
    //   3: dup
    //   4: aload_2
    //   5: ldc 90
    //   7: invokevirtual 93	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   10: invokespecial 94	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   13: astore 5
    //   15: aload_1
    //   16: aload 5
    //   18: ldc 96
    //   20: invokestatic 102	com/tencent/mm/plugin/appbrand/q/f:f	(Lorg/json/JSONObject;Ljava/lang/String;)I
    //   23: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   26: putfield 114	com/tencent/mm/plugin/appbrand/widget/input/c/f:gLB	Ljava/lang/Integer;
    //   29: aload_1
    //   30: aload 5
    //   32: ldc 116
    //   34: invokestatic 102	com/tencent/mm/plugin/appbrand/q/f:f	(Lorg/json/JSONObject;Ljava/lang/String;)I
    //   37: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   40: putfield 119	com/tencent/mm/plugin/appbrand/widget/input/c/f:gLC	Ljava/lang/Integer;
    //   43: aload_1
    //   44: aload 5
    //   46: ldc 121
    //   48: invokestatic 102	com/tencent/mm/plugin/appbrand/q/f:f	(Lorg/json/JSONObject;Ljava/lang/String;)I
    //   51: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   54: putfield 124	com/tencent/mm/plugin/appbrand/widget/input/c/f:gLD	Ljava/lang/Integer;
    //   57: aload_1
    //   58: aload 5
    //   60: ldc 126
    //   62: invokestatic 102	com/tencent/mm/plugin/appbrand/q/f:f	(Lorg/json/JSONObject;Ljava/lang/String;)I
    //   65: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   68: putfield 129	com/tencent/mm/plugin/appbrand/widget/input/c/f:gLE	Ljava/lang/Integer;
    //   71: aload 5
    //   73: ifnonnull +78 -> 151
    //   76: aload_0
    //   77: invokevirtual 133	com/tencent/mm/plugin/appbrand/jsapi/d/a:aiT	()Z
    //   80: ifne +261 -> 341
    //   83: ldc -121
    //   85: ldc -119
    //   87: invokestatic 143	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   90: aload_3
    //   91: iload 4
    //   93: aload_0
    //   94: ldc -111
    //   96: aconst_null
    //   97: invokevirtual 150	com/tencent/mm/plugin/appbrand/jsapi/e:f	(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    //   100: invokevirtual 153	com/tencent/mm/plugin/appbrand/page/p:E	(ILjava/lang/String;)V
    //   103: iconst_0
    //   104: ireturn
    //   105: astore 6
    //   107: aconst_null
    //   108: astore 5
    //   110: aload_0
    //   111: invokevirtual 133	com/tencent/mm/plugin/appbrand/jsapi/d/a:aiT	()Z
    //   114: ifne -43 -> 71
    //   117: ldc -121
    //   119: ldc -101
    //   121: iconst_1
    //   122: anewarray 157	java/lang/Object
    //   125: dup
    //   126: iconst_0
    //   127: aload 6
    //   129: invokestatic 163	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   132: aastore
    //   133: invokestatic 166	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   136: aload_3
    //   137: iload 4
    //   139: aload_0
    //   140: ldc -111
    //   142: aconst_null
    //   143: invokevirtual 150	com/tencent/mm/plugin/appbrand/jsapi/e:f	(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    //   146: invokevirtual 153	com/tencent/mm/plugin/appbrand/page/p:E	(ILjava/lang/String;)V
    //   149: iconst_0
    //   150: ireturn
    //   151: aload_1
    //   152: aload 5
    //   154: ldc -88
    //   156: aconst_null
    //   157: invokevirtual 171	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   160: putfield 175	com/tencent/mm/plugin/appbrand/widget/input/c/f:gLK	Ljava/lang/String;
    //   163: aload_1
    //   164: aload 5
    //   166: ldc -79
    //   168: invokestatic 102	com/tencent/mm/plugin/appbrand/q/f:f	(Lorg/json/JSONObject;Ljava/lang/String;)I
    //   171: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   174: putfield 180	com/tencent/mm/plugin/appbrand/widget/input/c/f:gLF	Ljava/lang/Integer;
    //   177: aload_1
    //   178: aload 5
    //   180: ldc -74
    //   182: invokestatic 102	com/tencent/mm/plugin/appbrand/q/f:f	(Lorg/json/JSONObject;Ljava/lang/String;)I
    //   185: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   188: putfield 185	com/tencent/mm/plugin/appbrand/widget/input/c/f:gLG	Ljava/lang/Integer;
    //   191: aload_1
    //   192: aload 5
    //   194: ldc -69
    //   196: aconst_null
    //   197: invokevirtual 171	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   200: putfield 190	com/tencent/mm/plugin/appbrand/widget/input/c/f:fTI	Ljava/lang/String;
    //   203: aload_1
    //   204: aload 5
    //   206: ldc -64
    //   208: invokevirtual 93	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   211: invokestatic 198	android/graphics/Color:parseColor	(Ljava/lang/String;)I
    //   214: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   217: putfield 201	com/tencent/mm/plugin/appbrand/widget/input/c/f:gLI	Ljava/lang/Integer;
    //   220: aload_1
    //   221: aload 5
    //   223: ldc -53
    //   225: invokevirtual 93	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   228: invokestatic 198	android/graphics/Color:parseColor	(Ljava/lang/String;)I
    //   231: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   234: putfield 206	com/tencent/mm/plugin/appbrand/widget/input/c/f:gLH	Ljava/lang/Integer;
    //   237: aload_1
    //   238: aload 5
    //   240: ldc -48
    //   242: invokestatic 212	com/tencent/mm/plugin/appbrand/q/f:h	(Lorg/json/JSONObject;Ljava/lang/String;)F
    //   245: invokestatic 217	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   248: putfield 221	com/tencent/mm/plugin/appbrand/widget/input/c/f:gLJ	Ljava/lang/Float;
    //   251: aload_1
    //   252: aload 5
    //   254: ldc -33
    //   256: invokestatic 102	com/tencent/mm/plugin/appbrand/q/f:f	(Lorg/json/JSONObject;Ljava/lang/String;)I
    //   259: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   262: putfield 226	com/tencent/mm/plugin/appbrand/widget/input/c/f:gLW	Ljava/lang/Integer;
    //   265: aload_1
    //   266: aload 5
    //   268: ldc -28
    //   270: invokevirtual 232	org/json/JSONObject:opt	(Ljava/lang/String;)Ljava/lang/Object;
    //   273: invokestatic 238	com/tencent/mm/plugin/appbrand/widget/input/c/d:bu	(Ljava/lang/Object;)Ljava/lang/Integer;
    //   276: putfield 241	com/tencent/mm/plugin/appbrand/widget/input/c/f:gMa	Ljava/lang/Integer;
    //   279: aload_1
    //   280: getfield 241	com/tencent/mm/plugin/appbrand/widget/input/c/f:gMa	Ljava/lang/Integer;
    //   283: ifnull +20 -> 303
    //   286: aload_1
    //   287: aload_1
    //   288: getfield 241	com/tencent/mm/plugin/appbrand/widget/input/c/f:gMa	Ljava/lang/Integer;
    //   291: invokevirtual 245	java/lang/Integer:intValue	()I
    //   294: invokestatic 249	com/tencent/mm/plugin/appbrand/q/f:lP	(I)I
    //   297: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   300: putfield 241	com/tencent/mm/plugin/appbrand/widget/input/c/f:gMa	Ljava/lang/Integer;
    //   303: aload_1
    //   304: aload 5
    //   306: ldc -5
    //   308: invokevirtual 232	org/json/JSONObject:opt	(Ljava/lang/String;)Ljava/lang/Object;
    //   311: invokestatic 238	com/tencent/mm/plugin/appbrand/widget/input/c/d:bu	(Ljava/lang/Object;)Ljava/lang/Integer;
    //   314: putfield 254	com/tencent/mm/plugin/appbrand/widget/input/c/f:gMb	Ljava/lang/Integer;
    //   317: aload_1
    //   318: getfield 254	com/tencent/mm/plugin/appbrand/widget/input/c/f:gMb	Ljava/lang/Integer;
    //   321: ifnull +20 -> 341
    //   324: aload_1
    //   325: aload_1
    //   326: getfield 254	com/tencent/mm/plugin/appbrand/widget/input/c/f:gMb	Ljava/lang/Integer;
    //   329: invokevirtual 245	java/lang/Integer:intValue	()I
    //   332: invokestatic 249	com/tencent/mm/plugin/appbrand/q/f:lP	(I)I
    //   335: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   338: putfield 254	com/tencent/mm/plugin/appbrand/widget/input/c/f:gMb	Ljava/lang/Integer;
    //   341: aload_1
    //   342: aload_2
    //   343: ldc_w 256
    //   346: invokevirtual 260	org/json/JSONObject:getBoolean	(Ljava/lang/String;)Z
    //   349: invokestatic 265	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   352: putfield 269	com/tencent/mm/plugin/appbrand/widget/input/c/f:gLU	Ljava/lang/Boolean;
    //   355: aload_1
    //   356: aload_2
    //   357: ldc_w 271
    //   360: aload_2
    //   361: ldc_w 273
    //   364: aconst_null
    //   365: invokevirtual 171	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   368: invokevirtual 171	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   371: putfield 276	com/tencent/mm/plugin/appbrand/widget/input/c/f:gLA	Ljava/lang/String;
    //   374: aload_1
    //   375: aload_2
    //   376: ldc_w 278
    //   379: invokevirtual 281	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   382: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   385: putfield 284	com/tencent/mm/plugin/appbrand/widget/input/c/f:gLL	Ljava/lang/Integer;
    //   388: aload_1
    //   389: aload_2
    //   390: ldc_w 286
    //   393: invokevirtual 288	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   396: putfield 291	com/tencent/mm/plugin/appbrand/widget/input/c/f:gLM	Ljava/lang/String;
    //   399: new 88	org/json/JSONObject
    //   402: dup
    //   403: aload_2
    //   404: ldc_w 293
    //   407: invokevirtual 93	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   410: invokespecial 94	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   413: astore_3
    //   414: aload_1
    //   415: aload_3
    //   416: ldc -64
    //   418: invokevirtual 93	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   421: invokestatic 198	android/graphics/Color:parseColor	(Ljava/lang/String;)I
    //   424: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   427: putfield 296	com/tencent/mm/plugin/appbrand/widget/input/c/f:gLP	Ljava/lang/Integer;
    //   430: aload_1
    //   431: aload_3
    //   432: ldc -48
    //   434: invokestatic 102	com/tencent/mm/plugin/appbrand/q/f:f	(Lorg/json/JSONObject;Ljava/lang/String;)I
    //   437: invokestatic 108	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   440: putfield 299	com/tencent/mm/plugin/appbrand/widget/input/c/f:gLO	Ljava/lang/Integer;
    //   443: aload_1
    //   444: aload_3
    //   445: ldc -88
    //   447: ldc_w 301
    //   450: invokevirtual 171	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   453: putfield 304	com/tencent/mm/plugin/appbrand/widget/input/c/f:gLN	Ljava/lang/String;
    //   456: aload_1
    //   457: aload_2
    //   458: ldc_w 306
    //   461: invokevirtual 260	org/json/JSONObject:getBoolean	(Ljava/lang/String;)Z
    //   464: invokestatic 265	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   467: putfield 309	com/tencent/mm/plugin/appbrand/widget/input/c/f:gLR	Ljava/lang/Boolean;
    //   470: aload_1
    //   471: aload_2
    //   472: ldc_w 311
    //   475: invokevirtual 260	org/json/JSONObject:getBoolean	(Ljava/lang/String;)Z
    //   478: invokestatic 265	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   481: putfield 314	com/tencent/mm/plugin/appbrand/widget/input/c/f:gLQ	Ljava/lang/Boolean;
    //   484: aload_1
    //   485: aload_2
    //   486: ldc_w 316
    //   489: invokevirtual 260	org/json/JSONObject:getBoolean	(Ljava/lang/String;)Z
    //   492: invokestatic 265	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   495: putfield 319	com/tencent/mm/plugin/appbrand/widget/input/c/f:gLV	Ljava/lang/Boolean;
    //   498: aload_1
    //   499: aload_2
    //   500: ldc_w 321
    //   503: invokevirtual 288	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   506: invokestatic 327	com/tencent/mm/plugin/appbrand/widget/input/c/b:wj	(Ljava/lang/String;)Lcom/tencent/mm/plugin/appbrand/widget/input/c/b;
    //   509: putfield 331	com/tencent/mm/plugin/appbrand/widget/input/c/f:gLX	Lcom/tencent/mm/plugin/appbrand/widget/input/c/b;
    //   512: aload_1
    //   513: aload_2
    //   514: ldc_w 333
    //   517: invokevirtual 260	org/json/JSONObject:getBoolean	(Ljava/lang/String;)Z
    //   520: invokestatic 265	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   523: putfield 336	com/tencent/mm/plugin/appbrand/widget/input/c/f:gLY	Ljava/lang/Boolean;
    //   526: aload_1
    //   527: aload_2
    //   528: ldc_w 338
    //   531: invokevirtual 232	org/json/JSONObject:opt	(Ljava/lang/String;)Ljava/lang/Object;
    //   534: invokestatic 344	com/tencent/mm/plugin/appbrand/r/h:bs	(Ljava/lang/Object;)Ljava/lang/Boolean;
    //   537: putfield 347	com/tencent/mm/plugin/appbrand/widget/input/c/f:gLZ	Ljava/lang/Boolean;
    //   540: iconst_1
    //   541: ireturn
    //   542: astore_3
    //   543: aload_1
    //   544: aconst_null
    //   545: putfield 226	com/tencent/mm/plugin/appbrand/widget/input/c/f:gLW	Ljava/lang/Integer;
    //   548: goto -283 -> 265
    //   551: astore_3
    //   552: aload_1
    //   553: aconst_null
    //   554: putfield 309	com/tencent/mm/plugin/appbrand/widget/input/c/f:gLR	Ljava/lang/Boolean;
    //   557: goto -87 -> 470
    //   560: astore_3
    //   561: aload_1
    //   562: aconst_null
    //   563: putfield 314	com/tencent/mm/plugin/appbrand/widget/input/c/f:gLQ	Ljava/lang/Boolean;
    //   566: goto -82 -> 484
    //   569: astore_3
    //   570: aload_1
    //   571: aconst_null
    //   572: putfield 319	com/tencent/mm/plugin/appbrand/widget/input/c/f:gLV	Ljava/lang/Boolean;
    //   575: goto -77 -> 498
    //   578: astore_3
    //   579: aload_1
    //   580: aconst_null
    //   581: putfield 336	com/tencent/mm/plugin/appbrand/widget/input/c/f:gLY	Ljava/lang/Boolean;
    //   584: goto -58 -> 526
    //   587: astore_3
    //   588: goto -132 -> 456
    //   591: astore_3
    //   592: goto -204 -> 388
    //   595: astore_3
    //   596: goto -241 -> 355
    //   599: astore_3
    //   600: goto -349 -> 251
    //   603: astore_3
    //   604: goto -367 -> 237
    //   607: astore_3
    //   608: goto -388 -> 220
    //   611: astore_3
    //   612: goto -421 -> 191
    //   615: astore_3
    //   616: goto -439 -> 177
    //   619: astore 6
    //   621: goto -511 -> 110
    //   624: astore 6
    //   626: goto -583 -> 43
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	629	0	this	a
    //   0	629	1	paramP	P
    //   0	629	2	paramJSONObject	org.json.JSONObject
    //   0	629	3	paramp	p
    //   0	629	4	paramInt	int
    //   13	292	5	localJSONObject	org.json.JSONObject
    //   105	23	6	localException1	Exception
    //   619	1	6	localException2	Exception
    //   624	1	6	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   0	15	105	java/lang/Exception
    //   251	265	542	java/lang/Exception
    //   456	470	551	org/json/JSONException
    //   470	484	560	java/lang/Exception
    //   484	498	569	java/lang/Exception
    //   512	526	578	java/lang/Exception
    //   399	456	587	java/lang/Exception
    //   374	388	591	java/lang/Exception
    //   341	355	595	java/lang/Exception
    //   237	251	599	java/lang/Exception
    //   220	237	603	java/lang/Exception
    //   203	220	607	java/lang/Exception
    //   177	191	611	java/lang/Exception
    //   163	177	615	java/lang/Exception
    //   15	29	619	java/lang/Exception
    //   43	71	619	java/lang/Exception
    //   29	43	624	java/lang/Exception
  }
  
  protected boolean aiT()
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */