package org.xwalk.core.extension;

import org.json.JSONObject;

public class JsContextInfo
{
  private int extInstanceId;
  private XWalkExternalExtension extensionClient;
  private String objectId;
  private Class<?> targetClass;
  
  JsContextInfo(int paramInt, XWalkExternalExtension paramXWalkExternalExtension, Class<?> paramClass, String paramString)
  {
    this.extensionClient = paramXWalkExternalExtension;
    this.extInstanceId = paramInt;
    this.objectId = paramString;
    this.targetClass = paramClass;
  }
  
  public String getConstructorName()
  {
    return this.targetClass.getSimpleName();
  }
  
  public XWalkExternalExtension getExtensionClient()
  {
    return this.extensionClient;
  }
  
  public String getObjectId()
  {
    return this.objectId;
  }
  
  public String getTag()
  {
    return "Extension-" + this.extensionClient.getExtensionName();
  }
  
  public ReflectionHelper getTargetReflect()
  {
    return this.extensionClient.getTargetReflect(this.targetClass.getSimpleName());
  }
  
  public void postMessage(JSONObject paramJSONObject)
  {
    this.extensionClient.postMessage(this.extInstanceId, paramJSONObject.toString());
  }
  
  public void postMessage(byte[] paramArrayOfByte)
  {
    this.extensionClient.postBinaryMessage(this.extInstanceId, paramArrayOfByte);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/org/xwalk/core/extension/JsContextInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */