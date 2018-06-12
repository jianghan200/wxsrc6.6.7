package com.tencent.mm.storage;

import com.tencent.mm.a.g;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;

public final class RegionCodeDecoder
{
  private static RegionCodeDecoder tcn = null;
  public static final String tco = e.duM + "MicroMsg/regioncode/";
  public String tcp = "";
  private String tcq = "";
  
  /* Error */
  private static String N(File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 56	java/io/File
    //   5: dup
    //   6: new 22	java/lang/StringBuilder
    //   9: dup
    //   10: invokespecial 25	java/lang/StringBuilder:<init>	()V
    //   13: aload_0
    //   14: invokevirtual 59	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   17: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   20: ldc 61
    //   22: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: invokevirtual 40	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   28: invokespecial 64	java/io/File:<init>	(Ljava/lang/String;)V
    //   31: astore 4
    //   33: aload_3
    //   34: astore_0
    //   35: aload 4
    //   37: invokevirtual 68	java/io/File:exists	()Z
    //   40: ifeq +33 -> 73
    //   43: new 70	java/io/BufferedReader
    //   46: dup
    //   47: new 72	java/io/FileReader
    //   50: dup
    //   51: aload 4
    //   53: invokespecial 75	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   56: invokespecial 78	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   59: astore_1
    //   60: aload_1
    //   61: astore_0
    //   62: aload_1
    //   63: invokevirtual 81	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   66: astore_2
    //   67: aload_2
    //   68: astore_0
    //   69: aload_1
    //   70: invokevirtual 84	java/io/BufferedReader:close	()V
    //   73: aload_0
    //   74: areturn
    //   75: astore_2
    //   76: aconst_null
    //   77: astore_1
    //   78: aload_1
    //   79: astore_0
    //   80: ldc 86
    //   82: aload_2
    //   83: ldc 88
    //   85: iconst_1
    //   86: anewarray 4	java/lang/Object
    //   89: dup
    //   90: iconst_0
    //   91: aload 4
    //   93: invokevirtual 91	java/io/File:getName	()Ljava/lang/String;
    //   96: aastore
    //   97: invokestatic 97	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   100: aload_3
    //   101: astore_0
    //   102: aload_1
    //   103: ifnull -30 -> 73
    //   106: aload_1
    //   107: invokevirtual 84	java/io/BufferedReader:close	()V
    //   110: aconst_null
    //   111: areturn
    //   112: astore_0
    //   113: aconst_null
    //   114: areturn
    //   115: astore_1
    //   116: aconst_null
    //   117: astore_0
    //   118: aload_0
    //   119: ifnull +7 -> 126
    //   122: aload_0
    //   123: invokevirtual 84	java/io/BufferedReader:close	()V
    //   126: aload_1
    //   127: athrow
    //   128: astore_1
    //   129: aload_0
    //   130: areturn
    //   131: astore_0
    //   132: goto -6 -> 126
    //   135: astore_1
    //   136: goto -18 -> 118
    //   139: astore_2
    //   140: goto -62 -> 78
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	143	0	paramFile	File
    //   59	48	1	localBufferedReader	java.io.BufferedReader
    //   115	12	1	localObject1	Object
    //   128	1	1	localThrowable1	Throwable
    //   135	1	1	localObject2	Object
    //   66	2	2	str	String
    //   75	8	2	localThrowable2	Throwable
    //   139	1	2	localThrowable3	Throwable
    //   1	100	3	localObject3	Object
    //   31	61	4	localFile	File
    // Exception table:
    //   from	to	target	type
    //   43	60	75	java/lang/Throwable
    //   106	110	112	java/lang/Throwable
    //   43	60	115	finally
    //   69	73	128	java/lang/Throwable
    //   122	126	131	java/lang/Throwable
    //   62	67	135	finally
    //   80	100	135	finally
    //   62	67	139	java/lang/Throwable
  }
  
  private static String O(File paramFile)
  {
    String str = g.m(paramFile);
    if (bi.oW(str))
    {
      x.e("MicroMsg.RegionCodeDecoder", "Failed to calculate hash for file %s", new Object[] { paramFile.getName() });
      return null;
    }
    return ac.ce(str + "#" + paramFile.lastModified() + "#" + q.zy());
  }
  
  /* Error */
  private void P(File paramFile)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: aconst_null
    //   5: astore 4
    //   7: aload_1
    //   8: invokevirtual 68	java/io/File:exists	()Z
    //   11: ifeq +9 -> 20
    //   14: aload_1
    //   15: invokevirtual 142	java/io/File:list	()[Ljava/lang/String;
    //   18: astore 4
    //   20: aload_1
    //   21: invokevirtual 68	java/io/File:exists	()Z
    //   24: ifeq +19 -> 43
    //   27: aload 4
    //   29: ifnull +14 -> 43
    //   32: aload 4
    //   34: arraylength
    //   35: istore_3
    //   36: iload_3
    //   37: ifeq +6 -> 43
    //   40: aload_0
    //   41: monitorexit
    //   42: return
    //   43: invokestatic 148	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   46: invokevirtual 154	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   49: ldc -100
    //   51: invokevirtual 161	android/content/res/AssetManager:list	(Ljava/lang/String;)[Ljava/lang/String;
    //   54: astore 4
    //   56: aload 4
    //   58: arraylength
    //   59: istore_3
    //   60: iload_2
    //   61: iload_3
    //   62: if_icmpge -22 -> 40
    //   65: aload 4
    //   67: iload_2
    //   68: aaload
    //   69: astore 5
    //   71: ldc 86
    //   73: ldc -93
    //   75: iconst_2
    //   76: anewarray 4	java/lang/Object
    //   79: dup
    //   80: iconst_0
    //   81: new 22	java/lang/StringBuilder
    //   84: dup
    //   85: ldc -91
    //   87: invokespecial 166	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   90: aload 5
    //   92: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: invokevirtual 40	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   98: aastore
    //   99: dup
    //   100: iconst_1
    //   101: new 22	java/lang/StringBuilder
    //   104: dup
    //   105: invokespecial 25	java/lang/StringBuilder:<init>	()V
    //   108: aload_1
    //   109: invokevirtual 169	java/io/File:getPath	()Ljava/lang/String;
    //   112: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: ldc -85
    //   117: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: aload 5
    //   122: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: invokevirtual 40	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   128: aastore
    //   129: invokestatic 174	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   132: new 22	java/lang/StringBuilder
    //   135: dup
    //   136: invokespecial 25	java/lang/StringBuilder:<init>	()V
    //   139: aload_1
    //   140: invokevirtual 169	java/io/File:getPath	()Ljava/lang/String;
    //   143: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: ldc -85
    //   148: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: aload 5
    //   153: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: invokevirtual 40	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   159: astore 6
    //   161: invokestatic 148	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   164: new 22	java/lang/StringBuilder
    //   167: dup
    //   168: ldc -91
    //   170: invokespecial 166	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   173: aload 5
    //   175: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: invokevirtual 40	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   181: aload 6
    //   183: invokestatic 180	com/tencent/mm/sdk/platformtools/j:C	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
    //   186: pop
    //   187: new 56	java/io/File
    //   190: dup
    //   191: aload 6
    //   193: invokespecial 64	java/io/File:<init>	(Ljava/lang/String;)V
    //   196: aload_1
    //   197: invokestatic 184	com/tencent/mm/storage/RegionCodeDecoder:h	(Ljava/io/File;Ljava/io/File;)V
    //   200: iload_2
    //   201: iconst_1
    //   202: iadd
    //   203: istore_2
    //   204: goto -144 -> 60
    //   207: astore_1
    //   208: ldc 86
    //   210: aload_1
    //   211: ldc 46
    //   213: iconst_0
    //   214: anewarray 4	java/lang/Object
    //   217: invokestatic 97	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   220: goto -180 -> 40
    //   223: astore_1
    //   224: aload_0
    //   225: monitorexit
    //   226: aload_1
    //   227: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	228	0	this	RegionCodeDecoder
    //   0	228	1	paramFile	File
    //   1	203	2	i	int
    //   35	28	3	j	int
    //   5	61	4	arrayOfString	String[]
    //   69	105	5	str1	String
    //   159	33	6	str2	String
    // Exception table:
    //   from	to	target	type
    //   43	60	207	java/lang/Exception
    //   71	200	207	java/lang/Exception
    //   7	20	223	finally
    //   20	27	223	finally
    //   32	36	223	finally
    //   43	60	223	finally
    //   71	200	223	finally
    //   208	220	223	finally
  }
  
  public static String Zg(String paramString)
  {
    if ((bi.oW(paramString)) || (!w.Wk(paramString)))
    {
      x.e("MicroMsg.RegionCodeDecoder", "unsupported language:" + paramString);
      return null;
    }
    String str = paramString;
    if (paramString.equalsIgnoreCase("zh_HK")) {
      str = "zh_TW";
    }
    return tco + "mmregioncode_" + str + ".txt";
  }
  
  public static final boolean Zh(String paramString)
  {
    if (bi.oW(paramString)) {
      return false;
    }
    return paramString.equalsIgnoreCase("cn");
  }
  
  public static String Zi(String paramString)
  {
    String str2 = getLocName(paramString);
    String str1 = str2;
    if (bi.oW(str2)) {
      str1 = bi.oV(paramString);
    }
    return str1;
  }
  
  public static final String aq(String paramString1, String paramString2, String paramString3)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if (!bi.oW(paramString1))
    {
      localStringBuffer.append(paramString1);
      if (!bi.oW(paramString2))
      {
        localStringBuffer.append('_');
        localStringBuffer.append(paramString2);
        if (!bi.oW(paramString3))
        {
          localStringBuffer.append('_');
          localStringBuffer.append(paramString3);
        }
      }
    }
    return localStringBuffer.toString();
  }
  
  public static String ar(String paramString1, String paramString2, String paramString3)
  {
    if ((bi.oW(paramString1)) || (bi.oW(paramString2)) || (bi.oW(paramString3))) {}
    for (paramString1 = null;; paramString1 = getLocName(aq(paramString1, paramString2, paramString3)))
    {
      paramString2 = paramString1;
      if (bi.oW(paramString1)) {
        paramString2 = bi.oV(paramString3);
      }
      return paramString2;
    }
  }
  
  public static RegionCodeDecoder cmS()
  {
    if (tcn == null) {
      tcn = new RegionCodeDecoder();
    }
    RegionCodeDecoder localRegionCodeDecoder = tcn;
    if (!w.chP().equals(localRegionCodeDecoder.tcp)) {
      localRegionCodeDecoder.ckJ();
    }
    return tcn;
  }
  
  public static String ga(String paramString1, String paramString2)
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (!bi.oW(paramString1)) {
      if (!bi.oW(paramString2)) {
        break label36;
      }
    }
    label36:
    for (localObject1 = localObject2;; localObject1 = getLocName(aq(paramString1, paramString2, null)))
    {
      paramString1 = (String)localObject1;
      if (bi.oW((String)localObject1)) {
        paramString1 = bi.oV(paramString2);
      }
      return paramString1;
    }
  }
  
  public static String getLocName(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    return DecoderJni.getLocName(paramString);
  }
  
  /* Error */
  public static void h(File paramFile1, File paramFile2)
  {
    // Byte code:
    //   0: ldc 86
    //   2: ldc -5
    //   4: iconst_1
    //   5: anewarray 4	java/lang/Object
    //   8: dup
    //   9: iconst_0
    //   10: aload_0
    //   11: invokevirtual 91	java/io/File:getName	()Ljava/lang/String;
    //   14: aastore
    //   15: invokestatic 174	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   18: new 56	java/io/File
    //   21: dup
    //   22: aload_1
    //   23: new 22	java/lang/StringBuilder
    //   26: dup
    //   27: invokespecial 25	java/lang/StringBuilder:<init>	()V
    //   30: aload_0
    //   31: invokevirtual 91	java/io/File:getName	()Ljava/lang/String;
    //   34: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: ldc 61
    //   39: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: invokevirtual 40	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   45: invokespecial 254	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   48: astore_1
    //   49: aload_0
    //   50: invokestatic 256	com/tencent/mm/storage/RegionCodeDecoder:O	(Ljava/io/File;)Ljava/lang/String;
    //   53: astore_3
    //   54: aload_3
    //   55: invokestatic 109	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   58: ifne +38 -> 96
    //   61: aload_1
    //   62: invokevirtual 68	java/io/File:exists	()Z
    //   65: ifne +11 -> 76
    //   68: aload_1
    //   69: invokevirtual 260	java/io/File:getParentFile	()Ljava/io/File;
    //   72: invokevirtual 263	java/io/File:mkdirs	()Z
    //   75: pop
    //   76: new 265	java/io/PrintWriter
    //   79: dup
    //   80: aload_1
    //   81: invokespecial 266	java/io/PrintWriter:<init>	(Ljava/io/File;)V
    //   84: astore_2
    //   85: aload_2
    //   86: astore_1
    //   87: aload_2
    //   88: aload_3
    //   89: invokevirtual 269	java/io/PrintWriter:print	(Ljava/lang/String;)V
    //   92: aload_2
    //   93: invokevirtual 270	java/io/PrintWriter:close	()V
    //   96: return
    //   97: astore_3
    //   98: aconst_null
    //   99: astore_2
    //   100: aload_2
    //   101: astore_1
    //   102: ldc 86
    //   104: aload_3
    //   105: ldc_w 272
    //   108: iconst_1
    //   109: anewarray 4	java/lang/Object
    //   112: dup
    //   113: iconst_0
    //   114: aload_0
    //   115: invokevirtual 91	java/io/File:getName	()Ljava/lang/String;
    //   118: aastore
    //   119: invokestatic 97	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   122: aload_2
    //   123: ifnull -27 -> 96
    //   126: aload_2
    //   127: invokevirtual 270	java/io/PrintWriter:close	()V
    //   130: return
    //   131: astore_0
    //   132: return
    //   133: astore_0
    //   134: aconst_null
    //   135: astore_1
    //   136: aload_1
    //   137: ifnull +7 -> 144
    //   140: aload_1
    //   141: invokevirtual 270	java/io/PrintWriter:close	()V
    //   144: aload_0
    //   145: athrow
    //   146: astore_0
    //   147: return
    //   148: astore_1
    //   149: goto -5 -> 144
    //   152: astore_0
    //   153: goto -17 -> 136
    //   156: astore_3
    //   157: goto -57 -> 100
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	160	0	paramFile1	File
    //   0	160	1	paramFile2	File
    //   84	43	2	localPrintWriter	java.io.PrintWriter
    //   53	36	3	str	String
    //   97	8	3	localThrowable1	Throwable
    //   156	1	3	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   76	85	97	java/lang/Throwable
    //   126	130	131	java/lang/Throwable
    //   76	85	133	finally
    //   92	96	146	java/lang/Throwable
    //   140	144	148	java/lang/Throwable
    //   87	92	152	finally
    //   102	122	152	finally
    //   87	92	156	java/lang/Throwable
  }
  
  public final Region[] Zj(String paramString)
  {
    if ((bi.oW(this.tcq)) || (bi.oW(paramString))) {
      return null;
    }
    return DecoderJni.getProvinces(this.tcq, paramString);
  }
  
  public final void ckJ()
  {
    Object localObject1 = new File(tco);
    if (!((File)localObject1).exists())
    {
      ((File)localObject1).mkdir();
      P((File)localObject1);
    }
    Object localObject2 = ((File)localObject1).list();
    if ((localObject2 == null) || (localObject2.length == 0)) {
      P((File)localObject1);
    }
    this.tcp = w.chP();
    localObject1 = cmT();
    if (bi.oW((String)localObject1)) {
      x.e("MicroMsg.RegionCodeDecoder", "buildMap error, no codeFile found, curLang: " + this.tcp);
    }
    label260:
    label262:
    label313:
    label318:
    do
    {
      return;
      localObject2 = tco + (String)localObject1;
      File localFile1 = new File((String)localObject2);
      localObject1 = N(localFile1);
      boolean bool;
      File localFile2;
      if (bi.oW((String)localObject1))
      {
        bool = false;
        if (bool) {
          break label313;
        }
        if (j.C(ad.getContext(), "regioncode/" + localFile1.getName(), (String)localObject2)) {
          break label260;
        }
        localFile2 = new File(localFile1.getParentFile(), "mmregioncode_en.txt");
        localObject1 = localFile2.getAbsolutePath();
        if (j.C(ad.getContext(), "regioncode/mmregioncode_en.txt", localFile2.getAbsolutePath())) {
          break label262;
        }
        localObject1 = null;
      }
      for (;;)
      {
        if (!bi.oW((String)localObject1)) {
          break label318;
        }
        x.e("MicroMsg.RegionCodeDecoder", "buildMap error, no codeFile found after verify, curLang: " + this.tcp);
        return;
        bool = ((String)localObject1).equals(O(localFile1));
        break;
        localObject1 = localObject2;
        localFile2 = new File((String)localObject1);
        h(localFile2, localFile2.getParentFile());
        x.w("MicroMsg.RegionCodeDecoder", "Verifying codeFile: %s failed, after fallback, %s will be used.", new Object[] { localFile1.getName(), localFile2.getName() });
        continue;
        localObject1 = localObject2;
      }
    } while ((!bi.oW(this.tcq)) && (this.tcq.equals(localObject2)) && (((String)localObject2).equals(localObject1)));
    x.w("MicroMsg.RegionCodeDecoder", "buildMap, after verify, codeFile %s is used. curLang: %s", new Object[] { new File((String)localObject1).getName(), this.tcp });
    this.tcq = ((String)localObject1);
    DecoderJni.buildFromFile(this.tcq);
  }
  
  public final String cmT()
  {
    Object localObject = new StringBuilder("mmregioncode_");
    if (this.tcp.equalsIgnoreCase("zh_HK")) {}
    for (String str1 = "zh_TW";; str1 = this.tcp)
    {
      str1 = str1 + ".txt";
      localObject = new File(tco);
      if (((File)localObject).exists()) {
        break;
      }
      ((File)localObject).mkdir();
      return null;
    }
    localObject = ((File)localObject).list();
    if ((localObject == null) || (localObject.length == 0)) {
      return null;
    }
    int m = localObject.length;
    int i = 0;
    int k;
    for (int j = 0; i < m; j = k)
    {
      String str2 = localObject[i];
      if (str2.equals(str1)) {
        return str2;
      }
      k = j;
      if (j == 0)
      {
        k = j;
        if (str2.equals("mmregioncode_en.txt")) {
          k = 1;
        }
      }
      i += 1;
    }
    if (j != 0) {
      return "mmregioncode_en.txt";
    }
    return null;
  }
  
  public final Region[] cmU()
  {
    if (bi.oW(this.tcq)) {
      return null;
    }
    return DecoderJni.getCountries(this.tcq);
  }
  
  public final Region[] gb(String paramString1, String paramString2)
  {
    if ((bi.oW(this.tcq)) || (bi.oW(paramString1)) || (bi.oW(paramString2))) {
      return null;
    }
    return DecoderJni.getCities(this.tcq, paramString1, paramString2);
  }
  
  private static class DecoderJni
  {
    public static native void buildFromFile(String paramString);
    
    public static native RegionCodeDecoder.Region[] getCities(String paramString1, String paramString2, String paramString3);
    
    public static native RegionCodeDecoder.Region[] getCountries(String paramString);
    
    public static native String getLocName(String paramString);
    
    public static native RegionCodeDecoder.Region[] getProvinces(String paramString1, String paramString2);
    
    public static native void release();
  }
  
  public static class Region
  {
    private String code;
    private String countryCode;
    private boolean hasChildren = false;
    private boolean isCity = false;
    private boolean isCountry = false;
    private boolean isProvince = false;
    private String name;
    private Region parent = null;
    
    public String getCode()
    {
      return this.code;
    }
    
    public String getCountryCode()
    {
      return this.countryCode;
    }
    
    public String getName()
    {
      return this.name;
    }
    
    public Region getParent()
    {
      return this.parent;
    }
    
    public boolean hasChildren()
    {
      return this.hasChildren;
    }
    
    public boolean isCity()
    {
      return this.isCity;
    }
    
    public boolean isCountry()
    {
      return this.isCountry;
    }
    
    public boolean isProvince()
    {
      return this.isProvince;
    }
    
    public void setCity(boolean paramBoolean)
    {
      this.isCity = paramBoolean;
    }
    
    public void setCode(String paramString)
    {
      this.code = paramString;
    }
    
    public void setCountry(boolean paramBoolean)
    {
      this.isCountry = paramBoolean;
    }
    
    public void setCountryCode(String paramString)
    {
      this.countryCode = paramString;
    }
    
    public void setHasChildren(boolean paramBoolean)
    {
      this.hasChildren = paramBoolean;
    }
    
    public void setName(String paramString)
    {
      this.name = paramString;
    }
    
    public void setParent(Region paramRegion)
    {
      this.parent = paramRegion;
    }
    
    public void setProvince(boolean paramBoolean)
    {
      this.isProvince = paramBoolean;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/storage/RegionCodeDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */