package com.tencent.mm.plugin.mmsight.model.a;

import com.tencent.mm.sdk.platformtools.x;

public final class m
  implements e
{
  private int audioSampleRate;
  private int bitrate;
  private int jdD;
  private int lhM;
  private float liV;
  private String lje;
  
  public m(int paramInt1, String paramString, float paramFloat, int paramInt2, int paramInt3, int paramInt4)
  {
    this.lhM = paramInt1;
    this.lje = paramString;
    this.liV = paramFloat;
    this.bitrate = paramInt2;
    this.jdD = paramInt3;
    this.audioSampleRate = paramInt4;
    x.d("MicroMsg.MMSightMP4Muxer", "create MMSightMP4Muxer, bufId: %s, recordPath: %s, fps: %s, bitrate: %s, videoDuration: %s, audioSampleRate%s", new Object[] { Integer.valueOf(paramInt1), paramString, Float.valueOf(paramFloat), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
  }
  
  /* Error */
  public final boolean bev()
  {
    // Byte code:
    //   0: invokestatic 64	com/tencent/mm/sdk/platformtools/bi:VG	()J
    //   3: lstore_2
    //   4: aload_0
    //   5: getfield 24	com/tencent/mm/plugin/mmsight/model/a/m:lje	Ljava/lang/String;
    //   8: invokestatic 70	com/tencent/mm/plugin/sight/base/d:Lm	(Ljava/lang/String;)Ljava/lang/String;
    //   11: astore 5
    //   13: aload 5
    //   15: invokestatic 76	com/tencent/mm/modelsfs/FileOp:cn	(Ljava/lang/String;)Z
    //   18: istore 4
    //   20: iload 4
    //   22: ifne +6 -> 28
    //   25: aconst_null
    //   26: astore 5
    //   28: ldc 34
    //   30: ldc 78
    //   32: iconst_2
    //   33: anewarray 4	java/lang/Object
    //   36: dup
    //   37: iconst_0
    //   38: aload_0
    //   39: getfield 22	com/tencent/mm/plugin/mmsight/model/a/m:lhM	I
    //   42: invokestatic 42	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   45: aastore
    //   46: dup
    //   47: iconst_1
    //   48: aload 5
    //   50: aastore
    //   51: invokestatic 81	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   54: aload_0
    //   55: getfield 22	com/tencent/mm/plugin/mmsight/model/a/m:lhM	I
    //   58: aload 5
    //   60: aload_0
    //   61: getfield 32	com/tencent/mm/plugin/mmsight/model/a/m:audioSampleRate	I
    //   64: sipush 1024
    //   67: iconst_2
    //   68: iconst_1
    //   69: lconst_0
    //   70: aload_0
    //   71: getfield 24	com/tencent/mm/plugin/mmsight/model/a/m:lje	Ljava/lang/String;
    //   74: aload_0
    //   75: getfield 26	com/tencent/mm/plugin/mmsight/model/a/m:liV	F
    //   78: sipush 1000
    //   81: aload_0
    //   82: getfield 30	com/tencent/mm/plugin/mmsight/model/a/m:jdD	I
    //   85: invokestatic 87	java/lang/Math:max	(II)I
    //   88: aload_0
    //   89: getfield 28	com/tencent/mm/plugin/mmsight/model/a/m:bitrate	I
    //   92: getstatic 92	com/tencent/mm/plugin/sight/base/b:nbT	I
    //   95: bipush 8
    //   97: iconst_2
    //   98: ldc 93
    //   100: aconst_null
    //   101: iconst_0
    //   102: iconst_0
    //   103: invokestatic 99	com/tencent/mm/plugin/sight/base/SightVideoJNI:muxing	(ILjava/lang/String;IIIIJLjava/lang/String;FIIIIIF[BIZ)I
    //   106: istore_1
    //   107: ldc 34
    //   109: ldc 101
    //   111: iconst_2
    //   112: anewarray 4	java/lang/Object
    //   115: dup
    //   116: iconst_0
    //   117: iload_1
    //   118: invokestatic 42	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   121: aastore
    //   122: dup
    //   123: iconst_1
    //   124: lload_2
    //   125: invokestatic 105	com/tencent/mm/sdk/platformtools/bi:bI	(J)J
    //   128: invokestatic 110	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   131: aastore
    //   132: invokestatic 81	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   135: aload 5
    //   137: invokestatic 113	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   140: ifne +9 -> 149
    //   143: aload 5
    //   145: invokestatic 116	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
    //   148: pop
    //   149: iload_1
    //   150: iflt +13 -> 163
    //   153: iconst_1
    //   154: ireturn
    //   155: astore 5
    //   157: aconst_null
    //   158: astore 5
    //   160: goto -132 -> 28
    //   163: iconst_0
    //   164: ireturn
    //   165: astore 5
    //   167: goto -18 -> 149
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	170	0	this	m
    //   106	44	1	i	int
    //   3	122	2	l	long
    //   18	3	4	bool	boolean
    //   11	133	5	str	String
    //   155	1	5	localException1	Exception
    //   158	1	5	localObject	Object
    //   165	1	5	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   13	20	155	java/lang/Exception
    //   143	149	165	java/lang/Exception
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/mmsight/model/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */