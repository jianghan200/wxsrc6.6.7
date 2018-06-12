package com.tencent.mm.plugin.webview.model;

import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.modelcdntran.c;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.protocal.c.arw;
import com.tencent.mm.protocal.c.ary;
import com.tencent.mm.protocal.c.asc;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class ad
  implements com.tencent.mm.ab.e
{
  private i.a dVu = new ad.1(this);
  private CopyOnWriteArraySet<d.b> pRK = new CopyOnWriteArraySet();
  private CopyOnWriteArraySet<d.a> pRL = new CopyOnWriteArraySet();
  
  public static boolean Qm(String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WebviewFileChooserCdnService", "cancelDownloadTask get webview file chooser item  by local id : %s", new Object[] { paramString });
    return com.tencent.mm.modelcdntran.g.ND().lx(paramString);
  }
  
  private void a(WebViewJSSDKFileItem paramWebViewJSSDKFileItem)
  {
    i locali = new i();
    locali.dPV = this.dVu;
    locali.ceW = false;
    locali.field_mediaId = paramWebViewJSSDKFileItem.mediaId;
    locali.field_fullpath = paramWebViewJSSDKFileItem.fnM;
    locali.field_totalLen = paramWebViewJSSDKFileItem.pRN.field_fileLength;
    locali.field_fileType = com.tencent.mm.modelcdntran.b.MediaType_FILE;
    locali.field_fileId = paramWebViewJSSDKFileItem.pRN.field_fileId;
    locali.field_aesKey = paramWebViewJSSDKFileItem.pRN.field_aesKey;
    locali.field_priority = com.tencent.mm.modelcdntran.b.dOk;
    locali.field_needStorage = false;
    locali.field_isStreamMedia = false;
    boolean bool = com.tencent.mm.modelcdntran.g.ND().b(locali, -1);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WebviewFileChooserCdnService", "add download cdn task : %b, localid : %s", new Object[] { Boolean.valueOf(bool), paramWebViewJSSDKFileItem.fnN });
    if (!bool) {
      b(false, null, null, null);
    }
  }
  
  private void b(boolean paramBoolean, String paramString1, String paramString2, String paramString3)
  {
    if ((this.pRK != null) && (this.pRK.size() > 0))
    {
      Iterator localIterator = this.pRK.iterator();
      while (localIterator.hasNext()) {
        ((d.b)localIterator.next()).a(paramBoolean, paramString1, paramString2, paramString3);
      }
    }
  }
  
  public static boolean rq(String paramString)
  {
    WebViewJSSDKFileItem localWebViewJSSDKFileItem = com.tencent.mm.plugin.webview.modeltools.e.bUX().Qq(paramString);
    if (localWebViewJSSDKFileItem == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WebviewFileChooserCdnService", "cancelUploadTask get webview file chooser item  by local id failed : %s", new Object[] { paramString });
      return false;
    }
    return com.tencent.mm.modelcdntran.g.ND().lw(localWebViewJSSDKFileItem.mediaId);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WebviewFileChooserCdnService", "onSceneEnd, errType = %d, errCode = %d, funcType = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paraml.getType()) });
    switch (paraml.getType())
    {
    }
    Object localObject1;
    Object localObject2;
    boolean bool;
    label251:
    do
    {
      do
      {
        do
        {
          return;
          au.DF().b(1034, this);
          localObject1 = (x)paraml;
          paramString = ((asc)((x)localObject1).diG.dIE.dIL).rUv;
          paraml = ((x)localObject1).appId;
          localObject1 = ((x)localObject1).bNH;
          localObject2 = com.tencent.mm.plugin.webview.modeltools.e.bUX().Qq((String)localObject1);
          if (localObject2 == null) {}
          for (bool = true;; bool = false)
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WebviewFileChooserCdnService", "get server server id : %s from server for appid : %s, localId = %s, item == null ? %b", new Object[] { paramString, paraml, localObject1, Boolean.valueOf(bool) });
            if ((paramInt1 != 0) || (paramInt2 != 0)) {
              break label251;
            }
            if ((bi.oW(paraml)) || (bi.oW(paramString)) || (localObject2 == null)) {
              break;
            }
            ((WebViewJSSDKFileItem)localObject2).fnN = paramString;
            b(true, ((WebViewJSSDKFileItem)localObject2).bMT, 100, ((WebViewJSSDKFileItem)localObject2).bNH, ((WebViewJSSDKFileItem)localObject2).fnN);
            b(true, ((WebViewJSSDKFileItem)localObject2).bNH, ((WebViewJSSDKFileItem)localObject2).fnN, ((WebViewJSSDKFileItem)localObject2).pRN.field_fileUrl);
            return;
          }
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WebviewFileChooserCdnService", "upload cdn info failed");
        } while (localObject2 == null);
        b(false, ((WebViewJSSDKFileItem)localObject2).bNH, ((WebViewJSSDKFileItem)localObject2).mediaId, null);
        return;
        au.DF().b(1035, this);
        if ((paramInt1 != 0) || (paramInt2 != 0)) {
          break label617;
        }
        paramString = (g)paraml;
        paraml = paramString.appId;
        localObject1 = paramString.fnN;
        localObject2 = ((ary)paramString.diG.dIE.dIL).rUw;
        if (localObject2 != null) {
          break;
        }
        bool = true;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WebviewFileChooserCdnService", "appid = %s, serverId = %s, cdninfo == null ? %b", new Object[] { paraml, localObject1, Boolean.valueOf(bool) });
      } while ((bi.oW(paraml)) || (bi.oW((String)localObject1)) || (localObject2 == null));
      paramString = ((arw)localObject2).type;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WebviewFileChooserCdnService", "cdn info type = %s", new Object[] { paramString });
    } while (bi.oW(paramString));
    if (paramString.toLowerCase().equals("voice"))
    {
      paramString = WebViewJSSDKFileItem.Qo(aj.Qx(paraml));
      label445:
      paramString.fnP = false;
      paramString.appId = paraml;
      paramString.fnN = ((String)localObject1);
      if (paramString.pRN == null) {
        paramString.pRN = new WebViewJSSDKFileItem.a();
      }
      if (localObject2 != null) {
        break label578;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WebViewJSSDKFileItem", "jsapidcdn info is null");
    }
    for (;;)
    {
      com.tencent.mm.plugin.webview.modeltools.e.bUX().b(paramString);
      a(paramString);
      return;
      bool = false;
      break;
      if (paramString.toLowerCase().equals("video"))
      {
        paramString = WebViewJSSDKFileItem.Qp(aj.Qr(bi.VF()));
        break label445;
      }
      paramString = WebViewJSSDKFileItem.Qn(aj.Qr(bi.VF()));
      break label445;
      label578:
      paramString.pRN.field_aesKey = ((arw)localObject2).rUt;
      paramString.pRN.field_fileId = ((arw)localObject2).rUs;
      paramString.pRN.field_fileLength = ((arw)localObject2).rqN;
    }
    label617:
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WebviewFileChooserCdnService", "download cdn info failed");
    b(false, null, null, null);
  }
  
  public final void a(d.a parama)
  {
    if ((this.pRL != null) && (parama != null) && (!this.pRL.contains(parama))) {
      this.pRL.add(parama);
    }
  }
  
  public final void a(d.b paramb)
  {
    if ((this.pRK != null) && (paramb != null)) {
      this.pRK.remove(paramb);
    }
  }
  
  public final boolean a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, d.b paramb)
  {
    WebViewJSSDKFileItem localWebViewJSSDKFileItem = com.tencent.mm.plugin.webview.modeltools.e.bUX().Qq(paramString2);
    if (localWebViewJSSDKFileItem == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WebviewFileChooserCdnService", "addUploadTask get webview file chooser item  by local id failed : %s", new Object[] { paramString2 });
      return false;
    }
    localWebViewJSSDKFileItem.appId = paramString1;
    if (paramb != null) {
      this.pRK.add(paramb);
    }
    if (paramInt2 == 202) {
      localWebViewJSSDKFileItem.fnR = false;
    }
    localWebViewJSSDKFileItem.fnP = true;
    paramString1 = new i();
    paramString1.dPV = this.dVu;
    paramString1.ceW = true;
    paramString1.field_mediaId = localWebViewJSSDKFileItem.mediaId;
    paramString1.field_fullpath = localWebViewJSSDKFileItem.fnM;
    paramString1.field_fileType = paramInt1;
    paramString1.field_talker = "weixin";
    paramString1.field_priority = com.tencent.mm.modelcdntran.b.dOk;
    if (paramInt1 == com.tencent.mm.modelcdntran.b.dOo) {}
    for (paramString1.field_needStorage = true;; paramString1.field_needStorage = false)
    {
      paramString1.field_isStreamMedia = false;
      paramString1.field_appType = paramInt2;
      paramString1.field_bzScene = paramInt3;
      paramString1.field_force_aeskeycdn = true;
      paramString1.field_trysafecdn = false;
      boolean bool = com.tencent.mm.modelcdntran.g.ND().c(paramString1);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WebviewFileChooserCdnService", "summersafecdn add upload cdn task : %b, force_aeskeycdn: %b, trysafecdn: %b, localid : %s ", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(paramString1.field_force_aeskeycdn), Boolean.valueOf(paramString1.field_trysafecdn), paramString2 });
      return bool;
    }
  }
  
  public final boolean a(String paramString1, String paramString2, d.b paramb)
  {
    Object localObject = com.tencent.mm.plugin.webview.modeltools.e.bUX();
    if (bi.oW(paramString2))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WebViewJSSDKFileItemManager", "getItemByServerId error, media id is null or nil");
      break label98;
      label21:
      localObject = null;
    }
    for (;;)
    {
      if (localObject == null) {
        break label138;
      }
      ((WebViewJSSDKFileItem)localObject).appId = paramString1;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WebviewFileChooserCdnService", "the file item has alreay in local : appid : %s, serverId : %s, localId : %s", new Object[] { paramString1, paramString2, ((WebViewJSSDKFileItem)localObject).bNH });
      paramb.a(true, ((WebViewJSSDKFileItem)localObject).bNH, ((WebViewJSSDKFileItem)localObject).fnN, null);
      return true;
      Iterator localIterator = ((ae)localObject).pRP.values().iterator();
      label98:
      if (!localIterator.hasNext()) {
        break label21;
      }
      localObject = (WebViewJSSDKFileItem)localIterator.next();
      if (!bi.oV(((WebViewJSSDKFileItem)localObject).fnN).equals(paramString2)) {
        break;
      }
    }
    label138:
    au.DF().a(1035, this);
    paramString1 = new g(paramString1, paramString2);
    au.DF().a(paramString1, 0);
    this.pRK.add(paramb);
    return true;
  }
  
  public final void b(d.a parama)
  {
    if ((this.pRL != null) && (parama != null)) {
      this.pRL.remove(parama);
    }
  }
  
  final void b(boolean paramBoolean, int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WebviewFileChooserCdnService", "notifyProgressCallback, upload : %b, mediaType : %d, percent : %d, localId : %s, mediaId : %s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString1, paramString2 });
    if ((this.pRL != null) && (this.pRL.size() > 0))
    {
      Iterator localIterator = this.pRL.iterator();
      while (localIterator.hasNext()) {
        ((d.a)localIterator.next()).a(paramBoolean, paramInt1, paramInt2, paramString1, paramString2);
      }
    }
  }
  
  public final boolean b(String paramString1, String paramString2, d.b paramb)
  {
    return a(paramString1, paramString2, com.tencent.mm.modelcdntran.b.MediaType_FILE, 0, 0, paramb);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/webview/model/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */