package org.xwalk.core.extension;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public abstract interface XWalkExtensionContextClient
{
  public abstract void broadcastMessage(XWalkExternalExtension paramXWalkExternalExtension, String paramString);
  
  public abstract Activity getActivity();
  
  public abstract Context getContext();
  
  public abstract void postBinaryMessage(XWalkExternalExtension paramXWalkExternalExtension, int paramInt, byte[] paramArrayOfByte);
  
  public abstract void postMessage(XWalkExternalExtension paramXWalkExternalExtension, int paramInt, String paramString);
  
  public abstract void registerExtension(XWalkExternalExtension paramXWalkExternalExtension);
  
  public abstract void startActivityForResult(Intent paramIntent, int paramInt, Bundle paramBundle);
  
  public abstract void unregisterExtension(String paramString);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/org/xwalk/core/extension/XWalkExtensionContextClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */