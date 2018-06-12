package com.tencent.mm.plugin.sight.draft.ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.ui.MMActivity;
import java.util.LinkedList;

public class SightDraftUI
  extends MMActivity
{
  private int neX = 1;
  SightDraftContainerView neY;
  private LinkedList<String> neZ = new LinkedList();
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(R.l.sight_old_draft_title);
    getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.e.black));
    this.neY = new SightDraftContainerView(this);
    setContentView(this.neY);
    this.neY.bwf();
    setBackBtn(new SightDraftUI.1(this));
    this.neY.setSightDraftCallback(new SightDraftUI.2(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sight/draft/ui/SightDraftUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */