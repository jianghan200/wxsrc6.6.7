package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.widget.ImageView;
import com.tencent.mm.aa.c;
import com.tencent.mm.aa.f;
import com.tencent.mm.aa.q;
import com.tencent.mm.plugin.ipcall.b.a;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.at.a;
import com.tencent.mm.sdk.platformtools.bi;
import java.lang.ref.WeakReference;

public final class d
{
  Context context;
  private ag dvh = new ag(Looper.getMainLooper());
  at ktR = new at(5, "IPCallAddressAvatarLoader", 1, Looper.getMainLooper());
  aa<String, WeakReference<Bitmap>> ktS = new aa(50);
  
  public d(Context paramContext)
  {
    this.context = paramContext;
  }
  
  private static String Fa(String paramString)
  {
    return paramString + "@username";
  }
  
  private static String Fb(String paramString)
  {
    return paramString + "@contactId";
  }
  
  private boolean d(String paramString, ImageView paramImageView)
  {
    Object localObject = (WeakReference)this.ktS.get(paramString);
    if (localObject != null)
    {
      localObject = (Bitmap)((WeakReference)localObject).get();
      if ((localObject != null) && (paramImageView.getTag() != null) && (paramImageView.getTag().toString().equals(paramString)))
      {
        if ((localObject != null) && (!((Bitmap)localObject).isRecycled())) {
          paramImageView.setImageBitmap((Bitmap)localObject);
        }
        return true;
      }
    }
    return false;
  }
  
  public static String ds(String paramString1, String paramString2)
  {
    return paramString1 + "@" + paramString2 + "@contactId@username";
  }
  
  public final void a(String paramString1, String paramString2, ImageView paramImageView)
  {
    if ((bi.oW(paramString1)) || (bi.oW(paramString2)) || (paramImageView == null)) {}
    String str;
    do
    {
      return;
      str = ds(paramString1, paramString2);
      paramImageView.setTag(str);
    } while (d(ds(paramString1, paramString2), paramImageView));
    this.ktR.c(new d.1(this, paramString1, str, paramImageView, paramString2));
  }
  
  public final void b(final String paramString, final ImageView paramImageView)
  {
    if ((bi.oW(paramString)) || (paramImageView == null)) {}
    final String str;
    do
    {
      return;
      str = Fb(paramString);
      paramImageView.setTag(str);
    } while (d(Fb(paramString), paramImageView));
    this.ktR.c(new at.a()
    {
      public final boolean Kr()
      {
        Bitmap localBitmap = a.ay(d.this.context, paramString);
        d.a(d.this, paramImageView, str, localBitmap);
        return true;
      }
      
      public final boolean Ks()
      {
        return true;
      }
    });
  }
  
  public final void c(final String paramString, final ImageView paramImageView)
  {
    if ((bi.oW(paramString)) || (paramImageView == null)) {}
    final String str;
    do
    {
      return;
      str = Fa(paramString);
      paramImageView.setTag(str);
    } while (d(Fa(paramString), paramImageView));
    this.ktR.c(new at.a()
    {
      public final boolean Kr()
      {
        Bitmap localBitmap2 = c.a(paramString, false, -1);
        Bitmap localBitmap1 = localBitmap2;
        if (localBitmap2 == null) {
          localBitmap1 = q.Kp().jT(paramString);
        }
        d.a(d.this, paramImageView, str, localBitmap1);
        return true;
      }
      
      public final boolean Ks()
      {
        return false;
      }
    });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/ipcall/ui/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */