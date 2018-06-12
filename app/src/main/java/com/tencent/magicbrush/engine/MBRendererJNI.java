package com.tencent.magicbrush.engine;

import android.content.res.AssetManager;
import com.tencent.magicbrush.a.b;

public class MBRendererJNI
{
  static
  {
    b.loadLibrary("mmv8");
    b.loadLibrary("magicbrush");
  }
  
  private native void nativeChanged(int paramInt1, int paramInt2);
  
  private native void nativeCreated(AssetManager paramAssetManager, String paramString, int paramInt1, int paramInt2, float paramFloat, boolean paramBoolean, long paramLong);
  
  private native void nativeFinalize();
  
  private native void nativeOnCreateEglSurface();
  
  private native void nativePause();
  
  private native boolean nativeRender();
  
  private native void nativeResume();
  
  public void Changed(int paramInt1, int paramInt2)
  {
    nativeChanged(paramInt1, paramInt2);
  }
  
  public void Created(AssetManager paramAssetManager, String paramString, int paramInt1, int paramInt2, float paramFloat, boolean paramBoolean, long paramLong)
  {
    nativeCreated(paramAssetManager, paramString, paramInt1, paramInt2, paramFloat, paramBoolean, paramLong);
  }
  
  public void Finalize()
  {
    nativeFinalize();
  }
  
  public void Pause()
  {
    nativePause();
  }
  
  public boolean Render()
  {
    return nativeRender();
  }
  
  public void Resume()
  {
    nativeResume();
  }
  
  public void onCreateEglSurface()
  {
    nativeOnCreateEglSurface();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/magicbrush/engine/MBRendererJNI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */