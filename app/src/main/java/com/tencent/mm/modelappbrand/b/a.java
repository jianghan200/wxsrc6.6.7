package com.tencent.mm.modelappbrand.b;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a.i;
import android.support.v4.b.a.k;
import com.tencent.mm.modelappbrand.a.a.a.a;
import com.tencent.mm.sdk.platformtools.ad;
import java.lang.ref.WeakReference;

public enum a
{
  private static volatile WeakReference<Bitmap> dFK;
  
  public static Drawable JZ()
  {
    if (dFK != null)
    {
      localObject = (Bitmap)dFK.get();
      if ((localObject != null) && (!((Bitmap)localObject).isRecycled())) {}
    }
    else
    {
      dFK = new WeakReference(com.tencent.mm.compatible.g.a.decodeResource(ad.getResources(), a.a.miniprogram_default_avatar));
    }
    Object localObject = k.a(ad.getResources(), (Bitmap)dFK.get());
    ((i)localObject).bH();
    return (Drawable)localObject;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/modelappbrand/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */