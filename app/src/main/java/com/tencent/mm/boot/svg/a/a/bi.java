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

public final class bi
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
      localPaint.setColor(-15028967);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.j(paramVarArgs);
      ((Path)localObject).moveTo(11.488281F, 9.3671875F);
      ((Path)localObject).cubicTo(10.421875F, 9.3671875F, 9.777344F, 10.28125F, 9.777344F, 11.8046875F);
      ((Path)localObject).cubicTo(9.777344F, 13.328125F, 10.410156F, 14.2421875F, 11.488281F, 14.2421875F);
      ((Path)localObject).cubicTo(12.566406F, 14.2421875F, 13.2109375F, 13.316406F, 13.2109375F, 11.8046875F);
      ((Path)localObject).cubicTo(13.2109375F, 10.292969F, 12.5546875F, 9.3671875F, 11.488281F, 9.3671875F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(11.8515625F, 1.9375F);
      ((Path)localObject).cubicTo(17.464844F, 1.9375F, 21.34375F, 5.4414062F, 21.34375F, 10.6796875F);
      ((Path)localObject).cubicTo(21.34375F, 14.347656F, 19.550781F, 16.65625F, 16.632812F, 16.65625F);
      ((Path)localObject).cubicTo(15.121094F, 16.65625F, 14.03125F, 16.011719F, 13.714844F, 14.886719F);
      ((Path)localObject).lineTo(13.515625F, 14.886719F);
      ((Path)localObject).cubicTo(13.035156F, 16.058594F, 12.109375F, 16.667969F, 10.761719F, 16.667969F);
      ((Path)localObject).cubicTo(8.324219F, 16.667969F, 6.7070312F, 14.699219F, 6.7070312F, 11.722656F);
      ((Path)localObject).cubicTo(6.7070312F, 8.875F, 8.265625F, 6.953125F, 10.574219F, 6.953125F);
      ((Path)localObject).cubicTo(11.8515625F, 6.953125F, 12.871094F, 7.5742188F, 13.339844F, 8.6171875F);
      ((Path)localObject).lineTo(13.5390625F, 8.6171875F);
      ((Path)localObject).lineTo(13.5390625F, 7.234375F);
      ((Path)localObject).lineTo(16.222656F, 7.234375F);
      ((Path)localObject).lineTo(16.222656F, 13.1875F);
      ((Path)localObject).cubicTo(16.222656F, 14.0078125F, 16.585938F, 14.511719F, 17.242188F, 14.511719F);
      ((Path)localObject).cubicTo(18.261719F, 14.511719F, 18.929688F, 13.175781F, 18.929688F, 10.9609375F);
      ((Path)localObject).cubicTo(18.929688F, 6.7070312F, 16.128906F, 4.0F, 11.816406F, 4.0F);
      ((Path)localObject).cubicTo(7.328125F, 4.0F, 4.234375F, 7.1523438F, 4.234375F, 11.769531F);
      ((Path)localObject).cubicTo(4.234375F, 16.503906F, 7.4101562F, 19.351562F, 12.296875F, 19.351562F);
      ((Path)localObject).cubicTo(13.386719F, 19.351562F, 14.5F, 19.210938F, 15.109375F, 19.023438F);
      ((Path)localObject).lineTo(15.109375F, 21.109375F);
      ((Path)localObject).cubicTo(14.265625F, 21.332031F, 13.175781F, 21.460938F, 12.050781F, 21.460938F);
      ((Path)localObject).cubicTo(5.9921875F, 21.460938F, 1.8203125F, 17.640625F, 1.8203125F, 11.7109375F);
      ((Path)localObject).cubicTo(1.8203125F, 5.921875F, 5.9335938F, 1.9375F, 11.8515625F, 1.9375F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.h(paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/boot/svg/a/a/bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */