package com.tencent.mm.plugin.mmsight.model;

import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.remoteservice.f;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.bn;
import java.io.Serializable;
import java.lang.reflect.Method;

public class CaptureMMProxy
  extends com.tencent.mm.remoteservice.a
{
  private static CaptureMMProxy leE;
  private static String leF = "";
  
  public CaptureMMProxy(com.tencent.mm.remoteservice.d paramd)
  {
    super(paramd);
  }
  
  public static void createProxy(CaptureMMProxy paramCaptureMMProxy)
  {
    leE = paramCaptureMMProxy;
  }
  
  public static CaptureMMProxy getInstance()
  {
    return leE;
  }
  
  public boolean checkUseMMVideoPlayer()
  {
    Object localObject = REMOTE_CALL("checkUseMMVideoPlayerInMM", new Object[0]);
    if (localObject != null)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CaptureMMProxy", "checkUseMMVideoPlayer[%b]", new Object[] { localObject });
      return ((Boolean)localObject).booleanValue();
    }
    return true;
  }
  
  @f
  public boolean checkUseMMVideoPlayerInMM()
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.CaptureMMProxy", "checkUseMMVideoPlayerInMM() called");
    com.tencent.mm.modelcontrol.d.NP();
    boolean bool = com.tencent.mm.modelcontrol.d.NW();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.CaptureMMProxy", "checkUseMMVideoPlayerInMM() returned: " + bool);
    return bool;
  }
  
  public Object get(aa.a parama, Object paramObject)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CaptureMMProxy", "get %s %s", new Object[] { parama, paramObject });
    Object localObject = REMOTE_CALL("getConfigStorage", new Object[] { parama, paramObject });
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CaptureMMProxy", "get %s %s and get val %s", new Object[] { parama, paramObject, localObject });
    if (localObject == null) {
      return paramObject;
    }
    return localObject;
  }
  
  public String getAccVideoPath()
  {
    String str = (String)REMOTE_CALL("getAccVideoPathInMM", new Object[0]);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CaptureMMProxy", "getAccVideoPathInMM " + str + " accVideoPath: " + leF);
    if (!bi.oW(str)) {
      leF = str;
    }
    if (!bi.oW(leF)) {
      str = leF;
    }
    return str;
  }
  
  @f
  public String getAccVideoPathInMM()
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.CaptureMMProxy", "getAccVideoPathInMM");
    com.tencent.mm.modelvideo.o.SZ();
    return com.tencent.mm.modelvideo.o.getAccVideoPath();
  }
  
  public boolean getBoolean(aa.a parama, boolean paramBoolean)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CaptureMMProxy", "getBoolean %s %s", new Object[] { parama, Boolean.valueOf(paramBoolean) });
    Object localObject = REMOTE_CALL("getConfigStorage", new Object[] { parama, Boolean.valueOf(paramBoolean) });
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CaptureMMProxy", "getBoolean %s %s and get val %s", new Object[] { parama, Boolean.valueOf(paramBoolean), localObject });
    if (localObject == null) {
      return paramBoolean;
    }
    return bi.getBoolean(localObject.toString(), paramBoolean);
  }
  
  @f
  public Object getConfigStorage(int paramInt, Object paramObject)
  {
    aa.a locala = ((aa.a[])aa.a.class.getEnumConstants())[paramInt];
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CaptureMMProxy", "getConfigStorage, %s %s", new Object[] { locala, paramObject });
    com.tencent.mm.kernel.g.Ek();
    return com.tencent.mm.kernel.g.Ei().DT().get(locala, paramObject);
  }
  
  public String getDeviceInfoConfig()
  {
    String str = (String)REMOTE_CALL("getDeviceInfoConfigInMM", new Object[0]);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CaptureMMProxy", "getDeviceInfoConfig return: %s", new Object[] { str });
    return str;
  }
  
  @f
  public String getDeviceInfoConfigInMM()
  {
    com.tencent.mm.kernel.g.Ek();
    return com.tencent.mm.kernel.g.Ei().DU().cmX();
  }
  
  public String getDynamicConfig(String paramString)
  {
    String str = (String)REMOTE_CALL("getDynamicConfigInMM", new Object[] { paramString });
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CaptureMMProxy", "getDynamicConfig, key: %s, value: %s", new Object[] { paramString, str });
    return str;
  }
  
  @f
  public String getDynamicConfigInMM(String paramString)
  {
    return ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.zero.b.a.class)).AT().getValue(paramString);
  }
  
  public int getInt(aa.a parama, int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CaptureMMProxy", "getInt %s %s", new Object[] { parama, Integer.valueOf(paramInt) });
    Object localObject = REMOTE_CALL("getConfigStorage", new Object[] { parama, Integer.valueOf(paramInt) });
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CaptureMMProxy", "getInt %s %s and get val %s", new Object[] { parama, Integer.valueOf(paramInt), localObject });
    if (localObject == null) {
      return paramInt;
    }
    return bi.getInt(localObject.toString(), paramInt);
  }
  
  public VideoTransPara getSnsAlbumVideoTransPara()
  {
    Parcelable localParcelable = (Parcelable)REMOTE_CALL("getSnsAlbumVideoTransParaInMM", new Object[0]);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.CaptureMMProxy", "getSnsAlbumVideoTransPara() returned: " + localParcelable);
    return (VideoTransPara)localParcelable;
  }
  
  @f
  public VideoTransPara getSnsAlbumVideoTransParaInMM()
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.CaptureMMProxy", "getSnsAlbumVideoTransParaInMM() called");
    VideoTransPara localVideoTransPara = com.tencent.mm.modelcontrol.d.NP().NS();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.CaptureMMProxy", "getVideoTransParaInMM() returned: " + localVideoTransPara);
    return localVideoTransPara;
  }
  
  public String getSubCoreImageFullPath(String paramString)
  {
    paramString = (String)REMOTE_CALL("getSubCoreImageFullPathInMM", new Object[] { paramString });
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CaptureMMProxy", "getSubCoreImageFullPath " + paramString);
    return paramString;
  }
  
  @f
  public String getSubCoreImageFullPathInMM(String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.CaptureMMProxy", "getSubCoreImageFullPathInMM, %s", new Object[] { paramString });
    return com.tencent.mm.ak.o.Pf().getFullPath(paramString);
  }
  
  public byte[] getWeixinMeta()
  {
    byte[] arrayOfByte = (byte[])REMOTE_CALL("getWeixinMetaDataInMM", new Object[0]);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CaptureMMProxy", "getWeixinMeta result: %s", new Object[] { arrayOfByte });
    return arrayOfByte;
  }
  
  @f
  public byte[] getWeixinMetaDataInMM()
  {
    return com.tencent.mm.modelcontrol.d.NP().getWeixinMeta();
  }
  
  protected final Bundle objectsToBundle(Object... paramVarArgs)
  {
    Bundle localBundle = new Bundle();
    int j = paramVarArgs.length;
    int i = 0;
    if (i < j)
    {
      if ((paramVarArgs[i] instanceof Bundle)) {
        localBundle.putBundle(String.valueOf(i), (Bundle)paramVarArgs[i]);
      }
      for (;;)
      {
        i += 1;
        break;
        if ((paramVarArgs[i] instanceof Parcelable))
        {
          localBundle.putParcelable(String.valueOf(i), (Parcelable)paramVarArgs[i]);
        }
        else if ((paramVarArgs[i] instanceof aa.a))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CaptureMMProxy", "objectsToBundle: %s", new Object[] { Integer.valueOf(((aa.a)paramVarArgs[i]).ordinal()) });
          localBundle.putInt(String.valueOf(i), ((aa.a)paramVarArgs[i]).ordinal());
        }
        else
        {
          localBundle.putSerializable(String.valueOf(i), (Serializable)paramVarArgs[i]);
        }
      }
    }
    return localBundle;
  }
  
  public void onCallback(String paramString, Bundle paramBundle, boolean paramBoolean)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CaptureMMProxy", "class:%s, method:%s, clientCall:%B", new Object[] { getClass().getName(), paramString, Boolean.valueOf(paramBoolean) });
    Object localObject2 = null;
    for (;;)
    {
      int i;
      Object localObject1;
      try
      {
        Method[] arrayOfMethod = getClass().getMethods();
        int j = arrayOfMethod.length;
        i = 0;
        localObject1 = localObject2;
        if (i >= j) {
          break label204;
        }
        localObject1 = arrayOfMethod[i];
        if (!((Method)localObject1).getName().equalsIgnoreCase(paramString)) {
          break label222;
        }
      }
      catch (Exception paramString)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CaptureMMProxy", "exception:%s", new Object[] { bi.i(paramString) });
        return;
      }
      if (((Method)localObject1).isAnnotationPresent((Class)localObject2))
      {
        localObject2 = ((Method)localObject1).invoke(this, getArgs(paramBundle));
        if (((Method)localObject1).getReturnType() != Void.TYPE)
        {
          if ((localObject2 instanceof Parcelable))
          {
            paramBundle.putParcelable("result_key", (Parcelable)localObject2);
            return;
          }
          if ("getConfigStorage".equals(paramString)) {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CaptureMMProxy", "put result as Serializable: %s", new Object[] { (Serializable)localObject2 });
          }
          paramBundle.putSerializable("result_key", (Serializable)localObject2);
          return;
          label204:
          if (localObject1 != null)
          {
            if (!paramBoolean) {
              break label231;
            }
            localObject2 = com.tencent.mm.remoteservice.e.class;
            continue;
          }
        }
      }
      return;
      label222:
      i += 1;
      continue;
      label231:
      localObject2 = f.class;
    }
  }
  
  public boolean set(aa.a parama, Object paramObject)
  {
    Boolean localBoolean = (Boolean)REMOTE_CALL("setConfigStorage", new Object[] { parama, paramObject });
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.CaptureMMProxy", "setConfigStorage, %s %s", new Object[] { parama, paramObject });
    return localBoolean.booleanValue();
  }
  
  @f
  public boolean setConfigStorage(int paramInt, Object paramObject)
  {
    aa.a locala = ((aa.a[])aa.a.class.getEnumConstants())[paramInt];
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CaptureMMProxy", "setConfigStorage, %s %s", new Object[] { locala, paramObject });
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Ei().DT().a(locala, paramObject);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/mmsight/model/CaptureMMProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */