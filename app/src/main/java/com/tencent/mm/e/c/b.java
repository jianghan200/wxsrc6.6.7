package com.tencent.mm.e.c;

import com.tencent.mm.sdk.platformtools.x;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class b
{
  DataOutputStream bFA;
  int bFB;
  public String mFilePath;
  
  public b(String paramString, int paramInt1, int paramInt2)
  {
    this.mFilePath = paramString;
    paramString = new File(paramString);
    try
    {
      paramString.createNewFile();
      this.bFA = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(paramString)));
      paramString = ByteBuffer.allocate(44);
      paramString.order(ByteOrder.LITTLE_ENDIAN);
      paramString.putInt(1179011410);
      paramString.putInt(0);
      paramString.putInt(1163280727);
      paramString.putInt(544501094);
      paramString.putInt(16);
      paramString.putShort((short)1);
      paramString.putShort((short)paramInt1);
      paramString.putInt(paramInt2);
      paramString.putInt(paramInt2 * paramInt1 * 2);
      paramString.putShort((short)(paramInt1 * 2));
      paramString.putShort((short)16);
      paramString.putInt(1635017060);
      paramString.putInt(0);
      this.bFB = 44;
      this.bFA.write(paramString.array());
      return;
    }
    catch (IOException paramString)
    {
      x.e("MicroMsg.PcmWriter", "create file failed: " + paramString.getMessage());
    }
  }
  
  public final boolean w(byte[] paramArrayOfByte, int paramInt)
  {
    if (this.bFA == null) {
      return false;
    }
    try
    {
      this.bFA.write(paramArrayOfByte, 0, paramInt);
      this.bFB += paramInt;
      return true;
    }
    catch (Exception paramArrayOfByte)
    {
      x.e("MicroMsg.PcmWriter", "write to file failed: " + paramArrayOfByte.getMessage());
    }
    return false;
  }
  
  /* Error */
  public final void wC()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 43	com/tencent/mm/e/c/b:bFA	Ljava/io/DataOutputStream;
    //   4: invokevirtual 121	java/io/DataOutputStream:close	()V
    //   7: new 123	java/io/RandomAccessFile
    //   10: dup
    //   11: aload_0
    //   12: getfield 19	com/tencent/mm/e/c/b:mFilePath	Ljava/lang/String;
    //   15: ldc 125
    //   17: invokespecial 127	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   20: astore_2
    //   21: aload_2
    //   22: astore_1
    //   23: aload_2
    //   24: ldc2_w 128
    //   27: invokevirtual 133	java/io/RandomAccessFile:seek	(J)V
    //   30: aload_2
    //   31: astore_1
    //   32: iconst_4
    //   33: invokestatic 49	java/nio/ByteBuffer:allocate	(I)Ljava/nio/ByteBuffer;
    //   36: astore_3
    //   37: aload_2
    //   38: astore_1
    //   39: aload_3
    //   40: getstatic 55	java/nio/ByteOrder:LITTLE_ENDIAN	Ljava/nio/ByteOrder;
    //   43: invokevirtual 59	java/nio/ByteBuffer:order	(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   46: pop
    //   47: aload_2
    //   48: astore_1
    //   49: aload_3
    //   50: aload_0
    //   51: getfield 72	com/tencent/mm/e/c/b:bFB	I
    //   54: bipush 8
    //   56: isub
    //   57: invokevirtual 63	java/nio/ByteBuffer:putInt	(I)Ljava/nio/ByteBuffer;
    //   60: pop
    //   61: aload_2
    //   62: astore_1
    //   63: aload_2
    //   64: aload_3
    //   65: invokevirtual 76	java/nio/ByteBuffer:array	()[B
    //   68: invokevirtual 134	java/io/RandomAccessFile:write	([B)V
    //   71: aload_2
    //   72: astore_1
    //   73: aload_3
    //   74: invokevirtual 138	java/nio/ByteBuffer:rewind	()Ljava/nio/Buffer;
    //   77: pop
    //   78: aload_2
    //   79: astore_1
    //   80: aload_3
    //   81: aload_0
    //   82: getfield 72	com/tencent/mm/e/c/b:bFB	I
    //   85: bipush 42
    //   87: isub
    //   88: invokevirtual 63	java/nio/ByteBuffer:putInt	(I)Ljava/nio/ByteBuffer;
    //   91: pop
    //   92: aload_2
    //   93: astore_1
    //   94: aload_2
    //   95: ldc2_w 139
    //   98: invokevirtual 133	java/io/RandomAccessFile:seek	(J)V
    //   101: aload_2
    //   102: astore_1
    //   103: aload_2
    //   104: aload_3
    //   105: invokevirtual 76	java/nio/ByteBuffer:array	()[B
    //   108: invokevirtual 134	java/io/RandomAccessFile:write	([B)V
    //   111: aload_2
    //   112: invokevirtual 141	java/io/RandomAccessFile:close	()V
    //   115: return
    //   116: astore_1
    //   117: ldc 82
    //   119: new 84	java/lang/StringBuilder
    //   122: dup
    //   123: ldc -113
    //   125: invokespecial 87	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   128: aload_1
    //   129: invokevirtual 91	java/io/IOException:getMessage	()Ljava/lang/String;
    //   132: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   138: invokestatic 104	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   141: goto -134 -> 7
    //   144: astore_1
    //   145: ldc 82
    //   147: aload_1
    //   148: ldc -111
    //   150: iconst_0
    //   151: anewarray 4	java/lang/Object
    //   154: invokestatic 149	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   157: return
    //   158: astore_3
    //   159: aconst_null
    //   160: astore_2
    //   161: aload_2
    //   162: astore_1
    //   163: ldc 82
    //   165: aload_3
    //   166: ldc -111
    //   168: iconst_0
    //   169: anewarray 4	java/lang/Object
    //   172: invokestatic 149	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   175: aload_2
    //   176: ifnull -61 -> 115
    //   179: aload_2
    //   180: invokevirtual 141	java/io/RandomAccessFile:close	()V
    //   183: return
    //   184: astore_1
    //   185: ldc 82
    //   187: aload_1
    //   188: ldc -111
    //   190: iconst_0
    //   191: anewarray 4	java/lang/Object
    //   194: invokestatic 149	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   197: return
    //   198: astore_3
    //   199: aconst_null
    //   200: astore_2
    //   201: aload_2
    //   202: astore_1
    //   203: ldc 82
    //   205: aload_3
    //   206: ldc -111
    //   208: iconst_0
    //   209: anewarray 4	java/lang/Object
    //   212: invokestatic 149	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   215: aload_2
    //   216: ifnull -101 -> 115
    //   219: aload_2
    //   220: invokevirtual 141	java/io/RandomAccessFile:close	()V
    //   223: return
    //   224: astore_1
    //   225: ldc 82
    //   227: aload_1
    //   228: ldc -111
    //   230: iconst_0
    //   231: anewarray 4	java/lang/Object
    //   234: invokestatic 149	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   237: return
    //   238: astore_2
    //   239: aconst_null
    //   240: astore_1
    //   241: aload_1
    //   242: ifnull +7 -> 249
    //   245: aload_1
    //   246: invokevirtual 141	java/io/RandomAccessFile:close	()V
    //   249: aload_2
    //   250: athrow
    //   251: astore_1
    //   252: ldc 82
    //   254: aload_1
    //   255: ldc -111
    //   257: iconst_0
    //   258: anewarray 4	java/lang/Object
    //   261: invokestatic 149	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   264: goto -15 -> 249
    //   267: astore_2
    //   268: goto -27 -> 241
    //   271: astore_3
    //   272: goto -71 -> 201
    //   275: astore_3
    //   276: goto -115 -> 161
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	279	0	this	b
    //   22	81	1	localRandomAccessFile1	java.io.RandomAccessFile
    //   116	13	1	localIOException1	IOException
    //   144	4	1	localIOException2	IOException
    //   162	1	1	localRandomAccessFile2	java.io.RandomAccessFile
    //   184	4	1	localIOException3	IOException
    //   202	1	1	localRandomAccessFile3	java.io.RandomAccessFile
    //   224	4	1	localIOException4	IOException
    //   240	6	1	localObject1	Object
    //   251	4	1	localIOException5	IOException
    //   20	200	2	localRandomAccessFile4	java.io.RandomAccessFile
    //   238	12	2	localObject2	Object
    //   267	1	2	localObject3	Object
    //   36	69	3	localByteBuffer	ByteBuffer
    //   158	8	3	localFileNotFoundException1	java.io.FileNotFoundException
    //   198	8	3	localIOException6	IOException
    //   271	1	3	localIOException7	IOException
    //   275	1	3	localFileNotFoundException2	java.io.FileNotFoundException
    // Exception table:
    //   from	to	target	type
    //   0	7	116	java/io/IOException
    //   111	115	144	java/io/IOException
    //   7	21	158	java/io/FileNotFoundException
    //   179	183	184	java/io/IOException
    //   7	21	198	java/io/IOException
    //   219	223	224	java/io/IOException
    //   7	21	238	finally
    //   245	249	251	java/io/IOException
    //   23	30	267	finally
    //   32	37	267	finally
    //   39	47	267	finally
    //   49	61	267	finally
    //   63	71	267	finally
    //   73	78	267	finally
    //   80	92	267	finally
    //   94	101	267	finally
    //   103	111	267	finally
    //   163	175	267	finally
    //   203	215	267	finally
    //   23	30	271	java/io/IOException
    //   32	37	271	java/io/IOException
    //   39	47	271	java/io/IOException
    //   49	61	271	java/io/IOException
    //   63	71	271	java/io/IOException
    //   73	78	271	java/io/IOException
    //   80	92	271	java/io/IOException
    //   94	101	271	java/io/IOException
    //   103	111	271	java/io/IOException
    //   23	30	275	java/io/FileNotFoundException
    //   32	37	275	java/io/FileNotFoundException
    //   39	47	275	java/io/FileNotFoundException
    //   49	61	275	java/io/FileNotFoundException
    //   63	71	275	java/io/FileNotFoundException
    //   73	78	275	java/io/FileNotFoundException
    //   80	92	275	java/io/FileNotFoundException
    //   94	101	275	java/io/FileNotFoundException
    //   103	111	275	java/io/FileNotFoundException
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/e/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */