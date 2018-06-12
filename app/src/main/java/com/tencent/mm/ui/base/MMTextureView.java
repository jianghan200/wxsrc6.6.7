package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.TextureView;
import com.tencent.mm.compatible.e.k;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Field;

@TargetApi(14)
public class MMTextureView
  extends TextureView
{
  private Field tyk;
  
  public MMTextureView(Context paramContext)
  {
    super(paramContext);
  }
  
  public MMTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public MMTextureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void crS()
  {
    if (d.fS(16))
    {
      x.i("MicroMsg.MMTextureView", "current API Level %d, do not do sly", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
      return;
    }
    if (d.fT(20))
    {
      x.i("MicroMsg.MMTextureView", "current API Level %d, do not do sly", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
      return;
    }
    if (q.deW.deo == 2)
    {
      x.i("MicroMsg.MMTextureView", "do not do sly textureView, config ERROR");
      return;
    }
    x.i("MicroMsg.MMTextureView", "detect texture problem, sly");
    try
    {
      if (this.tyk == null)
      {
        this.tyk = TextureView.class.getDeclaredField("mSurface");
        this.tyk.setAccessible(true);
      }
      SurfaceTexture localSurfaceTexture = (SurfaceTexture)this.tyk.get(this);
      if (localSurfaceTexture != null) {
        if (!(localSurfaceTexture instanceof r))
        {
          r localr = new r();
          localr.iSV = localSurfaceTexture;
          this.tyk.set(this, localr);
          x.i("MicroMsg.MMTextureView", "detect texture problem, wrap");
          return;
        }
      }
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      x.printErrStackTrace("MicroMsg.MMTextureView", localNoSuchFieldException, "", new Object[0]);
      x.e("MicroMsg.MMTextureView", "detect texture problem, NoSuchFieldException");
      return;
      x.i("MicroMsg.MMTextureView", "detect texture problem, wrapped");
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      x.printErrStackTrace("MicroMsg.MMTextureView", localIllegalArgumentException, "", new Object[0]);
      x.e("MicroMsg.MMTextureView", "detect texture problem, IllegalArgumentException");
      return;
      x.i("MicroMsg.MMTextureView", "detect texture problem, no wrap");
      return;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      x.printErrStackTrace("MicroMsg.MMTextureView", localIllegalAccessException, "", new Object[0]);
      x.e("MicroMsg.MMTextureView", "detect texture problem, IllegalAccessException");
    }
  }
  
  @TargetApi(14)
  public void onDetachedFromWindow()
  {
    try
    {
      super.onDetachedFromWindow();
      return;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.MMTextureView", localException, "unkown error", new Object[0]);
    }
  }
  
  @TargetApi(16)
  public void setSurfaceTexture(SurfaceTexture paramSurfaceTexture)
  {
    super.setSurfaceTexture(paramSurfaceTexture);
    crS();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/base/MMTextureView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */