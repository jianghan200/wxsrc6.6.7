package com.tencent.liteav.muxer;

import android.content.Context;
import android.media.MediaFormat;
import com.tencent.liteav.basic.log.TXCLog;

public class c
  implements a
{
  private int a = 0;
  private a b;
  
  public c(Context paramContext, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      if (a(paramContext))
      {
        this.a = 0;
        this.b = new d();
        TXCLog.i("TXCMP4Muxer", "TXCMP4Muxer: use sw model ");
        return;
      }
      break;
    case 0: 
      this.a = 0;
      this.b = new d();
      TXCLog.i("TXCMP4Muxer", "TXCMP4Muxer: use sw model ");
      return;
    case 1: 
      this.a = 1;
      this.b = new b();
      TXCLog.i("TXCMP4Muxer", "TXCMP4Muxer: use hw model ");
      return;
    }
    this.a = 1;
    this.b = new b();
    TXCLog.i("TXCMP4Muxer", "TXCMP4Muxer: use hw model ");
  }
  
  public static boolean a(Context paramContext)
  {
    com.tencent.liteav.basic.e.b.a().a(paramContext);
    return com.tencent.liteav.basic.e.b.a().e() == 1;
  }
  
  public int a()
  {
    return this.b.a();
  }
  
  public void a(MediaFormat paramMediaFormat)
  {
    this.b.a(paramMediaFormat);
  }
  
  public void a(String paramString)
  {
    this.b.a(paramString);
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, long paramLong, int paramInt3)
  {
    this.b.a(paramArrayOfByte, paramInt1, paramInt2, paramLong, paramInt3);
  }
  
  public int b()
  {
    return this.b.b();
  }
  
  public void b(MediaFormat paramMediaFormat)
  {
    this.b.b(paramMediaFormat);
  }
  
  public void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, long paramLong, int paramInt3)
  {
    this.b.b(paramArrayOfByte, paramInt1, paramInt2, paramLong, paramInt3);
  }
  
  public boolean c()
  {
    return this.b.c();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/liteav/muxer/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */