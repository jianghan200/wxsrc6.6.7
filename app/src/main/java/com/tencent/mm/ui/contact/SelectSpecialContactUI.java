package com.tencent.mm.ui.contact;

import android.content.Intent;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.contact.a.a;

public class SelectSpecialContactUI
  extends MMBaseSelectContactUI
{
  private int hOX;
  private String title;
  
  protected final void Wj()
  {
    super.Wj();
    this.title = getIntent().getStringExtra("titile");
    this.hOX = getIntent().getIntExtra("list_attr", 0);
  }
  
  protected final boolean Wk()
  {
    return false;
  }
  
  protected final boolean Wl()
  {
    return false;
  }
  
  protected final String Wm()
  {
    return this.title;
  }
  
  protected final o Wn()
  {
    return new z(this, getIntent().getStringExtra("filter_type"));
  }
  
  protected final m Wo()
  {
    return null;
  }
  
  public final void iV(int paramInt)
  {
    Object localObject = cyp().FM(paramInt);
    if (localObject == null) {}
    while (((a)localObject).guS == null) {
      return;
    }
    localObject = ((a)localObject).guS.field_username;
    x.i("MicroMsg.SelectSpecialContactUI", "ClickUser=%s", new Object[] { localObject });
    Intent localIntent = new Intent();
    if (s.fb(this.hOX, 16384))
    {
      localIntent.putExtra("Select_Contact", (String)localObject);
      setResult(-1, localIntent);
      finish();
      return;
    }
    if (s.fb(this.hOX, 32768))
    {
      localIntent.putExtra("Contact_User", (String)localObject);
      d.b(this, "profile", ".ui.ContactInfoUI", localIntent);
      finish();
      return;
    }
    localIntent.setClass(this, ChattingUI.class);
    localIntent.putExtra("Chat_User", (String)localObject);
    localIntent.putExtra("finish_direct", true);
    startActivity(localIntent);
    finish();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/contact/SelectSpecialContactUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */