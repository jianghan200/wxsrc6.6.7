package com.tencent.mm.plugin.fav.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.l;
import com.tencent.mm.plugin.fav.ui.a.c;
import com.tencent.mm.plugin.fav.ui.a.d;
import com.tencent.mm.plugin.fav.ui.widget.FavTagPanel;
import com.tencent.mm.protocal.c.wy;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMTagPanel.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.s.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class FavTagEditUI
  extends MMActivity
{
  private com.tencent.mm.plugin.fav.a.g jaq;
  private List<String> jar;
  private FavTagPanel jas;
  private FavTagPanel jat;
  private ListView jau;
  private ListView jav;
  private TextView jaw;
  private c jax;
  private d jay;
  private boolean jaz;
  
  public static void a(com.tencent.mm.plugin.fav.a.g paramg, Collection<String> paramCollection, int paramInt)
  {
    if (paramg == null) {
      return;
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FavTagEditUI", "mod tags %s", new Object[] { paramCollection });
    HashSet localHashSet = new HashSet();
    localHashSet.addAll(paramg.field_tagProto.rBX);
    paramg.field_tagProto.rBX.clear();
    if ((paramCollection == null) || (paramCollection.isEmpty())) {}
    for (;;)
    {
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().a(paramg, new String[] { "localId" });
      b.p(paramg);
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavTagSetMgr().f(localHashSet);
      b.a(paramg, paramInt);
      return;
      paramg.field_tagProto.rBX.addAll(paramCollection);
      localHashSet.removeAll(paramCollection);
    }
  }
  
  private void aMt()
  {
    if (this.jaz)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavTagEditUI", "match max length, disable finish button");
      if (cqd()) {
        enableOptionMenu(0, false);
      }
    }
    label86:
    label211:
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            if (this.jaq != null) {
              break label86;
            }
            if ((this.jat.getTagCount() > 0) || (this.jat.getEditText().length() > 0)) {
              break;
            }
          } while (!cqd());
          enableOptionMenu(0, false);
          return;
        } while (cqd());
        enableOptionMenu(0, true);
        return;
        if ((this.jaq.field_tagProto.rBX.size() == this.jat.getTagCount()) && (this.jat.getEditText().length() <= 0)) {
          break;
        }
      } while (cqd());
      enableOptionMenu(0, true);
      return;
      ArrayList localArrayList = this.jat.getTagList();
      int i = 0;
      for (;;)
      {
        if (i >= localArrayList.size()) {
          break label211;
        }
        if (!((String)localArrayList.get(i)).equals(this.jaq.field_tagProto.rBX.get(i)))
        {
          if (cqd()) {
            break;
          }
          enableOptionMenu(0, true);
          return;
        }
        i += 1;
      }
    } while (!cqd());
    enableOptionMenu(0, false);
  }
  
  private void aMu()
  {
    h.a(this.mController.tml, getString(m.i.favorite_quit_edit_tag_tips), "", getString(m.i.app_alert_exit), getString(m.i.app_cancel), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        FavTagEditUI.this.finish();
      }
    }, null);
  }
  
  protected final int getLayoutId()
  {
    return m.f.fav_tag_edit_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    long l = getIntent().getLongExtra("key_fav_item_id", -1L);
    if (-1L != l) {
      this.jaq = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(l);
    }
    this.jar = getIntent().getStringArrayListExtra("key_fav_result_list");
    this.jat = ((FavTagPanel)findViewById(m.e.fav_tag_input_panel));
    this.jau = ((ListView)findViewById(m.e.tag_panel_list));
    this.jav = ((ListView)findViewById(m.e.search_tag_list));
    this.jaw = ((TextView)findViewById(m.e.max_size_tips_tv));
    this.jat.lL(true);
    this.jat.setTagEditTextBG(m.d.tag_edittext_gb);
    this.jat.setIsAllowEnterCharacter(true);
    this.jat.setCallBack(new FavTagEditUI.5(this));
    this.jat.postDelayed(new Runnable()
    {
      public final void run()
      {
        FavTagEditUI.d(FavTagEditUI.this).crO();
        FavTagEditUI.this.showVKB();
      }
    }, 100L);
    Object localObject;
    if (this.jaq != null)
    {
      this.jat.a(this.jaq.field_tagProto.rBX, this.jaq.field_tagProto.rBX);
      this.jax = new FavTagEditUI.7(this, this.mController.tml);
      localObject = this.jax;
      if (this.jaq != null) {
        break label632;
      }
    }
    label632:
    for (paramBundle = null;; paramBundle = this.jaq.field_tagProto.rBX)
    {
      ((c)localObject).bf(paramBundle);
      if ((this.jaq != null) && (!this.jaq.field_tagProto.rBW.isEmpty()))
      {
        paramBundle = View.inflate(this.mController.tml, m.f.fav_tag_panel_item, null);
        localObject = (TextView)paramBundle.findViewById(m.e.fav_panel_catalog);
        ((TextView)localObject).setText(getString(m.i.favorite_recommended_tag));
        ((TextView)localObject).setVisibility(0);
        int i = getResources().getDimensionPixelSize(m.c.FavTagPadding);
        this.jas = ((FavTagPanel)paramBundle.findViewById(m.e.fav_tag_panel));
        this.jas.setVisibility(0);
        this.jas.a(this.jaq.field_tagProto.rBX, this.jaq.field_tagProto.rBW);
        this.jas.setBackgroundResource(m.d.list_thicklinecell_bg);
        this.jas.setPadding(0, 0, 0, i);
        this.jas.setCallBack(new MMTagPanel.a()
        {
          public final void aGt() {}
          
          public final void i(boolean paramAnonymousBoolean, int paramAnonymousInt) {}
          
          public final void zO(String paramAnonymousString)
          {
            FavTagEditUI.d(FavTagEditUI.this).removeTag(paramAnonymousString);
            FavTagEditUI.f(FavTagEditUI.this).BF(paramAnonymousString);
            FavTagEditUI.c(FavTagEditUI.this);
          }
          
          public final void zP(String paramAnonymousString)
          {
            FavTagEditUI.d(FavTagEditUI.this).bu(paramAnonymousString, true);
            FavTagEditUI.f(FavTagEditUI.this).BE(paramAnonymousString);
            FavTagEditUI.c(FavTagEditUI.this);
          }
          
          public final void zQ(String paramAnonymousString) {}
          
          public final void zR(String paramAnonymousString) {}
          
          public final void zS(String paramAnonymousString) {}
        });
        this.jau.addHeaderView(paramBundle);
      }
      if (((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavTagSetMgr().aLn() > 0) {
        this.jau.addHeaderView(View.inflate(this.mController.tml, m.f.fav_tag_panel_headerview, null));
      }
      this.jau.setAdapter(this.jax);
      this.jau.setOnTouchListener(new FavTagEditUI.9(this));
      this.jay = new FavTagEditUI.10(this, this.mController.tml);
      this.jav.setAdapter(this.jay);
      this.jav.setOnTouchListener(new FavTagEditUI.2(this));
      setMMTitle(m.i.favorite_edit_tag_tips);
      setBackBtn(new FavTagEditUI.1(this));
      a(0, getString(m.i.app_finish), new FavTagEditUI.3(this, l), s.b.tmX);
      aMt();
      ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavTagSetMgr().a(this.jax);
      return;
      if (this.jar == null) {
        break;
      }
      this.jat.a(this.jar, this.jar);
      break;
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    l locall = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavTagSetMgr();
    c localc = this.jax;
    if (localc == null) {
      return;
    }
    locall.dRX.remove(localc.toString());
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      aMu();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/FavTagEditUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */