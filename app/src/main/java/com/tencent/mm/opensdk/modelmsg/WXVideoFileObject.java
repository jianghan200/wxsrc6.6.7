package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.opensdk.utils.Log;
import java.io.File;

public class WXVideoFileObject
  implements WXMediaMessage.IMediaObject
{
  private static final int FILE_SIZE_LIMIT = 10485760;
  private static final String TAG = "MicroMsg.SDK.WXVideoFileObject";
  public String filePath;
  
  public WXVideoFileObject()
  {
    this.filePath = null;
  }
  
  public WXVideoFileObject(String paramString)
  {
    this.filePath = paramString;
  }
  
  private int getFileSize(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {}
    do
    {
      return 0;
      paramString = new File(paramString);
    } while (!paramString.exists());
    return (int)paramString.length();
  }
  
  public boolean checkArgs()
  {
    if ((this.filePath == null) || (this.filePath.length() == 0))
    {
      Log.e("MicroMsg.SDK.WXVideoFileObject", "checkArgs fail, filePath is null");
      return false;
    }
    if (getFileSize(this.filePath) > 10485760)
    {
      Log.e("MicroMsg.SDK.WXVideoFileObject", "checkArgs fail, video file size is too large");
      return false;
    }
    return true;
  }
  
  public void serialize(Bundle paramBundle)
  {
    paramBundle.putString("_wxvideofileobject_filePath", this.filePath);
  }
  
  public int type()
  {
    return 38;
  }
  
  public void unserialize(Bundle paramBundle)
  {
    this.filePath = paramBundle.getString("_wxvideofileobject_filePath");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/opensdk/modelmsg/WXVideoFileObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */