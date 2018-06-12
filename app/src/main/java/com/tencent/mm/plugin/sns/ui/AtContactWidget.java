package com.tencent.mm.plugin.sns.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.y;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AtContactWidget
  extends LinearLayout
{
  private View contentView;
  private Activity ftd;
  private TextView nLA;
  private TextView nLB;
  private PreviewContactView nLC;
  SnsUploadConfigView nLD;
  private List<String> nLE = new LinkedList();
  private boolean nLF = false;
  private ImageView nLz;
  
  public AtContactWidget(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  @TargetApi(11)
  public AtContactWidget(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private void bBO()
  {
    if (this.nLE.size() > 0)
    {
      this.nLz.setImageResource(getWithDrawableId());
      return;
    }
    this.nLz.setImageResource(getWithEmptyDrawableId());
  }
  
  private void init(Context paramContext)
  {
    this.ftd = ((Activity)paramContext);
    this.contentView = y.gq(paramContext).inflate(getLayoutResource(), this);
    this.nLC = ((PreviewContactView)this.contentView.findViewById(i.f.at_contact_avatar));
    this.nLz = ((ImageView)this.contentView.findViewById(i.f.at_contact_iv));
    this.nLA = ((TextView)this.contentView.findViewById(i.f.at_contact_num));
    this.nLB = ((TextView)this.contentView.findViewById(i.f.at_contact_tips));
    this.contentView.setOnClickListener(new AtContactWidget.1(this));
    this.contentView.post(new AtContactWidget.2(this));
  }
  
  public final boolean Y(Intent paramIntent)
  {
    paramIntent = paramIntent.getStringExtra("Select_Contact");
    new LinkedList();
    if ((paramIntent == null) || (paramIntent.equals(""))) {}
    Object localObject1;
    Object localObject2;
    for (paramIntent = new LinkedList();; paramIntent = bi.F(paramIntent.split(",")))
    {
      if (this.nLE == null) {
        this.nLE = new LinkedList();
      }
      this.nLE.clear();
      localObject1 = paramIntent.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        if (!this.nLE.contains(localObject2)) {
          this.nLE.add(localObject2);
        }
      }
    }
    if (this.nLC != null) {
      this.nLC.setList(this.nLE);
    }
    int i;
    if (this.nLB != null)
    {
      localObject1 = this.nLB;
      localObject2 = getResources();
      if (paramIntent.isEmpty())
      {
        i = i.c.normal_text_color;
        ((TextView)localObject1).setTextColor(((Resources)localObject2).getColor(i));
      }
    }
    else if (this.nLF)
    {
      x.d("MicroMsg.AtContactWiget", "withList count " + this.nLE.size());
      if ((!this.nLF) || (this.nLA == null) || (this.nLE.size() <= 0)) {
        break label332;
      }
      this.nLA.setVisibility(0);
      if (this.nLE.size() >= 100) {
        break label319;
      }
      this.nLA.setText(this.nLE.size());
    }
    for (;;)
    {
      bBO();
      return true;
      i = i.c.green_text_color;
      break;
      label319:
      this.nLA.setText(i.j.unread_count_overt_100);
      continue;
      label332:
      this.nLA.setVisibility(8);
    }
  }
  
  public final void bBN()
  {
    if (this.nLE == null) {
      this.nLE = new LinkedList();
    }
    this.nLE.clear();
    if (this.nLC != null) {
      this.nLC.setList(this.nLE);
    }
    bBO();
    if (this.nLA != null) {
      this.nLA.setVisibility(8);
    }
    if (this.nLB != null) {
      this.nLB.setTextColor(getResources().getColor(i.c.normal_text_color));
    }
  }
  
  public List<String> getAtList()
  {
    if (this.nLE == null) {
      this.nLE = new LinkedList();
    }
    return this.nLE;
  }
  
  protected int getLayoutResource()
  {
    return i.g.at_contact_widget;
  }
  
  protected int getWithDrawableId()
  {
    return i.i.album_mention_icon_pressed;
  }
  
  protected int getWithEmptyDrawableId()
  {
    return i.i.album_mention_icon_normal;
  }
  
  public void setShowAtList(boolean paramBoolean)
  {
    PreviewContactView localPreviewContactView;
    if (this.nLC != null)
    {
      localPreviewContactView = this.nLC;
      if (!paramBoolean) {
        break label24;
      }
    }
    label24:
    for (int i = 0;; i = 8)
    {
      localPreviewContactView.setVisibility(i);
      return;
    }
  }
  
  public void setShowAtNum(boolean paramBoolean)
  {
    this.nLF = paramBoolean;
  }
  
  public void setShowAtTips(boolean paramBoolean)
  {
    TextView localTextView;
    if ((this.contentView != null) && (this.nLB != null))
    {
      localTextView = this.nLB;
      if (!paramBoolean) {
        break label31;
      }
    }
    label31:
    for (int i = 0;; i = 8)
    {
      localTextView.setVisibility(i);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/AtContactWidget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */