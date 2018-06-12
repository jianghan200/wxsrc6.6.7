package com.tencent.mm.memory.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import com.tencent.mm.memory.i;
import com.tencent.mm.memory.n;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;

public class a
  extends Drawable
  implements i
{
  public static final Paint dvs;
  private static final ag dvt = new ag(Looper.getMainLooper());
  boolean DEBUG = false;
  public n dvu;
  private Runnable dvv = new Runnable()
  {
    public final void run()
    {
      x.d("MicroMsg.MaskBitmapDrawable", "refresh tag=%s", new Object[] { a.this.tag });
      a.this.invalidateSelf();
    }
  };
  protected String tag;
  
  static
  {
    Paint localPaint = new Paint();
    dvs = localPaint;
    localPaint.setAntiAlias(true);
    dvs.setFilterBitmap(false);
    dvs.setColor(-1118482);
  }
  
  public a(String paramString, n paramn)
  {
    this.tag = paramString;
    this.dvu = paramn;
  }
  
  public final n FB()
  {
    if (this.dvu != null) {
      return this.dvu;
    }
    return null;
  }
  
  public final void Fs()
  {
    if (this.dvu != null) {
      this.dvu.Fs();
    }
  }
  
  public final void Ft()
  {
    if (this.dvu != null) {
      this.dvu.Ft();
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    Rect localRect = getBounds();
    n localn = this.dvu;
    if ((localn == null) || (localn.isRecycled()))
    {
      paramCanvas.drawColor(-1118482);
      return;
    }
    Paint localPaint = dvs;
    paramCanvas.drawBitmap(localn.bitmap, null, localRect, localPaint);
  }
  
  public int getIntrinsicHeight()
  {
    if (this.dvu == null) {}
    n localn;
    do
    {
      return 0;
      localn = this.dvu;
    } while ((localn == null) || (localn.isRecycled()));
    return localn.bitmap.getHeight();
  }
  
  public int getIntrinsicWidth()
  {
    if (this.dvu == null) {}
    n localn;
    do
    {
      return 0;
      localn = this.dvu;
    } while ((localn == null) || (localn.isRecycled()));
    return localn.bitmap.getWidth();
  }
  
  public int getOpacity()
  {
    return 0;
  }
  
  public void setAlpha(int paramInt) {}
  
  public void setColorFilter(ColorFilter paramColorFilter) {}
  
  public String toString()
  {
    if (this.DEBUG)
    {
      String str2 = super.toString() + " code: " + hashCode();
      String str1 = str2;
      if (this.dvu != null) {
        str1 = str2 + this.dvu;
      }
      return str1;
    }
    return super.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/memory/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */