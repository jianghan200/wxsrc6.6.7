package com.tencent.mm.plugin.game.model;

import com.tencent.mm.plugin.game.d.cu;
import com.tencent.mm.sdk.platformtools.bi;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class af
{
  public List<a> jNG = new LinkedList();
  public String mAppId = "";
  
  public af(String paramString)
  {
    if (bi.oW(paramString)) {
      return;
    }
    this.mAppId = paramString;
    this.jNG.addAll(aUp());
  }
  
  public af(String paramString, List<cu> paramList)
  {
    if ((bi.oW(paramString)) || (paramList == null) || (paramList.isEmpty())) {
      return;
    }
    this.mAppId = paramString;
    this.jNG.clear();
    paramString = paramList.iterator();
    while (paramString.hasNext())
    {
      paramList = (cu)paramString.next();
      a locala = new a();
      locala.jNH = paramList.jTf;
      locala.bWJ = paramList.hbL;
      locala.tag = paramList.jTh;
      locala.jsz = paramList.jTg;
      locala.jNJ = paramList.jTi;
      locala.jNI = paramList.jTj;
      locala.jNK = paramList.jTk;
      this.jNG.add(locala);
    }
    aUq();
  }
  
  /* Error */
  private List<a> aUp()
  {
    // Byte code:
    //   0: new 127	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 128	java/lang/StringBuilder:<init>	()V
    //   7: aload_0
    //   8: getfield 21	com/tencent/mm/plugin/game/model/af:mAppId	Ljava/lang/String;
    //   11: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   14: ldc -122
    //   16: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   19: invokevirtual 138	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   22: astore_1
    //   23: new 23	java/util/LinkedList
    //   26: dup
    //   27: invokespecial 24	java/util/LinkedList:<init>	()V
    //   30: astore 4
    //   32: ldc -116
    //   34: invokestatic 146	com/tencent/mm/kernel/g:l	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   37: checkcast 140	com/tencent/mm/plugin/game/a/c
    //   40: invokeinterface 150 1 0
    //   45: aload_1
    //   46: invokevirtual 156	com/tencent/mm/plugin/game/model/ab:Dw	(Ljava/lang/String;)[B
    //   49: astore_1
    //   50: aload_1
    //   51: ifnonnull +6 -> 57
    //   54: aload 4
    //   56: areturn
    //   57: new 158	java/io/ByteArrayInputStream
    //   60: dup
    //   61: aload_1
    //   62: invokespecial 161	java/io/ByteArrayInputStream:<init>	([B)V
    //   65: astore 5
    //   67: new 163	java/io/ObjectInputStream
    //   70: dup
    //   71: aload 5
    //   73: invokespecial 166	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   76: astore_2
    //   77: aload_2
    //   78: astore_1
    //   79: aload 4
    //   81: aload_2
    //   82: invokeinterface 171 1 0
    //   87: checkcast 38	java/util/List
    //   90: invokeinterface 42 2 0
    //   95: pop
    //   96: aload 5
    //   98: invokevirtual 174	java/io/ByteArrayInputStream:close	()V
    //   101: aload_2
    //   102: invokeinterface 175 1 0
    //   107: aload 4
    //   109: areturn
    //   110: astore_3
    //   111: aconst_null
    //   112: astore_2
    //   113: aload_2
    //   114: astore_1
    //   115: ldc -79
    //   117: aload_3
    //   118: ldc 19
    //   120: iconst_0
    //   121: anewarray 4	java/lang/Object
    //   124: invokestatic 183	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   127: aload 5
    //   129: invokevirtual 174	java/io/ByteArrayInputStream:close	()V
    //   132: aload_2
    //   133: ifnull -26 -> 107
    //   136: aload_2
    //   137: invokeinterface 175 1 0
    //   142: goto -35 -> 107
    //   145: astore_1
    //   146: goto -39 -> 107
    //   149: astore_2
    //   150: aconst_null
    //   151: astore_1
    //   152: aload 5
    //   154: invokevirtual 174	java/io/ByteArrayInputStream:close	()V
    //   157: aload_1
    //   158: ifnull +9 -> 167
    //   161: aload_1
    //   162: invokeinterface 175 1 0
    //   167: aload_2
    //   168: athrow
    //   169: astore_1
    //   170: goto -69 -> 101
    //   173: astore_1
    //   174: goto -67 -> 107
    //   177: astore_1
    //   178: goto -46 -> 132
    //   181: astore_3
    //   182: goto -25 -> 157
    //   185: astore_1
    //   186: goto -19 -> 167
    //   189: astore_2
    //   190: goto -38 -> 152
    //   193: astore_3
    //   194: goto -81 -> 113
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	197	0	this	af
    //   22	93	1	localObject1	Object
    //   145	1	1	localIOException1	java.io.IOException
    //   151	11	1	localObject2	Object
    //   169	1	1	localIOException2	java.io.IOException
    //   173	1	1	localIOException3	java.io.IOException
    //   177	1	1	localIOException4	java.io.IOException
    //   185	1	1	localIOException5	java.io.IOException
    //   76	61	2	localObjectInputStream	java.io.ObjectInputStream
    //   149	19	2	localObject3	Object
    //   189	1	2	localObject4	Object
    //   110	8	3	localException1	Exception
    //   181	1	3	localIOException6	java.io.IOException
    //   193	1	3	localException2	Exception
    //   30	78	4	localLinkedList	LinkedList
    //   65	88	5	localByteArrayInputStream	java.io.ByteArrayInputStream
    // Exception table:
    //   from	to	target	type
    //   67	77	110	java/lang/Exception
    //   136	142	145	java/io/IOException
    //   67	77	149	finally
    //   96	101	169	java/io/IOException
    //   101	107	173	java/io/IOException
    //   127	132	177	java/io/IOException
    //   152	157	181	java/io/IOException
    //   161	167	185	java/io/IOException
    //   79	96	189	finally
    //   115	127	189	finally
    //   79	96	193	java/lang/Exception
  }
  
  /* Error */
  public final void aUq()
  {
    // Byte code:
    //   0: new 127	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 128	java/lang/StringBuilder:<init>	()V
    //   7: aload_0
    //   8: getfield 21	com/tencent/mm/plugin/game/model/af:mAppId	Ljava/lang/String;
    //   11: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   14: ldc -122
    //   16: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   19: invokevirtual 138	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   22: astore_3
    //   23: new 186	java/io/ByteArrayOutputStream
    //   26: dup
    //   27: invokespecial 187	java/io/ByteArrayOutputStream:<init>	()V
    //   30: astore 4
    //   32: new 189	java/io/ObjectOutputStream
    //   35: dup
    //   36: aload 4
    //   38: invokespecial 192	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   41: astore_2
    //   42: aload_2
    //   43: astore_1
    //   44: aload_2
    //   45: aload_0
    //   46: getfield 26	com/tencent/mm/plugin/game/model/af:jNG	Ljava/util/List;
    //   49: invokeinterface 198 2 0
    //   54: aload_2
    //   55: astore_1
    //   56: aload 4
    //   58: invokevirtual 202	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   61: astore 5
    //   63: aload_2
    //   64: astore_1
    //   65: ldc -116
    //   67: invokestatic 146	com/tencent/mm/kernel/g:l	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   70: checkcast 140	com/tencent/mm/plugin/game/a/c
    //   73: invokeinterface 150 1 0
    //   78: aload_3
    //   79: aload 5
    //   81: invokevirtual 206	com/tencent/mm/plugin/game/model/ab:p	(Ljava/lang/String;[B)Z
    //   84: pop
    //   85: aload_2
    //   86: invokeinterface 207 1 0
    //   91: aload 4
    //   93: invokevirtual 208	java/io/ByteArrayOutputStream:close	()V
    //   96: return
    //   97: astore_3
    //   98: aconst_null
    //   99: astore_2
    //   100: aload_2
    //   101: astore_1
    //   102: ldc -79
    //   104: aload_3
    //   105: ldc 19
    //   107: iconst_0
    //   108: anewarray 4	java/lang/Object
    //   111: invokestatic 183	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   114: aload_2
    //   115: ifnull +9 -> 124
    //   118: aload_2
    //   119: invokeinterface 207 1 0
    //   124: aload 4
    //   126: invokevirtual 208	java/io/ByteArrayOutputStream:close	()V
    //   129: return
    //   130: astore_1
    //   131: return
    //   132: astore_2
    //   133: aconst_null
    //   134: astore_1
    //   135: aload_1
    //   136: ifnull +9 -> 145
    //   139: aload_1
    //   140: invokeinterface 207 1 0
    //   145: aload 4
    //   147: invokevirtual 208	java/io/ByteArrayOutputStream:close	()V
    //   150: aload_2
    //   151: athrow
    //   152: astore_1
    //   153: goto -62 -> 91
    //   156: astore_1
    //   157: return
    //   158: astore_1
    //   159: goto -35 -> 124
    //   162: astore_1
    //   163: goto -18 -> 145
    //   166: astore_1
    //   167: goto -17 -> 150
    //   170: astore_2
    //   171: goto -36 -> 135
    //   174: astore_3
    //   175: goto -75 -> 100
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	178	0	this	af
    //   43	59	1	localObjectOutputStream1	java.io.ObjectOutputStream
    //   130	1	1	localIOException1	java.io.IOException
    //   134	6	1	localObject1	Object
    //   152	1	1	localIOException2	java.io.IOException
    //   156	1	1	localIOException3	java.io.IOException
    //   158	1	1	localIOException4	java.io.IOException
    //   162	1	1	localIOException5	java.io.IOException
    //   166	1	1	localIOException6	java.io.IOException
    //   41	78	2	localObjectOutputStream2	java.io.ObjectOutputStream
    //   132	19	2	localObject2	Object
    //   170	1	2	localObject3	Object
    //   22	57	3	str	String
    //   97	8	3	localException1	Exception
    //   174	1	3	localException2	Exception
    //   30	116	4	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   61	19	5	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   32	42	97	java/lang/Exception
    //   124	129	130	java/io/IOException
    //   32	42	132	finally
    //   85	91	152	java/io/IOException
    //   91	96	156	java/io/IOException
    //   118	124	158	java/io/IOException
    //   139	145	162	java/io/IOException
    //   145	150	166	java/io/IOException
    //   44	54	170	finally
    //   56	63	170	finally
    //   65	85	170	finally
    //   102	114	170	finally
    //   44	54	174	java/lang/Exception
    //   56	63	174	java/lang/Exception
    //   65	85	174	java/lang/Exception
  }
  
  public static final class a
    implements Serializable
  {
    public String bWJ;
    public int jNH;
    public int jNI;
    public boolean jNJ;
    public String jNK;
    public long jsz;
    public String tag;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/model/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */