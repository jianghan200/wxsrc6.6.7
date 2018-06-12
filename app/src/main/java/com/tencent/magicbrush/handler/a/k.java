package com.tencent.magicbrush.handler.a;

import java.nio.FloatBuffer;
import java.util.Iterator;
import java.util.List;

final class k
{
  static final k bor;
  float bos;
  float bot;
  float bou;
  float bov;
  float bow;
  float box;
  boolean boy;
  float height;
  float width;
  
  static
  {
    k localk = new k();
    bor = localk;
    localk.height = 0.0F;
    localk.width = 0.0F;
    localk.bot = 0.0F;
    localk.bos = 0.0F;
    localk.box = 0.0F;
    localk.bow = 0.0F;
    localk.bov = 0.0F;
    localk.bou = 0.0F;
  }
  
  static void a(FloatBuffer paramFloatBuffer, List<k> paramList)
  {
    if ((paramList == null) || (paramList.isEmpty())) {
      return;
    }
    paramList = paramList.iterator();
    label21:
    FloatBuffer localFloatBuffer;
    while (paramList.hasNext())
    {
      k localk = (k)paramList.next();
      if (localk != null)
      {
        localFloatBuffer = paramFloatBuffer.put(localk.bos).put(localk.bot).put(localk.width).put(localk.height).put(localk.bou).put(localk.bov).put(localk.bow).put(localk.box);
        if (!localk.boy) {
          break label122;
        }
      }
    }
    label122:
    for (float f = 1.0F;; f = 0.0F)
    {
      localFloatBuffer.put(f);
      break label21;
      break;
    }
  }
  
  public final void d(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.bou = paramFloat1;
    this.bov = paramFloat2;
    this.bow = paramFloat3;
    this.box = paramFloat4;
  }
  
  public final String toString()
  {
    return "glyph(" + this.bos + ", " + this.bot + ", [" + this.width + ", " + this.height + "], [" + this.bou + ", " + this.bov + ", " + this.bow + ", " + this.box + ", " + this.boy + "])";
  }
  
  public final void v(float paramFloat1, float paramFloat2)
  {
    this.width = paramFloat1;
    this.height = paramFloat2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/magicbrush/handler/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */