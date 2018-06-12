package com.tencent.mm.plugin.chatroom.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils.TruncateAt;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.model.af;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.b;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.protocal.c.aud;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.s.b;
import com.tencent.mm.ui.tools.a.c.a;
import com.tencent.mm.ui.widget.MMEditText;

public class ModRemarkRoomNameUI
  extends MMActivity
  implements c.a
{
  private p eXe = null;
  private String fsV;
  private boolean hLL = false;
  private com.tencent.mm.sdk.b.c hLO = new ModRemarkRoomNameUI.1(this);
  private String hMT = "";
  private MMEditText hMU;
  private h.b hMV;
  
  public final void YX()
  {
    h.i(this, R.l.settings_modify_name_invalid_less, R.l.settings_modify_name_title);
  }
  
  public final void YY()
  {
    h.i(this, R.l.settings_modify_name_invalid_more, R.l.settings_modify_name_title);
  }
  
  protected final int getLayoutId()
  {
    return R.i.mod_roomname_and_describle;
  }
  
  protected final void initView()
  {
    setMMTitle(R.l.room_card);
    this.hMU = ((MMEditText)findViewById(R.h.modify_roomname_et));
    final Object localObject = bi.oV(getIntent().getStringExtra("room_name"));
    if (bi.oW((String)localObject))
    {
      af localaf = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.chatroom.b.b.class)).Ga();
      this.hMU.setHint(j.a(this, localaf.gT(this.fsV), this.hMU.getTextSize()));
      this.hMU.setEllipsize(TextUtils.TruncateAt.END);
    }
    for (;;)
    {
      this.hMU.setSelection(this.hMU.getText().length());
      this.hMU.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable) {}
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          if (!localObject.equals(paramAnonymousCharSequence)) {
            ModRemarkRoomNameUI.this.enableOptionMenu(true);
          }
          if (paramAnonymousCharSequence.length() > 0)
          {
            ModRemarkRoomNameUI.e(ModRemarkRoomNameUI.this).setEllipsize(null);
            return;
          }
          ModRemarkRoomNameUI.e(ModRemarkRoomNameUI.this).setEllipsize(TextUtils.TruncateAt.END);
        }
      });
      localObject = com.tencent.mm.ui.tools.a.c.d(this.hMU).fj(1, 32);
      ((com.tencent.mm.ui.tools.a.c)localObject).uCR = false;
      ((com.tencent.mm.ui.tools.a.c)localObject).a(null);
      setBackBtn(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          ModRemarkRoomNameUI.this.setResult(0);
          ModRemarkRoomNameUI.this.finish();
          return true;
        }
      });
      a(0, getString(R.l.app_save), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          ModRemarkRoomNameUI.this.YC();
          paramAnonymousMenuItem = com.tencent.mm.k.b.AD();
          if ((!bi.oW(paramAnonymousMenuItem)) && ("".matches(".*[" + paramAnonymousMenuItem + "].*")))
          {
            h.b(ModRemarkRoomNameUI.this.mController.tml, ModRemarkRoomNameUI.this.getString(R.l.invalid_input_character_toast, new Object[] { paramAnonymousMenuItem }), ModRemarkRoomNameUI.this.getString(R.l.app_tip), true);
            return false;
          }
          com.tencent.mm.ui.tools.a.c.d(ModRemarkRoomNameUI.e(ModRemarkRoomNameUI.this)).fj(1, 32).a(ModRemarkRoomNameUI.this);
          return true;
        }
      }, s.b.tmX);
      enableOptionMenu(false);
      return;
      this.hMU.setText(j.a(this, (CharSequence)localObject, this.hMU.getTextSize()));
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.fsV = getIntent().getStringExtra("RoomInfo_Id");
    com.tencent.mm.sdk.b.a.sFg.b(this.hLO);
    initView();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    com.tencent.mm.sdk.b.a.sFg.c(this.hLO);
  }
  
  protected void onPause()
  {
    super.onPause();
  }
  
  public final void pO(String paramString)
  {
    this.hMT = paramString;
    Object localObject = this.mController.tml;
    getString(R.l.app_tip);
    this.eXe = h.a((Context)localObject, getString(R.l.contact_info_change_remarkimage_save), false, null);
    localObject = new aud();
    ((aud)localObject).rbR = new bhz().VO(bi.oV(this.fsV));
    ((aud)localObject).rXc = new bhz().VO(bi.oV(paramString));
    this.hMV = new h.a(27, (com.tencent.mm.bk.a)localObject);
    this.hLL = true;
    au.HU();
    com.tencent.mm.model.c.FQ().b(this.hMV);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/chatroom/ui/ModRemarkRoomNameUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */