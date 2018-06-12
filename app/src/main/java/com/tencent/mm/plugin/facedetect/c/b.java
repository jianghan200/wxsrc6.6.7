package com.tencent.mm.plugin.facedetect.c;

import android.content.Context;
import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  extends Enum<b>
{
  public static a a(Context paramContext, e parame, int paramInt, Bundle paramBundle)
  {
    x.i("MicroMsg.FaceDetectControllerFactory", "alvinluo getController serverScene: %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
    case 1: 
    case 3: 
    case 4: 
      return new c(paramContext, parame, paramInt);
    }
    return new d(paramContext, parame, paramInt, paramBundle);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/facedetect/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */