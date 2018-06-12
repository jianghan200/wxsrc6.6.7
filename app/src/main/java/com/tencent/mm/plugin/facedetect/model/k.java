package com.tencent.mm.plugin.facedetect.model;

import com.tencent.mm.sdk.platformtools.x;

public final class k
{
  public static int py(int paramInt)
  {
    if ((paramInt < 90000) && (paramInt != 0))
    {
      x.i("MicroMsg.FaceJSAPITranslateCenter", "hy: server error. not translate");
      return paramInt;
    }
    if (paramInt > 90099)
    {
      x.i("MicroMsg.FaceJSAPITranslateCenter", "hy: already translated");
      return paramInt;
    }
    switch (paramInt)
    {
    default: 
      return 90199;
    case 0: 
      return 0;
    case 90001: 
      return 90109;
    case 90002: 
    case 90003: 
    case 90004: 
    case 90005: 
    case 90006: 
    case 90024: 
    case 90025: 
      return 90100;
    case 90008: 
    case 90009: 
    case 90010: 
      return 90101;
    case 90011: 
    case 90013: 
      return 90102;
    case 90019: 
    case 90020: 
    case 90021: 
      return 90103;
    case 90015: 
      return 90104;
    case 90022: 
      return 90105;
    case 90016: 
      return 90106;
    case 90017: 
      return 90107;
    }
    return 90108;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/facedetect/model/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */