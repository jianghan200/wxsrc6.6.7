package com.tencent.mm.vfs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Process;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ad;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public final class a
{
  private static final String uRW;
  private static final FileSystem uRX = new RawFileSystem("/");
  private final Object mLock = new Object();
  private HashMap<String, FileSystem> uRY;
  private ArrayList<b> uRZ;
  private FileSystem uSa;
  private int uSb = 0;
  private c uSc;
  
  static
  {
    Context localContext = ad.getContext();
    uRW = localContext.getCacheDir().getAbsolutePath() + "/fs.bin";
  }
  
  private a()
  {
    abP(uRW);
    if (this.uRY == null) {
      this.uRY = new HashMap();
    }
    if (this.uRZ == null) {
      this.uRZ = new ArrayList();
    }
    if (this.uSc == null) {
      this.uSc = new c(null, null, this.uSb, (byte)0);
    }
    ad.getContext().registerReceiver(new BroadcastReceiver()new IntentFilter
    {
      public final void onReceive(Context paramAnonymousContext, final Intent paramAnonymousIntent)
      {
        e.post(new Runnable()
        {
          public final void run()
          {
            paramAnonymousIntent.setExtrasClassLoader(FileSystem.class.getClassLoader());
            a.a(a.this, paramAnonymousIntent.getExtras());
          }
        }, "Refresh VFS");
      }
    }, new IntentFilter("com.tencent.mm.REFRESH_VFS"), "com.tencent.mm.permission.MM_MESSAGE", null);
  }
  
  private static ArrayList<b> a(HashMap<String, FileSystem> paramHashMap, TreeMap<String, String> paramTreeMap)
  {
    ArrayList localArrayList = new ArrayList(paramTreeMap.size());
    Iterator localIterator = paramTreeMap.entrySet().iterator();
    paramTreeMap = null;
    if (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      String str = (String)((Map.Entry)localObject).getKey();
      localObject = (String)((Map.Entry)localObject).getValue();
      FileSystem localFileSystem = (FileSystem)paramHashMap.get(localObject);
      if (localFileSystem == null) {
        throw new IllegalArgumentException("FileSystem '" + (String)localObject + "' for mount point '" + str + "' not exist.");
      }
      if ((paramTreeMap != null) && (str.startsWith(paramTreeMap))) {}
      for (boolean bool = true;; bool = false)
      {
        localArrayList.add(new b(str, (String)localObject, localFileSystem, bool));
        paramTreeMap = str;
        break;
      }
    }
    return localArrayList;
  }
  
  private static String abN(String paramString)
  {
    paramString = new File(paramString);
    try
    {
      String str = paramString.getCanonicalPath();
      return str;
    }
    catch (IOException localIOException) {}
    return paramString.getAbsolutePath();
  }
  
  static Uri abO(String paramString)
  {
    Uri.Builder localBuilder = new Uri.Builder();
    int j = paramString.indexOf(':');
    if (j < 0) {
      localBuilder.path(paramString);
    }
    for (;;)
    {
      return localBuilder.build();
      localBuilder.scheme(paramString.substring(0, j));
      int k = paramString.length();
      if ((k > j + 2) && (paramString.charAt(j + 1) == '/') && (paramString.charAt(j + 2) == '/'))
      {
        int i = j + 3;
        while (i < k) {
          switch (paramString.charAt(i))
          {
          default: 
            i += 1;
          }
        }
        localBuilder.authority(paramString.substring(j + 3, i));
        if (i < k) {
          localBuilder.path(paramString.substring(i + 1));
        }
      }
      else
      {
        localBuilder.path(paramString.substring(j + 1));
      }
    }
  }
  
  /* Error */
  private void abP(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 7
    //   3: aconst_null
    //   4: astore 6
    //   6: iconst_0
    //   7: istore_2
    //   8: aload 7
    //   10: astore 5
    //   12: new 58	java/io/File
    //   15: dup
    //   16: aload_1
    //   17: invokespecial 292	java/io/File:<init>	(Ljava/lang/String;)V
    //   20: invokevirtual 337	java/io/File:length	()J
    //   23: lstore_3
    //   24: lload_3
    //   25: ldc2_w 338
    //   28: lcmp
    //   29: ifle +42 -> 71
    //   32: aload 7
    //   34: astore 5
    //   36: ldc_w 279
    //   39: new 47	java/lang/StringBuilder
    //   42: dup
    //   43: ldc_w 341
    //   46: invokespecial 174	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   49: lload_3
    //   50: invokevirtual 344	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   53: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   56: invokestatic 289	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   59: aconst_null
    //   60: astore_1
    //   61: aload 7
    //   63: astore 5
    //   65: aload_0
    //   66: aload_1
    //   67: invokespecial 197	com/tencent/mm/vfs/a:ak	(Landroid/os/Bundle;)V
    //   70: return
    //   71: lload_3
    //   72: lconst_0
    //   73: lcmp
    //   74: ifle +198 -> 272
    //   77: aload 7
    //   79: astore 5
    //   81: lload_3
    //   82: l2i
    //   83: newarray <illegal type>
    //   85: astore 8
    //   87: aload 7
    //   89: astore 5
    //   91: new 346	java/io/FileInputStream
    //   94: dup
    //   95: aload_1
    //   96: invokespecial 347	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   99: astore_1
    //   100: iload_2
    //   101: i2l
    //   102: lload_3
    //   103: lcmp
    //   104: ifge +21 -> 125
    //   107: iload_2
    //   108: aload_1
    //   109: aload 8
    //   111: iload_2
    //   112: aload 8
    //   114: arraylength
    //   115: iload_2
    //   116: isub
    //   117: invokevirtual 351	java/io/FileInputStream:read	([BII)I
    //   120: iadd
    //   121: istore_2
    //   122: goto -22 -> 100
    //   125: aload_1
    //   126: invokevirtual 352	java/io/FileInputStream:close	()V
    //   129: aload 7
    //   131: astore 5
    //   133: invokestatic 234	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   136: astore 9
    //   138: aload 7
    //   140: astore 5
    //   142: aload 9
    //   144: aload 8
    //   146: iconst_0
    //   147: iload_2
    //   148: invokevirtual 356	android/os/Parcel:unmarshall	([BII)V
    //   151: aload 7
    //   153: astore 5
    //   155: aload 9
    //   157: iconst_0
    //   158: invokevirtual 359	android/os/Parcel:setDataPosition	(I)V
    //   161: aload 7
    //   163: astore 5
    //   165: aload 9
    //   167: ldc -87
    //   169: invokevirtual 365	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
    //   172: invokevirtual 369	android/os/Parcel:readBundle	(Ljava/lang/ClassLoader;)Landroid/os/Bundle;
    //   175: astore_1
    //   176: aload 7
    //   178: astore 5
    //   180: aload 9
    //   182: invokevirtual 245	android/os/Parcel:recycle	()V
    //   185: goto -124 -> 61
    //   188: astore 5
    //   190: aload 6
    //   192: astore_1
    //   193: aload 5
    //   195: astore 6
    //   197: aload_1
    //   198: astore 5
    //   200: ldc_w 279
    //   203: new 47	java/lang/StringBuilder
    //   206: dup
    //   207: ldc_w 371
    //   210: invokespecial 174	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   213: aload 6
    //   215: invokevirtual 372	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   218: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   224: invokestatic 289	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   227: aload_1
    //   228: ifnull +49 -> 277
    //   231: aload_1
    //   232: invokevirtual 352	java/io/FileInputStream:close	()V
    //   235: return
    //   236: astore_1
    //   237: return
    //   238: astore_1
    //   239: aload 5
    //   241: ifnull +8 -> 249
    //   244: aload 5
    //   246: invokevirtual 352	java/io/FileInputStream:close	()V
    //   249: aload_1
    //   250: athrow
    //   251: astore 5
    //   253: goto -4 -> 249
    //   256: astore 6
    //   258: aload_1
    //   259: astore 5
    //   261: aload 6
    //   263: astore_1
    //   264: goto -25 -> 239
    //   267: astore 6
    //   269: goto -72 -> 197
    //   272: aconst_null
    //   273: astore_1
    //   274: goto -213 -> 61
    //   277: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	278	0	this	a
    //   0	278	1	paramString	String
    //   7	141	2	i	int
    //   23	80	3	l	long
    //   10	169	5	localObject1	Object
    //   188	6	5	localException1	Exception
    //   198	47	5	str1	String
    //   251	1	5	localIOException	IOException
    //   259	1	5	str2	String
    //   4	210	6	localObject2	Object
    //   256	6	6	localObject3	Object
    //   267	1	6	localException2	Exception
    //   1	176	7	localObject4	Object
    //   85	60	8	arrayOfByte	byte[]
    //   136	45	9	localParcel	android.os.Parcel
    // Exception table:
    //   from	to	target	type
    //   12	24	188	java/lang/Exception
    //   36	59	188	java/lang/Exception
    //   65	70	188	java/lang/Exception
    //   81	87	188	java/lang/Exception
    //   91	100	188	java/lang/Exception
    //   133	138	188	java/lang/Exception
    //   142	151	188	java/lang/Exception
    //   155	161	188	java/lang/Exception
    //   165	176	188	java/lang/Exception
    //   180	185	188	java/lang/Exception
    //   231	235	236	java/io/IOException
    //   12	24	238	finally
    //   36	59	238	finally
    //   65	70	238	finally
    //   81	87	238	finally
    //   91	100	238	finally
    //   133	138	238	finally
    //   142	151	238	finally
    //   155	161	238	finally
    //   165	176	238	finally
    //   180	185	238	finally
    //   200	227	238	finally
    //   244	249	251	java/io/IOException
    //   107	122	256	finally
    //   125	129	256	finally
    //   107	122	267	java/lang/Exception
    //   125	129	267	java/lang/Exception
  }
  
  private void ak(Bundle arg1)
  {
    Bundle localBundle = ???;
    if (??? == null) {
      localBundle = new Bundle();
    }
    if (localBundle.getInt("pid") == Process.myPid()) {}
    HashMap localHashMap;
    Object localObject4;
    synchronized (this.mLock)
    {
      if (this.uSa != null) {
        return;
      }
      ??? = localBundle.getBundle("fs");
      localHashMap = new HashMap();
      if (??? != null)
      {
        ???.setClassLoader(localBundle.getClassLoader());
        localObject3 = ???.keySet().iterator();
        if (((Iterator)localObject3).hasNext())
        {
          localObject4 = (String)((Iterator)localObject3).next();
          localHashMap.put(localObject4, ???.getParcelable((String)localObject4));
        }
      }
    }
    ??? = ((Bundle)localObject1).getBundle("mp");
    Object localObject3 = new TreeMap();
    if (??? != null)
    {
      ???.setClassLoader(((Bundle)localObject1).getClassLoader());
      localObject4 = ???.keySet().iterator();
      while (((Iterator)localObject4).hasNext())
      {
        String str = (String)((Iterator)localObject4).next();
        ((TreeMap)localObject3).put(str, ???.getString(str));
      }
    }
    ??? = (FileSystem)((Bundle)localObject1).getParcelable("root");
    ??? = (Bundle)???;
    if (??? == null) {
      ??? = uRX;
    }
    localObject3 = a(localHashMap, (TreeMap)localObject3);
    synchronized (this.mLock)
    {
      this.uRY = localHashMap;
      this.uRZ = ((ArrayList)localObject3);
      this.uSa = ???;
      this.uSb += 1;
      this.uSc = new c(null, null, this.uSb, (byte)0);
      return;
    }
  }
  
  public static a cBR()
  {
    return d.uSl;
  }
  
  final c a(Uri paramUri, c paramc)
  {
    Object localObject = this.mLock;
    if (paramc != null) {}
    HashMap localHashMap;
    c localc;
    String str;
    for (;;)
    {
      ArrayList localArrayList;
      try
      {
        if (paramc.uSk == this.uSb) {
          return paramc;
        }
        localHashMap = this.uRY;
        localArrayList = this.uRZ;
        paramc = this.uSa;
        int j = this.uSb;
        localc = this.uSc;
        localObject = paramUri.getPath();
        str = paramUri.getScheme();
        if ((str != null) && (!str.equals("file"))) {
          break label299;
        }
        if ((localObject == null) || (((String)localObject).isEmpty())) {
          break label354;
        }
        localObject = abN((String)localObject);
        i = Collections.binarySearch(localArrayList, localObject);
        if (i >= 0)
        {
          paramc = ((b)localArrayList.get(i)).uSi;
          paramUri = "";
          return new c(paramc, paramUri, j, (byte)0);
        }
      }
      finally {}
      int i = -i - 2;
      if (i >= 0) {
        paramUri = (b)localArrayList.get(i);
      }
      while ((paramUri != null) && ((!((String)localObject).startsWith(paramUri.uSg)) || (((String)localObject).charAt(paramUri.uSg.length()) != '/'))) {
        if (paramUri.uSj)
        {
          i -= 1;
          paramUri = (b)localArrayList.get(i);
          continue;
          paramUri = null;
        }
        else
        {
          paramUri = null;
        }
      }
      if (paramUri == null) {
        break;
      }
      paramc = paramUri.uSi;
      paramUri = ((String)localObject).substring(paramUri.uSg.length() + 1);
    }
    if ((!((String)localObject).isEmpty()) && (((String)localObject).charAt(0) == '/')) {}
    for (paramUri = ((String)localObject).substring(1);; paramUri = (Uri)localObject)
    {
      break;
      label299:
      if (!str.equals("wcf")) {
        break label354;
      }
      paramc = (FileSystem)localHashMap.get(paramUri.getAuthority());
      if (localObject == null)
      {
        paramUri = "";
        break;
      }
      paramUri = d.i(paramUri.getPath(), true, true);
      break;
    }
    label354:
    return localc;
  }
  
  public final class a
  {
    public HashMap<String, FileSystem> uRY;
    public FileSystem uSa;
    public TreeMap<String, String> uSf;
    
    private a()
    {
      synchronized (a.a(a.this))
      {
        this.uRY = new HashMap(a.b(a.this));
        this.uSf = new TreeMap();
        Iterator localIterator = a.c(a.this).iterator();
        if (localIterator.hasNext())
        {
          a.b localb = (a.b)localIterator.next();
          this.uSf.put(localb.uSg, localb.uSh);
        }
      }
      this.uSa = a.d(a.this);
      if (this.uSa == null) {
        this.uSa = a.cBS();
      }
    }
    
    public final void cBT()
    {
      if (this.uSa == null) {
        throw new RuntimeException("Committed editor cannot be reused.");
      }
    }
  }
  
  private static final class b
    implements Comparable<String>
  {
    final String uSg;
    final String uSh;
    final FileSystem uSi;
    final boolean uSj;
    
    b(String paramString1, String paramString2, FileSystem paramFileSystem, boolean paramBoolean)
    {
      this.uSg = paramString1;
      this.uSh = paramString2;
      this.uSi = paramFileSystem;
      this.uSj = paramBoolean;
    }
  }
  
  public static final class c
  {
    final String path;
    public final FileSystem uSi;
    final int uSk;
    
    private c(FileSystem paramFileSystem, String paramString, int paramInt)
    {
      this.uSi = paramFileSystem;
      this.path = paramString;
      this.uSk = paramInt;
    }
    
    public final boolean valid()
    {
      return this.uSi != null;
    }
  }
  
  private static final class d
  {
    static final a uSl = new a((byte)0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/vfs/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */