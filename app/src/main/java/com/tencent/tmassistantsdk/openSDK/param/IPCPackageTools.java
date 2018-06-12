package com.tencent.tmassistantsdk.openSDK.param;

import android.text.TextUtils;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.tmassistantsdk.openSDK.param.jce.IPCCmd;
import com.tencent.tmassistantsdk.openSDK.param.jce.IPCHead;
import com.tencent.tmassistantsdk.openSDK.param.jce.IPCRequest;
import com.tencent.tmassistantsdk.openSDK.param.jce.IPCResponse;
import com.tencent.tmassistantsdk.protocol.ProtocolPackage;
import com.tencent.tmassistantsdk.util.GlobalUtil;

public class IPCPackageTools
{
  protected static final String CHILD_NAME = ".jce.";
  static final String CRYPT_KEY = "ji*9^&43U0X-~./(";
  private static final String TAG = "IPCPackageTools";
  protected static int mReqId = 0;
  
  public static IPCRequest buildIpcRequest(JceStruct paramJceStruct)
  {
    if (paramJceStruct == null) {
      return null;
    }
    IPCRequest localIPCRequest = new IPCRequest();
    IPCHead localIPCHead = new IPCHead();
    int i = mReqId;
    mReqId = i + 1;
    localIPCHead.requestId = i;
    localIPCHead.cmdId = getCmdId(paramJceStruct);
    localIPCHead.hostPackageName = GlobalUtil.getAppPackageName(GlobalUtil.getInstance().getContext());
    localIPCHead.hostVersionCode = String.valueOf(GlobalUtil.getAppVersionCode(GlobalUtil.getInstance().getContext()));
    localIPCRequest.head = localIPCHead;
    localIPCRequest.body = jceStruct2ByteArray(paramJceStruct);
    return localIPCRequest;
  }
  
  public static byte[] buildPostData(IPCRequest paramIPCRequest)
  {
    if (paramIPCRequest == null) {
      return null;
    }
    paramIPCRequest.body = ProtocolPackage.encrypt(paramIPCRequest.body, "ji*9^&43U0X-~./(".getBytes());
    return jceStruct2ByteArray(paramIPCRequest);
  }
  
  private static JceStruct createFromRequest(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    paramString = IPCPackageTools.class.getPackage().getName() + ".jce." + paramString;
    paramString = paramString + "Response";
    try
    {
      paramString = (JceStruct)Class.forName(paramString).newInstance();
      return paramString;
    }
    catch (ClassNotFoundException paramString)
    {
      for (;;)
      {
        x.printErrStackTrace("IPCPackageTools", paramString, "", new Object[0]);
        paramString = null;
      }
    }
    catch (IllegalAccessException paramString)
    {
      for (;;)
      {
        x.printErrStackTrace("IPCPackageTools", paramString, "", new Object[0]);
        paramString = null;
      }
    }
    catch (InstantiationException paramString)
    {
      for (;;)
      {
        x.printErrStackTrace("IPCPackageTools", paramString, "", new Object[0]);
        paramString = null;
      }
    }
  }
  
  public static int getCmdId(JceStruct paramJceStruct)
  {
    if (paramJceStruct == null) {
      return -1;
    }
    paramJceStruct = paramJceStruct.getClass().getSimpleName();
    return IPCCmd.convert(paramJceStruct.substring(0, paramJceStruct.length() - 7)).value();
  }
  
  public static byte[] jceStruct2ByteArray(JceStruct paramJceStruct)
  {
    return ProtocolPackage.jceStructToUTF8Byte(paramJceStruct);
  }
  
  public static JceStruct unpackBodyStruct(IPCResponse paramIPCResponse)
  {
    JceStruct localJceStruct = createFromRequest(IPCCmd.convert(paramIPCResponse.head.cmdId).toString());
    if ((localJceStruct != null) && (paramIPCResponse.body.length > 0)) {
      try
      {
        paramIPCResponse = new JceInputStream(paramIPCResponse.body);
        paramIPCResponse.setServerEncoding("utf-8");
        localJceStruct.readFrom(paramIPCResponse);
        return localJceStruct;
      }
      catch (Exception paramIPCResponse)
      {
        x.printErrStackTrace("IPCPackageTools", paramIPCResponse, "", new Object[0]);
        return null;
      }
    }
    return null;
  }
  
  public static IPCResponse unpackPackage(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length < 4)) {
      paramArrayOfByte = null;
    }
    for (;;)
    {
      return paramArrayOfByte;
      IPCResponse localIPCResponse = new IPCResponse();
      try
      {
        paramArrayOfByte = new JceInputStream(paramArrayOfByte);
        paramArrayOfByte.setServerEncoding("utf-8");
        localIPCResponse.readFrom(paramArrayOfByte);
        paramArrayOfByte = localIPCResponse;
        if (!TextUtils.isEmpty(localIPCResponse.head.hostPackageName))
        {
          localIPCResponse.body = ProtocolPackage.decrypt(localIPCResponse.body, "ji*9^&43U0X-~./(".getBytes());
          return localIPCResponse;
        }
      }
      catch (Exception paramArrayOfByte)
      {
        x.printErrStackTrace("IPCPackageTools", paramArrayOfByte, "", new Object[0]);
      }
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tmassistantsdk/openSDK/param/IPCPackageTools.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */