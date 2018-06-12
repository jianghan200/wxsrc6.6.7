package com.tencent.mm.plugin.wear.model.e;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public final class f
  extends a
{
  public final List<Integer> bSy()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11016));
    localArrayList.add(Integer.valueOf(11017));
    localArrayList.add(Integer.valueOf(11018));
    return localArrayList;
  }
  
  protected final byte[] p(int paramInt, byte[] paramArrayOfByte)
  {
    try
    {
      paramArrayOfByte = new String(paramArrayOfByte, "utf8");
      if (bi.oW(paramArrayOfByte))
      {
        x.i("MicroMsg.Wear.HttpFriendServer", "error to get username");
        return null;
      }
    }
    catch (UnsupportedEncodingException paramArrayOfByte)
    {
      do
      {
        for (;;)
        {
          paramArrayOfByte = "";
        }
        x.i("MicroMsg.Wear.HttpFriendServer", "handle friend request %s", new Object[] { paramArrayOfByte });
        Intent localIntent;
        if (paramInt == 11016)
        {
          localIntent = new Intent();
          localIntent.setClassName(ad.getPackageName(), ad.getPackageName() + ".plugin.subapp.ui.friend.FMessageTransferUI");
          localIntent.putExtra("friend_message_transfer_username", paramArrayOfByte);
          localIntent.setAction("friend_message_accept_" + paramArrayOfByte);
          localIntent.setFlags(335544320);
          ad.getContext().startActivity(localIntent);
          return null;
        }
        if (paramInt == 11017)
        {
          localIntent = new Intent();
          localIntent.setClassName(ad.getPackageName(), ad.getPackageName() + ".plugin.subapp.ui.friend.FMessageTransferUI");
          localIntent.putExtra("friend_message_transfer_username", paramArrayOfByte);
          localIntent.setAction("friend_message_ignore_" + paramArrayOfByte);
          localIntent.setFlags(335544320);
          ad.getContext().startActivity(localIntent);
          return null;
        }
      } while (paramInt != 11018);
      paramArrayOfByte = new Intent();
      paramArrayOfByte.setClassName(ad.getPackageName(), ad.getPackageName() + ".plugin.subapp.ui.friend.FMessageConversationUI");
      paramArrayOfByte.setFlags(335544320);
      ad.getContext().startActivity(paramArrayOfByte);
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/e/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */