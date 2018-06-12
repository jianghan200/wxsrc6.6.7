package com.tencent.mm.ui.transmit;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.MotionEvent;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.v;
import com.tencent.mm.bg.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.model.u;
import com.tencent.mm.model.u.b;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.mm.opensdk.modelmsg.WXVideoFileObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.pluginsdk.model.app.ReportUtil;
import com.tencent.mm.pluginsdk.model.j;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.protocal.c.cgm;
import com.tencent.mm.protocal.c.cgn;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.y.g.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

@com.tencent.mm.ui.base.a(3)
public class SendAppMessageWrapperUI
  extends MMActivity
{
  private al bAZ = new al(new SendAppMessageWrapperUI.1(this), true);
  private String bhd = null;
  private int jgc = 0;
  private int scene = 0;
  private WXMediaMessage tLD = null;
  private com.tencent.mm.ui.base.p tipDialog;
  private String toUser = null;
  private com.tencent.mm.pluginsdk.model.app.f uEI = null;
  private boolean uEJ = false;
  
  private q.a a(WXMediaMessage paramWXMediaMessage)
  {
    return new SendAppMessageWrapperUI.3(this, paramWXMediaMessage);
  }
  
  private void a(WXMediaMessage paramWXMediaMessage, LinkedList<String> paramLinkedList)
  {
    Object localObject1;
    if ((paramWXMediaMessage == null) || (!(paramWXMediaMessage.mediaObject instanceof WXImageObject)))
    {
      x.w("MicroMsg.SendAppMessageWrapperUI", "sendImgMsg msg not img");
      localObject1 = null;
    }
    while (bi.oW((String)localObject1))
    {
      x.e("MicroMsg.SendAppMessageWrapperUI", "sendImgMsg imgPath is null");
      return;
      localObject1 = (WXImageObject)paramWXMediaMessage.mediaObject;
      if (!bi.bC(((WXImageObject)localObject1).imageData))
      {
        x.d("MicroMsg.SendAppMessageWrapperUI", "getImagePath fileData:" + ((WXImageObject)localObject1).imageData.length);
        localObject1 = com.tencent.mm.pluginsdk.model.app.l.bh(((WXImageObject)localObject1).imageData);
      }
      else
      {
        localObject1 = ((WXImageObject)localObject1).imagePath;
      }
    }
    if (com.tencent.mm.a.e.cm((String)localObject1) > 26214400) {}
    for (int i = 0;; i = 1)
    {
      Object localObject2 = this.uEI.field_appId;
      String str1 = paramWXMediaMessage.mediaTagName;
      String str2 = paramWXMediaMessage.messageExt;
      paramWXMediaMessage = paramWXMediaMessage.messageAction;
      if (!bi.oW((String)localObject2)) {}
      for (paramWXMediaMessage = "<msg>" + com.tencent.mm.ak.f.c((String)localObject2, str1, str2, paramWXMediaMessage) + "</msg>";; paramWXMediaMessage = null)
      {
        paramLinkedList = paramLinkedList.iterator();
        while (paramLinkedList.hasNext())
        {
          localObject2 = (String)paramLinkedList.next();
          localObject2 = new com.tencent.mm.ak.l(6, q.GF(), (String)localObject2, (String)localObject1, i, null, 0, paramWXMediaMessage, "", true, R.g.chat_img_to_bg_mask);
          au.DF().a((com.tencent.mm.ab.l)localObject2, 0);
        }
        break;
      }
    }
  }
  
  private void b(WXMediaMessage paramWXMediaMessage, LinkedList<String> paramLinkedList)
  {
    WXMiniProgramObject localWXMiniProgramObject = (WXMiniProgramObject)paramWXMediaMessage.mediaObject;
    ((com.tencent.mm.plugin.appbrand.n.c)g.l(com.tencent.mm.plugin.appbrand.n.c.class)).rR(localWXMiniProgramObject.userName);
    Object localObject1 = new StringBuilder("1_");
    ((StringBuilder)localObject1).append(this.uEI.field_appId);
    ((StringBuilder)localObject1).append("_");
    au.HU();
    ((StringBuilder)localObject1).append(com.tencent.mm.a.o.getString(com.tencent.mm.model.c.Df()));
    ((StringBuilder)localObject1).append("_");
    ((StringBuilder)localObject1).append(bi.VE());
    ((StringBuilder)localObject1).append("_");
    ((StringBuilder)localObject1).append("1");
    Object localObject2 = ((StringBuilder)localObject1).toString();
    localObject1 = ((com.tencent.mm.plugin.appbrand.n.c)g.l(com.tencent.mm.plugin.appbrand.n.c.class)).rR(localWXMiniProgramObject.userName);
    Object localObject3;
    Object localObject4;
    if (localWXMiniProgramObject.withShareTicket)
    {
      if (localObject1 == null)
      {
        x.e("MicroMsg.SendAppMessageWrapperUI", "get wxaAttributes for appbrand info failed");
        setResult(-1);
        finish();
        ReportUtil.a(this, ReportUtil.c(getIntent().getExtras(), -1));
        return;
      }
      localObject3 = new b.a();
      ((b.a)localObject3).dIF = 1118;
      ((b.a)localObject3).uri = "/cgi-bin/mmbiz-bin/wxaapp/getshareinfo";
      localObject4 = new cgm();
      ((cgm)localObject4).bPS = ((WxaAttributes)localObject1).field_appId;
      ((cgm)localObject4).sAI = paramLinkedList;
      ((b.a)localObject3).dIG = ((com.tencent.mm.bk.a)localObject4);
      ((b.a)localObject3).dIH = new cgn();
      v.a(((b.a)localObject3).KT(), new SendAppMessageWrapperUI.6(this, paramLinkedList, (WxaAttributes)localObject1, localWXMiniProgramObject, (String)localObject2, paramWXMediaMessage));
      label283:
      paramLinkedList = paramLinkedList.iterator();
      label288:
      if (paramLinkedList.hasNext())
      {
        localObject1 = (String)paramLinkedList.next();
        if (!((String)localObject1).endsWith("chatroom")) {
          break label569;
        }
      }
    }
    label569:
    for (int i = 1;; i = 0)
    {
      localObject2 = com.tencent.mm.compatible.util.p.encode(bi.oV(localWXMiniProgramObject.webpageUrl));
      localObject3 = com.tencent.mm.compatible.util.p.encode(bi.oV(paramWXMediaMessage.title));
      localObject4 = com.tencent.mm.compatible.util.p.encode(bi.oV(paramWXMediaMessage.description));
      String str = com.tencent.mm.compatible.util.p.encode(bi.oV(localWXMiniProgramObject.path));
      com.tencent.mm.plugin.report.service.h.mEJ.h(14127, new Object[] { this.uEI.field_appId, localWXMiniProgramObject.userName, str, localObject3, localObject4, "", localObject2, Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(i), localObject1 });
      break label288;
      break;
      localObject2 = paramLinkedList.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (String)((Iterator)localObject2).next();
        localObject4 = new g.a();
        ((g.a)localObject4).appId = this.uEI.field_appId;
        ((g.a)localObject4).dyT = ((WxaAttributes)localObject1).field_appId;
        ((g.a)localObject4).dyZ = localWXMiniProgramObject.miniprogramType;
        ((g.a)localObject4).appName = this.uEI.field_appName;
        ((g.a)localObject4).dwr = 2;
        com.tencent.mm.pluginsdk.model.app.l.a((g.a)localObject4, paramWXMediaMessage, (String)localObject3);
      }
      break label283;
    }
  }
  
  private void c(WXMediaMessage paramWXMediaMessage, LinkedList<String> paramLinkedList)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(((WXVideoFileObject)paramWXMediaMessage.mediaObject).filePath);
    if (localArrayList.size() > 0)
    {
      paramWXMediaMessage = paramLinkedList.iterator();
      while (paramWXMediaMessage.hasNext())
      {
        paramLinkedList = (String)paramWXMediaMessage.next();
        x.i("MicroMsg.SendAppMessageWrapperUI", "sendMultiVedeo");
        paramLinkedList = new j(this, localArrayList, getIntent(), paramLinkedList, 1, new SendAppMessageWrapperUI.7(this));
        com.tencent.mm.sdk.f.e.post(paramLinkedList, "ChattingUI_importMultiVideo");
        getString(R.l.app_tip);
        this.tipDialog = com.tencent.mm.ui.base.h.a(this, getString(R.l.app_waiting), true, new SendAppMessageWrapperUI.8(this, paramLinkedList));
      }
    }
  }
  
  private void cAj()
  {
    Intent localIntent = com.tencent.mm.modelsns.a.a(this.tLD, this.uEI.field_appId, this.uEI.field_appName);
    if (localIntent == null)
    {
      finish();
      return;
    }
    String str = null;
    if ((this.tLD.getType() == 5) || (this.tLD.getType() == 2) || (this.tLD.getType() == 38))
    {
      x.d("MicroMsg.SendAppMessageWrapperUI", "report(11954), to timeline, appId : %s", new Object[] { this.uEI.field_appId });
      str = u.ic("app_" + this.uEI.field_appId);
      u.b localb = u.Hx().v(str, true);
      localb.p("prePublishId", "app_" + this.uEI.field_appId);
      if ((this.tLD.mediaObject instanceof WXWebpageObject)) {
        localb.p("url", ((WXWebpageObject)this.tLD.mediaObject).webpageUrl);
      }
    }
    localIntent.putExtra("reportSessionId", str);
    d.b(this, "sns", ".ui.SnsUploadUI", localIntent, 1);
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  protected final void initView() {}
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    x.i("MicroMsg.SendAppMessageWrapperUI", "requestCode " + paramInt1 + " resultCode " + paramInt2);
    if (paramInt1 == 1) {
      if (paramInt2 == -1)
      {
        ReportUtil.a(this, ReportUtil.c(getIntent().getExtras(), 0));
        finish();
      }
    }
    while ((paramInt1 != 2) || (paramInt2 != -1)) {
      for (;;)
      {
        return;
        ReportUtil.a(this, ReportUtil.c(getIntent().getExtras(), -2));
      }
    }
    WXVideoFileObject localWXVideoFileObject = (WXVideoFileObject)this.tLD.mediaObject;
    localWXVideoFileObject.filePath = paramIntent.getStringExtra("K_SEGMENTVIDEOPATH");
    if ((!bi.oW(localWXVideoFileObject.filePath)) && (com.tencent.mm.a.e.cn(localWXVideoFileObject.filePath)))
    {
      cAj();
      return;
    }
    setResult(-5);
    finish();
  }
  
  /* Error */
  public void onCreate(android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial 900	com/tencent/mm/ui/MMActivity:onCreate	(Landroid/os/Bundle;)V
    //   5: aload_0
    //   6: invokevirtual 904	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:getSupportActionBar	()Landroid/support/v7/app/ActionBar;
    //   9: invokevirtual 909	android/support/v7/app/ActionBar:hide	()V
    //   12: aload_0
    //   13: invokestatic 914	com/tencent/mm/sdk/platformtools/ad:chY	()Ljava/lang/String;
    //   16: iconst_0
    //   17: invokevirtual 918	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   20: astore_1
    //   21: aload_1
    //   22: ldc_w 920
    //   25: iconst_0
    //   26: invokeinterface 926 3 0
    //   31: ifne +42 -> 73
    //   34: ldc 73
    //   36: ldc_w 928
    //   39: invokestatic 118	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   42: aload_0
    //   43: iconst_1
    //   44: putfield 39	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:uEJ	Z
    //   47: aload_0
    //   48: iconst_m1
    //   49: invokevirtual 931	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:setRequestedOrientation	(I)V
    //   52: aload_1
    //   53: invokeinterface 935 1 0
    //   58: ldc_w 920
    //   61: iconst_1
    //   62: invokeinterface 941 3 0
    //   67: invokeinterface 944 1 0
    //   72: pop
    //   73: aload_0
    //   74: invokevirtual 434	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:getIntent	()Landroid/content/Intent;
    //   77: invokevirtual 440	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   80: astore_1
    //   81: new 946	com/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req
    //   84: dup
    //   85: aload_1
    //   86: invokespecial 948	com/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req:<init>	(Landroid/os/Bundle;)V
    //   89: astore 4
    //   91: aload_0
    //   92: aload_1
    //   93: ldc_w 735
    //   96: invokevirtual 950	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   99: putfield 33	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:toUser	Ljava/lang/String;
    //   102: aload_0
    //   103: aload_1
    //   104: ldc_w 952
    //   107: iconst_0
    //   108: invokevirtual 953	android/os/Bundle:getInt	(Ljava/lang/String;I)I
    //   111: putfield 37	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:scene	I
    //   114: aload_1
    //   115: ldc_w 955
    //   118: invokevirtual 950	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   121: astore 5
    //   123: aload 5
    //   125: ifnonnull +1234 -> 1359
    //   128: aload_1
    //   129: ldc_w 957
    //   132: invokevirtual 950	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   135: invokestatic 963	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   138: ldc_w 965
    //   141: invokevirtual 968	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   144: astore 5
    //   146: aload_0
    //   147: new 136	com/tencent/mm/pluginsdk/model/app/f
    //   150: dup
    //   151: invokespecial 969	com/tencent/mm/pluginsdk/model/app/f:<init>	()V
    //   154: putfield 31	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:uEI	Lcom/tencent/mm/pluginsdk/model/app/f;
    //   157: aload_0
    //   158: getfield 31	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:uEI	Lcom/tencent/mm/pluginsdk/model/app/f;
    //   161: aload 5
    //   163: putfield 139	com/tencent/mm/pluginsdk/model/app/f:field_appId	Ljava/lang/String;
    //   166: invokestatic 975	com/tencent/mm/pluginsdk/model/app/ao:bmf	()Lcom/tencent/mm/pluginsdk/model/app/i;
    //   169: aload_0
    //   170: getfield 31	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:uEI	Lcom/tencent/mm/pluginsdk/model/app/f;
    //   173: iconst_0
    //   174: anewarray 179	java/lang/String
    //   177: invokevirtual 980	com/tencent/mm/pluginsdk/model/app/i:b	(Lcom/tencent/mm/sdk/e/c;[Ljava/lang/String;)Z
    //   180: pop
    //   181: aload_0
    //   182: getfield 31	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:uEI	Lcom/tencent/mm/pluginsdk/model/app/f;
    //   185: getfield 307	com/tencent/mm/pluginsdk/model/app/f:field_appName	Ljava/lang/String;
    //   188: ifnonnull +94 -> 282
    //   191: aload_0
    //   192: getstatic 983	com/tencent/mm/R$l:confirm_dialog_unknown_source	I
    //   195: invokevirtual 365	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:getString	(I)Ljava/lang/String;
    //   198: astore_1
    //   199: aload_0
    //   200: aload_0
    //   201: getstatic 986	com/tencent/mm/R$l:confirm_dialog_source	I
    //   204: iconst_1
    //   205: anewarray 214	java/lang/Object
    //   208: dup
    //   209: iconst_0
    //   210: aload_1
    //   211: aastore
    //   212: invokevirtual 404	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   215: putfield 29	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:bhd	Ljava/lang/String;
    //   218: aload_0
    //   219: aload 4
    //   221: getfield 989	com/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req:message	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   224: putfield 35	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:tLD	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   227: ldc 73
    //   229: ldc_w 991
    //   232: iconst_2
    //   233: anewarray 214	java/lang/Object
    //   236: dup
    //   237: iconst_0
    //   238: aload_0
    //   239: getfield 35	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:tLD	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   242: getfield 148	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:messageAction	Ljava/lang/String;
    //   245: aastore
    //   246: dup
    //   247: iconst_1
    //   248: aload_0
    //   249: getfield 35	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:tLD	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   252: getfield 145	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:messageExt	Ljava/lang/String;
    //   255: aastore
    //   256: invokestatic 993	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   259: aload_0
    //   260: getfield 37	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:scene	I
    //   263: iconst_1
    //   264: if_icmpne +1071 -> 1335
    //   267: aload_0
    //   268: getfield 35	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:tLD	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   271: getfield 69	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:mediaObject	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;
    //   274: ifnonnull +27 -> 301
    //   277: aload_0
    //   278: invokevirtual 451	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:finish	()V
    //   281: return
    //   282: aload_0
    //   283: getfield 782	com/tencent/mm/ui/MMActivity:mController	Lcom/tencent/mm/ui/s;
    //   286: getfield 692	com/tencent/mm/ui/s:tml	Landroid/support/v7/app/ActionBarActivity;
    //   289: aload_0
    //   290: getfield 31	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:uEI	Lcom/tencent/mm/pluginsdk/model/app/f;
    //   293: aconst_null
    //   294: invokestatic 996	com/tencent/mm/pluginsdk/model/app/g:b	(Landroid/content/Context;Lcom/tencent/mm/pluginsdk/model/app/f;Ljava/lang/String;)Ljava/lang/String;
    //   297: astore_1
    //   298: goto -99 -> 199
    //   301: aload_0
    //   302: getfield 35	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:tLD	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   305: invokevirtual 236	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:getType	()I
    //   308: bipush 38
    //   310: if_icmpne +408 -> 718
    //   313: aload_0
    //   314: getfield 35	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:tLD	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   317: getfield 69	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:mediaObject	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;
    //   320: checkcast 602	com/tencent/mm/opensdk/modelmsg/WXVideoFileObject
    //   323: astore 8
    //   325: aload 8
    //   327: getfield 605	com/tencent/mm/opensdk/modelmsg/WXVideoFileObject:filePath	Ljava/lang/String;
    //   330: astore 7
    //   332: aload 8
    //   334: getfield 605	com/tencent/mm/opensdk/modelmsg/WXVideoFileObject:filePath	Ljava/lang/String;
    //   337: invokestatic 87	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   340: ifne +319 -> 659
    //   343: aload 8
    //   345: getfield 605	com/tencent/mm/opensdk/modelmsg/WXVideoFileObject:filePath	Ljava/lang/String;
    //   348: invokestatic 892	com/tencent/mm/a/e:cn	(Ljava/lang/String;)Z
    //   351: ifeq +308 -> 659
    //   354: new 998	android/media/MediaMetadataRetriever
    //   357: dup
    //   358: invokespecial 999	android/media/MediaMetadataRetriever:<init>	()V
    //   361: astore 4
    //   363: aload 4
    //   365: astore_1
    //   366: aload 4
    //   368: aload 7
    //   370: invokevirtual 1002	android/media/MediaMetadataRetriever:setDataSource	(Ljava/lang/String;)V
    //   373: aload 4
    //   375: astore_1
    //   376: aload 4
    //   378: bipush 9
    //   380: invokevirtual 1005	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   383: iconst_m1
    //   384: invokestatic 296	com/tencent/mm/sdk/platformtools/bi:getInt	(Ljava/lang/String;I)I
    //   387: istore_3
    //   388: bipush 10
    //   390: istore_2
    //   391: aload 4
    //   393: astore_1
    //   394: ldc_w 1007
    //   397: aload 5
    //   399: invokevirtual 356	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   402: ifeq +18 -> 420
    //   405: aload 4
    //   407: astore_1
    //   408: invokestatic 283	com/tencent/mm/k/g:AT	()Lcom/tencent/mm/k/e;
    //   411: ldc_w 1009
    //   414: bipush 10
    //   416: invokevirtual 1010	com/tencent/mm/k/e:getInt	(Ljava/lang/String;I)I
    //   419: istore_2
    //   420: aload 4
    //   422: astore_1
    //   423: ldc 73
    //   425: ldc_w 1012
    //   428: iconst_2
    //   429: anewarray 214	java/lang/Object
    //   432: dup
    //   433: iconst_0
    //   434: iload_3
    //   435: invokestatic 220	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   438: aastore
    //   439: dup
    //   440: iconst_1
    //   441: iload_2
    //   442: invokestatic 220	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   445: aastore
    //   446: invokestatic 993	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   449: iload_3
    //   450: i2d
    //   451: iload_2
    //   452: i2d
    //   453: ldc2_w 1013
    //   456: dadd
    //   457: ldc2_w 1015
    //   460: dmul
    //   461: dcmpl
    //   462: iflt +19 -> 481
    //   465: aload 4
    //   467: astore_1
    //   468: aload_0
    //   469: bipush -5
    //   471: invokevirtual 500	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:setResult	(I)V
    //   474: aload 4
    //   476: astore_1
    //   477: aload_0
    //   478: invokevirtual 451	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:finish	()V
    //   481: aload 4
    //   483: invokevirtual 1019	android/media/MediaMetadataRetriever:release	()V
    //   486: ldc_w 1007
    //   489: aload 5
    //   491: invokevirtual 356	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   494: ifeq +183 -> 677
    //   497: aload 8
    //   499: getfield 605	com/tencent/mm/opensdk/modelmsg/WXVideoFileObject:filePath	Ljava/lang/String;
    //   502: invokestatic 87	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   505: ifne +161 -> 666
    //   508: aload 8
    //   510: getfield 605	com/tencent/mm/opensdk/modelmsg/WXVideoFileObject:filePath	Ljava/lang/String;
    //   513: invokestatic 892	com/tencent/mm/a/e:cn	(Ljava/lang/String;)Z
    //   516: ifeq +150 -> 666
    //   519: aload_0
    //   520: invokespecial 894	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:cAj	()V
    //   523: return
    //   524: astore_1
    //   525: ldc 73
    //   527: aload_1
    //   528: ldc_w 1021
    //   531: iconst_1
    //   532: anewarray 214	java/lang/Object
    //   535: dup
    //   536: iconst_0
    //   537: aload_1
    //   538: invokevirtual 1024	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   541: aastore
    //   542: invokestatic 1028	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   545: goto -59 -> 486
    //   548: astore 6
    //   550: aconst_null
    //   551: astore 4
    //   553: aload 4
    //   555: astore_1
    //   556: ldc 73
    //   558: aload 6
    //   560: ldc_w 1030
    //   563: iconst_2
    //   564: anewarray 214	java/lang/Object
    //   567: dup
    //   568: iconst_0
    //   569: aload 7
    //   571: aastore
    //   572: dup
    //   573: iconst_1
    //   574: aload 6
    //   576: invokevirtual 1024	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   579: aastore
    //   580: invokestatic 1028	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   583: aload 4
    //   585: ifnull -99 -> 486
    //   588: aload 4
    //   590: invokevirtual 1019	android/media/MediaMetadataRetriever:release	()V
    //   593: goto -107 -> 486
    //   596: astore_1
    //   597: ldc 73
    //   599: aload_1
    //   600: ldc_w 1021
    //   603: iconst_1
    //   604: anewarray 214	java/lang/Object
    //   607: dup
    //   608: iconst_0
    //   609: aload_1
    //   610: invokevirtual 1024	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   613: aastore
    //   614: invokestatic 1028	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   617: goto -131 -> 486
    //   620: astore 4
    //   622: aconst_null
    //   623: astore_1
    //   624: aload_1
    //   625: ifnull +7 -> 632
    //   628: aload_1
    //   629: invokevirtual 1019	android/media/MediaMetadataRetriever:release	()V
    //   632: aload 4
    //   634: athrow
    //   635: astore_1
    //   636: ldc 73
    //   638: aload_1
    //   639: ldc_w 1021
    //   642: iconst_1
    //   643: anewarray 214	java/lang/Object
    //   646: dup
    //   647: iconst_0
    //   648: aload_1
    //   649: invokevirtual 1024	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   652: aastore
    //   653: invokestatic 1028	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   656: goto -24 -> 632
    //   659: aload_0
    //   660: invokevirtual 451	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:finish	()V
    //   663: goto -177 -> 486
    //   666: aload_0
    //   667: bipush -5
    //   669: invokevirtual 500	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:setResult	(I)V
    //   672: aload_0
    //   673: invokevirtual 451	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:finish	()V
    //   676: return
    //   677: new 436	android/content/Intent
    //   680: dup
    //   681: invokespecial 863	android/content/Intent:<init>	()V
    //   684: astore_1
    //   685: aload_1
    //   686: ldc_w 886
    //   689: aload 7
    //   691: invokevirtual 853	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   694: pop
    //   695: aload_1
    //   696: ldc_w 1032
    //   699: ldc -68
    //   701: invokevirtual 853	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   704: pop
    //   705: aload_0
    //   706: ldc_w 1034
    //   709: ldc_w 1036
    //   712: aload_1
    //   713: iconst_2
    //   714: invokestatic 862	com/tencent/mm/bg/d:b	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;I)V
    //   717: return
    //   718: aload_0
    //   719: getfield 35	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:tLD	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   722: invokevirtual 236	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:getType	()I
    //   725: bipush 39
    //   727: if_icmpne +603 -> 1330
    //   730: aload_0
    //   731: getfield 35	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:tLD	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   734: getfield 69	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:mediaObject	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;
    //   737: checkcast 1038	com/tencent/mm/opensdk/modelmsg/WXGameVideoFileObject
    //   740: astore_1
    //   741: aload_1
    //   742: getfield 1039	com/tencent/mm/opensdk/modelmsg/WXGameVideoFileObject:filePath	Ljava/lang/String;
    //   745: invokestatic 87	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   748: ifne +62 -> 810
    //   751: aload_1
    //   752: getfield 1039	com/tencent/mm/opensdk/modelmsg/WXGameVideoFileObject:filePath	Ljava/lang/String;
    //   755: invokestatic 892	com/tencent/mm/a/e:cn	(Ljava/lang/String;)Z
    //   758: ifeq +52 -> 810
    //   761: aload_1
    //   762: getfield 1039	com/tencent/mm/opensdk/modelmsg/WXGameVideoFileObject:filePath	Ljava/lang/String;
    //   765: astore_1
    //   766: invokestatic 283	com/tencent/mm/k/g:AT	()Lcom/tencent/mm/k/e;
    //   769: ldc_w 1041
    //   772: ldc_w 1042
    //   775: invokevirtual 1010	com/tencent/mm/k/e:getInt	(Ljava/lang/String;I)I
    //   778: istore_2
    //   779: aload_1
    //   780: invokestatic 1048	com/tencent/mm/modelsfs/FileOp:mI	(Ljava/lang/String;)J
    //   783: iload_2
    //   784: i2l
    //   785: lcmp
    //   786: ifle +45 -> 831
    //   789: ldc_w 1050
    //   792: ldc_w 1052
    //   795: invokestatic 92	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   798: iconst_1
    //   799: istore_2
    //   800: iload_2
    //   801: ifeq +35 -> 836
    //   804: iconst_1
    //   805: istore_2
    //   806: iload_2
    //   807: ifeq +523 -> 1330
    //   810: aload_0
    //   811: aload_0
    //   812: invokevirtual 434	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:getIntent	()Landroid/content/Intent;
    //   815: invokevirtual 440	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   818: bipush -5
    //   820: invokestatic 445	com/tencent/mm/pluginsdk/model/app/ReportUtil:c	(Landroid/os/Bundle;I)Lcom/tencent/mm/pluginsdk/model/app/ReportUtil$ReportArgs;
    //   823: invokestatic 448	com/tencent/mm/pluginsdk/model/app/ReportUtil:a	(Landroid/content/Context;Lcom/tencent/mm/pluginsdk/model/app/ReportUtil$ReportArgs;)V
    //   826: aload_0
    //   827: invokevirtual 451	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:finish	()V
    //   830: return
    //   831: iconst_0
    //   832: istore_2
    //   833: goto -33 -> 800
    //   836: aload_1
    //   837: invokestatic 1058	com/tencent/mm/modelsns/a$a:na	(Ljava/lang/String;)Lcom/tencent/mm/modelsns/a$a;
    //   840: astore_1
    //   841: aload_1
    //   842: getfield 1061	com/tencent/mm/modelsns/a$a:videoWidth	I
    //   845: ifle +46 -> 891
    //   848: aload_1
    //   849: getfield 1064	com/tencent/mm/modelsns/a$a:videoHeight	I
    //   852: ifle +39 -> 891
    //   855: aload_1
    //   856: getfield 1061	com/tencent/mm/modelsns/a$a:videoWidth	I
    //   859: i2f
    //   860: aload_1
    //   861: getfield 1064	com/tencent/mm/modelsns/a$a:videoHeight	I
    //   864: i2f
    //   865: fdiv
    //   866: ldc_w 1065
    //   869: fcmpl
    //   870: ifgt +21 -> 891
    //   873: aload_1
    //   874: getfield 1061	com/tencent/mm/modelsns/a$a:videoWidth	I
    //   877: i2f
    //   878: aload_1
    //   879: getfield 1064	com/tencent/mm/modelsns/a$a:videoHeight	I
    //   882: i2f
    //   883: fdiv
    //   884: ldc_w 1066
    //   887: fcmpg
    //   888: ifge +195 -> 1083
    //   891: ldc_w 1050
    //   894: ldc_w 1068
    //   897: iconst_2
    //   898: anewarray 214	java/lang/Object
    //   901: dup
    //   902: iconst_0
    //   903: aload_1
    //   904: getfield 1061	com/tencent/mm/modelsns/a$a:videoWidth	I
    //   907: invokestatic 220	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   910: aastore
    //   911: dup
    //   912: iconst_1
    //   913: aload_1
    //   914: getfield 1064	com/tencent/mm/modelsns/a$a:videoHeight	I
    //   917: invokestatic 220	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   920: aastore
    //   921: invokestatic 993	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   924: iconst_1
    //   925: istore_2
    //   926: iload_2
    //   927: ifne +151 -> 1078
    //   930: ldc_w 1050
    //   933: ldc_w 1070
    //   936: iconst_1
    //   937: anewarray 214	java/lang/Object
    //   940: dup
    //   941: iconst_0
    //   942: aload_1
    //   943: getfield 1073	com/tencent/mm/modelsns/a$a:egD	I
    //   946: invokestatic 220	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   949: aastore
    //   950: invokestatic 993	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   953: aload_1
    //   954: getfield 1073	com/tencent/mm/modelsns/a$a:egD	I
    //   957: sipush 1000
    //   960: if_icmpgt +128 -> 1088
    //   963: iconst_1
    //   964: istore_2
    //   965: iload_2
    //   966: ifne +112 -> 1078
    //   969: ldc_w 1050
    //   972: ldc_w 1075
    //   975: iconst_1
    //   976: anewarray 214	java/lang/Object
    //   979: dup
    //   980: iconst_0
    //   981: aload_1
    //   982: aastore
    //   983: invokestatic 223	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   986: aload_1
    //   987: getfield 1078	com/tencent/mm/modelsns/a$a:egA	Ljava/lang/String;
    //   990: invokestatic 87	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   993: ifne +59 -> 1052
    //   996: aload_1
    //   997: getfield 1078	com/tencent/mm/modelsns/a$a:egA	Ljava/lang/String;
    //   1000: astore 4
    //   1002: aload 4
    //   1004: invokestatic 87	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   1007: ifeq +101 -> 1108
    //   1010: iconst_1
    //   1011: istore_2
    //   1012: iload_2
    //   1013: ifne +39 -> 1052
    //   1016: ldc_w 1080
    //   1019: aload_1
    //   1020: getfield 1083	com/tencent/mm/modelsns/a$a:egB	Ljava/lang/String;
    //   1023: invokevirtual 1086	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   1026: ifeq +26 -> 1052
    //   1029: aload_1
    //   1030: getfield 1089	com/tencent/mm/modelsns/a$a:egC	Ljava/lang/String;
    //   1033: invokestatic 87	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   1036: ifne +284 -> 1320
    //   1039: ldc_w 1091
    //   1042: aload_1
    //   1043: getfield 1089	com/tencent/mm/modelsns/a$a:egC	Ljava/lang/String;
    //   1046: invokevirtual 1086	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   1049: ifne +271 -> 1320
    //   1052: ldc_w 1050
    //   1055: ldc_w 1093
    //   1058: iconst_1
    //   1059: anewarray 214	java/lang/Object
    //   1062: dup
    //   1063: iconst_0
    //   1064: aload_1
    //   1065: getfield 1083	com/tencent/mm/modelsns/a$a:egB	Ljava/lang/String;
    //   1068: aastore
    //   1069: invokestatic 993	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1072: iconst_1
    //   1073: istore_2
    //   1074: iload_2
    //   1075: ifeq +250 -> 1325
    //   1078: iconst_1
    //   1079: istore_2
    //   1080: goto -274 -> 806
    //   1083: iconst_0
    //   1084: istore_2
    //   1085: goto -159 -> 926
    //   1088: aload_1
    //   1089: getfield 1073	com/tencent/mm/modelsns/a$a:egD	I
    //   1092: sipush 10500
    //   1095: if_icmplt +8 -> 1103
    //   1098: iconst_1
    //   1099: istore_2
    //   1100: goto -135 -> 965
    //   1103: iconst_0
    //   1104: istore_2
    //   1105: goto -140 -> 965
    //   1108: getstatic 1097	com/tencent/mm/modelsns/a:egz	Ljava/util/Set;
    //   1111: ifnonnull +148 -> 1259
    //   1114: new 1099	java/util/HashSet
    //   1117: dup
    //   1118: invokespecial 1100	java/util/HashSet:<init>	()V
    //   1121: astore 5
    //   1123: aload 5
    //   1125: putstatic 1097	com/tencent/mm/modelsns/a:egz	Ljava/util/Set;
    //   1128: aload 5
    //   1130: ldc_w 1102
    //   1133: invokeinterface 1105 2 0
    //   1138: pop
    //   1139: getstatic 1097	com/tencent/mm/modelsns/a:egz	Ljava/util/Set;
    //   1142: ldc_w 1107
    //   1145: invokeinterface 1105 2 0
    //   1150: pop
    //   1151: getstatic 1097	com/tencent/mm/modelsns/a:egz	Ljava/util/Set;
    //   1154: ldc_w 1109
    //   1157: invokeinterface 1105 2 0
    //   1162: pop
    //   1163: getstatic 1097	com/tencent/mm/modelsns/a:egz	Ljava/util/Set;
    //   1166: ldc_w 1111
    //   1169: invokeinterface 1105 2 0
    //   1174: pop
    //   1175: getstatic 1097	com/tencent/mm/modelsns/a:egz	Ljava/util/Set;
    //   1178: ldc_w 1113
    //   1181: invokeinterface 1105 2 0
    //   1186: pop
    //   1187: getstatic 1097	com/tencent/mm/modelsns/a:egz	Ljava/util/Set;
    //   1190: ldc_w 1115
    //   1193: invokeinterface 1105 2 0
    //   1198: pop
    //   1199: getstatic 1097	com/tencent/mm/modelsns/a:egz	Ljava/util/Set;
    //   1202: ldc_w 1117
    //   1205: invokeinterface 1105 2 0
    //   1210: pop
    //   1211: getstatic 1097	com/tencent/mm/modelsns/a:egz	Ljava/util/Set;
    //   1214: ldc_w 1119
    //   1217: invokeinterface 1105 2 0
    //   1222: pop
    //   1223: getstatic 1097	com/tencent/mm/modelsns/a:egz	Ljava/util/Set;
    //   1226: ldc_w 1121
    //   1229: invokeinterface 1105 2 0
    //   1234: pop
    //   1235: getstatic 1097	com/tencent/mm/modelsns/a:egz	Ljava/util/Set;
    //   1238: ldc_w 1123
    //   1241: invokeinterface 1105 2 0
    //   1246: pop
    //   1247: getstatic 1097	com/tencent/mm/modelsns/a:egz	Ljava/util/Set;
    //   1250: ldc_w 1125
    //   1253: invokeinterface 1105 2 0
    //   1258: pop
    //   1259: aload 4
    //   1261: invokevirtual 1128	java/lang/String:trim	()Ljava/lang/String;
    //   1264: astore 4
    //   1266: aload 4
    //   1268: ldc_w 1130
    //   1271: invokevirtual 1133	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   1274: istore_2
    //   1275: iload_2
    //   1276: iflt +12 -> 1288
    //   1279: iload_2
    //   1280: aload 4
    //   1282: invokevirtual 389	java/lang/String:length	()I
    //   1285: if_icmplt +8 -> 1293
    //   1288: iconst_1
    //   1289: istore_2
    //   1290: goto -278 -> 1012
    //   1293: getstatic 1097	com/tencent/mm/modelsns/a:egz	Ljava/util/Set;
    //   1296: aload 4
    //   1298: iload_2
    //   1299: invokevirtual 1136	java/lang/String:substring	(I)Ljava/lang/String;
    //   1302: invokeinterface 1139 2 0
    //   1307: ifne +8 -> 1315
    //   1310: iconst_1
    //   1311: istore_2
    //   1312: goto -300 -> 1012
    //   1315: iconst_0
    //   1316: istore_2
    //   1317: goto -305 -> 1012
    //   1320: iconst_0
    //   1321: istore_2
    //   1322: goto -248 -> 1074
    //   1325: iconst_0
    //   1326: istore_2
    //   1327: goto -521 -> 806
    //   1330: aload_0
    //   1331: invokespecial 894	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:cAj	()V
    //   1334: return
    //   1335: aload_0
    //   1336: getfield 53	com/tencent/mm/ui/transmit/SendAppMessageWrapperUI:bAZ	Lcom/tencent/mm/sdk/platformtools/al;
    //   1339: ldc2_w 1140
    //   1342: ldc2_w 1140
    //   1345: invokevirtual 1145	com/tencent/mm/sdk/platformtools/al:J	(JJ)V
    //   1348: return
    //   1349: astore 4
    //   1351: goto -727 -> 624
    //   1354: astore 6
    //   1356: goto -803 -> 553
    //   1359: goto -1213 -> 146
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1362	0	this	SendAppMessageWrapperUI
    //   0	1362	1	paramBundle	android.os.Bundle
    //   390	937	2	i	int
    //   387	63	3	j	int
    //   89	500	4	localObject1	Object
    //   620	13	4	localObject2	Object
    //   1000	297	4	str1	String
    //   1349	1	4	localObject3	Object
    //   121	1008	5	localObject4	Object
    //   548	27	6	localException1	Exception
    //   1354	1	6	localException2	Exception
    //   330	360	7	str2	String
    //   323	186	8	localWXVideoFileObject	WXVideoFileObject
    // Exception table:
    //   from	to	target	type
    //   481	486	524	java/lang/Exception
    //   354	363	548	java/lang/Exception
    //   588	593	596	java/lang/Exception
    //   354	363	620	finally
    //   628	632	635	java/lang/Exception
    //   366	373	1349	finally
    //   376	388	1349	finally
    //   394	405	1349	finally
    //   408	420	1349	finally
    //   423	449	1349	finally
    //   468	474	1349	finally
    //   477	481	1349	finally
    //   556	583	1349	finally
    //   366	373	1354	java/lang/Exception
    //   376	388	1354	java/lang/Exception
    //   394	405	1354	java/lang/Exception
    //   408	420	1354	java/lang/Exception
    //   423	449	1354	java/lang/Exception
    //   468	474	1354	java/lang/Exception
    //   477	481	1354	java/lang/Exception
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.uEJ)
    {
      x.d("MicroMsg.SendAppMessageWrapperUI", "restore orientation");
      SharedPreferences localSharedPreferences = getSharedPreferences(ad.chY(), 0);
      setRequestedOrientation(1);
      localSharedPreferences.edit().putBoolean("settings_landscape_mode", false).commit();
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    YC();
    return super.onTouchEvent(paramMotionEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/transmit/SendAppMessageWrapperUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */