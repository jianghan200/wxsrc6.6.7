package com.tenpay.android.wechat;

import com.tenpay.ndk.Encrypt;

public final class TenpaySecureEncrypt
  implements ISecureEncrypt
{
  public final String desedeEncode(String paramString1, String paramString2)
  {
    return new Encrypt().desedeEncode(paramString1);
  }
  
  public final String desedeVerifyCode(String paramString1, String paramString2)
  {
    return new Encrypt().desedeVerifyCode(paramString1);
  }
  
  public final String encryptPasswd(boolean paramBoolean, String paramString1, String paramString2)
  {
    String str = paramString1;
    if (paramBoolean) {
      str = TenpayUtil.md5HexDigest(paramString1);
    }
    paramString1 = new Encrypt();
    if (paramString2 != null) {
      paramString1.setTimeStamp(paramString2);
    }
    return paramString1.encryptPasswd(str);
  }
  
  public final String encryptPasswdWithRSA2048(boolean paramBoolean, String paramString1, String paramString2)
  {
    String str = paramString1;
    if (paramBoolean) {
      str = TenpayUtil.md5HexDigest(paramString1);
    }
    paramString1 = new Encrypt();
    if (paramString2 != null) {
      paramString1.setTimeStamp(paramString2);
    }
    return paramString1.encryptPasswdWithRSA2048(str);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tenpay/android/wechat/TenpaySecureEncrypt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */