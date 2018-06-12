package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.chat.d;
import com.tencent.mm.pluginsdk.ui.chat.e;
import com.tencent.mm.pluginsdk.ui.chat.e.b;
import com.tencent.mm.protocal.c.arj;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.BasePanelKeybordLayout;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMEditText;
import java.util.ArrayList;
import java.util.List;

public class SnsSightUploadSayFooter
  extends BasePanelKeybordLayout
{
  MMActivity bGc;
  private ImageButton kXE;
  ChatFooterPanel kXH;
  private boolean kXK = true;
  private MMEditText obg = null;
  SightRangeWidget obh;
  SightLocationWidget obi;
  
  public SnsSightUploadSayFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.bGc = ((MMActivity)paramContext);
    paramContext = (ViewGroup)inflate(this.bGc, i.g.sns_sight_upload_say_footer, this);
    this.kXE = ((ImageButton)paramContext.findViewById(i.f.album_comment_mode_iv));
    this.kXE.setOnClickListener(new SnsSightUploadSayFooter.4(this));
    if (e.qMK == null) {
      this.kXH = new d(this.bGc);
    }
    for (;;)
    {
      this.obh = ((SightRangeWidget)paramContext.findViewById(i.f.range_widget));
      this.obh.nLD = null;
      this.obh.style = 1;
      this.obi = ((SightLocationWidget)paramContext.findViewById(i.f.location_widget));
      return;
      this.kXH = e.qMK.da(getContext());
      this.kXH.setEntranceScene(ChatFooterPanel.SCENE_SNS);
      this.kXH.setVisibility(8);
      ((LinearLayout)findViewById(i.f.root)).addView(this.kXH, -1, 0);
      this.kXH.un();
      this.kXH.aE(false);
      this.kXH.setOnTextOperationListener(new SnsSightUploadSayFooter.5(this));
    }
  }
  
  private void hideSmileyPanel()
  {
    this.kXH.onPause();
    this.kXH.setVisibility(8);
  }
  
  public arj getLocation()
  {
    return this.obi.getLocation();
  }
  
  protected List<View> getPanelView()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(this.kXH);
    return localArrayList;
  }
  
  public void setMMEditText(MMEditText paramMMEditText)
  {
    this.obg = paramMMEditText;
    paramMMEditText.setOnClickListener(new SnsSightUploadSayFooter.1(this));
    paramMMEditText.setOnEditorActionListener(new SnsSightUploadSayFooter.2(this));
    ah.i(new SnsSightUploadSayFooter.3(this), 200L);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsSightUploadSayFooter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */