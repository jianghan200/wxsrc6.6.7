package com.tencent.mm.plugin.wallet_index.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.modelpay.PayReq.Options;
import com.tencent.mm.opensdk.modelpay.PayResp;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.protocal.c.azb;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c.q;
import com.tencent.mm.wallet_core.c.u;

@com.tencent.mm.ui.base.a(3)
public class OrderHandlerUI
  extends MMActivity
  implements com.tencent.mm.ab.e
{
  private String bOd;
  private String eeY;
  private int fdx = 0;
  private long hej = 0L;
  private c lSI = new OrderHandlerUI.1(this);
  private PayReq.Options options;
  private PayReq pDs;
  private PayResp pDt;
  private boolean pDu = false;
  private String pDv = "";
  private boolean pDw = false;
  
  private static void aS(Context paramContext, String paramString)
  {
    if (paramContext == null) {
      x.e("MicroMsg.OrderHandlerUI", "startOuterApp context == null");
    }
    do
    {
      return;
      if (TextUtils.isEmpty(paramString))
      {
        x.e("MicroMsg.OrderHandlerUI", "startOuterApp callbackUrl is empty");
        return;
      }
      x.i("MicroMsg.OrderHandlerUI", "startOuterApp callbackUrl is " + paramString);
      paramString = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
      paramString.addFlags(268435456);
    } while (!bi.k(paramContext, paramString));
    paramContext.startActivity(paramString);
  }
  
  private void bc(String paramString, boolean paramBoolean)
  {
    if (this.fdx == 1)
    {
      if ((TextUtils.isEmpty(this.pDv)) && (paramBoolean))
      {
        ux(0);
        String str = paramString;
        if (TextUtils.isEmpty(paramString)) {
          str = getString(a.i.wallet_unknown_err);
        }
        com.tencent.mm.ui.base.h.a(this, str, null, false, new OrderHandlerUI.2(this));
        return;
      }
      aS(this, this.pDv);
      finish();
      return;
    }
    e.a(this, this.eeY, this.pDt, this.options);
    finish();
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if (paraml.getType() != 397) {
      return;
    }
    PayInfo localPayInfo = new PayInfo();
    if (this.fdx == 1)
    {
      localPayInfo.bVY = 36;
      g.Ek();
      g.Eh().dpP.b(397, this);
      x.i("MicroMsg.OrderHandlerUI", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
      localObject2 = (com.tencent.mm.plugin.wallet_index.c.e)paraml;
      paraml = (azb)((com.tencent.mm.plugin.wallet_index.c.e)localObject2).diG.dIE.dIL;
      if (paraml != null) {
        break label184;
      }
      paraml = null;
      label114:
      this.pDv = paraml;
      if ((paramInt1 != 4) || (paramInt2 != -5)) {
        break label205;
      }
      x.e("MicroMsg.OrderHandlerUI", "onSceneEnd, auth access denied");
      this.pDt.errCode = -1;
      bc(paramString, true);
      paramInt1 = localPayInfo.bVY;
      if (this.pDs != null) {
        break label194;
      }
    }
    label184:
    label194:
    for (paramString = "";; paramString = this.pDs.prepayId)
    {
      u.j(paramInt1, paramString, paramInt2);
      return;
      localPayInfo.bVY = 2;
      break;
      paraml = paraml.sbS;
      break label114;
    }
    label205:
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      x.e("MicroMsg.OrderHandlerUI", "onSceneEnd,  PayAuthApp is failed!");
      this.pDt.errCode = -1;
      bc(paramString, true);
      paramInt1 = localPayInfo.bVY;
      if (this.pDs == null) {}
      for (paramString = "";; paramString = this.pDs.prepayId)
      {
        u.j(paramInt1, paramString, paramInt2);
        return;
      }
    }
    paraml = (azb)((com.tencent.mm.plugin.wallet_index.c.e)localObject2).diG.dIE.dIL;
    label316:
    Object localObject1;
    if (paraml == null)
    {
      paramInt1 = -1;
      paraml = (azb)((com.tencent.mm.plugin.wallet_index.c.e)localObject2).diG.dIE.dIL;
      if (paraml != null) {
        break label438;
      }
      paraml = null;
      localObject1 = (azb)((com.tencent.mm.plugin.wallet_index.c.e)localObject2).diG.dIE.dIL;
      if (localObject1 != null) {
        break label448;
      }
      localObject1 = null;
      label340:
      localObject2 = (azb)((com.tencent.mm.plugin.wallet_index.c.e)localObject2).diG.dIE.dIL;
      if (localObject2 != null) {
        break label458;
      }
    }
    label438:
    label448:
    label458:
    for (Object localObject2 = null;; localObject2 = ((azb)localObject2).rEg)
    {
      x.i("MicroMsg.OrderHandlerUI", "onSceneEnd, respErrCode = %d, respErrMsg = %s, respPrepayId = %s, respAppSource = %s", new Object[] { Integer.valueOf(paramInt1), paraml, localObject1, localObject2 });
      if (!bi.oW((String)localObject1)) {
        break label468;
      }
      x.e("MicroMsg.OrderHandlerUI", "onSceneEnd, respPrepayId is null");
      this.pDt.errCode = -1;
      bc(paramString, true);
      return;
      paramInt1 = paraml.iwS;
      break;
      paraml = paraml.iwT;
      break label316;
      localObject1 = ((azb)localObject1).rEf;
      break label340;
    }
    label468:
    u.j(localPayInfo.bVY, (String)localObject1, paramInt2);
    localPayInfo.appId = this.pDs.appId;
    localPayInfo.bOd = ((String)localObject1);
    localPayInfo.partnerId = this.pDs.partnerId;
    localPayInfo.pCO = ((String)localObject2);
    localPayInfo.qUK = String.valueOf(paramInt1);
    localPayInfo.Yy = paraml;
    if (this.hej > 0L)
    {
      com.tencent.mm.plugin.report.service.h.mEJ.a(641L, 1L, 1L, true);
      com.tencent.mm.plugin.report.service.h.mEJ.a(641L, 2L, bi.bH(this.hej), true);
      if (localPayInfo.qUL == null) {
        localPayInfo.qUL = new Bundle();
      }
      localPayInfo.qUL.putLong("wallet_pay_key_check_time", this.hej);
    }
    this.bOd = localPayInfo.bOd;
    com.tencent.mm.pluginsdk.wallet.h.a(this, localPayInfo, 123);
    this.pDu = false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.order_handle_ui;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((this.pDt != null) && (!this.pDu))
    {
      x.e("MicroMsg.OrderHandlerUI", "onActivityResult, onPayEnd not called");
      this.pDt.errCode = -2;
      bc("", false);
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    x.i("MicroMsg.OrderHandlerUI", "onConfigurationChanged");
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.hej = getIntent().getLongExtra("wallet_pay_key_check_time", -1L);
    ux(8);
    q.cDf();
    com.tencent.mm.sdk.b.a.sFg.b(this.lSI);
  }
  
  protected void onDestroy()
  {
    g.Ek();
    g.Eh().dpP.b(397, this);
    com.tencent.mm.sdk.b.a.sFg.c(this.lSI);
    super.onDestroy();
  }
  
  /* Error */
  protected void onResume()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 404	com/tencent/mm/ui/MMActivity:onResume	()V
    //   4: new 258	com/tencent/mm/opensdk/modelpay/PayReq
    //   7: dup
    //   8: invokespecial 405	com/tencent/mm/opensdk/modelpay/PayReq:<init>	()V
    //   11: astore 6
    //   13: aload 6
    //   15: aload_0
    //   16: invokevirtual 374	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:getIntent	()Landroid/content/Intent;
    //   19: invokevirtual 409	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   22: invokevirtual 412	com/tencent/mm/opensdk/modelpay/PayReq:fromBundle	(Landroid/os/Bundle;)V
    //   25: aload_0
    //   26: getfield 247	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:pDs	Lcom/tencent/mm/opensdk/modelpay/PayReq;
    //   29: ifnull +29 -> 58
    //   32: aload 6
    //   34: getfield 261	com/tencent/mm/opensdk/modelpay/PayReq:prepayId	Ljava/lang/String;
    //   37: ifnull +117 -> 154
    //   40: aload 6
    //   42: getfield 261	com/tencent/mm/opensdk/modelpay/PayReq:prepayId	Ljava/lang/String;
    //   45: aload_0
    //   46: getfield 247	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:pDs	Lcom/tencent/mm/opensdk/modelpay/PayReq;
    //   49: getfield 261	com/tencent/mm/opensdk/modelpay/PayReq:prepayId	Ljava/lang/String;
    //   52: invokevirtual 416	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   55: ifne +99 -> 154
    //   58: aload_0
    //   59: aload 6
    //   61: putfield 247	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:pDs	Lcom/tencent/mm/opensdk/modelpay/PayReq;
    //   64: aload_0
    //   65: aload_0
    //   66: invokevirtual 374	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:getIntent	()Landroid/content/Intent;
    //   69: ldc_w 418
    //   72: iconst_0
    //   73: invokevirtual 422	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   76: putfield 36	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:fdx	I
    //   79: ldc 59
    //   81: new 77	java/lang/StringBuilder
    //   84: dup
    //   85: ldc_w 424
    //   88: invokespecial 82	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   91: aload_0
    //   92: getfield 36	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:fdx	I
    //   95: invokevirtual 214	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   98: invokevirtual 90	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   101: invokestatic 93	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   104: aload_0
    //   105: getfield 36	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:fdx	I
    //   108: ifne +47 -> 155
    //   111: aload_0
    //   112: aload_0
    //   113: invokevirtual 374	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:getIntent	()Landroid/content/Intent;
    //   116: ldc_w 426
    //   119: invokevirtual 430	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   122: putfield 155	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:eeY	Ljava/lang/String;
    //   125: aload_0
    //   126: getfield 155	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:eeY	Ljava/lang/String;
    //   129: ifnull +13 -> 142
    //   132: aload_0
    //   133: getfield 155	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:eeY	Ljava/lang/String;
    //   136: invokevirtual 433	java/lang/String:length	()I
    //   139: ifne +16 -> 155
    //   142: ldc 59
    //   144: ldc_w 435
    //   147: invokestatic 67	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   150: aload_0
    //   151: invokevirtual 153	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:finish	()V
    //   154: return
    //   155: aload_0
    //   156: new 437	com/tencent/mm/opensdk/modelpay/PayReq$Options
    //   159: dup
    //   160: invokespecial 438	com/tencent/mm/opensdk/modelpay/PayReq$Options:<init>	()V
    //   163: putfield 159	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:options	Lcom/tencent/mm/opensdk/modelpay/PayReq$Options;
    //   166: aload_0
    //   167: getfield 159	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:options	Lcom/tencent/mm/opensdk/modelpay/PayReq$Options;
    //   170: aload_0
    //   171: invokevirtual 374	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:getIntent	()Landroid/content/Intent;
    //   174: invokevirtual 409	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   177: invokevirtual 439	com/tencent/mm/opensdk/modelpay/PayReq$Options:fromBundle	(Landroid/os/Bundle;)V
    //   180: aload_0
    //   181: new 240	com/tencent/mm/opensdk/modelpay/PayResp
    //   184: dup
    //   185: invokespecial 440	com/tencent/mm/opensdk/modelpay/PayResp:<init>	()V
    //   188: putfield 157	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:pDt	Lcom/tencent/mm/opensdk/modelpay/PayResp;
    //   191: aload_0
    //   192: getfield 157	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:pDt	Lcom/tencent/mm/opensdk/modelpay/PayResp;
    //   195: aload 6
    //   197: getfield 261	com/tencent/mm/opensdk/modelpay/PayReq:prepayId	Ljava/lang/String;
    //   200: putfield 441	com/tencent/mm/opensdk/modelpay/PayResp:prepayId	Ljava/lang/String;
    //   203: aload_0
    //   204: getfield 157	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:pDt	Lcom/tencent/mm/opensdk/modelpay/PayResp;
    //   207: aload 6
    //   209: getfield 444	com/tencent/mm/opensdk/modelpay/PayReq:extData	Ljava/lang/String;
    //   212: putfield 445	com/tencent/mm/opensdk/modelpay/PayResp:extData	Ljava/lang/String;
    //   215: ldc 38
    //   217: astore_2
    //   218: aload_0
    //   219: getfield 36	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:fdx	I
    //   222: ifne +115 -> 337
    //   225: aload 6
    //   227: invokevirtual 449	com/tencent/mm/opensdk/modelpay/PayReq:checkArgs	()Z
    //   230: ifne +55 -> 285
    //   233: ldc 59
    //   235: ldc_w 451
    //   238: invokestatic 67	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   241: aload_0
    //   242: getfield 157	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:pDt	Lcom/tencent/mm/opensdk/modelpay/PayResp;
    //   245: iconst_m1
    //   246: putfield 243	com/tencent/mm/opensdk/modelpay/PayResp:errCode	I
    //   249: aload_0
    //   250: getfield 157	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:pDt	Lcom/tencent/mm/opensdk/modelpay/PayResp;
    //   253: aload_0
    //   254: getstatic 454	com/tencent/mm/plugin/wxpay/a$i:pay_callback_errmsg_req_checkargs_fail	I
    //   257: invokevirtual 142	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:getString	(I)Ljava/lang/String;
    //   260: putfield 457	com/tencent/mm/opensdk/modelpay/PayResp:errStr	Ljava/lang/String;
    //   263: aload_0
    //   264: aload_0
    //   265: getfield 155	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:eeY	Ljava/lang/String;
    //   268: aload_0
    //   269: getfield 157	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:pDt	Lcom/tencent/mm/opensdk/modelpay/PayResp;
    //   272: aload_0
    //   273: getfield 159	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:options	Lcom/tencent/mm/opensdk/modelpay/PayReq$Options;
    //   276: invokestatic 164	com/tencent/mm/plugin/wallet_index/ui/e:a	(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/opensdk/modelpay/PayResp;Lcom/tencent/mm/opensdk/modelpay/PayReq$Options;)Z
    //   279: pop
    //   280: aload_0
    //   281: invokevirtual 153	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:finish	()V
    //   284: return
    //   285: aload_0
    //   286: invokevirtual 374	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:getIntent	()Landroid/content/Intent;
    //   289: ldc_w 459
    //   292: iconst_0
    //   293: invokevirtual 463	android/content/Intent:getBooleanExtra	(Ljava/lang/String;Z)Z
    //   296: ifne +53 -> 349
    //   299: ldc 59
    //   301: ldc_w 465
    //   304: invokestatic 67	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   307: aload_0
    //   308: getfield 157	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:pDt	Lcom/tencent/mm/opensdk/modelpay/PayResp;
    //   311: iconst_m1
    //   312: putfield 243	com/tencent/mm/opensdk/modelpay/PayResp:errCode	I
    //   315: aload_0
    //   316: aload_0
    //   317: getfield 155	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:eeY	Ljava/lang/String;
    //   320: aload_0
    //   321: getfield 157	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:pDt	Lcom/tencent/mm/opensdk/modelpay/PayResp;
    //   324: aload_0
    //   325: getfield 159	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:options	Lcom/tencent/mm/opensdk/modelpay/PayReq$Options;
    //   328: invokestatic 164	com/tencent/mm/plugin/wallet_index/ui/e:a	(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/opensdk/modelpay/PayResp;Lcom/tencent/mm/opensdk/modelpay/PayReq$Options;)Z
    //   331: pop
    //   332: aload_0
    //   333: invokevirtual 153	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:finish	()V
    //   336: return
    //   337: aload_0
    //   338: getfield 36	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:fdx	I
    //   341: iconst_1
    //   342: if_icmpne +7 -> 349
    //   345: ldc_w 467
    //   348: astore_2
    //   349: aload_0
    //   350: invokevirtual 374	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:getIntent	()Landroid/content/Intent;
    //   353: ldc_w 426
    //   356: invokevirtual 430	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   359: astore 7
    //   361: ldc 38
    //   363: astore_1
    //   364: ldc 38
    //   366: astore 4
    //   368: aload_0
    //   369: invokevirtual 471	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:getPackageManager	()Landroid/content/pm/PackageManager;
    //   372: aload 7
    //   374: iconst_0
    //   375: invokevirtual 477	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   378: pop
    //   379: aload_0
    //   380: invokevirtual 471	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:getPackageManager	()Landroid/content/pm/PackageManager;
    //   383: aload 7
    //   385: iconst_0
    //   386: invokevirtual 477	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   389: getfield 483	android/content/pm/PackageInfo:applicationInfo	Landroid/content/pm/ApplicationInfo;
    //   392: aload_0
    //   393: invokevirtual 471	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:getPackageManager	()Landroid/content/pm/PackageManager;
    //   396: invokevirtual 489	android/content/pm/ApplicationInfo:loadLabel	(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
    //   399: checkcast 308	java/lang/String
    //   402: astore_3
    //   403: aload_0
    //   404: aload 7
    //   406: invokestatic 495	com/tencent/mm/pluginsdk/model/app/p:bh	(Landroid/content/Context;Ljava/lang/String;)[Landroid/content/pm/Signature;
    //   409: astore_1
    //   410: aload_1
    //   411: ifnull +8 -> 419
    //   414: aload_1
    //   415: arraylength
    //   416: ifne +95 -> 511
    //   419: ldc_w 497
    //   422: ldc_w 499
    //   425: invokestatic 67	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   428: aconst_null
    //   429: astore_1
    //   430: aload_1
    //   431: astore 4
    //   433: aload_3
    //   434: astore_1
    //   435: ldc 59
    //   437: ldc_w 501
    //   440: iconst_3
    //   441: anewarray 267	java/lang/Object
    //   444: dup
    //   445: iconst_0
    //   446: aload 7
    //   448: aastore
    //   449: dup
    //   450: iconst_1
    //   451: aload_1
    //   452: aastore
    //   453: dup
    //   454: iconst_2
    //   455: aload 4
    //   457: aastore
    //   458: invokestatic 276	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   461: invokestatic 194	com/tencent/mm/kernel/g:Ek	()Lcom/tencent/mm/kernel/g;
    //   464: pop
    //   465: invokestatic 198	com/tencent/mm/kernel/g:Eh	()Lcom/tencent/mm/kernel/b;
    //   468: getfield 204	com/tencent/mm/kernel/b:dpP	Lcom/tencent/mm/ab/o;
    //   471: sipush 397
    //   474: aload_0
    //   475: invokevirtual 503	com/tencent/mm/ab/o:a	(ILcom/tencent/mm/ab/e;)V
    //   478: new 218	com/tencent/mm/plugin/wallet_index/c/e
    //   481: dup
    //   482: aload 6
    //   484: aload_2
    //   485: aload 7
    //   487: aload_1
    //   488: aload 4
    //   490: invokespecial 506	com/tencent/mm/plugin/wallet_index/c/e:<init>	(Lcom/tencent/mm/opensdk/modelpay/PayReq;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   493: astore_1
    //   494: invokestatic 194	com/tencent/mm/kernel/g:Ek	()Lcom/tencent/mm/kernel/g;
    //   497: pop
    //   498: invokestatic 198	com/tencent/mm/kernel/g:Eh	()Lcom/tencent/mm/kernel/b;
    //   501: getfield 204	com/tencent/mm/kernel/b:dpP	Lcom/tencent/mm/ab/o;
    //   504: aload_1
    //   505: iconst_0
    //   506: invokevirtual 509	com/tencent/mm/ab/o:a	(Lcom/tencent/mm/ab/l;I)Z
    //   509: pop
    //   510: return
    //   511: aload_1
    //   512: iconst_0
    //   513: aaload
    //   514: invokevirtual 515	android/content/pm/Signature:toByteArray	()[B
    //   517: invokestatic 521	com/tencent/mm/a/g:u	([B)Ljava/lang/String;
    //   520: astore_1
    //   521: goto -91 -> 430
    //   524: astore_3
    //   525: ldc 59
    //   527: aload_3
    //   528: ldc 38
    //   530: iconst_0
    //   531: anewarray 267	java/lang/Object
    //   534: invokestatic 525	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   537: goto -102 -> 435
    //   540: astore 5
    //   542: aload_3
    //   543: astore_1
    //   544: aload 5
    //   546: astore_3
    //   547: goto -22 -> 525
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	550	0	this	OrderHandlerUI
    //   363	181	1	localObject1	Object
    //   217	268	2	str1	String
    //   402	32	3	str2	String
    //   524	19	3	localNameNotFoundException1	android.content.pm.PackageManager.NameNotFoundException
    //   546	1	3	localObject2	Object
    //   366	123	4	localObject3	Object
    //   540	5	5	localNameNotFoundException2	android.content.pm.PackageManager.NameNotFoundException
    //   11	472	6	localPayReq	PayReq
    //   359	127	7	str3	String
    // Exception table:
    //   from	to	target	type
    //   368	403	524	android/content/pm/PackageManager$NameNotFoundException
    //   403	410	540	android/content/pm/PackageManager$NameNotFoundException
    //   414	419	540	android/content/pm/PackageManager$NameNotFoundException
    //   419	428	540	android/content/pm/PackageManager$NameNotFoundException
    //   511	521	540	android/content/pm/PackageManager$NameNotFoundException
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */