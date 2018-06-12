package com.tencent.matrix.trace.e;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.os.Build.VERSION;
import com.tencent.matrix.d.b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.util.regex.Pattern;

public final class a
{
  private static final FileFilter acg = new FileFilter()
  {
    public final boolean accept(File paramAnonymousFile)
    {
      return Pattern.matches("cpu[0-9]", paramAnonymousFile.getName());
    }
  };
  private static a buJ = null;
  
  private static long U(Context paramContext)
  {
    Object localObject;
    if (Build.VERSION.SDK_INT >= 16)
    {
      localObject = new ActivityManager.MemoryInfo();
      ((ActivityManager)paramContext.getSystemService("activity")).getMemoryInfo((ActivityManager.MemoryInfo)localObject);
      return ((ActivityManager.MemoryInfo)localObject).totalMem;
    }
    long l2 = 0L;
    long l1 = l2;
    try
    {
      paramContext = new BufferedReader(new FileReader("/proc/meminfo"));
      l1 = l2;
      localObject = paramContext.readLine();
      l1 = l2;
      String[] arrayOfString = ((String)localObject).split("\\s+");
      l1 = l2;
      int j = arrayOfString.length;
      int i = 0;
      while (i < j)
      {
        String str = arrayOfString[i];
        l1 = l2;
        b.i((String)localObject, str + "\t", new Object[0]);
        i += 1;
      }
      l1 = l2;
      l2 = Integer.parseInt(arrayOfString[1]) * 1024;
      l1 = l2;
      paramContext.close();
      return l2;
    }
    catch (Exception paramContext)
    {
      b.i("Matrix.DeviceUtil", "[getTotalMemory] error! %s", new Object[] { paramContext.toString() });
    }
    return l1;
  }
  
  public static a aB(Context paramContext)
  {
    if (buJ != null) {
      return buJ;
    }
    long l = U(paramContext);
    int i = tI();
    b.i("Matrix.DeviceUtil", "[getLevel] totalMemory:%s coresNum:%s", new Object[] { Long.valueOf(l), Integer.valueOf(i) });
    if (l >= 4294967296L) {
      buJ = a.buK;
    }
    for (;;)
    {
      return buJ;
      if (l >= 3221225472L) {
        buJ = a.buL;
      } else if (l >= 2147483648L)
      {
        if (i >= 4) {
          buJ = a.buL;
        } else if (i >= 2) {
          buJ = a.buM;
        } else if (i > 0) {
          buJ = a.buN;
        }
      }
      else if (l >= 1073741824L)
      {
        if (i >= 4) {
          buJ = a.buM;
        } else if (i >= 2) {
          buJ = a.buN;
        } else if (i > 0) {
          buJ = a.buN;
        }
      }
      else if ((0L <= l) && (l < 1073741824L)) {
        buJ = a.buO;
      } else {
        buJ = a.buP;
      }
    }
  }
  
  /* Error */
  private static int cc(String paramString)
  {
    // Byte code:
    //   0: new 160	java/io/FileInputStream
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 161	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   8: astore_3
    //   9: aload_3
    //   10: astore_0
    //   11: new 56	java/io/BufferedReader
    //   14: dup
    //   15: new 163	java/io/InputStreamReader
    //   18: dup
    //   19: aload_3
    //   20: invokespecial 166	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   23: invokespecial 66	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   26: astore 4
    //   28: aload_3
    //   29: astore_0
    //   30: aload 4
    //   32: invokevirtual 70	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   35: astore 5
    //   37: aload_3
    //   38: astore_0
    //   39: aload 4
    //   41: invokevirtual 105	java/io/BufferedReader:close	()V
    //   44: aload 5
    //   46: ifnull +17 -> 63
    //   49: aload_3
    //   50: astore_0
    //   51: aload 5
    //   53: ldc -88
    //   55: invokevirtual 172	java/lang/String:matches	(Ljava/lang/String;)Z
    //   58: istore_2
    //   59: iload_2
    //   60: ifne +31 -> 91
    //   63: aload_3
    //   64: invokevirtual 175	java/io/InputStream:close	()V
    //   67: iconst_0
    //   68: ireturn
    //   69: astore_0
    //   70: ldc 107
    //   72: ldc -79
    //   74: iconst_1
    //   75: anewarray 4	java/lang/Object
    //   78: dup
    //   79: iconst_0
    //   80: aload_0
    //   81: invokevirtual 178	java/io/IOException:toString	()Ljava/lang/String;
    //   84: aastore
    //   85: invokestatic 96	com/tencent/matrix/d/b:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   88: goto -21 -> 67
    //   91: aload_3
    //   92: astore_0
    //   93: aload 5
    //   95: iconst_2
    //   96: invokevirtual 182	java/lang/String:substring	(I)Ljava/lang/String;
    //   99: invokestatic 102	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   102: istore_1
    //   103: iload_1
    //   104: iconst_1
    //   105: iadd
    //   106: istore_1
    //   107: aload_3
    //   108: invokevirtual 175	java/io/InputStream:close	()V
    //   111: iload_1
    //   112: ireturn
    //   113: astore_0
    //   114: ldc 107
    //   116: ldc -79
    //   118: iconst_1
    //   119: anewarray 4	java/lang/Object
    //   122: dup
    //   123: iconst_0
    //   124: aload_0
    //   125: invokevirtual 178	java/io/IOException:toString	()Ljava/lang/String;
    //   128: aastore
    //   129: invokestatic 96	com/tencent/matrix/d/b:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   132: iload_1
    //   133: ireturn
    //   134: astore 4
    //   136: aconst_null
    //   137: astore_3
    //   138: aload_3
    //   139: astore_0
    //   140: ldc 107
    //   142: ldc -79
    //   144: iconst_1
    //   145: anewarray 4	java/lang/Object
    //   148: dup
    //   149: iconst_0
    //   150: aload 4
    //   152: invokevirtual 178	java/io/IOException:toString	()Ljava/lang/String;
    //   155: aastore
    //   156: invokestatic 96	com/tencent/matrix/d/b:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   159: aload_3
    //   160: ifnull +7 -> 167
    //   163: aload_3
    //   164: invokevirtual 175	java/io/InputStream:close	()V
    //   167: iconst_0
    //   168: ireturn
    //   169: astore_0
    //   170: ldc 107
    //   172: ldc -79
    //   174: iconst_1
    //   175: anewarray 4	java/lang/Object
    //   178: dup
    //   179: iconst_0
    //   180: aload_0
    //   181: invokevirtual 178	java/io/IOException:toString	()Ljava/lang/String;
    //   184: aastore
    //   185: invokestatic 96	com/tencent/matrix/d/b:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   188: goto -21 -> 167
    //   191: astore_3
    //   192: aconst_null
    //   193: astore_0
    //   194: aload_0
    //   195: ifnull +7 -> 202
    //   198: aload_0
    //   199: invokevirtual 175	java/io/InputStream:close	()V
    //   202: aload_3
    //   203: athrow
    //   204: astore_0
    //   205: ldc 107
    //   207: ldc -79
    //   209: iconst_1
    //   210: anewarray 4	java/lang/Object
    //   213: dup
    //   214: iconst_0
    //   215: aload_0
    //   216: invokevirtual 178	java/io/IOException:toString	()Ljava/lang/String;
    //   219: aastore
    //   220: invokestatic 96	com/tencent/matrix/d/b:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   223: goto -21 -> 202
    //   226: astore_3
    //   227: goto -33 -> 194
    //   230: astore 4
    //   232: goto -94 -> 138
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	235	0	paramString	String
    //   102	31	1	i	int
    //   58	2	2	bool	boolean
    //   8	156	3	localFileInputStream	java.io.FileInputStream
    //   191	12	3	localObject1	Object
    //   226	1	3	localObject2	Object
    //   26	14	4	localBufferedReader	BufferedReader
    //   134	17	4	localIOException1	java.io.IOException
    //   230	1	4	localIOException2	java.io.IOException
    //   35	59	5	str	String
    // Exception table:
    //   from	to	target	type
    //   63	67	69	java/io/IOException
    //   107	111	113	java/io/IOException
    //   0	9	134	java/io/IOException
    //   163	167	169	java/io/IOException
    //   0	9	191	finally
    //   198	202	204	java/io/IOException
    //   11	28	226	finally
    //   30	37	226	finally
    //   39	44	226	finally
    //   51	59	226	finally
    //   93	103	226	finally
    //   140	159	226	finally
    //   11	28	230	java/io/IOException
    //   30	37	230	java/io/IOException
    //   39	44	230	java/io/IOException
    //   51	59	230	java/io/IOException
    //   93	103	230	java/io/IOException
  }
  
  private static int tI()
  {
    if (Build.VERSION.SDK_INT <= 10) {
      return 1;
    }
    try
    {
      i = cc("/sys/devices/system/cpu/possible");
      j = i;
      if (i == 0) {
        j = cc("/sys/devices/system/cpu/present");
      }
      i = j;
      if (j == 0) {
        i = new File("/sys/devices/system/cpu/").listFiles(acg).length;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        int j;
        int i = 0;
      }
    }
    j = i;
    if (i == 0) {
      j = 1;
    }
    return j;
  }
  
  public static enum a
  {
    public int value;
    
    private a(int paramInt)
    {
      this.value = paramInt;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/trace/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */