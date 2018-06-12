package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.map.lib.f;
import com.tencent.map.lib.gl.JNICallback.j;
import com.tencent.map.lib.gl.JNICallback.k;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.microedition.khronos.opengles.GL10;

public class lm
  extends ke
  implements JNICallback.j, JNICallback.k, hb, hc, he
{
  public static final String d = Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry();
  nj a;
  public final int b = 512;
  boolean c;
  private WeakReference<ks> e;
  private la f;
  private ll g;
  private int h = -1;
  private lo i;
  private volatile ExecutorService j = null;
  
  public lm(ks paramks, lo paramlo, nj paramnj, boolean paramBoolean)
  {
    this.g = ll.a(paramks.getContext().getApplicationContext());
    a(paramks, paramlo, paramnj);
    this.h = paramks.getMap().e(paramBoolean);
  }
  
  private void a(ks paramks, lo paramlo, nj paramnj)
  {
    this.e = new WeakReference(paramks);
    this.i = paramlo;
    this.a = paramnj;
    this.f = new la(paramks);
    paramks.getMap().a(this);
    paramks.getMap().a(this);
    paramks.getMap().a(this);
    paramks.getMap().a(this);
    paramks.getMap().a(this);
    ln.a(false);
  }
  
  private boolean a(String paramString)
  {
    int k;
    int m;
    if ((paramString != null) && (paramString.length() > 0))
    {
      if ((paramString.contains("world")) || (paramString.contains("oversea"))) {
        break label77;
      }
      k = 1;
      if ((!paramString.contains("world")) && (!paramString.contains("oversea"))) {
        break label82;
      }
      m = 1;
      label51:
      paramString = this.i.c().a();
      if ((k == 0) || ("taiwanmap".equals(paramString))) {
        break label87;
      }
    }
    label77:
    label82:
    label87:
    while ((m != 0) && (!"bingmap".equals(paramString)) && (!"googlemap".equals(paramString)))
    {
      return false;
      k = 0;
      break;
      m = 0;
      break label51;
    }
    return true;
  }
  
  private boolean b(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0))
    {
      if ((!paramString.contains("world")) && (!paramString.contains("oversea"))) {}
      do
      {
        return true;
        paramString = Pattern.compile("version=\\d+").matcher(paramString);
        if (!paramString.find()) {
          break;
        }
        paramString = paramString.group();
      } while (Integer.parseInt(paramString.substring(paramString.indexOf("=") + 1)) == this.i.c().c);
      return false;
    }
    return false;
  }
  
  public Bitmap a(byte[] paramArrayOfByte)
  {
    if ((this.e == null) || (this.e.get() == null) || (!((ks)this.e.get()).q())) {
      localObject1 = null;
    }
    Object localObject2;
    nc localnc;
    do
    {
      return (Bitmap)localObject1;
      localObject1 = new ng();
      ((ng)localObject1).a(paramArrayOfByte);
      this.f.a().e();
      localObject2 = this.i.c();
      localnc = new nc(((ng)localObject1).a(), ((ng)localObject1).b(), ((ng)localObject1).c(), ((lo.a)localObject2).a());
      localObject2 = this.g.a(localnc);
      localObject1 = localObject2;
    } while (localObject2 != null);
    Object localObject1 = this.a.a(localnc.a(), localnc.b(), localnc.c());
    if (localObject1 == null) {
      return null;
    }
    localObject1 = ((String)localObject1).getBytes();
    Arrays.fill(paramArrayOfByte, (byte)0);
    System.arraycopy(localObject1, 0, paramArrayOfByte, 0, localObject1.length);
    return null;
  }
  
  public void a(double paramDouble)
  {
    if ((paramDouble > 1.0D) || (paramDouble < -1.0D)) {
      c();
    }
  }
  
  public void a(ic.c paramc)
  {
    if (paramc != ic.c.a) {
      c();
    }
  }
  
  public void a(String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (this.j == null) {}
    try
    {
      if (this.j == null) {
        this.j = Executors.newSingleThreadExecutor();
      }
      this.j.execute(new lm.1(this, paramString, paramArrayOfByte1, paramArrayOfByte2));
      return;
    }
    finally {}
  }
  
  public void a(GL10 paramGL10) {}
  
  public boolean a()
  {
    return false;
  }
  
  public boolean a(float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public void b()
  {
    if ((this.e != null) && (this.e.get() != null))
    {
      ((ks)this.e.get()).getMap().b(this);
      ((ks)this.e.get()).getMap().b(this);
      ((ks)this.e.get()).getMap().a(null);
      ((ks)this.e.get()).getMap().a(null);
    }
    System.gc();
  }
  
  public void b_()
  {
    c();
  }
  
  public void c() {}
  
  public void d()
  {
    if ((this.e != null) && (this.e.get() != null))
    {
      ((ks)this.e.get()).getMap().g(this.h);
      b();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/lm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */