package com.tencent.mm.plugin.appbrand.jsapi.file;

import org.json.JSONObject;

final class aw
  extends d
{
  /* Error */
  final f.a a(com.tencent.mm.plugin.appbrand.l paraml, String paramString, JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: aload_3
    //   1: ldc 15
    //   3: ldc 17
    //   5: invokevirtual 23	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   8: astore 5
    //   10: aload 5
    //   12: ldc 17
    //   14: invokevirtual 29	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   17: ifne +17 -> 34
    //   20: new 31	com/tencent/mm/plugin/appbrand/jsapi/file/f$a
    //   23: dup
    //   24: ldc 33
    //   26: iconst_0
    //   27: anewarray 35	java/lang/Object
    //   30: invokespecial 38	com/tencent/mm/plugin/appbrand/jsapi/file/f$a:<init>	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   33: areturn
    //   34: aload_1
    //   35: getfield 44	com/tencent/mm/plugin/appbrand/l:fdO	Lcom/tencent/mm/plugin/appbrand/g;
    //   38: getfield 50	com/tencent/mm/plugin/appbrand/g:fcw	Lcom/tencent/mm/plugin/appbrand/jsapi/file/a;
    //   41: aload 5
    //   43: invokevirtual 56	com/tencent/mm/plugin/appbrand/jsapi/file/a:rf	(Ljava/lang/String;)Lcom/tencent/mm/plugin/appbrand/appstorage/j;
    //   46: astore_3
    //   47: getstatic 62	com/tencent/mm/plugin/appbrand/jsapi/file/aw$1:fQo	[I
    //   50: aload_3
    //   51: invokevirtual 68	com/tencent/mm/plugin/appbrand/appstorage/j:ordinal	()I
    //   54: iaload
    //   55: tableswitch	default:+25->80, 1:+121->176, 2:+121->176, 3:+121->176
    //   80: new 70	com/tencent/mm/plugin/appbrand/q/h
    //   83: dup
    //   84: invokespecial 71	com/tencent/mm/plugin/appbrand/q/h:<init>	()V
    //   87: astore_3
    //   88: aload_1
    //   89: getfield 44	com/tencent/mm/plugin/appbrand/l:fdO	Lcom/tencent/mm/plugin/appbrand/g;
    //   92: getfield 50	com/tencent/mm/plugin/appbrand/g:fcw	Lcom/tencent/mm/plugin/appbrand/jsapi/file/a;
    //   95: aload_2
    //   96: aload_3
    //   97: invokevirtual 74	com/tencent/mm/plugin/appbrand/jsapi/file/a:a	(Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/q/h;)Lcom/tencent/mm/plugin/appbrand/appstorage/j;
    //   100: astore 4
    //   102: getstatic 62	com/tencent/mm/plugin/appbrand/jsapi/file/aw$1:fQo	[I
    //   105: aload 4
    //   107: invokevirtual 68	com/tencent/mm/plugin/appbrand/appstorage/j:ordinal	()I
    //   110: iaload
    //   111: tableswitch	default:+33->144, 1:+109->220, 2:+33->144, 3:+33->144, 4:+91->202, 5:+127->238
    //   144: new 31	com/tencent/mm/plugin/appbrand/jsapi/file/f$a
    //   147: dup
    //   148: new 76	java/lang/StringBuilder
    //   151: dup
    //   152: ldc 78
    //   154: invokespecial 81	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   157: aload 4
    //   159: invokevirtual 85	com/tencent/mm/plugin/appbrand/appstorage/j:name	()Ljava/lang/String;
    //   162: invokevirtual 89	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: invokevirtual 92	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   168: iconst_0
    //   169: anewarray 35	java/lang/Object
    //   172: invokespecial 38	com/tencent/mm/plugin/appbrand/jsapi/file/f$a:<init>	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   175: areturn
    //   176: new 31	com/tencent/mm/plugin/appbrand/jsapi/file/f$a
    //   179: dup
    //   180: ldc 94
    //   182: iconst_1
    //   183: anewarray 35	java/lang/Object
    //   186: dup
    //   187: iconst_0
    //   188: aload 5
    //   190: aastore
    //   191: invokestatic 98	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   194: iconst_0
    //   195: anewarray 35	java/lang/Object
    //   198: invokespecial 38	com/tencent/mm/plugin/appbrand/jsapi/file/f$a:<init>	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   201: areturn
    //   202: new 31	com/tencent/mm/plugin/appbrand/jsapi/file/f$a
    //   205: dup
    //   206: ldc 100
    //   208: iconst_1
    //   209: anewarray 35	java/lang/Object
    //   212: dup
    //   213: iconst_0
    //   214: aload_2
    //   215: aastore
    //   216: invokespecial 38	com/tencent/mm/plugin/appbrand/jsapi/file/f$a:<init>	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   219: areturn
    //   220: new 31	com/tencent/mm/plugin/appbrand/jsapi/file/f$a
    //   223: dup
    //   224: ldc 94
    //   226: iconst_1
    //   227: anewarray 35	java/lang/Object
    //   230: dup
    //   231: iconst_0
    //   232: aload_2
    //   233: aastore
    //   234: invokespecial 38	com/tencent/mm/plugin/appbrand/jsapi/file/f$a:<init>	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   237: areturn
    //   238: new 102	java/util/zip/ZipInputStream
    //   241: dup
    //   242: new 104	com/tencent/mm/plugin/appbrand/l/a
    //   245: dup
    //   246: aload_3
    //   247: getfield 108	com/tencent/mm/plugin/appbrand/q/h:value	Ljava/lang/Object;
    //   250: checkcast 110	java/nio/ByteBuffer
    //   253: invokespecial 113	com/tencent/mm/plugin/appbrand/l/a:<init>	(Ljava/nio/ByteBuffer;)V
    //   256: invokespecial 116	java/util/zip/ZipInputStream:<init>	(Ljava/io/InputStream;)V
    //   259: astore 4
    //   261: aload 4
    //   263: astore_3
    //   264: aload_1
    //   265: getfield 44	com/tencent/mm/plugin/appbrand/l:fdO	Lcom/tencent/mm/plugin/appbrand/g;
    //   268: getfield 50	com/tencent/mm/plugin/appbrand/g:fcw	Lcom/tencent/mm/plugin/appbrand/jsapi/file/a;
    //   271: aload 5
    //   273: aload 4
    //   275: iconst_0
    //   276: invokevirtual 119	com/tencent/mm/plugin/appbrand/jsapi/file/a:a	(Ljava/lang/String;Ljava/io/InputStream;Z)Lcom/tencent/mm/plugin/appbrand/appstorage/j;
    //   279: astore_1
    //   280: aload 4
    //   282: astore_3
    //   283: getstatic 62	com/tencent/mm/plugin/appbrand/jsapi/file/aw$1:fQo	[I
    //   286: aload_1
    //   287: invokevirtual 68	com/tencent/mm/plugin/appbrand/appstorage/j:ordinal	()I
    //   290: iaload
    //   291: tableswitch	default:+277->568, 1:+142->433, 2:+45->336, 3:+45->336, 4:+45->336, 5:+194->485, 6:+86->377, 7:+114->405, 8:+170->461
    //   336: aload 4
    //   338: astore_3
    //   339: new 31	com/tencent/mm/plugin/appbrand/jsapi/file/f$a
    //   342: dup
    //   343: new 76	java/lang/StringBuilder
    //   346: dup
    //   347: ldc 78
    //   349: invokespecial 81	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   352: aload_1
    //   353: invokevirtual 85	com/tencent/mm/plugin/appbrand/appstorage/j:name	()Ljava/lang/String;
    //   356: invokevirtual 89	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   359: invokevirtual 92	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   362: iconst_0
    //   363: anewarray 35	java/lang/Object
    //   366: invokespecial 38	com/tencent/mm/plugin/appbrand/jsapi/file/f$a:<init>	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   369: astore_1
    //   370: aload 4
    //   372: invokestatic 125	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   375: aload_1
    //   376: areturn
    //   377: aload 4
    //   379: astore_3
    //   380: new 31	com/tencent/mm/plugin/appbrand/jsapi/file/f$a
    //   383: dup
    //   384: ldc 127
    //   386: iconst_1
    //   387: anewarray 35	java/lang/Object
    //   390: dup
    //   391: iconst_0
    //   392: aload_2
    //   393: aastore
    //   394: invokespecial 38	com/tencent/mm/plugin/appbrand/jsapi/file/f$a:<init>	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   397: astore_1
    //   398: aload 4
    //   400: invokestatic 125	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   403: aload_1
    //   404: areturn
    //   405: aload 4
    //   407: astore_3
    //   408: new 31	com/tencent/mm/plugin/appbrand/jsapi/file/f$a
    //   411: dup
    //   412: ldc -127
    //   414: iconst_1
    //   415: anewarray 35	java/lang/Object
    //   418: dup
    //   419: iconst_0
    //   420: aload_2
    //   421: aastore
    //   422: invokespecial 38	com/tencent/mm/plugin/appbrand/jsapi/file/f$a:<init>	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   425: astore_1
    //   426: aload 4
    //   428: invokestatic 125	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   431: aload_1
    //   432: areturn
    //   433: aload 4
    //   435: astore_3
    //   436: new 31	com/tencent/mm/plugin/appbrand/jsapi/file/f$a
    //   439: dup
    //   440: ldc 94
    //   442: iconst_1
    //   443: anewarray 35	java/lang/Object
    //   446: dup
    //   447: iconst_0
    //   448: aload_2
    //   449: aastore
    //   450: invokespecial 38	com/tencent/mm/plugin/appbrand/jsapi/file/f$a:<init>	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   453: astore_1
    //   454: aload 4
    //   456: invokestatic 125	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   459: aload_1
    //   460: areturn
    //   461: aload 4
    //   463: astore_3
    //   464: new 31	com/tencent/mm/plugin/appbrand/jsapi/file/f$a
    //   467: dup
    //   468: ldc -125
    //   470: iconst_0
    //   471: anewarray 35	java/lang/Object
    //   474: invokespecial 38	com/tencent/mm/plugin/appbrand/jsapi/file/f$a:<init>	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   477: astore_1
    //   478: aload 4
    //   480: invokestatic 125	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   483: aload_1
    //   484: areturn
    //   485: aload 4
    //   487: astore_3
    //   488: new 31	com/tencent/mm/plugin/appbrand/jsapi/file/f$a
    //   491: dup
    //   492: ldc -123
    //   494: iconst_0
    //   495: anewarray 35	java/lang/Object
    //   498: invokespecial 38	com/tencent/mm/plugin/appbrand/jsapi/file/f$a:<init>	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   501: astore_1
    //   502: aload 4
    //   504: invokestatic 125	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   507: aload_1
    //   508: areturn
    //   509: astore_2
    //   510: aconst_null
    //   511: astore_1
    //   512: aload_1
    //   513: astore_3
    //   514: ldc -121
    //   516: aload_2
    //   517: ldc -119
    //   519: iconst_0
    //   520: anewarray 35	java/lang/Object
    //   523: invokestatic 143	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   526: aload_1
    //   527: astore_3
    //   528: new 31	com/tencent/mm/plugin/appbrand/jsapi/file/f$a
    //   531: dup
    //   532: ldc -111
    //   534: iconst_0
    //   535: anewarray 35	java/lang/Object
    //   538: invokespecial 38	com/tencent/mm/plugin/appbrand/jsapi/file/f$a:<init>	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   541: astore_2
    //   542: aload_1
    //   543: invokestatic 125	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   546: aload_2
    //   547: areturn
    //   548: astore_1
    //   549: aconst_null
    //   550: astore_3
    //   551: aload_3
    //   552: invokestatic 125	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   555: aload_1
    //   556: athrow
    //   557: astore_1
    //   558: goto -7 -> 551
    //   561: astore_2
    //   562: aload 4
    //   564: astore_1
    //   565: goto -53 -> 512
    //   568: goto -232 -> 336
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	571	0	this	aw
    //   0	571	1	paraml	com.tencent.mm.plugin.appbrand.l
    //   0	571	2	paramString	String
    //   0	571	3	paramJSONObject	JSONObject
    //   100	463	4	localObject	Object
    //   8	264	5	str	String
    // Exception table:
    //   from	to	target	type
    //   238	261	509	java/lang/Exception
    //   238	261	548	finally
    //   264	280	557	finally
    //   283	336	557	finally
    //   339	370	557	finally
    //   380	398	557	finally
    //   408	426	557	finally
    //   436	454	557	finally
    //   464	478	557	finally
    //   488	502	557	finally
    //   514	526	557	finally
    //   528	542	557	finally
    //   264	280	561	java/lang/Exception
    //   283	336	561	java/lang/Exception
    //   339	370	561	java/lang/Exception
    //   380	398	561	java/lang/Exception
    //   408	426	561	java/lang/Exception
    //   436	454	561	java/lang/Exception
    //   464	478	561	java/lang/Exception
    //   488	502	561	java/lang/Exception
  }
  
  protected final String q(JSONObject paramJSONObject)
  {
    return paramJSONObject.optString("zipFilePath");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/file/aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */