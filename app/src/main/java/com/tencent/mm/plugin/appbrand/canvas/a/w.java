package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import com.tencent.mm.plugin.appbrand.canvas.f;
import org.json.JSONArray;
import org.json.JSONException;

public final class w
  implements d
{
  public final boolean a(f paramf, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    if (paramJSONArray.length() <= 0) {
      return false;
    }
    try
    {
      paramf = paramf.fng;
      paramCanvas = paramJSONArray.getString(0);
      int i = -1;
      switch (paramCanvas.hashCode())
      {
      case -130953402: 
        if (paramCanvas.equals("source-over")) {
          i = 0;
        }
        break;
      case -1698458601: 
        if (paramCanvas.equals("source-in")) {
          i = 1;
        }
        break;
      case -1112602980: 
        if (paramCanvas.equals("source-out")) {
          i = 2;
        }
        break;
      case -131372090: 
        if (paramCanvas.equals("source-atop")) {
          i = 3;
        }
        break;
      case 1159099187: 
        if (paramCanvas.equals("destination-over")) {
          i = 4;
        }
        break;
      case 912936772: 
        if (paramCanvas.equals("destination-in")) {
          i = 5;
        }
        break;
      case -1763725041: 
        if (paramCanvas.equals("destination-out")) {
          i = 6;
        }
        break;
      case 1158680499: 
        if (paramCanvas.equals("destination-atop")) {
          i = 7;
        }
        break;
      case 170546243: 
        if (paramCanvas.equals("lighter")) {
          i = 8;
        }
        break;
      case 3059573: 
        if (paramCanvas.equals("copy")) {
          i = 9;
        }
        break;
      case 118875: 
        if (paramCanvas.equals("xor")) {
          i = 10;
        }
        break;
      case 653829668: 
        if (paramCanvas.equals("multiply")) {
          i = 11;
        }
        break;
      case -1091287984: 
        if (paramCanvas.equals("overlay")) {
          i = 12;
        }
        break;
      case -1338968417: 
        if (paramCanvas.equals("darken")) {
          i = 13;
        }
        break;
      case 170546239: 
        if (paramCanvas.equals("lighten")) {
          i = 14;
        }
        break;
      case -120580883: 
        if (paramCanvas.equals("color-dodge")) {
          i = 15;
        }
        break;
      case 1242982905: 
        if (paramCanvas.equals("color-burn")) {
          i = 16;
        }
        break;
      case -1427739212: 
        if (paramCanvas.equals("hard-light")) {
          i = 17;
        }
        break;
      case -1247677005: 
        if (paramCanvas.equals("soft-light")) {
          i = 18;
        }
        break;
      case 1728361789: 
        if (paramCanvas.equals("difference")) {
          i = 19;
        }
        break;
      case 1686617550: 
        if (paramCanvas.equals("exclusion")) {
          i = 20;
        }
        break;
      case 103672: 
        if (paramCanvas.equals("hue")) {
          i = 21;
        }
        break;
      case -230491182: 
        if (paramCanvas.equals("saturation")) {
          i = 22;
        }
        break;
      case 94842723: 
        if (paramCanvas.equals("color")) {
          i = 23;
        }
        break;
      case -2120744511: 
        if (paramCanvas.equals("luminosity"))
        {
          i = 24;
          break;
          paramf.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
          break label976;
          paramf.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
          break label976;
          paramf.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
          break label976;
          paramf.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
          break label976;
          paramf.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
          break label976;
          paramf.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
          break label976;
          paramf.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
          break label976;
          paramf.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
          break label976;
          paramf.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
          break label976;
          paramf.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.ADD));
          break label976;
          paramf.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
          break label976;
          paramf.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
          break label976;
          paramf.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
          break label976;
          paramf.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DARKEN));
          break label976;
          paramf.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
        }
        break;
      }
      switch (i)
      {
      }
      label976:
      return true;
    }
    catch (JSONException paramf) {}
    return false;
  }
  
  public final String getMethod()
  {
    return "setGlobalCompositeOperation";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/canvas/a/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */