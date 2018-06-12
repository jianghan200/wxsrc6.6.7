package com.google.android.exoplayer2.h;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.i.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public final class l
  implements f
{
  private final t<? super f> aAB;
  private final f aBg;
  private f aBh;
  private f aBi;
  private f aBj;
  private f aBk;
  private f aiC;
  private final Context context;
  
  public l(Context paramContext, t<? super f> paramt, f paramf)
  {
    this.context = paramContext.getApplicationContext();
    this.aAB = paramt;
    this.aBg = ((f)a.Z(paramf));
  }
  
  private f lU()
  {
    if (this.aBi == null) {
      this.aBi = new c(this.context, this.aAB);
    }
    return this.aBi;
  }
  
  private f lV()
  {
    if (this.aBk == null) {}
    try
    {
      this.aBk = ((f)Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
      if (this.aBk == null) {
        this.aBk = this.aBg;
      }
      return this.aBk;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;) {}
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;) {}
    }
    catch (InstantiationException localInstantiationException)
    {
      for (;;) {}
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;) {}
    }
  }
  
  public final long a(i parami)
  {
    boolean bool;
    String str;
    if (this.aiC == null)
    {
      bool = true;
      a.ap(bool);
      str = parami.uri.getScheme();
      if (!com.google.android.exoplayer2.i.t.e(parami.uri)) {
        break label103;
      }
      if (!parami.uri.getPath().startsWith("/android_asset/")) {
        break label70;
      }
      this.aiC = lU();
    }
    for (;;)
    {
      return this.aiC.a(parami);
      bool = false;
      break;
      label70:
      if (this.aBh == null) {
        this.aBh = new p(this.aAB);
      }
      this.aiC = this.aBh;
      continue;
      label103:
      if ("asset".equals(str))
      {
        this.aiC = lU();
      }
      else if ("content".equals(str))
      {
        if (this.aBj == null) {
          this.aBj = new e(this.context, this.aAB);
        }
        this.aiC = this.aBj;
      }
      else if ("rtmp".equals(str))
      {
        this.aiC = lV();
      }
      else
      {
        this.aiC = this.aBg;
      }
    }
  }
  
  public final void close()
  {
    if (this.aiC != null) {}
    try
    {
      this.aiC.close();
      return;
    }
    finally
    {
      this.aiC = null;
    }
  }
  
  public final Uri getUri()
  {
    if (this.aiC == null) {
      return null;
    }
    return this.aiC.getUri();
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return this.aiC.read(paramArrayOfByte, paramInt1, paramInt2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/exoplayer2/h/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */