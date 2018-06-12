package com.tencent.mm.plugin.emoji.ui.v2;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.tencent.mm.R.a;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.emoji.e.f;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.d.a;
import com.tencent.mm.plugin.gif.MMAnimateView;
import com.tencent.mm.protocal.c.ta;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.c.a;
import com.tencent.mm.ui.y;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class EmojiStoreV2SingleProductDialogUI
  extends MMBaseActivity
{
  private String ben;
  public String cYO;
  private ProgressBar eWx;
  private com.tencent.mm.ui.widget.a.c evj;
  private int fdx;
  private long ihD;
  private d.a ihj = new EmojiStoreV2SingleProductDialogUI.6(this);
  private ta iqI = new ta();
  private EmojiInfo iqJ;
  private View iqK;
  private MMAnimateView iqL;
  private ImageView iqM;
  private Button iqN;
  private Button iqO;
  private DialogInterface.OnClickListener iqP = new EmojiStoreV2SingleProductDialogUI.1(this);
  private DialogInterface.OnClickListener iqQ = new EmojiStoreV2SingleProductDialogUI.2(this);
  private View.OnClickListener iqR = new EmojiStoreV2SingleProductDialogUI.3(this);
  private com.tencent.mm.ak.a.c.i iqS = new EmojiStoreV2SingleProductDialogUI.4(this);
  private com.tencent.mm.sdk.b.c iqT = new EmojiStoreV2SingleProductDialogUI.5(this);
  private ag mHandler = new ag();
  
  private void a(String paramString, ta paramta)
  {
    if ((bi.oW(paramString)) || (paramta == null))
    {
      x.i("MicroMsg.emoji.EmojiStoreV2SingleProductDialogUI", "username or emoji is null.");
      return;
    }
    Object localObject = com.tencent.mm.plugin.emoji.model.i.aEA().igx.Zy(paramta.rwk);
    int i;
    if (localObject == null)
    {
      au.HU();
      String str = EmojiLogic.L(com.tencent.mm.model.c.Gg(), paramta.rem, paramta.rwk);
      if (e.cn(str))
      {
        if (!o.Wf(str)) {
          break label204;
        }
        i = EmojiInfo.tcJ;
        label79:
        localObject = com.tencent.mm.plugin.emoji.model.i.aEA().igx.b(paramta.rwk, "", EmojiInfo.tcB, i, e.cm(str), "");
        ((EmojiInfo)localObject).field_designerID = paramta.rwl;
        ((EmojiInfo)localObject).field_thumbUrl = paramta.lPl;
      }
    }
    for (paramta = (ta)localObject;; paramta = (ta)localObject)
    {
      paramString = bi.F(bi.aG(paramString, "").split(",")).iterator();
      while (paramString.hasNext())
      {
        localObject = (String)paramString.next();
        if (paramta != null)
        {
          com.tencent.mm.plugin.emoji.model.i.aEw().a((String)localObject, paramta, null);
          setResult(-1);
          finish();
          overridePendingTransition(R.a.pop_in, R.a.pop_out);
        }
      }
      break;
      label204:
      i = EmojiInfo.tcI;
      break label79;
      ((EmojiInfo)localObject).field_designerID = paramta.rwl;
      ((EmojiInfo)localObject).field_thumbUrl = paramta.lPl;
    }
  }
  
  private void aGf()
  {
    this.iqJ = com.tencent.mm.plugin.emoji.model.i.aEA().igx.Zy(this.iqI.rwk);
    if ((this.iqJ != null) && (this.iqJ.field_catalog == EmojiGroupInfo.tcA) && (bi.oW(this.iqJ.field_groupId)))
    {
      this.iqO.setEnabled(false);
      this.iqO.setText(R.l.app_added);
      this.iqO.setTextColor(getResources().getColor(R.e.grey_btn_color_disable));
      return;
    }
    if (e.cn(this.ben))
    {
      this.iqO.setEnabled(true);
      this.iqO.setText(R.l.emoji_store_add_emoji);
      this.iqO.setTextColor(getResources().getColor(R.e.green_text_color));
      return;
    }
    this.iqO.setEnabled(false);
    this.iqO.setEnabled(false);
    this.iqO.setText(R.l.emoji_store_add_emoji);
    this.iqO.setTextColor(getResources().getColor(R.e.grey_btn_color_disable));
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 == 9001) && (paramInt2 == -1))
    {
      String str = paramIntent.getStringExtra("Select_Conv_User");
      if ((!bi.oW(str)) && (this.iqI != null))
      {
        x.d("MicroMsg.emoji.EmojiStoreV2SingleProductDialogUI", "UserName:%s ,MD5:%s", new Object[] { str, this.iqI.rwk });
        a(str, this.iqI);
        paramIntent = paramIntent.getStringExtra("custom_send_text");
        com.tencent.mm.plugin.messenger.a.g.bcT().dF(paramIntent, str);
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.i.transparent_background);
    this.fdx = getIntent().getIntExtra("scene", 0);
    this.ihD = getIntent().getLongExtra("searchID", 0L);
    this.cYO = getIntent().getStringExtra("Select_Conv_User");
    paramBundle = getIntent().getByteArrayExtra("extra_object");
    if (paramBundle != null) {}
    for (;;)
    {
      try
      {
        this.iqI = ((ta)this.iqI.aG(paramBundle));
        if (this.iqI != null)
        {
          this.iqJ = com.tencent.mm.plugin.emoji.model.i.aEA().igx.Zy(this.iqI.rwk);
          if ((this.iqJ != null) && (!bi.oW(this.iqJ.field_groupId)) && (bi.oW(this.iqI.rem))) {
            this.iqI.rem = this.iqJ.field_groupId;
          }
        }
        com.tencent.mm.sdk.b.a.sFg.b(this.iqT);
        com.tencent.mm.plugin.emoji.model.i.aEu().ihj = this.ihj;
        this.iqK = y.gq(this).inflate(R.i.emoji_store_v2_single_product_dialog, null);
        this.eWx = ((ProgressBar)this.iqK.findViewById(R.h.dialog_loading));
        this.iqL = ((MMAnimateView)this.iqK.findViewById(R.h.dialog_image));
        this.iqM = ((ImageView)this.iqK.findViewById(R.h.dialog_close));
        this.iqM.setOnClickListener(this.iqR);
        paramBundle = this.iqK;
        if ((!(this instanceof Activity)) || (!((Activity)this).isFinishing())) {
          break label543;
        }
        paramBundle = null;
        this.evj = paramBundle;
        this.evj.a(getString(R.l.app_send), false, this.iqP);
        this.evj.b(getString(R.l.app_added), false, this.iqQ);
        this.evj.setOnDismissListener(new EmojiStoreV2SingleProductDialogUI.7(this));
        this.iqN = this.evj.getButton(-1);
        this.iqN.setTextColor(getResources().getColor(R.e.green_text_color));
        this.iqO = this.evj.getButton(-2);
        au.HU();
        this.ben = EmojiLogic.L(com.tencent.mm.model.c.Gg(), this.iqI.rem, this.iqI.rwk);
        if (e.cm(this.ben) <= 0) {
          break;
        }
        this.iqL.setVisibility(0);
        this.eWx.setVisibility(8);
        this.iqJ = com.tencent.mm.plugin.emoji.model.i.aEA().igx.Zy(this.iqI.rwk);
        if ((this.iqJ == null) || ((this.iqJ.field_reserved4 & EmojiInfo.tcW) != EmojiInfo.tcW)) {
          break label588;
        }
        this.iqL.g(((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().a(this.iqJ), "");
        aGf();
        return;
      }
      catch (IOException paramBundle)
      {
        x.printErrStackTrace("MicroMsg.emoji.EmojiStoreV2SingleProductDialogUI", paramBundle, "", new Object[0]);
      }
      setResult(0);
      finish();
      continue;
      label543:
      localObject = new c.a(this);
      ((c.a)localObject).abt("");
      ((c.a)localObject).dR(paramBundle);
      ((c.a)localObject).mF(true);
      paramBundle = ((c.a)localObject).anj();
      paramBundle.show();
      h.a(this, paramBundle);
      continue;
      label588:
      this.iqL.setImageFilePath(this.ben);
    }
    this.iqL.setVisibility(8);
    this.eWx.setVisibility(0);
    this.iqO.setText(R.l.emoji_store_add_emoji);
    this.iqN.setText(R.l.app_send);
    this.iqO.setEnabled(false);
    this.iqO.setTextColor(getResources().getColor(R.e.grey_btn_color_disable));
    this.iqN.setEnabled(false);
    this.iqN.setTextColor(getResources().getColor(R.e.grey_btn_color_disable));
    paramBundle = com.tencent.mm.plugin.emoji.model.i.aDZ();
    Object localObject = this.iqI.jPK;
    String str = this.iqI.jPK;
    paramBundle.a((String)localObject, null, f.o(this.ben, new Object[] { this.iqI }), this.iqS);
  }
  
  protected void onDestroy()
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.iqT);
    com.tencent.mm.plugin.emoji.model.i.aEu().ihj = null;
    super.onDestroy();
  }
  
  protected void onResume()
  {
    super.onResume();
    aGf();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductDialogUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */