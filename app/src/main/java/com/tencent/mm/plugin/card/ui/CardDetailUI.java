package com.tencent.mm.plugin.card.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.g.a.pf;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.a.e;
import com.tencent.mm.plugin.card.a.g;
import com.tencent.mm.plugin.card.b.c.a;
import com.tencent.mm.plugin.card.b.d.a;
import com.tencent.mm.plugin.card.b.g.a;
import com.tencent.mm.plugin.card.b.i.a;
import com.tencent.mm.plugin.card.b.j.a;
import com.tencent.mm.plugin.card.b.j.b;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.aa;
import com.tencent.mm.plugin.card.model.af;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.r;
import com.tencent.mm.plugin.card.model.t;
import com.tencent.mm.plugin.card.model.v;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.protocal.c.bqs;
import com.tencent.mm.protocal.c.la;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.protocal.c.lg;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.aw;
import com.tencent.mm.sdk.platformtools.aw.a;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.base.MMVerticalTextView;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CardDetailUI
  extends CardDetailBaseUI
  implements com.tencent.mm.ab.e, c.a, d.a, j.a, aw.a
{
  private final String TAG = "MicroMsg.CardDetailUI";
  private float cXm = -85.0F;
  private float cXn = -1000.0F;
  private a.a cXs = new CardDetailUI.1(this);
  private com.tencent.mm.modelgeo.c dMm;
  private String dxx = "";
  private p fUo = null;
  private boolean hAj = false;
  e hBC;
  private String hBD = "";
  private String hBE = "";
  private String hBF = "";
  private boolean hBG = false;
  private boolean hBH = false;
  private boolean hBI = false;
  private String hBJ = "";
  private e.a hBK;
  private boolean hBL = false;
  private boolean hBM = true;
  private boolean hBN = false;
  private boolean hBO = false;
  private String hBP = "";
  private com.tencent.mm.plugin.card.b.i hBQ = new com.tencent.mm.plugin.card.b.i();
  private int hBg = 0;
  private String hBh = "";
  private String hBi = "";
  private String hBj = "";
  private Vibrator hni;
  private int hop = 3;
  private String htC = "";
  private com.tencent.mm.plugin.card.base.b htQ;
  private ArrayList<la> htW;
  private String huQ = "";
  private boolean hvg = false;
  private int hza = -1;
  private boolean hzn = false;
  ag mHandler = new ag();
  private long mStartTime = 0L;
  
  private void a(j.b paramb)
  {
    if (this.hBC.bPd)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardDetailUI", "UI is pause, not to jumpMarkUI()");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardDetailUI", "jumpMarkUI()");
    this.hBC.a(this.hBI, paramb, true);
  }
  
  private void avJ()
  {
    if (this.dMm == null) {
      this.dMm = com.tencent.mm.modelgeo.c.OB();
    }
    this.dMm.a(this.cXs, true);
  }
  
  private void avL()
  {
    if (this.dMm != null) {
      this.dMm.c(this.cXs);
    }
  }
  
  private void axM()
  {
    this.hBK.hop = this.hop;
    this.hBK.hza = this.hza;
    this.hBK.htC = this.htC;
    this.hBC.a(this.htQ, this.hBK, this.htW);
    this.hBC.axM();
    am.axt().htQ = this.htQ;
  }
  
  private void axV()
  {
    this.dMm = com.tencent.mm.modelgeo.c.OB();
    avJ();
  }
  
  private void ayh()
  {
    com.tencent.mm.kernel.g.Eh().dpP.a(645, this);
    com.tencent.mm.kernel.g.Eh().dpP.a(651, this);
    com.tencent.mm.kernel.g.Eh().dpP.a(563, this);
    com.tencent.mm.kernel.g.Eh().dpP.a(652, this);
    com.tencent.mm.kernel.g.Eh().dpP.a(560, this);
    com.tencent.mm.kernel.g.Eh().dpP.a(699, this);
    com.tencent.mm.kernel.g.Eh().dpP.a(902, this);
    com.tencent.mm.kernel.g.Eh().dpP.a(904, this);
    com.tencent.mm.kernel.g.Eh().dpP.a(1163, this);
  }
  
  private void ayi()
  {
    com.tencent.mm.kernel.g.Eh().dpP.b(645, this);
    com.tencent.mm.kernel.g.Eh().dpP.b(651, this);
    com.tencent.mm.kernel.g.Eh().dpP.b(563, this);
    com.tencent.mm.kernel.g.Eh().dpP.b(652, this);
    com.tencent.mm.kernel.g.Eh().dpP.b(560, this);
    com.tencent.mm.kernel.g.Eh().dpP.b(699, this);
    com.tencent.mm.kernel.g.Eh().dpP.b(902, this);
    com.tencent.mm.kernel.g.Eh().dpP.b(904, this);
    com.tencent.mm.kernel.g.Eh().dpP.b(1163, this);
  }
  
  private void ayj()
  {
    this.hza = this.hop;
    this.hBK = new e.a();
    this.hBK.hop = this.hop;
    this.hBK.hza = this.hza;
    this.hBK.htC = this.htC;
    this.hBK.hBD = this.hBD;
    this.hBK.hBF = this.hBF;
    this.hBK.hBE = this.hBE;
    this.hBK.hBh = this.hBh;
    this.hBK.hBi = this.hBi;
    this.hBK.hvg = this.hvg;
    this.hBK.hCB = getIntent().getIntExtra("key_from_appbrand_type", 0);
  }
  
  private void ayk()
  {
    int j = 1;
    int i = 1;
    if ((this.hBN) || (this.htQ == null)) {
      return;
    }
    this.hBN = true;
    if (this.hvg)
    {
      localh = com.tencent.mm.plugin.report.service.h.mEJ;
      j = this.htQ.awm().huV;
      str1 = this.htQ.awr();
      str2 = this.htQ.awq();
      k = this.hza;
      str3 = this.hBD;
      if (this.htQ.awk()) {}
      for (;;)
      {
        localh.h(11324, new Object[] { "ShareCardDetailUI", Integer.valueOf(j), str1, str2, Integer.valueOf(0), Integer.valueOf(k), str3, Integer.valueOf(i), "" });
        return;
        i = 0;
      }
    }
    com.tencent.mm.plugin.report.service.h localh = com.tencent.mm.plugin.report.service.h.mEJ;
    int k = this.htQ.awm().huV;
    String str1 = this.htQ.awr();
    String str2 = this.htQ.awq();
    int m = this.hza;
    String str3 = this.hBD;
    if (this.htQ.awk()) {}
    for (i = j;; i = 0)
    {
      localh.h(11324, new Object[] { "CardDetailView", Integer.valueOf(k), str1, str2, Integer.valueOf(0), Integer.valueOf(m), str3, Integer.valueOf(i), "" });
      return;
    }
  }
  
  private void ayl()
  {
    Object localObject = new bqs();
    ((bqs)localObject).soQ = this.dxx;
    ((bqs)localObject).hwj = this.hBJ;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardDetailUI", "GetCardItemInfo templateId:%s", new Object[] { this.dxx });
    localObject = new aa(this.htC, this.hop, this.hBD, this.hBF, this.hBh, this.hBi, this.hBg, this.hBj, (bqs)localObject);
    com.tencent.mm.kernel.g.Eh().dpP.a((com.tencent.mm.ab.l)localObject, 0);
  }
  
  private void aym()
  {
    Object localObject;
    if (!TextUtils.isEmpty(this.htQ.awr()))
    {
      localObject = this.htQ.awr();
      if ((this.htQ == null) || (this.htQ.awm().rnK != 1)) {
        break label153;
      }
      float f2 = this.cXm;
      float f3 = this.cXn;
      float f1;
      if (f2 != -85.0F)
      {
        f1 = f3;
        if (f3 != -1000.0F) {}
      }
      else
      {
        f2 = am.axo().cXm;
        f1 = am.axo().cXn;
      }
      localObject = new v((String)localObject, f1, f2, this.htQ.awq());
      com.tencent.mm.kernel.g.Eh().dpP.a((com.tencent.mm.ab.l)localObject, 0);
    }
    label153:
    label267:
    label344:
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              return;
              if (!TextUtils.isEmpty(this.htC))
              {
                localObject = this.htC;
                break;
              }
              com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardDetailUI", "doNetSceneCardShopLBS card id is null, return");
              return;
              if ((this.htQ == null) || (this.htQ.awm().rnK <= 1)) {
                break label267;
              }
              if ((this.cXm != -85.0F) && (this.cXn != -1000.0F))
              {
                this.hBO = false;
                localObject = new v((String)localObject, this.cXn, this.cXm, this.htQ.awq());
                com.tencent.mm.kernel.g.Eh().dpP.a((com.tencent.mm.ab.l)localObject, 0);
                return;
              }
            } while (this.hBO);
            this.hBO = true;
          } while (!this.hAj);
          avJ();
          return;
        } while (this.htQ == null);
        this.htQ.a(null);
        axM();
        if (!this.htQ.avS()) {
          break label344;
        }
        localObject = am.axq().xC(this.htC);
      } while (localObject == null);
      ((ShareCardInfo)localObject).a(null);
      am.axq().c((com.tencent.mm.sdk.e.c)localObject, new String[] { this.htC });
      return;
      localObject = am.axi().xm(this.htC);
    } while (localObject == null);
    ((CardInfo)localObject).a(null);
    am.axi().c((com.tencent.mm.sdk.e.c)localObject, new String[] { this.htC });
  }
  
  private void ayn()
  {
    com.tencent.mm.plugin.card.sharecard.model.c localc = new com.tencent.mm.plugin.card.sharecard.model.c(this.htC);
    com.tencent.mm.kernel.g.Eh().dpP.a(localc, 0);
  }
  
  private void b(int paramInt1, String paramString1, int paramInt2, String paramString2)
  {
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardDetailUI", "handleAcceptError, errCode = " + paramInt1 + " errMsg = " + paramString1 + " ret_code:" + paramInt2 + " ret_msg:" + paramString2);
    if (paramInt2 == 10000)
    {
      paramString1 = paramString2;
      if (TextUtils.isEmpty(paramString2)) {
        paramString1 = getString(a.g.card_accept_late);
      }
      this.htQ.awn().status = 4;
      axM();
    }
    for (;;)
    {
      com.tencent.mm.plugin.card.d.d.b(this, paramString1);
      return;
      if (paramInt2 == 10001)
      {
        paramString1 = paramString2;
        if (TextUtils.isEmpty(paramString2)) {
          paramString1 = getString(a.g.card_accept_time_out);
        }
        this.htQ.awn().status = 5;
        axM();
      }
      else if (paramInt2 == 10002)
      {
        paramString1 = paramString2;
        if (TextUtils.isEmpty(paramString2)) {
          paramString1 = getString(a.g.card_no_stock);
        }
      }
      else
      {
        paramString1 = paramString2;
        if (TextUtils.isEmpty(paramString2)) {
          paramString1 = getString(a.g.card_accept_fail);
        }
      }
    }
  }
  
  private void dO(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.fUo = p.b(this, getString(a.g.loading_tips), true, 0, null);
    }
    while ((this.fUo == null) || (!this.fUo.isShowing())) {
      return;
    }
    this.fUo.dismiss();
    this.fUo = null;
  }
  
  private void dR(boolean paramBoolean)
  {
    if (paramBoolean) {
      com.tencent.mm.plugin.card.d.l.ck(this.hBC.hCq, this.hBC.hCp);
    }
  }
  
  private void dS(boolean paramBoolean)
  {
    if (((this.hza == 7) || (this.hza == 8) || (this.hza == 16) || (this.hza == 26)) && (this.hop == 3))
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("key_code", this.hBP);
      setResult(-1, localIntent);
      if (paramBoolean) {
        finish();
      }
    }
    do
    {
      do
      {
        return;
        if (((this.hza != 7) || (this.hop != 7)) && ((this.hza != 16) || (this.hop != 16)) && ((this.hza != 8) || (this.hop != 8)) && ((this.hza != 26) || (this.hop != 26))) {
          break;
        }
        setResult(0);
      } while (!paramBoolean);
      finish();
      return;
    } while (!paramBoolean);
    finish();
  }
  
  private void nT(int paramInt)
  {
    if ((this.hza != 7) && (this.hza != 16))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardDetailUI", "mPreviousScene != ConstantsProtocal.MM_CARD_ITEM_FROM_SCENE_JSAPI and mPreviousScene != ConstantsProtocal.MM_CARD_ITEM_FROM_SCENE_NEARBY_PEOPLE_JSAPI ,don't push accept event");
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    Object localObject = new com.tencent.mm.plugin.card.model.e();
    ((com.tencent.mm.plugin.card.model.e)localObject).huU = this.htQ.awr();
    ((com.tencent.mm.plugin.card.model.e)localObject).cad = this.hBF;
    ((com.tencent.mm.plugin.card.model.e)localObject).code = this.hBP;
    localLinkedList.add(localObject);
    localObject = new com.tencent.mm.g.a.b();
    ((com.tencent.mm.g.a.b)localObject).bFZ.bjW = paramInt;
    if (paramInt == -1) {}
    for (((com.tencent.mm.g.a.b)localObject).bFZ.bGa = com.tencent.mm.plugin.card.d.h.a(localLinkedList, true, this.hza);; ((com.tencent.mm.g.a.b)localObject).bFZ.bGa = com.tencent.mm.plugin.card.d.h.a(localLinkedList, false, this.hza))
    {
      com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
      return;
    }
  }
  
  /* Error */
  private void xd(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 114	com/tencent/mm/plugin/card/ui/CardDetailUI:hzn	Z
    //   6: ifeq +14 -> 20
    //   9: ldc 78
    //   11: ldc_w 664
    //   14: invokestatic 381	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   17: aload_0
    //   18: monitorexit
    //   19: return
    //   20: ldc 78
    //   22: ldc_w 666
    //   25: invokestatic 180	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   28: aload_0
    //   29: iconst_1
    //   30: putfield 114	com/tencent/mm/plugin/card/ui/CardDetailUI:hzn	Z
    //   33: new 287	android/content/Intent
    //   36: dup
    //   37: aload_0
    //   38: ldc_w 668
    //   41: invokespecial 671	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   44: astore_2
    //   45: aload_2
    //   46: ldc_w 673
    //   49: aload_0
    //   50: getfield 164	com/tencent/mm/plugin/card/ui/CardDetailUI:htQ	Lcom/tencent/mm/plugin/card/base/b;
    //   53: invokeinterface 198 1 0
    //   58: invokevirtual 521	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   61: pop
    //   62: aload_2
    //   63: ldc_w 675
    //   66: aload_1
    //   67: invokevirtual 521	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   70: pop
    //   71: aload_2
    //   72: ldc_w 677
    //   75: aload_0
    //   76: getfield 164	com/tencent/mm/plugin/card/ui/CardDetailUI:htQ	Lcom/tencent/mm/plugin/card/base/b;
    //   79: invokeinterface 305 1 0
    //   84: getfield 680	com/tencent/mm/protocal/c/lf:dxh	Ljava/lang/String;
    //   87: invokevirtual 521	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   90: pop
    //   91: aload_2
    //   92: ldc_w 682
    //   95: aload_0
    //   96: getfield 121	com/tencent/mm/plugin/card/ui/CardDetailUI:hop	I
    //   99: invokevirtual 685	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   102: pop
    //   103: aload_2
    //   104: ldc_w 687
    //   107: iconst_0
    //   108: invokevirtual 685	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   111: pop
    //   112: aload_0
    //   113: aload_2
    //   114: invokevirtual 691	com/tencent/mm/plugin/card/ui/CardDetailUI:startActivity	(Landroid/content/Intent;)V
    //   117: goto -100 -> 17
    //   120: astore_1
    //   121: aload_0
    //   122: monitorexit
    //   123: aload_1
    //   124: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	125	0	this	CardDetailUI
    //   0	125	1	paramString	String
    //   44	70	2	localIntent	Intent
    // Exception table:
    //   from	to	target	type
    //   2	17	120	finally
    //   20	117	120	finally
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardDetailUI", "onSceneEnd, errType = " + paramInt1 + " errCode = " + paramInt2);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      dO(false);
      if ((paraml instanceof aa))
      {
        paramString = ((aa)paraml).hwU;
        if (TextUtils.isEmpty(paramString)) {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardDetailUI", "onSceneEnd, NetSceneGetCardItemInfo return json is null");
        }
      }
      label372:
      label698:
      label863:
      label885:
      label1723:
      label1759:
      label2017:
      label2109:
      label2597:
      label2606:
      do
      {
        for (;;)
        {
          return;
          paraml = this.htQ;
          Object localObject = new CardInfo();
          com.tencent.mm.plugin.card.d.f.a((CardInfo)localObject, paramString);
          if (!TextUtils.isEmpty(((com.tencent.mm.plugin.card.base.b)localObject).awq()))
          {
            this.htC = ((com.tencent.mm.plugin.card.base.b)localObject).awq();
            this.htQ = ((com.tencent.mm.plugin.card.base.b)localObject);
            aym();
            if (this.hop == 3)
            {
              if (paraml != null)
              {
                ((CardInfo)this.htQ).field_stickyAnnouncement = ((CardInfo)paraml).field_stickyAnnouncement;
                ((CardInfo)this.htQ).field_stickyEndTime = ((CardInfo)paraml).field_stickyEndTime;
                ((CardInfo)this.htQ).field_stickyIndex = ((CardInfo)paraml).field_stickyIndex;
                ((CardInfo)this.htQ).field_label_wording = ((CardInfo)paraml).field_label_wording;
                this.htQ.a(paraml.awp());
              }
              if (!this.hBM) {
                break label372;
              }
              com.tencent.mm.plugin.card.d.l.j(this.htQ);
            }
          }
          for (;;)
          {
            axM();
            ayk();
            if (this.htQ.awg()) {
              am.axv().xc(this.htQ.awq());
            }
            this.hBQ.a(this, this.htC, this.htQ, this.cXm, this.cXn);
            return;
            if ((!TextUtils.isEmpty(((com.tencent.mm.plugin.card.base.b)localObject).awq())) || (this.htC.equals(((com.tencent.mm.plugin.card.base.b)localObject).awr()))) {
              break;
            }
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardDetailUI", "mCardId:%s, mCardTpId:%s is different, error", new Object[] { this.htC, ((com.tencent.mm.plugin.card.base.b)localObject).awr() });
            return;
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardDetailUI", "onSceneEnd(), NetSceneGetCardItemInfo updateDataToDB is false");
          }
          if ((paraml instanceof com.tencent.mm.plugin.card.model.o))
          {
            if (this.hza == 26) {
              dO(false);
            }
            localObject = ((com.tencent.mm.plugin.card.model.o)paraml).hwU;
            paramInt1 = ((com.tencent.mm.plugin.card.model.o)paraml).hwV;
            paraml = ((com.tencent.mm.plugin.card.model.o)paraml).hwW;
            if (paramInt1 != 0) {
              b(paramInt2, paramString, paramInt1, paraml);
            }
            while (TextUtils.isEmpty((CharSequence)localObject))
            {
              com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardDetailUI", "onSceneEnd, NetSceneAcceptCardItem return json is null");
              return;
              com.tencent.mm.ui.base.h.bA(this, getResources().getString(a.g.card_add_card_pack));
            }
            this.hop = 3;
            if (this.htQ == null) {
              this.htQ = new CardInfo();
            }
            com.tencent.mm.plugin.card.d.f.a((CardInfo)this.htQ, (String)localObject);
            if (!TextUtils.isEmpty(this.htQ.awq())) {
              this.htC = this.htQ.awq();
            }
            if (this.hBC.ayE() == 1)
            {
              paramString = this.hBC;
              if (paramString.hCo != null)
              {
                paramString = paramString.hCo;
                if (paramString.htV != null) {
                  paramString.htV.hvj = false;
                }
              }
            }
            if (this.hza != 26)
            {
              aym();
              axM();
            }
            com.tencent.mm.plugin.card.d.l.azQ();
            paramString = this.htQ;
            if (paramString.avT())
            {
              paraml = (Integer)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sQf, Integer.valueOf(0));
              if ((paraml == null) || (paraml.intValue() != 1))
              {
                com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sQf, Integer.valueOf(1));
                if (!com.tencent.mm.plugin.card.d.l.azT()) {
                  break label863;
                }
                com.tencent.mm.plugin.card.d.d.c(this, a.e.card_show_accepted_tips_for_share, a.g.card_accepted_title_for_share, paramString.awm().hwg);
              }
              this.hBP = this.htQ.aww();
              if ((this.hza != 7) && (this.hza != 16)) {
                break label885;
              }
              paramString = new Intent();
              paramString.putExtra("key_code", this.hBP);
              setResult(-1, paramString);
              nT(-1);
            }
            for (;;)
            {
              if (this.htQ.awg()) {
                am.axv().xc(this.htQ.awq());
              }
              this.hBQ.a(this, this.htC, this.htQ, this.cXm, this.cXn);
              return;
              paraml = (Integer)com.tencent.mm.kernel.g.Ei().DT().get(282884, null);
              if ((paraml != null) && (paraml.intValue() == 1)) {
                break label698;
              }
              com.tencent.mm.kernel.g.Ei().DT().set(282884, Integer.valueOf(1));
              break;
              com.tencent.mm.plugin.card.d.d.c(this, a.e.card_show_accepted_tips, a.g.card_accepted_title, paramString.awm().hwg);
              break label698;
              if ((!this.hBL) && (this.hza == 8)) {
                dS(true);
              } else if ((this.hza == 26) && (paramInt1 == 0)) {
                dS(true);
              }
            }
          }
          if ((paraml instanceof v))
          {
            this.htW = ((v)paraml).hxd;
            if ((this.htQ != null) && (this.htW != null) && (this.htW.size() > 0))
            {
              this.htQ.a((la)this.htW.get(0));
              axM();
              if (this.htQ.avS())
              {
                paramString = am.axq().xC(this.htC);
                if (paramString != null)
                {
                  paramString.a((la)this.htW.get(0));
                  am.axq().c(paramString, new String[] { this.htC });
                }
              }
              else
              {
                paramString = am.axi().xm(this.htC);
                if (paramString != null)
                {
                  paramString.a((la)this.htW.get(0));
                  am.axi().c(paramString, new String[] { this.htC });
                }
              }
            }
            else if ((this.htQ != null) && (this.htW == null))
            {
              this.htQ.a(null);
              axM();
              if (this.htQ.avS())
              {
                paramString = am.axq().xC(this.htC);
                if (paramString != null)
                {
                  paramString.a(null);
                  am.axq().c(paramString, new String[] { this.htC });
                }
              }
              else
              {
                paramString = am.axi().xm(this.htC);
                if (paramString != null)
                {
                  paramString.a(null);
                  am.axi().c(paramString, new String[] { this.htC });
                }
              }
            }
          }
          else if ((paraml instanceof af))
          {
            paramInt1 = ((af)paraml).hwV;
            localObject = ((af)paraml).hwW;
            if (paramInt1 == 10000)
            {
              paramString = (String)localObject;
              if (TextUtils.isEmpty((CharSequence)localObject)) {
                paramString = getString(a.g.card_gift_failed_tips);
              }
              com.tencent.mm.plugin.card.d.d.b(this, paramString);
              return;
            }
            this.hBF = ((af)paraml).cad;
            dR(true);
            paramString = this.htQ.awn();
            paramString.status = 3;
            this.htQ.a(paramString);
            com.tencent.mm.plugin.card.d.l.j(this.htQ);
            axM();
            if (this.hza == 3)
            {
              dS(true);
              return;
            }
            if (this.hza == 15)
            {
              paramString = new pf();
              com.tencent.mm.sdk.b.a.sFg.m(paramString);
            }
          }
          else
          {
            if ((paraml instanceof r))
            {
              com.tencent.mm.ui.base.h.bA(this, getResources().getString(a.g.card_delete_success_tips));
              am.axh();
              com.tencent.mm.plugin.card.b.b.nG(4);
              dS(true);
              return;
            }
            if ((paraml instanceof t))
            {
              paramString = ((t)paraml).hxb;
              if ((paramString != null) && (paramString.size() > 0))
              {
                paramString = (com.tencent.mm.plugin.card.base.b)paramString.get(0);
                if ((paramString != null) && (!this.htC.equals(paramString.awr())))
                {
                  com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardDetailUI", "mCardId:%s, mCardTpId:%s is different, error", new Object[] { this.htC, paramString.awr() });
                  return;
                }
                this.htQ = paramString;
                if (this.htQ != null)
                {
                  this.htC = this.htQ.awq();
                  aym();
                  if (this.htQ.awg()) {
                    am.axv().xc(this.htQ.awq());
                  }
                }
                if (this.hop == 26) {
                  this.hop = 3;
                }
                axM();
              }
              ayk();
              com.tencent.mm.plugin.card.d.l.azQ();
              return;
            }
            if ((paraml instanceof com.tencent.mm.plugin.card.sharecard.model.g))
            {
              paramString = ((com.tencent.mm.plugin.card.sharecard.model.g)paraml).hwU;
              paramInt1 = ((com.tencent.mm.plugin.card.sharecard.model.g)paraml).hwV;
              paraml = ((com.tencent.mm.plugin.card.sharecard.model.g)paraml).hwW;
              if (paramInt1 != 0)
              {
                paramString = paraml;
                if (TextUtils.isEmpty(paraml)) {
                  paramString = getString(a.g.card_accept_fail_tips);
                }
                com.tencent.mm.plugin.card.d.d.b(this, paramString);
                com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardDetailUI", "NetSceneShareCardItem onSceneEnd, accept card error, ret_msg:%s", new Object[] { paramString });
                return;
              }
              com.tencent.mm.ui.base.h.bA(this, getResources().getString(a.g.card_accept_success_tips));
              if (TextUtils.isEmpty(paramString))
              {
                com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardDetailUI", "NetSceneShareCardItem onSceneEnd, json is null");
                return;
              }
              this.hop = 3;
              if (this.htQ == null)
              {
                this.htQ = new ShareCardInfo();
                com.tencent.mm.plugin.card.d.f.a((ShareCardInfo)this.htQ, paramString);
                paraml = (ShareCardInfo)this.htQ;
                if (!TextUtils.isEmpty(paramString)) {
                  break label2017;
                }
                com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardInfoParser", "parserShareCardItemEncryptCodeForSingle jsonContent is null");
                if (!TextUtils.isEmpty(this.htQ.awq())) {
                  this.htC = this.htQ.awq();
                }
                if (TextUtils.isEmpty(this.htQ.aws())) {
                  ((ShareCardInfo)this.htQ).field_from_username = com.tencent.mm.model.q.GF();
                }
                com.tencent.mm.plugin.card.d.l.a((ShareCardInfo)this.htQ);
                aym();
                axM();
                com.tencent.mm.plugin.card.d.l.azS();
                am.axp().auM();
                this.hBP = this.htQ.aww();
                if ((this.hza != 7) && (this.hza != 16)) {
                  break label2109;
                }
                paramString = new Intent();
                paramString.putExtra("key_code", this.hBP);
                setResult(-1, paramString);
                nT(-1);
              }
              for (;;)
              {
                paramString = (Integer)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sQd, Integer.valueOf(0));
                if ((paramString == null) || (paramString.intValue() != 1))
                {
                  com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sQd, Integer.valueOf(1));
                  com.tencent.mm.plugin.card.d.d.c(this, a.e.card_show_share_card_tips, a.g.card_share_card_tips_title, "");
                }
                if (!this.htQ.awg()) {
                  break;
                }
                am.axv().xc(this.htQ.awq());
                return;
                if (!(this.htQ instanceof CardInfo)) {
                  break label1723;
                }
                this.htQ = new ShareCardInfo();
                break label1723;
                try
                {
                  paramString = new JSONObject(paramString).optJSONArray("card_list");
                  if (paramString == null) {
                    break label1759;
                  }
                  paraml.huZ = paramString.optJSONObject(0).optString("encrypt_code");
                  com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardInfoParser", "encrypt_code:" + paraml.huZ);
                }
                catch (JSONException paramString)
                {
                  com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.CardInfoParser", paramString, "", new Object[0]);
                  com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardInfoParser", paramString.getMessage());
                }
                break label1759;
                if ((!this.hBL) && (this.hza == 8)) {
                  dS(true);
                }
              }
            }
            if (!(paraml instanceof com.tencent.mm.plugin.card.sharecard.model.c)) {
              break;
            }
            paraml = ((com.tencent.mm.plugin.card.sharecard.model.c)paraml).hwU;
            if (TextUtils.isEmpty(paraml))
            {
              com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardDetailUI", "onSceneEnd, NetSceneGetShareCard json is null");
              return;
            }
            paramString = this.htQ;
            this.htQ = new ShareCardInfo();
            localObject = (ShareCardInfo)this.htQ;
            if (TextUtils.isEmpty(paraml))
            {
              com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardInfoParser", "parserShareCardItemJson jsonContent is null");
              if (paramString != null)
              {
                if (!TextUtils.isEmpty(paramString.aws())) {
                  ((ShareCardInfo)this.htQ).field_from_username = ((ShareCardInfo)paramString).field_from_username;
                }
                ((ShareCardInfo)this.htQ).field_app_id = ((ShareCardInfo)paramString).field_app_id;
                ((ShareCardInfo)this.htQ).field_consumer = ((ShareCardInfo)paramString).field_consumer;
                ((ShareCardInfo)this.htQ).field_share_time = ((ShareCardInfo)paramString).field_share_time;
                ((ShareCardInfo)this.htQ).field_updateTime = ((ShareCardInfo)paramString).field_updateTime;
                ((ShareCardInfo)this.htQ).field_begin_time = ((ShareCardInfo)paramString).field_begin_time;
                ((ShareCardInfo)this.htQ).field_end_time = ((ShareCardInfo)paramString).field_end_time;
                ((ShareCardInfo)this.htQ).field_block_mask = ((ShareCardInfo)paramString).field_block_mask;
                this.htQ.a(paramString.awp());
                ((ShareCardInfo)this.htQ).field_categoryType = ((ShareCardInfo)paramString).field_categoryType;
                ((ShareCardInfo)this.htQ).field_itemIndex = ((ShareCardInfo)paramString).field_itemIndex;
                if (((ShareCardInfo)paramString).field_status != ((ShareCardInfo)this.htQ).field_status)
                {
                  com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardDetailUI", "getsharecared return, the status is " + ((ShareCardInfo)this.htQ).field_status);
                  com.tencent.mm.plugin.card.sharecard.a.b.a(this, this.htQ);
                }
              }
              if (!TextUtils.isEmpty(this.htQ.awq())) {
                this.htC = this.htQ.awq();
              }
              axM();
              aym();
              ayk();
              if (this.hop == 3)
              {
                if (!this.hBM) {
                  break label2597;
                }
                com.tencent.mm.plugin.card.d.l.j(this.htQ);
              }
            }
            for (;;)
            {
              if (!this.htQ.awg()) {
                break label2606;
              }
              am.axv().xc(this.htQ.awq());
              return;
              try
              {
                com.tencent.mm.plugin.card.d.f.a((ShareCardInfo)localObject, new JSONObject(paraml));
              }
              catch (JSONException paraml)
              {
                com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.CardInfoParser", paraml, "", new Object[0]);
              }
              break;
              com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardDetailUI", "onSceneEnd() sharecard updateDataToDB is false");
            }
          }
        }
      } while (!(paraml instanceof com.tencent.mm.plugin.card.sharecard.model.a));
      if (((com.tencent.mm.plugin.card.sharecard.model.a)paraml).hwV != 0)
      {
        com.tencent.mm.plugin.card.d.d.b(this, getString(a.g.card_delete_fail_tips));
        return;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardDetailUI", "delete share card, card id is " + this.htQ.awq());
      com.tencent.mm.plugin.card.sharecard.a.b.a(this, this.htQ);
      com.tencent.mm.ui.base.h.bA(this, getResources().getString(a.g.card_delete_success_tips));
      am.axp().axD();
      dS(true);
      return;
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardDetailUI", "onSceneEnd, errType = " + paramInt1 + " errCode = " + paramInt2 + " cmd:" + paraml.getType());
    dO(false);
    if ((paraml instanceof af))
    {
      dR(false);
      paramInt1 = ((af)paraml).hwV;
      paraml = ((af)paraml).hwW;
      if (paramInt1 != 10000) {
        break label2893;
      }
      paramString = paraml;
      if (TextUtils.isEmpty(paraml)) {
        paramString = getString(a.g.card_gift_failed_tips);
      }
    }
    label2893:
    for (;;)
    {
      paraml = paramString;
      if (TextUtils.isEmpty(paramString)) {
        paraml = getString(a.g.card_wallet_unknown_err);
      }
      Toast.makeText(this.mController.tml, paraml, 0).show();
      return;
      if ((paraml instanceof com.tencent.mm.plugin.card.model.o))
      {
        nT(0);
        b(paramInt2, paramString, ((com.tencent.mm.plugin.card.model.o)paraml).hwV, ((com.tencent.mm.plugin.card.model.o)paraml).hwW);
        return;
      }
      if ((paraml instanceof v)) {
        break;
      }
    }
  }
  
  public final void aou()
  {
    com.tencent.mm.plugin.card.ui.view.g localg = this.hBC.hCa;
    if (localg != null) {
      localg.azM();
    }
  }
  
  public final void awE()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardDetailUI", "code change");
    if ((this.hBC.hCa instanceof com.tencent.mm.plugin.card.ui.view.q))
    {
      ((com.tencent.mm.plugin.card.ui.view.q)this.hBC.hCa).hGn = am.axv().getCode();
      this.hBC.axM();
    }
  }
  
  public final void awJ()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardDetailUI", "onVibrate");
    this.hni.vibrate(300L);
  }
  
  public final void awK()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardDetailUI", "onFinishUI");
  }
  
  public final void b(String paramString, j.b paramb)
  {
    if ((!TextUtils.isEmpty(paramString)) && (!paramString.equals(this.htC))) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardDetailUI", "onMarkSuccess(), the mark card id is diff from current id!");
    }
    do
    {
      return;
      dO(false);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardDetailUI", "onMarkSuccess()");
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardDetailUI", "markSucc:" + paramb.huI + " markCardId: " + paramb.huJ);
      this.hBH = false;
      if (paramb.huI != 1) {
        break label245;
      }
      if ((TextUtils.isEmpty(paramb.huJ)) || (this.htQ.awq().equals(paramb.huJ))) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardDetailUI", "markCardId is diff as now id!");
    } while (!this.htQ.avS());
    paramString = am.axq().xC(paramb.huJ);
    if (paramString != null)
    {
      this.htQ = paramString;
      this.htC = paramb.huJ;
      axM();
      am.axt().d(this.htQ);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardDetailUI", "update the mCardInfo");
      this.hBG = true;
      a(paramb);
      return;
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardDetailUI", "The mark card id not exist the card info in DB!， mark failed!");
    com.tencent.mm.plugin.card.d.d.b(this, getString(a.g.card_mark_failed_tips));
    this.hBG = false;
    return;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardDetailUI", "markCardId is same as now id!");
    this.hBG = true;
    a(paramb);
    return;
    label245:
    this.hBG = false;
    com.tencent.mm.plugin.card.d.d.b(this, getString(a.g.card_mark_used));
  }
  
  public final void bZ(String paramString1, String paramString2)
  {
    if ((!TextUtils.isEmpty(paramString1)) && (!paramString1.equals(this.htC)))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardDetailUI", "onMarkFail(), the mark card id is diff from current id!");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardDetailUI", "onMarkFail()");
    this.hBG = false;
    this.hBH = false;
    dO(false);
    paramString1 = paramString2;
    if (TextUtils.isEmpty(paramString2)) {
      paramString1 = getString(a.g.card_mark_failed_tips);
    }
    com.tencent.mm.plugin.card.d.d.b(this, paramString1);
  }
  
  public final void f(com.tencent.mm.plugin.card.base.b paramb)
  {
    if (paramb == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardDetailUI", "cardInfo is empty, not to do onDataChange");
      return;
    }
    if ((this.htQ == null) || (!this.htQ.awq().equals(paramb.awq())))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardDetailUI", "is not the same card, not to do onDataChange");
      return;
    }
    if (!this.hBC.ayF())
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardDetailUI", "because the card is not accept, not to do onDataChange");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardDetailUI", "onDataChange");
    this.htQ = paramb;
    this.htC = this.htQ.awq();
    if ((this.htQ.awg()) && (am.axv().isEmpty())) {
      am.axv().xc(this.htQ.awq());
    }
    axM();
  }
  
  protected final int getLayoutId()
  {
    return a.e.card_detail_ui;
  }
  
  protected final void initView()
  {
    setBackBtn(new CardDetailUI.2(this));
    this.hni = ((Vibrator)getSystemService("vibrator"));
    Object localObject2;
    if (this.hBC == null)
    {
      this.hBC = new e(this, this.mController.contentView);
      localObject1 = this.hBC;
      ((e)localObject1).hCm = new j(((e)localObject1).hBT);
      localObject2 = ((e)localObject1).hCm;
      ((j)localObject2).hyW = ((j)localObject2).fcq.getWindow().getAttributes().screenBrightness;
      if (((j)localObject2).eZB == null)
      {
        localObject3 = View.inflate(((j)localObject2).fcq, a.e.card_popup_window, null);
        ((j)localObject2).eZD = ((View)localObject3).findViewById(a.d.popupwd_qrcode_layout);
        ((j)localObject2).eZC = ((ImageView)((View)localObject3).findViewById(a.d.popupwd_qrcode_iv));
        ((j)localObject2).hGg = ((TextView)((View)localObject3).findViewById(a.d.popupwd_qrcode_tv));
        ((j)localObject2).hGh = ((TextView)((View)localObject3).findViewById(a.d.popupwd_qrcode_tips_tv));
        ((j)localObject2).hGi = ((View)localObject3).findViewById(a.d.popupwd_barcode_layout);
        ((j)localObject2).hGj = ((ImageView)((View)localObject3).findViewById(a.d.popupwd_barcode_iv));
        ((j)localObject2).hGk = ((MMVerticalTextView)((View)localObject3).findViewById(a.d.vertical_barcode_text));
        ((j)localObject2).hGl = ((MMVerticalTextView)((View)localObject3).findViewById(a.d.vertical_barcode_tips_text));
        ((View)localObject3).setOnClickListener(new j.2((j)localObject2));
        ((j)localObject2).eZB = new com.tencent.mm.ui.base.o((View)localObject3, -1, -1, true);
        ((j)localObject2).eZB.update();
        ((j)localObject2).eZB.setBackgroundDrawable(new ColorDrawable(16777215));
        ((j)localObject2).eZB.setOnDismissListener(new j.3((j)localObject2));
      }
      ((e)localObject1).hCo = new com.tencent.mm.plugin.card.b.f(((e)localObject1).hBT);
      ((e)localObject1).hBT.geJ = ((MMActivity.a)localObject1);
      com.tencent.mm.sdk.b.a.sFg.b(((e)localObject1).hCx);
      localObject1 = this.hBC;
      if (((e)localObject1).hBV == null)
      {
        ((e)localObject1).hBV = new com.tencent.mm.plugin.card.ui.view.x();
        ((e)localObject1).hBV.a((n)localObject1);
      }
      if (((e)localObject1).hBX == null)
      {
        ((e)localObject1).hBX = new com.tencent.mm.plugin.card.ui.view.o();
        ((e)localObject1).hBX.a((n)localObject1);
      }
      if (((e)localObject1).hBY == null)
      {
        ((e)localObject1).hBY = new com.tencent.mm.plugin.card.ui.view.a();
        ((e)localObject1).hBY.a((n)localObject1);
      }
      ((e)localObject1).CU = ((ListView)((e)localObject1).findViewById(a.d.cell_list));
      ((e)localObject1).hCb = new m(((e)localObject1).hBT.mController.tml);
      ((e)localObject1).hCb.hGS = ((e)localObject1).eZF;
      ((e)localObject1).CU.setAdapter(((e)localObject1).hCb);
      ((e)localObject1).hCb.notifyDataSetChanged();
      ((e)localObject1).CU.setOnItemClickListener(new e.1((e)localObject1));
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardDetailUIContoller", "initMenu");
      localObject2 = ((e)localObject1).hBT;
      Object localObject3 = new e.5((e)localObject1);
      ((CardDetailBaseUI)localObject2).hBw.setOnClickListener((View.OnClickListener)localObject3);
      ((e)localObject1).bo = ((LinearLayout)((e)localObject1).findViewById(a.d.header_view));
      ((e)localObject1).hCk = new com.tencent.mm.plugin.card.ui.view.d();
      ((e)localObject1).hCk.a((n)localObject1);
      ((e)localObject1).hCm.htQ = ((e)localObject1).htQ;
    }
    int i = getIntent().getIntExtra("key_from_scene", -1);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardDetailUI", "scene:%d", new Object[] { Integer.valueOf(i) });
    int j;
    if ((i == 2) || (i == 6) || (i == 5))
    {
      this.hop = i;
      localObject1 = getIntent().getStringExtra("key_card_app_msg");
      localObject2 = com.tencent.mm.plugin.card.d.g.xQ((String)localObject1);
      if (localObject2 != null)
      {
        this.htC = ((com.tencent.mm.plugin.card.model.d)localObject2).cac;
        this.hBD = ((com.tencent.mm.plugin.card.model.d)localObject2).hwf;
        this.hBF = ((com.tencent.mm.plugin.card.model.d)localObject2).cad;
        j = ((com.tencent.mm.plugin.card.model.d)localObject2).hwi;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardDetailUI", "scene is " + i + ", isRecommend is " + j);
        if ((j == 1) && (i == 2)) {
          this.hop = 23;
        }
        this.hBJ = ((com.tencent.mm.plugin.card.model.d)localObject2).hwj;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardDetailUI", "recommend_card_id is " + this.hBJ);
      }
      this.hBE = com.tencent.mm.plugin.card.d.g.xR((String)localObject1);
      ayj();
      if (!TextUtils.isEmpty(this.htC)) {
        break label1782;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardDetailUI", "initData, mCardId is null");
      dS(true);
    }
    for (;;)
    {
      this.hBC.a(this.htQ, this.hBK, this.htW);
      this.hBC.hCu = new CardDetailUI.3(this);
      boolean bool = com.tencent.mm.pluginsdk.permission.a.a(this, "android.permission.ACCESS_COARSE_LOCATION", 69, null, null);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardDetailUI", "checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(bool) });
      this.hAj = bool;
      if (this.hAj)
      {
        this.dMm = com.tencent.mm.modelgeo.c.OB();
        avJ();
      }
      return;
      if ((com.tencent.mm.plugin.card.d.l.oa(i)) || (i == 0) || (i == 1) || (i == 3) || (i == 4) || (i == 9) || (i == 12) || (i == 15) || (i == 17) || (i == 21))
      {
        this.hop = i;
        this.htC = getIntent().getStringExtra("key_card_id");
        this.hBF = getIntent().getStringExtra("key_card_ext");
        this.hvg = getIntent().getBooleanExtra("key_is_share_card", false);
        this.hBg = getIntent().getIntExtra("key_stastic_scene", 0);
        this.hBj = getIntent().getStringExtra("key_consumed_card_id");
        if ((i == 7) || (i == 16))
        {
          this.hBh = getIntent().getStringExtra("src_username");
          this.hBi = getIntent().getStringExtra("js_url");
          this.dxx = getIntent().getStringExtra("key_template_id");
          break;
        }
        if ((this.hvg) && (i == 3))
        {
          this.huQ = getIntent().getStringExtra("key_card_tp_id");
          this.htC = com.tencent.mm.plugin.card.sharecard.a.b.cd(this.htC, this.huQ);
          break;
        }
        if (i != 8) {
          break;
        }
        this.hBL = getIntent().getBooleanExtra("key_is_sms_add_card", false);
        break;
      }
      if ((i == 50) || (i == 27))
      {
        this.hop = getIntent().getIntExtra("key_previous_scene", 50);
        if ((this.hop != 26) && (this.hop != 27)) {
          this.hop = 3;
        }
        this.dxx = getIntent().getStringExtra("key_template_id");
        if (this.hop == 27)
        {
          localObject1 = (com.tencent.mm.plugin.card.base.b)getIntent().getParcelableExtra("key_card_info");
          if (localObject1 != null)
          {
            this.htQ = ((com.tencent.mm.plugin.card.base.b)localObject1);
            this.htC = this.htQ.awq();
            ayj();
            aym();
            if (this.htQ.awg()) {
              am.axv().xc(this.htQ.awq());
            }
            axM();
          }
          ayk();
          com.tencent.mm.plugin.card.d.l.azQ();
        }
        else
        {
          localObject1 = com.tencent.mm.plugin.card.d.k.bb(getIntent().getStringExtra("card_list"), this.hop);
          if ((localObject1 == null) || (((LinkedList)localObject1).size() == 0))
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardDetailUI", "initData tempList size is empty");
            dS(true);
          }
          for (;;)
          {
            ayj();
            break;
            dO(true);
            this.htC = ((lg)((LinkedList)localObject1).get(0)).huU;
            i = getIntent().getIntExtra("key_previous_scene", 51);
            localObject2 = new bqs();
            ((bqs)localObject2).soQ = this.dxx;
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardDetailUI", "doBatchGetCardItemByTpInfo templateId:%s", new Object[] { this.dxx });
            localObject1 = new t((LinkedList)localObject1, (bqs)localObject2, i);
            com.tencent.mm.kernel.g.Eh().dpP.a((com.tencent.mm.ab.l)localObject1, 0);
          }
        }
      }
      else if (i == 51)
      {
        if (getIntent().getIntExtra("key_previous_scene", 51) == 26) {}
        for (this.hop = 26;; this.hop = 3)
        {
          this.htC = getIntent().getStringExtra("key_card_id");
          this.htQ = am.axn().hts;
          if (this.htQ == null) {
            this.htQ = am.axi().xm(this.htC);
          }
          ayj();
          if (this.htQ != null) {
            break label1630;
          }
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardDetailUI", "initData, mCardId is null from scene == ConstantsProtocal.MM_CARD_ITEM_FROM_SCENE_VIEW_UI");
          dS(true);
          break;
        }
        label1630:
        aym();
        axM();
        ayk();
        if (this.htQ.awg()) {
          am.axv().xc(this.htQ.awq());
        }
      }
      else
      {
        if (i == 26)
        {
          this.hop = i;
          this.htC = getIntent().getStringExtra("key_card_id");
          this.hBF = getIntent().getStringExtra("key_card_ext");
          break;
        }
        this.hop = i;
        localObject1 = getIntent().getStringExtra("key_card_app_msg");
        localObject2 = com.tencent.mm.plugin.card.d.g.xQ((String)localObject1);
        if (localObject2 != null)
        {
          this.htC = ((com.tencent.mm.plugin.card.model.d)localObject2).cac;
          this.hBD = ((com.tencent.mm.plugin.card.model.d)localObject2).hwf;
          this.hBF = ((com.tencent.mm.plugin.card.model.d)localObject2).cad;
        }
        this.hBE = com.tencent.mm.plugin.card.d.g.xR((String)localObject1);
        break;
        label1782:
        if ((i == 2) || (i == 6) || ((i == 4) && (!this.hvg)) || (i == 5) || (i == 17) || (i == 21) || (i == 23)) {
          i = 1;
        }
        for (;;)
        {
          if ((i == 0) && (this.htQ != null)) {
            break label1999;
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardDetailUI", "initData fail, isNeedDoNetScene1 is true or no cardinfo with cardId = " + this.htC + " isShareCard is " + this.hvg);
          dO(true);
          if (!this.hvg) {
            break label1992;
          }
          ayn();
          break;
          if (i == 15)
          {
            localObject1 = am.axn().getValue("key_accept_card_info");
            if ((localObject1 != null) && ((localObject1 instanceof CardInfo)))
            {
              this.htQ = ((CardInfo)localObject1);
              i = 0;
            }
            else
            {
              i = 1;
            }
          }
          else if (this.hvg)
          {
            this.htQ = am.axq().xC(this.htC);
            i = 0;
          }
          else
          {
            this.htQ = am.axi().xm(this.htC);
            i = 0;
          }
        }
        label1992:
        ayl();
      }
    }
    label1999:
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.CardDetailUI", "initData(), cardId = " + this.htC);
    Object localObject1 = this.htQ.awp();
    if (localObject1 != null)
    {
      this.htW = new ArrayList();
      this.htW.add(localObject1);
    }
    axM();
    if (this.htQ.awg()) {
      am.axv().xc(this.htQ.awq());
    }
    if (this.hvg)
    {
      this.hBM = true;
      i = 1;
      label2106:
      if (i == 0) {
        break label2242;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardDetailUI", "initData fail, isNeedDoNetScene2 is true or no cardinfo with cardId = " + this.htC + " isShareCard is " + this.hvg);
      if (!this.hvg) {
        break label2235;
      }
      ayn();
    }
    for (;;)
    {
      ayk();
      break;
      if ((int)(System.currentTimeMillis() / 1000L) - this.htQ.awt() >= 86400L) {}
      for (j = 1;; j = 0)
      {
        if (j == 0) {
          break label2213;
        }
        this.hBM = true;
        i = 1;
        break;
      }
      label2213:
      if (!this.htQ.awd()) {
        break label2106;
      }
      this.hBM = true;
      i = 1;
      break label2106;
      label2235:
      ayl();
      continue;
      label2242:
      aym();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mStartTime = System.currentTimeMillis();
    ayh();
    paramBundle = am.axt();
    ActionBarActivity localActionBarActivity = this.mController.tml;
    com.tencent.mm.kernel.g.Eh().dpP.a(910, paramBundle);
    am.axp().a(paramBundle);
    com.tencent.mm.plugin.card.b.b localb = am.axh();
    if (localb.htB == null) {
      localb.htB = new ArrayList();
    }
    if (paramBundle != null) {
      localb.htB.add(new WeakReference(paramBundle));
    }
    paramBundle.Wv = new WeakReference(localActionBarActivity);
    am.axt().a(this);
    am.axu().a(this);
    paramBundle = am.axv();
    com.tencent.mm.kernel.g.Eh().dpP.a(577, paramBundle);
    paramBundle.htD.clear();
    paramBundle.htE = 0;
    am.axv().a(this);
    initView();
  }
  
  protected void onDestroy()
  {
    am.axt().c(this);
    ayi();
    am.axt().b(this);
    am.axt().release();
    am.axu().b(this);
    am.axv().b(this);
    am.axv().release();
    Object localObject1 = this.hBC;
    Object localObject2 = ((e)localObject1).hCo;
    ((com.tencent.mm.plugin.card.b.f)localObject2).htQ = null;
    ((com.tencent.mm.plugin.card.b.f)localObject2).htU.clear();
    ((e)localObject1).hCo = null;
    localObject2 = ((e)localObject1).hCm;
    com.tencent.mm.plugin.card.d.l.x(((j)localObject2).hGf);
    int i = ((j)localObject2).hGm.size() - 1;
    while (i >= 0)
    {
      com.tencent.mm.plugin.card.d.l.x((Bitmap)((j)localObject2).hGm.remove(i));
      i -= 1;
    }
    ((j)localObject2).hGm.clear();
    if (((j)localObject2).eZB.isShowing()) {
      ((j)localObject2).eZB.dismiss();
    }
    ((j)localObject2).eZB = null;
    ((j)localObject2).ayT();
    ((j)localObject2).fcq = null;
    ((j)localObject2).htQ = null;
    ((e)localObject1).hCm = null;
    if (((e)localObject1).hBZ != null) {
      ((e)localObject1).hBZ.release();
    }
    ((e)localObject1).hBT.geJ = null;
    com.tencent.mm.sdk.b.a.sFg.c(((e)localObject1).hCx);
    ((e)localObject1).hBV.destroy();
    ((e)localObject1).hBY.destroy();
    ((e)localObject1).hBX.destroy();
    ((e)localObject1).hCk.destroy();
    if (((e)localObject1).hCl != null) {
      ((e)localObject1).hCl.destroy();
    }
    if (((e)localObject1).hCd != null) {
      ((e)localObject1).hCd.destroy();
    }
    if (((e)localObject1).hCc != null) {
      ((e)localObject1).hCc.destroy();
    }
    if (((e)localObject1).hCe != null) {
      ((e)localObject1).hCe.destroy();
    }
    if (((e)localObject1).hCf != null) {
      ((e)localObject1).hCf.destroy();
    }
    if (((e)localObject1).hCg != null) {
      ((e)localObject1).hCg.destroy();
    }
    if (((e)localObject1).hCh != null) {
      ((e)localObject1).hCh.destroy();
    }
    if (((e)localObject1).hCi != null) {
      ((e)localObject1).hCi.destroy();
    }
    if (((e)localObject1).hCj != null) {
      ((e)localObject1).hCj.destroy();
    }
    if (((e)localObject1).hCa != null) {
      ((e)localObject1).hCa.destroy();
    }
    ((e)localObject1).hBU = null;
    localObject2 = am.axy();
    long l;
    if ((((com.tencent.mm.plugin.card.b.g)localObject2).htB == null) || (localObject1 == null))
    {
      am.axy().release();
      this.hni.cancel();
      avL();
      l = System.currentTimeMillis() - this.mStartTime;
      if (this.htQ == null) {
        break label751;
      }
      com.tencent.mm.plugin.report.service.h.mEJ.h(13219, new Object[] { "CardDetailView", Integer.valueOf(this.hop), this.htQ.awr(), this.htQ.awq(), Long.valueOf(l) });
      label535:
      if (((this.hBG) || (this.hBH)) && (this.htQ != null) && (this.htQ.avS()))
      {
        if (!this.htQ.awf()) {
          break label804;
        }
        am.axu().aX(this.htC, 2);
      }
      label591:
      localObject1 = this.hBQ;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardLbsOrBluetooth", "uninit");
      if (((com.tencent.mm.plugin.card.b.i)localObject1).huk != null)
      {
        localObject2 = ((com.tencent.mm.plugin.card.b.i)localObject1).huk;
        if (((i.a)localObject2).fKZ != null) {
          break label818;
        }
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardLbsOrBluetooth", "bluetoothStateListener null, return");
      }
    }
    for (;;)
    {
      ((com.tencent.mm.plugin.card.b.i)localObject1).huk = null;
      ((com.tencent.mm.plugin.card.b.i)localObject1).awO();
      ((com.tencent.mm.plugin.card.b.i)localObject1).hup = null;
      ((com.tencent.mm.plugin.card.b.i)localObject1).hub = null;
      super.onDestroy();
      return;
      i = 0;
      for (;;)
      {
        if (i >= ((com.tencent.mm.plugin.card.b.g)localObject2).htB.size()) {
          break label749;
        }
        WeakReference localWeakReference = (WeakReference)((com.tencent.mm.plugin.card.b.g)localObject2).htB.get(i);
        if (localWeakReference != null)
        {
          g.a locala = (g.a)localWeakReference.get();
          if ((locala != null) && (locala.equals(localObject1)))
          {
            ((com.tencent.mm.plugin.card.b.g)localObject2).htB.remove(localWeakReference);
            break;
          }
        }
        i += 1;
      }
      label749:
      break;
      label751:
      com.tencent.mm.plugin.report.service.h.mEJ.h(13219, new Object[] { "CardDetailView", Integer.valueOf(this.hop), this.htC, this.htC, Long.valueOf(l) });
      break label535;
      label804:
      am.axu().aX(this.htC, 1);
      break label591;
      label818:
      ad.getContext().unregisterReceiver(((i.a)localObject2).fKZ);
      ((i.a)localObject2).fKZ = null;
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardDetailUI", "onKeyDown finishUI");
      dS(false);
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    ayi();
    super.onPause();
    this.hBC.bPd = true;
    am.axt().a(this, false);
    aw.a(this, null);
    com.tencent.mm.plugin.card.b.i locali = this.hBQ;
    if (locali.awQ())
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardLbsOrBluetooth", "stop");
      if (locali.huk != null) {
        locali.huk.awT();
      }
      locali.awO();
      com.tencent.mm.kernel.g.Eh().dpP.b(2574, locali);
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardDetailUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    do
    {
      return;
      if (paramArrayOfInt[0] != 0) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardDetailUI", "onMPermissionGranted LocationPermissionGranted " + this.hAj);
    } while (this.hAj);
    this.hAj = true;
    axV();
    return;
    com.tencent.mm.ui.base.h.a(this, getString(a.g.permission_location_request_again_msg), getString(a.g.permission_tips_title), getString(a.g.jump_to_settings), getString(a.g.confirm_dialog_cancel), false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        CardDetailUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
      }
    }, null);
  }
  
  protected void onResume()
  {
    super.onResume();
    ayh();
    if (this.dMm != null) {
      this.dMm.a(this.cXs, true);
    }
    this.hBC.bPd = false;
    aw.a(this, this);
    am.axt().a(this, true);
    Object localObject;
    int i;
    if (((this.hBG) || (this.hBH)) && (this.htQ.avS()))
    {
      if (!this.htQ.awf()) {
        break label212;
      }
      am.axu().aX(this.htC, 2);
      localObject = am.axt();
      String str = this.htC;
      localObject = (Boolean)((com.tencent.mm.plugin.card.b.d)localObject).htP.get(str);
      if ((localObject == null) || (!((Boolean)localObject).booleanValue())) {
        break label196;
      }
      i = 1;
      if ((i == 0) || (TextUtils.isEmpty(am.axt().htS))) {
        break label201;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardDetailUI", "onResume, do launch succ UI!");
      xe(am.axt().htS);
      label165:
      this.hBC.hCa.d(com.tencent.mm.plugin.card.d.c.hIz);
    }
    for (;;)
    {
      if (this.hBQ.huc) {
        this.hBQ.start();
      }
      return;
      label196:
      i = 0;
      break;
      label201:
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardDetailUI", "onResume, not need launch succ ui or jsonRet is empty!");
      break label165;
      label212:
      am.axu().aX(this.htC, 1);
      localObject = this.hBC.hCa;
      if (localObject != null) {
        ((com.tencent.mm.plugin.card.ui.view.g)localObject).d(com.tencent.mm.plugin.card.d.c.hIz);
      }
    }
  }
  
  public final void onSuccess()
  {
    if ((this.hBC.hCa instanceof com.tencent.mm.plugin.card.ui.view.q))
    {
      ((com.tencent.mm.plugin.card.ui.view.q)this.hBC.hCa).hGn = am.axv().getCode();
      this.hBC.axM();
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardDetailUI", "code get success");
  }
  
  public final void xb(String paramString)
  {
    if (!TextUtils.isEmpty(paramString)) {
      com.tencent.mm.plugin.card.d.d.a(this, paramString, true);
    }
  }
  
  public final void xe(final String paramString)
  {
    if (!this.hBC.ayF())
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardDetailUI", "because the card is not accept, not to do onStartConsumedSuccUI");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardDetailUI", "onStartConsumedSuccUI");
    this.mHandler.post(new Runnable()
    {
      public final void run()
      {
        CardDetailUI.c(CardDetailUI.this, paramString);
      }
    });
  }
  
  public final void xh(String paramString)
  {
    if ((!TextUtils.isEmpty(paramString)) && (!paramString.equals(this.htC)))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CardDetailUI", "onUnmarkSuccess(), the mark card id is diff from current id!");
      return;
    }
    this.hBG = false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/CardDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */