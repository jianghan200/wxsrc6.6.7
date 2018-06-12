package com.tencent.mm.plugin.account.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.al.b;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceCategory;
import com.tencent.mm.ui.base.preference.f;

public class RegByMobileVoiceVerifySelectUI
  extends MMPreference
  implements e
{
  private f eOE;
  private LanguagePreference.a[] eVJ;
  private String eVK;
  
  private static LanguagePreference.a[] Zc()
  {
    String[] arrayOfString1 = ad.getContext().getString(a.j.bind_mcontact_voice_verify_Languages).trim().split(",");
    LanguagePreference.a[] arrayOfa = new LanguagePreference.a[arrayOfString1.length];
    int i = 0;
    while (i < arrayOfString1.length)
    {
      String[] arrayOfString2 = arrayOfString1[i].trim().split(":");
      arrayOfa[i] = new LanguagePreference.a(arrayOfString2[1], arrayOfString2[2], arrayOfString2[0], false);
      i += 1;
    }
    return arrayOfa;
  }
  
  public static String pR(String paramString)
  {
    LanguagePreference.a[] arrayOfa = Zc();
    paramString = b.mk(paramString);
    int j = arrayOfa.length;
    int i = 0;
    while (i < j)
    {
      LanguagePreference.a locala = arrayOfa[i];
      if (locala.eQJ.equalsIgnoreCase(paramString)) {
        return locala.eQH;
      }
      i += 1;
    }
    return "English";
  }
  
  public final int Ys()
  {
    return a.g.bindmcontact_voice_select_language;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml) {}
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    if ((paramPreference instanceof LanguagePreference))
    {
      paramf = ((LanguagePreference)paramPreference).eQG;
      if (paramf != null) {}
    }
    else
    {
      return false;
    }
    paramPreference = new Intent();
    Bundle localBundle = new Bundle();
    localBundle.putString("voice_verify_language", paramf.eQH);
    localBundle.putString("voice_verify_code", paramf.eQJ);
    paramPreference.putExtras(localBundle);
    setResult(0, paramPreference);
    finish();
    return true;
  }
  
  protected final void initView()
  {
    YC();
    this.eVK = getIntent().getExtras().getString("voice_verify_code");
    setMMTitle(a.j.bind_mcontact_voice_verify_select_title);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        RegByMobileVoiceVerifySelectUI.this.YC();
        RegByMobileVoiceVerifySelectUI.this.finish();
        return true;
      }
    });
    this.eVJ = Zc();
    if ((this.eVJ == null) || (this.eVJ.length <= 0)) {}
    for (;;)
    {
      return;
      this.eOE.removeAll();
      Object localObject = new PreferenceCategory(this);
      this.eOE.a((Preference)localObject);
      localObject = this.eVJ;
      int j = localObject.length;
      int i = 0;
      while (i < j)
      {
        LanguagePreference.a locala = localObject[i];
        if (locala.eQJ.equalsIgnoreCase(this.eVK)) {
          locala.eQK = true;
        }
        LanguagePreference localLanguagePreference = new LanguagePreference(this);
        localLanguagePreference.a(locala);
        localLanguagePreference.setKey(locala.eQJ);
        this.eOE.a(localLanguagePreference);
        i += 1;
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.eOE = this.tCL;
    initView();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/account/ui/RegByMobileVoiceVerifySelectUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */