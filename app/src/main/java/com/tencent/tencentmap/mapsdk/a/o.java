package com.tencent.tencentmap.mapsdk.a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.os.storage.StorageManager;
import com.tencent.map.lib.util.StringUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class o
{
  private static String a = "/Android/data/com.tencent.map/files";
  private static o d = null;
  private String b;
  private String c;
  private HashMap<String, Integer> e = new HashMap();
  private Context f;
  private String g;
  private String h;
  private String i;
  private String j;
  private String k;
  private String l;
  private String m;
  
  private o(Context paramContext)
  {
    if (paramContext == null) {
      throw new Error("context can not be null");
    }
    this.f = paramContext.getApplicationContext();
    a = "/Android/data/" + this.f.getPackageName() + "/files";
    c(paramContext);
    String str1 = b(paramContext);
    String str2 = jn.a(this.f);
    if (StringUtil.isEmpty(str2)) {}
    for (this.g = (str1 + "/tencentmapsdk/");; this.g = (str1 + "/tencentmapsdk/" + str2))
    {
      this.h = (this.g + "/data/v3/render/");
      this.i = (this.g + "/sat/");
      this.k = (paramContext.getFilesDir().getAbsolutePath() + "/tencentMapSdk/config/");
      this.m = (this.k + "temp/");
      this.l = (paramContext.getFilesDir().getAbsolutePath() + "/tencentMapSdk/assets/");
      this.j = (this.h + "closeRoadDatas/");
      a();
      return;
    }
  }
  
  public static o a(Context paramContext)
  {
    if (d == null) {
      d = new o(paramContext);
    }
    return d;
  }
  
  private boolean a(String paramString1, String paramString2)
  {
    boolean bool1 = false;
    if ((paramString1 == null) || (paramString2 == null)) {
      bool1 = true;
    }
    for (;;)
    {
      return bool1;
      boolean bool2 = paramString1.equals(paramString2);
      if (b(paramString1) == b(paramString2)) {}
      for (int n = 1; (bool2) || (n != 0); n = 0) {
        return true;
      }
    }
  }
  
  public static String b(Context paramContext)
  {
    int i3 = 0;
    boolean bool = Environment.getExternalStorageState().equals("mounted");
    int i1;
    int n;
    if (Build.VERSION.SDK_INT >= 23)
    {
      i1 = paramContext.checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", Process.myPid(), Process.myUid());
      n = paramContext.checkPermission("android.permission.READ_EXTERNAL_STORAGE", Process.myPid(), Process.myUid());
    }
    for (;;)
    {
      int i2 = i3;
      if (i1 == 0)
      {
        i2 = i3;
        if (n == 0) {
          i2 = 1;
        }
      }
      Object localObject;
      if ((!bool) || (i2 == 0)) {
        localObject = paramContext.getFilesDir().getPath();
      }
      do
      {
        String str;
        do
        {
          return (String)localObject;
          str = Environment.getExternalStorageDirectory().getPath();
          localObject = str;
        } while (f(str) >= 5L);
        paramContext = paramContext.getFilesDir().getPath();
        localObject = paramContext;
      } while (f(paramContext) >= 5L);
      return Environment.getExternalStorageDirectory().getPath();
      n = 0;
      i1 = 0;
    }
  }
  
  private void c(Context paramContext)
  {
    paramContext = paramContext.getSharedPreferences("default_storage_path", 0);
    String str = paramContext.getString("key_for_city_data_path", "");
    this.b = str;
    this.c = str;
    if (this.b.equals(""))
    {
      paramContext = paramContext.getString("key_for_storage_path", "");
      this.b = paramContext;
      this.c = paramContext;
    }
  }
  
  @SuppressLint({"NewApi"})
  public static long f(String paramString)
  {
    try
    {
      paramString = new StatFs(paramString);
      long l2;
      if (Build.VERSION.SDK_INT < 18) {
        l2 = paramString.getBlockSize();
      }
      for (long l1 = paramString.getAvailableBlocks();; l1 = paramString.getAvailableBlocksLong())
      {
        return l1 * l2 / 1024L / 1024L;
        l2 = paramString.getBlockSizeLong();
      }
      return 0L;
    }
    catch (Exception paramString) {}
  }
  
  private File g(String paramString)
  {
    for (;;)
    {
      try
      {
        switch (k())
        {
        case 4: 
        case 5: 
        case 8: 
          r();
          paramString = new File(this.b + paramString);
          if (paramString.exists()) {
            break label196;
          }
          if (paramString.mkdirs()) {
            break label222;
          }
          throw new FileNotFoundException();
        }
      }
      finally {}
      this.b = l();
      continue;
      Object localObject = n();
      if ((localObject != null) && (((List)localObject).size() > 0))
      {
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          if (!str.equals("")) {
            this.b = str;
          }
        }
      }
      if (this.b.equals(""))
      {
        this.b = l();
        continue;
        label196:
        if ((!paramString.canWrite()) || (!a(this.b))) {
          throw new FileNotFoundException();
        }
        label222:
        return paramString;
      }
    }
  }
  
  private String h(String paramString)
  {
    if (Build.VERSION.SDK_INT >= 9) {}
    for (;;)
    {
      try
      {
        paramString = i(paramString);
        String str = paramString;
        if (paramString == null) {
          str = "";
        }
        return str;
      }
      catch (Exception paramString) {}
      paramString = Environment.getExternalStorageState();
    }
  }
  
  private String i(String paramString)
  {
    StorageManager localStorageManager = (StorageManager)this.f.getSystemService("storage");
    return (String)localStorageManager.getClass().getMethod("getVolumeState", new Class[] { String.class }).invoke(localStorageManager, new Object[] { paramString });
  }
  
  private int k()
  {
    if (this.b.equals("")) {
      return 9;
    }
    String str3 = this.b;
    String str2 = h(str3);
    String str1 = str2;
    if (!str2.equals("mounted"))
    {
      str1 = str2;
      if (str3.contains(a)) {
        str1 = h(str3.replace(a, ""));
      }
    }
    if ((str1.equals("bad_removal")) || (str1.equals("removed"))) {
      return 6;
    }
    if ((str1.equals("unmounted")) || (str1.equals("shared"))) {
      return 5;
    }
    if (str1.equals("mounted"))
    {
      if (!d(this.b)) {
        return 8;
      }
      if (!new File(this.b + this.g).exists()) {
        return 7;
      }
      return 4;
    }
    return 9;
  }
  
  private String l()
  {
    String str1 = Environment.getExternalStorageDirectory().getPath();
    if ((d(str1)) && (a(str1))) {}
    do
    {
      return str1;
      String str2 = m();
      if (!str2.equals("")) {
        return str2;
      }
    } while (this.b.equals(""));
    return this.b;
  }
  
  private String m()
  {
    Object localObject1 = "";
    Object localObject3 = o();
    Object localObject2 = localObject1;
    if (localObject3 != null)
    {
      long l1 = 157286401L;
      localObject3 = ((List)localObject3).iterator();
      localObject2 = localObject1;
      if (((Iterator)localObject3).hasNext())
      {
        localObject2 = (String)((Iterator)localObject3).next();
        long l2 = e((String)localObject2);
        if ((l2 <= l1) || (!a((String)localObject2))) {
          break label92;
        }
        l1 = l2;
        localObject1 = localObject2;
      }
    }
    label92:
    for (;;)
    {
      break;
      return (String)localObject2;
    }
  }
  
  private List<String> n()
  {
    Object localObject1 = d();
    Object localObject2 = o();
    ((List)localObject2).add(0, localObject1);
    localObject1 = new ArrayList();
    localObject2 = ((List)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      String str = (String)((Iterator)localObject2).next();
      if ((!str.equals(this.b)) && (a(str)))
      {
        File localFile = new File(str + this.g);
        localFile.mkdirs();
        if ((localFile.exists()) && (localFile.canWrite())) {
          ((List)localObject1).add(str);
        }
      }
    }
    return (List<String>)localObject1;
  }
  
  @TargetApi(19)
  private List<String> o()
  {
    ArrayList localArrayList = new ArrayList();
    String str = Environment.getExternalStorageDirectory().getPath();
    if (Build.VERSION.SDK_INT >= 9) {}
    for (;;)
    {
      int n;
      try
      {
        Object localObject2 = p();
        if (localObject2 == null) {
          break label220;
        }
        if (Build.VERSION.SDK_INT < 19) {
          break label223;
        }
        File[] arrayOfFile = this.f.getExternalFilesDirs(null);
        Iterator localIterator = ((List)localObject2).iterator();
        if (!localIterator.hasNext()) {
          break label220;
        }
        Object localObject3 = (String)localIterator.next();
        if (a(str, (String)localObject3)) {
          continue;
        }
        localObject2 = localObject3;
        if (arrayOfFile != null)
        {
          int i1 = arrayOfFile.length;
          n = 0;
          localObject2 = localObject3;
          if (n < i1)
          {
            localObject2 = arrayOfFile[n];
            if ((localObject2 == null) || (((File)localObject2).getAbsolutePath() == null) || (!((File)localObject2).getAbsolutePath().contains((CharSequence)localObject3))) {
              break label213;
            }
            localObject2 = ((File)localObject2).getAbsolutePath();
          }
        }
        localObject3 = new File((String)localObject2);
        if ((!((File)localObject3).exists()) || (!((File)localObject3).isDirectory()) || (!((File)localObject3).canWrite())) {
          continue;
        }
        localArrayList.add(localObject2);
        continue;
        localObject2 = q();
      }
      catch (Exception localException) {}
      continue;
      label213:
      n += 1;
      continue;
      label220:
      return localArrayList;
      label223:
      Object localObject1 = null;
    }
  }
  
  private List<String> p()
  {
    StorageManager localStorageManager = (StorageManager)this.f.getSystemService("storage");
    return Arrays.asList((String[])localStorageManager.getClass().getMethod("getVolumePaths", new Class[0]).invoke(localStorageManager, new Object[0]));
  }
  
  private List<String> q()
  {
    ArrayList localArrayList = new ArrayList();
    String str1 = Environment.getExternalStorageDirectory().getPath();
    try
    {
      Scanner localScanner = new Scanner(new File("/proc/mounts"));
      while (localScanner.hasNext())
      {
        String str2 = localScanner.nextLine();
        if (str2.startsWith("/dev/block/vold/"))
        {
          str2 = str2.split(" ")[1];
          if (!str2.equals(str1)) {
            localArrayList.add(str2);
          }
        }
      }
      localScanner.close();
      return localArrayList;
    }
    catch (Exception localException) {}
    return localArrayList;
  }
  
  private void r()
  {
    if ((!this.b.equals("")) && (!this.b.equals(this.c)))
    {
      SharedPreferences.Editor localEditor = this.f.getSharedPreferences("default_storage_path", 0).edit();
      localEditor.putString("key_for_city_data_path", "");
      localEditor.putString("key_for_storage_path", this.b);
      localEditor.commit();
      this.c = this.b;
    }
  }
  
  public void a()
  {
    try
    {
      str1 = b();
      localObject2 = c();
      if ((!StringUtil.isEmpty(str1)) && (!str1.equals("")))
      {
        localObject3 = ((List)localObject2).iterator();
        boolean bool;
        do
        {
          if (!((Iterator)localObject3).hasNext()) {
            break;
          }
          bool = str1.equals((String)((Iterator)localObject3).next());
        } while (!bool);
      }
    }
    catch (Exception localException)
    {
      try
      {
        String str1;
        Object localObject2;
        Object localObject3;
        g("");
        return;
      }
      catch (FileNotFoundException localFileNotFoundException2)
      {
        return;
      }
    }
    finally
    {
      try
      {
        g("");
        throw ((Throwable)localObject1);
      }
      catch (FileNotFoundException localFileNotFoundException4)
      {
        for (;;) {}
      }
    }
    try
    {
      g("");
      return;
    }
    catch (FileNotFoundException localFileNotFoundException3)
    {
      return;
    }
    if ((StringUtil.isEmpty("")) || ("".equals("")))
    {
      localObject2 = ((List)localObject2).iterator();
      do
      {
        if (!((Iterator)localObject2).hasNext()) {
          break;
        }
        str1 = (String)((Iterator)localObject2).next();
        localObject3 = new File(str1 + this.g);
      } while ((!((File)localObject3).exists()) || (!((File)localObject3).isDirectory()));
    }
    for (;;)
    {
      c(str1);
      try
      {
        g("");
        return;
      }
      catch (FileNotFoundException localFileNotFoundException1)
      {
        return;
      }
      String str2 = "";
    }
  }
  
  /* Error */
  public boolean a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: ifnull +367 -> 370
    //   6: aload_1
    //   7: invokevirtual 423	java/lang/String:length	()I
    //   10: ifle +360 -> 370
    //   13: aload_0
    //   14: getfield 40	com/tencent/tencentmap/mapsdk/a/o:e	Ljava/util/HashMap;
    //   17: aload_1
    //   18: invokevirtual 426	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   21: ifeq +344 -> 365
    //   24: aload_0
    //   25: getfield 40	com/tencent/tencentmap/mapsdk/a/o:e	Ljava/util/HashMap;
    //   28: aload_1
    //   29: invokevirtual 430	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   32: checkcast 432	java/lang/Integer
    //   35: invokevirtual 435	java/lang/Integer:intValue	()I
    //   38: istore_2
    //   39: iload_2
    //   40: tableswitch	default:+24->64, 1:+160->200, 2:+165->205
    //   64: new 107	java/io/File
    //   67: dup
    //   68: aload_1
    //   69: ldc_w 437
    //   72: invokespecial 440	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   75: astore 9
    //   77: aload 9
    //   79: invokevirtual 238	java/io/File:exists	()Z
    //   82: ifeq +9 -> 91
    //   85: aload 9
    //   87: invokevirtual 443	java/io/File:delete	()Z
    //   90: pop
    //   91: aload 9
    //   93: invokevirtual 446	java/io/File:createNewFile	()Z
    //   96: pop
    //   97: new 448	java/io/FileWriter
    //   100: dup
    //   101: aload 9
    //   103: iconst_1
    //   104: invokespecial 451	java/io/FileWriter:<init>	(Ljava/io/File;Z)V
    //   107: astore 6
    //   109: new 453	java/io/BufferedWriter
    //   112: dup
    //   113: aload 6
    //   115: invokespecial 456	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   118: astore 5
    //   120: aload 5
    //   122: astore 8
    //   124: aload 6
    //   126: astore 7
    //   128: aload 5
    //   130: ldc_w 458
    //   133: invokevirtual 461	java/io/BufferedWriter:write	(Ljava/lang/String;)V
    //   136: aload 5
    //   138: astore 8
    //   140: aload 6
    //   142: astore 7
    //   144: aload 5
    //   146: invokevirtual 464	java/io/BufferedWriter:flush	()V
    //   149: aload 5
    //   151: astore 8
    //   153: aload 6
    //   155: astore 7
    //   157: aload 9
    //   159: invokevirtual 443	java/io/File:delete	()Z
    //   162: pop
    //   163: aload 5
    //   165: astore 8
    //   167: aload 6
    //   169: astore 7
    //   171: aload_0
    //   172: getfield 40	com/tencent/tencentmap/mapsdk/a/o:e	Ljava/util/HashMap;
    //   175: aload_1
    //   176: iconst_2
    //   177: invokestatic 468	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   180: invokevirtual 472	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   183: pop
    //   184: aload 5
    //   186: invokevirtual 473	java/io/BufferedWriter:close	()V
    //   189: aload 6
    //   191: invokevirtual 474	java/io/FileWriter:close	()V
    //   194: iconst_1
    //   195: istore_3
    //   196: aload_0
    //   197: monitorexit
    //   198: iload_3
    //   199: ireturn
    //   200: iconst_0
    //   201: istore_3
    //   202: goto -6 -> 196
    //   205: iconst_1
    //   206: istore_3
    //   207: goto -11 -> 196
    //   210: astore_1
    //   211: iconst_1
    //   212: istore_3
    //   213: goto -17 -> 196
    //   216: astore 5
    //   218: aconst_null
    //   219: astore 5
    //   221: aconst_null
    //   222: astore 6
    //   224: iconst_0
    //   225: istore 4
    //   227: aload 5
    //   229: astore 8
    //   231: aload 6
    //   233: astore 7
    //   235: aload_0
    //   236: getfield 40	com/tencent/tencentmap/mapsdk/a/o:e	Ljava/util/HashMap;
    //   239: aload_1
    //   240: iconst_1
    //   241: invokestatic 468	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   244: invokevirtual 472	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   247: pop
    //   248: aload 5
    //   250: ifnull +8 -> 258
    //   253: aload 5
    //   255: invokevirtual 473	java/io/BufferedWriter:close	()V
    //   258: iload 4
    //   260: istore_3
    //   261: aload 6
    //   263: ifnull -67 -> 196
    //   266: aload 6
    //   268: invokevirtual 474	java/io/FileWriter:close	()V
    //   271: iload 4
    //   273: istore_3
    //   274: goto -78 -> 196
    //   277: astore_1
    //   278: iload 4
    //   280: istore_3
    //   281: goto -85 -> 196
    //   284: astore_1
    //   285: aconst_null
    //   286: astore 8
    //   288: aconst_null
    //   289: astore 6
    //   291: aload 8
    //   293: ifnull +8 -> 301
    //   296: aload 8
    //   298: invokevirtual 473	java/io/BufferedWriter:close	()V
    //   301: aload 6
    //   303: ifnull +8 -> 311
    //   306: aload 6
    //   308: invokevirtual 474	java/io/FileWriter:close	()V
    //   311: aload_1
    //   312: athrow
    //   313: astore_1
    //   314: aload_0
    //   315: monitorexit
    //   316: aload_1
    //   317: athrow
    //   318: astore 5
    //   320: goto -9 -> 311
    //   323: astore_1
    //   324: aconst_null
    //   325: astore 8
    //   327: goto -36 -> 291
    //   330: astore_1
    //   331: aload 7
    //   333: astore 6
    //   335: goto -44 -> 291
    //   338: astore 5
    //   340: aconst_null
    //   341: astore 5
    //   343: iconst_0
    //   344: istore 4
    //   346: goto -119 -> 227
    //   349: astore 7
    //   351: iconst_0
    //   352: istore 4
    //   354: goto -127 -> 227
    //   357: astore 7
    //   359: iconst_1
    //   360: istore 4
    //   362: goto -135 -> 227
    //   365: iconst_0
    //   366: istore_2
    //   367: goto -328 -> 39
    //   370: iconst_0
    //   371: istore_3
    //   372: goto -176 -> 196
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	375	0	this	o
    //   0	375	1	paramString	String
    //   38	329	2	n	int
    //   195	177	3	bool1	boolean
    //   225	136	4	bool2	boolean
    //   118	67	5	localBufferedWriter	java.io.BufferedWriter
    //   216	1	5	localException1	Exception
    //   219	35	5	localObject1	Object
    //   318	1	5	localIOException	java.io.IOException
    //   338	1	5	localException2	Exception
    //   341	1	5	localObject2	Object
    //   107	227	6	localObject3	Object
    //   126	206	7	localObject4	Object
    //   349	1	7	localException3	Exception
    //   357	1	7	localException4	Exception
    //   122	204	8	localObject5	Object
    //   75	83	9	localFile	File
    // Exception table:
    //   from	to	target	type
    //   184	194	210	java/io/IOException
    //   64	91	216	java/lang/Exception
    //   91	109	216	java/lang/Exception
    //   253	258	277	java/io/IOException
    //   266	271	277	java/io/IOException
    //   64	91	284	finally
    //   91	109	284	finally
    //   6	39	313	finally
    //   184	194	313	finally
    //   253	258	313	finally
    //   266	271	313	finally
    //   296	301	313	finally
    //   306	311	313	finally
    //   311	313	313	finally
    //   296	301	318	java/io/IOException
    //   306	311	318	java/io/IOException
    //   109	120	323	finally
    //   128	136	330	finally
    //   144	149	330	finally
    //   157	163	330	finally
    //   171	184	330	finally
    //   235	248	330	finally
    //   109	120	338	java/lang/Exception
    //   128	136	349	java/lang/Exception
    //   144	149	349	java/lang/Exception
    //   157	163	357	java/lang/Exception
    //   171	184	357	java/lang/Exception
  }
  
  public long b(String paramString)
  {
    try
    {
      paramString = new StatFs(paramString);
      long l1 = paramString.getBlockSize();
      int n = paramString.getBlockCount();
      return n * l1;
    }
    catch (Exception paramString) {}
    return 0L;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public List<String> c()
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject = d();
    if (!StringUtil.isEmpty((String)localObject)) {
      localArrayList.add(localObject);
    }
    localObject = o().iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      if ((!StringUtil.isEmpty(str)) && (a(str))) {
        localArrayList.add(str);
      }
    }
    return localArrayList;
  }
  
  public void c(String paramString)
  {
    this.b = paramString;
    r();
  }
  
  public String d()
  {
    String str = Environment.getExternalStorageState();
    if ((str == null) || (!str.equals("mounted"))) {
      return "";
    }
    return Environment.getExternalStorageDirectory().getPath();
  }
  
  public boolean d(String paramString)
  {
    return e(paramString) > 157286400L;
  }
  
  public long e(String paramString)
  {
    try
    {
      paramString = new StatFs(paramString);
      long l1 = paramString.getBlockSize();
      int n = paramString.getAvailableBlocks();
      return n * l1;
    }
    catch (Exception paramString) {}
    return 0L;
  }
  
  public String e()
  {
    return this.h;
  }
  
  public String f()
  {
    return this.i;
  }
  
  public String g()
  {
    return this.j;
  }
  
  public String h()
  {
    return this.k;
  }
  
  public String i()
  {
    return this.l;
  }
  
  public String j()
  {
    return this.m;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */