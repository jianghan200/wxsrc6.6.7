package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Bitmap;
import com.tencent.map.lib.gl.JNICallback.b;
import com.tencent.map.lib.gl.JNICallback.c;
import javax.microedition.khronos.opengles.GL10;

public class kx
  extends ke
  implements JNICallback.b, JNICallback.c, kz.b
{
  private int a;
  private kw b;
  
  public kx(kw paramkw)
  {
    this.b = paramkw;
    this.b.a(this);
    this.b.a(this);
    this.a = paramkw.a();
    new StringBuilder("tileOverlayId:").append(this.a);
  }
  
  public Bitmap a(byte[] paramArrayOfByte)
  {
    if (this.b != null) {
      return this.b.a(paramArrayOfByte);
    }
    return null;
  }
  
  public void a(String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (this.b != null) {
      this.b.a(paramString, paramArrayOfByte1, paramArrayOfByte2);
    }
  }
  
  public void a(GL10 paramGL10) {}
  
  public void a(boolean paramBoolean)
  {
    if (this.b != null) {
      this.b.a(paramBoolean);
    }
  }
  
  public boolean a()
  {
    return false;
  }
  
  public boolean a(float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public void b() {}
  
  public void c() {}
  
  public void d()
  {
    e();
  }
  
  public void e()
  {
    if (this.b != null) {
      this.b.b();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/kx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */