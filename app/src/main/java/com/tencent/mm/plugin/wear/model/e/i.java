package com.tencent.mm.plugin.wear.model.e;

import com.tencent.mm.protocal.c.cec;
import java.util.ArrayList;
import java.util.List;

public final class i
  extends a
{
  public cec pJT;
  
  public final List<Integer> bSy()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11002));
    return localArrayList;
  }
  
  /* Error */
  protected final byte[] p(int paramInt, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: iload_1
    //   1: sipush 11002
    //   4: if_icmpne +280 -> 284
    //   7: iconst_1
    //   8: iconst_0
    //   9: invokestatic 42	com/tencent/mm/plugin/wear/model/c/a:ee	(II)V
    //   12: iconst_0
    //   13: invokestatic 46	com/tencent/mm/plugin/wear/model/c/a:zC	(I)V
    //   16: new 48	com/tencent/mm/g/a/tp
    //   19: dup
    //   20: invokespecial 49	com/tencent/mm/g/a/tp:<init>	()V
    //   23: astore 4
    //   25: aload 4
    //   27: getfield 53	com/tencent/mm/g/a/tp:cfo	Lcom/tencent/mm/g/a/tp$a;
    //   30: invokestatic 59	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   33: invokevirtual 65	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   36: getstatic 71	com/tencent/mm/R$c:emoji_product_id_list	I
    //   39: invokevirtual 77	android/content/res/Resources:getStringArray	(I)[Ljava/lang/String;
    //   42: putfield 83	com/tencent/mm/g/a/tp$a:cfp	[Ljava/lang/String;
    //   45: aload 4
    //   47: getfield 53	com/tencent/mm/g/a/tp:cfo	Lcom/tencent/mm/g/a/tp$a;
    //   50: iconst_1
    //   51: putfield 86	com/tencent/mm/g/a/tp$a:bIH	I
    //   54: getstatic 92	com/tencent/mm/sdk/b/a:sFg	Lcom/tencent/mm/sdk/b/a;
    //   57: aload 4
    //   59: invokevirtual 96	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   62: pop
    //   63: invokestatic 102	com/tencent/mm/plugin/wear/model/a:bSl	()Lcom/tencent/mm/plugin/wear/model/a;
    //   66: getfield 106	com/tencent/mm/plugin/wear/model/a:pIM	Lcom/tencent/mm/plugin/wear/model/d;
    //   69: aload_2
    //   70: invokevirtual 112	com/tencent/mm/plugin/wear/model/d:bb	([B)[B
    //   73: astore_2
    //   74: aload_2
    //   75: ifnull +209 -> 284
    //   78: new 114	com/tencent/mm/protocal/c/cec
    //   81: dup
    //   82: invokespecial 115	com/tencent/mm/protocal/c/cec:<init>	()V
    //   85: astore 5
    //   87: aload 5
    //   89: aload_2
    //   90: invokevirtual 119	com/tencent/mm/protocal/c/cec:aG	([B)Lcom/tencent/mm/bk/a;
    //   93: pop
    //   94: new 121	com/tencent/mm/protocal/c/ced
    //   97: dup
    //   98: invokespecial 122	com/tencent/mm/protocal/c/ced:<init>	()V
    //   101: astore 6
    //   103: bipush 20
    //   105: istore_1
    //   106: aconst_null
    //   107: astore_2
    //   108: aload_2
    //   109: astore 4
    //   111: iload_1
    //   112: ifle +32 -> 144
    //   115: invokestatic 128	com/tencent/mm/model/q:GF	()Ljava/lang/String;
    //   118: astore_2
    //   119: aload_2
    //   120: invokestatic 134	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   123: istore_3
    //   124: aload_2
    //   125: astore 4
    //   127: iload_3
    //   128: ifeq +16 -> 144
    //   131: ldc2_w 135
    //   134: invokestatic 142	java/lang/Thread:sleep	(J)V
    //   137: iload_1
    //   138: iconst_1
    //   139: isub
    //   140: istore_1
    //   141: goto -33 -> 108
    //   144: aload 4
    //   146: invokestatic 134	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   149: ifeq +5 -> 154
    //   152: aconst_null
    //   153: areturn
    //   154: aload 6
    //   156: aload 4
    //   158: putfield 146	com/tencent/mm/protocal/c/ced:rdS	Ljava/lang/String;
    //   161: invokestatic 59	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   164: invokestatic 149	com/tencent/mm/sdk/platformtools/ad:chY	()Ljava/lang/String;
    //   167: iconst_0
    //   168: invokevirtual 153	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   171: invokestatic 159	com/tencent/mm/sdk/platformtools/w:e	(Landroid/content/SharedPreferences;)Ljava/lang/String;
    //   174: astore_2
    //   175: invokestatic 162	com/tencent/mm/sdk/platformtools/w:chP	()Ljava/lang/String;
    //   178: astore 4
    //   180: aload_2
    //   181: ldc -92
    //   183: invokevirtual 169	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   186: ifeq +69 -> 255
    //   189: aload 6
    //   191: aload 4
    //   193: putfield 172	com/tencent/mm/protocal/c/ced:iwP	Ljava/lang/String;
    //   196: aload 6
    //   198: invokevirtual 176	com/tencent/mm/protocal/c/ced:toByteArray	()[B
    //   201: astore_2
    //   202: invokestatic 102	com/tencent/mm/plugin/wear/model/a:bSl	()Lcom/tencent/mm/plugin/wear/model/a;
    //   205: getfield 106	com/tencent/mm/plugin/wear/model/a:pIM	Lcom/tencent/mm/plugin/wear/model/d;
    //   208: aload_2
    //   209: invokevirtual 179	com/tencent/mm/plugin/wear/model/d:bc	([B)[B
    //   212: astore_2
    //   213: aload_2
    //   214: ifnull +70 -> 284
    //   217: aload_0
    //   218: aload 5
    //   220: putfield 181	com/tencent/mm/plugin/wear/model/e/i:pJT	Lcom/tencent/mm/protocal/c/cec;
    //   223: new 183	com/tencent/mm/g/a/tq
    //   226: dup
    //   227: invokespecial 184	com/tencent/mm/g/a/tq:<init>	()V
    //   230: astore 4
    //   232: aload 4
    //   234: getfield 188	com/tencent/mm/g/a/tq:cfq	Lcom/tencent/mm/g/a/tq$a;
    //   237: bipush 9
    //   239: putfield 191	com/tencent/mm/g/a/tq$a:bIH	I
    //   242: getstatic 92	com/tencent/mm/sdk/b/a:sFg	Lcom/tencent/mm/sdk/b/a;
    //   245: aload 4
    //   247: invokestatic 197	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   250: invokevirtual 201	com/tencent/mm/sdk/b/a:a	(Lcom/tencent/mm/sdk/b/b;Landroid/os/Looper;)V
    //   253: aload_2
    //   254: areturn
    //   255: aload 6
    //   257: aload_2
    //   258: putfield 172	com/tencent/mm/protocal/c/ced:iwP	Ljava/lang/String;
    //   261: goto -65 -> 196
    //   264: astore_2
    //   265: ldc -53
    //   267: aload_2
    //   268: ldc -51
    //   270: iconst_0
    //   271: anewarray 207	java/lang/Object
    //   274: invokestatic 213	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   277: aconst_null
    //   278: areturn
    //   279: astore 4
    //   281: goto -144 -> 137
    //   284: aconst_null
    //   285: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	286	0	this	i
    //   0	286	1	paramInt	int
    //   0	286	2	paramArrayOfByte	byte[]
    //   123	5	3	bool	boolean
    //   23	223	4	localObject	Object
    //   279	1	4	localInterruptedException	InterruptedException
    //   85	134	5	localcec	cec
    //   101	155	6	localced	com.tencent.mm.protocal.c.ced
    // Exception table:
    //   from	to	target	type
    //   78	103	264	java/io/IOException
    //   115	124	264	java/io/IOException
    //   131	137	264	java/io/IOException
    //   144	152	264	java/io/IOException
    //   154	196	264	java/io/IOException
    //   196	213	264	java/io/IOException
    //   217	253	264	java/io/IOException
    //   255	261	264	java/io/IOException
    //   131	137	279	java/lang/InterruptedException
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/wear/model/e/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */