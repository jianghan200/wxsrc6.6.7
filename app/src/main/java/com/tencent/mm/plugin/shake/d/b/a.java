package com.tencent.mm.plugin.shake.d.b;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import com.tencent.mm.R.g;
import com.tencent.mm.a.g;
import com.tencent.mm.platformtools.w;
import com.tencent.mm.platformtools.w.a;
import com.tencent.mm.platformtools.w.b;
import com.tencent.mm.platformtools.y;
import com.tencent.mm.platformtools.y.a;
import com.tencent.mm.plugin.shake.d.a.i;
import com.tencent.mm.plugin.shake.d.a.k;
import com.tencent.mm.plugin.shake.e.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;

public final class a
  extends BitmapDrawable
  implements y.a
{
  private static final Paint dvs;
  private static Bitmap mZd;
  private int kdD;
  private String mZa;
  private ImageView mZb;
  private w mZc;
  private int type;
  private String username;
  
  static
  {
    Paint localPaint = new Paint();
    dvs = localPaint;
    localPaint.setAntiAlias(true);
    dvs.setFilterBitmap(true);
  }
  
  private static Bitmap F(View paramView, int paramInt)
  {
    if (paramView == null) {
      return mZd;
    }
    int i = paramView.getMeasuredWidth();
    int j = paramView.getMeasuredHeight();
    if (((mZd != null) && (mZd.getWidth() == i)) || (paramInt > 0)) {}
    for (;;)
    {
      try
      {
        mZd = c.s(paramView.getResources().getDrawable(paramInt));
        if ((mZd.getWidth() != i) && (i > 0) && (j > 0)) {
          mZd = Bitmap.createScaledBitmap(mZd, i, j, true);
        }
      }
      catch (IOException paramView)
      {
        x.printErrStackTrace("MicroMsg.ShakeAvatarDrawable", paramView, "", new Object[0]);
        continue;
      }
      return mZd;
      mZd = BackwardSupportUtil.b.a(ad.getContext().getAssets().open("avatar/default_nor_avatar.png"), com.tencent.mm.bp.a.getDensity(null));
    }
  }
  
  public static String JC(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.ShakeAvatarDrawable", "getStoragePath: but url is null");
      return null;
    }
    String str = i.bvg();
    if (bi.oW(str))
    {
      x.w("MicroMsg.ShakeAvatarDrawable", "getStoragePath, but save dir is null");
      return null;
    }
    return String.format("%s/%s", new Object[] { str, g.u(paramString.getBytes()) });
  }
  
  public final void draw(Canvas paramCanvas)
  {
    x.i("MicroMsg.ShakeAvatarDrawable", "album username[%s], url[%s], type[%d], attr[%s]", new Object[] { this.username, this.mZa, Integer.valueOf(this.type), toString() });
    if ((4 != this.type) && ((!k.vY(this.type)) || (6 == this.type))) {
      return;
    }
    Bitmap localBitmap1;
    if (4 == this.type)
    {
      this.mZc = new a(this.mZa);
      localBitmap1 = y.a(this.mZc);
    }
    for (;;)
    {
      Bitmap localBitmap2;
      if (localBitmap1 != null)
      {
        localBitmap2 = localBitmap1;
        if (!localBitmap1.isRecycled()) {}
      }
      else
      {
        x.i("MicroMsg.ShakeAvatarDrawable", "bm is null or recycled, album url[%s]", new Object[] { this.mZa });
        localBitmap2 = F(this.mZb, this.kdD);
      }
      if (localBitmap2 == null) {
        break;
      }
      paramCanvas.drawBitmap(localBitmap2, null, getBounds(), dvs);
      return;
      if ((k.vY(this.type)) && (6 != this.type))
      {
        this.mZc = new b(this.mZa);
        localBitmap1 = y.a(this.mZc);
      }
      else
      {
        localBitmap1 = null;
      }
    }
  }
  
  public final void m(String paramString, final Bitmap paramBitmap)
  {
    x.i("MicroMsg.ShakeAvatarDrawable", "type[%d] notifyKey[%s] albumUrl[%s]", new Object[] { Integer.valueOf(this.type), paramString, this.mZa });
    if ((this.mZc != null) && (paramString.equals(this.mZc.Vx())) && ((4 == this.type) || ((k.vY(this.type)) && (6 != this.type)))) {
      this.mZb.post(new Runnable()
      {
        public final void run()
        {
          a.a(a.this).setImageBitmap(paramBitmap);
        }
      });
    }
  }
  
  private static final class a
    implements w
  {
    private String mZa;
    
    public a(String paramString)
    {
      this.mZa = paramString;
    }
    
    public final void P(String paramString, boolean paramBoolean) {}
    
    public final Bitmap VA()
    {
      return BitmapFactory.decodeResource(ad.getContext().getResources(), R.g.nosdcard_chatting_bg);
    }
    
    public final void VB() {}
    
    public final w.b Vu()
    {
      return null;
    }
    
    public final String Vv()
    {
      return a.JC(this.mZa);
    }
    
    public final String Vw()
    {
      return this.mZa;
    }
    
    public final String Vx()
    {
      return this.mZa;
    }
    
    public final boolean Vy()
    {
      return true;
    }
    
    public final boolean Vz()
    {
      return false;
    }
    
    public final Bitmap a(Bitmap paramBitmap, w.a parama, String paramString)
    {
      if (w.a.evZ == parama) {}
      try
      {
        c.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, a.JC(this.mZa), false);
        x.d("MicroMsg.ShakeAvatarDrawable", "get bitmap, from %s", new Object[] { parama.toString() });
        return paramBitmap;
      }
      catch (IOException paramString)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.ShakeAvatarDrawable", paramString, "", new Object[0]);
          x.w("MicroMsg.ShakeAvatarDrawable", "save bitmap fail");
        }
      }
    }
    
    public final void a(w.a parama, String paramString) {}
    
    public final String getCacheKey()
    {
      return this.mZa;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/shake/d/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */