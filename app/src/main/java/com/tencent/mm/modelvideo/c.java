package com.tencent.mm.modelvideo;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import com.tencent.mm.k.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.x;

public final class c
{
  public static final int els = ;
  String bOX = null;
  Context context = null;
  int duration = 0;
  public a elt = null;
  String elu = null;
  final AsyncTask<String, Integer, String> elv = new AsyncTask()
  {
    int ret = 0;
    
    /* Error */
    private String SI()
    {
      // Byte code:
      //   0: aload_0
      //   1: iconst_0
      //   2: putfield 20	com/tencent/mm/modelvideo/c$1:ret	I
      //   5: invokestatic 31	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
      //   8: invokestatic 37	com/tencent/mm/sdk/platformtools/ao:is2G	(Landroid/content/Context;)Z
      //   11: istore_3
      //   12: aload_0
      //   13: getfield 15	com/tencent/mm/modelvideo/c$1:elw	Lcom/tencent/mm/modelvideo/c;
      //   16: getfield 41	com/tencent/mm/modelvideo/c:context	Landroid/content/Context;
      //   19: aload_0
      //   20: getfield 15	com/tencent/mm/modelvideo/c$1:elw	Lcom/tencent/mm/modelvideo/c;
      //   23: getfield 45	com/tencent/mm/modelvideo/c:intent	Landroid/content/Intent;
      //   26: invokestatic 51	com/tencent/mm/compatible/j/a:j	(Landroid/content/Context;Landroid/content/Intent;)Lcom/tencent/mm/compatible/j/a$a;
      //   29: astore 4
      //   31: aload 4
      //   33: ifnonnull +59 -> 92
      //   36: ldc 53
      //   38: ldc 55
      //   40: invokestatic 61	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   43: getstatic 67	com/tencent/mm/plugin/report/service/h:mEJ	Lcom/tencent/mm/plugin/report/service/h;
      //   46: ldc2_w 68
      //   49: ldc2_w 70
      //   52: lconst_1
      //   53: iconst_0
      //   54: invokevirtual 75	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
      //   57: aload_0
      //   58: ldc 76
      //   60: putfield 20	com/tencent/mm/modelvideo/c$1:ret	I
      //   63: aconst_null
      //   64: areturn
      //   65: astore 4
      //   67: ldc 53
      //   69: ldc 78
      //   71: iconst_1
      //   72: anewarray 80	java/lang/Object
      //   75: dup
      //   76: iconst_0
      //   77: aload 4
      //   79: invokestatic 86	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
      //   82: aastore
      //   83: invokestatic 89	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   86: aconst_null
      //   87: astore 4
      //   89: goto -58 -> 31
      //   92: aload_0
      //   93: getfield 15	com/tencent/mm/modelvideo/c$1:elw	Lcom/tencent/mm/modelvideo/c;
      //   96: aload 4
      //   98: getfield 95	com/tencent/mm/compatible/j/a$a:filename	Ljava/lang/String;
      //   101: putfield 98	com/tencent/mm/modelvideo/c:elu	Ljava/lang/String;
      //   104: aload_0
      //   105: getfield 15	com/tencent/mm/modelvideo/c$1:elw	Lcom/tencent/mm/modelvideo/c;
      //   108: getfield 98	com/tencent/mm/modelvideo/c:elu	Ljava/lang/String;
      //   111: invokestatic 104	com/tencent/mm/a/e:cm	(Ljava/lang/String;)I
      //   114: istore_2
      //   115: ldc 53
      //   117: ldc 106
      //   119: iconst_4
      //   120: anewarray 80	java/lang/Object
      //   123: dup
      //   124: iconst_0
      //   125: iload_3
      //   126: invokestatic 112	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
      //   129: aastore
      //   130: dup
      //   131: iconst_1
      //   132: iload_2
      //   133: invokestatic 117	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   136: aastore
      //   137: dup
      //   138: iconst_2
      //   139: aload 4
      //   141: getfield 120	com/tencent/mm/compatible/j/a$a:duration	I
      //   144: invokestatic 117	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   147: aastore
      //   148: dup
      //   149: iconst_3
      //   150: aload_0
      //   151: getfield 15	com/tencent/mm/modelvideo/c$1:elw	Lcom/tencent/mm/modelvideo/c;
      //   154: getfield 98	com/tencent/mm/modelvideo/c:elu	Ljava/lang/String;
      //   157: aastore
      //   158: invokestatic 122	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   161: iload_2
      //   162: ifgt +25 -> 187
      //   165: getstatic 67	com/tencent/mm/plugin/report/service/h:mEJ	Lcom/tencent/mm/plugin/report/service/h;
      //   168: ldc2_w 68
      //   171: ldc2_w 70
      //   174: lconst_1
      //   175: iconst_0
      //   176: invokevirtual 75	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
      //   179: aload_0
      //   180: ldc 123
      //   182: putfield 20	com/tencent/mm/modelvideo/c$1:ret	I
      //   185: aconst_null
      //   186: areturn
      //   187: iload_3
      //   188: ifeq +33 -> 221
      //   191: ldc 124
      //   193: istore_1
      //   194: iload_2
      //   195: iload_1
      //   196: if_icmple +32 -> 228
      //   199: getstatic 67	com/tencent/mm/plugin/report/service/h:mEJ	Lcom/tencent/mm/plugin/report/service/h;
      //   202: ldc2_w 68
      //   205: ldc2_w 125
      //   208: lconst_1
      //   209: iconst_0
      //   210: invokevirtual 75	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
      //   213: aload_0
      //   214: ldc 127
      //   216: putfield 20	com/tencent/mm/modelvideo/c$1:ret	I
      //   219: aconst_null
      //   220: areturn
      //   221: getstatic 130	com/tencent/mm/modelvideo/c:els	I
      //   224: istore_1
      //   225: goto -31 -> 194
      //   228: aload_0
      //   229: getfield 15	com/tencent/mm/modelvideo/c$1:elw	Lcom/tencent/mm/modelvideo/c;
      //   232: getfield 98	com/tencent/mm/modelvideo/c:elu	Ljava/lang/String;
      //   235: aload_0
      //   236: getfield 15	com/tencent/mm/modelvideo/c$1:elw	Lcom/tencent/mm/modelvideo/c;
      //   239: getfield 133	com/tencent/mm/modelvideo/c:videoPath	Ljava/lang/String;
      //   242: iconst_0
      //   243: invokestatic 139	com/tencent/mm/sdk/platformtools/j:q	(Ljava/lang/String;Ljava/lang/String;Z)Z
      //   246: pop
      //   247: aload_0
      //   248: getfield 15	com/tencent/mm/modelvideo/c$1:elw	Lcom/tencent/mm/modelvideo/c;
      //   251: aload 4
      //   253: getfield 120	com/tencent/mm/compatible/j/a$a:duration	I
      //   256: sipush 1000
      //   259: idiv
      //   260: putfield 140	com/tencent/mm/modelvideo/c:duration	I
      //   263: iconst_1
      //   264: istore_2
      //   265: iconst_1
      //   266: istore_1
      //   267: aload 4
      //   269: getfield 144	com/tencent/mm/compatible/j/a$a:bitmap	Landroid/graphics/Bitmap;
      //   272: ifnull +40 -> 312
      //   275: aload 4
      //   277: getfield 144	com/tencent/mm/compatible/j/a$a:bitmap	Landroid/graphics/Bitmap;
      //   280: bipush 60
      //   282: getstatic 150	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
      //   285: aload_0
      //   286: getfield 15	com/tencent/mm/modelvideo/c$1:elw	Lcom/tencent/mm/modelvideo/c;
      //   289: getfield 153	com/tencent/mm/modelvideo/c:bOX	Ljava/lang/String;
      //   292: iconst_1
      //   293: invokestatic 158	com/tencent/mm/sdk/platformtools/c:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
      //   296: getstatic 67	com/tencent/mm/plugin/report/service/h:mEJ	Lcom/tencent/mm/plugin/report/service/h;
      //   299: ldc2_w 68
      //   302: ldc2_w 159
      //   305: lconst_1
      //   306: iconst_0
      //   307: invokevirtual 75	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
      //   310: iconst_0
      //   311: istore_1
      //   312: iload_1
      //   313: ifeq +44 -> 357
      //   316: getstatic 67	com/tencent/mm/plugin/report/service/h:mEJ	Lcom/tencent/mm/plugin/report/service/h;
      //   319: ldc2_w 68
      //   322: ldc2_w 161
      //   325: lconst_1
      //   326: iconst_0
      //   327: invokevirtual 75	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
      //   330: ldc -93
      //   332: sipush 320
      //   335: sipush 480
      //   338: invokestatic 167	com/tencent/mm/sdk/platformtools/c:ah	(III)Landroid/graphics/Bitmap;
      //   341: bipush 60
      //   343: getstatic 150	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
      //   346: aload_0
      //   347: getfield 15	com/tencent/mm/modelvideo/c$1:elw	Lcom/tencent/mm/modelvideo/c;
      //   350: getfield 153	com/tencent/mm/modelvideo/c:bOX	Ljava/lang/String;
      //   353: iconst_1
      //   354: invokestatic 158	com/tencent/mm/sdk/platformtools/c:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
      //   357: aload_0
      //   358: getfield 15	com/tencent/mm/modelvideo/c$1:elw	Lcom/tencent/mm/modelvideo/c;
      //   361: getfield 133	com/tencent/mm/modelvideo/c:videoPath	Ljava/lang/String;
      //   364: invokestatic 171	com/tencent/mm/a/e:cn	(Ljava/lang/String;)Z
      //   367: ifne +9 -> 376
      //   370: aload_0
      //   371: ldc -84
      //   373: putfield 20	com/tencent/mm/modelvideo/c$1:ret	I
      //   376: aload_0
      //   377: getfield 15	com/tencent/mm/modelvideo/c$1:elw	Lcom/tencent/mm/modelvideo/c;
      //   380: getfield 153	com/tencent/mm/modelvideo/c:bOX	Ljava/lang/String;
      //   383: invokestatic 171	com/tencent/mm/a/e:cn	(Ljava/lang/String;)Z
      //   386: ifne +9 -> 395
      //   389: aload_0
      //   390: ldc -83
      //   392: putfield 20	com/tencent/mm/modelvideo/c$1:ret	I
      //   395: aconst_null
      //   396: areturn
      //   397: astore 4
      //   399: iload_2
      //   400: istore_1
      //   401: ldc 53
      //   403: ldc 78
      //   405: iconst_1
      //   406: anewarray 80	java/lang/Object
      //   409: dup
      //   410: iconst_0
      //   411: aload 4
      //   413: invokestatic 86	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
      //   416: aastore
      //   417: invokestatic 89	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   420: goto -108 -> 312
      //   423: astore 4
      //   425: ldc 53
      //   427: ldc 78
      //   429: iconst_1
      //   430: anewarray 80	java/lang/Object
      //   433: dup
      //   434: iconst_0
      //   435: aload 4
      //   437: invokestatic 86	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
      //   440: aastore
      //   441: invokestatic 89	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   444: goto -87 -> 357
      //   447: astore 4
      //   449: iconst_0
      //   450: istore_1
      //   451: goto -50 -> 401
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	454	0	this	1
      //   193	258	1	i	int
      //   114	286	2	j	int
      //   11	177	3	bool	boolean
      //   29	3	4	locala	com.tencent.mm.compatible.j.a.a
      //   65	13	4	localException1	Exception
      //   87	189	4	localObject	Object
      //   397	15	4	localException2	Exception
      //   423	13	4	localException3	Exception
      //   447	1	4	localException4	Exception
      // Exception table:
      //   from	to	target	type
      //   12	31	65	java/lang/Exception
      //   275	296	397	java/lang/Exception
      //   316	357	423	java/lang/Exception
      //   296	310	447	java/lang/Exception
    }
  };
  String fileName = null;
  Intent intent = null;
  String videoPath = null;
  
  public final void a(Context paramContext, Intent paramIntent, a parama)
  {
    this.context = paramContext;
    this.intent = paramIntent;
    this.fileName = s.nJ((String)g.Ei().DT().get(2, ""));
    o.Ta();
    this.bOX = s.nL(this.fileName);
    o.Ta();
    this.videoPath = s.nK(this.fileName);
    this.elt = parama;
    this.elv.execute(new String[0]);
  }
  
  public static abstract interface a
  {
    public abstract void b(int paramInt1, String paramString1, String paramString2, int paramInt2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/modelvideo/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */