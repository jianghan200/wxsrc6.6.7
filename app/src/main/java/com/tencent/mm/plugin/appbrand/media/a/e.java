package com.tencent.mm.plugin.appbrand.media.a;

import com.tencent.mm.plugin.appbrand.appcache.ag;
import com.tencent.mm.plugin.appbrand.appcache.ag.a;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.z.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class e
  implements d
{
  private static aa<String, Integer> ghN = new aa(50);
  private static aa<String, Integer> ghO = new aa(50);
  private static aa<String, Integer> ghP = new aa(50);
  private long currentPosition;
  private String ffK;
  private int fhe = -1;
  private String filePath;
  private int ghQ = -1;
  public RandomAccessFile randomAccessFile;
  
  public e(String paramString1, String paramString2)
  {
    this.filePath = paramString1;
    this.ffK = paramString2;
    this.randomAccessFile = bC(paramString1, paramString2);
    if ((ghN.bb(paramString1)) && (ghO.bb(paramString1)))
    {
      this.ghQ = ((Integer)ghN.get(paramString1)).intValue();
      this.fhe = ((Integer)ghO.get(paramString1)).intValue();
      return;
    }
    if (bi.oW(paramString2))
    {
      x.e("MicroMsg.WxaAudioDataSourceBelow19", "pkgpath is null, return");
      return;
    }
    paramString2 = new ag(new File(paramString2));
    if (!paramString2.fgX)
    {
      paramString2.close();
      x.e("MicroMsg.WxaAudioDataSourceBelow19", "pkg invalid");
      return;
    }
    if (!paramString2.abW())
    {
      paramString2.close();
      x.e("MicroMsg.WxaAudioDataSourceBelow19", "pkg readInfo failed");
      return;
    }
    ag.a locala = paramString2.qM(paramString1);
    if (locala == null)
    {
      paramString2.close();
      x.e("MicroMsg.WxaAudioDataSourceBelow19", "info is null, err");
      return;
    }
    if ((locala.fhf <= 0) || (locala.fhe <= 0))
    {
      paramString2.close();
      x.e("MicroMsg.WxaAudioDataSourceBelow19", "info.resLength or info.fileOffset, err");
      return;
    }
    this.ghQ = locala.fhf;
    this.fhe = locala.fhe;
    ghN.put(paramString1, Integer.valueOf(this.ghQ));
    ghO.put(paramString1, Integer.valueOf(this.fhe));
    paramString2.close();
  }
  
  private RandomAccessFile bC(String paramString1, String paramString2)
  {
    if (bi.oW(paramString2)) {
      x.e("MicroMsg.WxaAudioDataSourceBelow19", "pkgpath is null, return");
    }
    do
    {
      return null;
      x.i("MicroMsg.WxaAudioDataSourceBelow19", "filePath:%s, resLength:%d, fileOffset:%d", new Object[] { paramString1, Integer.valueOf(this.ghQ), Integer.valueOf(this.fhe) });
      try
      {
        if (!new File(paramString2).exists())
        {
          x.e("MicroMsg.WxaAudioDataSourceBelow19", "file pkgPath:%s isn't exist ", new Object[] { paramString2 });
          return null;
        }
      }
      catch (FileNotFoundException paramString1)
      {
        x.printErrStackTrace("MicroMsg.WxaAudioDataSourceBelow19", paramString1, "", new Object[0]);
        return null;
        paramString2 = new RandomAccessFile(paramString2, "r");
      }
      catch (IOException paramString1)
      {
        try
        {
          x.d("MicroMsg.WxaAudioDataSourceBelow19", "randomAccessFile.length:%d", new Object[] { Long.valueOf(paramString2.length()) });
          return paramString2;
        }
        catch (IOException paramString1)
        {
          for (;;) {}
        }
        paramString1 = paramString1;
        paramString2 = null;
      }
      x.printErrStackTrace("MicroMsg.WxaAudioDataSourceBelow19", paramString1, "", new Object[0]);
    } while (paramString2 == null);
    try
    {
      paramString2.close();
      return null;
    }
    catch (IOException paramString1)
    {
      return null;
    }
  }
  
  public final int Kn()
  {
    int j = 0;
    if (this.randomAccessFile == null) {
      this.randomAccessFile = bC(this.filePath, this.ffK);
    }
    int i;
    if (ghP.bb(this.filePath)) {
      i = ((Integer)ghP.get(this.filePath)).intValue();
    }
    do
    {
      do
      {
        return i;
        if (this.randomAccessFile == null)
        {
          x.e("MicroMsg.WxaAudioDataSourceBelow19", "[getAudioType] inputStream is null");
          return 0;
        }
        if (this.filePath.toLowerCase().endsWith(".mp3"))
        {
          x.d("MicroMsg.WxaAudioDataSourceBelow19", "[getAudioType] mp3");
          return 2;
        }
        if (this.filePath.toLowerCase().contains(".wav"))
        {
          x.d("MicroMsg.WxaAudioDataSourceBelow19", "[getAudioType] wav");
          return 3;
        }
        if (this.filePath.toLowerCase().contains(".ogg"))
        {
          x.d("MicroMsg.WxaAudioDataSourceBelow19", "[getAudioType] ogg");
          return 4;
        }
        try
        {
          localObject1 = new byte[64];
          this.randomAccessFile.seek(this.fhe);
          this.randomAccessFile.read((byte[])localObject1);
          localObject1 = new String((byte[])localObject1);
        }
        catch (Exception localException)
        {
          for (;;)
          {
            Object localObject1;
            x.e("MicroMsg.WxaAudioDataSourceBelow19", "getAudioType", new Object[] { localException });
            this.randomAccessFile.seek(this.fhe);
            Object localObject2 = null;
          }
        }
        finally
        {
          this.randomAccessFile.seek(this.fhe);
        }
        i = j;
      } while (localObject1 == null);
      i = j;
    } while (!((String)localObject1).contains("ftyp"));
    x.d("MicroMsg.WxaAudioDataSourceBelow19", "[getAudioType] aac");
    ghP.put(this.filePath, Integer.valueOf(1));
    return 1;
  }
  
  public final void close()
  {
    if (this.randomAccessFile != null)
    {
      x.i("MicroMsg.WxaAudioDataSourceBelow19", "close %d", new Object[] { Integer.valueOf(hashCode()) });
      this.randomAccessFile.close();
      this.randomAccessFile = null;
    }
  }
  
  public final long getSize()
  {
    if (this.randomAccessFile == null)
    {
      x.e("MicroMsg.WxaAudioDataSourceBelow19", "[getSize] randomAccessFile is null");
      return 0L;
    }
    return this.ghQ;
  }
  
  public final boolean isOpen()
  {
    return (this.randomAccessFile != null) || (this.ghQ == -1) || (this.fhe == -1);
  }
  
  public final void open()
  {
    x.i("MicroMsg.WxaAudioDataSourceBelow19", "open %d", new Object[] { Integer.valueOf(hashCode()) });
    if (this.randomAccessFile == null) {
      this.randomAccessFile = bC(this.filePath, this.ffK);
    }
    this.currentPosition = 0L;
    if (this.randomAccessFile != null) {
      this.randomAccessFile.seek(this.fhe);
    }
  }
  
  public final int readAt(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.randomAccessFile == null)
    {
      x.e("MicroMsg.WxaAudioDataSourceBelow19", "[readAt]randomAccessFile is null");
      return -1;
    }
    if (this.currentPosition != paramLong)
    {
      this.randomAccessFile.seek(this.fhe + paramLong);
      this.currentPosition = paramLong;
    }
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
    {
      x.e("MicroMsg.WxaAudioDataSourceBelow19", "[readAt]bytes is null");
      return -1;
    }
    if ((paramLong < 0L) || (paramInt1 < 0) || (paramInt2 <= 0))
    {
      x.e("MicroMsg.WxaAudioDataSourceBelow19", "position:%d, offset:%d, size:%d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      return -1;
    }
    if ((paramArrayOfByte != null) && (paramInt1 + paramInt2 > paramArrayOfByte.length))
    {
      x.e("MicroMsg.WxaAudioDataSourceBelow19", "offset:%d, size:%d, bytes.length:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramArrayOfByte.length) });
      return -1;
    }
    if (paramLong >= this.ghQ)
    {
      x.e("MicroMsg.WxaAudioDataSourceBelow19", "position:%d resLength:%d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(this.ghQ) });
      return -1;
    }
    int i = paramInt2;
    if (paramInt2 + paramLong >= this.ghQ)
    {
      x.e("MicroMsg.WxaAudioDataSourceBelow19", "position:%d, size:%d, resLength:%d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt2), Integer.valueOf(this.ghQ) });
      i = (int)(this.ghQ - paramLong);
    }
    paramInt1 = this.randomAccessFile.read(paramArrayOfByte, paramInt1, i);
    if (paramInt1 >= 0)
    {
      this.currentPosition += paramInt1;
      return paramInt1;
    }
    x.e("MicroMsg.WxaAudioDataSourceBelow19", "read:%d err", new Object[] { Integer.valueOf(paramInt1) });
    return paramInt1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/appbrand/media/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */