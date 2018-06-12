package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.mm.bg.d;
import com.tencent.mm.pluginsdk.ui.d.c;
import com.tencent.mm.pluginsdk.ui.d.c.a;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.s;
import java.util.HashMap;
import java.util.Map;

@a(7)
public class SnsTransparentUI
  extends MMActivity
{
  private Map<String, Bitmap> nEi = new HashMap();
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    Object localObject = getIntent();
    if (localObject != null) {}
    switch (((Intent)localObject).getIntExtra("op", -1))
    {
    case 3: 
    default: 
      return;
    case 2: 
      paramBundle = ((Intent)localObject).getStringExtra("adlandingXml");
      String str1 = ((Intent)localObject).getStringExtra("shareTitle");
      String str2 = ((Intent)localObject).getStringExtra("shareThumbUrl");
      String str3 = ((Intent)localObject).getStringExtra("shareDesc");
      String str4 = ((Intent)localObject).getStringExtra("shareUrl");
      localObject = ((Intent)localObject).getStringExtra("statExtStr");
      x.i("SnsTransparentUI", "doTransimt snsAdNativeLadingPagesUI");
      Intent localIntent = new Intent();
      localIntent.putExtra("Select_Conv_Type", 259);
      localIntent.putExtra("select_is_ret", true);
      d.a(this, ".ui.transmit.SelectConversationUI", localIntent, 0, new SnsTransparentUI.1(this, paramBundle, str1, str2, str3, str4, (String)localObject));
      return;
    }
    paramBundle = ((Intent)localObject).getStringExtra("phoneNum");
    c.a.qPG.a(this, paramBundle, new SnsTransparentUI.2(this), new Bundle());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsTransparentUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */