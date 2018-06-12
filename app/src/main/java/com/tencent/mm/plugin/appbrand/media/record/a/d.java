package com.tencent.mm.plugin.appbrand.media.record.a;

import com.tencent.mm.plugin.appbrand.media.encode.Mp3EncodeJni;
import com.tencent.mm.plugin.appbrand.media.record.f;
import com.tencent.mm.plugin.appbrand.media.record.h;
import com.tencent.mm.sdk.platformtools.x;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public final class d
  extends b
{
  private int ehg = 2;
  private byte[] gjc;
  private FileOutputStream mFileOutputStream;
  private String mFilePath = "";
  
  public final boolean a(boolean paramBoolean, byte[] paramArrayOfByte, int paramInt)
  {
    paramBoolean = true;
    if (this.giY <= 0)
    {
      x.e("MicroMsg.Record.MP3AudioEncoder", "mMinBufferSize %d is invalid", new Object[] { Integer.valueOf(this.giY) });
      return false;
    }
    if (this.mFileOutputStream == null)
    {
      x.e("MicroMsg.Record.MP3AudioEncoder", "mFileOutputStream is null");
      return false;
    }
    if (this.gjc == null)
    {
      i = (int)(7200.0D + this.giY * this.ehg * 1.25D);
      x.i("MicroMsg.Record.MP3AudioEncoder", "channelCnt:%d, mMinBufferSize:%d, size:%d, ", new Object[] { Integer.valueOf(this.ehg), Integer.valueOf(this.giY), Integer.valueOf(i) });
      this.gjc = new byte[i];
    }
    paramArrayOfByte = f.E(paramArrayOfByte, paramInt);
    int i = Mp3EncodeJni.encode(paramArrayOfByte, paramArrayOfByte, paramInt / 2, this.gjc);
    x.d("MicroMsg.Record.MP3AudioEncoder", "len:%d, shorts.len:%d, encodedSize:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(i) });
    if (i > 0) {
      x.d("MicroMsg.Record.MP3AudioEncoder", "encodeSize:%d, len:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt) });
    }
    for (;;)
    {
      try
      {
        this.mFileOutputStream.write(this.gjc, 0, i);
        d(this.gjc, i, false);
        return paramBoolean;
      }
      catch (IOException paramArrayOfByte)
      {
        x.printErrStackTrace("MicroMsg.Record.MP3AudioEncoder", paramArrayOfByte, "encode write", new Object[0]);
        h.li(20);
        paramBoolean = false;
        continue;
      }
      x.e("MicroMsg.Record.MP3AudioEncoder", "Mp3EncodeJni encode fail, encodedSize:%d", new Object[] { Integer.valueOf(i) });
      paramBoolean = false;
    }
  }
  
  public final void close()
  {
    x.i("MicroMsg.Record.MP3AudioEncoder", "close");
    Mp3EncodeJni.close();
    if (this.mFileOutputStream != null) {}
    try
    {
      this.mFileOutputStream.close();
      this.mFileOutputStream = null;
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.Record.MP3AudioEncoder", localIOException, "close", new Object[0]);
        h.li(20);
      }
    }
  }
  
  public final boolean e(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = true;
    x.i("MicroMsg.Record.MP3AudioEncoder", "init, filePath:%s, sampleRate:%d, channelCount:%d, bitRate:%d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mFilePath = paramString;
    this.ehg = paramInt2;
    paramInt1 = Mp3EncodeJni.init(paramInt1, paramInt2, paramInt1, paramInt3 / 1000, 5);
    x.i("MicroMsg.Record.MP3AudioEncoder", "Mp3EncodeJni.init ret :%d", new Object[] { Integer.valueOf(paramInt1) });
    if (paramInt1 == -1)
    {
      h.li(17);
      return false;
    }
    x.i("MicroMsg.Record.MP3AudioEncoder", "lame MPEG version:%d", new Object[] { Integer.valueOf(Mp3EncodeJni.getVersion()) });
    try
    {
      this.mFileOutputStream = new FileOutputStream(paramString);
      return bool;
    }
    catch (FileNotFoundException paramString)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.Record.MP3AudioEncoder", paramString, "init", new Object[0]);
        h.li(18);
        bool = false;
      }
    }
  }
  
  public final void flush()
  {
    x.i("MicroMsg.Record.MP3AudioEncoder", "flush");
    if ((this.mFileOutputStream == null) || (this.gjc == null))
    {
      x.e("MicroMsg.Record.MP3AudioEncoder", "flush, mFileOutputStream or mMp3Buffer is null");
      return;
    }
    int i = Mp3EncodeJni.flush(this.gjc);
    if (i > 0) {
      try
      {
        this.mFileOutputStream.write(this.gjc, 0, i);
        d(this.gjc, i, true);
        return;
      }
      catch (IOException localIOException)
      {
        x.printErrStackTrace("MicroMsg.Record.MP3AudioEncoder", localIOException, "flush write", new Object[0]);
        h.li(20);
        return;
      }
    }
    x.e("MicroMsg.Record.MP3AudioEncoder", "flush fail, flushResult:%d", new Object[] { Integer.valueOf(i) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/media/record/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */