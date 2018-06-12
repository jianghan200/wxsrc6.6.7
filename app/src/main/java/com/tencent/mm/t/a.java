package com.tencent.mm.t;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import com.tencent.mm.bd.a.c;
import com.tencent.mm.sdk.platformtools.ad;

public final class a
  implements Cloneable
{
  public static Paint dnA;
  public static Paint dnB;
  public static Paint dnC;
  public static Paint dnD;
  private static int dnt = (int)ad.getResources().getDimension(a.c.box_line_width);
  private static int dnu = (int)ad.getResources().getDimension(a.c.box_gird_width);
  public static float dnv = ad.getResources().getDimension(a.c.corner_width);
  public static float dnw = ad.getResources().getDimension(a.c.corner_length);
  public static Path dnx = new Path();
  public static Path dny = new Path();
  public static Paint dnz = new Paint();
  public static Rect ea;
  public Rect bwl;
  public Rect dnE = new Rect();
  public Rect dnF = new Rect();
  public Matrix mMatrix = new Matrix();
  
  static
  {
    dnA = new Paint();
    dnB = new Paint();
    dnC = new Paint();
    dnD = new Paint();
    ea = new Rect();
    dnB.setColor(-16777216);
    dnz.setColor(-1);
    dnz.setStrokeWidth(dnt);
    dnz.setStyle(Paint.Style.STROKE);
    dnz.setAntiAlias(true);
    dnC.set(dnz);
    dnC.setStrokeWidth(dnu);
    dnD.set(dnz);
    dnD.setStrokeWidth(dnv);
    dnA.set(dnz);
    dnA.setStrokeWidth(dnt * 7);
    dnA.setColor(549174203);
  }
  
  public a() {}
  
  public a(Rect paramRect)
  {
    this.bwl = paramRect;
  }
  
  public static void gs(int paramInt)
  {
    dnD.setAlpha(paramInt);
    dnz.setAlpha(paramInt);
    dnC.setAlpha((int)(0.7058824F * paramInt));
  }
  
  public static void gt(int paramInt)
  {
    dnB.setAlpha((int)(0.9019608F * paramInt));
  }
  
  public final Object clone()
  {
    return super.clone();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/t/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */