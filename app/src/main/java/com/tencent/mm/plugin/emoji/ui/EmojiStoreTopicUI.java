package com.tencent.mm.plugin.emoji.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import com.tencent.mm.R.k;
import com.tencent.mm.ab.l;
import com.tencent.mm.ak.o;
import com.tencent.mm.plugin.emoji.e.k;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.emoji.StoreBannerEmojiView;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;

public class EmojiStoreTopicUI
  extends BaseEmojiStoreUI
{
  private int fdx;
  private int inD;
  private String inE;
  private String inF;
  private String inG;
  private String inH;
  private String inI;
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    super.a(paramInt1, paramInt2, paramString, paraml);
    if (this.ikh)
    {
      showOptionMenu(0, false);
      return;
    }
    showOptionMenu(0, true);
  }
  
  protected final void a(com.tencent.mm.plugin.emoji.model.f paramf, boolean paramBoolean1, boolean paramBoolean2)
  {
    super.a(paramf, paramBoolean1, paramBoolean2);
  }
  
  protected final void a(boolean paramBoolean1, com.tencent.mm.plugin.emoji.model.f paramf, boolean paramBoolean2, boolean paramBoolean3)
  {
    super.a(paramBoolean1, paramf, paramBoolean2, paramBoolean3);
  }
  
  protected final void aFc()
  {
    super.aFc();
  }
  
  protected final int aFd()
  {
    return 11;
  }
  
  protected final int aFe()
  {
    return 14;
  }
  
  protected final com.tencent.mm.plugin.emoji.a.a.a aFf()
  {
    return new com.tencent.mm.plugin.emoji.a.f(this.mController.tml);
  }
  
  protected final boolean aFj()
  {
    return false;
  }
  
  protected final boolean aFk()
  {
    return !bi.oW(this.inH);
  }
  
  protected final int aFm()
  {
    return 7;
  }
  
  public final int aFn()
  {
    return this.inD;
  }
  
  protected final boolean aFt()
  {
    return false;
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final void initView()
  {
    this.inD = getIntent().getIntExtra("topic_id", -1);
    this.inE = getIntent().getStringExtra("topic_name");
    this.inH = getIntent().getStringExtra("topic_ad_url");
    this.inF = getIntent().getStringExtra("topic_icon_url");
    this.inG = getIntent().getStringExtra("topic_desc");
    this.inI = getIntent().getStringExtra("sns_object_data");
    this.fdx = getIntent().getIntExtra("extra_scence", 0);
    if (!bi.oW(this.inI))
    {
      this.inD = EmojiLogic.zw(this.inI);
      this.inE = EmojiLogic.zx(this.inI);
      this.inF = EmojiLogic.zz(this.inI);
      this.inG = EmojiLogic.zy(this.inI);
      this.inH = EmojiLogic.zA(this.inI);
    }
    setMMTitle(this.inE);
    super.initView();
    addIconOptionMenu(0, R.k.ofm_send_icon, new EmojiStoreTopicUI.1(this));
    showOptionMenu(0, false);
    zJ(this.inH);
  }
  
  public final void l(Message paramMessage)
  {
    super.l(paramMessage);
    if (paramMessage.what == 1009) {
      zJ(this.inH);
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    aFs();
    if ((paramInt1 == 2002) && (paramInt2 == -1))
    {
      String str1 = paramIntent.getStringExtra("Select_Conv_User");
      if (!bi.oW(str1))
      {
        x.d("MicroMsg.emoji.EmojiStoreTopicUI", ".." + str1);
        int i = this.inD;
        String str2 = this.inE;
        String str3 = this.inG;
        String str4 = this.inF;
        String str5 = this.inH;
        i.aEw();
        k.a(this, str1, 26, i, str2, str3, str4, str5, 0, "https://support.weixin.qq.com/cgi-bin/readtemplate?t=page/common_page__upgrade&text=text000&btn_text=btn_text_0&title=title_0");
      }
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    h.mEJ.h(12740, new Object[] { Integer.valueOf(3), "", "", Integer.valueOf(this.inD), Integer.valueOf(this.fdx) });
  }
  
  protected void onResume()
  {
    super.onResume();
  }
  
  protected final void zJ(String paramString)
  {
    EmojiInfo localEmojiInfo;
    if ((this.ikd != null) && (this.ike != null) && (!bi.oW(paramString)))
    {
      com.tencent.mm.bp.a.getDensity(this);
      localEmojiInfo = EmojiLogic.a("Toptic", 8, paramString, true);
      if (localEmojiInfo == null) {
        o.Pj().a(paramString, null, com.tencent.mm.plugin.emoji.e.f.g("Toptic", paramString, new Object[] { "Toptic", "BANNER" }), new EmojiStoreTopicUI.2(this));
      }
    }
    else
    {
      return;
    }
    this.ike.setImageFilePath(localEmojiInfo.cnF());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/emoji/ui/EmojiStoreTopicUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */