package com.tencent.tinker.d.a;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.zip.ZipException;

public final class h
  extends FilterOutputStream
{
  public static final byte[] vwm = new byte[0];
  private static final byte[] vwn = { -1, -1, -1, -1 };
  private long mb = 0L;
  private final HashSet<String> vwo = new HashSet();
  private final boolean vwp = false;
  public byte[] vwq = vwm;
  private int vwr = 8;
  private ByteArrayOutputStream vws = new ByteArrayOutputStream();
  private f vwt;
  private byte[] vwu;
  private byte[] vwv;
  private boolean vww;
  
  public h(OutputStream paramOutputStream)
  {
    this(paramOutputStream, (byte)0);
  }
  
  private h(OutputStream paramOutputStream, byte paramByte)
  {
    super(paramOutputStream);
  }
  
  private static long c(OutputStream paramOutputStream, long paramLong)
  {
    paramOutputStream.write((int)(0xFF & paramLong));
    paramOutputStream.write((int)(paramLong >> 8) & 0xFF);
    paramOutputStream.write((int)(paramLong >> 16) & 0xFF);
    paramOutputStream.write((int)(paramLong >> 24) & 0xFF);
    return paramLong;
  }
  
  private void cHm()
  {
    if (this.vws == null) {
      throw new IOException("Stream is closed");
    }
  }
  
  private static int d(OutputStream paramOutputStream, int paramInt)
  {
    paramOutputStream.write(paramInt & 0xFF);
    paramOutputStream.write(paramInt >> 8 & 0xFF);
    return paramInt;
  }
  
  public static void y(String paramString, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length > 65535) {
      throw new IllegalArgumentException(paramString + " too long in UTF-8:" + paramArrayOfByte.length + " bytes");
    }
  }
  
  public final void b(f paramf)
  {
    if (this.vwt != null) {
      closeEntry();
    }
    int i = paramf.vwc;
    if (i == -1) {
      i = this.vwr;
    }
    for (;;)
    {
      if (i == 0)
      {
        if (paramf.vwb == -1L) {
          paramf.vwb = paramf.size;
        }
        while (paramf.vvR == -1L)
        {
          throw new ZipException("STORED entry missing CRC");
          if (paramf.size == -1L) {
            paramf.setSize(paramf.vwb);
          }
        }
        if (paramf.size == -1L) {
          throw new ZipException("STORED entry missing size");
        }
        if (paramf.size != paramf.vwb) {
          throw new ZipException("STORED entry size/compressed size mismatch");
        }
      }
      cHm();
      paramf.sla = null;
      paramf.vwe = null;
      paramf.time = 40691;
      paramf.vwd = 18698;
      this.vwu = paramf.name.getBytes(d.UTF_8);
      y("Name", this.vwu);
      this.vwv = vwm;
      if (paramf.sla != null)
      {
        this.vwv = paramf.sla.getBytes(d.UTF_8);
        y("Comment", this.vwv);
      }
      paramf.setMethod(i);
      this.vwt = paramf;
      this.vwt.vwf = this.mb;
      this.vwo.add(this.vwt.name);
      int j;
      if (i == 0)
      {
        j = 0;
        c(this.out, 67324752L);
        d(this.out, 20);
        d(this.out, j | 0x800);
        d(this.out, i);
        d(this.out, this.vwt.time);
        d(this.out, this.vwt.vwd);
        if (i != 0) {
          break label467;
        }
        c(this.out, this.vwt.vvR);
        c(this.out, this.vwt.size);
        c(this.out, this.vwt.size);
        label386:
        d(this.out, this.vwu.length);
        if (this.vwt.vwe == null) {
          break label497;
        }
        d(this.out, this.vwt.vwe.length);
      }
      for (;;)
      {
        this.out.write(this.vwu);
        if (this.vwt.vwe != null) {
          this.out.write(this.vwt.vwe);
        }
        return;
        j = 8;
        break;
        label467:
        c(this.out, 0L);
        c(this.out, 0L);
        c(this.out, 0L);
        break label386;
        label497:
        d(this.out, 0);
      }
    }
  }
  
  public final void close()
  {
    int i;
    if (this.out != null)
    {
      if (this.out == null) {
        throw new IOException("Stream is closed");
      }
      if (this.vws != null)
      {
        if (this.vwo.isEmpty()) {
          throw new ZipException("No entries");
        }
        if (this.vwt != null) {
          closeEntry();
        }
        i = this.vws.size();
        c(this.vws, 101010256L);
        d(this.vws, 0);
        d(this.vws, 0);
        if (!this.vww) {
          break label209;
        }
        d(this.vws, 65535);
        d(this.vws, 65535);
        c(this.vws, -1L);
        c(this.vws, -1L);
      }
    }
    for (;;)
    {
      d(this.vws, this.vwq.length);
      if (this.vwq.length > 0) {
        this.vws.write(this.vwq);
      }
      this.vws.writeTo(this.out);
      this.vws = null;
      this.out.close();
      this.out = null;
      return;
      label209:
      d(this.vws, this.vwo.size());
      d(this.vws, this.vwo.size());
      c(this.vws, i);
      c(this.vws, this.mb);
    }
  }
  
  public final void closeEntry()
  {
    cHm();
    if (this.vwt == null) {
      return;
    }
    long l = 30L;
    if (this.vwt.vwc != 0)
    {
      l = 46L;
      c(this.out, 134695760L);
      c(this.out, this.vwt.vvR);
      c(this.out, this.vwt.vwb);
      c(this.out, this.vwt.size);
    }
    int i;
    if (this.vwt.vwc == 0)
    {
      i = 0;
      c(this.vws, 33639248L);
      d(this.vws, 20);
      d(this.vws, 20);
      d(this.vws, i | 0x800);
      d(this.vws, this.vwt.vwc);
      d(this.vws, this.vwt.time);
      d(this.vws, this.vwt.vwd);
      c(this.vws, this.vwt.vvR);
      if (this.vwt.vwc != 8) {
        break label442;
      }
      l += this.vwt.vwb;
      label224:
      c(this.vws, this.vwt.vwb);
      c(this.vws, this.vwt.size);
      l += d(this.vws, this.vwu.length);
      if (this.vwt.vwe == null) {
        break label455;
      }
      l += d(this.vws, this.vwt.vwe.length);
    }
    for (;;)
    {
      d(this.vws, this.vwv.length);
      d(this.vws, 0);
      d(this.vws, 0);
      c(this.vws, 0L);
      c(this.vws, this.vwt.vwf);
      this.vws.write(this.vwu);
      this.vwu = null;
      if (this.vwt.vwe != null) {
        this.vws.write(this.vwt.vwe);
      }
      this.mb = (l + this.mb);
      if (this.vwv.length > 0)
      {
        this.vws.write(this.vwv);
        this.vwv = vwm;
      }
      this.vwt = null;
      return;
      i = 8;
      break;
      label442:
      l += this.vwt.size;
      break label224;
      label455:
      d(this.vws, 0);
    }
  }
  
  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    a.at(paramArrayOfByte.length, paramInt1, paramInt2);
    if (this.vwt == null) {
      throw new ZipException("No active entry");
    }
    this.out.write(paramArrayOfByte, paramInt1, paramInt2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tinker/d/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */