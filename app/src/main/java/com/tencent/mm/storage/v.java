package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.mm.bt.g;
import com.tencent.mm.bt.g.a;
import com.tencent.mm.model.af;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class v
  extends i<u>
  implements g.a, af
{
  public static final String[] ciG = { "CREATE INDEX IF NOT EXISTS serverChatRoomUserIndex ON chatroom ( chatroomname )" };
  public static final String[] diD = { i.a(u.dhO, "chatroom") };
  private e diF;
  
  public v(e parame)
  {
    super(parame, u.dhO, "chatroom", ciG);
    this.diF = parame;
  }
  
  public final int a(g paramg)
  {
    return 0;
  }
  
  public final String gT(String paramString)
  {
    boolean bool;
    Cursor localCursor;
    if (paramString.length() > 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      paramString = "select displayname from chatroom where chatroomname='" + bi.oU(paramString) + "'";
      localCursor = this.diF.b(paramString, null, 2);
      if (!localCursor.moveToFirst()) {
        break label95;
      }
      paramString = new u();
      paramString.d(localCursor);
    }
    for (;;)
    {
      localCursor.close();
      if (paramString == null)
      {
        return null;
        bool = false;
        break;
      }
      return paramString.field_displayname;
      label95:
      paramString = null;
    }
  }
  
  public final u ih(String paramString)
  {
    u localu = new u();
    localu.field_chatroomname = paramString;
    if (super.b(localu, new String[] { "chatroomname" })) {
      return localu;
    }
    return null;
  }
  
  public final u ii(String paramString)
  {
    u localu = new u();
    localu.field_chatroomname = paramString;
    if (super.b(localu, new String[] { "chatroomname" })) {}
    return localu;
  }
  
  public final String ij(String paramString)
  {
    if (paramString.length() > 0) {}
    Cursor localCursor;
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      paramString = "select roomowner from chatroom where chatroomname='" + bi.oU(paramString) + "'";
      localCursor = this.diF.b(paramString, null, 2);
      if (localCursor != null) {
        break;
      }
      x.e("MicroMsg.ChatroomStorage", "getChatroomOwner fail, cursor is null");
      return null;
    }
    if (localCursor.moveToFirst())
    {
      paramString = new u();
      paramString.d(localCursor);
    }
    for (;;)
    {
      localCursor.close();
      if (paramString == null) {
        break;
      }
      return paramString.field_roomowner;
      paramString = null;
    }
  }
  
  public final String ik(String paramString)
  {
    boolean bool;
    Cursor localCursor;
    if (paramString.length() > 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      paramString = "select memberlist from chatroom where chatroomname='" + bi.oU(paramString) + "'";
      localCursor = this.diF.b(paramString, null, 2);
      if (!localCursor.moveToFirst()) {
        break label95;
      }
      paramString = new u();
      paramString.d(localCursor);
    }
    for (;;)
    {
      localCursor.close();
      if (paramString == null)
      {
        return null;
        bool = false;
        break;
      }
      return paramString.field_memberlist;
      label95:
      paramString = null;
    }
  }
  
  public final List<String> il(String paramString)
  {
    Object localObject = ik(paramString);
    if (localObject == null) {
      return null;
    }
    paramString = new LinkedList();
    if (!((String)localObject).equals(""))
    {
      localObject = ((String)localObject).split(";");
      int i = 0;
      while (i < localObject.length)
      {
        paramString.add(localObject[i]);
        i += 1;
      }
    }
    return paramString;
  }
  
  public final boolean im(String paramString)
  {
    Object localObject = null;
    paramString = "select * from chatroom where chatroomname='" + bi.oU(paramString) + "'";
    Cursor localCursor = this.diF.b(paramString, null, 2);
    paramString = (String)localObject;
    if (localCursor.moveToFirst())
    {
      paramString = new u();
      paramString.d(localCursor);
    }
    localCursor.close();
    return (paramString != null) && ((paramString.field_roomflag & 0x1) == 0);
  }
  
  public final boolean in(String paramString)
  {
    if (paramString.length() > 0) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      if (this.diF.delete("chatroom", "chatroomname=?", new String[] { paramString }) != 0) {
        break;
      }
      return false;
    }
    Xp(paramString);
    return true;
  }
  
  public final void m(String paramString, long paramLong)
  {
    paramString = "update chatroom set modifytime = " + paramLong + " where chatroomname = '" + bi.oU(paramString) + "'";
    this.diF.fV("chatroom", paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/storage/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */