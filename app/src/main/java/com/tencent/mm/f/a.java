package com.tencent.mm.f;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import dalvik.system.PathClassLoader;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

public final class a
{
  private static boolean bFR = false;
  private static String bFS;
  private static String bFT;
  private static String bFU;
  private static Set<a> bFV;
  public static final boolean lY = F(System.getProperty("java.vm.version"));
  
  private static boolean F(String paramString)
  {
    bool2 = false;
    bool1 = bool2;
    if (paramString != null)
    {
      localObject = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(paramString);
      bool1 = bool2;
      if (!((Matcher)localObject).matches()) {}
    }
    try
    {
      int i = Integer.parseInt(((Matcher)localObject).group(1));
      int j = Integer.parseInt(((Matcher)localObject).group(2));
      if (i <= 2)
      {
        bool1 = bool2;
        if (i == 2)
        {
          bool1 = bool2;
          if (j <= 0) {}
        }
      }
      else
      {
        bool1 = true;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        bool1 = bool2;
      }
    }
    Object localObject = new StringBuilder("VM with version ").append(paramString);
    if (bool1) {}
    for (paramString = " has multidex support";; paramString = " does not have multidex support")
    {
      x.i("MicroMsg.MultiDex", paramString);
      return bool1;
    }
  }
  
  private static void a(Context paramContext, String paramString, List<File> paramList)
  {
    paramContext = (PathClassLoader)paramContext.getClassLoader();
    x.i("MicroMsg.MultiDex", "before reflectPathClassLoader for debug: ClassLoader " + paramContext);
    Collections.sort(paramList, new Comparator() {});
    Object localObject1 = paramList.iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (File)((Iterator)localObject1).next();
      x.i("MicroMsg.MultiDex", "real reflectPathClassLoader dexname: " + ((File)localObject2).getName());
    }
    paramString = new File(paramString);
    if (!paramList.isEmpty()) {
      if (Build.VERSION.SDK_INT >= 19)
      {
        localObject1 = b(paramContext, "pathList").get(paramContext);
        localObject2 = new ArrayList();
        b(localObject1, "dexElements", b.a(localObject1, new ArrayList(paramList), paramString, (ArrayList)localObject2));
        if (((ArrayList)localObject2).size() > 0)
        {
          paramString = ((ArrayList)localObject2).iterator();
          if (paramString.hasNext())
          {
            paramContext = (IOException)paramString.next();
            x.w("MicroMsg.MultiDex", "Exception in makeDexElement", new Object[] { paramContext });
            throw paramContext;
          }
        }
      }
      else
      {
        localObject1 = b(paramContext, "pathList").get(paramContext);
        paramList = new ArrayList(paramList);
        b(localObject1, "dexElements", (Object[])b(localObject1, "makeDexElements", new Class[] { ArrayList.class, File.class }).invoke(localObject1, new Object[] { paramList, paramString }));
      }
    }
    x.i("MicroMsg.MultiDex", "after reflectPathClassloader for debug: ClassLoader " + paramContext);
  }
  
  /* Error */
  private static boolean a(a parama)
  {
    // Byte code:
    //   0: new 76	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 215	java/lang/StringBuilder:<init>	()V
    //   7: getstatic 217	com/tencent/mm/f/a:bFT	Ljava/lang/String;
    //   10: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   13: ldc -37
    //   15: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   18: aload_0
    //   19: getfield 222	com/tencent/mm/f/a$a:bFW	Ljava/lang/String;
    //   22: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: invokevirtual 93	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   28: astore 5
    //   30: new 139	java/io/File
    //   33: dup
    //   34: aload 5
    //   36: invokespecial 145	java/io/File:<init>	(Ljava/lang/String;)V
    //   39: astore 4
    //   41: aload 4
    //   43: invokevirtual 225	java/io/File:isFile	()Z
    //   46: ifeq +11 -> 57
    //   49: aload 4
    //   51: invokevirtual 228	java/io/File:exists	()Z
    //   54: ifne +21 -> 75
    //   57: ldc 89
    //   59: ldc -26
    //   61: iconst_1
    //   62: anewarray 4	java/lang/Object
    //   65: dup
    //   66: iconst_0
    //   67: aload 5
    //   69: aastore
    //   70: invokestatic 232	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   73: iconst_0
    //   74: ireturn
    //   75: new 139	java/io/File
    //   78: dup
    //   79: getstatic 234	com/tencent/mm/f/a:bFU	Ljava/lang/String;
    //   82: invokespecial 145	java/io/File:<init>	(Ljava/lang/String;)V
    //   85: astore 9
    //   87: invokestatic 238	java/lang/System:currentTimeMillis	()J
    //   90: lstore_1
    //   91: aload 9
    //   93: invokestatic 244	com/tencent/tinker/loader/shareutil/ShareFileLockHelper:ag	(Ljava/io/File;)Lcom/tencent/tinker/loader/shareutil/ShareFileLockHelper;
    //   96: astore 4
    //   98: ldc 89
    //   100: ldc -10
    //   102: iconst_2
    //   103: anewarray 4	java/lang/Object
    //   106: dup
    //   107: iconst_0
    //   108: lload_1
    //   109: invokestatic 252	com/tencent/mm/sdk/platformtools/bi:bH	(J)J
    //   112: invokestatic 258	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   115: aastore
    //   116: dup
    //   117: iconst_1
    //   118: getstatic 234	com/tencent/mm/f/a:bFU	Ljava/lang/String;
    //   121: aastore
    //   122: invokestatic 232	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   125: new 260	java/io/FileInputStream
    //   128: dup
    //   129: aload 5
    //   131: invokespecial 261	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   134: astore 8
    //   136: aload 8
    //   138: astore 6
    //   140: aload 4
    //   142: astore 5
    //   144: aload 8
    //   146: ldc_w 262
    //   149: invokestatic 267	com/tencent/mm/a/g:b	(Ljava/io/InputStream;I)Ljava/lang/String;
    //   152: astore 7
    //   154: aload 7
    //   156: ifnull +61 -> 217
    //   159: aload 8
    //   161: astore 6
    //   163: aload 4
    //   165: astore 5
    //   167: aload 7
    //   169: aload_0
    //   170: getfield 270	com/tencent/mm/f/a$a:bFX	Ljava/lang/String;
    //   173: invokevirtual 275	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   176: istore_3
    //   177: iload_3
    //   178: ifeq +39 -> 217
    //   181: aload 4
    //   183: invokevirtual 278	com/tencent/tinker/loader/shareutil/ShareFileLockHelper:close	()V
    //   186: aload 8
    //   188: invokestatic 281	com/tencent/mm/f/a:b	(Ljava/io/Closeable;)V
    //   191: iconst_1
    //   192: ireturn
    //   193: astore_0
    //   194: ldc 89
    //   196: ldc_w 283
    //   199: iconst_1
    //   200: anewarray 4	java/lang/Object
    //   203: dup
    //   204: iconst_0
    //   205: aload 9
    //   207: invokevirtual 286	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   210: aastore
    //   211: invokestatic 289	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   214: goto -28 -> 186
    //   217: aload 4
    //   219: invokevirtual 278	com/tencent/tinker/loader/shareutil/ShareFileLockHelper:close	()V
    //   222: aload 8
    //   224: invokestatic 281	com/tencent/mm/f/a:b	(Ljava/io/Closeable;)V
    //   227: iconst_0
    //   228: ireturn
    //   229: astore_0
    //   230: ldc 89
    //   232: ldc_w 283
    //   235: iconst_1
    //   236: anewarray 4	java/lang/Object
    //   239: dup
    //   240: iconst_0
    //   241: aload 9
    //   243: invokevirtual 286	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   246: aastore
    //   247: invokestatic 289	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   250: goto -28 -> 222
    //   253: astore 7
    //   255: aconst_null
    //   256: astore_0
    //   257: aconst_null
    //   258: astore 4
    //   260: aload_0
    //   261: astore 6
    //   263: aload 4
    //   265: astore 5
    //   267: ldc 89
    //   269: aload 7
    //   271: ldc_w 291
    //   274: iconst_0
    //   275: anewarray 4	java/lang/Object
    //   278: invokestatic 295	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   281: aload_0
    //   282: astore 6
    //   284: aload 4
    //   286: astore 5
    //   288: ldc 89
    //   290: ldc_w 297
    //   293: iconst_1
    //   294: anewarray 4	java/lang/Object
    //   297: dup
    //   298: iconst_0
    //   299: aload 9
    //   301: invokevirtual 286	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   304: aastore
    //   305: invokestatic 289	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   308: aload 4
    //   310: ifnull +8 -> 318
    //   313: aload 4
    //   315: invokevirtual 278	com/tencent/tinker/loader/shareutil/ShareFileLockHelper:close	()V
    //   318: aload_0
    //   319: invokestatic 281	com/tencent/mm/f/a:b	(Ljava/io/Closeable;)V
    //   322: goto -95 -> 227
    //   325: astore 4
    //   327: ldc 89
    //   329: ldc_w 283
    //   332: iconst_1
    //   333: anewarray 4	java/lang/Object
    //   336: dup
    //   337: iconst_0
    //   338: aload 9
    //   340: invokevirtual 286	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   343: aastore
    //   344: invokestatic 289	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   347: goto -29 -> 318
    //   350: astore_0
    //   351: aconst_null
    //   352: astore 6
    //   354: aconst_null
    //   355: astore 4
    //   357: aload 4
    //   359: ifnull +8 -> 367
    //   362: aload 4
    //   364: invokevirtual 278	com/tencent/tinker/loader/shareutil/ShareFileLockHelper:close	()V
    //   367: aload 6
    //   369: invokestatic 281	com/tencent/mm/f/a:b	(Ljava/io/Closeable;)V
    //   372: aload_0
    //   373: athrow
    //   374: astore 4
    //   376: ldc 89
    //   378: ldc_w 283
    //   381: iconst_1
    //   382: anewarray 4	java/lang/Object
    //   385: dup
    //   386: iconst_0
    //   387: aload 9
    //   389: invokevirtual 286	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   392: aastore
    //   393: invokestatic 289	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   396: goto -29 -> 367
    //   399: astore_0
    //   400: aconst_null
    //   401: astore 6
    //   403: goto -46 -> 357
    //   406: astore_0
    //   407: aload 5
    //   409: astore 4
    //   411: goto -54 -> 357
    //   414: astore 7
    //   416: aconst_null
    //   417: astore_0
    //   418: goto -158 -> 260
    //   421: astore 7
    //   423: aload 8
    //   425: astore_0
    //   426: goto -166 -> 260
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	429	0	parama	a
    //   90	19	1	l	long
    //   176	2	3	bool	boolean
    //   39	275	4	localObject1	Object
    //   325	1	4	localException1	Exception
    //   355	8	4	localObject2	Object
    //   374	1	4	localException2	Exception
    //   409	1	4	localObject3	Object
    //   28	380	5	localObject4	Object
    //   138	264	6	localObject5	Object
    //   152	16	7	str	String
    //   253	17	7	localIOException1	IOException
    //   414	1	7	localIOException2	IOException
    //   421	1	7	localIOException3	IOException
    //   134	290	8	localFileInputStream	java.io.FileInputStream
    //   85	303	9	localFile	File
    // Exception table:
    //   from	to	target	type
    //   181	186	193	java/lang/Exception
    //   217	222	229	java/lang/Exception
    //   87	98	253	java/io/IOException
    //   313	318	325	java/lang/Exception
    //   87	98	350	finally
    //   362	367	374	java/lang/Exception
    //   98	136	399	finally
    //   144	154	406	finally
    //   167	177	406	finally
    //   267	281	406	finally
    //   288	308	406	finally
    //   98	136	414	java/io/IOException
    //   144	154	421	java/io/IOException
    //   167	177	421	java/io/IOException
  }
  
  /* Error */
  private static boolean a(ZipFile paramZipFile, a parama)
  {
    // Byte code:
    //   0: ldc 89
    //   2: ldc_w 300
    //   5: invokestatic 99	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   8: new 139	java/io/File
    //   11: dup
    //   12: getstatic 234	com/tencent/mm/f/a:bFU	Ljava/lang/String;
    //   15: invokespecial 145	java/io/File:<init>	(Ljava/lang/String;)V
    //   18: astore 9
    //   20: new 76	java/lang/StringBuilder
    //   23: dup
    //   24: invokespecial 215	java/lang/StringBuilder:<init>	()V
    //   27: getstatic 217	com/tencent/mm/f/a:bFT	Ljava/lang/String;
    //   30: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: ldc -37
    //   35: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: aload_1
    //   39: getfield 222	com/tencent/mm/f/a$a:bFW	Ljava/lang/String;
    //   42: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: invokevirtual 93	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   48: astore 10
    //   50: aconst_null
    //   51: astore 8
    //   53: aconst_null
    //   54: astore 7
    //   56: aload 7
    //   58: astore 6
    //   60: aload 8
    //   62: astore 5
    //   64: invokestatic 238	java/lang/System:currentTimeMillis	()J
    //   67: lstore_3
    //   68: aload 7
    //   70: astore 6
    //   72: aload 8
    //   74: astore 5
    //   76: aload 9
    //   78: invokestatic 244	com/tencent/tinker/loader/shareutil/ShareFileLockHelper:ag	(Ljava/io/File;)Lcom/tencent/tinker/loader/shareutil/ShareFileLockHelper;
    //   81: astore 7
    //   83: aload 7
    //   85: astore 6
    //   87: aload 7
    //   89: astore 5
    //   91: ldc 89
    //   93: ldc_w 302
    //   96: iconst_2
    //   97: anewarray 4	java/lang/Object
    //   100: dup
    //   101: iconst_0
    //   102: lload_3
    //   103: invokestatic 252	com/tencent/mm/sdk/platformtools/bi:bH	(J)J
    //   106: invokestatic 258	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   109: aastore
    //   110: dup
    //   111: iconst_1
    //   112: getstatic 234	com/tencent/mm/f/a:bFU	Ljava/lang/String;
    //   115: aastore
    //   116: invokestatic 232	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   119: aload 7
    //   121: astore 6
    //   123: aload 7
    //   125: astore 5
    //   127: aload_0
    //   128: aload_0
    //   129: aload_1
    //   130: getfield 222	com/tencent/mm/f/a$a:bFW	Ljava/lang/String;
    //   133: invokevirtual 308	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   136: invokevirtual 312	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   139: astore_0
    //   140: aload 7
    //   142: astore 6
    //   144: aload 7
    //   146: astore 5
    //   148: new 314	java/io/FileOutputStream
    //   151: dup
    //   152: aload 10
    //   154: invokespecial 315	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   157: astore_1
    //   158: new 317	java/io/BufferedOutputStream
    //   161: dup
    //   162: aload_1
    //   163: invokespecial 320	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   166: astore_1
    //   167: sipush 16384
    //   170: newarray <illegal type>
    //   172: astore 5
    //   174: aload_0
    //   175: aload 5
    //   177: invokevirtual 326	java/io/InputStream:read	([B)I
    //   180: istore_2
    //   181: iload_2
    //   182: iconst_m1
    //   183: if_icmpeq +21 -> 204
    //   186: aload_1
    //   187: aload 5
    //   189: iconst_0
    //   190: iload_2
    //   191: invokevirtual 330	java/io/BufferedOutputStream:write	([BII)V
    //   194: aload_0
    //   195: aload 5
    //   197: invokevirtual 326	java/io/InputStream:read	([B)I
    //   200: istore_2
    //   201: goto -20 -> 181
    //   204: aload_1
    //   205: invokevirtual 331	java/io/BufferedOutputStream:close	()V
    //   208: aload 7
    //   210: astore 6
    //   212: aload 7
    //   214: astore 5
    //   216: aload_0
    //   217: invokestatic 281	com/tencent/mm/f/a:b	(Ljava/io/Closeable;)V
    //   220: aload 7
    //   222: astore 6
    //   224: aload 7
    //   226: astore 5
    //   228: ldc 89
    //   230: ldc_w 333
    //   233: iconst_1
    //   234: anewarray 4	java/lang/Object
    //   237: dup
    //   238: iconst_0
    //   239: getstatic 234	com/tencent/mm/f/a:bFU	Ljava/lang/String;
    //   242: aastore
    //   243: invokestatic 232	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   246: aload 7
    //   248: invokevirtual 278	com/tencent/tinker/loader/shareutil/ShareFileLockHelper:close	()V
    //   251: iconst_1
    //   252: ireturn
    //   253: astore 5
    //   255: aload_1
    //   256: invokevirtual 331	java/io/BufferedOutputStream:close	()V
    //   259: aload 5
    //   261: athrow
    //   262: astore_1
    //   263: aload 7
    //   265: astore 6
    //   267: aload 7
    //   269: astore 5
    //   271: aload_0
    //   272: invokestatic 281	com/tencent/mm/f/a:b	(Ljava/io/Closeable;)V
    //   275: aload 7
    //   277: astore 6
    //   279: aload 7
    //   281: astore 5
    //   283: aload_1
    //   284: athrow
    //   285: astore_0
    //   286: aload 6
    //   288: astore 5
    //   290: ldc 89
    //   292: aload_0
    //   293: ldc_w 291
    //   296: iconst_0
    //   297: anewarray 4	java/lang/Object
    //   300: invokestatic 295	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   303: aload 6
    //   305: astore 5
    //   307: ldc 89
    //   309: ldc_w 335
    //   312: iconst_1
    //   313: anewarray 4	java/lang/Object
    //   316: dup
    //   317: iconst_0
    //   318: aload 9
    //   320: invokevirtual 286	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   323: aastore
    //   324: invokestatic 289	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   327: aload 6
    //   329: ifnull +8 -> 337
    //   332: aload 6
    //   334: invokevirtual 278	com/tencent/tinker/loader/shareutil/ShareFileLockHelper:close	()V
    //   337: iconst_0
    //   338: ireturn
    //   339: astore_0
    //   340: ldc 89
    //   342: aload_0
    //   343: ldc_w 291
    //   346: iconst_0
    //   347: anewarray 4	java/lang/Object
    //   350: invokestatic 295	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   353: iconst_1
    //   354: ireturn
    //   355: astore_0
    //   356: ldc 89
    //   358: aload_0
    //   359: ldc_w 291
    //   362: iconst_0
    //   363: anewarray 4	java/lang/Object
    //   366: invokestatic 295	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   369: goto -32 -> 337
    //   372: astore_0
    //   373: aload 5
    //   375: ifnull +8 -> 383
    //   378: aload 5
    //   380: invokevirtual 278	com/tencent/tinker/loader/shareutil/ShareFileLockHelper:close	()V
    //   383: aload_0
    //   384: athrow
    //   385: astore_1
    //   386: ldc 89
    //   388: aload_1
    //   389: ldc_w 291
    //   392: iconst_0
    //   393: anewarray 4	java/lang/Object
    //   396: invokestatic 295	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   399: goto -16 -> 383
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	402	0	paramZipFile	ZipFile
    //   0	402	1	parama	a
    //   180	21	2	i	int
    //   67	36	3	l	long
    //   62	165	5	localObject1	Object
    //   253	7	5	localObject2	Object
    //   269	110	5	localShareFileLockHelper1	com.tencent.tinker.loader.shareutil.ShareFileLockHelper
    //   58	275	6	localShareFileLockHelper2	com.tencent.tinker.loader.shareutil.ShareFileLockHelper
    //   54	226	7	localShareFileLockHelper3	com.tencent.tinker.loader.shareutil.ShareFileLockHelper
    //   51	22	8	localObject3	Object
    //   18	301	9	localFile	File
    //   48	105	10	str	String
    // Exception table:
    //   from	to	target	type
    //   167	181	253	finally
    //   186	201	253	finally
    //   158	167	262	finally
    //   204	208	262	finally
    //   255	262	262	finally
    //   64	68	285	java/io/IOException
    //   76	83	285	java/io/IOException
    //   91	119	285	java/io/IOException
    //   127	140	285	java/io/IOException
    //   148	158	285	java/io/IOException
    //   216	220	285	java/io/IOException
    //   228	246	285	java/io/IOException
    //   271	275	285	java/io/IOException
    //   283	285	285	java/io/IOException
    //   246	251	339	java/lang/Exception
    //   332	337	355	java/lang/Exception
    //   64	68	372	finally
    //   76	83	372	finally
    //   91	119	372	finally
    //   127	140	372	finally
    //   148	158	372	finally
    //   216	220	372	finally
    //   228	246	372	finally
    //   271	275	372	finally
    //   283	285	372	finally
    //   290	303	372	finally
    //   307	327	372	finally
    //   378	383	385	java/lang/Exception
  }
  
  public static boolean aZ(Context paramContext)
  {
    int j = -1;
    if (lY)
    {
      x.i("MultiDex", "if need dexopt: VM has multidex support, MultiDex support library is disabled.");
      return false;
    }
    if (bFR)
    {
      x.i("MultiDex", "if need dexopt: has inited.");
      return false;
    }
    long l = System.currentTimeMillis();
    bi(paramContext);
    if ((bFV == null) || (bFV.size() <= 0)) {
      return true;
    }
    bFS = paramContext.getDir("cache", 0).getAbsolutePath();
    bFT = paramContext.getDir("dex", 0).getAbsolutePath();
    bFU = paramContext.getDir("cache", 0).getParentFile().getAbsolutePath() + "/dex.lock";
    Object localObject = new File(bFT);
    if (((!((File)localObject).exists()) || (!((File)localObject).isDirectory())) && (!((File)localObject).mkdirs()))
    {
      x.f("MicroMsg.MultiDex", "if need dexopt: extractZipEntryToFile: create target dex directory failed");
      return true;
    }
    int k = bFV.size();
    File localFile = new File(bFS);
    if (((!localFile.exists()) || (!localFile.isDirectory())) && (!localFile.mkdirs()))
    {
      x.f("MicroMsg.MultiDex", "if need dexopt: extractZipEntryToFile: create target dexopt directory failed");
      return true;
    }
    x.i("MicroMsg.MultiDex", "if need dexopt: install Build.VERSION: %d, tryLoadDexFileCount: %d, installDir: %d, optDir: %d", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(k), Integer.valueOf(((File)localObject).list().length), Integer.valueOf(localFile.list().length) });
    if ((((File)localObject).list() == null) || (((File)localObject).list().length < k) || (localFile.list() == null) || (localFile.list().length < k))
    {
      int i;
      if (((File)localObject).list() == null)
      {
        i = -1;
        if (localFile.list() != null) {
          break label388;
        }
      }
      for (;;)
      {
        x.i("MicroMsg.MultiDex", "if need dexopt: dex file count not equal, install path: %s vs %s, opt path: %s vs %s", new Object[] { Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(j), Integer.valueOf(k) });
        return true;
        i = ((File)localObject).list().length;
        break;
        label388:
        j = localFile.list().length;
      }
    }
    if (paramContext.getApplicationInfo() == null) {
      return false;
    }
    paramContext = bFV.iterator();
    for (;;)
    {
      if (!paramContext.hasNext()) {
        break label548;
      }
      localObject = (a)paramContext.next();
      try
      {
        x.i("MicroMsg.MultiDex", "if need dexopt: prepare dex to load, file: %s, md5: %s, loadClass: %s", new Object[] { ((a)localObject).bFW, ((a)localObject).bFX, ((a)localObject).bFY });
        if (a((a)localObject)) {
          x.i("MicroMsg.MultiDex", "if need dexopt: verify dex for check md5: targetFilePath: [%s] time: %d", new Object[] { ((a)localObject).bFW, Long.valueOf(bi.bH(l)) });
        }
      }
      finally {}
    }
    x.e("MicroMsg.MultiDex", "if need dexopt: targetDexFile md5 mismatch or not exists: %s", new Object[] { ((a)localObject).bFW });
    return true;
    label548:
    return false;
  }
  
  private static Field b(Object paramObject, String paramString)
  {
    Class localClass = paramObject.getClass();
    while (localClass != null) {
      try
      {
        Field localField = localClass.getDeclaredField(paramString);
        if (!localField.isAccessible()) {
          localField.setAccessible(true);
        }
        return localField;
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        localClass = localClass.getSuperclass();
      }
    }
    throw new NoSuchFieldException("Field " + paramString + " not found in " + paramObject.getClass());
  }
  
  private static Method b(Object paramObject, String paramString, Class<?>... paramVarArgs)
  {
    Class localClass = paramObject.getClass();
    while (localClass != null) {
      try
      {
        Method localMethod = localClass.getDeclaredMethod(paramString, paramVarArgs);
        if (!localMethod.isAccessible()) {
          localMethod.setAccessible(true);
        }
        return localMethod;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        localClass = localClass.getSuperclass();
      }
    }
    throw new NoSuchMethodException("Method " + paramString + " with parameters " + Arrays.asList(paramVarArgs) + " not found in " + paramObject.getClass());
  }
  
  private static void b(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException paramCloseable)
    {
      x.w("MicroMsg.MultiDex", "Failed to close resource", new Object[] { paramCloseable });
    }
  }
  
  private static boolean b(Context paramContext, String paramString, boolean paramBoolean)
  {
    boolean bool = false;
    try
    {
      paramContext = Class.forName(paramString, false, paramContext.getClassLoader());
      if (paramContext == null) {
        break label38;
      }
      bool = true;
    }
    catch (ClassNotFoundException paramContext)
    {
      label38:
      do
      {
        if (paramBoolean) {
          x.printErrStackTrace("MicroMsg.MultiDex", paramContext, "Failed to load a dex.", new Object[0]);
        }
      } while (!paramBoolean);
      x.w("MicroMsg.MultiDex", "checkDexLoaded fail.... " + paramString);
    }
    return bool;
    return false;
  }
  
  public static void ba(Context paramContext)
  {
    long l2 = 0L;
    long l1 = l2;
    try
    {
      localObject = new StatFs(Environment.getDataDirectory().getPath());
      l1 = l2;
      l3 = ((StatFs)localObject).getAvailableBlocks();
      l1 = l2;
      l2 = ((StatFs)localObject).getBlockSize() * l3;
      l1 = l2;
      l3 = ((StatFs)localObject).getBlockCount();
      l1 = l2;
      int i = ((StatFs)localObject).getBlockSize();
      l3 = i * l3;
      l1 = l2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject;
        long l3 = 0L;
        x.e("MicroMsg.MultiDex", "get db spare space error");
      }
    }
    x.i("MicroMsg.MultiDex", "ifRomSpaceEnough available:%d all:%d", new Object[] { Long.valueOf(l1), Long.valueOf(l3) });
    if ((l3 != 0L) && (l1 < 31457280L))
    {
      localObject = bi.an(paramContext, Process.myPid());
      x.i("MicroMsg.MultiDex", "space not enough process:%s, available:%d, RESTRICTION_SPACE_SIZE: %d", new Object[] { localObject, Long.valueOf(l1), Long.valueOf(31457280L) });
      if ((!((String)localObject).equals("")) && (!((String)localObject).endsWith(":nospace")))
      {
        localObject = new Intent();
        ((Intent)localObject).setClassName(paramContext, "com.tencent.mm.ui.NoRomSpaceDexUI");
        ((Intent)localObject).setFlags(268435456);
        paramContext.startActivity((Intent)localObject);
        Process.killProcess(Process.myPid());
      }
    }
  }
  
  public static boolean bh(Context paramContext)
  {
    boolean bool;
    try
    {
      x.i("MicroMsg.MultiDex", "install multidex hasinit: %b, force: %b", new Object[] { Boolean.valueOf(bFR), Boolean.valueOf(true) });
      if (lY)
      {
        x.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
        bool = true;
      }
      for (;;)
      {
        return bool;
        if (bFR)
        {
          bool = true;
        }
        else
        {
          if (paramContext.getClassLoader() != null) {
            x.i("MicroMsg.MultiDex", "classloader: " + paramContext.getClassLoader().toString());
          }
          long l;
          for (;;)
          {
            l = System.currentTimeMillis();
            bi(paramContext);
            if (bFV == null) {
              break label1158;
            }
            if (bFV.size() > 0) {
              break;
            }
            break label1158;
            x.e("MicroMsg.MultiDex", "classloader is null");
          }
          try
          {
            localApplicationInfo = paramContext.getApplicationInfo();
            if (localApplicationInfo == null)
            {
              bool = false;
            }
            else
            {
              bFS = paramContext.getDir("cache", 0).getAbsolutePath();
              bFT = paramContext.getDir("dex", 0).getAbsolutePath();
              bFU = paramContext.getDir("cache", 0).getParentFile().getAbsolutePath() + "/dex.lock";
              localObject1 = new File(bFT);
              if (((!((File)localObject1).exists()) || (!((File)localObject1).isDirectory())) && (!((File)localObject1).mkdirs()))
              {
                x.f("MicroMsg.MultiDex", "extractZipEntryToFile: create target dex directory failed");
                bool = false;
              }
              else
              {
                i = bFV.size();
                localFile = new File(bFS);
                if (((!localFile.exists()) || (!localFile.isDirectory())) && (!localFile.mkdirs()))
                {
                  x.f("MicroMsg.MultiDex", "extractZipEntryToFile: create target dexopt directory failed");
                  bool = false;
                }
                else
                {
                  x.i("MicroMsg.MultiDex", "install Build.VERSION: %d, tryLoadDexFileCount: %d, installDir: %d, optDir: %d", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(i), Integer.valueOf(((File)localObject1).list().length), Integer.valueOf(localFile.list().length) });
                  localArrayList = new ArrayList(bFV.size());
                  i = 0;
                  j = 0;
                  k = i;
                  if (j < 5)
                  {
                    k = i;
                    if (i == 0)
                    {
                      localArrayList.clear();
                      localObject1 = bFV.iterator();
                      for (;;)
                      {
                        if (((Iterator)localObject1).hasNext())
                        {
                          localObject3 = (a)((Iterator)localObject1).next();
                          x.i("MicroMsg.MultiDex", "prepare dex to load, file: %s, md5: %s, loadClass: %s", new Object[] { ((a)localObject3).bFW, ((a)localObject3).bFX, ((a)localObject3).bFY });
                          if (a((a)localObject3))
                          {
                            x.i("MicroMsg.MultiDex", "verify dex for check md5: targetFilePath: [%s] time: %d", new Object[] { ((a)localObject3).bFW, Long.valueOf(bi.bH(l)) });
                            if (b(paramContext, ((a)localObject3).bFY, false))
                            {
                              x.i("MicroMsg.MultiDex", "dex has been loaded, skip. targetFilePath: [%s]", new Object[] { ((a)localObject3).bFW });
                              continue;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          catch (Throwable localThrowable)
          {
            x.e("MicroMsg.MultiDex", "Multidex installation failure", new Object[] { localThrowable });
            x.printErrStackTrace("MicroMsg.MultiDex", localThrowable, "Multidex installation failure", new Object[0]);
            ba(paramContext);
            throw new RuntimeException("Multi dex installation failed (" + localThrowable.getMessage() + ").", localThrowable);
          }
        }
      }
    }
    finally {}
    for (;;)
    {
      ApplicationInfo localApplicationInfo;
      Object localObject1;
      File localFile;
      ArrayList localArrayList;
      int j;
      int k;
      Object localObject3;
      tmp658_655[0] = ((a)localObject3).bFW;
      x.w("MicroMsg.MultiDex", "dex [%s] is not load, it should be reload in further steps.", tmp658_655);
      for (;;)
      {
        localArrayList.add(new File(bFT + "/" + ((a)localObject3).bFW));
        break;
        x.e("MicroMsg.MultiDex", "targetDexFile md5 mismatch or not exists: %s, force: %b", new Object[] { ((a)localObject3).bFW, Boolean.valueOf(true) });
        ZipFile localZipFile = new ZipFile(localApplicationInfo.sourceDir);
        bool = a(localZipFile, (a)localObject3);
        try
        {
          localZipFile.close();
          if (!bool) {
            throw new Exception("overwriteLocalSecondaryDexFromApk fail");
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            x.w("MicroMsg.MultiDex", "base apk file close quietly failed");
          }
        }
      }
      if (localArrayList.isEmpty())
      {
        x.i("MicroMsg.MultiDex", "Nothing needs to be installed.");
        k = 1;
        if (k == 0) {
          throw new RuntimeException("Some dex is not installed successfully after 5 times retry !!");
        }
      }
      else
      {
        a(paramContext, bFS, localArrayList);
        Object localObject2 = bFV.iterator();
        do
        {
          if (!((Iterator)localObject2).hasNext()) {
            break;
          }
          localObject3 = (a)((Iterator)localObject2).next();
        } while (b(paramContext, ((a)localObject3).bFY, true));
        x.w("MicroMsg.MultiDex", "Failed to load dex [%s] in %d round, retry.", new Object[] { ((a)localObject3).bFW, Integer.valueOf(j + 1) });
        localObject3 = new File(bFT + "/" + ((a)localObject3).bFW).getName();
        localObject2 = localObject3;
        if (!((String)localObject3).endsWith(".dex"))
        {
          i = ((String)localObject3).lastIndexOf(".");
          if (i >= 0) {
            break label1094;
          }
        }
        for (localObject2 = (String)localObject3 + ".dex";; localObject2 = ((StringBuilder)localObject2).toString())
        {
          localObject2 = new File(localFile, (String)localObject2);
          if (!((File)localObject2).exists()) {
            break;
          }
          x.w("MicroMsg.MultiDex", "Remove perhaps broken odex file: " + ((File)localObject2).getAbsolutePath());
          if (((File)localObject2).delete()) {
            break;
          }
          x.w("MicroMsg.MultiDex", "Failed to remove perhaps broken odex file: " + ((File)localObject2).getAbsolutePath());
          break;
          label1094:
          localObject2 = new StringBuilder(i + 4);
          ((StringBuilder)localObject2).append((CharSequence)localObject3, 0, i);
          ((StringBuilder)localObject2).append(".dex");
        }
      }
      bFR = true;
      x.i("MicroMsg.MultiDex", "install done");
      bool = true;
      break;
      int i = 1;
      break label1166;
      label1158:
      bool = false;
      break;
      i = 0;
      label1166:
      j += 1;
    }
  }
  
  private static int bi(Context paramContext)
  {
    if (bFV != null)
    {
      x.w("MicroMsg.MultiDex", "preloaded dex files not empty, skipped preloading");
      return 1;
    }
    try
    {
      paramContext = bi.convertStreamToString(paramContext.getAssets().open("secondary-program-dex-jars/metadata.txt"));
      if (paramContext == null) {
        break label233;
      }
      if (paramContext.length() > 0) {
        break label51;
      }
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        HashSet localHashSet;
        String[] arrayOfString;
        int j;
        int i;
        x.e("MicroMsg.MultiDex", "load preload libraries failed");
        x.printErrStackTrace("MicroMsg.MultiDex", paramContext, "", new Object[0]);
        break;
        paramContext = null;
      }
    }
    bFV = paramContext;
    break label238;
    label51:
    localHashSet = new HashSet();
    arrayOfString = paramContext.split("\n");
    j = arrayOfString.length;
    i = 0;
    for (;;)
    {
      paramContext = localHashSet;
      if (i >= j) {
        break;
      }
      paramContext = arrayOfString[i];
      if ((paramContext != null) && (paramContext.length() > 0))
      {
        Object localObject = paramContext.split(" ", 3);
        if ((localObject != null) && (localObject.length >= 3))
        {
          paramContext = localObject[0].trim();
          String str = localObject[1].trim();
          localObject = localObject[2].trim();
          x.i("MicroMsg.MultiDex", "try parse dexname: %s, dexmd5:%s, classname:%s", new Object[] { paramContext, str, localObject });
          if ((paramContext != null) && (paramContext.length() > 0)) {
            localHashSet.add(new a(paramContext, str, (String)localObject));
          }
        }
      }
      i += 1;
    }
    label233:
    label238:
    return 0;
  }
  
  private static final class a
  {
    String bFW;
    String bFX;
    String bFY;
    
    public a(String paramString1, String paramString2, String paramString3)
    {
      this.bFW = paramString1;
      this.bFX = paramString2;
      this.bFY = paramString3;
    }
  }
  
  private static final class b
  {
    static Object[] a(Object paramObject, ArrayList<File> paramArrayList, File paramFile, ArrayList<IOException> paramArrayList1)
    {
      try
      {
        Method localMethod1 = a.c(paramObject, "makeDexElements", new Class[] { ArrayList.class, File.class, ArrayList.class });
        return (Object[])localMethod1.invoke(paramObject, new Object[] { paramArrayList, paramFile, paramArrayList1 });
      }
      catch (NoSuchMethodException localNoSuchMethodException1)
      {
        for (;;)
        {
          x.e("MicroMsg.MultiDex", "NoSuchMethodException: makeDexElements(ArrayList,File,ArrayList) failure");
          try
          {
            Method localMethod2 = a.c(paramObject, "makeDexElements", new Class[] { List.class, File.class, List.class });
          }
          catch (NoSuchMethodException localNoSuchMethodException2)
          {
            x.e("MicroMsg.MultiDex", "NoSuchMethodException: makeDexElements(List,File,List) failure");
            try
            {
              Method localMethod3 = a.c(paramObject, "makePathElements", new Class[] { List.class, File.class, List.class });
            }
            catch (NoSuchMethodException paramObject)
            {
              x.e("MicroMsg.MultiDex", "NoSuchMethodException: makePathElements(List,File,List) failure");
              throw ((Throwable)paramObject);
            }
          }
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */