package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.map.lib.f;
import com.tencent.map.lib.gl.JNICallback.b;
import com.tencent.map.lib.gl.JNICallback.c;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class kw
  implements JNICallback.b, JNICallback.c, kz.b
{
  private WeakReference<ks> a;
  private WeakReference<f> b;
  private ky c;
  private ll d;
  private r e = null;
  private int f = Integer.MIN_VALUE;
  private volatile ExecutorService g = null;
  
  public kw(ks paramks)
  {
    this.a = new WeakReference(paramks);
    this.b = new WeakReference(paramks.getMap());
    this.e = r.a(paramks.getContext().getApplicationContext());
    this.c = new ky(this.e);
    this.d = ll.a(paramks.getContext().getApplicationContext());
  }
  
  private boolean a(String paramString)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramString != null)
    {
      bool1 = bool2;
      if (paramString.length() > 0)
      {
        paramString = Pattern.compile("version=\\d+").matcher(paramString);
        bool1 = bool2;
        if (paramString.find())
        {
          paramString = paramString.group();
          bool1 = bool2;
          if (Integer.parseInt(paramString.substring(paramString.indexOf("=") + 1)) == this.e.w()) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  public int a()
  {
    if ((this.b != null) && (this.b.get() != null))
    {
      this.f = ((f)this.b.get()).B();
      ((f)this.b.get()).e(18);
    }
    return this.f;
  }
  
  public Bitmap a(byte[] paramArrayOfByte)
  {
    if (this.a.get() == null) {}
    do
    {
      return null;
      localObject1 = new ng();
      ((ng)localObject1).a(paramArrayOfByte);
      Object localObject2 = new nc(((ng)localObject1).a(), ((ng)localObject1).b(), ((ng)localObject1).c(), "handdrawmap");
      localObject2 = this.d.a((nc)localObject2);
      if (localObject2 != null) {
        return (Bitmap)localObject2;
      }
      localObject1 = this.c.a(((ng)localObject1).a(), ((ng)localObject1).b(), ((ng)localObject1).c());
    } while (localObject1 == null);
    Object localObject1 = ((String)localObject1).getBytes();
    Arrays.fill(paramArrayOfByte, (byte)0);
    System.arraycopy(localObject1, 0, paramArrayOfByte, 0, localObject1.length);
    return null;
  }
  
  public void a(JNICallback.b paramb)
  {
    if ((this.b != null) && (this.b.get() != null)) {
      ((f)this.b.get()).a(paramb);
    }
  }
  
  public void a(JNICallback.c paramc)
  {
    if ((this.b != null) && (this.b.get() != null)) {
      ((f)this.b.get()).a(paramc);
    }
  }
  
  public void a(String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if ((paramArrayOfByte2 == null) || (paramArrayOfByte1 == null) || (paramArrayOfByte2.length == 0) || (paramArrayOfByte1.length == 0)) {
      return;
    }
    if (this.g == null) {}
    try
    {
      if (this.g == null) {
        this.g = Executors.newSingleThreadExecutor();
      }
      this.g.execute(new kw.1(this, paramString, paramArrayOfByte1, paramArrayOfByte2));
      return;
    }
    finally {}
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      c();
    }
  }
  
  public void b()
  {
    if ((this.b != null) && (this.b.get() != null)) {
      ((f)this.b.get()).g(this.f);
    }
  }
  
  public void c()
  {
    if ((this.b != null) && (this.b.get() != null) && (this.f != Integer.MIN_VALUE)) {
      ((f)this.b.get()).h(this.f);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/kw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */