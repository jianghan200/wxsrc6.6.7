package com.tencent.mm.plugin.sns.model;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.SystemClock;
import com.tencent.mm.memory.a.a;
import com.tencent.mm.memory.n;
import com.tencent.mm.plugin.sns.data.i;
import java.util.HashMap;
import java.util.Map;

public final class ai
  extends a
{
  int alpha = 255;
  long jEK;
  boolean jEL = false;
  private Map<String, Boolean> nre = new HashMap();
  
  public ai(String paramString, n paramn, long paramLong)
  {
    super(paramString, paramn);
    if (paramLong != 0L)
    {
      this.jEK = paramLong;
      this.nre.put(paramString, Boolean.valueOf(true));
      this.jEL = true;
    }
    while (this.nre.containsKey(paramString)) {
      return;
    }
    this.jEK = SystemClock.uptimeMillis();
    this.nre.put(paramString, Boolean.valueOf(true));
    this.jEL = true;
  }
  
  public final void draw(Canvas paramCanvas)
  {
    Rect localRect = getBounds();
    Bitmap localBitmap = this.dvu.Fx();
    if (!i.q(localBitmap))
    {
      paramCanvas.drawColor(-1118482);
      this.jEK = 0L;
      return;
    }
    float f;
    if (this.jEL)
    {
      f = (float)(SystemClock.uptimeMillis() - this.jEK) / 150.0F;
      if (this.jEK == 0L) {
        f = 0.0F;
      }
      if (f >= 1.0F) {
        this.jEL = false;
      }
    }
    else
    {
      dvs.setAlpha(this.alpha);
      paramCanvas.drawBitmap(localBitmap, null, localRect, dvs);
      return;
    }
    int i = (int)(f * this.alpha);
    dvs.setAlpha(i);
    paramCanvas.drawBitmap(localBitmap, null, localRect, dvs);
    invalidateSelf();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */