package com.tencent.mm.pluginsdk.i;

import android.webkit.MimeTypeMap;
import com.tencent.mm.sdk.platformtools.bi;

public final class d
{
  private static String Tu(String paramString)
  {
    if (bi.oW(paramString)) {
      return "";
    }
    String str2 = MimeTypeMap.getSingleton().getExtensionFromMimeType(paramString);
    String str1;
    if (str2 != null)
    {
      str1 = str2;
      if (str2.length() != 0) {}
    }
    else
    {
      paramString = paramString.split("/");
      str1 = str2;
      if (paramString != null)
      {
        str1 = str2;
        if (paramString.length > 1) {
          str1 = paramString[1];
        }
      }
    }
    return "." + str1;
  }
  
  /* Error */
  public static final String a(android.content.ContentResolver paramContentResolver, android.net.Uri paramUri)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: aload_0
    //   7: aload_1
    //   8: invokevirtual 62	android/content/ContentResolver:getType	(Landroid/net/Uri;)Ljava/lang/String;
    //   11: astore 5
    //   13: aload_0
    //   14: aload_1
    //   15: invokestatic 65	com/tencent/mm/pluginsdk/i/d:b	(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/String;
    //   18: astore 4
    //   20: aload 4
    //   22: astore_3
    //   23: aload 4
    //   25: invokestatic 12	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   28: ifeq +24 -> 52
    //   31: new 37	java/lang/StringBuilder
    //   34: dup
    //   35: ldc 67
    //   37: invokespecial 43	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   40: aload 5
    //   42: invokestatic 69	com/tencent/mm/pluginsdk/i/d:Tu	(Ljava/lang/String;)Ljava/lang/String;
    //   45: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: invokevirtual 51	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   51: astore_3
    //   52: new 71	java/io/File
    //   55: dup
    //   56: getstatic 77	com/tencent/mm/compatible/util/e:dgj	Ljava/lang/String;
    //   59: aload_3
    //   60: invokespecial 80	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   63: astore 5
    //   65: aload 5
    //   67: invokevirtual 83	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   70: invokestatic 88	com/tencent/mm/modelsfs/FileOp:cn	(Ljava/lang/String;)Z
    //   73: ifeq +12 -> 85
    //   76: aload 5
    //   78: invokevirtual 83	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   81: invokestatic 91	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
    //   84: pop
    //   85: new 93	java/io/FileOutputStream
    //   88: dup
    //   89: aload 5
    //   91: invokespecial 96	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   94: astore_3
    //   95: aload_0
    //   96: aload_1
    //   97: invokevirtual 100	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   100: astore_0
    //   101: aload_0
    //   102: ifnonnull +13 -> 115
    //   105: aload_0
    //   106: invokestatic 106	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   109: aload_3
    //   110: invokestatic 110	com/tencent/mm/a/e:closeOutputStream	(Ljava/io/OutputStream;)V
    //   113: aconst_null
    //   114: areturn
    //   115: aload_0
    //   116: astore 4
    //   118: aload_3
    //   119: astore_1
    //   120: sipush 1024
    //   123: newarray <illegal type>
    //   125: astore 6
    //   127: aload_0
    //   128: astore 4
    //   130: aload_3
    //   131: astore_1
    //   132: aload_0
    //   133: aload 6
    //   135: invokevirtual 116	java/io/InputStream:read	([B)I
    //   138: istore_2
    //   139: iload_2
    //   140: ifle +49 -> 189
    //   143: aload_0
    //   144: astore 4
    //   146: aload_3
    //   147: astore_1
    //   148: aload_3
    //   149: aload 6
    //   151: iconst_0
    //   152: iload_2
    //   153: invokevirtual 120	java/io/FileOutputStream:write	([BII)V
    //   156: goto -29 -> 127
    //   159: astore 5
    //   161: aload_0
    //   162: astore 4
    //   164: aload_3
    //   165: astore_1
    //   166: ldc 122
    //   168: aload 5
    //   170: ldc 124
    //   172: iconst_0
    //   173: anewarray 4	java/lang/Object
    //   176: invokestatic 130	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   179: aload_0
    //   180: invokestatic 106	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   183: aload_3
    //   184: invokestatic 110	com/tencent/mm/a/e:closeOutputStream	(Ljava/io/OutputStream;)V
    //   187: aconst_null
    //   188: areturn
    //   189: aload_0
    //   190: astore 4
    //   192: aload_3
    //   193: astore_1
    //   194: aload 5
    //   196: invokevirtual 83	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   199: astore 5
    //   201: aload_0
    //   202: invokestatic 106	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   205: aload_3
    //   206: invokestatic 110	com/tencent/mm/a/e:closeOutputStream	(Ljava/io/OutputStream;)V
    //   209: aload 5
    //   211: areturn
    //   212: astore_0
    //   213: aconst_null
    //   214: astore 4
    //   216: aconst_null
    //   217: astore_1
    //   218: aload 4
    //   220: invokestatic 106	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   223: aload_1
    //   224: invokestatic 110	com/tencent/mm/a/e:closeOutputStream	(Ljava/io/OutputStream;)V
    //   227: aload_0
    //   228: athrow
    //   229: astore_0
    //   230: aconst_null
    //   231: astore 4
    //   233: aload_3
    //   234: astore_1
    //   235: goto -17 -> 218
    //   238: astore_0
    //   239: goto -21 -> 218
    //   242: astore 5
    //   244: aconst_null
    //   245: astore_0
    //   246: aconst_null
    //   247: astore_3
    //   248: goto -87 -> 161
    //   251: astore 5
    //   253: aconst_null
    //   254: astore_0
    //   255: goto -94 -> 161
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	258	0	paramContentResolver	android.content.ContentResolver
    //   0	258	1	paramUri	android.net.Uri
    //   138	15	2	i	int
    //   22	226	3	localObject1	Object
    //   18	214	4	localObject2	Object
    //   11	79	5	localObject3	Object
    //   159	36	5	localException1	Exception
    //   199	11	5	str	String
    //   242	1	5	localException2	Exception
    //   251	1	5	localException3	Exception
    //   125	25	6	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   120	127	159	java/lang/Exception
    //   132	139	159	java/lang/Exception
    //   148	156	159	java/lang/Exception
    //   194	201	159	java/lang/Exception
    //   85	95	212	finally
    //   95	101	229	finally
    //   120	127	238	finally
    //   132	139	238	finally
    //   148	156	238	finally
    //   166	179	238	finally
    //   194	201	238	finally
    //   85	95	242	java/lang/Exception
    //   95	101	251	java/lang/Exception
  }
  
  /* Error */
  public static final String a(android.content.ContentResolver paramContentResolver, android.net.Uri paramUri, int paramInt)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: aload_0
    //   7: aload_1
    //   8: invokevirtual 62	android/content/ContentResolver:getType	(Landroid/net/Uri;)Ljava/lang/String;
    //   11: astore_3
    //   12: new 71	java/io/File
    //   15: dup
    //   16: invokestatic 137	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   19: invokevirtual 143	android/content/Context:getCacheDir	()Ljava/io/File;
    //   22: new 37	java/lang/StringBuilder
    //   25: dup
    //   26: ldc -111
    //   28: invokespecial 43	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   31: iload_2
    //   32: invokevirtual 148	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   35: aload_3
    //   36: invokestatic 69	com/tencent/mm/pluginsdk/i/d:Tu	(Ljava/lang/String;)Ljava/lang/String;
    //   39: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: invokevirtual 51	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   45: invokespecial 151	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   48: invokevirtual 83	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   51: astore 5
    //   53: aload 5
    //   55: invokestatic 88	com/tencent/mm/modelsfs/FileOp:cn	(Ljava/lang/String;)Z
    //   58: ifeq +9 -> 67
    //   61: aload 5
    //   63: invokestatic 91	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
    //   66: pop
    //   67: new 93	java/io/FileOutputStream
    //   70: dup
    //   71: aload 5
    //   73: invokespecial 152	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   76: astore_3
    //   77: aload_0
    //   78: aload_1
    //   79: invokevirtual 100	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   82: astore_0
    //   83: aload_0
    //   84: ifnonnull +13 -> 97
    //   87: aload_0
    //   88: invokestatic 106	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   91: aload_3
    //   92: invokestatic 110	com/tencent/mm/a/e:closeOutputStream	(Ljava/io/OutputStream;)V
    //   95: aconst_null
    //   96: areturn
    //   97: aload_0
    //   98: astore 4
    //   100: aload_3
    //   101: astore_1
    //   102: sipush 1024
    //   105: newarray <illegal type>
    //   107: astore 6
    //   109: aload_0
    //   110: astore 4
    //   112: aload_3
    //   113: astore_1
    //   114: aload_0
    //   115: aload 6
    //   117: invokevirtual 116	java/io/InputStream:read	([B)I
    //   120: istore_2
    //   121: iload_2
    //   122: ifle +49 -> 171
    //   125: aload_0
    //   126: astore 4
    //   128: aload_3
    //   129: astore_1
    //   130: aload_3
    //   131: aload 6
    //   133: iconst_0
    //   134: iload_2
    //   135: invokevirtual 120	java/io/FileOutputStream:write	([BII)V
    //   138: goto -29 -> 109
    //   141: astore 5
    //   143: aload_0
    //   144: astore 4
    //   146: aload_3
    //   147: astore_1
    //   148: ldc 122
    //   150: aload 5
    //   152: ldc 124
    //   154: iconst_0
    //   155: anewarray 4	java/lang/Object
    //   158: invokestatic 130	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   161: aload_0
    //   162: invokestatic 106	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   165: aload_3
    //   166: invokestatic 110	com/tencent/mm/a/e:closeOutputStream	(Ljava/io/OutputStream;)V
    //   169: aconst_null
    //   170: areturn
    //   171: aload_0
    //   172: invokestatic 106	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   175: aload_3
    //   176: invokestatic 110	com/tencent/mm/a/e:closeOutputStream	(Ljava/io/OutputStream;)V
    //   179: aload 5
    //   181: areturn
    //   182: astore_0
    //   183: aconst_null
    //   184: astore 4
    //   186: aconst_null
    //   187: astore_1
    //   188: aload 4
    //   190: invokestatic 106	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   193: aload_1
    //   194: invokestatic 110	com/tencent/mm/a/e:closeOutputStream	(Ljava/io/OutputStream;)V
    //   197: aload_0
    //   198: athrow
    //   199: astore_0
    //   200: aconst_null
    //   201: astore 4
    //   203: aload_3
    //   204: astore_1
    //   205: goto -17 -> 188
    //   208: astore_0
    //   209: goto -21 -> 188
    //   212: astore 5
    //   214: aconst_null
    //   215: astore_0
    //   216: aconst_null
    //   217: astore_3
    //   218: goto -75 -> 143
    //   221: astore 5
    //   223: aconst_null
    //   224: astore_0
    //   225: goto -82 -> 143
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	228	0	paramContentResolver	android.content.ContentResolver
    //   0	228	1	paramUri	android.net.Uri
    //   0	228	2	paramInt	int
    //   11	207	3	localObject	Object
    //   98	104	4	localContentResolver	android.content.ContentResolver
    //   51	21	5	str	String
    //   141	39	5	localException1	Exception
    //   212	1	5	localException2	Exception
    //   221	1	5	localException3	Exception
    //   107	25	6	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   102	109	141	java/lang/Exception
    //   114	121	141	java/lang/Exception
    //   130	138	141	java/lang/Exception
    //   67	77	182	finally
    //   77	83	199	finally
    //   102	109	208	finally
    //   114	121	208	finally
    //   130	138	208	finally
    //   148	161	208	finally
    //   67	77	212	java/lang/Exception
    //   77	83	221	java/lang/Exception
  }
  
  /* Error */
  private static String b(android.content.ContentResolver paramContentResolver, android.net.Uri paramUri)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iconst_1
    //   3: anewarray 25	java/lang/String
    //   6: dup
    //   7: iconst_0
    //   8: ldc -102
    //   10: aastore
    //   11: aconst_null
    //   12: aconst_null
    //   13: aconst_null
    //   14: invokevirtual 158	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   17: astore_0
    //   18: aload_0
    //   19: ifnull +152 -> 171
    //   22: aload_0
    //   23: astore_2
    //   24: aload_0
    //   25: invokeinterface 164 1 0
    //   30: ifeq +141 -> 171
    //   33: aload_0
    //   34: astore_2
    //   35: new 71	java/io/File
    //   38: dup
    //   39: aload_0
    //   40: iconst_0
    //   41: invokeinterface 168 2 0
    //   46: invokespecial 169	java/io/File:<init>	(Ljava/lang/String;)V
    //   49: invokevirtual 172	java/io/File:getName	()Ljava/lang/String;
    //   52: astore_3
    //   53: aload_3
    //   54: astore_1
    //   55: aload_1
    //   56: astore_2
    //   57: aload_0
    //   58: ifnull +11 -> 69
    //   61: aload_0
    //   62: invokeinterface 176 1 0
    //   67: aload_1
    //   68: astore_2
    //   69: aload_2
    //   70: areturn
    //   71: astore_3
    //   72: aconst_null
    //   73: astore_0
    //   74: aload_0
    //   75: astore_2
    //   76: ldc 122
    //   78: aload_3
    //   79: ldc -78
    //   81: iconst_0
    //   82: anewarray 4	java/lang/Object
    //   85: invokestatic 130	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   88: aload_0
    //   89: astore_2
    //   90: aload_1
    //   91: invokevirtual 181	android/net/Uri:toString	()Ljava/lang/String;
    //   94: ldc -73
    //   96: invokestatic 189	java/net/URLDecoder:decode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   99: ldc 31
    //   101: invokevirtual 35	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   104: astore_1
    //   105: aload_0
    //   106: astore_2
    //   107: aload_1
    //   108: aload_1
    //   109: arraylength
    //   110: iconst_1
    //   111: isub
    //   112: aaload
    //   113: astore_1
    //   114: aload_1
    //   115: astore_2
    //   116: aload_0
    //   117: ifnull -48 -> 69
    //   120: aload_0
    //   121: invokeinterface 176 1 0
    //   126: aload_1
    //   127: areturn
    //   128: astore_1
    //   129: aload_0
    //   130: astore_2
    //   131: ldc 122
    //   133: aload_1
    //   134: ldc -65
    //   136: iconst_0
    //   137: anewarray 4	java/lang/Object
    //   140: invokestatic 130	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   143: aconst_null
    //   144: astore_1
    //   145: goto -31 -> 114
    //   148: astore_0
    //   149: aconst_null
    //   150: astore_2
    //   151: aload_2
    //   152: ifnull +9 -> 161
    //   155: aload_2
    //   156: invokeinterface 176 1 0
    //   161: aload_0
    //   162: athrow
    //   163: astore_0
    //   164: goto -13 -> 151
    //   167: astore_3
    //   168: goto -94 -> 74
    //   171: aconst_null
    //   172: astore_1
    //   173: goto -118 -> 55
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	176	0	paramContentResolver	android.content.ContentResolver
    //   0	176	1	paramUri	android.net.Uri
    //   23	133	2	localObject	Object
    //   52	2	3	str	String
    //   71	8	3	localException1	Exception
    //   167	1	3	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   0	18	71	java/lang/Exception
    //   90	105	128	java/lang/Exception
    //   107	114	128	java/lang/Exception
    //   0	18	148	finally
    //   24	33	163	finally
    //   35	53	163	finally
    //   76	88	163	finally
    //   90	105	163	finally
    //   107	114	163	finally
    //   131	143	163	finally
    //   24	33	167	java/lang/Exception
    //   35	53	167	java/lang/Exception
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/pluginsdk/i/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */