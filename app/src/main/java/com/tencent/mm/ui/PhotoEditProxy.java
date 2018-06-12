package com.tencent.mm.ui;

import com.tencent.mm.ak.l;
import com.tencent.mm.g.a.ch;
import com.tencent.mm.g.a.ch.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.fav.a.ad;
import com.tencent.mm.remoteservice.f;
import com.tencent.mm.storage.aa.a;

public class PhotoEditProxy
  extends com.tencent.mm.remoteservice.a
{
  public PhotoEditProxy(com.tencent.mm.remoteservice.d paramd)
  {
    super(paramd);
  }
  
  public int doFav(String paramString)
  {
    return ((Integer)REMOTE_CALL("doFavInMM", new Object[] { paramString })).intValue();
  }
  
  @f
  public int doFavInMM(String paramString)
  {
    ch localch = new ch();
    ((ad)com.tencent.mm.kernel.g.l(ad.class)).a(localch, paramString);
    localch.bJF.bJM = 44;
    com.tencent.mm.sdk.b.a.sFg.m(localch);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PhotoEditProxy", "[doFavInMM] path:%s", new Object[] { paramString });
    return localch.bJG.ret;
  }
  
  public String getFullPath(String paramString)
  {
    return (String)REMOTE_CALL("getFullPathInMM", new Object[] { paramString });
  }
  
  @f
  public String getFullPathInMM(String paramString)
  {
    return com.tencent.mm.ak.o.Pf().getFullPath(paramString);
  }
  
  public String getSelfUsername()
  {
    return (String)REMOTE_CALL("getSelfUsernameInMM", new Object[0]);
  }
  
  @f
  public String getSelfUsernameInMM()
  {
    return q.GF();
  }
  
  public boolean isAutoSave()
  {
    return ((Boolean)REMOTE_CALL("isAutoSavePhotoInMM", new Object[0])).booleanValue();
  }
  
  @f
  public boolean isAutoSavePhotoInMM()
  {
    return com.tencent.mm.kernel.g.Ei().DT().getBoolean(aa.a.sVr, true);
  }
  
  public void sendImage(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    REMOTE_CALL("sendImageInMM", new Object[] { paramString1, paramString2, paramString3, paramString4 });
  }
  
  @f
  public void sendImageInMM(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    paramString2 = new l(4, paramString3, paramString4, paramString2, 0, null, 0, "", "", true, af.a.chat_img_template);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.DF().a(paramString2, 0);
    com.tencent.mm.plugin.messenger.a.g.bcT().dF(paramString1, paramString4);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/PhotoEditProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */