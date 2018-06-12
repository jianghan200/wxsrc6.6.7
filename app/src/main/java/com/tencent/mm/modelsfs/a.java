package com.tencent.mm.modelsfs;

import com.tencent.mm.plugin.imgenc.MMIMAGEENCJNI;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class a
{
  private static boolean eet = false;
  private long eeu = 0L;
  private String eev;
  private long eew = 0L;
  private long mNativePtr = 0L;
  
  public a(long paramLong)
  {
    this.eev = String.valueOf(paramLong);
    init();
  }
  
  public a(String paramString)
  {
    this.eev = paramString;
    init();
  }
  
  private void init()
  {
    x.i("MicroMsg.EncEngine", "init  key  enckey " + this.eev + "  hashcode " + hashCode());
    this.mNativePtr = MMIMAGEENCJNI.open(this.eev);
    try
    {
      x.i("MicroMsg.EncEngine", "mNativePtr " + this.mNativePtr + " " + hashCode());
      return;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.EncEngine", "exception " + localException.getMessage());
    }
  }
  
  public final long QF()
  {
    this.eew = this.eeu;
    return this.eew;
  }
  
  public final void free()
  {
    x.i("MicroMsg.EncEngine", "free mNativePtr: " + this.mNativePtr + " hashcode " + hashCode());
    MMIMAGEENCJNI.free(this.mNativePtr);
    this.mNativePtr = 0L;
  }
  
  public final void reset()
  {
    x.i("MicroMsg.EncEngine", "reset " + bi.cjd());
    free();
    if (this.eew == 0L)
    {
      init();
      this.eeu = 0L;
      return;
    }
    init();
    MMIMAGEENCJNI.seek(this.mNativePtr, this.eew, 1);
    this.eeu = this.eew;
  }
  
  public final void seek(long paramLong)
  {
    this.eeu = paramLong;
    MMIMAGEENCJNI.seek(this.mNativePtr, paramLong, 1);
  }
  
  public final int y(byte[] paramArrayOfByte, int paramInt)
  {
    if (this.mNativePtr == 0L) {
      x.i("MicroMsg.EncEngine", "transFor " + bi.cjd().toString());
    }
    if (eet) {
      x.i("MicroMsg.EncEngine", "trans for  " + hashCode() + " " + paramArrayOfByte.length);
    }
    if ((eet) && (this.eeu < 64L)) {
      x.d("MicroMsg.EncEngine", "dump before _offset " + this.eeu + "  length:" + paramInt + " " + bi.bB(paramArrayOfByte) + " hashcode " + hashCode());
    }
    MMIMAGEENCJNI.transFor(this.mNativePtr, paramArrayOfByte, this.eeu, paramInt);
    if ((eet) && (this.eeu < 64L)) {
      x.d("MicroMsg.EncEngine", "dump after _offset " + this.eeu + "  length:" + paramInt + " " + bi.bB(paramArrayOfByte) + " hashcode " + hashCode());
    }
    this.eeu += paramInt;
    return paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/modelsfs/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */