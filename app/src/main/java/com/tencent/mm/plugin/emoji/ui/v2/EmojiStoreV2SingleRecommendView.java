package com.tencent.mm.plugin.emoji.ui.v2;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.emoji.e.f;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.f.g;
import com.tencent.mm.plugin.emoji.model.h.b;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel.RecommendView;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.ui.y;

public class EmojiStoreV2SingleRecommendView
  extends ChatFooterPanel.RecommendView
  implements View.OnClickListener, h.b
{
  private ViewGroup goL;
  private String iil;
  private g ijT;
  protected final int ikp = 131074;
  private final int ikq = 131075;
  private final int ikr = 131076;
  private final String iks = "product_id";
  private final String ikt = "progress";
  private final String iku = "status";
  private ImageView imM;
  private String inf;
  private ag ioW = new EmojiStoreV2SingleRecommendView.1(this);
  private TextView irA;
  private TextView irB;
  private Button irC;
  private ProgressBar irD;
  private EmojiGroupInfo irE;
  private boolean irF = true;
  private c irG = new EmojiStoreV2SingleRecommendView.2(this);
  private ImageView irz;
  
  public EmojiStoreV2SingleRecommendView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  @TargetApi(11)
  public EmojiStoreV2SingleRecommendView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  public EmojiStoreV2SingleRecommendView(Context paramContext, boolean paramBoolean)
  {
    super(paramContext);
    this.irF = paramBoolean;
    init();
  }
  
  private void c(ts paramts)
  {
    Intent localIntent = new Intent();
    localIntent.setClass(getContext(), EmojiStoreDetailUI.class);
    localIntent.putExtra("extra_id", paramts.rem);
    localIntent.putExtra("extra_name", paramts.rwQ);
    localIntent.putExtra("extra_copyright", paramts.rxa);
    localIntent.putExtra("extra_coverurl", paramts.rwY);
    localIntent.putExtra("extra_description", paramts.rwR);
    localIntent.putExtra("extra_price", paramts.rwT);
    localIntent.putExtra("extra_type", paramts.rwU);
    localIntent.putExtra("extra_flag", paramts.rwV);
    localIntent.putExtra("extra_price_num", paramts.rxb);
    localIntent.putExtra("extra_price_type", paramts.rxc);
    localIntent.putExtra("preceding_scence", 108);
    localIntent.putExtra("call_by", 1);
    localIntent.putExtra("download_entrance_scene", 8);
    localIntent.putExtra("check_clickflag", false);
    getContext().startActivity(localIntent);
  }
  
  private void init()
  {
    if (this.irF) {}
    for (this.goL = ((ViewGroup)y.gq(getContext()).inflate(R.i.emoji_store_v2_single_recommend, this));; this.goL = ((ViewGroup)y.gq(getContext()).inflate(R.i.emoji_store_v2_single_recommend_land, this)))
    {
      this.imM = ((ImageView)this.goL.findViewById(R.h.emoji_close));
      this.irz = ((ImageView)this.goL.findViewById(R.h.emoji_icon));
      this.irA = ((TextView)this.goL.findViewById(R.h.emoji_title));
      this.irB = ((TextView)this.goL.findViewById(R.h.emoji_word));
      this.irC = ((Button)this.goL.findViewById(R.h.emoji_download));
      this.irD = ((ProgressBar)this.goL.findViewById(R.h.emoji_download_progress));
      return;
    }
  }
  
  private void setTitleName(EmojiGroupInfo paramEmojiGroupInfo)
  {
    if (this.irC != null) {
      switch (paramEmojiGroupInfo.field_buttonType)
      {
      default: 
        this.irC.setVisibility(8);
      }
    }
    for (;;)
    {
      if (!bi.oW(paramEmojiGroupInfo.field_packName)) {
        this.irA.setText(paramEmojiGroupInfo.field_packName);
      }
      if (this.irB != null)
      {
        if (bi.oW(paramEmojiGroupInfo.field_recommandWord)) {
          break;
        }
        this.irB.setVisibility(0);
        this.irB.setText(paramEmojiGroupInfo.field_recommandWord);
      }
      return;
      this.irC.setVisibility(0);
      this.irC.setText(R.l.emoji_store_download);
      continue;
      this.irC.setVisibility(0);
      this.irC.setText(R.l.menu_show_emoji_detail);
    }
    this.irB.setVisibility(8);
  }
  
  public final void M(String paramString1, String paramString2, String paramString3)
  {
    paramString1 = new g(paramString1, paramString2, paramString3);
    au.DF().a(paramString1, 0);
  }
  
  public final void aEs() {}
  
  public final void m(Message paramMessage)
  {
    if (this.ioW != null) {
      this.ioW.sendMessage(paramMessage);
    }
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    x.d("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "onAttachedToWindow");
    com.tencent.mm.sdk.b.a.sFg.b(this.irG);
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.imM)
    {
      i.aEA().igy.Zu(this.iil);
      h.mEJ.h(12068, new Object[] { Integer.valueOf(2), this.iil, Integer.valueOf(this.irE.field_recommandType) });
      return;
    }
    if (paramView == this.goL)
    {
      c(this.irE.cnc());
      h.mEJ.h(12068, new Object[] { Integer.valueOf(4), this.iil, Integer.valueOf(this.irE.field_recommandType) });
      return;
    }
    if (paramView == this.irC)
    {
      if (this.irE.field_buttonType == 1)
      {
        this.ijT = new g(this.iil);
        au.DF().a(this.ijT, 0);
        h.mEJ.h(12068, new Object[] { Integer.valueOf(3), this.iil, Integer.valueOf(this.irE.field_recommandType) });
        h.mEJ.h(12066, new Object[] { Integer.valueOf(0), Integer.valueOf(8), "", this.iil });
        return;
      }
      if (this.irE.field_buttonType == 2)
      {
        c(this.irE.cnc());
        h.mEJ.h(12068, new Object[] { Integer.valueOf(4), this.iil, Integer.valueOf(this.irE.field_recommandType) });
        return;
      }
      x.i("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "unknown buttonType do nothing.");
      return;
    }
    x.d("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "do nothing");
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    x.d("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "onDetachedFromWindow");
    com.tencent.mm.sdk.b.a.sFg.c(this.irG);
  }
  
  public void setProductID(String paramString)
  {
    this.iil = paramString;
    if (bi.oW(this.iil))
    {
      this.goL.setVisibility(8);
      return;
    }
    this.irE = i.aEA().igy.br(this.iil, false);
    this.imM.setOnClickListener(this);
    this.irC.setOnClickListener(this);
    this.goL.setOnClickListener(this);
    setTitleName(this.irE);
    this.irD.setVisibility(8);
    com.tencent.mm.ak.o.Pj().a(this.irE.field_BigIconUrl, this.irz, f.g(this.iil, this.irE.field_BigIconUrl, new Object[0]));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleRecommendView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */