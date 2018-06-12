package com.google.android.exoplayer2.h;

import android.net.Uri;
import com.google.android.exoplayer2.i.a;
import java.util.Arrays;

public final class i
{
  public final byte[] aAI;
  public final long aAJ;
  public final long aAK;
  public final String aAL;
  public final int flags;
  public final long position;
  public final Uri uri;
  
  public i(Uri paramUri)
  {
    this(paramUri, (byte)0);
  }
  
  public i(Uri paramUri, byte paramByte)
  {
    this(paramUri, 0L, 0L, -1L, 1);
  }
  
  public i(Uri paramUri, long paramLong1, long paramLong2)
  {
    this(paramUri, paramLong1, paramLong1, paramLong2, 0);
  }
  
  private i(Uri paramUri, long paramLong1, long paramLong2, long paramLong3, int paramInt)
  {
    this(paramUri, null, paramLong1, paramLong2, paramLong3, null, paramInt);
  }
  
  private i(Uri paramUri, byte[] paramArrayOfByte, long paramLong1, long paramLong2, long paramLong3, String paramString, int paramInt)
  {
    if (paramLong1 >= 0L)
    {
      bool = true;
      a.ao(bool);
      if (paramLong2 < 0L) {
        break label103;
      }
      bool = true;
      label28:
      a.ao(bool);
      if ((paramLong3 <= 0L) && (paramLong3 != -1L)) {
        break label109;
      }
    }
    label103:
    label109:
    for (boolean bool = true;; bool = false)
    {
      a.ao(bool);
      this.uri = paramUri;
      this.aAI = paramArrayOfByte;
      this.aAJ = paramLong1;
      this.position = paramLong2;
      this.aAK = paramLong3;
      this.aAL = paramString;
      this.flags = paramInt;
      return;
      bool = false;
      break;
      bool = false;
      break label28;
    }
  }
  
  public final i R(long paramLong)
  {
    long l = -1L;
    if (this.aAK == -1L) {}
    while ((paramLong == 0L) && (this.aAK == l))
    {
      return this;
      l = this.aAK - paramLong;
    }
    return new i(this.uri, this.aAI, this.aAJ + paramLong, this.position + paramLong, l, this.aAL, this.flags);
  }
  
  public final boolean lQ()
  {
    return (this.flags & 0x1) == 1;
  }
  
  public final String toString()
  {
    return "DataSpec[" + this.uri + ", " + Arrays.toString(this.aAI) + ", " + this.aAJ + ", " + this.position + ", " + this.aAK + ", " + this.aAL + ", " + this.flags + "]";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/exoplayer2/h/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */