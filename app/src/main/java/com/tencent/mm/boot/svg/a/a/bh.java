package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class bh
  extends c
{
  private final int height = 24;
  private final int width = 24;
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 24;
      return 24;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      c.f(paramVarArgs);
      c.e(paramVarArgs);
      Paint localPaint = c.i(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject = c.i(paramVarArgs);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramVarArgs).setStrokeWidth(1.0F);
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-16777216);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(11.269531F, 8.1875F);
      ((Path)localObject).cubicTo(9.5703125F, 8.1875F, 8.46875F, 9.628906F, 8.46875F, 11.84375F);
      ((Path)localObject).cubicTo(8.46875F, 14.046875F, 9.558594F, 15.4765625F, 11.2578125F, 15.4765625F);
      ((Path)localObject).cubicTo(12.9921875F, 15.4765625F, 14.105469F, 14.0234375F, 14.105469F, 11.785156F);
      ((Path)localObject).cubicTo(14.105469F, 9.582031F, 13.015625F, 8.1875F, 11.269531F, 8.1875F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(11.644531F, 2.0F);
      ((Path)localObject).cubicTo(16.779823F, 2.0F, 21.019531F, 5.5273438F, 21.019531F, 10.71875F);
      ((Path)localObject).cubicTo(21.019531F, 14.4453125F, 19.472656F, 16.835938F, 16.894531F, 16.835938F);
      ((Path)localObject).cubicTo(15.5F, 16.835938F, 14.3984375F, 15.9921875F, 14.222656F, 14.6796875F);
      ((Path)localObject).lineTo(14.140625F, 14.6796875F);
      ((Path)localObject).cubicTo(13.613281F, 16.015625F, 12.5234375F, 16.753906F, 11.0703125F, 16.753906F);
      ((Path)localObject).cubicTo(8.65625F, 16.753906F, 7.015625F, 14.761719F, 7.015625F, 11.808594F);
      ((Path)localObject).cubicTo(7.015625F, 8.925781F, 8.6796875F, 6.9335938F, 11.0703125F, 6.9335938F);
      ((Path)localObject).cubicTo(12.4296875F, 6.9335938F, 13.613281F, 7.671875F, 14.046875F, 8.8203125F);
      ((Path)localObject).lineTo(14.128906F, 8.8203125F);
      ((Path)localObject).lineTo(14.128906F, 7.1679688F);
      ((Path)localObject).lineTo(15.488281F, 7.1679688F);
      ((Path)localObject).lineTo(15.488281F, 13.871094F);
      ((Path)localObject).cubicTo(15.488281F, 14.9375F, 16.050781F, 15.640625F, 17.117188F, 15.640625F);
      ((Path)localObject).cubicTo(18.675781F, 15.640625F, 19.742188F, 13.847656F, 19.742188F, 10.6953125F);
      ((Path)localObject).cubicTo(19.742188F, 6.21875F, 16.238195F, 3.1757047F, 11.644531F, 3.1757047F);
      ((Path)localObject).cubicTo(7.0508666F, 3.1757047F, 3.2890625F, 6.5256376F, 3.2890625F, 11.7734375F);
      ((Path)localObject).cubicTo(3.2890625F, 16.648184F, 7.303185F, 20.363281F, 11.7734375F, 20.363281F);
      ((Path)localObject).cubicTo(13.355469F, 20.363281F, 14.8671875F, 20.164062F, 15.6640625F, 19.847656F);
      ((Path)localObject).lineTo(15.6640625F, 21.007812F);
      ((Path)localObject).cubicTo(14.714844F, 21.335938F, 13.332031F, 21.523438F, 11.761719F, 21.523438F);
      ((Path)localObject).cubicTo(6.1979494F, 21.523438F, 2.0F, 17.325605F, 2.0F, 11.7265625F);
      ((Path)localObject).cubicTo(2.0F, 6.127519F, 6.5092382F, 2.0F, 11.644531F, 2.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */