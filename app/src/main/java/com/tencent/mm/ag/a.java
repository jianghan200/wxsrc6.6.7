package com.tencent.mm.ag;

import android.content.Context;
import android.content.res.AssetManager;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class a
{
  public static int dRu = 1;
  private static String duO = "";
  
  private static String Ob()
  {
    if (bi.oW(duO)) {
      duO = com.tencent.mm.compatible.util.e.duO.replace("/data/user/0", "/data/data");
    }
    return duO;
  }
  
  public static String Oc()
  {
    File localFile = new File(Ob(), "emoji/res");
    if (!localFile.exists()) {
      localFile.mkdir();
    }
    return localFile.getAbsolutePath();
  }
  
  public static String Od()
  {
    return Ob() + "emoji/newemoji";
  }
  
  /* Error */
  public static int Oe()
  {
    // Byte code:
    //   0: new 79	java/io/FileInputStream
    //   3: dup
    //   4: new 41	java/io/File
    //   7: dup
    //   8: invokestatic 81	com/tencent/mm/ag/a:Oc	()Ljava/lang/String;
    //   11: ldc 83
    //   13: invokespecial 49	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   16: invokespecial 86	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   19: astore_2
    //   20: aload_2
    //   21: astore_1
    //   22: new 88	java/io/BufferedReader
    //   25: dup
    //   26: new 90	java/io/InputStreamReader
    //   29: dup
    //   30: aload_2
    //   31: invokespecial 93	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   34: invokespecial 96	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   37: astore 4
    //   39: ldc 14
    //   41: astore_3
    //   42: aload_2
    //   43: astore_1
    //   44: aload 4
    //   46: invokevirtual 99	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   49: astore 5
    //   51: aload 5
    //   53: ifnull +28 -> 81
    //   56: aload_2
    //   57: astore_1
    //   58: new 62	java/lang/StringBuilder
    //   61: dup
    //   62: invokespecial 64	java/lang/StringBuilder:<init>	()V
    //   65: aload_3
    //   66: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: aload 5
    //   71: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: invokevirtual 73	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   77: astore_3
    //   78: goto -36 -> 42
    //   81: aload_2
    //   82: astore_1
    //   83: new 101	org/json/JSONObject
    //   86: dup
    //   87: aload_3
    //   88: invokespecial 104	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   91: ldc 106
    //   93: invokevirtual 110	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   96: istore_0
    //   97: aload_2
    //   98: astore_1
    //   99: ldc 112
    //   101: ldc 114
    //   103: iconst_2
    //   104: anewarray 4	java/lang/Object
    //   107: dup
    //   108: iconst_0
    //   109: aload_3
    //   110: aastore
    //   111: dup
    //   112: iconst_1
    //   113: iload_0
    //   114: invokestatic 120	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   117: aastore
    //   118: invokestatic 126	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   121: aload_2
    //   122: invokestatic 131	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   125: iload_0
    //   126: ireturn
    //   127: astore_3
    //   128: aconst_null
    //   129: astore_2
    //   130: aload_2
    //   131: astore_1
    //   132: ldc 112
    //   134: aload_3
    //   135: aload_3
    //   136: invokevirtual 134	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   139: iconst_0
    //   140: anewarray 4	java/lang/Object
    //   143: invokestatic 138	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   146: aload_2
    //   147: invokestatic 131	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   150: iconst_1
    //   151: ireturn
    //   152: astore_2
    //   153: aconst_null
    //   154: astore_1
    //   155: aload_1
    //   156: invokestatic 131	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   159: aload_2
    //   160: athrow
    //   161: astore_2
    //   162: goto -7 -> 155
    //   165: astore_3
    //   166: goto -36 -> 130
    // Local variable table:
    //   start	length	slot	name	signature
    //   96	30	0	i	int
    //   21	135	1	localFileInputStream1	java.io.FileInputStream
    //   19	128	2	localFileInputStream2	java.io.FileInputStream
    //   152	8	2	localObject1	Object
    //   161	1	2	localObject2	Object
    //   41	69	3	str1	String
    //   127	9	3	localException1	Exception
    //   165	1	3	localException2	Exception
    //   37	8	4	localBufferedReader	java.io.BufferedReader
    //   49	21	5	str2	String
    // Exception table:
    //   from	to	target	type
    //   0	20	127	java/lang/Exception
    //   0	20	152	finally
    //   22	39	161	finally
    //   44	51	161	finally
    //   58	78	161	finally
    //   83	97	161	finally
    //   99	121	161	finally
    //   132	146	161	finally
    //   22	39	165	java/lang/Exception
    //   44	51	165	java/lang/Exception
    //   58	78	165	java/lang/Exception
    //   83	97	165	java/lang/Exception
    //   99	121	165	java/lang/Exception
  }
  
  /* Error */
  private static int Of()
  {
    // Byte code:
    //   0: invokestatic 145	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   3: invokevirtual 151	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   6: astore_1
    //   7: aload_1
    //   8: ldc -103
    //   10: invokevirtual 159	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   13: astore_2
    //   14: new 90	java/io/InputStreamReader
    //   17: dup
    //   18: aload_2
    //   19: invokespecial 93	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   22: astore 4
    //   24: new 88	java/io/BufferedReader
    //   27: dup
    //   28: aload 4
    //   30: invokespecial 96	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   33: astore_1
    //   34: ldc 14
    //   36: astore_3
    //   37: aload_1
    //   38: astore 7
    //   40: aload 4
    //   42: astore 6
    //   44: aload_2
    //   45: astore 5
    //   47: aload_1
    //   48: invokevirtual 99	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   51: astore 8
    //   53: aload 8
    //   55: ifnull +36 -> 91
    //   58: aload_1
    //   59: astore 7
    //   61: aload 4
    //   63: astore 6
    //   65: aload_2
    //   66: astore 5
    //   68: new 62	java/lang/StringBuilder
    //   71: dup
    //   72: invokespecial 64	java/lang/StringBuilder:<init>	()V
    //   75: aload_3
    //   76: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: aload 8
    //   81: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   84: invokevirtual 73	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   87: astore_3
    //   88: goto -51 -> 37
    //   91: aload_1
    //   92: astore 7
    //   94: aload 4
    //   96: astore 6
    //   98: aload_2
    //   99: astore 5
    //   101: new 101	org/json/JSONObject
    //   104: dup
    //   105: aload_3
    //   106: invokespecial 104	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   109: ldc 106
    //   111: invokevirtual 110	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   114: istore_0
    //   115: aload_1
    //   116: astore 7
    //   118: aload 4
    //   120: astore 6
    //   122: aload_2
    //   123: astore 5
    //   125: ldc 112
    //   127: ldc 114
    //   129: iconst_2
    //   130: anewarray 4	java/lang/Object
    //   133: dup
    //   134: iconst_0
    //   135: aload_3
    //   136: aastore
    //   137: dup
    //   138: iconst_1
    //   139: iload_0
    //   140: invokestatic 120	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   143: aastore
    //   144: invokestatic 126	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   147: aload_2
    //   148: invokestatic 131	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   151: aload 4
    //   153: invokestatic 162	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   156: aload_1
    //   157: invokestatic 162	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   160: iload_0
    //   161: ireturn
    //   162: astore_3
    //   163: aconst_null
    //   164: astore_1
    //   165: aconst_null
    //   166: astore 4
    //   168: aconst_null
    //   169: astore_2
    //   170: aload_1
    //   171: astore 7
    //   173: aload 4
    //   175: astore 6
    //   177: aload_2
    //   178: astore 5
    //   180: ldc 112
    //   182: aload_3
    //   183: aload_3
    //   184: invokevirtual 134	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   187: iconst_0
    //   188: anewarray 4	java/lang/Object
    //   191: invokestatic 138	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   194: aload_2
    //   195: invokestatic 131	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   198: aload 4
    //   200: invokestatic 162	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   203: aload_1
    //   204: invokestatic 162	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   207: iconst_1
    //   208: ireturn
    //   209: astore_1
    //   210: aconst_null
    //   211: astore_3
    //   212: aconst_null
    //   213: astore 4
    //   215: aconst_null
    //   216: astore_2
    //   217: aload_2
    //   218: invokestatic 131	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   221: aload 4
    //   223: invokestatic 162	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   226: aload_3
    //   227: invokestatic 162	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   230: aload_1
    //   231: athrow
    //   232: astore_1
    //   233: aconst_null
    //   234: astore_3
    //   235: aconst_null
    //   236: astore 4
    //   238: goto -21 -> 217
    //   241: astore_1
    //   242: aconst_null
    //   243: astore_3
    //   244: goto -27 -> 217
    //   247: astore_1
    //   248: aload 7
    //   250: astore_3
    //   251: aload 6
    //   253: astore 4
    //   255: aload 5
    //   257: astore_2
    //   258: goto -41 -> 217
    //   261: astore_3
    //   262: aconst_null
    //   263: astore_1
    //   264: aconst_null
    //   265: astore 4
    //   267: goto -97 -> 170
    //   270: astore_3
    //   271: aconst_null
    //   272: astore_1
    //   273: goto -103 -> 170
    //   276: astore_3
    //   277: goto -107 -> 170
    // Local variable table:
    //   start	length	slot	name	signature
    //   114	47	0	i	int
    //   6	198	1	localObject1	Object
    //   209	22	1	localObject2	Object
    //   232	1	1	localObject3	Object
    //   241	1	1	localObject4	Object
    //   247	1	1	localObject5	Object
    //   263	10	1	localObject6	Object
    //   13	245	2	localObject7	Object
    //   36	100	3	str1	String
    //   162	22	3	localException1	Exception
    //   211	40	3	localObject8	Object
    //   261	1	3	localException2	Exception
    //   270	1	3	localException3	Exception
    //   276	1	3	localException4	Exception
    //   22	244	4	localObject9	Object
    //   45	211	5	localObject10	Object
    //   42	210	6	localObject11	Object
    //   38	211	7	localObject12	Object
    //   51	29	8	str2	String
    // Exception table:
    //   from	to	target	type
    //   7	14	162	java/lang/Exception
    //   7	14	209	finally
    //   14	24	232	finally
    //   24	34	241	finally
    //   47	53	247	finally
    //   68	88	247	finally
    //   101	115	247	finally
    //   125	147	247	finally
    //   180	194	247	finally
    //   14	24	261	java/lang/Exception
    //   24	34	270	java/lang/Exception
    //   47	53	276	java/lang/Exception
    //   68	88	276	java/lang/Exception
    //   101	115	276	java/lang/Exception
    //   125	147	276	java/lang/Exception
  }
  
  public static void bJ(boolean paramBoolean)
  {
    File localFile = new File(Oc());
    x.i("MicroMsg.emoji.EmojiStoreExportLogic", "copy search template file to path: %s", new Object[] { localFile.getAbsoluteFile() });
    if ((d.qVQ) || (d.qVR))
    {
      x.i("MicroMsg.emoji.EmojiStoreExportLogic", "need to init search template folder %b", new Object[] { Boolean.valueOf(paramBoolean) });
      com.tencent.mm.a.e.k(localFile);
      r(localFile);
    }
    for (;;)
    {
      com.tencent.mm.a.e.k(new File(com.tencent.mm.compatible.util.e.bnE, "emoji"));
      return;
      dRu = Oe();
      if (paramBoolean)
      {
        int i = Of();
        x.i("MicroMsg.emoji.EmojiStoreExportLogic", "need update assetVersion=%d currentVersion=%d", new Object[] { Integer.valueOf(i), Integer.valueOf(dRu) });
        if (dRu < i)
        {
          com.tencent.mm.a.e.k(localFile);
          r(localFile);
        }
      }
      else if (dRu == 1)
      {
        x.i("MicroMsg.emoji.EmojiStoreExportLogic", "no need update currentVersion=%d", new Object[] { Integer.valueOf(dRu) });
        com.tencent.mm.a.e.k(localFile);
        r(localFile);
      }
    }
  }
  
  private static void e(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    byte[] arrayOfByte = new byte['Ѐ'];
    for (;;)
    {
      int i = paramInputStream.read(arrayOfByte);
      if (i == -1) {
        break;
      }
      paramOutputStream.write(arrayOfByte, 0, i);
    }
  }
  
  private static boolean lC(String paramString)
  {
    Object localObject1 = ad.getContext().getAssets();
    try
    {
      localObject1 = ((AssetManager)localObject1).open("emoji_template.zip");
      if (localObject1 == null)
      {
        x.e("MicroMsg.emoji.EmojiStoreExportLogic", "file inputStream not found");
        return false;
      }
    }
    catch (IOException localIOException1)
    {
      InputStream localInputStream;
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.emoji.EmojiStoreExportLogic", localIOException1, "", new Object[0]);
        localInputStream = null;
      }
      paramString = new File(paramString);
      if (paramString.exists()) {
        paramString.delete();
      }
      paramString.getParentFile().mkdirs();
      try
      {
        paramString = new FileOutputStream(paramString);
        if (paramString == null) {}
      }
      catch (FileNotFoundException paramString)
      {
        for (;;)
        {
          try
          {
            e(localInputStream, paramString);
            return true;
          }
          catch (IOException localIOException2)
          {
            x.printErrStackTrace("MicroMsg.emoji.EmojiStoreExportLogic", localIOException2, "", new Object[0]);
            return false;
          }
          finally
          {
            com.tencent.mm.a.e.f(localInputStream);
            com.tencent.mm.a.e.closeOutputStream(paramString);
          }
          paramString = paramString;
          x.printErrStackTrace("MicroMsg.emoji.EmojiStoreExportLogic", paramString, "", new Object[0]);
          paramString = null;
        }
      }
      com.tencent.mm.a.e.f(localInputStream);
    }
    return false;
  }
  
  private static void r(File paramFile)
  {
    if (!paramFile.exists()) {
      paramFile.mkdirs();
    }
    File localFile = new File(paramFile, ".nomedia");
    if (!localFile.exists()) {}
    try
    {
      localFile.createNewFile();
      paramFile = new File(paramFile, "emoji_template.zip");
      if (lC(paramFile.getAbsolutePath()))
      {
        int i = bi.fR(paramFile.getAbsolutePath(), paramFile.getParent());
        if (i < 0)
        {
          x.e("MicroMsg.emoji.EmojiStoreExportLogic", "unzip fail, ret = " + i + ", zipFilePath = " + paramFile.getAbsolutePath() + ", unzipPath = " + paramFile.getParent());
          return;
        }
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.emoji.EmojiStoreExportLogic", localIOException, "create nomedia file error", new Object[0]);
      }
      dRu = Oe();
      x.i("MicroMsg.emoji.EmojiStoreExportLogic", "Unzip Path%s version=%d", new Object[] { paramFile.getParent(), Integer.valueOf(dRu) });
      return;
    }
    x.i("MicroMsg.emoji.EmojiStoreExportLogic", "copy template file from asset fail %s", new Object[] { paramFile.getAbsolutePath() });
  }
  
  public static void s(File paramFile)
  {
    File localFile1 = new File(Oc());
    com.tencent.mm.a.e.k(localFile1);
    localFile1.mkdirs();
    File localFile2 = new File(localFile1, ".nomedia");
    if (!localFile2.exists()) {}
    try
    {
      localFile2.createNewFile();
      localFile1 = new File(localFile1, "emoji_template.zip");
      com.tencent.mm.a.e.y(paramFile.getAbsolutePath(), localFile1.getAbsolutePath());
      int i = bi.fR(localFile1.getAbsolutePath(), localFile1.getParent());
      if (i < 0)
      {
        x.e("MicroMsg.emoji.EmojiStoreExportLogic", "unzip fail, ret = " + i + ", zipFilePath = " + localFile1.getAbsolutePath() + ", unzipPath = " + localFile1.getParent());
        return;
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.emoji.EmojiStoreExportLogic", localIOException, "create nomedia file error", new Object[0]);
      }
      dRu = Oe();
      x.i("MicroMsg.emoji.EmojiStoreExportLogic", "Unzip Path%s version=%d", new Object[] { localFile1.getParent(), Integer.valueOf(dRu) });
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ag/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */