package com.tencent.mm.plugin.music.cache;

import com.tencent.mm.plugin.music.d.a;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class f
{
  public String fileName;
  private String mUrl;
  public RandomAccessFile randomAccessFile = null;
  
  public f(String paramString)
  {
    this.mUrl = paramString;
    this.fileName = a.IF(this.mUrl);
    x.i("MicroMsg.PieceFileCache", "PieceFileCache mUrl:%s, fileName:%s,", new Object[] { this.mUrl, this.fileName });
  }
  
  public static void deleteFile(String paramString)
  {
    Logger.i("MicroMsg.PieceFileCache", "deleteFile, fileName:" + paramString);
    paramString = new File(paramString);
    if (paramString.exists())
    {
      Logger.i("MicroMsg.PieceFileCache", "delete the piece File");
      paramString.delete();
      return;
    }
    Logger.e("MicroMsg.PieceFileCache", "file not exist, delete piece File fail");
  }
  
  public final int b(byte[] paramArrayOfByte, long paramLong, int paramInt)
  {
    int i = -1;
    if (paramInt == 0) {}
    for (;;)
    {
      try
      {
        Logger.e("MicroMsg.PieceFileCache", "read error, length == 0");
        paramInt = i;
        return paramInt;
      }
      finally {}
      if (this.randomAccessFile == null)
      {
        Logger.e("MicroMsg.PieceFileCache", "read error, randomAccessFile is null");
        paramInt = i;
      }
      else
      {
        try
        {
          this.randomAccessFile.seek(paramLong);
          int j = this.randomAccessFile.read(paramArrayOfByte, 0, paramInt);
          paramInt = j;
        }
        catch (IOException localIOException)
        {
          Logger.e("MicroMsg.PieceFileCache", String.format("Error reading %d bytes with offset %d from file[%d bytes] to buffer[%d bytes]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong), Integer.valueOf(getLength()), Integer.valueOf(paramArrayOfByte.length) }));
          paramInt = i;
        }
      }
    }
  }
  
  /* Error */
  public final long bhM()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 59	java/io/File
    //   5: dup
    //   6: aload_0
    //   7: getfield 26	com/tencent/mm/plugin/music/cache/f:fileName	Ljava/lang/String;
    //   10: invokespecial 60	java/io/File:<init>	(Ljava/lang/String;)V
    //   13: astore_3
    //   14: aload_3
    //   15: invokevirtual 64	java/io/File:exists	()Z
    //   18: ifeq +12 -> 30
    //   21: aload_3
    //   22: invokevirtual 120	java/io/File:length	()J
    //   25: lstore_1
    //   26: aload_0
    //   27: monitorexit
    //   28: lload_1
    //   29: lreturn
    //   30: ldc2_w 121
    //   33: lstore_1
    //   34: goto -8 -> 26
    //   37: astore_3
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_3
    //   41: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	42	0	this	f
    //   25	9	1	l	long
    //   13	9	3	localFile	File
    //   37	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	26	37	finally
  }
  
  public final boolean c(byte[] paramArrayOfByte, long paramLong, int paramInt)
  {
    boolean bool = false;
    if (paramInt == 0) {}
    for (;;)
    {
      try
      {
        Logger.e("MicroMsg.PieceFileCache", "write error, length == 0");
        return bool;
      }
      finally {}
      if (this.randomAccessFile == null) {
        Logger.e("MicroMsg.PieceFileCache", "write error, randomAccessFile is null");
      } else {
        try
        {
          this.randomAccessFile.seek(paramLong);
          this.randomAccessFile.write(paramArrayOfByte, 0, paramInt);
          bool = true;
        }
        catch (IOException localIOException)
        {
          Logger.e("MicroMsg.PieceFileCache", String.format("Error writing %d bytes to from buffer with size %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfByte.length) }));
        }
      }
    }
  }
  
  /* Error */
  public final void close()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 28
    //   4: ldc -120
    //   6: invokestatic 57	com/tencent/qqmusic/mediaplayer/util/Logger:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   9: aload_0
    //   10: getfield 16	com/tencent/mm/plugin/music/cache/f:randomAccessFile	Ljava/io/RandomAccessFile;
    //   13: astore_1
    //   14: aload_1
    //   15: ifnull +10 -> 25
    //   18: aload_0
    //   19: getfield 16	com/tencent/mm/plugin/music/cache/f:randomAccessFile	Ljava/io/RandomAccessFile;
    //   22: invokevirtual 138	java/io/RandomAccessFile:close	()V
    //   25: aload_0
    //   26: monitorexit
    //   27: return
    //   28: astore_1
    //   29: ldc 28
    //   31: ldc -116
    //   33: iconst_1
    //   34: anewarray 4	java/lang/Object
    //   37: dup
    //   38: iconst_0
    //   39: new 40	java/lang/StringBuilder
    //   42: dup
    //   43: invokespecial 141	java/lang/StringBuilder:<init>	()V
    //   46: aload_1
    //   47: invokevirtual 144	java/io/IOException:getMessage	()Ljava/lang/String;
    //   50: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   56: aastore
    //   57: invokestatic 146	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   60: goto -35 -> 25
    //   63: astore_1
    //   64: aload_0
    //   65: monitorexit
    //   66: aload_1
    //   67: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	68	0	this	f
    //   13	2	1	localRandomAccessFile	RandomAccessFile
    //   28	19	1	localIOException	IOException
    //   63	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   18	25	28	java/io/IOException
    //   2	14	63	finally
    //   18	25	63	finally
    //   29	60	63	finally
  }
  
  /* Error */
  public final int getLength()
  {
    // Byte code:
    //   0: iconst_m1
    //   1: istore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 16	com/tencent/mm/plugin/music/cache/f:randomAccessFile	Ljava/io/RandomAccessFile;
    //   8: ifnonnull +14 -> 22
    //   11: ldc 28
    //   13: ldc -108
    //   15: invokestatic 74	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   18: aload_0
    //   19: monitorexit
    //   20: iload_1
    //   21: ireturn
    //   22: aload_0
    //   23: getfield 16	com/tencent/mm/plugin/music/cache/f:randomAccessFile	Ljava/io/RandomAccessFile;
    //   26: invokevirtual 149	java/io/RandomAccessFile:length	()J
    //   29: lstore_2
    //   30: lload_2
    //   31: l2i
    //   32: istore_1
    //   33: goto -15 -> 18
    //   36: astore 4
    //   38: ldc 28
    //   40: ldc -105
    //   42: iconst_1
    //   43: anewarray 4	java/lang/Object
    //   46: dup
    //   47: iconst_0
    //   48: new 40	java/lang/StringBuilder
    //   51: dup
    //   52: invokespecial 141	java/lang/StringBuilder:<init>	()V
    //   55: aload 4
    //   57: invokevirtual 144	java/io/IOException:getMessage	()Ljava/lang/String;
    //   60: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   66: aastore
    //   67: invokestatic 146	com/tencent/qqmusic/mediaplayer/util/Logger:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   70: goto -52 -> 18
    //   73: astore 4
    //   75: aload_0
    //   76: monitorexit
    //   77: aload 4
    //   79: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	80	0	this	f
    //   1	32	1	i	int
    //   29	2	2	l	long
    //   36	20	4	localIOException	IOException
    //   73	5	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   22	30	36	java/io/IOException
    //   4	18	73	finally
    //   22	30	73	finally
    //   38	70	73	finally
  }
  
  public final void setLength(long paramLong)
  {
    for (;;)
    {
      try
      {
        if (this.randomAccessFile == null)
        {
          Logger.e("MicroMsg.PieceFileCache", "setLength error, randomAccessFile is null");
          return;
        }
        if (paramLong <= 0L)
        {
          Logger.e("MicroMsg.PieceFileCache", "setLength error, length is " + paramLong);
          continue;
        }
      }
      finally {}
      tmp62_59[0] = String.valueOf(paramLong);
      Logger.e("MicroMsg.PieceFileCache", "set file length %s ", tmp62_59);
      try
      {
        this.randomAccessFile.setLength(paramLong);
      }
      catch (IOException localIOException)
      {
        Logger.e("MicroMsg.PieceFileCache", "Error set length of file, err %s", new Object[] { localIOException.getMessage() });
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/music/cache/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */