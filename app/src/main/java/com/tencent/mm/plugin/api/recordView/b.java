package com.tencent.mm.plugin.api.recordView;

import android.opengl.GLES20;
import com.tencent.mm.sdk.platformtools.x;

public final class b
{
  public static int ZQ()
  {
    int[] arrayOfInt = new int[1];
    GLES20.glGenTextures(1, arrayOfInt, 0);
    GLES20.glBindTexture(3553, arrayOfInt[0]);
    GLES20.glTexParameteri(3553, 10241, 9729);
    GLES20.glTexParameteri(3553, 10240, 9728);
    GLES20.glTexParameteri(3553, 10242, 33071);
    GLES20.glTexParameteri(3553, 10243, 33071);
    return arrayOfInt[0];
  }
  
  public static int aQ(String paramString1, String paramString2)
  {
    int[] arrayOfInt = new int[1];
    int i = ad(paramString1, 35633);
    if (i == 0)
    {
      x.e("MicroMsg.MMSightCameraGLUtil", "load vertex shader failed");
      return 0;
    }
    int j = ad(paramString2, 35632);
    if (j == 0)
    {
      x.e("MicroMsg.MMSightCameraGLUtil", "load fragment shader failed");
      return 0;
    }
    int k = GLES20.glCreateProgram();
    GLES20.glAttachShader(k, i);
    GLES20.glAttachShader(k, j);
    GLES20.glLinkProgram(k);
    GLES20.glGetProgramiv(k, 35714, arrayOfInt, 0);
    if (arrayOfInt[0] <= 0)
    {
      x.e("MicroMsg.MMSightCameraGLUtil", "link program failed");
      return 0;
    }
    GLES20.glDeleteShader(i);
    GLES20.glDeleteShader(j);
    return k;
  }
  
  private static int ad(String paramString, int paramInt)
  {
    int[] arrayOfInt = new int[1];
    paramInt = GLES20.glCreateShader(paramInt);
    GLES20.glShaderSource(paramInt, paramString);
    GLES20.glCompileShader(paramInt);
    GLES20.glGetShaderiv(paramInt, 35713, arrayOfInt, 0);
    if (arrayOfInt[0] == 0)
    {
      x.e("loadShader error, infoLog: %s", GLES20.glGetShaderInfoLog(paramInt));
      return 0;
    }
    return paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/api/recordView/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */