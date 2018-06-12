package com.tencent.mm.plugin.appbrand.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.e.a;
import android.view.View;
import com.tencent.mm.plugin.appbrand.config.a.d;

public abstract interface l
{
  public abstract void a(a.d paramd);
  
  public abstract void anm();
  
  public abstract void ann();
  
  public abstract void bL(String paramString1, String paramString2);
  
  public abstract View getView();
  
  public abstract void setProgress(int paramInt);
  
  public static final class a
  {
    private static final a<com.tencent.mm.plugin.appbrand.g, Bitmap> gwU = new a();
    
    public static void a(com.tencent.mm.plugin.appbrand.g paramg, Bitmap paramBitmap)
    {
      if ((paramg == null) || (paramBitmap == null) || (paramBitmap.isRecycled())) {
        return;
      }
      gwU.put(paramg, paramBitmap);
    }
    
    public static l b(Context paramContext, com.tencent.mm.plugin.appbrand.g paramg)
    {
      Bitmap localBitmap = (Bitmap)gwU.remove(paramg);
      if ((localBitmap != null) && (!localBitmap.isRecycled())) {
        return new e(paramContext, paramg, localBitmap);
      }
      if (paramg.aap()) {
        return new d(paramContext, paramg);
      }
      if (paramg.aaq()) {
        return new b(paramContext, paramg);
      }
      return new g(paramContext, paramg);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */