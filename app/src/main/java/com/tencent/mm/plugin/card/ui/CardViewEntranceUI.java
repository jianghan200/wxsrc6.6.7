package com.tencent.mm.plugin.card.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.mm.plugin.card.a.e;
import com.tencent.mm.plugin.card.d.k;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import java.util.LinkedList;

@a(3)
public class CardViewEntranceUI
  extends MMActivity
{
  protected final int getLayoutId()
  {
    return a.e.card_add_entrance_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    if (paramBundle == null)
    {
      x.e("MicroMsg.CardViewEntranceUI", "CardViewEntranceUI onCreate() intent == null");
      setResult(0, paramBundle);
      finish();
      return;
    }
    int i = paramBundle.getIntExtra("key_from_scene", 50);
    x.i("MicroMsg.CardViewEntranceUI", "CardViewEntranceUI doRediect() handle data");
    String str = paramBundle.getStringExtra("card_list");
    if (TextUtils.isEmpty(str))
    {
      x.e("MicroMsg.CardViewEntranceUI", "CardViewEntranceUI oncreate card_list is empty");
      setResult(0, paramBundle);
      finish();
      return;
    }
    LinkedList localLinkedList = k.bb(str, i);
    if ((localLinkedList == null) || (localLinkedList.size() == 0))
    {
      x.e("MicroMsg.CardViewEntranceUI", "CardViewEntranceUI oncreate tempList size is empty");
      setResult(0, paramBundle);
      finish();
      return;
    }
    Intent localIntent = new Intent();
    if (localLinkedList.size() == 1)
    {
      localIntent.putExtra("card_list", str);
      localIntent.putExtra("key_from_scene", 50);
      localIntent.putExtra("key_previous_scene", i);
      if (!bi.oW(paramBundle.getStringExtra("key_template_id"))) {
        localIntent.putExtra("key_template_id", paramBundle.getStringExtra("key_template_id"));
      }
      localIntent.putExtra("key_from_appbrand_type", paramBundle.getIntExtra("key_from_appbrand_type", 0));
      localIntent.setClass(this, CardDetailUI.class);
      startActivity(localIntent);
    }
    for (;;)
    {
      x.e("MicroMsg.CardViewEntranceUI", "CardViewEntranceUI onCreate() parameter is ok");
      setResult(-1, paramBundle);
      finish();
      return;
      localIntent.putExtra("view_type", 0);
      localIntent.putExtra("card_list", str);
      localIntent.putExtra("key_previous_scene", i);
      if (!bi.oW(paramBundle.getStringExtra("key_template_id"))) {
        localIntent.putExtra("key_template_id", paramBundle.getStringExtra("key_template_id"));
      }
      localIntent.putExtra("key_from_appbrand_type", paramBundle.getIntExtra("key_from_appbrand_type", 0));
      localIntent.setClass(this, CardViewUI.class);
      startActivity(localIntent);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/card/ui/CardViewEntranceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */