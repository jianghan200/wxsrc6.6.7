package org.xwalk.core.extension;

import android.content.Intent;

abstract interface XWalkExternalExtensionBridge
{
  public abstract void broadcastMessage(String paramString);
  
  public abstract void onBinaryMessage(int paramInt, byte[] paramArrayOfByte);
  
  public abstract void onDestroy();
  
  public abstract void onInstanceCreated(int paramInt);
  
  public abstract void onInstanceDestroyed(int paramInt);
  
  public abstract void onMessage(int paramInt, String paramString);
  
  public abstract void onNewIntent(Intent paramIntent);
  
  public abstract void onPause();
  
  public abstract void onResume();
  
  public abstract void onStart();
  
  public abstract void onStop();
  
  public abstract String onSyncMessage(int paramInt, String paramString);
  
  public abstract void postBinaryMessage(int paramInt, byte[] paramArrayOfByte);
  
  public abstract void postMessage(int paramInt, String paramString);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/org/xwalk/core/extension/XWalkExternalExtensionBridge.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */