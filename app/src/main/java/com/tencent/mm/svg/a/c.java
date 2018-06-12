package com.tencent.mm.svg.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;

public final class c
  extends b
{
  private a tfa;
  
  public c(Picture paramPicture, int paramInt) {}
  
  public final void draw(Canvas paramCanvas)
  {
    int i = 1;
    int j = 0;
    long l1 = com.tencent.mm.svg.b.b.coo();
    label250:
    label327:
    label354:
    label428:
    label465:
    label480:
    label482:
    for (;;)
    {
      long l2;
      try
      {
        if (!paramCanvas.isHardwareAccelerated()) {
          break label354;
        }
        if (this.tfa.tfb == null)
        {
          com.tencent.mm.svg.b.c.e("MicroMsg.SVGPictureDrawable", "Must not go here! %s", new Object[] { Integer.valueOf(this.teS) });
          if (this.tfa.tfc == null) {
            break label480;
          }
          if (!this.tfa.tfc.isRecycled()) {
            break label327;
          }
          break label480;
          if (this.iUA == null) {
            this.iUA = a.t(this);
          }
          a.b(this.iUA, this.teU);
          if (i != 0) {
            break label465;
          }
          if ((!paramCanvas.isHardwareAccelerated()) || (Build.VERSION.SDK_INT >= 16)) {
            break label428;
          }
          com.tencent.mm.svg.b.c.i("MicroMsg.SVGPictureDrawable", "Skip this draw.", new Object[0]);
          return;
        }
        l2 = System.nanoTime();
        if ((this.tfa.tfc != null) && (!this.tfa.tfc.isRecycled())) {
          continue;
        }
        if ((getIntrinsicWidth() > 2048) || (getIntrinsicHeight() > 2048))
        {
          com.tencent.mm.svg.b.c.e("MicroMsg.SVGPictureDrawable", "This drawable is too big. %s", new Object[] { Integer.valueOf(this.teS) });
          continue;
        }
        if (getIntrinsicWidth() <= 0) {
          break label250;
        }
      }
      finally
      {
        this.mDuration = com.tencent.mm.svg.b.b.gq(l1);
        j(paramCanvas);
      }
      if (getIntrinsicHeight() <= 0)
      {
        com.tencent.mm.svg.b.c.e("MicroMsg.SVGPictureDrawable", "width and height must > 0.", new Object[0]);
      }
      else
      {
        Object localObject2 = Bitmap.createBitmap(getIntrinsicWidth(), getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas localCanvas = new Canvas((Bitmap)localObject2);
        this.tfa.tfb.draw(localCanvas);
        this.tfa.tfc = ((Bitmap)localObject2);
        com.tencent.mm.svg.b.b.gq(l2);
        j(localCanvas);
        continue;
        coi();
        paramCanvas.drawBitmap(this.tfa.tfc, null, this.rD, this.teU);
        break label482;
        i = j;
        if (this.tfa.tfc != null)
        {
          i = j;
          if (!this.tfa.tfc.isRecycled())
          {
            com.tencent.mm.svg.b.c.i("MicroMsg.SVGPictureDrawable", "recycle bitmap:%s", new Object[] { this.tfa.tfc.toString() });
            this.tfa.tfc.recycle();
            this.tfa.tfc = null;
            i = j;
            continue;
            localObject2 = this.tfa.tfb;
            if (localObject2 != null)
            {
              coi();
              paramCanvas.save();
              paramCanvas.drawPicture((Picture)localObject2, this.rD);
              paramCanvas.restore();
            }
            this.mDuration = com.tencent.mm.svg.b.b.gq(l1);
            j(paramCanvas);
            return;
            i = 0;
          }
        }
      }
    }
  }
  
  public final Drawable.ConstantState getConstantState()
  {
    return this.tfa;
  }
  
  public static final class a
    extends Drawable.ConstantState
  {
    protected int oFj;
    protected Picture tfb;
    protected Bitmap tfc;
    
    public a(Picture paramPicture, int paramInt)
    {
      this.tfb = paramPicture;
      this.oFj = paramInt;
    }
    
    public final int getChangingConfigurations()
    {
      return 0;
    }
    
    public final Drawable newDrawable()
    {
      return new c(this.tfb, this.oFj);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/svg/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */