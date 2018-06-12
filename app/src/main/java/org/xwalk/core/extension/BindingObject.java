package org.xwalk.core.extension;

public class BindingObject
{
  private String TAG = "BindingObject";
  protected MessageHandler mHandler = new MessageHandler();
  protected ExtensionInstanceHelper mInstanceHelper;
  protected String mObjectId;
  
  public Object handleMessage(MessageInfo paramMessageInfo)
  {
    return this.mHandler.handleMessage(paramMessageInfo);
  }
  
  public void initBindingInfo(String paramString, ExtensionInstanceHelper paramExtensionInstanceHelper)
  {
    this.mObjectId = paramString;
    this.mInstanceHelper = paramExtensionInstanceHelper;
  }
  
  public void onDestroy() {}
  
  public void onJsBound() {}
  
  public void onJsDestroyed() {}
  
  public void onPause() {}
  
  public void onResume() {}
  
  public void onStart() {}
  
  public void onStop() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/org/xwalk/core/extension/BindingObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */