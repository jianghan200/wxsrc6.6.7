package com.tencent.recovery;

import android.content.Context;
import com.tencent.recovery.option.CommonOptions;
import com.tencent.recovery.option.CommonOptions.Builder;
import com.tencent.recovery.option.IOptionsCreator;
import com.tencent.recovery.option.ProcessOptions;
import com.tencent.recovery.util.Util;
import com.tencent.recovery.wx.WXConstantsRecovery;
import com.tencent.recovery.wx.service.WXRecoveryHandleService;
import com.tencent.recovery.wx.service.WXRecoveryUploadService;
import com.tencent.recovery.wx.util.FileUtil;
import com.tencent.recovery.wx.util.WXUtil;
import java.io.File;

public class DefaultOptionsCreator
  implements IOptionsCreator
{
  private String clientVersion;
  
  private String getClientVersion()
  {
    if (Util.oW(this.clientVersion))
    {
      File localFile = new File(WXConstantsRecovery.vhL, "version.info");
      if (localFile.exists()) {
        this.clientVersion = FileUtil.W(localFile);
      }
    }
    if (Util.oW(this.clientVersion)) {
      this.clientVersion = "0x26060736";
    }
    return this.clientVersion;
  }
  
  public CommonOptions createCommonOptions(Context paramContext)
  {
    CommonOptions.Builder localBuilder = new CommonOptions.Builder();
    localBuilder.vhz = WXRecoveryHandleService.class.getName();
    localBuilder.vhA = WXRecoveryUploadService.class.getName();
    localBuilder.clientVersion = getClientVersion();
    localBuilder.vhv = String.format("http://dldir1.qq.com/weixin/android/recovery-%s.conf", new Object[] { getClientVersion() });
    localBuilder.fMk = WXUtil.hp(paramContext);
    localBuilder.vhB = true;
    localBuilder.vhC = 600000L;
    localBuilder.vhD = 600000L;
    return localBuilder.cEZ();
  }
  
  public ProcessOptions createProcessOptions(String paramString, int paramInt)
  {
    return null;
  }
  
  public String toString()
  {
    return String.format("Creator: [ClientVersion=%s]", new Object[] { getClientVersion() });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/recovery/DefaultOptionsCreator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */