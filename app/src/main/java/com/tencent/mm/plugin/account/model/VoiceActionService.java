package com.tencent.mm.plugin.account.model;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.DataUsageFeedback;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.messenger.a.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public class VoiceActionService
  extends SearchActionVerificationClientService
{
  public final boolean a(Intent paramIntent, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      x.i("MicroMsg.VoiceActionService", "Action is not verified");
      return false;
    }
    Object localObject = paramIntent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID");
    String str1 = paramIntent.getStringExtra("android.intent.extra.TEXT");
    String str2 = com.tencent.mm.a.g.u(com.tencent.mm.pluginsdk.a.pK((String)localObject).getBytes());
    str2 = com.tencent.mm.plugin.account.b.getAddrUploadStg().pq(str2).getUsername();
    com.tencent.mm.plugin.messenger.a.g.bcT().D(str2, str1, s.hQ(str2));
    try
    {
      str1 = paramIntent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_URI");
      paramIntent = str1.split("/");
      if ((paramIntent == null) || (paramIntent.length <= 0)) {
        break label335;
      }
      paramIntent = paramIntent[(paramIntent.length - 1)];
      if (bi.oW(paramIntent)) {
        x.e("MicroMsg.VoiceActionService", "extract contact Id error, %s %s", new Object[] { str1, localObject });
      } else if (!com.tencent.mm.pluginsdk.permission.a.bj(this, "android.permission.READ_CONTACTS")) {
        x.e("MicroMsg.VoiceActionService", "no contacts permission");
      }
    }
    catch (Exception paramIntent)
    {
      x.printErrStackTrace("MicroMsg.VoiceActionService", paramIntent, "updateContactMarked error", new Object[0]);
    }
    paramIntent = getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[] { "_id" }, "contact_id=? AND data1=? AND account_type=? AND mimetype=?", new String[] { paramIntent, localObject, "com.tencent.mm.account", "vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voiceaction" }, null);
    if ((paramIntent != null) && (paramIntent.getCount() > 0))
    {
      paramIntent.moveToNext();
      long l = paramIntent.getLong(0);
      localObject = ContactsContract.DataUsageFeedback.FEEDBACK_URI.buildUpon().appendPath(String.valueOf(l)).appendQueryParameter("type", "short_text").build();
      if (getContentResolver().update((Uri)localObject, new ContentValues(), null, null) <= 0) {
        break label341;
      }
    }
    label335:
    label341:
    for (paramBoolean = true;; paramBoolean = false)
    {
      x.i("MicroMsg.VoiceActionService", "updateContactMarked: %b", new Object[] { Boolean.valueOf(paramBoolean) });
      while (paramIntent != null)
      {
        paramIntent.close();
        break;
        x.i("MicroMsg.VoiceActionService", "updateContactMarked: false");
      }
      return true;
      paramIntent = "";
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/account/model/VoiceActionService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */