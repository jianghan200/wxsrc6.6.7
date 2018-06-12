package com.tencent.magicbrush.handler.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class h
{
  private List<k> bnR = new ArrayList();
  g bnW;
  e bnX;
  Canvas bnY;
  Paint bnZ;
  char[] boa = new char[1];
  Rect bob = new Rect();
  private Rect boc = new Rect();
  Paint.FontMetrics bod = new Paint.FontMetrics();
  
  h(e parame, g paramg)
  {
    this.bnX = parame;
    this.bnY = new Canvas(this.bnX.bnH);
    this.bnW = paramg;
    this.bnZ = new Paint(1);
    this.bnZ.setTextAlign(Paint.Align.LEFT);
    this.bnZ.setColor(-1);
  }
  
  static float x(List<k> paramList)
  {
    float f2;
    if ((paramList == null) || (paramList.size() == 0))
    {
      f2 = 0.0F;
      return f2;
    }
    paramList = paramList.iterator();
    float f1 = 0.0F;
    for (;;)
    {
      f2 = f1;
      if (!paramList.hasNext()) {
        break;
      }
      k localk = (k)paramList.next();
      if (localk != null) {
        f1 = localk.bos + f1;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/magicbrush/handler/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */