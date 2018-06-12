package com.tencent.mm.plugin.appbrand.media.a;

import com.tencent.mm.plugin.appbrand.appcache.ag;
import com.tencent.mm.plugin.appbrand.l.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class d
  implements com.tencent.mm.z.d
{
  private long currentPosition;
  private String ffK;
  private String filePath;
  public a ghM = null;
  
  public d(String paramString1, String paramString2)
  {
    this.filePath = paramString1;
    this.ffK = paramString2;
    this.ghM = bB(paramString1, paramString2);
  }
  
  private static a bB(String paramString1, String paramString2)
  {
    long l = System.nanoTime();
    if (bi.oW(paramString2))
    {
      x.e("MicroMsg.WxaAudioDataSource", "pkgpath is null, return");
      return null;
    }
    paramString2 = new ag(new File(paramString2));
    if (!paramString2.fgX)
    {
      paramString2.close();
      x.e("MicroMsg.WxaAudioDataSource", "pkg invalid");
      return null;
    }
    if (!paramString2.abW())
    {
      paramString2.close();
      x.e("MicroMsg.WxaAudioDataSource", "pkg readInfo failed");
      return null;
    }
    InputStream localInputStream = paramString2.qN(paramString1);
    if (localInputStream == null)
    {
      paramString2.close();
      x.e("MicroMsg.WxaAudioDataSource", "inputstream for %s is null", new Object[] { paramString1 });
      return null;
    }
    paramString2.close();
    x.d("MicroMsg.WxaAudioDataSource", "time:%d", new Object[] { Long.valueOf(System.nanoTime() - l) });
    return (a)localInputStream;
  }
  
  public final int Kn()
  {
    if (this.ghM == null) {
      this.ghM = bB(this.filePath, this.ffK);
    }
    if (this.ghM == null) {
      x.e("MicroMsg.WxaAudioDataSource", "[getAudioType] inputStream is null");
    }
    do
    {
      return 0;
      if (this.filePath.toLowerCase().endsWith(".mp3"))
      {
        x.d("MicroMsg.WxaAudioDataSource", "[getAudioType] mp3");
        return 2;
      }
      if (this.filePath.toLowerCase().contains(".wav"))
      {
        x.d("MicroMsg.WxaAudioDataSource", "[getAudioType] wav");
        return 3;
      }
      if (this.filePath.toLowerCase().contains(".ogg"))
      {
        x.d("MicroMsg.WxaAudioDataSource", "[getAudioType] ogg");
        return 4;
      }
      try
      {
        localObject1 = new byte[64];
        this.ghM.seek(0);
        this.ghM.read((byte[])localObject1);
        localObject1 = new String((byte[])localObject1);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          Object localObject1;
          x.e("MicroMsg.WxaAudioDataSource", "getAudioType", new Object[] { localException });
          this.ghM.seek(0);
          Object localObject2 = null;
        }
      }
      finally
      {
        this.ghM.seek(0);
      }
    } while ((localObject1 == null) || (!((String)localObject1).contains("ftyp")));
    x.d("MicroMsg.WxaAudioDataSource", "[getAudioType] aac");
    return 1;
  }
  
  public final void close()
  {
    if (this.ghM != null)
    {
      x.i("MicroMsg.WxaAudioDataSource", "close");
      this.ghM.close();
      this.ghM = null;
    }
  }
  
  public final long getSize()
  {
    if (this.ghM == null)
    {
      x.e("MicroMsg.WxaAudioDataSource", "[getSize] inputStream is null");
      return 0L;
    }
    return this.ghM.gqu.limit();
  }
  
  public final boolean isOpen()
  {
    return this.ghM != null;
  }
  
  public final void open()
  {
    x.i("MicroMsg.WxaAudioDataSource", "open");
    if (this.ghM == null) {
      this.ghM = bB(this.filePath, this.ffK);
    }
    this.currentPosition = 0L;
    if (this.ghM != null) {
      this.ghM.seek(0);
    }
  }
  
  public final int readAt(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = -1;
    if (this.ghM == null)
    {
      x.e("MicroMsg.WxaAudioDataSource", "[readAt]inputstream is null");
      paramInt1 = i;
    }
    do
    {
      return paramInt1;
      if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
      {
        x.e("MicroMsg.WxaAudioDataSource", "[readAt]bytes is null");
        return -1;
      }
      if ((paramLong < 0L) || (paramInt1 < 0) || (paramInt2 <= 0))
      {
        x.e("MicroMsg.WxaAudioDataSource", "position:%d, offset:%d, size:%d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        return -1;
      }
      if ((paramArrayOfByte != null) && (paramInt1 + paramInt2 > paramArrayOfByte.length))
      {
        x.e("MicroMsg.WxaAudioDataSource", "offset:%d, size:%d, bytes.length:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramArrayOfByte.length) });
        return -1;
      }
      if (paramInt2 + paramLong > getSize()) {
        x.e("MicroMsg.WxaAudioDataSource", "position:%d, size:%d, getSize():%d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt2), Long.valueOf(getSize()) });
      }
      if (this.currentPosition != paramLong)
      {
        this.ghM.seek((int)paramLong);
        this.currentPosition = paramLong;
      }
      paramInt2 = this.ghM.read(paramArrayOfByte, paramInt1, paramInt2);
      paramInt1 = paramInt2;
    } while (paramInt2 < 0);
    this.currentPosition += paramInt2;
    return paramInt2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/appbrand/media/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */