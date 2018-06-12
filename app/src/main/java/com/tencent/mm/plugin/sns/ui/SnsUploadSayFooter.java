package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.chat.d;
import com.tencent.mm.pluginsdk.ui.chat.e;
import com.tencent.mm.pluginsdk.ui.chat.e.b;
import com.tencent.mm.sdk.platformtools.t;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.BasePanelKeybordLayout;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.ui.y;
import java.util.ArrayList;
import java.util.List;

public class SnsUploadSayFooter
  extends BasePanelKeybordLayout
{
  private MMActivity bGc;
  private ImageButton kXE;
  ChatFooterPanel kXH;
  private boolean kXK = true;
  private boolean nVC = false;
  private boolean nVD = false;
  private int nVE = -1;
  private int nVF = -1;
  private boolean nVG = t.fC(getContext());
  private MMEditText obg = null;
  
  public SnsUploadSayFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.bGc = ((MMActivity)paramContext);
    this.kXE = ((ImageButton)((ViewGroup)y.gq(this.bGc).inflate(i.g.sns_upload_say_footer, this)).findViewById(i.f.album_comment_mode_iv));
    this.kXE.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        SnsUploadSayFooter.b(SnsUploadSayFooter.this);
      }
    });
    if (e.qMK == null)
    {
      this.kXH = new d(this.bGc);
      return;
    }
    this.kXH = e.qMK.da(getContext());
    this.kXH.setEntranceScene(ChatFooterPanel.SCENE_SNS);
    this.kXH.setVisibility(8);
    paramContext = (LinearLayout)findViewById(i.f.root);
    paramContext.setOnClickListener(null);
    paramContext.addView(this.kXH, -1, 0);
    this.kXH.un();
    this.kXH.aE(false);
    this.kXH.setOnTextOperationListener(new SnsUploadSayFooter.4(this));
  }
  
  private void hideSmileyPanel()
  {
    this.kXH.onPause();
    this.kXH.setVisibility(8);
  }
  
  public final void bEv()
  {
    setVisibility(0);
    if (this.kXE != null) {
      this.kXE.setImageResource(i.e.sns_upload_biaoqing_btn);
    }
  }
  
  public final boolean bEw()
  {
    return this.kXH.getVisibility() == 0;
  }
  
  public final void bEx()
  {
    hideSmileyPanel();
    setVisibility(8);
  }
  
  protected List<View> getPanelView()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(this.kXH);
    return localArrayList;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.nVD) || (this.nVC)) {
      x.i("MicroMsg.SnsUploadSayFooter", "onLayout maxBottom %d currBottom %d layoutBottom %d", new Object[] { Integer.valueOf(this.nVE), Integer.valueOf(this.nVF), Integer.valueOf(paramInt4) });
    }
    if ((this.nVD) && (this.kXH != null) && (this.nVF != paramInt4))
    {
      this.kXH.setVisibility(0);
      this.nVD = false;
    }
    if (this.nVE < paramInt4) {}
    for (paramInt1 = paramInt4;; paramInt1 = this.nVE)
    {
      this.nVE = paramInt1;
      this.nVF = paramInt4;
      if ((t.fC(getContext()) != this.nVG) || (this.kXK))
      {
        this.kXH.setPortHeightPx(t.fA(getContext()));
        this.kXH.refresh();
        this.nVG = t.fC(getContext());
        ViewGroup.LayoutParams localLayoutParams = this.kXH.getLayoutParams();
        if (localLayoutParams != null)
        {
          localLayoutParams.height = j.fA(getContext());
          this.kXH.setLayoutParams(localLayoutParams);
        }
        this.kXK = false;
      }
      return;
    }
  }
  
  public void setMMEditText(MMEditText paramMMEditText)
  {
    this.obg = paramMMEditText;
    paramMMEditText.setOnClickListener(new SnsUploadSayFooter.1(this));
    paramMMEditText.setOnEditorActionListener(new SnsUploadSayFooter.2(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsUploadSayFooter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */