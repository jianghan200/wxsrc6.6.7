package com.tencent.map.lib.mapstructure;

import android.graphics.Point;

public class Polygon2D
{
  public static final int GLPOLYGONMODE2D_BORDER = 2;
  public static final int GLPOLYGONMODE2D_FILL = 1;
  public int[] borderColor;
  public float borderWidth;
  public int borldLineId;
  public int centerX;
  public int centerY;
  public int[] color;
  public float originalRadius;
  public Point[] points;
  public int pointsCount;
  public int polygonId;
  public int polygonMode;
  public float scale = 1.0F;
  public float zIndex = 0.0F;
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/map/lib/mapstructure/Polygon2D.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */