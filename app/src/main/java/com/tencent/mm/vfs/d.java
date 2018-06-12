package com.tencent.mm.vfs;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public final class d
{
  public static boolean I(String paramString, boolean paramBoolean)
  {
    if ((paramString == null) || (paramString.length() == 0)) {}
    Object localObject;
    do
    {
      return false;
      localObject = a.abO(paramString);
      localObject = a.cBR().a((Uri)localObject, null);
    } while (!((a.c)localObject).valid());
    return ((a.c)localObject).uSi.I(paramString, paramBoolean);
  }
  
  public static long abQ(String paramString)
  {
    paramString = a.abO(paramString);
    paramString = a.cBR().a(paramString, null);
    if (!paramString.valid()) {}
    do
    {
      return 0L;
      paramString = paramString.uSi.abK(paramString.path);
    } while (paramString == null);
    return paramString.size;
  }
  
  public static boolean av(String paramString1, String paramString2)
  {
    boolean bool = true;
    if ((paramString1 == null) || (paramString2 == null) || (paramString1.length() == 0) || (paramString2.length() == 0)) {
      bool = false;
    }
    while (new b(paramString1).a(new b(paramString2))) {
      return bool;
    }
    if (y(paramString1, paramString2) < 0L) {
      return false;
    }
    deleteFile(paramString1);
    return true;
  }
  
  /* Error */
  public static int b(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_1
    //   3: ifnonnull +8 -> 11
    //   6: bipush -2
    //   8: istore_2
    //   9: iload_2
    //   10: ireturn
    //   11: aload_1
    //   12: arraylength
    //   13: iload_2
    //   14: iconst_0
    //   15: iadd
    //   16: if_icmpge +6 -> 22
    //   19: bipush -3
    //   21: ireturn
    //   22: aconst_null
    //   23: astore 5
    //   25: aconst_null
    //   26: astore 4
    //   28: aload_0
    //   29: invokestatic 84	com/tencent/mm/vfs/d:mG	(Ljava/lang/String;)Ljava/io/OutputStream;
    //   32: astore 6
    //   34: aload 6
    //   36: astore 4
    //   38: aload 6
    //   40: astore 5
    //   42: aload 6
    //   44: aload_1
    //   45: iconst_0
    //   46: iload_2
    //   47: invokevirtual 90	java/io/OutputStream:write	([BII)V
    //   50: iload_3
    //   51: istore_2
    //   52: aload 6
    //   54: ifnull -45 -> 9
    //   57: aload 6
    //   59: invokevirtual 94	java/io/OutputStream:close	()V
    //   62: iconst_0
    //   63: ireturn
    //   64: astore_0
    //   65: iconst_0
    //   66: ireturn
    //   67: astore_1
    //   68: aload 4
    //   70: astore 5
    //   72: ldc 96
    //   74: ldc 98
    //   76: iconst_2
    //   77: anewarray 4	java/lang/Object
    //   80: dup
    //   81: iconst_0
    //   82: aload_0
    //   83: aastore
    //   84: dup
    //   85: iconst_1
    //   86: aload_1
    //   87: invokevirtual 102	java/io/IOException:getMessage	()Ljava/lang/String;
    //   90: aastore
    //   91: invokestatic 108	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   94: aload 4
    //   96: ifnull +8 -> 104
    //   99: aload 4
    //   101: invokevirtual 94	java/io/OutputStream:close	()V
    //   104: iconst_m1
    //   105: ireturn
    //   106: astore_0
    //   107: aload 5
    //   109: ifnull +8 -> 117
    //   112: aload 5
    //   114: invokevirtual 94	java/io/OutputStream:close	()V
    //   117: aload_0
    //   118: athrow
    //   119: astore_0
    //   120: goto -16 -> 104
    //   123: astore_1
    //   124: goto -7 -> 117
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	127	0	paramString	String
    //   0	127	1	paramArrayOfByte	byte[]
    //   0	127	2	paramInt	int
    //   1	50	3	i	int
    //   26	74	4	localObject1	Object
    //   23	90	5	localObject2	Object
    //   32	26	6	localOutputStream	OutputStream
    // Exception table:
    //   from	to	target	type
    //   57	62	64	java/io/IOException
    //   28	34	67	java/io/IOException
    //   42	50	67	java/io/IOException
    //   28	34	106	finally
    //   42	50	106	finally
    //   72	94	106	finally
    //   99	104	119	java/io/IOException
    //   112	117	123	java/io/IOException
  }
  
  static OutputStream b(Uri paramUri, a.c paramc)
  {
    paramc = a.cBR().a(paramUri, paramc);
    if (!paramc.valid()) {
      throw new FileNotFoundException("Cannot resolve path or URI: " + paramUri);
    }
    try
    {
      paramUri = paramc.uSi.mG(paramc.path);
      return paramUri;
    }
    catch (IOException paramUri)
    {
      throw ((FileNotFoundException)new FileNotFoundException(paramUri.getMessage()).initCause(paramUri));
    }
  }
  
  public static boolean cn(String paramString)
  {
    if ((paramString == null) || (paramString.isEmpty())) {}
    do
    {
      return false;
      paramString = a.abO(paramString);
      paramString = a.cBR().a(paramString, null);
    } while (!paramString.valid());
    return paramString.uSi.abJ(paramString.path);
  }
  
  /* Error */
  public static String ct(String paramString)
  {
    // Byte code:
    //   0: new 113	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 140	java/lang/StringBuilder:<init>	()V
    //   7: astore 4
    //   9: new 142	java/io/InputStreamReader
    //   12: dup
    //   13: aload_0
    //   14: invokestatic 146	com/tencent/mm/vfs/d:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   17: invokespecial 149	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   20: astore_3
    //   21: aload_3
    //   22: astore_2
    //   23: sipush 512
    //   26: newarray <illegal type>
    //   28: astore 5
    //   30: aload_3
    //   31: astore_2
    //   32: aload_3
    //   33: aload 5
    //   35: invokevirtual 153	java/io/InputStreamReader:read	([C)I
    //   38: istore_1
    //   39: iload_1
    //   40: iconst_m1
    //   41: if_icmpeq +61 -> 102
    //   44: aload_3
    //   45: astore_2
    //   46: aload 4
    //   48: aload 5
    //   50: iconst_0
    //   51: iload_1
    //   52: invokevirtual 156	java/lang/StringBuilder:append	([CII)Ljava/lang/StringBuilder;
    //   55: pop
    //   56: goto -26 -> 30
    //   59: astore 4
    //   61: aload_3
    //   62: astore_2
    //   63: ldc 96
    //   65: ldc -98
    //   67: iconst_2
    //   68: anewarray 4	java/lang/Object
    //   71: dup
    //   72: iconst_0
    //   73: aload_0
    //   74: aastore
    //   75: dup
    //   76: iconst_1
    //   77: aload 4
    //   79: invokevirtual 102	java/io/IOException:getMessage	()Ljava/lang/String;
    //   82: aastore
    //   83: invokestatic 108	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   86: aload_3
    //   87: astore_2
    //   88: aload 4
    //   90: athrow
    //   91: astore_0
    //   92: aload_2
    //   93: ifnull +7 -> 100
    //   96: aload_2
    //   97: invokevirtual 159	java/io/InputStreamReader:close	()V
    //   100: aload_0
    //   101: athrow
    //   102: aload_3
    //   103: invokevirtual 159	java/io/InputStreamReader:close	()V
    //   106: aload 4
    //   108: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   111: areturn
    //   112: astore_0
    //   113: goto -7 -> 106
    //   116: astore_2
    //   117: goto -17 -> 100
    //   120: astore_0
    //   121: aconst_null
    //   122: astore_2
    //   123: goto -31 -> 92
    //   126: astore 4
    //   128: aconst_null
    //   129: astore_3
    //   130: goto -69 -> 61
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	133	0	paramString	String
    //   38	14	1	i	int
    //   22	75	2	localInputStreamReader1	java.io.InputStreamReader
    //   116	1	2	localIOException1	IOException
    //   122	1	2	localObject	Object
    //   20	110	3	localInputStreamReader2	java.io.InputStreamReader
    //   7	40	4	localStringBuilder	StringBuilder
    //   59	48	4	localIOException2	IOException
    //   126	1	4	localIOException3	IOException
    //   28	21	5	arrayOfChar	char[]
    // Exception table:
    //   from	to	target	type
    //   23	30	59	java/io/IOException
    //   32	39	59	java/io/IOException
    //   46	56	59	java/io/IOException
    //   23	30	91	finally
    //   32	39	91	finally
    //   46	56	91	finally
    //   63	86	91	finally
    //   88	91	91	finally
    //   102	106	112	java/io/IOException
    //   96	100	116	java/io/IOException
    //   9	21	120	finally
    //   9	21	126	java/io/IOException
  }
  
  public static boolean deleteFile(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return false;
    }
    return new b(paramString).delete();
  }
  
  /* Error */
  public static byte[] dv(String paramString, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: iload_1
    //   7: ifge +89 -> 96
    //   10: sipush 2048
    //   13: istore_2
    //   14: new 166	java/io/ByteArrayOutputStream
    //   17: dup
    //   18: iload_2
    //   19: invokespecial 169	java/io/ByteArrayOutputStream:<init>	(I)V
    //   22: astore 5
    //   24: aload_0
    //   25: invokestatic 146	com/tencent/mm/vfs/d:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   28: astore 4
    //   30: aload 4
    //   32: astore_3
    //   33: sipush 1024
    //   36: newarray <illegal type>
    //   38: astore 6
    //   40: iload_1
    //   41: istore_2
    //   42: iload_1
    //   43: ifge +6 -> 49
    //   46: ldc -86
    //   48: istore_2
    //   49: aload 4
    //   51: astore_3
    //   52: aload 4
    //   54: aload 6
    //   56: iconst_0
    //   57: iload_2
    //   58: sipush 1024
    //   61: invokestatic 176	java/lang/Math:min	(II)I
    //   64: invokevirtual 181	java/io/InputStream:read	([BII)I
    //   67: istore_1
    //   68: iload_1
    //   69: iconst_m1
    //   70: if_icmpeq +31 -> 101
    //   73: iload_2
    //   74: ifle +27 -> 101
    //   77: aload 4
    //   79: astore_3
    //   80: aload 5
    //   82: aload 6
    //   84: iconst_0
    //   85: iload_1
    //   86: invokevirtual 182	java/io/ByteArrayOutputStream:write	([BII)V
    //   89: iload_2
    //   90: iload_1
    //   91: isub
    //   92: istore_2
    //   93: goto -44 -> 49
    //   96: iload_1
    //   97: istore_2
    //   98: goto -84 -> 14
    //   101: aload 4
    //   103: ifnull +8 -> 111
    //   106: aload 4
    //   108: invokevirtual 183	java/io/InputStream:close	()V
    //   111: aload 5
    //   113: invokevirtual 187	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   116: astore_3
    //   117: aload 5
    //   119: invokevirtual 188	java/io/ByteArrayOutputStream:close	()V
    //   122: ldc 96
    //   124: ldc -66
    //   126: iconst_2
    //   127: anewarray 4	java/lang/Object
    //   130: dup
    //   131: iconst_0
    //   132: aload_0
    //   133: aastore
    //   134: dup
    //   135: iconst_1
    //   136: aload_3
    //   137: arraylength
    //   138: invokestatic 196	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   141: aastore
    //   142: invokestatic 199	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   145: aload_3
    //   146: areturn
    //   147: astore 5
    //   149: aconst_null
    //   150: astore 4
    //   152: aload 4
    //   154: astore_3
    //   155: ldc 96
    //   157: new 113	java/lang/StringBuilder
    //   160: dup
    //   161: ldc -55
    //   163: invokespecial 116	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   166: aload_0
    //   167: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   170: ldc -50
    //   172: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: aload 5
    //   177: invokevirtual 102	java/io/IOException:getMessage	()Ljava/lang/String;
    //   180: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   186: invokestatic 210	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   189: aload 4
    //   191: ifnull +8 -> 199
    //   194: aload 4
    //   196: invokevirtual 183	java/io/InputStream:close	()V
    //   199: aconst_null
    //   200: areturn
    //   201: astore_0
    //   202: aconst_null
    //   203: astore_3
    //   204: aload_3
    //   205: ifnull +7 -> 212
    //   208: aload_3
    //   209: invokevirtual 183	java/io/InputStream:close	()V
    //   212: aload_0
    //   213: athrow
    //   214: astore_3
    //   215: goto -104 -> 111
    //   218: astore_0
    //   219: goto -20 -> 199
    //   222: astore_3
    //   223: goto -11 -> 212
    //   226: astore 4
    //   228: goto -106 -> 122
    //   231: astore_0
    //   232: goto -28 -> 204
    //   235: astore 5
    //   237: goto -85 -> 152
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	240	0	paramString	String
    //   0	240	1	paramInt	int
    //   13	85	2	i	int
    //   32	177	3	localObject	Object
    //   214	1	3	localIOException1	IOException
    //   222	1	3	localIOException2	IOException
    //   28	167	4	localInputStream	InputStream
    //   226	1	4	localIOException3	IOException
    //   22	96	5	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   147	29	5	localIOException4	IOException
    //   235	1	5	localIOException5	IOException
    //   38	45	6	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   24	30	147	java/io/IOException
    //   24	30	201	finally
    //   106	111	214	java/io/IOException
    //   194	199	218	java/io/IOException
    //   208	212	222	java/io/IOException
    //   117	122	226	java/io/IOException
    //   33	40	231	finally
    //   52	68	231	finally
    //   80	89	231	finally
    //   155	189	231	finally
    //   33	40	235	java/io/IOException
    //   52	68	235	java/io/IOException
    //   80	89	235	java/io/IOException
  }
  
  static String i(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 1;
    if (paramString.isEmpty()) {}
    int j;
    label185:
    do
    {
      return paramString;
      StringTokenizer localStringTokenizer;
      if (paramString.startsWith("/"))
      {
        j = 1;
        localObject = paramString;
        if (paramString.endsWith("/"))
        {
          localObject = paramString;
          if (paramString.length() > 1) {
            localObject = paramString.substring(0, paramString.length() - 1);
          }
        }
        localStringTokenizer = new StringTokenizer(((String)localObject).substring(j), "/");
        paramString = new ArrayList();
      }
      for (;;)
      {
        if (!localStringTokenizer.hasMoreTokens()) {
          break label185;
        }
        String str = localStringTokenizer.nextToken();
        if ((paramBoolean1) && ("..".equals(str)))
        {
          if (paramString.isEmpty())
          {
            return null;
            j = 0;
            break;
          }
          paramString.remove(paramString.size() - 1);
          i = 0;
          continue;
        }
        if (((paramBoolean1) && (".".equals(str))) || ("".equals(str))) {
          i = 0;
        } else {
          paramString.add(str);
        }
      }
      if (i == 0) {
        break;
      }
      paramString = (String)localObject;
    } while (!paramBoolean2);
    return ((String)localObject).substring(j);
    Object localObject = new StringBuilder();
    if ((!paramBoolean2) && (j > 0)) {
      ((StringBuilder)localObject).append('/');
    }
    paramString = paramString.iterator();
    if (paramString.hasNext())
    {
      ((StringBuilder)localObject).append(paramString.next());
      while (paramString.hasNext())
      {
        ((StringBuilder)localObject).append('/');
        ((StringBuilder)localObject).append(paramString.next());
      }
    }
    return ((StringBuilder)localObject).toString();
  }
  
  public static OutputStream mG(String paramString)
  {
    if ((paramString == null) || (paramString.isEmpty())) {
      throw new FileNotFoundException("path is empty");
    }
    return b(a.abO(paramString), null);
  }
  
  public static boolean mL(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return false;
    }
    paramString = new b(paramString);
    if ((paramString.exists()) && (paramString.isDirectory())) {
      return true;
    }
    return paramString.mkdirs();
  }
  
  public static InputStream o(Uri paramUri)
  {
    a.c localc = a.cBR().a(paramUri, null);
    if (!localc.valid()) {
      throw new FileNotFoundException("Cannot resolve path or URI: " + paramUri);
    }
    try
    {
      paramUri = localc.uSi.openRead(localc.path);
      return paramUri;
    }
    catch (IOException paramUri)
    {
      throw ((FileNotFoundException)new FileNotFoundException(paramUri.getMessage()).initCause(paramUri));
    }
  }
  
  public static InputStream openRead(String paramString)
  {
    if ((paramString == null) || (paramString.isEmpty())) {
      throw new FileNotFoundException("path is empty");
    }
    return o(a.abO(paramString));
  }
  
  /* Error */
  public static long y(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +21 -> 22
    //   4: aload_0
    //   5: invokevirtual 12	java/lang/String:length	()I
    //   8: ifeq +14 -> 22
    //   11: aload_1
    //   12: ifnull +10 -> 22
    //   15: aload_1
    //   16: invokevirtual 12	java/lang/String:length	()I
    //   19: ifne +11 -> 30
    //   22: ldc2_w 296
    //   25: lstore 5
    //   27: lload 5
    //   29: lreturn
    //   30: lconst_0
    //   31: lstore_3
    //   32: aload_0
    //   33: invokestatic 146	com/tencent/mm/vfs/d:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   36: astore 8
    //   38: aload_1
    //   39: invokestatic 84	com/tencent/mm/vfs/d:mG	(Ljava/lang/String;)Ljava/io/OutputStream;
    //   42: astore 7
    //   44: sipush 1024
    //   47: newarray <illegal type>
    //   49: astore 9
    //   51: aload 8
    //   53: aload 9
    //   55: invokevirtual 300	java/io/InputStream:read	([B)I
    //   58: istore_2
    //   59: iload_2
    //   60: iconst_m1
    //   61: if_icmpeq +20 -> 81
    //   64: aload 7
    //   66: aload 9
    //   68: iconst_0
    //   69: iload_2
    //   70: invokevirtual 90	java/io/OutputStream:write	([BII)V
    //   73: lload_3
    //   74: iload_2
    //   75: i2l
    //   76: ladd
    //   77: lstore_3
    //   78: goto -27 -> 51
    //   81: ldc 96
    //   83: ldc_w 302
    //   86: iconst_2
    //   87: anewarray 4	java/lang/Object
    //   90: dup
    //   91: iconst_0
    //   92: aload_0
    //   93: aastore
    //   94: dup
    //   95: iconst_1
    //   96: aload_1
    //   97: aastore
    //   98: invokestatic 199	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   101: aload 8
    //   103: ifnull +8 -> 111
    //   106: aload 8
    //   108: invokevirtual 183	java/io/InputStream:close	()V
    //   111: lload_3
    //   112: lstore 5
    //   114: aload 7
    //   116: ifnull -89 -> 27
    //   119: aload 7
    //   121: invokevirtual 94	java/io/OutputStream:close	()V
    //   124: lload_3
    //   125: lreturn
    //   126: astore_0
    //   127: lload_3
    //   128: lreturn
    //   129: astore 9
    //   131: aconst_null
    //   132: astore 7
    //   134: aconst_null
    //   135: astore 8
    //   137: ldc 96
    //   139: ldc_w 304
    //   142: iconst_3
    //   143: anewarray 4	java/lang/Object
    //   146: dup
    //   147: iconst_0
    //   148: aload_0
    //   149: aastore
    //   150: dup
    //   151: iconst_1
    //   152: aload_1
    //   153: aastore
    //   154: dup
    //   155: iconst_2
    //   156: aload 9
    //   158: invokevirtual 102	java/io/IOException:getMessage	()Ljava/lang/String;
    //   161: aastore
    //   162: invokestatic 108	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   165: aload 8
    //   167: ifnull +8 -> 175
    //   170: aload 8
    //   172: invokevirtual 183	java/io/InputStream:close	()V
    //   175: aload 7
    //   177: ifnull +8 -> 185
    //   180: aload 7
    //   182: invokevirtual 94	java/io/OutputStream:close	()V
    //   185: ldc2_w 296
    //   188: lreturn
    //   189: astore_0
    //   190: aconst_null
    //   191: astore 7
    //   193: aconst_null
    //   194: astore 8
    //   196: aload 8
    //   198: ifnull +8 -> 206
    //   201: aload 8
    //   203: invokevirtual 183	java/io/InputStream:close	()V
    //   206: aload 7
    //   208: ifnull +8 -> 216
    //   211: aload 7
    //   213: invokevirtual 94	java/io/OutputStream:close	()V
    //   216: aload_0
    //   217: athrow
    //   218: astore_0
    //   219: goto -108 -> 111
    //   222: astore_0
    //   223: goto -48 -> 175
    //   226: astore_0
    //   227: goto -42 -> 185
    //   230: astore_1
    //   231: goto -25 -> 206
    //   234: astore_1
    //   235: goto -19 -> 216
    //   238: astore_0
    //   239: aconst_null
    //   240: astore 7
    //   242: goto -46 -> 196
    //   245: astore_0
    //   246: goto -50 -> 196
    //   249: astore_0
    //   250: goto -54 -> 196
    //   253: astore 9
    //   255: aconst_null
    //   256: astore 7
    //   258: goto -121 -> 137
    //   261: astore 9
    //   263: goto -126 -> 137
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	266	0	paramString1	String
    //   0	266	1	paramString2	String
    //   58	17	2	i	int
    //   31	97	3	l1	long
    //   25	88	5	l2	long
    //   42	215	7	localOutputStream	OutputStream
    //   36	166	8	localInputStream	InputStream
    //   49	18	9	arrayOfByte	byte[]
    //   129	28	9	localIOException1	IOException
    //   253	1	9	localIOException2	IOException
    //   261	1	9	localIOException3	IOException
    // Exception table:
    //   from	to	target	type
    //   119	124	126	java/io/IOException
    //   32	38	129	java/io/IOException
    //   32	38	189	finally
    //   106	111	218	java/io/IOException
    //   170	175	222	java/io/IOException
    //   180	185	226	java/io/IOException
    //   201	206	230	java/io/IOException
    //   211	216	234	java/io/IOException
    //   38	44	238	finally
    //   44	51	245	finally
    //   51	59	245	finally
    //   64	73	245	finally
    //   81	101	245	finally
    //   137	165	249	finally
    //   38	44	253	java/io/IOException
    //   44	51	261	java/io/IOException
    //   51	59	261	java/io/IOException
    //   64	73	261	java/io/IOException
    //   81	101	261	java/io/IOException
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/vfs/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */